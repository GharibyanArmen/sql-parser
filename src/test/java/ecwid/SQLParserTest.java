package ecwid;

import static org.junit.jupiter.api.Assertions.assertTrue;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import ecwid.SQLParserListener;
import ecwid.parser.SQLLexer;
import ecwid.parser.SQLParser;

public class SQLParserTest {
	private final static String END = ";";
	private final static String SQL = "test.sql";
	private static List<String> sqlList = new ArrayList<>();
	
	@BeforeAll
	public static void loadSqlFile() throws IOException {
		InputStream is = ClassLoader.getSystemClassLoader().getResourceAsStream(SQL);
		BufferedReader reader = new BufferedReader(new InputStreamReader(is));
		String sql="";
		while (reader.ready()) {
			String line = reader.readLine().trim();
			if(line.startsWith("--")) {
				continue;
			}
			sql += " " +line;
			if(line.endsWith(END)) {
				sqlList.add(sql);
				sql="";
			}

		}
		System.out.println("Read " + sqlList.size() + " queries");
	}

	@Test
	public void parsSQLTest() {
		for(String sql: sqlList) {
			
			SQLLexer lexer = new SQLLexer(CharStreams.fromString(sql));
			
			CommonTokenStream tokens = new CommonTokenStream(lexer);
			SQLParser parser = new SQLParser(tokens);
			ParseTree tree = parser.root();
			
			
			ParseTreeWalker walker = new ParseTreeWalker();
			SQLParserListener listener= new SQLParserListener();
			walker.walk(listener, tree);
			System.out.println(sql);
			System.out.println(listener.getQuery());
			if(listener.getErrorNode()!= null) {
				
				assertTrue(false, listener.getErrorNode().getText()); 
			}
			
			
		}
		assertTrue(true, "true");
	}
}
