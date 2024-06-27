// Generated from SQLParser.g4 by ANTLR 4.13.1

package ecwid.parser;

import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link SQLParser}.
 */
public interface SQLParserListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link SQLParser#root}.
	 * @param ctx the parse tree
	 */
	void enterRoot(SQLParser.RootContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#root}.
	 * @param ctx the parse tree
	 */
	void exitRoot(SQLParser.RootContext ctx);
	/**
	 * Enter a parse tree produced by the {@code simpleSelect}
	 * labeled alternative in {@link SQLParser#selectStatement}.
	 * @param ctx the parse tree
	 */
	void enterSimpleSelect(SQLParser.SimpleSelectContext ctx);
	/**
	 * Exit a parse tree produced by the {@code simpleSelect}
	 * labeled alternative in {@link SQLParser#selectStatement}.
	 * @param ctx the parse tree
	 */
	void exitSimpleSelect(SQLParser.SimpleSelectContext ctx);
	/**
	 * Enter a parse tree produced by the {@code parenthesisSelect}
	 * labeled alternative in {@link SQLParser#selectStatement}.
	 * @param ctx the parse tree
	 */
	void enterParenthesisSelect(SQLParser.ParenthesisSelectContext ctx);
	/**
	 * Exit a parse tree produced by the {@code parenthesisSelect}
	 * labeled alternative in {@link SQLParser#selectStatement}.
	 * @param ctx the parse tree
	 */
	void exitParenthesisSelect(SQLParser.ParenthesisSelectContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#querySpecification}.
	 * @param ctx the parse tree
	 */
	void enterQuerySpecification(SQLParser.QuerySpecificationContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#querySpecification}.
	 * @param ctx the parse tree
	 */
	void exitQuerySpecification(SQLParser.QuerySpecificationContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#selectSpec}.
	 * @param ctx the parse tree
	 */
	void enterSelectSpec(SQLParser.SelectSpecContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#selectSpec}.
	 * @param ctx the parse tree
	 */
	void exitSelectSpec(SQLParser.SelectSpecContext ctx);
	/**
	 * Enter a parse tree produced by the {@code projectionElement}
	 * labeled alternative in {@link SQLParser#selectElements}.
	 * @param ctx the parse tree
	 */
	void enterProjectionElement(SQLParser.ProjectionElementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code projectionElement}
	 * labeled alternative in {@link SQLParser#selectElements}.
	 * @param ctx the parse tree
	 */
	void exitProjectionElement(SQLParser.ProjectionElementContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#selectElement}.
	 * @param ctx the parse tree
	 */
	void enterSelectElement(SQLParser.SelectElementContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#selectElement}.
	 * @param ctx the parse tree
	 */
	void exitSelectElement(SQLParser.SelectElementContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#queryExpression}.
	 * @param ctx the parse tree
	 */
	void enterQueryExpression(SQLParser.QueryExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#queryExpression}.
	 * @param ctx the parse tree
	 */
	void exitQueryExpression(SQLParser.QueryExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#fromClause}.
	 * @param ctx the parse tree
	 */
	void enterFromClause(SQLParser.FromClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#fromClause}.
	 * @param ctx the parse tree
	 */
	void exitFromClause(SQLParser.FromClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#tableSources}.
	 * @param ctx the parse tree
	 */
	void enterTableSources(SQLParser.TableSourcesContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#tableSources}.
	 * @param ctx the parse tree
	 */
	void exitTableSources(SQLParser.TableSourcesContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#whereClause}.
	 * @param ctx the parse tree
	 */
	void enterWhereClause(SQLParser.WhereClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#whereClause}.
	 * @param ctx the parse tree
	 */
	void exitWhereClause(SQLParser.WhereClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#groupByClause}.
	 * @param ctx the parse tree
	 */
	void enterGroupByClause(SQLParser.GroupByClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#groupByClause}.
	 * @param ctx the parse tree
	 */
	void exitGroupByClause(SQLParser.GroupByClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#havingClause}.
	 * @param ctx the parse tree
	 */
	void enterHavingClause(SQLParser.HavingClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#havingClause}.
	 * @param ctx the parse tree
	 */
	void exitHavingClause(SQLParser.HavingClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#orderByClause}.
	 * @param ctx the parse tree
	 */
	void enterOrderByClause(SQLParser.OrderByClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#orderByClause}.
	 * @param ctx the parse tree
	 */
	void exitOrderByClause(SQLParser.OrderByClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#orderByExpression}.
	 * @param ctx the parse tree
	 */
	void enterOrderByExpression(SQLParser.OrderByExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#orderByExpression}.
	 * @param ctx the parse tree
	 */
	void exitOrderByExpression(SQLParser.OrderByExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code limitClauseElement}
	 * labeled alternative in {@link SQLParser#limitClause}.
	 * @param ctx the parse tree
	 */
	void enterLimitClauseElement(SQLParser.LimitClauseElementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code limitClauseElement}
	 * labeled alternative in {@link SQLParser#limitClause}.
	 * @param ctx the parse tree
	 */
	void exitLimitClauseElement(SQLParser.LimitClauseElementContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#limitClauseAtom}.
	 * @param ctx the parse tree
	 */
	void enterLimitClauseAtom(SQLParser.LimitClauseAtomContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#limitClauseAtom}.
	 * @param ctx the parse tree
	 */
	void exitLimitClauseAtom(SQLParser.LimitClauseAtomContext ctx);
	/**
	 * Enter a parse tree produced by the {@code tableSourceBase}
	 * labeled alternative in {@link SQLParser#tableSource}.
	 * @param ctx the parse tree
	 */
	void enterTableSourceBase(SQLParser.TableSourceBaseContext ctx);
	/**
	 * Exit a parse tree produced by the {@code tableSourceBase}
	 * labeled alternative in {@link SQLParser#tableSource}.
	 * @param ctx the parse tree
	 */
	void exitTableSourceBase(SQLParser.TableSourceBaseContext ctx);
	/**
	 * Enter a parse tree produced by the {@code tableSourceNested}
	 * labeled alternative in {@link SQLParser#tableSource}.
	 * @param ctx the parse tree
	 */
	void enterTableSourceNested(SQLParser.TableSourceNestedContext ctx);
	/**
	 * Exit a parse tree produced by the {@code tableSourceNested}
	 * labeled alternative in {@link SQLParser#tableSource}.
	 * @param ctx the parse tree
	 */
	void exitTableSourceNested(SQLParser.TableSourceNestedContext ctx);
	/**
	 * Enter a parse tree produced by the {@code atomTableItem}
	 * labeled alternative in {@link SQLParser#tableSourceItem}.
	 * @param ctx the parse tree
	 */
	void enterAtomTableItem(SQLParser.AtomTableItemContext ctx);
	/**
	 * Exit a parse tree produced by the {@code atomTableItem}
	 * labeled alternative in {@link SQLParser#tableSourceItem}.
	 * @param ctx the parse tree
	 */
	void exitAtomTableItem(SQLParser.AtomTableItemContext ctx);
	/**
	 * Enter a parse tree produced by the {@code subqueryTableItem}
	 * labeled alternative in {@link SQLParser#tableSourceItem}.
	 * @param ctx the parse tree
	 */
	void enterSubqueryTableItem(SQLParser.SubqueryTableItemContext ctx);
	/**
	 * Exit a parse tree produced by the {@code subqueryTableItem}
	 * labeled alternative in {@link SQLParser#tableSourceItem}.
	 * @param ctx the parse tree
	 */
	void exitSubqueryTableItem(SQLParser.SubqueryTableItemContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#joinPart}.
	 * @param ctx the parse tree
	 */
	void enterJoinPart(SQLParser.JoinPartContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#joinPart}.
	 * @param ctx the parse tree
	 */
	void exitJoinPart(SQLParser.JoinPartContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#joinSpec}.
	 * @param ctx the parse tree
	 */
	void enterJoinSpec(SQLParser.JoinSpecContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#joinSpec}.
	 * @param ctx the parse tree
	 */
	void exitJoinSpec(SQLParser.JoinSpecContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#tableName}.
	 * @param ctx the parse tree
	 */
	void enterTableName(SQLParser.TableNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#tableName}.
	 * @param ctx the parse tree
	 */
	void exitTableName(SQLParser.TableNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#fullId}.
	 * @param ctx the parse tree
	 */
	void enterFullId(SQLParser.FullIdContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#fullId}.
	 * @param ctx the parse tree
	 */
	void exitFullId(SQLParser.FullIdContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#uid}.
	 * @param ctx the parse tree
	 */
	void enterUid(SQLParser.UidContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#uid}.
	 * @param ctx the parse tree
	 */
	void exitUid(SQLParser.UidContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#dottedId}.
	 * @param ctx the parse tree
	 */
	void enterDottedId(SQLParser.DottedIdContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#dottedId}.
	 * @param ctx the parse tree
	 */
	void exitDottedId(SQLParser.DottedIdContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#fullColumnName}.
	 * @param ctx the parse tree
	 */
	void enterFullColumnName(SQLParser.FullColumnNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#fullColumnName}.
	 * @param ctx the parse tree
	 */
	void exitFullColumnName(SQLParser.FullColumnNameContext ctx);
	/**
	 * Enter a parse tree produced by the {@code specificFunctionCall}
	 * labeled alternative in {@link SQLParser#functionCall}.
	 * @param ctx the parse tree
	 */
	void enterSpecificFunctionCall(SQLParser.SpecificFunctionCallContext ctx);
	/**
	 * Exit a parse tree produced by the {@code specificFunctionCall}
	 * labeled alternative in {@link SQLParser#functionCall}.
	 * @param ctx the parse tree
	 */
	void exitSpecificFunctionCall(SQLParser.SpecificFunctionCallContext ctx);
	/**
	 * Enter a parse tree produced by the {@code aggregateFunctionCall}
	 * labeled alternative in {@link SQLParser#functionCall}.
	 * @param ctx the parse tree
	 */
	void enterAggregateFunctionCall(SQLParser.AggregateFunctionCallContext ctx);
	/**
	 * Exit a parse tree produced by the {@code aggregateFunctionCall}
	 * labeled alternative in {@link SQLParser#functionCall}.
	 * @param ctx the parse tree
	 */
	void exitAggregateFunctionCall(SQLParser.AggregateFunctionCallContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#specificFunction}.
	 * @param ctx the parse tree
	 */
	void enterSpecificFunction(SQLParser.SpecificFunctionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#specificFunction}.
	 * @param ctx the parse tree
	 */
	void exitSpecificFunction(SQLParser.SpecificFunctionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#aggregateFunction}.
	 * @param ctx the parse tree
	 */
	void enterAggregateFunction(SQLParser.AggregateFunctionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#aggregateFunction}.
	 * @param ctx the parse tree
	 */
	void exitAggregateFunction(SQLParser.AggregateFunctionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#scalarFunctionName}.
	 * @param ctx the parse tree
	 */
	void enterScalarFunctionName(SQLParser.ScalarFunctionNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#scalarFunctionName}.
	 * @param ctx the parse tree
	 */
	void exitScalarFunctionName(SQLParser.ScalarFunctionNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#functionNameBase}.
	 * @param ctx the parse tree
	 */
	void enterFunctionNameBase(SQLParser.FunctionNameBaseContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#functionNameBase}.
	 * @param ctx the parse tree
	 */
	void exitFunctionNameBase(SQLParser.FunctionNameBaseContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#functionArgs}.
	 * @param ctx the parse tree
	 */
	void enterFunctionArgs(SQLParser.FunctionArgsContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#functionArgs}.
	 * @param ctx the parse tree
	 */
	void exitFunctionArgs(SQLParser.FunctionArgsContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#functionArg}.
	 * @param ctx the parse tree
	 */
	void enterFunctionArg(SQLParser.FunctionArgContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#functionArg}.
	 * @param ctx the parse tree
	 */
	void exitFunctionArg(SQLParser.FunctionArgContext ctx);
	/**
	 * Enter a parse tree produced by the {@code isExpression}
	 * labeled alternative in {@link SQLParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterIsExpression(SQLParser.IsExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code isExpression}
	 * labeled alternative in {@link SQLParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitIsExpression(SQLParser.IsExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code notExpression}
	 * labeled alternative in {@link SQLParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterNotExpression(SQLParser.NotExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code notExpression}
	 * labeled alternative in {@link SQLParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitNotExpression(SQLParser.NotExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code logicalExpression}
	 * labeled alternative in {@link SQLParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterLogicalExpression(SQLParser.LogicalExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code logicalExpression}
	 * labeled alternative in {@link SQLParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitLogicalExpression(SQLParser.LogicalExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code predicateExpression}
	 * labeled alternative in {@link SQLParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterPredicateExpression(SQLParser.PredicateExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code predicateExpression}
	 * labeled alternative in {@link SQLParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitPredicateExpression(SQLParser.PredicateExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code expressionAtomPredicate}
	 * labeled alternative in {@link SQLParser#predicate}.
	 * @param ctx the parse tree
	 */
	void enterExpressionAtomPredicate(SQLParser.ExpressionAtomPredicateContext ctx);
	/**
	 * Exit a parse tree produced by the {@code expressionAtomPredicate}
	 * labeled alternative in {@link SQLParser#predicate}.
	 * @param ctx the parse tree
	 */
	void exitExpressionAtomPredicate(SQLParser.ExpressionAtomPredicateContext ctx);
	/**
	 * Enter a parse tree produced by the {@code binaryComparisonPredicate}
	 * labeled alternative in {@link SQLParser#predicate}.
	 * @param ctx the parse tree
	 */
	void enterBinaryComparisonPredicate(SQLParser.BinaryComparisonPredicateContext ctx);
	/**
	 * Exit a parse tree produced by the {@code binaryComparisonPredicate}
	 * labeled alternative in {@link SQLParser#predicate}.
	 * @param ctx the parse tree
	 */
	void exitBinaryComparisonPredicate(SQLParser.BinaryComparisonPredicateContext ctx);
	/**
	 * Enter a parse tree produced by the {@code betweenPredicate}
	 * labeled alternative in {@link SQLParser#predicate}.
	 * @param ctx the parse tree
	 */
	void enterBetweenPredicate(SQLParser.BetweenPredicateContext ctx);
	/**
	 * Exit a parse tree produced by the {@code betweenPredicate}
	 * labeled alternative in {@link SQLParser#predicate}.
	 * @param ctx the parse tree
	 */
	void exitBetweenPredicate(SQLParser.BetweenPredicateContext ctx);
	/**
	 * Enter a parse tree produced by the {@code likePredicate}
	 * labeled alternative in {@link SQLParser#predicate}.
	 * @param ctx the parse tree
	 */
	void enterLikePredicate(SQLParser.LikePredicateContext ctx);
	/**
	 * Exit a parse tree produced by the {@code likePredicate}
	 * labeled alternative in {@link SQLParser#predicate}.
	 * @param ctx the parse tree
	 */
	void exitLikePredicate(SQLParser.LikePredicateContext ctx);
	/**
	 * Enter a parse tree produced by the {@code functionCallPredicate}
	 * labeled alternative in {@link SQLParser#predicate}.
	 * @param ctx the parse tree
	 */
	void enterFunctionCallPredicate(SQLParser.FunctionCallPredicateContext ctx);
	/**
	 * Exit a parse tree produced by the {@code functionCallPredicate}
	 * labeled alternative in {@link SQLParser#predicate}.
	 * @param ctx the parse tree
	 */
	void exitFunctionCallPredicate(SQLParser.FunctionCallPredicateContext ctx);
	/**
	 * Enter a parse tree produced by the {@code unaryExpressionAtom}
	 * labeled alternative in {@link SQLParser#expressionAtom}.
	 * @param ctx the parse tree
	 */
	void enterUnaryExpressionAtom(SQLParser.UnaryExpressionAtomContext ctx);
	/**
	 * Exit a parse tree produced by the {@code unaryExpressionAtom}
	 * labeled alternative in {@link SQLParser#expressionAtom}.
	 * @param ctx the parse tree
	 */
	void exitUnaryExpressionAtom(SQLParser.UnaryExpressionAtomContext ctx);
	/**
	 * Enter a parse tree produced by the {@code constantExpressionAtom}
	 * labeled alternative in {@link SQLParser#expressionAtom}.
	 * @param ctx the parse tree
	 */
	void enterConstantExpressionAtom(SQLParser.ConstantExpressionAtomContext ctx);
	/**
	 * Exit a parse tree produced by the {@code constantExpressionAtom}
	 * labeled alternative in {@link SQLParser#expressionAtom}.
	 * @param ctx the parse tree
	 */
	void exitConstantExpressionAtom(SQLParser.ConstantExpressionAtomContext ctx);
	/**
	 * Enter a parse tree produced by the {@code fullColumnNameExpressionAtom}
	 * labeled alternative in {@link SQLParser#expressionAtom}.
	 * @param ctx the parse tree
	 */
	void enterFullColumnNameExpressionAtom(SQLParser.FullColumnNameExpressionAtomContext ctx);
	/**
	 * Exit a parse tree produced by the {@code fullColumnNameExpressionAtom}
	 * labeled alternative in {@link SQLParser#expressionAtom}.
	 * @param ctx the parse tree
	 */
	void exitFullColumnNameExpressionAtom(SQLParser.FullColumnNameExpressionAtomContext ctx);
	/**
	 * Enter a parse tree produced by the {@code nestedExpressionAtom}
	 * labeled alternative in {@link SQLParser#expressionAtom}.
	 * @param ctx the parse tree
	 */
	void enterNestedExpressionAtom(SQLParser.NestedExpressionAtomContext ctx);
	/**
	 * Exit a parse tree produced by the {@code nestedExpressionAtom}
	 * labeled alternative in {@link SQLParser#expressionAtom}.
	 * @param ctx the parse tree
	 */
	void exitNestedExpressionAtom(SQLParser.NestedExpressionAtomContext ctx);
	/**
	 * Enter a parse tree produced by the {@code mathExpressionAtom}
	 * labeled alternative in {@link SQLParser#expressionAtom}.
	 * @param ctx the parse tree
	 */
	void enterMathExpressionAtom(SQLParser.MathExpressionAtomContext ctx);
	/**
	 * Exit a parse tree produced by the {@code mathExpressionAtom}
	 * labeled alternative in {@link SQLParser#expressionAtom}.
	 * @param ctx the parse tree
	 */
	void exitMathExpressionAtom(SQLParser.MathExpressionAtomContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#unaryOperator}.
	 * @param ctx the parse tree
	 */
	void enterUnaryOperator(SQLParser.UnaryOperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#unaryOperator}.
	 * @param ctx the parse tree
	 */
	void exitUnaryOperator(SQLParser.UnaryOperatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#comparisonOperator}.
	 * @param ctx the parse tree
	 */
	void enterComparisonOperator(SQLParser.ComparisonOperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#comparisonOperator}.
	 * @param ctx the parse tree
	 */
	void exitComparisonOperator(SQLParser.ComparisonOperatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#logicalOperator}.
	 * @param ctx the parse tree
	 */
	void enterLogicalOperator(SQLParser.LogicalOperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#logicalOperator}.
	 * @param ctx the parse tree
	 */
	void exitLogicalOperator(SQLParser.LogicalOperatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#multOperator}.
	 * @param ctx the parse tree
	 */
	void enterMultOperator(SQLParser.MultOperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#multOperator}.
	 * @param ctx the parse tree
	 */
	void exitMultOperator(SQLParser.MultOperatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#addOperator}.
	 * @param ctx the parse tree
	 */
	void enterAddOperator(SQLParser.AddOperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#addOperator}.
	 * @param ctx the parse tree
	 */
	void exitAddOperator(SQLParser.AddOperatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#constant}.
	 * @param ctx the parse tree
	 */
	void enterConstant(SQLParser.ConstantContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#constant}.
	 * @param ctx the parse tree
	 */
	void exitConstant(SQLParser.ConstantContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#stringLiteral}.
	 * @param ctx the parse tree
	 */
	void enterStringLiteral(SQLParser.StringLiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#stringLiteral}.
	 * @param ctx the parse tree
	 */
	void exitStringLiteral(SQLParser.StringLiteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#decimalLiteral}.
	 * @param ctx the parse tree
	 */
	void enterDecimalLiteral(SQLParser.DecimalLiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#decimalLiteral}.
	 * @param ctx the parse tree
	 */
	void exitDecimalLiteral(SQLParser.DecimalLiteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#booleanLiteral}.
	 * @param ctx the parse tree
	 */
	void enterBooleanLiteral(SQLParser.BooleanLiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#booleanLiteral}.
	 * @param ctx the parse tree
	 */
	void exitBooleanLiteral(SQLParser.BooleanLiteralContext ctx);
}