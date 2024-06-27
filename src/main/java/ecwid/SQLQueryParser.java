package ecwid;

import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

import ecwid.parser.SQLLexer;
import ecwid.parser.SQLParser;



public class SQLQueryParser 
{

	public static void main(String[] args) {
		SQLQueryParser sqlquery = new SQLQueryParser();
		
		String queryContent = "SELECT author.name, count(book.id) as book_count, sum(book.cost) \r\n"
				+ "FROM author \r\n"
				+ "LEFT JOIN book ON (author.id = book.author_id) \r\n"
				+ "WHERE book.annotation is NULL \r\n"
				+ "GROUP BY author.name \r\n"
				+ "HAVING COUNT(*) > 1 AND SUM(book.cost) > 500 \r\n"
				+ "ORDER BY author.name DESC\r\n"				
				+ "LIMIT 10 , 5";
		;
		
		SQLLexer lexer = new SQLLexer(CharStreams.fromString(queryContent));
	
		CommonTokenStream tokens = new CommonTokenStream(lexer);
		SQLParser parser = new SQLParser(tokens);
		ParseTree tree = parser.root();
		
		
		ParseTreeWalker walker = new ParseTreeWalker();
		SQLParserListener listener= new SQLParserListener();
		walker.walk(listener, tree);
		System.out.println(listener.getQuery().toString()); 
	}

}
