package ecwid;

import java.util.ArrayList;
import java.util.Optional;
import java.util.Stack;

import org.antlr.v4.runtime.RuleContext;
import org.antlr.v4.runtime.tree.ErrorNode;
import org.antlr.v4.runtime.tree.ParseTree;

import ecwid.model.Column;
import ecwid.model.Join;
import ecwid.model.Query;
import ecwid.model.Sort;
import ecwid.model.Source;
import ecwid.model.WhereClause;
import ecwid.model.Sort.Ordering;
import ecwid.parser.SQLParser;
import ecwid.parser.SQLParserBaseListener;

public class SQLParserListener extends SQLParserBaseListener {
	
	private Stack<Query> queryStack = new Stack<Query>();
	private Query query = new Query();
	
	
	private ErrorNode errorNode;

	public void visitErrorNode(ErrorNode node) {
		errorNode = node;
	}

	@Override
	public void enterAtomTableItem(SQLParser.AtomTableItemContext ctx) {
		if (query.getFromSources() == null)
			query.setFromSources(new ArrayList<>());
		
		Source source = new Source();
		source.setName(ctx.getChild(SQLParser.TableNameContext.class, 0).getText());
		
		RuleContext context = ctx.getChild(SQLParser.UidContext.class, 0);
		if( context !=null)
		source.setAlias(context.getText());
		query.getFromSources().add(source);

	}
	

	@Override
	public void enterSubqueryTableItem(SQLParser.SubqueryTableItemContext ctx) {
		
			queryStack.push(query);
			query = new Query();
		

	}
	@Override
	public void exitSubqueryTableItem(SQLParser.SubqueryTableItemContext ctx) {
		Query parentQuery = queryStack.pop();
		Source source = new Source();
		source.setQuery(query);
		if(ctx.alias!= null)
		   source.setAlias(ctx.alias.getText());
		if(parentQuery.getFromSources() == null)
			parentQuery.setFromSources(new ArrayList<>());
		parentQuery.getFromSources().add(source);
		
		query = parentQuery;
		

	}
	
	


	@Override
	public void enterSelectElement(SQLParser.SelectElementContext ctx) {

		if (query.getColumns() == null)
			query.setColumns(new ArrayList<>());
		Column column = new Column();
		if(! ctx.getChild(ctx.getChildCount() -1).getText().equals("*")  )
		    query.getColumns().add(column);
		
		
		column.setName(ctx.getChild(0).getText());
		if(ctx.uid()!= null) {
			column.setAlias(ctx.uid().getText());
		}
		
	}

//	@Override
//	public void enterSelectFunctionElement(SQLParser.SelectFunctionElementContext ctx) {
//
//		if (query.getColumns() == null)
//			query.setColumns(new ArrayList<>());
//		if (ctx.getChildCount() == 1)
//			query.getColumns().add(ctx.getText());
//		else
//			query.getColumns().add(ctx.getChild(ctx.getChildCount() - 1).getText());
//
//	}

	@Override
	public void enterJoinPart(SQLParser.JoinPartContext ctx) {
		if (query.getJoins() == null)
			query.setJoins(new ArrayList<>());
		Join join = new Join();
		Source source = new Source();
		join.setSource(source);
		RuleContext context = ctx.getChild(SQLParser.TableSourceItemContext.class, 0);
		if(context != null) {
			source.setName(context.getText());;	
		}
		if(ctx.alias != null) {
			source.setAlias(ctx.alias.getText());;	
		}
		
		String joinType = "";

		for (int i = 0; i < ctx.getChildCount(); i++) {
			if (ctx.getChild(i).getText().equals("JOIN"))
				break;
			joinType += ctx.getChild(i).getText();
		}
		join.setJoinType(joinType);

		context = ctx.getChild(SQLParser.JoinSpecContext.class, 0);
		if (context != null)
			join.setCondition(context.getChild(1).getText());
		query.getJoins().add(join);
		if(ctx.getChild(SQLParser.SimpleSelectContext.class, 0) != null) {
			queryStack.push(query);
			query = new Query();
			}
	}
	@Override
	public void exitJoinPart(SQLParser.JoinPartContext ctx) {
		if(ctx.getChild(SQLParser.SimpleSelectContext.class, 0) != null) {
			Query parentQuery = queryStack.pop();
			Join join = parentQuery.getJoins().get(parentQuery.getJoins().size()-1);
			join.getSource().setQuery(query);
			query = parentQuery;			
		}
	}

	@Override
	public void enterWhereClause(SQLParser.WhereClauseContext ctx) {
        WhereClause whereClause = new WhereClause();
        query.setWhereClause(whereClause);
        
		if (ctx.getChildCount() == 2) // simple condition
		{
			ParseTree tree = ctx.getChild(1);
			String condition = "";
			// collect expressions
			for (int i = 0; i < tree.getChildCount(); i++) {
				condition += tree.getChild(i).getText() + " ";
			}
			whereClause.setCondition(condition.trim());
		}else if (ctx.children.contains(ctx.EXISTS()))
		  {
			whereClause.setOperator(WhereClause.Operator.EXISTS);
			queryStack.push(query);
			query = new Query();
			
		}else if (ctx.children.contains(ctx.IN()))
		  {
			whereClause.setOperator(WhereClause.Operator.IN);
			whereClause.setColumn(ctx.getChild(1).getText());
			queryStack.push(query);
			query = new Query();
		}
	}

	
	@Override
	public void exitWhereClause(SQLParser.WhereClauseContext ctx) {
		if(ctx.getChildCount() > 2) {
			Query parentQuery = queryStack.pop();
			parentQuery.getWhereClause().setSubquery(query);
			query = parentQuery;			
		}
	}
 
		
	
	@Override
	public void enterGroupByClause(SQLParser.GroupByClauseContext ctx) {

		if (query.getGroupByColumns() == null)
			query.setGroupByColumns(new ArrayList<>());

		for (int i = 2; i < ctx.getChildCount(); i++) {
			query.getGroupByColumns().add(ctx.getChild(i).getText());

		}

	}

	@Override
	public void enterHavingClause(SQLParser.HavingClauseContext ctx) {

		if (query.getHavingClauses() == null)
			query.setHavingClauses(new ArrayList<>());
		ParseTree tree = ctx.getChild(1);
		String condition = "";
		for (int i = 0; i < tree.getChildCount(); i++) {
			condition += tree.getChild(i).getText() + " ";
		}
		query.getHavingClauses().add(condition.trim());
	}

	@Override
	public void enterOrderByExpression(SQLParser.OrderByExpressionContext ctx) {

		if (query.getSortColumns() == null)
			query.setSortColumns(new ArrayList<>());

		Sort sort = new Sort();

		sort.setColumn(ctx.getChild(0).getText());

		if (ctx.getChildCount() == 2 && "DESC".equals(ctx.getChild(1).getText())) {
			sort.setOrder(Ordering.DESC);
		}

		query.getSortColumns().add(sort);

	}

	@Override
	public void enterLimitClauseElement(SQLParser.LimitClauseElementContext ctx) {

		if (ctx.getChildCount() == 2) {
			query.setLimit(Integer.parseInt(ctx.getChild(1).getText()));
		} else if (ctx.getChildCount() == 3) {
			query.setOffset(Integer.parseInt(ctx.getChild(1).getText()));
			query.setLimit(Integer.parseInt(ctx.getChild(2).getText()));
		}
		if (ctx.getChildCount() == 4) {
			query.setOffset(Integer.parseInt(ctx.getChild(3).getText()));
			query.setLimit(Integer.parseInt(ctx.getChild(1).getText()));
		}

	}

	public Query getQuery() {
		return query;

	}

	public ErrorNode getErrorNode() {
		return errorNode;

	}

}
