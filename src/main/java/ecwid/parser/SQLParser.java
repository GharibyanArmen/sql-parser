// Generated from SQLParser.g4 by ANTLR 4.13.1

package ecwid.parser;

import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class SQLParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		ALL=1, AND=2, ASC=3, AS=4, BETWEEN=5, BY=6, DESC=7, DISTINCT=8, EXISTS=9, 
		FROM=10, GROUP=11, HAVING=12, IFNULL=13, IN=14, IS=15, JOIN=16, LEFT=17, 
		LIKE=18, LIMIT=19, NOT=20, NULL=21, ON=22, OR=23, ORDER=24, OUTER=25, 
		RIGHT=26, SELECT=27, STDDEV=28, STDDEV_POP=29, STDDEV_SAMP=30, TRUE=31, 
		WHERE=32, AVG=33, COUNT=34, MAX=35, MIN=36, SUM=37, STAR=38, DIVIDE=39, 
		MODULE=40, PLUS=41, MINUS=42, EQUAL_SYMBOL=43, GREATER_SYMBOL=44, LESS_SYMBOL=45, 
		EXCLAMATION_SYMBOL=46, DOT=47, LR_BRACKET=48, RR_BRACKET=49, COMMA=50, 
		STRING_LITERAL=51, DECIMAL_LITERAL=52, COLUMN_LITERAL=53, OFFSET=54, INNER=55, 
		NATURAL=56, DOT_ID=57, GROUP_CONCAT=58, SEPARATOR=59, ASCII=60, CURDATE=61, 
		CURRENT_DATE=62, CURRENT_TIME=63, CURRENT_TIMESTAMP=64, CURTIME=65, DATE_ADD=66, 
		DATE_SUB=67, IF=68, LOCALTIME=69, LOCALTIMESTAMP=70, MID=71, NOW=72, REPEAT=73, 
		REPLACE=74, SUBSTR=75, SUBSTRING=76, SYSDATE=77, TRIM=78, UTC_DATE=79, 
		UTC_TIME=80, UTC_TIMESTAMP=81, ABS=82, ACOS=83, ADDDATE=84, ADDTIME=85, 
		AREA=86, ASBINARY=87, ASIN=88, ASTEXT=89, ASWKB=90, ASWKT=91, ATAN=92, 
		ATAN2=93, BENCHMARK=94, BIN=95, BIT_COUNT=96, BIT_LENGTH=97, BUFFER=98, 
		CEIL=99, CEILING=100, CENTROID=101, CHARACTER_LENGTH=102, CHARSET=103, 
		CHAR_LENGTH=104, COERCIBILITY=105, COLLATION=106, COMPRESS=107, CONCAT=108, 
		CONCAT_WS=109, CONNECTION_ID=110, CONV=111, CONVERT_TZ=112, COS=113, COT=114, 
		CUME_DIST=115, DATABASE=116, DATE=117, DATEDIFF=118, DATE_FORMAT=119, 
		DAY=120, DAYNAME=121, DAYOFMONTH=122, DAYOFWEEK=123, DAYOFYEAR=124, DECODE=125, 
		DEGREES=126, DENSE_RANK=127, DES_DECRYPT=128, DES_ENCRYPT=129, DIMENSION=130, 
		DISJOINT=131, ELT=132, ENCODE=133, ENCRYPT=134, ENDPOINT=135, ENVELOPE=136, 
		EQUALS=137, EXP=138, EXPORT_SET=139, EXTERIORRING=140, EXTRACTVALUE=141, 
		FIELD=142, FIND_IN_SET=143, FIRST_VALUE=144, FLOOR=145, FORMAT=146, FOUND_ROWS=147, 
		FROM_BASE64=148, FROM_DAYS=149, FROM_UNIXTIME=150, GLENGTH=151, GREATEST=152, 
		GTID_SUBSET=153, GTID_SUBTRACT=154, HEX=155, HOUR=156, INET6_ATON=157, 
		INET6_NTOA=158, INET_ATON=159, INET_NTOA=160, INSTR=161, INTERIORRINGN=162, 
		INTERSECTS=163, INVISIBLE=164, ISCLOSED=165, ISEMPTY=166, ISNULL=167, 
		ISSIMPLE=168, IS_FREE_LOCK=169, IS_IPV4=170, IS_IPV4_COMPAT=171, IS_IPV4_MAPPED=172, 
		IS_IPV6=173, IS_USED_LOCK=174, LAG=175, LAST_INSERT_ID=176, LAST_VALUE=177, 
		LCASE=178, LEAD=179, LEAST=180, LENGTH=181, LINEFROMTEXT=182, LINEFROMWKB=183, 
		LINESTRING=184, LINESTRINGFROMTEXT=185, LINESTRINGFROMWKB=186, LN=187, 
		LOAD_FILE=188, LOCATE=189, LOG=190, LOG10=191, LOG2=192, LOWER=193, LPAD=194, 
		LTRIM=195, MAKEDATE=196, MAKETIME=197, MAKE_SET=198, MASTER_POS_WAIT=199, 
		MBRCONTAINS=200, MBRDISJOINT=201, MBREQUAL=202, MBRINTERSECTS=203, MBROVERLAPS=204, 
		MBRTOUCHES=205, MBRWITHIN=206, MICROSECOND=207, MINUTE=208, MLINEFROMTEXT=209, 
		MLINEFROMWKB=210, MOD=211, MONTH=212, MONTHNAME=213, NAME_CONST=214, NTH_VALUE=215, 
		NTILE=216, NULLIF=217, NUMGEOMETRIES=218, NUMINTERIORRINGS=219, NUMPOINTS=220, 
		OCT=221, OCTET_LENGTH=222, ORD=223, OVERLAPS=224, PERCENT_RANK=225, PERIOD_ADD=226, 
		PERIOD_DIFF=227, PI=228, POSITION=229, POW=230, POWER=231, QUARTER=232, 
		QUOTE=233, RADIANS=234, RAND=235, RANDOM=236, RANK=237, RANDOM_BYTES=238, 
		RELEASE_LOCK=239, REVERSE=240, ROUND=241, ROW_COUNT=242, ROW_NUMBER=243, 
		RPAD=244, RTRIM=245, SCHEMA=246, SECOND=247, SEC_TO_TIME=248, SIGN=249, 
		SIN=250, SOUNDEX=251, SQRT=252, SRID=253, STRCMP=254, STR_TO_DATE=255, 
		SUBDATE=256, SUBSTRING_INDEX=257, SUBTIME=258, SYSTEM_USER=259, TAN=260, 
		TIME=261, TIMEDIFF=262, TIMESTAMP=263, TIMESTAMPADD=264, TIMESTAMPDIFF=265, 
		TIME_FORMAT=266, TIME_TO_SEC=267, TOUCHES=268, TO_BASE64=269, TO_DAYS=270, 
		TO_SECONDS=271, UCASE=272, UNCOMPRESS=273, UNCOMPRESSED_LENGTH=274, UNHEX=275, 
		UNIX_TIMESTAMP=276, UPDATEXML=277, UPPER=278, UUID=279, UUID_SHORT=280, 
		VALIDATE_PASSWORD_STRENGTH=281, VERSION=282, VISIBLE=283, WAIT_UNTIL_SQL_THREAD_AFTER_GTIDS=284, 
		WEEK=285, WEEKDAY=286, WEEKOFYEAR=287, WEIGHT_STRING=288, WITHIN=289, 
		YEAR=290, YEARWEEK=291, FALSE=292, REAL_LITERAL=293, NULL_LITERAL=294, 
		NULL_SPEC_LITERAL=295, STRING_CHARSET_NAME=296, START_NATIONAL_STRING_LITERAL=297, 
		ZERO_DECIMAL=298, ONE_DECIMAL=299, TWO_DECIMAL=300;
	public static final int
		RULE_root = 0, RULE_selectStatement = 1, RULE_querySpecification = 2, 
		RULE_selectSpec = 3, RULE_selectElements = 4, RULE_selectElement = 5, 
		RULE_queryExpression = 6, RULE_fromClause = 7, RULE_tableSources = 8, 
		RULE_whereClause = 9, RULE_groupByClause = 10, RULE_havingClause = 11, 
		RULE_orderByClause = 12, RULE_orderByExpression = 13, RULE_limitClause = 14, 
		RULE_limitClauseAtom = 15, RULE_tableSource = 16, RULE_tableSourceItem = 17, 
		RULE_joinPart = 18, RULE_joinSpec = 19, RULE_tableName = 20, RULE_fullId = 21, 
		RULE_uid = 22, RULE_dottedId = 23, RULE_fullColumnName = 24, RULE_functionCall = 25, 
		RULE_specificFunction = 26, RULE_aggregateFunction = 27, RULE_scalarFunctionName = 28, 
		RULE_functionNameBase = 29, RULE_functionArgs = 30, RULE_functionArg = 31, 
		RULE_expression = 32, RULE_predicate = 33, RULE_expressionAtom = 34, RULE_unaryOperator = 35, 
		RULE_comparisonOperator = 36, RULE_logicalOperator = 37, RULE_multOperator = 38, 
		RULE_addOperator = 39, RULE_constant = 40, RULE_stringLiteral = 41, RULE_decimalLiteral = 42, 
		RULE_booleanLiteral = 43;
	private static String[] makeRuleNames() {
		return new String[] {
			"root", "selectStatement", "querySpecification", "selectSpec", "selectElements", 
			"selectElement", "queryExpression", "fromClause", "tableSources", "whereClause", 
			"groupByClause", "havingClause", "orderByClause", "orderByExpression", 
			"limitClause", "limitClauseAtom", "tableSource", "tableSourceItem", "joinPart", 
			"joinSpec", "tableName", "fullId", "uid", "dottedId", "fullColumnName", 
			"functionCall", "specificFunction", "aggregateFunction", "scalarFunctionName", 
			"functionNameBase", "functionArgs", "functionArg", "expression", "predicate", 
			"expressionAtom", "unaryOperator", "comparisonOperator", "logicalOperator", 
			"multOperator", "addOperator", "constant", "stringLiteral", "decimalLiteral", 
			"booleanLiteral"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'ALL'", "'AND'", "'ASC'", "'AS'", "'BETWEEN'", "'BY'", "'DESC'", 
			"'DISTINCT'", "'EXISTS'", "'FROM'", "'GROUP'", "'HAVING'", "'IFNULL'", 
			"'IN'", "'IS'", "'JOIN'", "'LEFT'", "'LIKE'", "'LIMIT'", "'NOT'", "'NULL'", 
			"'ON'", "'OR'", "'ORDER'", "'OUTER'", "'RIGHT'", "'SELECT'", "'STDDEV'", 
			"'STDDEV_POP'", "'STDDEV_SAMP'", "'TRUE'", "'WHERE'", "'AVG'", "'COUNT'", 
			"'MAX'", "'MIN'", "'SUM'", "'*'", "'/'", "'%'", "'+'", "'-'", "'='", 
			"'>'", "'<'", "'!'", "'.'", "'('", "')'", "','"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "ALL", "AND", "ASC", "AS", "BETWEEN", "BY", "DESC", "DISTINCT", 
			"EXISTS", "FROM", "GROUP", "HAVING", "IFNULL", "IN", "IS", "JOIN", "LEFT", 
			"LIKE", "LIMIT", "NOT", "NULL", "ON", "OR", "ORDER", "OUTER", "RIGHT", 
			"SELECT", "STDDEV", "STDDEV_POP", "STDDEV_SAMP", "TRUE", "WHERE", "AVG", 
			"COUNT", "MAX", "MIN", "SUM", "STAR", "DIVIDE", "MODULE", "PLUS", "MINUS", 
			"EQUAL_SYMBOL", "GREATER_SYMBOL", "LESS_SYMBOL", "EXCLAMATION_SYMBOL", 
			"DOT", "LR_BRACKET", "RR_BRACKET", "COMMA", "STRING_LITERAL", "DECIMAL_LITERAL", 
			"COLUMN_LITERAL", "OFFSET", "INNER", "NATURAL", "DOT_ID", "GROUP_CONCAT", 
			"SEPARATOR", "ASCII", "CURDATE", "CURRENT_DATE", "CURRENT_TIME", "CURRENT_TIMESTAMP", 
			"CURTIME", "DATE_ADD", "DATE_SUB", "IF", "LOCALTIME", "LOCALTIMESTAMP", 
			"MID", "NOW", "REPEAT", "REPLACE", "SUBSTR", "SUBSTRING", "SYSDATE", 
			"TRIM", "UTC_DATE", "UTC_TIME", "UTC_TIMESTAMP", "ABS", "ACOS", "ADDDATE", 
			"ADDTIME", "AREA", "ASBINARY", "ASIN", "ASTEXT", "ASWKB", "ASWKT", "ATAN", 
			"ATAN2", "BENCHMARK", "BIN", "BIT_COUNT", "BIT_LENGTH", "BUFFER", "CEIL", 
			"CEILING", "CENTROID", "CHARACTER_LENGTH", "CHARSET", "CHAR_LENGTH", 
			"COERCIBILITY", "COLLATION", "COMPRESS", "CONCAT", "CONCAT_WS", "CONNECTION_ID", 
			"CONV", "CONVERT_TZ", "COS", "COT", "CUME_DIST", "DATABASE", "DATE", 
			"DATEDIFF", "DATE_FORMAT", "DAY", "DAYNAME", "DAYOFMONTH", "DAYOFWEEK", 
			"DAYOFYEAR", "DECODE", "DEGREES", "DENSE_RANK", "DES_DECRYPT", "DES_ENCRYPT", 
			"DIMENSION", "DISJOINT", "ELT", "ENCODE", "ENCRYPT", "ENDPOINT", "ENVELOPE", 
			"EQUALS", "EXP", "EXPORT_SET", "EXTERIORRING", "EXTRACTVALUE", "FIELD", 
			"FIND_IN_SET", "FIRST_VALUE", "FLOOR", "FORMAT", "FOUND_ROWS", "FROM_BASE64", 
			"FROM_DAYS", "FROM_UNIXTIME", "GLENGTH", "GREATEST", "GTID_SUBSET", "GTID_SUBTRACT", 
			"HEX", "HOUR", "INET6_ATON", "INET6_NTOA", "INET_ATON", "INET_NTOA", 
			"INSTR", "INTERIORRINGN", "INTERSECTS", "INVISIBLE", "ISCLOSED", "ISEMPTY", 
			"ISNULL", "ISSIMPLE", "IS_FREE_LOCK", "IS_IPV4", "IS_IPV4_COMPAT", "IS_IPV4_MAPPED", 
			"IS_IPV6", "IS_USED_LOCK", "LAG", "LAST_INSERT_ID", "LAST_VALUE", "LCASE", 
			"LEAD", "LEAST", "LENGTH", "LINEFROMTEXT", "LINEFROMWKB", "LINESTRING", 
			"LINESTRINGFROMTEXT", "LINESTRINGFROMWKB", "LN", "LOAD_FILE", "LOCATE", 
			"LOG", "LOG10", "LOG2", "LOWER", "LPAD", "LTRIM", "MAKEDATE", "MAKETIME", 
			"MAKE_SET", "MASTER_POS_WAIT", "MBRCONTAINS", "MBRDISJOINT", "MBREQUAL", 
			"MBRINTERSECTS", "MBROVERLAPS", "MBRTOUCHES", "MBRWITHIN", "MICROSECOND", 
			"MINUTE", "MLINEFROMTEXT", "MLINEFROMWKB", "MOD", "MONTH", "MONTHNAME", 
			"NAME_CONST", "NTH_VALUE", "NTILE", "NULLIF", "NUMGEOMETRIES", "NUMINTERIORRINGS", 
			"NUMPOINTS", "OCT", "OCTET_LENGTH", "ORD", "OVERLAPS", "PERCENT_RANK", 
			"PERIOD_ADD", "PERIOD_DIFF", "PI", "POSITION", "POW", "POWER", "QUARTER", 
			"QUOTE", "RADIANS", "RAND", "RANDOM", "RANK", "RANDOM_BYTES", "RELEASE_LOCK", 
			"REVERSE", "ROUND", "ROW_COUNT", "ROW_NUMBER", "RPAD", "RTRIM", "SCHEMA", 
			"SECOND", "SEC_TO_TIME", "SIGN", "SIN", "SOUNDEX", "SQRT", "SRID", "STRCMP", 
			"STR_TO_DATE", "SUBDATE", "SUBSTRING_INDEX", "SUBTIME", "SYSTEM_USER", 
			"TAN", "TIME", "TIMEDIFF", "TIMESTAMP", "TIMESTAMPADD", "TIMESTAMPDIFF", 
			"TIME_FORMAT", "TIME_TO_SEC", "TOUCHES", "TO_BASE64", "TO_DAYS", "TO_SECONDS", 
			"UCASE", "UNCOMPRESS", "UNCOMPRESSED_LENGTH", "UNHEX", "UNIX_TIMESTAMP", 
			"UPDATEXML", "UPPER", "UUID", "UUID_SHORT", "VALIDATE_PASSWORD_STRENGTH", 
			"VERSION", "VISIBLE", "WAIT_UNTIL_SQL_THREAD_AFTER_GTIDS", "WEEK", "WEEKDAY", 
			"WEEKOFYEAR", "WEIGHT_STRING", "WITHIN", "YEAR", "YEARWEEK", "FALSE", 
			"REAL_LITERAL", "NULL_LITERAL", "NULL_SPEC_LITERAL", "STRING_CHARSET_NAME", 
			"START_NATIONAL_STRING_LITERAL", "ZERO_DECIMAL", "ONE_DECIMAL", "TWO_DECIMAL"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "SQLParser.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public SQLParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class RootContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(SQLParser.EOF, 0); }
		public SelectStatementContext selectStatement() {
			return getRuleContext(SelectStatementContext.class,0);
		}
		public List<TerminalNode> MINUS() { return getTokens(SQLParser.MINUS); }
		public TerminalNode MINUS(int i) {
			return getToken(SQLParser.MINUS, i);
		}
		public RootContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_root; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLParserListener ) ((SQLParserListener)listener).enterRoot(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLParserListener ) ((SQLParserListener)listener).exitRoot(this);
		}
	}

	public final RootContext root() throws RecognitionException {
		RootContext _localctx = new RootContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_root);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(89);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SELECT || _la==LR_BRACKET) {
				{
				setState(88);
				selectStatement();
				}
			}

			setState(93);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==MINUS) {
				{
				setState(91);
				match(MINUS);
				setState(92);
				match(MINUS);
				}
			}

			setState(95);
			match(EOF);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class SelectStatementContext extends ParserRuleContext {
		public SelectStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_selectStatement; }
	 
		public SelectStatementContext() { }
		public void copyFrom(SelectStatementContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class SimpleSelectContext extends SelectStatementContext {
		public QuerySpecificationContext querySpecification() {
			return getRuleContext(QuerySpecificationContext.class,0);
		}
		public SimpleSelectContext(SelectStatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLParserListener ) ((SQLParserListener)listener).enterSimpleSelect(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLParserListener ) ((SQLParserListener)listener).exitSimpleSelect(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ParenthesisSelectContext extends SelectStatementContext {
		public QueryExpressionContext queryExpression() {
			return getRuleContext(QueryExpressionContext.class,0);
		}
		public ParenthesisSelectContext(SelectStatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLParserListener ) ((SQLParserListener)listener).enterParenthesisSelect(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLParserListener ) ((SQLParserListener)listener).exitParenthesisSelect(this);
		}
	}

	public final SelectStatementContext selectStatement() throws RecognitionException {
		SelectStatementContext _localctx = new SelectStatementContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_selectStatement);
		try {
			setState(99);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case SELECT:
				_localctx = new SimpleSelectContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(97);
				querySpecification();
				}
				break;
			case LR_BRACKET:
				_localctx = new ParenthesisSelectContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(98);
				queryExpression();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class QuerySpecificationContext extends ParserRuleContext {
		public TerminalNode SELECT() { return getToken(SQLParser.SELECT, 0); }
		public SelectElementsContext selectElements() {
			return getRuleContext(SelectElementsContext.class,0);
		}
		public FromClauseContext fromClause() {
			return getRuleContext(FromClauseContext.class,0);
		}
		public List<SelectSpecContext> selectSpec() {
			return getRuleContexts(SelectSpecContext.class);
		}
		public SelectSpecContext selectSpec(int i) {
			return getRuleContext(SelectSpecContext.class,i);
		}
		public WhereClauseContext whereClause() {
			return getRuleContext(WhereClauseContext.class,0);
		}
		public GroupByClauseContext groupByClause() {
			return getRuleContext(GroupByClauseContext.class,0);
		}
		public HavingClauseContext havingClause() {
			return getRuleContext(HavingClauseContext.class,0);
		}
		public OrderByClauseContext orderByClause() {
			return getRuleContext(OrderByClauseContext.class,0);
		}
		public LimitClauseContext limitClause() {
			return getRuleContext(LimitClauseContext.class,0);
		}
		public QuerySpecificationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_querySpecification; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLParserListener ) ((SQLParserListener)listener).enterQuerySpecification(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLParserListener ) ((SQLParserListener)listener).exitQuerySpecification(this);
		}
	}

	public final QuerySpecificationContext querySpecification() throws RecognitionException {
		QuerySpecificationContext _localctx = new QuerySpecificationContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_querySpecification);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(101);
			match(SELECT);
			setState(105);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(102);
					selectSpec();
					}
					} 
				}
				setState(107);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
			}
			setState(108);
			selectElements();
			setState(109);
			fromClause();
			setState(111);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				{
				setState(110);
				whereClause();
				}
				break;
			}
			setState(114);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				{
				setState(113);
				groupByClause();
				}
				break;
			}
			setState(117);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				{
				setState(116);
				havingClause();
				}
				break;
			}
			setState(120);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				{
				setState(119);
				orderByClause();
				}
				break;
			}
			setState(123);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				{
				setState(122);
				limitClause();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class SelectSpecContext extends ParserRuleContext {
		public TerminalNode ALL() { return getToken(SQLParser.ALL, 0); }
		public TerminalNode DISTINCT() { return getToken(SQLParser.DISTINCT, 0); }
		public SelectSpecContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_selectSpec; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLParserListener ) ((SQLParserListener)listener).enterSelectSpec(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLParserListener ) ((SQLParserListener)listener).exitSelectSpec(this);
		}
	}

	public final SelectSpecContext selectSpec() throws RecognitionException {
		SelectSpecContext _localctx = new SelectSpecContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_selectSpec);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(125);
			_la = _input.LA(1);
			if ( !(_la==ALL || _la==DISTINCT) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class SelectElementsContext extends ParserRuleContext {
		public SelectElementsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_selectElements; }
	 
		public SelectElementsContext() { }
		public void copyFrom(SelectElementsContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ProjectionElementContext extends SelectElementsContext {
		public TerminalNode STAR() { return getToken(SQLParser.STAR, 0); }
		public List<SelectElementContext> selectElement() {
			return getRuleContexts(SelectElementContext.class);
		}
		public SelectElementContext selectElement(int i) {
			return getRuleContext(SelectElementContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(SQLParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(SQLParser.COMMA, i);
		}
		public ProjectionElementContext(SelectElementsContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLParserListener ) ((SQLParserListener)listener).enterProjectionElement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLParserListener ) ((SQLParserListener)listener).exitProjectionElement(this);
		}
	}

	public final SelectElementsContext selectElements() throws RecognitionException {
		SelectElementsContext _localctx = new SelectElementsContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_selectElements);
		int _la;
		try {
			_localctx = new ProjectionElementContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(129);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				{
				setState(127);
				match(STAR);
				}
				break;
			case 2:
				{
				setState(128);
				selectElement();
				}
				break;
			}
			setState(135);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(131);
				match(COMMA);
				setState(132);
				selectElement();
				}
				}
				setState(137);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class SelectElementContext extends ParserRuleContext {
		public FullIdContext fullId() {
			return getRuleContext(FullIdContext.class,0);
		}
		public TerminalNode DOT() { return getToken(SQLParser.DOT, 0); }
		public TerminalNode STAR() { return getToken(SQLParser.STAR, 0); }
		public FullColumnNameContext fullColumnName() {
			return getRuleContext(FullColumnNameContext.class,0);
		}
		public UidContext uid() {
			return getRuleContext(UidContext.class,0);
		}
		public TerminalNode AS() { return getToken(SQLParser.AS, 0); }
		public FunctionCallContext functionCall() {
			return getRuleContext(FunctionCallContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public SelectElementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_selectElement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLParserListener ) ((SQLParserListener)listener).enterSelectElement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLParserListener ) ((SQLParserListener)listener).exitSelectElement(this);
		}
	}

	public final SelectElementContext selectElement() throws RecognitionException {
		SelectElementContext _localctx = new SelectElementContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_selectElement);
		int _la;
		try {
			setState(163);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(138);
				fullId();
				setState(139);
				match(DOT);
				setState(140);
				match(STAR);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(142);
				fullColumnName();
				setState(147);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 11258999068426256L) != 0)) {
					{
					setState(144);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==AS) {
						{
						setState(143);
						match(AS);
						}
					}

					setState(146);
					uid();
					}
				}

				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(149);
				functionCall();
				setState(154);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 11258999068426256L) != 0)) {
					{
					setState(151);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==AS) {
						{
						setState(150);
						match(AS);
						}
					}

					setState(153);
					uid();
					}
				}

				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(156);
				expression(0);
				setState(161);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 11258999068426256L) != 0)) {
					{
					setState(158);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==AS) {
						{
						setState(157);
						match(AS);
						}
					}

					setState(160);
					uid();
					}
				}

				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class QueryExpressionContext extends ParserRuleContext {
		public TerminalNode LR_BRACKET() { return getToken(SQLParser.LR_BRACKET, 0); }
		public QuerySpecificationContext querySpecification() {
			return getRuleContext(QuerySpecificationContext.class,0);
		}
		public TerminalNode RR_BRACKET() { return getToken(SQLParser.RR_BRACKET, 0); }
		public QueryExpressionContext queryExpression() {
			return getRuleContext(QueryExpressionContext.class,0);
		}
		public QueryExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_queryExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLParserListener ) ((SQLParserListener)listener).enterQueryExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLParserListener ) ((SQLParserListener)listener).exitQueryExpression(this);
		}
	}

	public final QueryExpressionContext queryExpression() throws RecognitionException {
		QueryExpressionContext _localctx = new QueryExpressionContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_queryExpression);
		try {
			setState(173);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(165);
				match(LR_BRACKET);
				setState(166);
				querySpecification();
				setState(167);
				match(RR_BRACKET);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(169);
				match(LR_BRACKET);
				setState(170);
				queryExpression();
				setState(171);
				match(RR_BRACKET);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class FromClauseContext extends ParserRuleContext {
		public TerminalNode FROM() { return getToken(SQLParser.FROM, 0); }
		public List<TableSourceContext> tableSource() {
			return getRuleContexts(TableSourceContext.class);
		}
		public TableSourceContext tableSource(int i) {
			return getRuleContext(TableSourceContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(SQLParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(SQLParser.COMMA, i);
		}
		public FromClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fromClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLParserListener ) ((SQLParserListener)listener).enterFromClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLParserListener ) ((SQLParserListener)listener).exitFromClause(this);
		}
	}

	public final FromClauseContext fromClause() throws RecognitionException {
		FromClauseContext _localctx = new FromClauseContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_fromClause);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(175);
			match(FROM);
			setState(176);
			tableSource();
			setState(181);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,19,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(177);
					match(COMMA);
					setState(178);
					tableSource();
					}
					} 
				}
				setState(183);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,19,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class TableSourcesContext extends ParserRuleContext {
		public List<TableSourceContext> tableSource() {
			return getRuleContexts(TableSourceContext.class);
		}
		public TableSourceContext tableSource(int i) {
			return getRuleContext(TableSourceContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(SQLParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(SQLParser.COMMA, i);
		}
		public TableSourcesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tableSources; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLParserListener ) ((SQLParserListener)listener).enterTableSources(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLParserListener ) ((SQLParserListener)listener).exitTableSources(this);
		}
	}

	public final TableSourcesContext tableSources() throws RecognitionException {
		TableSourcesContext _localctx = new TableSourcesContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_tableSources);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(184);
			tableSource();
			setState(189);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(185);
				match(COMMA);
				setState(186);
				tableSource();
				}
				}
				setState(191);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class WhereClauseContext extends ParserRuleContext {
		public TerminalNode WHERE() { return getToken(SQLParser.WHERE, 0); }
		public TerminalNode EXISTS() { return getToken(SQLParser.EXISTS, 0); }
		public TerminalNode LR_BRACKET() { return getToken(SQLParser.LR_BRACKET, 0); }
		public SelectStatementContext selectStatement() {
			return getRuleContext(SelectStatementContext.class,0);
		}
		public TerminalNode RR_BRACKET() { return getToken(SQLParser.RR_BRACKET, 0); }
		public TerminalNode NOT() { return getToken(SQLParser.NOT, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode IN() { return getToken(SQLParser.IN, 0); }
		public WhereClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_whereClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLParserListener ) ((SQLParserListener)listener).enterWhereClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLParserListener ) ((SQLParserListener)listener).exitWhereClause(this);
		}
	}

	public final WhereClauseContext whereClause() throws RecognitionException {
		WhereClauseContext _localctx = new WhereClauseContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_whereClause);
		int _la;
		try {
			setState(213);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,23,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(192);
				match(WHERE);
				setState(194);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==NOT) {
					{
					setState(193);
					match(NOT);
					}
				}

				setState(196);
				match(EXISTS);
				setState(197);
				match(LR_BRACKET);
				setState(198);
				selectStatement();
				setState(199);
				match(RR_BRACKET);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(201);
				match(WHERE);
				setState(202);
				expression(0);
				setState(204);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==NOT) {
					{
					setState(203);
					match(NOT);
					}
				}

				setState(206);
				match(IN);
				setState(207);
				match(LR_BRACKET);
				setState(208);
				selectStatement();
				setState(209);
				match(RR_BRACKET);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(211);
				match(WHERE);
				setState(212);
				expression(0);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class GroupByClauseContext extends ParserRuleContext {
		public TerminalNode GROUP() { return getToken(SQLParser.GROUP, 0); }
		public TerminalNode BY() { return getToken(SQLParser.BY, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(SQLParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(SQLParser.COMMA, i);
		}
		public GroupByClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_groupByClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLParserListener ) ((SQLParserListener)listener).enterGroupByClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLParserListener ) ((SQLParserListener)listener).exitGroupByClause(this);
		}
	}

	public final GroupByClauseContext groupByClause() throws RecognitionException {
		GroupByClauseContext _localctx = new GroupByClauseContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_groupByClause);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(215);
			match(GROUP);
			setState(216);
			match(BY);
			setState(217);
			expression(0);
			setState(222);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,24,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(218);
					match(COMMA);
					setState(219);
					expression(0);
					}
					} 
				}
				setState(224);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,24,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class HavingClauseContext extends ParserRuleContext {
		public TerminalNode HAVING() { return getToken(SQLParser.HAVING, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public HavingClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_havingClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLParserListener ) ((SQLParserListener)listener).enterHavingClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLParserListener ) ((SQLParserListener)listener).exitHavingClause(this);
		}
	}

	public final HavingClauseContext havingClause() throws RecognitionException {
		HavingClauseContext _localctx = new HavingClauseContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_havingClause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(225);
			match(HAVING);
			setState(226);
			expression(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class OrderByClauseContext extends ParserRuleContext {
		public TerminalNode ORDER() { return getToken(SQLParser.ORDER, 0); }
		public TerminalNode BY() { return getToken(SQLParser.BY, 0); }
		public List<OrderByExpressionContext> orderByExpression() {
			return getRuleContexts(OrderByExpressionContext.class);
		}
		public OrderByExpressionContext orderByExpression(int i) {
			return getRuleContext(OrderByExpressionContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(SQLParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(SQLParser.COMMA, i);
		}
		public OrderByClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_orderByClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLParserListener ) ((SQLParserListener)listener).enterOrderByClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLParserListener ) ((SQLParserListener)listener).exitOrderByClause(this);
		}
	}

	public final OrderByClauseContext orderByClause() throws RecognitionException {
		OrderByClauseContext _localctx = new OrderByClauseContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_orderByClause);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(228);
			match(ORDER);
			setState(229);
			match(BY);
			setState(230);
			orderByExpression();
			setState(235);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,25,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(231);
					match(COMMA);
					setState(232);
					orderByExpression();
					}
					} 
				}
				setState(237);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,25,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class OrderByExpressionContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode ASC() { return getToken(SQLParser.ASC, 0); }
		public TerminalNode DESC() { return getToken(SQLParser.DESC, 0); }
		public OrderByExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_orderByExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLParserListener ) ((SQLParserListener)listener).enterOrderByExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLParserListener ) ((SQLParserListener)listener).exitOrderByExpression(this);
		}
	}

	public final OrderByExpressionContext orderByExpression() throws RecognitionException {
		OrderByExpressionContext _localctx = new OrderByExpressionContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_orderByExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(238);
			expression(0);
			setState(240);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ASC || _la==DESC) {
				{
				setState(239);
				_la = _input.LA(1);
				if ( !(_la==ASC || _la==DESC) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class LimitClauseContext extends ParserRuleContext {
		public LimitClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_limitClause; }
	 
		public LimitClauseContext() { }
		public void copyFrom(LimitClauseContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class LimitClauseElementContext extends LimitClauseContext {
		public LimitClauseAtomContext offset;
		public LimitClauseAtomContext limit;
		public TerminalNode LIMIT() { return getToken(SQLParser.LIMIT, 0); }
		public TerminalNode OFFSET() { return getToken(SQLParser.OFFSET, 0); }
		public List<LimitClauseAtomContext> limitClauseAtom() {
			return getRuleContexts(LimitClauseAtomContext.class);
		}
		public LimitClauseAtomContext limitClauseAtom(int i) {
			return getRuleContext(LimitClauseAtomContext.class,i);
		}
		public TerminalNode COMMA() { return getToken(SQLParser.COMMA, 0); }
		public LimitClauseElementContext(LimitClauseContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLParserListener ) ((SQLParserListener)listener).enterLimitClauseElement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLParserListener ) ((SQLParserListener)listener).exitLimitClauseElement(this);
		}
	}

	public final LimitClauseContext limitClause() throws RecognitionException {
		LimitClauseContext _localctx = new LimitClauseContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_limitClause);
		try {
			_localctx = new LimitClauseElementContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(242);
			match(LIMIT);
			setState(253);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,28,_ctx) ) {
			case 1:
				{
				setState(246);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,27,_ctx) ) {
				case 1:
					{
					setState(243);
					((LimitClauseElementContext)_localctx).offset = limitClauseAtom();
					setState(244);
					match(COMMA);
					}
					break;
				}
				setState(248);
				((LimitClauseElementContext)_localctx).limit = limitClauseAtom();
				}
				break;
			case 2:
				{
				setState(249);
				((LimitClauseElementContext)_localctx).limit = limitClauseAtom();
				setState(250);
				match(OFFSET);
				setState(251);
				((LimitClauseElementContext)_localctx).offset = limitClauseAtom();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class LimitClauseAtomContext extends ParserRuleContext {
		public TerminalNode DECIMAL_LITERAL() { return getToken(SQLParser.DECIMAL_LITERAL, 0); }
		public LimitClauseAtomContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_limitClauseAtom; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLParserListener ) ((SQLParserListener)listener).enterLimitClauseAtom(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLParserListener ) ((SQLParserListener)listener).exitLimitClauseAtom(this);
		}
	}

	public final LimitClauseAtomContext limitClauseAtom() throws RecognitionException {
		LimitClauseAtomContext _localctx = new LimitClauseAtomContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_limitClauseAtom);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(255);
			match(DECIMAL_LITERAL);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class TableSourceContext extends ParserRuleContext {
		public TableSourceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tableSource; }
	 
		public TableSourceContext() { }
		public void copyFrom(TableSourceContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class TableSourceNestedContext extends TableSourceContext {
		public TerminalNode LR_BRACKET() { return getToken(SQLParser.LR_BRACKET, 0); }
		public TableSourceItemContext tableSourceItem() {
			return getRuleContext(TableSourceItemContext.class,0);
		}
		public TerminalNode RR_BRACKET() { return getToken(SQLParser.RR_BRACKET, 0); }
		public List<JoinPartContext> joinPart() {
			return getRuleContexts(JoinPartContext.class);
		}
		public JoinPartContext joinPart(int i) {
			return getRuleContext(JoinPartContext.class,i);
		}
		public TableSourceNestedContext(TableSourceContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLParserListener ) ((SQLParserListener)listener).enterTableSourceNested(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLParserListener ) ((SQLParserListener)listener).exitTableSourceNested(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class TableSourceBaseContext extends TableSourceContext {
		public TableSourceItemContext tableSourceItem() {
			return getRuleContext(TableSourceItemContext.class,0);
		}
		public List<JoinPartContext> joinPart() {
			return getRuleContexts(JoinPartContext.class);
		}
		public JoinPartContext joinPart(int i) {
			return getRuleContext(JoinPartContext.class,i);
		}
		public TableSourceBaseContext(TableSourceContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLParserListener ) ((SQLParserListener)listener).enterTableSourceBase(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLParserListener ) ((SQLParserListener)listener).exitTableSourceBase(this);
		}
	}

	public final TableSourceContext tableSource() throws RecognitionException {
		TableSourceContext _localctx = new TableSourceContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_tableSource);
		int _la;
		try {
			int _alt;
			setState(274);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,31,_ctx) ) {
			case 1:
				_localctx = new TableSourceBaseContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(257);
				tableSourceItem();
				setState(261);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,29,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(258);
						joinPart();
						}
						} 
					}
					setState(263);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,29,_ctx);
				}
				}
				break;
			case 2:
				_localctx = new TableSourceNestedContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(264);
				match(LR_BRACKET);
				setState(265);
				tableSourceItem();
				setState(269);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 108086391124197376L) != 0)) {
					{
					{
					setState(266);
					joinPart();
					}
					}
					setState(271);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(272);
				match(RR_BRACKET);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class TableSourceItemContext extends ParserRuleContext {
		public TableSourceItemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tableSourceItem; }
	 
		public TableSourceItemContext() { }
		public void copyFrom(TableSourceItemContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class SubqueryTableItemContext extends TableSourceItemContext {
		public SelectStatementContext parenthesisSubquery;
		public UidContext alias;
		public SelectStatementContext selectStatement() {
			return getRuleContext(SelectStatementContext.class,0);
		}
		public TerminalNode LR_BRACKET() { return getToken(SQLParser.LR_BRACKET, 0); }
		public TerminalNode RR_BRACKET() { return getToken(SQLParser.RR_BRACKET, 0); }
		public TerminalNode AS() { return getToken(SQLParser.AS, 0); }
		public UidContext uid() {
			return getRuleContext(UidContext.class,0);
		}
		public SubqueryTableItemContext(TableSourceItemContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLParserListener ) ((SQLParserListener)listener).enterSubqueryTableItem(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLParserListener ) ((SQLParserListener)listener).exitSubqueryTableItem(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class AtomTableItemContext extends TableSourceItemContext {
		public UidContext alias;
		public TableNameContext tableName() {
			return getRuleContext(TableNameContext.class,0);
		}
		public UidContext uid() {
			return getRuleContext(UidContext.class,0);
		}
		public TerminalNode AS() { return getToken(SQLParser.AS, 0); }
		public AtomTableItemContext(TableSourceItemContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLParserListener ) ((SQLParserListener)listener).enterAtomTableItem(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLParserListener ) ((SQLParserListener)listener).exitAtomTableItem(this);
		}
	}

	public final TableSourceItemContext tableSourceItem() throws RecognitionException {
		TableSourceItemContext _localctx = new TableSourceItemContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_tableSourceItem);
		int _la;
		try {
			setState(296);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case STRING_LITERAL:
			case COLUMN_LITERAL:
				_localctx = new AtomTableItemContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(276);
				tableName();
				setState(281);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,33,_ctx) ) {
				case 1:
					{
					setState(278);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==AS) {
						{
						setState(277);
						match(AS);
						}
					}

					setState(280);
					((AtomTableItemContext)_localctx).alias = uid();
					}
					break;
				}
				}
				break;
			case SELECT:
			case LR_BRACKET:
				_localctx = new SubqueryTableItemContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(288);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,34,_ctx) ) {
				case 1:
					{
					setState(283);
					selectStatement();
					}
					break;
				case 2:
					{
					setState(284);
					match(LR_BRACKET);
					setState(285);
					((SubqueryTableItemContext)_localctx).parenthesisSubquery = selectStatement();
					setState(286);
					match(RR_BRACKET);
					}
					break;
				}
				setState(291);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,35,_ctx) ) {
				case 1:
					{
					setState(290);
					match(AS);
					}
					break;
				}
				setState(294);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,36,_ctx) ) {
				case 1:
					{
					setState(293);
					((SubqueryTableItemContext)_localctx).alias = uid();
					}
					break;
				}
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class JoinPartContext extends ParserRuleContext {
		public UidContext alias;
		public TerminalNode JOIN() { return getToken(SQLParser.JOIN, 0); }
		public TerminalNode LR_BRACKET() { return getToken(SQLParser.LR_BRACKET, 0); }
		public SelectStatementContext selectStatement() {
			return getRuleContext(SelectStatementContext.class,0);
		}
		public TerminalNode RR_BRACKET() { return getToken(SQLParser.RR_BRACKET, 0); }
		public TableSourceItemContext tableSourceItem() {
			return getRuleContext(TableSourceItemContext.class,0);
		}
		public TerminalNode INNER() { return getToken(SQLParser.INNER, 0); }
		public List<JoinSpecContext> joinSpec() {
			return getRuleContexts(JoinSpecContext.class);
		}
		public JoinSpecContext joinSpec(int i) {
			return getRuleContext(JoinSpecContext.class,i);
		}
		public UidContext uid() {
			return getRuleContext(UidContext.class,0);
		}
		public TerminalNode LEFT() { return getToken(SQLParser.LEFT, 0); }
		public TerminalNode RIGHT() { return getToken(SQLParser.RIGHT, 0); }
		public TerminalNode OUTER() { return getToken(SQLParser.OUTER, 0); }
		public TerminalNode NATURAL() { return getToken(SQLParser.NATURAL, 0); }
		public JoinPartContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_joinPart; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLParserListener ) ((SQLParserListener)listener).enterJoinPart(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLParserListener ) ((SQLParserListener)listener).exitJoinPart(this);
		}
	}

	public final JoinPartContext joinPart() throws RecognitionException {
		JoinPartContext _localctx = new JoinPartContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_joinPart);
		int _la;
		try {
			int _alt;
			setState(357);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case JOIN:
			case INNER:
				enterOuterAlt(_localctx, 1);
				{
				setState(299);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==INNER) {
					{
					setState(298);
					match(INNER);
					}
				}

				setState(301);
				match(JOIN);
				setState(307);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,39,_ctx) ) {
				case 1:
					{
					setState(302);
					match(LR_BRACKET);
					setState(303);
					selectStatement();
					setState(304);
					match(RR_BRACKET);
					}
					break;
				case 2:
					{
					setState(306);
					tableSourceItem();
					}
					break;
				}
				setState(310);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,40,_ctx) ) {
				case 1:
					{
					setState(309);
					((JoinPartContext)_localctx).alias = uid();
					}
					break;
				}
				setState(315);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,41,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(312);
						joinSpec();
						}
						} 
					}
					setState(317);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,41,_ctx);
				}
				}
				break;
			case LEFT:
			case RIGHT:
				enterOuterAlt(_localctx, 2);
				{
				setState(318);
				_la = _input.LA(1);
				if ( !(_la==LEFT || _la==RIGHT) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(320);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==OUTER) {
					{
					setState(319);
					match(OUTER);
					}
				}

				setState(322);
				match(JOIN);
				setState(328);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,43,_ctx) ) {
				case 1:
					{
					setState(323);
					match(LR_BRACKET);
					setState(324);
					selectStatement();
					setState(325);
					match(RR_BRACKET);
					}
					break;
				case 2:
					{
					setState(327);
					tableSourceItem();
					}
					break;
				}
				setState(331);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,44,_ctx) ) {
				case 1:
					{
					setState(330);
					((JoinPartContext)_localctx).alias = uid();
					}
					break;
				}
				setState(336);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,45,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(333);
						joinSpec();
						}
						} 
					}
					setState(338);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,45,_ctx);
				}
				}
				break;
			case NATURAL:
				enterOuterAlt(_localctx, 3);
				{
				setState(339);
				match(NATURAL);
				setState(344);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LEFT || _la==RIGHT) {
					{
					setState(340);
					_la = _input.LA(1);
					if ( !(_la==LEFT || _la==RIGHT) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(342);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==OUTER) {
						{
						setState(341);
						match(OUTER);
						}
					}

					}
				}

				setState(346);
				match(JOIN);
				setState(352);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,48,_ctx) ) {
				case 1:
					{
					setState(347);
					match(LR_BRACKET);
					setState(348);
					selectStatement();
					setState(349);
					match(RR_BRACKET);
					}
					break;
				case 2:
					{
					setState(351);
					tableSourceItem();
					}
					break;
				}
				setState(355);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,49,_ctx) ) {
				case 1:
					{
					setState(354);
					((JoinPartContext)_localctx).alias = uid();
					}
					break;
				}
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class JoinSpecContext extends ParserRuleContext {
		public TerminalNode ON() { return getToken(SQLParser.ON, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public JoinSpecContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_joinSpec; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLParserListener ) ((SQLParserListener)listener).enterJoinSpec(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLParserListener ) ((SQLParserListener)listener).exitJoinSpec(this);
		}
	}

	public final JoinSpecContext joinSpec() throws RecognitionException {
		JoinSpecContext _localctx = new JoinSpecContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_joinSpec);
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(359);
			match(ON);
			setState(360);
			expression(0);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class TableNameContext extends ParserRuleContext {
		public FullIdContext fullId() {
			return getRuleContext(FullIdContext.class,0);
		}
		public TableNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tableName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLParserListener ) ((SQLParserListener)listener).enterTableName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLParserListener ) ((SQLParserListener)listener).exitTableName(this);
		}
	}

	public final TableNameContext tableName() throws RecognitionException {
		TableNameContext _localctx = new TableNameContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_tableName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(362);
			fullId();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class FullIdContext extends ParserRuleContext {
		public List<UidContext> uid() {
			return getRuleContexts(UidContext.class);
		}
		public UidContext uid(int i) {
			return getRuleContext(UidContext.class,i);
		}
		public TerminalNode DOT_ID() { return getToken(SQLParser.DOT_ID, 0); }
		public TerminalNode DOT() { return getToken(SQLParser.DOT, 0); }
		public FullIdContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fullId; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLParserListener ) ((SQLParserListener)listener).enterFullId(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLParserListener ) ((SQLParserListener)listener).exitFullId(this);
		}
	}

	public final FullIdContext fullId() throws RecognitionException {
		FullIdContext _localctx = new FullIdContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_fullId);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(364);
			uid();
			setState(368);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,51,_ctx) ) {
			case 1:
				{
				setState(365);
				match(DOT_ID);
				}
				break;
			case 2:
				{
				setState(366);
				match(DOT);
				setState(367);
				uid();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class UidContext extends ParserRuleContext {
		public TerminalNode STRING_LITERAL() { return getToken(SQLParser.STRING_LITERAL, 0); }
		public TerminalNode COLUMN_LITERAL() { return getToken(SQLParser.COLUMN_LITERAL, 0); }
		public UidContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_uid; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLParserListener ) ((SQLParserListener)listener).enterUid(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLParserListener ) ((SQLParserListener)listener).exitUid(this);
		}
	}

	public final UidContext uid() throws RecognitionException {
		UidContext _localctx = new UidContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_uid);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(370);
			_la = _input.LA(1);
			if ( !(_la==STRING_LITERAL || _la==COLUMN_LITERAL) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class DottedIdContext extends ParserRuleContext {
		public TerminalNode DOT_ID() { return getToken(SQLParser.DOT_ID, 0); }
		public TerminalNode DOT() { return getToken(SQLParser.DOT, 0); }
		public UidContext uid() {
			return getRuleContext(UidContext.class,0);
		}
		public DottedIdContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dottedId; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLParserListener ) ((SQLParserListener)listener).enterDottedId(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLParserListener ) ((SQLParserListener)listener).exitDottedId(this);
		}
	}

	public final DottedIdContext dottedId() throws RecognitionException {
		DottedIdContext _localctx = new DottedIdContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_dottedId);
		try {
			setState(375);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case DOT_ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(372);
				match(DOT_ID);
				}
				break;
			case DOT:
				enterOuterAlt(_localctx, 2);
				{
				setState(373);
				match(DOT);
				setState(374);
				uid();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class FullColumnNameContext extends ParserRuleContext {
		public UidContext uid() {
			return getRuleContext(UidContext.class,0);
		}
		public List<DottedIdContext> dottedId() {
			return getRuleContexts(DottedIdContext.class);
		}
		public DottedIdContext dottedId(int i) {
			return getRuleContext(DottedIdContext.class,i);
		}
		public FullColumnNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fullColumnName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLParserListener ) ((SQLParserListener)listener).enterFullColumnName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLParserListener ) ((SQLParserListener)listener).exitFullColumnName(this);
		}
	}

	public final FullColumnNameContext fullColumnName() throws RecognitionException {
		FullColumnNameContext _localctx = new FullColumnNameContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_fullColumnName);
		try {
			setState(391);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,57,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(377);
				uid();
				setState(382);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,54,_ctx) ) {
				case 1:
					{
					setState(378);
					dottedId();
					setState(380);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,53,_ctx) ) {
					case 1:
						{
						setState(379);
						dottedId();
						}
						break;
					}
					}
					break;
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(385);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,55,_ctx) ) {
				case 1:
					{
					setState(384);
					matchWildcard();
					}
					break;
				}
				setState(387);
				dottedId();
				setState(389);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,56,_ctx) ) {
				case 1:
					{
					setState(388);
					dottedId();
					}
					break;
				}
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class FunctionCallContext extends ParserRuleContext {
		public FunctionCallContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionCall; }
	 
		public FunctionCallContext() { }
		public void copyFrom(FunctionCallContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class SpecificFunctionCallContext extends FunctionCallContext {
		public SpecificFunctionContext specificFunction() {
			return getRuleContext(SpecificFunctionContext.class,0);
		}
		public SpecificFunctionCallContext(FunctionCallContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLParserListener ) ((SQLParserListener)listener).enterSpecificFunctionCall(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLParserListener ) ((SQLParserListener)listener).exitSpecificFunctionCall(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class AggregateFunctionCallContext extends FunctionCallContext {
		public AggregateFunctionContext aggregateFunction() {
			return getRuleContext(AggregateFunctionContext.class,0);
		}
		public AggregateFunctionCallContext(FunctionCallContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLParserListener ) ((SQLParserListener)listener).enterAggregateFunctionCall(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLParserListener ) ((SQLParserListener)listener).exitAggregateFunctionCall(this);
		}
	}

	public final FunctionCallContext functionCall() throws RecognitionException {
		FunctionCallContext _localctx = new FunctionCallContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_functionCall);
		try {
			setState(395);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,58,_ctx) ) {
			case 1:
				_localctx = new SpecificFunctionCallContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(393);
				specificFunction();
				}
				break;
			case 2:
				_localctx = new AggregateFunctionCallContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(394);
				aggregateFunction();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class SpecificFunctionContext extends ParserRuleContext {
		public ScalarFunctionNameContext scalarFunctionName() {
			return getRuleContext(ScalarFunctionNameContext.class,0);
		}
		public TerminalNode LR_BRACKET() { return getToken(SQLParser.LR_BRACKET, 0); }
		public TerminalNode RR_BRACKET() { return getToken(SQLParser.RR_BRACKET, 0); }
		public FunctionArgsContext functionArgs() {
			return getRuleContext(FunctionArgsContext.class,0);
		}
		public SpecificFunctionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_specificFunction; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLParserListener ) ((SQLParserListener)listener).enterSpecificFunction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLParserListener ) ((SQLParserListener)listener).exitSpecificFunction(this);
		}
	}

	public final SpecificFunctionContext specificFunction() throws RecognitionException {
		SpecificFunctionContext _localctx = new SpecificFunctionContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_specificFunction);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(397);
			scalarFunctionName();
			setState(398);
			match(LR_BRACKET);
			setState(400);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,59,_ctx) ) {
			case 1:
				{
				setState(399);
				functionArgs();
				}
				break;
			}
			setState(402);
			match(RR_BRACKET);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class AggregateFunctionContext extends ParserRuleContext {
		public Token aggregator;
		public Token separator;
		public TerminalNode LR_BRACKET() { return getToken(SQLParser.LR_BRACKET, 0); }
		public FunctionArgContext functionArg() {
			return getRuleContext(FunctionArgContext.class,0);
		}
		public TerminalNode RR_BRACKET() { return getToken(SQLParser.RR_BRACKET, 0); }
		public TerminalNode AVG() { return getToken(SQLParser.AVG, 0); }
		public TerminalNode MAX() { return getToken(SQLParser.MAX, 0); }
		public TerminalNode MIN() { return getToken(SQLParser.MIN, 0); }
		public TerminalNode SUM() { return getToken(SQLParser.SUM, 0); }
		public TerminalNode ALL() { return getToken(SQLParser.ALL, 0); }
		public TerminalNode DISTINCT() { return getToken(SQLParser.DISTINCT, 0); }
		public TerminalNode COUNT() { return getToken(SQLParser.COUNT, 0); }
		public TerminalNode STAR() { return getToken(SQLParser.STAR, 0); }
		public TerminalNode GROUP_CONCAT() { return getToken(SQLParser.GROUP_CONCAT, 0); }
		public FunctionArgsContext functionArgs() {
			return getRuleContext(FunctionArgsContext.class,0);
		}
		public TerminalNode ORDER() { return getToken(SQLParser.ORDER, 0); }
		public TerminalNode BY() { return getToken(SQLParser.BY, 0); }
		public List<OrderByExpressionContext> orderByExpression() {
			return getRuleContexts(OrderByExpressionContext.class);
		}
		public OrderByExpressionContext orderByExpression(int i) {
			return getRuleContext(OrderByExpressionContext.class,i);
		}
		public TerminalNode SEPARATOR() { return getToken(SQLParser.SEPARATOR, 0); }
		public TerminalNode STRING_LITERAL() { return getToken(SQLParser.STRING_LITERAL, 0); }
		public List<TerminalNode> COMMA() { return getTokens(SQLParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(SQLParser.COMMA, i);
		}
		public AggregateFunctionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_aggregateFunction; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLParserListener ) ((SQLParserListener)listener).enterAggregateFunction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLParserListener ) ((SQLParserListener)listener).exitAggregateFunction(this);
		}
	}

	public final AggregateFunctionContext aggregateFunction() throws RecognitionException {
		AggregateFunctionContext _localctx = new AggregateFunctionContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_aggregateFunction);
		int _la;
		try {
			setState(443);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case AVG:
			case MAX:
			case MIN:
			case SUM:
				enterOuterAlt(_localctx, 1);
				{
				setState(404);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 249108103168L) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(405);
				match(LR_BRACKET);
				setState(407);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,60,_ctx) ) {
				case 1:
					{
					setState(406);
					((AggregateFunctionContext)_localctx).aggregator = _input.LT(1);
					_la = _input.LA(1);
					if ( !(_la==ALL || _la==DISTINCT) ) {
						((AggregateFunctionContext)_localctx).aggregator = (Token)_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
					break;
				}
				setState(409);
				functionArg();
				setState(410);
				match(RR_BRACKET);
				}
				break;
			case COUNT:
				enterOuterAlt(_localctx, 2);
				{
				setState(412);
				match(COUNT);
				setState(413);
				match(LR_BRACKET);
				setState(416);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,61,_ctx) ) {
				case 1:
					{
					setState(414);
					match(STAR);
					}
					break;
				case 2:
					{
					setState(415);
					functionArg();
					}
					break;
				}
				setState(418);
				match(RR_BRACKET);
				}
				break;
			case GROUP_CONCAT:
				enterOuterAlt(_localctx, 3);
				{
				setState(419);
				match(GROUP_CONCAT);
				setState(420);
				match(LR_BRACKET);
				setState(422);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,62,_ctx) ) {
				case 1:
					{
					setState(421);
					((AggregateFunctionContext)_localctx).aggregator = match(DISTINCT);
					}
					break;
				}
				setState(424);
				functionArgs();
				setState(435);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ORDER) {
					{
					setState(425);
					match(ORDER);
					setState(426);
					match(BY);
					setState(427);
					orderByExpression();
					setState(432);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==COMMA) {
						{
						{
						setState(428);
						match(COMMA);
						setState(429);
						orderByExpression();
						}
						}
						setState(434);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(439);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==SEPARATOR) {
					{
					setState(437);
					match(SEPARATOR);
					setState(438);
					((AggregateFunctionContext)_localctx).separator = match(STRING_LITERAL);
					}
				}

				setState(441);
				match(RR_BRACKET);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ScalarFunctionNameContext extends ParserRuleContext {
		public FunctionNameBaseContext functionNameBase() {
			return getRuleContext(FunctionNameBaseContext.class,0);
		}
		public TerminalNode ASCII() { return getToken(SQLParser.ASCII, 0); }
		public TerminalNode CURDATE() { return getToken(SQLParser.CURDATE, 0); }
		public TerminalNode CURRENT_DATE() { return getToken(SQLParser.CURRENT_DATE, 0); }
		public TerminalNode CURRENT_TIME() { return getToken(SQLParser.CURRENT_TIME, 0); }
		public TerminalNode CURRENT_TIMESTAMP() { return getToken(SQLParser.CURRENT_TIMESTAMP, 0); }
		public TerminalNode CURTIME() { return getToken(SQLParser.CURTIME, 0); }
		public TerminalNode DATE_ADD() { return getToken(SQLParser.DATE_ADD, 0); }
		public TerminalNode DATE_SUB() { return getToken(SQLParser.DATE_SUB, 0); }
		public TerminalNode IF() { return getToken(SQLParser.IF, 0); }
		public TerminalNode LOCALTIME() { return getToken(SQLParser.LOCALTIME, 0); }
		public TerminalNode LOCALTIMESTAMP() { return getToken(SQLParser.LOCALTIMESTAMP, 0); }
		public TerminalNode MID() { return getToken(SQLParser.MID, 0); }
		public TerminalNode NOW() { return getToken(SQLParser.NOW, 0); }
		public TerminalNode REPEAT() { return getToken(SQLParser.REPEAT, 0); }
		public TerminalNode REPLACE() { return getToken(SQLParser.REPLACE, 0); }
		public TerminalNode SUBSTR() { return getToken(SQLParser.SUBSTR, 0); }
		public TerminalNode SUBSTRING() { return getToken(SQLParser.SUBSTRING, 0); }
		public TerminalNode SYSDATE() { return getToken(SQLParser.SYSDATE, 0); }
		public TerminalNode TRIM() { return getToken(SQLParser.TRIM, 0); }
		public TerminalNode UTC_DATE() { return getToken(SQLParser.UTC_DATE, 0); }
		public TerminalNode UTC_TIME() { return getToken(SQLParser.UTC_TIME, 0); }
		public TerminalNode UTC_TIMESTAMP() { return getToken(SQLParser.UTC_TIMESTAMP, 0); }
		public ScalarFunctionNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_scalarFunctionName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLParserListener ) ((SQLParserListener)listener).enterScalarFunctionName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLParserListener ) ((SQLParserListener)listener).exitScalarFunctionName(this);
		}
	}

	public final ScalarFunctionNameContext scalarFunctionName() throws RecognitionException {
		ScalarFunctionNameContext _localctx = new ScalarFunctionNameContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_scalarFunctionName);
		try {
			setState(468);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IFNULL:
			case LEFT:
			case RIGHT:
			case STDDEV:
			case STDDEV_POP:
			case STDDEV_SAMP:
			case COUNT:
			case ABS:
			case ACOS:
			case ADDDATE:
			case ADDTIME:
			case AREA:
			case ASBINARY:
			case ASIN:
			case ASTEXT:
			case ASWKB:
			case ASWKT:
			case ATAN:
			case ATAN2:
			case BENCHMARK:
			case BIN:
			case BIT_COUNT:
			case BIT_LENGTH:
			case BUFFER:
			case CEIL:
			case CEILING:
			case CENTROID:
			case CHARACTER_LENGTH:
			case CHARSET:
			case CHAR_LENGTH:
			case COERCIBILITY:
			case COLLATION:
			case COMPRESS:
			case CONCAT:
			case CONCAT_WS:
			case CONNECTION_ID:
			case CONV:
			case CONVERT_TZ:
			case COS:
			case COT:
			case CUME_DIST:
			case DATABASE:
			case DATE:
			case DATEDIFF:
			case DATE_FORMAT:
			case DAY:
			case DAYNAME:
			case DAYOFMONTH:
			case DAYOFWEEK:
			case DAYOFYEAR:
			case DECODE:
			case DEGREES:
			case DENSE_RANK:
			case DES_DECRYPT:
			case DES_ENCRYPT:
			case DIMENSION:
			case DISJOINT:
			case ELT:
			case ENCODE:
			case ENCRYPT:
			case ENDPOINT:
			case ENVELOPE:
			case EQUALS:
			case EXP:
			case EXPORT_SET:
			case EXTERIORRING:
			case EXTRACTVALUE:
			case FIELD:
			case FIND_IN_SET:
			case FIRST_VALUE:
			case FLOOR:
			case FORMAT:
			case FOUND_ROWS:
			case FROM_BASE64:
			case FROM_DAYS:
			case FROM_UNIXTIME:
			case GLENGTH:
			case GREATEST:
			case GTID_SUBSET:
			case GTID_SUBTRACT:
			case HEX:
			case HOUR:
			case INET6_ATON:
			case INET6_NTOA:
			case INET_ATON:
			case INET_NTOA:
			case INSTR:
			case INTERIORRINGN:
			case INTERSECTS:
			case INVISIBLE:
			case ISCLOSED:
			case ISEMPTY:
			case ISNULL:
			case ISSIMPLE:
			case IS_FREE_LOCK:
			case IS_IPV4:
			case IS_IPV4_COMPAT:
			case IS_IPV4_MAPPED:
			case IS_IPV6:
			case IS_USED_LOCK:
			case LAG:
			case LAST_INSERT_ID:
			case LAST_VALUE:
			case LCASE:
			case LEAD:
			case LEAST:
			case LENGTH:
			case LINEFROMTEXT:
			case LINEFROMWKB:
			case LINESTRING:
			case LINESTRINGFROMTEXT:
			case LINESTRINGFROMWKB:
			case LN:
			case LOAD_FILE:
			case LOCATE:
			case LOG:
			case LOG10:
			case LOG2:
			case LOWER:
			case LPAD:
			case LTRIM:
			case MAKEDATE:
			case MAKETIME:
			case MAKE_SET:
			case MASTER_POS_WAIT:
			case MBRCONTAINS:
			case MBRDISJOINT:
			case MBREQUAL:
			case MBRINTERSECTS:
			case MBROVERLAPS:
			case MBRTOUCHES:
			case MBRWITHIN:
			case MICROSECOND:
			case MINUTE:
			case MLINEFROMTEXT:
			case MLINEFROMWKB:
			case MOD:
			case MONTH:
			case MONTHNAME:
			case NAME_CONST:
			case NTH_VALUE:
			case NTILE:
			case NULLIF:
			case NUMGEOMETRIES:
			case NUMINTERIORRINGS:
			case NUMPOINTS:
			case OCT:
			case OCTET_LENGTH:
			case ORD:
			case OVERLAPS:
			case PERCENT_RANK:
			case PERIOD_ADD:
			case PERIOD_DIFF:
			case PI:
			case POSITION:
			case POW:
			case POWER:
			case QUARTER:
			case QUOTE:
			case RADIANS:
			case RAND:
			case RANDOM:
			case RANK:
			case RANDOM_BYTES:
			case RELEASE_LOCK:
			case REVERSE:
			case ROUND:
			case ROW_COUNT:
			case ROW_NUMBER:
			case RPAD:
			case RTRIM:
			case SCHEMA:
			case SECOND:
			case SEC_TO_TIME:
			case SIGN:
			case SIN:
			case SOUNDEX:
			case SQRT:
			case SRID:
			case STRCMP:
			case STR_TO_DATE:
			case SUBDATE:
			case SUBSTRING_INDEX:
			case SUBTIME:
			case SYSTEM_USER:
			case TAN:
			case TIME:
			case TIMEDIFF:
			case TIMESTAMP:
			case TIMESTAMPADD:
			case TIMESTAMPDIFF:
			case TIME_FORMAT:
			case TIME_TO_SEC:
			case TOUCHES:
			case TO_BASE64:
			case TO_DAYS:
			case TO_SECONDS:
			case UCASE:
			case UNCOMPRESS:
			case UNCOMPRESSED_LENGTH:
			case UNHEX:
			case UNIX_TIMESTAMP:
			case UPDATEXML:
			case UPPER:
			case UUID:
			case UUID_SHORT:
			case VALIDATE_PASSWORD_STRENGTH:
			case VERSION:
			case VISIBLE:
			case WAIT_UNTIL_SQL_THREAD_AFTER_GTIDS:
			case WEEK:
			case WEEKDAY:
			case WEEKOFYEAR:
			case WEIGHT_STRING:
			case WITHIN:
			case YEAR:
			case YEARWEEK:
				enterOuterAlt(_localctx, 1);
				{
				setState(445);
				functionNameBase();
				}
				break;
			case ASCII:
				enterOuterAlt(_localctx, 2);
				{
				setState(446);
				match(ASCII);
				}
				break;
			case CURDATE:
				enterOuterAlt(_localctx, 3);
				{
				setState(447);
				match(CURDATE);
				}
				break;
			case CURRENT_DATE:
				enterOuterAlt(_localctx, 4);
				{
				setState(448);
				match(CURRENT_DATE);
				}
				break;
			case CURRENT_TIME:
				enterOuterAlt(_localctx, 5);
				{
				setState(449);
				match(CURRENT_TIME);
				}
				break;
			case CURRENT_TIMESTAMP:
				enterOuterAlt(_localctx, 6);
				{
				setState(450);
				match(CURRENT_TIMESTAMP);
				}
				break;
			case CURTIME:
				enterOuterAlt(_localctx, 7);
				{
				setState(451);
				match(CURTIME);
				}
				break;
			case DATE_ADD:
				enterOuterAlt(_localctx, 8);
				{
				setState(452);
				match(DATE_ADD);
				}
				break;
			case DATE_SUB:
				enterOuterAlt(_localctx, 9);
				{
				setState(453);
				match(DATE_SUB);
				}
				break;
			case IF:
				enterOuterAlt(_localctx, 10);
				{
				setState(454);
				match(IF);
				}
				break;
			case LOCALTIME:
				enterOuterAlt(_localctx, 11);
				{
				setState(455);
				match(LOCALTIME);
				}
				break;
			case LOCALTIMESTAMP:
				enterOuterAlt(_localctx, 12);
				{
				setState(456);
				match(LOCALTIMESTAMP);
				}
				break;
			case MID:
				enterOuterAlt(_localctx, 13);
				{
				setState(457);
				match(MID);
				}
				break;
			case NOW:
				enterOuterAlt(_localctx, 14);
				{
				setState(458);
				match(NOW);
				}
				break;
			case REPEAT:
				enterOuterAlt(_localctx, 15);
				{
				setState(459);
				match(REPEAT);
				}
				break;
			case REPLACE:
				enterOuterAlt(_localctx, 16);
				{
				setState(460);
				match(REPLACE);
				}
				break;
			case SUBSTR:
				enterOuterAlt(_localctx, 17);
				{
				setState(461);
				match(SUBSTR);
				}
				break;
			case SUBSTRING:
				enterOuterAlt(_localctx, 18);
				{
				setState(462);
				match(SUBSTRING);
				}
				break;
			case SYSDATE:
				enterOuterAlt(_localctx, 19);
				{
				setState(463);
				match(SYSDATE);
				}
				break;
			case TRIM:
				enterOuterAlt(_localctx, 20);
				{
				setState(464);
				match(TRIM);
				}
				break;
			case UTC_DATE:
				enterOuterAlt(_localctx, 21);
				{
				setState(465);
				match(UTC_DATE);
				}
				break;
			case UTC_TIME:
				enterOuterAlt(_localctx, 22);
				{
				setState(466);
				match(UTC_TIME);
				}
				break;
			case UTC_TIMESTAMP:
				enterOuterAlt(_localctx, 23);
				{
				setState(467);
				match(UTC_TIMESTAMP);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class FunctionNameBaseContext extends ParserRuleContext {
		public TerminalNode ABS() { return getToken(SQLParser.ABS, 0); }
		public TerminalNode ACOS() { return getToken(SQLParser.ACOS, 0); }
		public TerminalNode ADDDATE() { return getToken(SQLParser.ADDDATE, 0); }
		public TerminalNode ADDTIME() { return getToken(SQLParser.ADDTIME, 0); }
		public TerminalNode AREA() { return getToken(SQLParser.AREA, 0); }
		public TerminalNode ASBINARY() { return getToken(SQLParser.ASBINARY, 0); }
		public TerminalNode ASIN() { return getToken(SQLParser.ASIN, 0); }
		public TerminalNode ASTEXT() { return getToken(SQLParser.ASTEXT, 0); }
		public TerminalNode ASWKB() { return getToken(SQLParser.ASWKB, 0); }
		public TerminalNode ASWKT() { return getToken(SQLParser.ASWKT, 0); }
		public TerminalNode ATAN() { return getToken(SQLParser.ATAN, 0); }
		public TerminalNode ATAN2() { return getToken(SQLParser.ATAN2, 0); }
		public TerminalNode BENCHMARK() { return getToken(SQLParser.BENCHMARK, 0); }
		public TerminalNode BIN() { return getToken(SQLParser.BIN, 0); }
		public TerminalNode BIT_COUNT() { return getToken(SQLParser.BIT_COUNT, 0); }
		public TerminalNode BIT_LENGTH() { return getToken(SQLParser.BIT_LENGTH, 0); }
		public TerminalNode BUFFER() { return getToken(SQLParser.BUFFER, 0); }
		public TerminalNode CEIL() { return getToken(SQLParser.CEIL, 0); }
		public TerminalNode CEILING() { return getToken(SQLParser.CEILING, 0); }
		public TerminalNode CENTROID() { return getToken(SQLParser.CENTROID, 0); }
		public TerminalNode CHARACTER_LENGTH() { return getToken(SQLParser.CHARACTER_LENGTH, 0); }
		public TerminalNode CHARSET() { return getToken(SQLParser.CHARSET, 0); }
		public TerminalNode CHAR_LENGTH() { return getToken(SQLParser.CHAR_LENGTH, 0); }
		public TerminalNode COERCIBILITY() { return getToken(SQLParser.COERCIBILITY, 0); }
		public TerminalNode COLLATION() { return getToken(SQLParser.COLLATION, 0); }
		public TerminalNode COMPRESS() { return getToken(SQLParser.COMPRESS, 0); }
		public TerminalNode CONCAT() { return getToken(SQLParser.CONCAT, 0); }
		public TerminalNode CONCAT_WS() { return getToken(SQLParser.CONCAT_WS, 0); }
		public TerminalNode CONNECTION_ID() { return getToken(SQLParser.CONNECTION_ID, 0); }
		public TerminalNode CONV() { return getToken(SQLParser.CONV, 0); }
		public TerminalNode CONVERT_TZ() { return getToken(SQLParser.CONVERT_TZ, 0); }
		public TerminalNode COS() { return getToken(SQLParser.COS, 0); }
		public TerminalNode COT() { return getToken(SQLParser.COT, 0); }
		public TerminalNode COUNT() { return getToken(SQLParser.COUNT, 0); }
		public TerminalNode CUME_DIST() { return getToken(SQLParser.CUME_DIST, 0); }
		public TerminalNode DATABASE() { return getToken(SQLParser.DATABASE, 0); }
		public TerminalNode DATE() { return getToken(SQLParser.DATE, 0); }
		public TerminalNode DATEDIFF() { return getToken(SQLParser.DATEDIFF, 0); }
		public TerminalNode DATE_FORMAT() { return getToken(SQLParser.DATE_FORMAT, 0); }
		public TerminalNode DAY() { return getToken(SQLParser.DAY, 0); }
		public TerminalNode DAYNAME() { return getToken(SQLParser.DAYNAME, 0); }
		public TerminalNode DAYOFMONTH() { return getToken(SQLParser.DAYOFMONTH, 0); }
		public TerminalNode DAYOFWEEK() { return getToken(SQLParser.DAYOFWEEK, 0); }
		public TerminalNode DAYOFYEAR() { return getToken(SQLParser.DAYOFYEAR, 0); }
		public TerminalNode DECODE() { return getToken(SQLParser.DECODE, 0); }
		public TerminalNode DEGREES() { return getToken(SQLParser.DEGREES, 0); }
		public TerminalNode DENSE_RANK() { return getToken(SQLParser.DENSE_RANK, 0); }
		public TerminalNode DES_DECRYPT() { return getToken(SQLParser.DES_DECRYPT, 0); }
		public TerminalNode DES_ENCRYPT() { return getToken(SQLParser.DES_ENCRYPT, 0); }
		public TerminalNode DIMENSION() { return getToken(SQLParser.DIMENSION, 0); }
		public TerminalNode DISJOINT() { return getToken(SQLParser.DISJOINT, 0); }
		public TerminalNode ELT() { return getToken(SQLParser.ELT, 0); }
		public TerminalNode ENCODE() { return getToken(SQLParser.ENCODE, 0); }
		public TerminalNode ENCRYPT() { return getToken(SQLParser.ENCRYPT, 0); }
		public TerminalNode ENDPOINT() { return getToken(SQLParser.ENDPOINT, 0); }
		public TerminalNode ENVELOPE() { return getToken(SQLParser.ENVELOPE, 0); }
		public TerminalNode EQUALS() { return getToken(SQLParser.EQUALS, 0); }
		public TerminalNode EXP() { return getToken(SQLParser.EXP, 0); }
		public TerminalNode EXPORT_SET() { return getToken(SQLParser.EXPORT_SET, 0); }
		public TerminalNode EXTERIORRING() { return getToken(SQLParser.EXTERIORRING, 0); }
		public TerminalNode EXTRACTVALUE() { return getToken(SQLParser.EXTRACTVALUE, 0); }
		public TerminalNode FIELD() { return getToken(SQLParser.FIELD, 0); }
		public TerminalNode FIND_IN_SET() { return getToken(SQLParser.FIND_IN_SET, 0); }
		public TerminalNode FIRST_VALUE() { return getToken(SQLParser.FIRST_VALUE, 0); }
		public TerminalNode FLOOR() { return getToken(SQLParser.FLOOR, 0); }
		public TerminalNode FORMAT() { return getToken(SQLParser.FORMAT, 0); }
		public TerminalNode FOUND_ROWS() { return getToken(SQLParser.FOUND_ROWS, 0); }
		public TerminalNode FROM_BASE64() { return getToken(SQLParser.FROM_BASE64, 0); }
		public TerminalNode FROM_DAYS() { return getToken(SQLParser.FROM_DAYS, 0); }
		public TerminalNode FROM_UNIXTIME() { return getToken(SQLParser.FROM_UNIXTIME, 0); }
		public TerminalNode GLENGTH() { return getToken(SQLParser.GLENGTH, 0); }
		public TerminalNode GREATEST() { return getToken(SQLParser.GREATEST, 0); }
		public TerminalNode GTID_SUBSET() { return getToken(SQLParser.GTID_SUBSET, 0); }
		public TerminalNode GTID_SUBTRACT() { return getToken(SQLParser.GTID_SUBTRACT, 0); }
		public TerminalNode HEX() { return getToken(SQLParser.HEX, 0); }
		public TerminalNode HOUR() { return getToken(SQLParser.HOUR, 0); }
		public TerminalNode IFNULL() { return getToken(SQLParser.IFNULL, 0); }
		public TerminalNode INET6_ATON() { return getToken(SQLParser.INET6_ATON, 0); }
		public TerminalNode INET6_NTOA() { return getToken(SQLParser.INET6_NTOA, 0); }
		public TerminalNode INET_ATON() { return getToken(SQLParser.INET_ATON, 0); }
		public TerminalNode INET_NTOA() { return getToken(SQLParser.INET_NTOA, 0); }
		public TerminalNode INSTR() { return getToken(SQLParser.INSTR, 0); }
		public TerminalNode INTERIORRINGN() { return getToken(SQLParser.INTERIORRINGN, 0); }
		public TerminalNode INTERSECTS() { return getToken(SQLParser.INTERSECTS, 0); }
		public TerminalNode INVISIBLE() { return getToken(SQLParser.INVISIBLE, 0); }
		public TerminalNode ISCLOSED() { return getToken(SQLParser.ISCLOSED, 0); }
		public TerminalNode ISEMPTY() { return getToken(SQLParser.ISEMPTY, 0); }
		public TerminalNode ISNULL() { return getToken(SQLParser.ISNULL, 0); }
		public TerminalNode ISSIMPLE() { return getToken(SQLParser.ISSIMPLE, 0); }
		public TerminalNode IS_FREE_LOCK() { return getToken(SQLParser.IS_FREE_LOCK, 0); }
		public TerminalNode IS_IPV4() { return getToken(SQLParser.IS_IPV4, 0); }
		public TerminalNode IS_IPV4_COMPAT() { return getToken(SQLParser.IS_IPV4_COMPAT, 0); }
		public TerminalNode IS_IPV4_MAPPED() { return getToken(SQLParser.IS_IPV4_MAPPED, 0); }
		public TerminalNode IS_IPV6() { return getToken(SQLParser.IS_IPV6, 0); }
		public TerminalNode IS_USED_LOCK() { return getToken(SQLParser.IS_USED_LOCK, 0); }
		public TerminalNode LAG() { return getToken(SQLParser.LAG, 0); }
		public TerminalNode LAST_INSERT_ID() { return getToken(SQLParser.LAST_INSERT_ID, 0); }
		public TerminalNode LAST_VALUE() { return getToken(SQLParser.LAST_VALUE, 0); }
		public TerminalNode LCASE() { return getToken(SQLParser.LCASE, 0); }
		public TerminalNode LEAD() { return getToken(SQLParser.LEAD, 0); }
		public TerminalNode LEAST() { return getToken(SQLParser.LEAST, 0); }
		public TerminalNode LEFT() { return getToken(SQLParser.LEFT, 0); }
		public TerminalNode LENGTH() { return getToken(SQLParser.LENGTH, 0); }
		public TerminalNode LINEFROMTEXT() { return getToken(SQLParser.LINEFROMTEXT, 0); }
		public TerminalNode LINEFROMWKB() { return getToken(SQLParser.LINEFROMWKB, 0); }
		public TerminalNode LINESTRING() { return getToken(SQLParser.LINESTRING, 0); }
		public TerminalNode LINESTRINGFROMTEXT() { return getToken(SQLParser.LINESTRINGFROMTEXT, 0); }
		public TerminalNode LINESTRINGFROMWKB() { return getToken(SQLParser.LINESTRINGFROMWKB, 0); }
		public TerminalNode LN() { return getToken(SQLParser.LN, 0); }
		public TerminalNode LOAD_FILE() { return getToken(SQLParser.LOAD_FILE, 0); }
		public TerminalNode LOCATE() { return getToken(SQLParser.LOCATE, 0); }
		public TerminalNode LOG() { return getToken(SQLParser.LOG, 0); }
		public TerminalNode LOG10() { return getToken(SQLParser.LOG10, 0); }
		public TerminalNode LOG2() { return getToken(SQLParser.LOG2, 0); }
		public TerminalNode LOWER() { return getToken(SQLParser.LOWER, 0); }
		public TerminalNode LPAD() { return getToken(SQLParser.LPAD, 0); }
		public TerminalNode LTRIM() { return getToken(SQLParser.LTRIM, 0); }
		public TerminalNode MAKEDATE() { return getToken(SQLParser.MAKEDATE, 0); }
		public TerminalNode MAKETIME() { return getToken(SQLParser.MAKETIME, 0); }
		public TerminalNode MAKE_SET() { return getToken(SQLParser.MAKE_SET, 0); }
		public TerminalNode MASTER_POS_WAIT() { return getToken(SQLParser.MASTER_POS_WAIT, 0); }
		public TerminalNode MBRCONTAINS() { return getToken(SQLParser.MBRCONTAINS, 0); }
		public TerminalNode MBRDISJOINT() { return getToken(SQLParser.MBRDISJOINT, 0); }
		public TerminalNode MBREQUAL() { return getToken(SQLParser.MBREQUAL, 0); }
		public TerminalNode MBRINTERSECTS() { return getToken(SQLParser.MBRINTERSECTS, 0); }
		public TerminalNode MBROVERLAPS() { return getToken(SQLParser.MBROVERLAPS, 0); }
		public TerminalNode MBRTOUCHES() { return getToken(SQLParser.MBRTOUCHES, 0); }
		public TerminalNode MBRWITHIN() { return getToken(SQLParser.MBRWITHIN, 0); }
		public TerminalNode MICROSECOND() { return getToken(SQLParser.MICROSECOND, 0); }
		public TerminalNode MINUTE() { return getToken(SQLParser.MINUTE, 0); }
		public TerminalNode MLINEFROMTEXT() { return getToken(SQLParser.MLINEFROMTEXT, 0); }
		public TerminalNode MLINEFROMWKB() { return getToken(SQLParser.MLINEFROMWKB, 0); }
		public TerminalNode MOD() { return getToken(SQLParser.MOD, 0); }
		public TerminalNode MONTH() { return getToken(SQLParser.MONTH, 0); }
		public TerminalNode MONTHNAME() { return getToken(SQLParser.MONTHNAME, 0); }
		public TerminalNode NAME_CONST() { return getToken(SQLParser.NAME_CONST, 0); }
		public TerminalNode NTH_VALUE() { return getToken(SQLParser.NTH_VALUE, 0); }
		public TerminalNode NTILE() { return getToken(SQLParser.NTILE, 0); }
		public TerminalNode NULLIF() { return getToken(SQLParser.NULLIF, 0); }
		public TerminalNode NUMGEOMETRIES() { return getToken(SQLParser.NUMGEOMETRIES, 0); }
		public TerminalNode NUMINTERIORRINGS() { return getToken(SQLParser.NUMINTERIORRINGS, 0); }
		public TerminalNode NUMPOINTS() { return getToken(SQLParser.NUMPOINTS, 0); }
		public TerminalNode OCT() { return getToken(SQLParser.OCT, 0); }
		public TerminalNode OCTET_LENGTH() { return getToken(SQLParser.OCTET_LENGTH, 0); }
		public TerminalNode ORD() { return getToken(SQLParser.ORD, 0); }
		public TerminalNode OVERLAPS() { return getToken(SQLParser.OVERLAPS, 0); }
		public TerminalNode PERCENT_RANK() { return getToken(SQLParser.PERCENT_RANK, 0); }
		public TerminalNode PERIOD_ADD() { return getToken(SQLParser.PERIOD_ADD, 0); }
		public TerminalNode PERIOD_DIFF() { return getToken(SQLParser.PERIOD_DIFF, 0); }
		public TerminalNode PI() { return getToken(SQLParser.PI, 0); }
		public TerminalNode POSITION() { return getToken(SQLParser.POSITION, 0); }
		public TerminalNode POW() { return getToken(SQLParser.POW, 0); }
		public TerminalNode POWER() { return getToken(SQLParser.POWER, 0); }
		public TerminalNode QUARTER() { return getToken(SQLParser.QUARTER, 0); }
		public TerminalNode QUOTE() { return getToken(SQLParser.QUOTE, 0); }
		public TerminalNode RADIANS() { return getToken(SQLParser.RADIANS, 0); }
		public TerminalNode RAND() { return getToken(SQLParser.RAND, 0); }
		public TerminalNode RANDOM() { return getToken(SQLParser.RANDOM, 0); }
		public TerminalNode RANK() { return getToken(SQLParser.RANK, 0); }
		public TerminalNode RANDOM_BYTES() { return getToken(SQLParser.RANDOM_BYTES, 0); }
		public TerminalNode RELEASE_LOCK() { return getToken(SQLParser.RELEASE_LOCK, 0); }
		public TerminalNode REVERSE() { return getToken(SQLParser.REVERSE, 0); }
		public TerminalNode RIGHT() { return getToken(SQLParser.RIGHT, 0); }
		public TerminalNode ROUND() { return getToken(SQLParser.ROUND, 0); }
		public TerminalNode ROW_COUNT() { return getToken(SQLParser.ROW_COUNT, 0); }
		public TerminalNode ROW_NUMBER() { return getToken(SQLParser.ROW_NUMBER, 0); }
		public TerminalNode RPAD() { return getToken(SQLParser.RPAD, 0); }
		public TerminalNode RTRIM() { return getToken(SQLParser.RTRIM, 0); }
		public TerminalNode SCHEMA() { return getToken(SQLParser.SCHEMA, 0); }
		public TerminalNode SECOND() { return getToken(SQLParser.SECOND, 0); }
		public TerminalNode SEC_TO_TIME() { return getToken(SQLParser.SEC_TO_TIME, 0); }
		public TerminalNode SIGN() { return getToken(SQLParser.SIGN, 0); }
		public TerminalNode SIN() { return getToken(SQLParser.SIN, 0); }
		public TerminalNode SOUNDEX() { return getToken(SQLParser.SOUNDEX, 0); }
		public TerminalNode SQRT() { return getToken(SQLParser.SQRT, 0); }
		public TerminalNode SRID() { return getToken(SQLParser.SRID, 0); }
		public TerminalNode STDDEV() { return getToken(SQLParser.STDDEV, 0); }
		public TerminalNode STDDEV_POP() { return getToken(SQLParser.STDDEV_POP, 0); }
		public TerminalNode STDDEV_SAMP() { return getToken(SQLParser.STDDEV_SAMP, 0); }
		public TerminalNode STRCMP() { return getToken(SQLParser.STRCMP, 0); }
		public TerminalNode STR_TO_DATE() { return getToken(SQLParser.STR_TO_DATE, 0); }
		public TerminalNode SUBDATE() { return getToken(SQLParser.SUBDATE, 0); }
		public TerminalNode SUBSTRING_INDEX() { return getToken(SQLParser.SUBSTRING_INDEX, 0); }
		public TerminalNode SUBTIME() { return getToken(SQLParser.SUBTIME, 0); }
		public TerminalNode SYSTEM_USER() { return getToken(SQLParser.SYSTEM_USER, 0); }
		public TerminalNode TAN() { return getToken(SQLParser.TAN, 0); }
		public TerminalNode TIME() { return getToken(SQLParser.TIME, 0); }
		public TerminalNode TIMEDIFF() { return getToken(SQLParser.TIMEDIFF, 0); }
		public TerminalNode TIMESTAMP() { return getToken(SQLParser.TIMESTAMP, 0); }
		public TerminalNode TIMESTAMPADD() { return getToken(SQLParser.TIMESTAMPADD, 0); }
		public TerminalNode TIMESTAMPDIFF() { return getToken(SQLParser.TIMESTAMPDIFF, 0); }
		public TerminalNode TIME_FORMAT() { return getToken(SQLParser.TIME_FORMAT, 0); }
		public TerminalNode TIME_TO_SEC() { return getToken(SQLParser.TIME_TO_SEC, 0); }
		public TerminalNode TOUCHES() { return getToken(SQLParser.TOUCHES, 0); }
		public TerminalNode TO_BASE64() { return getToken(SQLParser.TO_BASE64, 0); }
		public TerminalNode TO_DAYS() { return getToken(SQLParser.TO_DAYS, 0); }
		public TerminalNode TO_SECONDS() { return getToken(SQLParser.TO_SECONDS, 0); }
		public TerminalNode UCASE() { return getToken(SQLParser.UCASE, 0); }
		public TerminalNode UNCOMPRESS() { return getToken(SQLParser.UNCOMPRESS, 0); }
		public TerminalNode UNCOMPRESSED_LENGTH() { return getToken(SQLParser.UNCOMPRESSED_LENGTH, 0); }
		public TerminalNode UNHEX() { return getToken(SQLParser.UNHEX, 0); }
		public TerminalNode UNIX_TIMESTAMP() { return getToken(SQLParser.UNIX_TIMESTAMP, 0); }
		public TerminalNode UPDATEXML() { return getToken(SQLParser.UPDATEXML, 0); }
		public TerminalNode UPPER() { return getToken(SQLParser.UPPER, 0); }
		public TerminalNode UUID() { return getToken(SQLParser.UUID, 0); }
		public TerminalNode UUID_SHORT() { return getToken(SQLParser.UUID_SHORT, 0); }
		public TerminalNode VALIDATE_PASSWORD_STRENGTH() { return getToken(SQLParser.VALIDATE_PASSWORD_STRENGTH, 0); }
		public TerminalNode VERSION() { return getToken(SQLParser.VERSION, 0); }
		public TerminalNode VISIBLE() { return getToken(SQLParser.VISIBLE, 0); }
		public TerminalNode WAIT_UNTIL_SQL_THREAD_AFTER_GTIDS() { return getToken(SQLParser.WAIT_UNTIL_SQL_THREAD_AFTER_GTIDS, 0); }
		public TerminalNode WEEK() { return getToken(SQLParser.WEEK, 0); }
		public TerminalNode WEEKDAY() { return getToken(SQLParser.WEEKDAY, 0); }
		public TerminalNode WEEKOFYEAR() { return getToken(SQLParser.WEEKOFYEAR, 0); }
		public TerminalNode WEIGHT_STRING() { return getToken(SQLParser.WEIGHT_STRING, 0); }
		public TerminalNode WITHIN() { return getToken(SQLParser.WITHIN, 0); }
		public TerminalNode YEAR() { return getToken(SQLParser.YEAR, 0); }
		public TerminalNode YEARWEEK() { return getToken(SQLParser.YEARWEEK, 0); }
		public FunctionNameBaseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionNameBase; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLParserListener ) ((SQLParserListener)listener).enterFunctionNameBase(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLParserListener ) ((SQLParserListener)listener).exitFunctionNameBase(this);
		}
	}

	public final FunctionNameBaseContext functionNameBase() throws RecognitionException {
		FunctionNameBaseContext _localctx = new FunctionNameBaseContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_functionNameBase);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(470);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 19126165504L) != 0) || ((((_la - 82)) & ~0x3f) == 0 && ((1L << (_la - 82)) & -1L) != 0) || ((((_la - 146)) & ~0x3f) == 0 && ((1L << (_la - 146)) & -1L) != 0) || ((((_la - 210)) & ~0x3f) == 0 && ((1L << (_la - 210)) & -1L) != 0) || ((((_la - 274)) & ~0x3f) == 0 && ((1L << (_la - 274)) & 262143L) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class FunctionArgsContext extends ParserRuleContext {
		public List<ConstantContext> constant() {
			return getRuleContexts(ConstantContext.class);
		}
		public ConstantContext constant(int i) {
			return getRuleContext(ConstantContext.class,i);
		}
		public List<FullColumnNameContext> fullColumnName() {
			return getRuleContexts(FullColumnNameContext.class);
		}
		public FullColumnNameContext fullColumnName(int i) {
			return getRuleContext(FullColumnNameContext.class,i);
		}
		public List<FunctionCallContext> functionCall() {
			return getRuleContexts(FunctionCallContext.class);
		}
		public FunctionCallContext functionCall(int i) {
			return getRuleContext(FunctionCallContext.class,i);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(SQLParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(SQLParser.COMMA, i);
		}
		public FunctionArgsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionArgs; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLParserListener ) ((SQLParserListener)listener).enterFunctionArgs(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLParserListener ) ((SQLParserListener)listener).exitFunctionArgs(this);
		}
	}

	public final FunctionArgsContext functionArgs() throws RecognitionException {
		FunctionArgsContext _localctx = new FunctionArgsContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_functionArgs);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(476);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,68,_ctx) ) {
			case 1:
				{
				setState(472);
				constant();
				}
				break;
			case 2:
				{
				setState(473);
				fullColumnName();
				}
				break;
			case 3:
				{
				setState(474);
				functionCall();
				}
				break;
			case 4:
				{
				setState(475);
				expression(0);
				}
				break;
			}
			setState(487);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(478);
				match(COMMA);
				setState(483);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,69,_ctx) ) {
				case 1:
					{
					setState(479);
					constant();
					}
					break;
				case 2:
					{
					setState(480);
					fullColumnName();
					}
					break;
				case 3:
					{
					setState(481);
					functionCall();
					}
					break;
				case 4:
					{
					setState(482);
					expression(0);
					}
					break;
				}
				}
				}
				setState(489);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class FunctionArgContext extends ParserRuleContext {
		public ConstantContext constant() {
			return getRuleContext(ConstantContext.class,0);
		}
		public FullColumnNameContext fullColumnName() {
			return getRuleContext(FullColumnNameContext.class,0);
		}
		public FunctionCallContext functionCall() {
			return getRuleContext(FunctionCallContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public FunctionArgContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionArg; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLParserListener ) ((SQLParserListener)listener).enterFunctionArg(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLParserListener ) ((SQLParserListener)listener).exitFunctionArg(this);
		}
	}

	public final FunctionArgContext functionArg() throws RecognitionException {
		FunctionArgContext _localctx = new FunctionArgContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_functionArg);
		try {
			setState(494);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,71,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(490);
				constant();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(491);
				fullColumnName();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(492);
				functionCall();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(493);
				expression(0);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ExpressionContext extends ParserRuleContext {
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
	 
		public ExpressionContext() { }
		public void copyFrom(ExpressionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class IsExpressionContext extends ExpressionContext {
		public Token testValue;
		public PredicateContext predicate() {
			return getRuleContext(PredicateContext.class,0);
		}
		public TerminalNode IS() { return getToken(SQLParser.IS, 0); }
		public TerminalNode TRUE() { return getToken(SQLParser.TRUE, 0); }
		public TerminalNode FALSE() { return getToken(SQLParser.FALSE, 0); }
		public TerminalNode NULL() { return getToken(SQLParser.NULL, 0); }
		public TerminalNode NOT() { return getToken(SQLParser.NOT, 0); }
		public IsExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLParserListener ) ((SQLParserListener)listener).enterIsExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLParserListener ) ((SQLParserListener)listener).exitIsExpression(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class NotExpressionContext extends ExpressionContext {
		public Token notOperator;
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode NOT() { return getToken(SQLParser.NOT, 0); }
		public TerminalNode EXCLAMATION_SYMBOL() { return getToken(SQLParser.EXCLAMATION_SYMBOL, 0); }
		public NotExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLParserListener ) ((SQLParserListener)listener).enterNotExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLParserListener ) ((SQLParserListener)listener).exitNotExpression(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class LogicalExpressionContext extends ExpressionContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public LogicalOperatorContext logicalOperator() {
			return getRuleContext(LogicalOperatorContext.class,0);
		}
		public LogicalExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLParserListener ) ((SQLParserListener)listener).enterLogicalExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLParserListener ) ((SQLParserListener)listener).exitLogicalExpression(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class PredicateExpressionContext extends ExpressionContext {
		public PredicateContext predicate() {
			return getRuleContext(PredicateContext.class,0);
		}
		public PredicateExpressionContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLParserListener ) ((SQLParserListener)listener).enterPredicateExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLParserListener ) ((SQLParserListener)listener).exitPredicateExpression(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		return expression(0);
	}

	private ExpressionContext expression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExpressionContext _localctx = new ExpressionContext(_ctx, _parentState);
		ExpressionContext _prevctx = _localctx;
		int _startState = 64;
		enterRecursionRule(_localctx, 64, RULE_expression, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(507);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,73,_ctx) ) {
			case 1:
				{
				_localctx = new NotExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(497);
				((NotExpressionContext)_localctx).notOperator = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==NOT || _la==EXCLAMATION_SYMBOL) ) {
					((NotExpressionContext)_localctx).notOperator = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(498);
				expression(4);
				}
				break;
			case 2:
				{
				_localctx = new IsExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(499);
				predicate(0);
				setState(500);
				match(IS);
				setState(502);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==NOT) {
					{
					setState(501);
					match(NOT);
					}
				}

				setState(504);
				((IsExpressionContext)_localctx).testValue = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==NULL || _la==TRUE || _la==FALSE) ) {
					((IsExpressionContext)_localctx).testValue = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				break;
			case 3:
				{
				_localctx = new PredicateExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(506);
				predicate(0);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(515);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,74,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new LogicalExpressionContext(new ExpressionContext(_parentctx, _parentState));
					pushNewRecursionContext(_localctx, _startState, RULE_expression);
					setState(509);
					if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
					setState(510);
					logicalOperator();
					setState(511);
					expression(4);
					}
					} 
				}
				setState(517);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,74,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class PredicateContext extends ParserRuleContext {
		public PredicateContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_predicate; }
	 
		public PredicateContext() { }
		public void copyFrom(PredicateContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ExpressionAtomPredicateContext extends PredicateContext {
		public ExpressionAtomContext expressionAtom() {
			return getRuleContext(ExpressionAtomContext.class,0);
		}
		public ExpressionAtomPredicateContext(PredicateContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLParserListener ) ((SQLParserListener)listener).enterExpressionAtomPredicate(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLParserListener ) ((SQLParserListener)listener).exitExpressionAtomPredicate(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class BinaryComparisonPredicateContext extends PredicateContext {
		public PredicateContext left;
		public PredicateContext right;
		public ComparisonOperatorContext comparisonOperator() {
			return getRuleContext(ComparisonOperatorContext.class,0);
		}
		public List<PredicateContext> predicate() {
			return getRuleContexts(PredicateContext.class);
		}
		public PredicateContext predicate(int i) {
			return getRuleContext(PredicateContext.class,i);
		}
		public BinaryComparisonPredicateContext(PredicateContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLParserListener ) ((SQLParserListener)listener).enterBinaryComparisonPredicate(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLParserListener ) ((SQLParserListener)listener).exitBinaryComparisonPredicate(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class BetweenPredicateContext extends PredicateContext {
		public List<PredicateContext> predicate() {
			return getRuleContexts(PredicateContext.class);
		}
		public PredicateContext predicate(int i) {
			return getRuleContext(PredicateContext.class,i);
		}
		public TerminalNode BETWEEN() { return getToken(SQLParser.BETWEEN, 0); }
		public TerminalNode AND() { return getToken(SQLParser.AND, 0); }
		public BetweenPredicateContext(PredicateContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLParserListener ) ((SQLParserListener)listener).enterBetweenPredicate(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLParserListener ) ((SQLParserListener)listener).exitBetweenPredicate(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class LikePredicateContext extends PredicateContext {
		public List<PredicateContext> predicate() {
			return getRuleContexts(PredicateContext.class);
		}
		public PredicateContext predicate(int i) {
			return getRuleContext(PredicateContext.class,i);
		}
		public TerminalNode LIKE() { return getToken(SQLParser.LIKE, 0); }
		public TerminalNode NOT() { return getToken(SQLParser.NOT, 0); }
		public List<TerminalNode> MODULE() { return getTokens(SQLParser.MODULE); }
		public TerminalNode MODULE(int i) {
			return getToken(SQLParser.MODULE, i);
		}
		public LikePredicateContext(PredicateContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLParserListener ) ((SQLParserListener)listener).enterLikePredicate(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLParserListener ) ((SQLParserListener)listener).exitLikePredicate(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class FunctionCallPredicateContext extends PredicateContext {
		public FunctionCallContext functionCall() {
			return getRuleContext(FunctionCallContext.class,0);
		}
		public FunctionCallPredicateContext(PredicateContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLParserListener ) ((SQLParserListener)listener).enterFunctionCallPredicate(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLParserListener ) ((SQLParserListener)listener).exitFunctionCallPredicate(this);
		}
	}

	public final PredicateContext predicate() throws RecognitionException {
		return predicate(0);
	}

	private PredicateContext predicate(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		PredicateContext _localctx = new PredicateContext(_ctx, _parentState);
		PredicateContext _prevctx = _localctx;
		int _startState = 66;
		enterRecursionRule(_localctx, 66, RULE_predicate, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(521);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,75,_ctx) ) {
			case 1:
				{
				_localctx = new ExpressionAtomPredicateContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(519);
				expressionAtom(0);
				}
				break;
			case 2:
				{
				_localctx = new FunctionCallPredicateContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(520);
				functionCall();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(547);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,80,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(545);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,79,_ctx) ) {
					case 1:
						{
						_localctx = new BetweenPredicateContext(new PredicateContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_predicate);
						setState(523);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(524);
						match(BETWEEN);
						setState(525);
						predicate(0);
						setState(526);
						match(AND);
						setState(527);
						predicate(5);
						}
						break;
					case 2:
						{
						_localctx = new BinaryComparisonPredicateContext(new PredicateContext(_parentctx, _parentState));
						((BinaryComparisonPredicateContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_predicate);
						setState(529);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(530);
						comparisonOperator();
						setState(531);
						((BinaryComparisonPredicateContext)_localctx).right = predicate(4);
						}
						break;
					case 3:
						{
						_localctx = new LikePredicateContext(new PredicateContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_predicate);
						setState(533);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(535);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==NOT) {
							{
							setState(534);
							match(NOT);
							}
						}

						setState(537);
						match(LIKE);
						setState(539);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,77,_ctx) ) {
						case 1:
							{
							setState(538);
							match(MODULE);
							}
							break;
						}
						setState(541);
						predicate(0);
						setState(543);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,78,_ctx) ) {
						case 1:
							{
							setState(542);
							match(MODULE);
							}
							break;
						}
						}
						break;
					}
					} 
				}
				setState(549);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,80,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ExpressionAtomContext extends ParserRuleContext {
		public ExpressionAtomContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressionAtom; }
	 
		public ExpressionAtomContext() { }
		public void copyFrom(ExpressionAtomContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class UnaryExpressionAtomContext extends ExpressionAtomContext {
		public UnaryOperatorContext unaryOperator() {
			return getRuleContext(UnaryOperatorContext.class,0);
		}
		public ExpressionAtomContext expressionAtom() {
			return getRuleContext(ExpressionAtomContext.class,0);
		}
		public UnaryExpressionAtomContext(ExpressionAtomContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLParserListener ) ((SQLParserListener)listener).enterUnaryExpressionAtom(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLParserListener ) ((SQLParserListener)listener).exitUnaryExpressionAtom(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ConstantExpressionAtomContext extends ExpressionAtomContext {
		public ConstantContext constant() {
			return getRuleContext(ConstantContext.class,0);
		}
		public ConstantExpressionAtomContext(ExpressionAtomContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLParserListener ) ((SQLParserListener)listener).enterConstantExpressionAtom(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLParserListener ) ((SQLParserListener)listener).exitConstantExpressionAtom(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class FullColumnNameExpressionAtomContext extends ExpressionAtomContext {
		public FullColumnNameContext fullColumnName() {
			return getRuleContext(FullColumnNameContext.class,0);
		}
		public FullColumnNameExpressionAtomContext(ExpressionAtomContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLParserListener ) ((SQLParserListener)listener).enterFullColumnNameExpressionAtom(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLParserListener ) ((SQLParserListener)listener).exitFullColumnNameExpressionAtom(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class NestedExpressionAtomContext extends ExpressionAtomContext {
		public TerminalNode LR_BRACKET() { return getToken(SQLParser.LR_BRACKET, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode RR_BRACKET() { return getToken(SQLParser.RR_BRACKET, 0); }
		public List<TerminalNode> COMMA() { return getTokens(SQLParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(SQLParser.COMMA, i);
		}
		public NestedExpressionAtomContext(ExpressionAtomContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLParserListener ) ((SQLParserListener)listener).enterNestedExpressionAtom(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLParserListener ) ((SQLParserListener)listener).exitNestedExpressionAtom(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class MathExpressionAtomContext extends ExpressionAtomContext {
		public ExpressionAtomContext left;
		public ExpressionAtomContext right;
		public MultOperatorContext multOperator() {
			return getRuleContext(MultOperatorContext.class,0);
		}
		public List<ExpressionAtomContext> expressionAtom() {
			return getRuleContexts(ExpressionAtomContext.class);
		}
		public ExpressionAtomContext expressionAtom(int i) {
			return getRuleContext(ExpressionAtomContext.class,i);
		}
		public AddOperatorContext addOperator() {
			return getRuleContext(AddOperatorContext.class,0);
		}
		public MathExpressionAtomContext(ExpressionAtomContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLParserListener ) ((SQLParserListener)listener).enterMathExpressionAtom(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLParserListener ) ((SQLParserListener)listener).exitMathExpressionAtom(this);
		}
	}

	public final ExpressionAtomContext expressionAtom() throws RecognitionException {
		return expressionAtom(0);
	}

	private ExpressionAtomContext expressionAtom(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExpressionAtomContext _localctx = new ExpressionAtomContext(_ctx, _parentState);
		ExpressionAtomContext _prevctx = _localctx;
		int _startState = 68;
		enterRecursionRule(_localctx, 68, RULE_expressionAtom, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(567);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,82,_ctx) ) {
			case 1:
				{
				_localctx = new ConstantExpressionAtomContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(551);
				constant();
				}
				break;
			case 2:
				{
				_localctx = new FullColumnNameExpressionAtomContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(552);
				fullColumnName();
				}
				break;
			case 3:
				{
				_localctx = new UnaryExpressionAtomContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(553);
				unaryOperator();
				setState(554);
				expressionAtom(4);
				}
				break;
			case 4:
				{
				_localctx = new NestedExpressionAtomContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(556);
				match(LR_BRACKET);
				setState(557);
				expression(0);
				setState(562);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(558);
					match(COMMA);
					setState(559);
					expression(0);
					}
					}
					setState(564);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(565);
				match(RR_BRACKET);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(579);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,84,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(577);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,83,_ctx) ) {
					case 1:
						{
						_localctx = new MathExpressionAtomContext(new ExpressionAtomContext(_parentctx, _parentState));
						((MathExpressionAtomContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expressionAtom);
						setState(569);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(570);
						multOperator();
						setState(571);
						((MathExpressionAtomContext)_localctx).right = expressionAtom(3);
						}
						break;
					case 2:
						{
						_localctx = new MathExpressionAtomContext(new ExpressionAtomContext(_parentctx, _parentState));
						((MathExpressionAtomContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expressionAtom);
						setState(573);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(574);
						addOperator();
						setState(575);
						((MathExpressionAtomContext)_localctx).right = expressionAtom(2);
						}
						break;
					}
					} 
				}
				setState(581);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,84,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class UnaryOperatorContext extends ParserRuleContext {
		public TerminalNode EXCLAMATION_SYMBOL() { return getToken(SQLParser.EXCLAMATION_SYMBOL, 0); }
		public TerminalNode PLUS() { return getToken(SQLParser.PLUS, 0); }
		public TerminalNode MINUS() { return getToken(SQLParser.MINUS, 0); }
		public TerminalNode NOT() { return getToken(SQLParser.NOT, 0); }
		public UnaryOperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unaryOperator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLParserListener ) ((SQLParserListener)listener).enterUnaryOperator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLParserListener ) ((SQLParserListener)listener).exitUnaryOperator(this);
		}
	}

	public final UnaryOperatorContext unaryOperator() throws RecognitionException {
		UnaryOperatorContext _localctx = new UnaryOperatorContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_unaryOperator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(582);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 76965814992896L) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ComparisonOperatorContext extends ParserRuleContext {
		public TerminalNode EQUAL_SYMBOL() { return getToken(SQLParser.EQUAL_SYMBOL, 0); }
		public TerminalNode GREATER_SYMBOL() { return getToken(SQLParser.GREATER_SYMBOL, 0); }
		public TerminalNode LESS_SYMBOL() { return getToken(SQLParser.LESS_SYMBOL, 0); }
		public TerminalNode EXCLAMATION_SYMBOL() { return getToken(SQLParser.EXCLAMATION_SYMBOL, 0); }
		public ComparisonOperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comparisonOperator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLParserListener ) ((SQLParserListener)listener).enterComparisonOperator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLParserListener ) ((SQLParserListener)listener).exitComparisonOperator(this);
		}
	}

	public final ComparisonOperatorContext comparisonOperator() throws RecognitionException {
		ComparisonOperatorContext _localctx = new ComparisonOperatorContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_comparisonOperator);
		try {
			setState(598);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,85,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(584);
				match(EQUAL_SYMBOL);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(585);
				match(GREATER_SYMBOL);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(586);
				match(LESS_SYMBOL);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(587);
				match(LESS_SYMBOL);
				setState(588);
				match(EQUAL_SYMBOL);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(589);
				match(GREATER_SYMBOL);
				setState(590);
				match(EQUAL_SYMBOL);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(591);
				match(LESS_SYMBOL);
				setState(592);
				match(GREATER_SYMBOL);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(593);
				match(EXCLAMATION_SYMBOL);
				setState(594);
				match(EQUAL_SYMBOL);
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(595);
				match(LESS_SYMBOL);
				setState(596);
				match(EQUAL_SYMBOL);
				setState(597);
				match(GREATER_SYMBOL);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class LogicalOperatorContext extends ParserRuleContext {
		public TerminalNode AND() { return getToken(SQLParser.AND, 0); }
		public TerminalNode OR() { return getToken(SQLParser.OR, 0); }
		public LogicalOperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_logicalOperator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLParserListener ) ((SQLParserListener)listener).enterLogicalOperator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLParserListener ) ((SQLParserListener)listener).exitLogicalOperator(this);
		}
	}

	public final LogicalOperatorContext logicalOperator() throws RecognitionException {
		LogicalOperatorContext _localctx = new LogicalOperatorContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_logicalOperator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(600);
			_la = _input.LA(1);
			if ( !(_la==AND || _la==OR) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class MultOperatorContext extends ParserRuleContext {
		public TerminalNode STAR() { return getToken(SQLParser.STAR, 0); }
		public TerminalNode DIVIDE() { return getToken(SQLParser.DIVIDE, 0); }
		public MultOperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_multOperator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLParserListener ) ((SQLParserListener)listener).enterMultOperator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLParserListener ) ((SQLParserListener)listener).exitMultOperator(this);
		}
	}

	public final MultOperatorContext multOperator() throws RecognitionException {
		MultOperatorContext _localctx = new MultOperatorContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_multOperator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(602);
			_la = _input.LA(1);
			if ( !(_la==STAR || _la==DIVIDE) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class AddOperatorContext extends ParserRuleContext {
		public TerminalNode PLUS() { return getToken(SQLParser.PLUS, 0); }
		public TerminalNode MINUS() { return getToken(SQLParser.MINUS, 0); }
		public AddOperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_addOperator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLParserListener ) ((SQLParserListener)listener).enterAddOperator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLParserListener ) ((SQLParserListener)listener).exitAddOperator(this);
		}
	}

	public final AddOperatorContext addOperator() throws RecognitionException {
		AddOperatorContext _localctx = new AddOperatorContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_addOperator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(604);
			_la = _input.LA(1);
			if ( !(_la==PLUS || _la==MINUS) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ConstantContext extends ParserRuleContext {
		public Token nullLiteral;
		public StringLiteralContext stringLiteral() {
			return getRuleContext(StringLiteralContext.class,0);
		}
		public DecimalLiteralContext decimalLiteral() {
			return getRuleContext(DecimalLiteralContext.class,0);
		}
		public TerminalNode MINUS() { return getToken(SQLParser.MINUS, 0); }
		public BooleanLiteralContext booleanLiteral() {
			return getRuleContext(BooleanLiteralContext.class,0);
		}
		public TerminalNode REAL_LITERAL() { return getToken(SQLParser.REAL_LITERAL, 0); }
		public TerminalNode NULL_LITERAL() { return getToken(SQLParser.NULL_LITERAL, 0); }
		public TerminalNode NULL_SPEC_LITERAL() { return getToken(SQLParser.NULL_SPEC_LITERAL, 0); }
		public TerminalNode NOT() { return getToken(SQLParser.NOT, 0); }
		public ConstantContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constant; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLParserListener ) ((SQLParserListener)listener).enterConstant(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLParserListener ) ((SQLParserListener)listener).exitConstant(this);
		}
	}

	public final ConstantContext constant() throws RecognitionException {
		ConstantContext _localctx = new ConstantContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_constant);
		int _la;
		try {
			setState(616);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,87,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(606);
				stringLiteral();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(607);
				decimalLiteral();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(608);
				match(MINUS);
				setState(609);
				decimalLiteral();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(610);
				booleanLiteral();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(611);
				match(REAL_LITERAL);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(613);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==NOT) {
					{
					setState(612);
					match(NOT);
					}
				}

				setState(615);
				((ConstantContext)_localctx).nullLiteral = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==NULL_LITERAL || _la==NULL_SPEC_LITERAL) ) {
					((ConstantContext)_localctx).nullLiteral = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class StringLiteralContext extends ParserRuleContext {
		public List<TerminalNode> STRING_LITERAL() { return getTokens(SQLParser.STRING_LITERAL); }
		public TerminalNode STRING_LITERAL(int i) {
			return getToken(SQLParser.STRING_LITERAL, i);
		}
		public TerminalNode START_NATIONAL_STRING_LITERAL() { return getToken(SQLParser.START_NATIONAL_STRING_LITERAL, 0); }
		public TerminalNode STRING_CHARSET_NAME() { return getToken(SQLParser.STRING_CHARSET_NAME, 0); }
		public StringLiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stringLiteral; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLParserListener ) ((SQLParserListener)listener).enterStringLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLParserListener ) ((SQLParserListener)listener).exitStringLiteral(this);
		}
	}

	public final StringLiteralContext stringLiteral() throws RecognitionException {
		StringLiteralContext _localctx = new StringLiteralContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_stringLiteral);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(623);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case STRING_LITERAL:
			case STRING_CHARSET_NAME:
				{
				setState(619);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==STRING_CHARSET_NAME) {
					{
					setState(618);
					match(STRING_CHARSET_NAME);
					}
				}

				setState(621);
				match(STRING_LITERAL);
				}
				break;
			case START_NATIONAL_STRING_LITERAL:
				{
				setState(622);
				match(START_NATIONAL_STRING_LITERAL);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(626); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(625);
					match(STRING_LITERAL);
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(628); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,90,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class DecimalLiteralContext extends ParserRuleContext {
		public TerminalNode DECIMAL_LITERAL() { return getToken(SQLParser.DECIMAL_LITERAL, 0); }
		public TerminalNode ZERO_DECIMAL() { return getToken(SQLParser.ZERO_DECIMAL, 0); }
		public TerminalNode ONE_DECIMAL() { return getToken(SQLParser.ONE_DECIMAL, 0); }
		public TerminalNode TWO_DECIMAL() { return getToken(SQLParser.TWO_DECIMAL, 0); }
		public TerminalNode REAL_LITERAL() { return getToken(SQLParser.REAL_LITERAL, 0); }
		public DecimalLiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_decimalLiteral; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLParserListener ) ((SQLParserListener)listener).enterDecimalLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLParserListener ) ((SQLParserListener)listener).exitDecimalLiteral(this);
		}
	}

	public final DecimalLiteralContext decimalLiteral() throws RecognitionException {
		DecimalLiteralContext _localctx = new DecimalLiteralContext(_ctx, getState());
		enterRule(_localctx, 84, RULE_decimalLiteral);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(630);
			_la = _input.LA(1);
			if ( !(_la==DECIMAL_LITERAL || ((((_la - 293)) & ~0x3f) == 0 && ((1L << (_la - 293)) & 225L) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class BooleanLiteralContext extends ParserRuleContext {
		public TerminalNode TRUE() { return getToken(SQLParser.TRUE, 0); }
		public TerminalNode FALSE() { return getToken(SQLParser.FALSE, 0); }
		public BooleanLiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_booleanLiteral; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLParserListener ) ((SQLParserListener)listener).enterBooleanLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLParserListener ) ((SQLParserListener)listener).exitBooleanLiteral(this);
		}
	}

	public final BooleanLiteralContext booleanLiteral() throws RecognitionException {
		BooleanLiteralContext _localctx = new BooleanLiteralContext(_ctx, getState());
		enterRule(_localctx, 86, RULE_booleanLiteral);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(632);
			_la = _input.LA(1);
			if ( !(_la==TRUE || _la==FALSE) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 32:
			return expression_sempred((ExpressionContext)_localctx, predIndex);
		case 33:
			return predicate_sempred((PredicateContext)_localctx, predIndex);
		case 34:
			return expressionAtom_sempred((ExpressionAtomContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expression_sempred(ExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 3);
		}
		return true;
	}
	private boolean predicate_sempred(PredicateContext _localctx, int predIndex) {
		switch (predIndex) {
		case 1:
			return precpred(_ctx, 4);
		case 2:
			return precpred(_ctx, 3);
		case 3:
			return precpred(_ctx, 5);
		}
		return true;
	}
	private boolean expressionAtom_sempred(ExpressionAtomContext _localctx, int predIndex) {
		switch (predIndex) {
		case 4:
			return precpred(_ctx, 2);
		case 5:
			return precpred(_ctx, 1);
		}
		return true;
	}

	public static final String _serializedATN =
		"\u0004\u0001\u012c\u027b\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001"+
		"\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004"+
		"\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007"+
		"\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b"+
		"\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007"+
		"\u000f\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002\u0012\u0007"+
		"\u0012\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0002\u0015\u0007"+
		"\u0015\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017\u0002\u0018\u0007"+
		"\u0018\u0002\u0019\u0007\u0019\u0002\u001a\u0007\u001a\u0002\u001b\u0007"+
		"\u001b\u0002\u001c\u0007\u001c\u0002\u001d\u0007\u001d\u0002\u001e\u0007"+
		"\u001e\u0002\u001f\u0007\u001f\u0002 \u0007 \u0002!\u0007!\u0002\"\u0007"+
		"\"\u0002#\u0007#\u0002$\u0007$\u0002%\u0007%\u0002&\u0007&\u0002\'\u0007"+
		"\'\u0002(\u0007(\u0002)\u0007)\u0002*\u0007*\u0002+\u0007+\u0001\u0000"+
		"\u0003\u0000Z\b\u0000\u0001\u0000\u0001\u0000\u0003\u0000^\b\u0000\u0001"+
		"\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0003\u0001d\b\u0001\u0001"+
		"\u0002\u0001\u0002\u0005\u0002h\b\u0002\n\u0002\f\u0002k\t\u0002\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0003\u0002p\b\u0002\u0001\u0002\u0003"+
		"\u0002s\b\u0002\u0001\u0002\u0003\u0002v\b\u0002\u0001\u0002\u0003\u0002"+
		"y\b\u0002\u0001\u0002\u0003\u0002|\b\u0002\u0001\u0003\u0001\u0003\u0001"+
		"\u0004\u0001\u0004\u0003\u0004\u0082\b\u0004\u0001\u0004\u0001\u0004\u0005"+
		"\u0004\u0086\b\u0004\n\u0004\f\u0004\u0089\t\u0004\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0003\u0005\u0091\b\u0005"+
		"\u0001\u0005\u0003\u0005\u0094\b\u0005\u0001\u0005\u0001\u0005\u0003\u0005"+
		"\u0098\b\u0005\u0001\u0005\u0003\u0005\u009b\b\u0005\u0001\u0005\u0001"+
		"\u0005\u0003\u0005\u009f\b\u0005\u0001\u0005\u0003\u0005\u00a2\b\u0005"+
		"\u0003\u0005\u00a4\b\u0005\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0003\u0006\u00ae\b\u0006"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0005\u0007\u00b4\b\u0007"+
		"\n\u0007\f\u0007\u00b7\t\u0007\u0001\b\u0001\b\u0001\b\u0005\b\u00bc\b"+
		"\b\n\b\f\b\u00bf\t\b\u0001\t\u0001\t\u0003\t\u00c3\b\t\u0001\t\u0001\t"+
		"\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0003\t\u00cd\b\t\u0001"+
		"\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0003\t\u00d6\b\t\u0001"+
		"\n\u0001\n\u0001\n\u0001\n\u0001\n\u0005\n\u00dd\b\n\n\n\f\n\u00e0\t\n"+
		"\u0001\u000b\u0001\u000b\u0001\u000b\u0001\f\u0001\f\u0001\f\u0001\f\u0001"+
		"\f\u0005\f\u00ea\b\f\n\f\f\f\u00ed\t\f\u0001\r\u0001\r\u0003\r\u00f1\b"+
		"\r\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0003\u000e\u00f7\b"+
		"\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0003"+
		"\u000e\u00fe\b\u000e\u0001\u000f\u0001\u000f\u0001\u0010\u0001\u0010\u0005"+
		"\u0010\u0104\b\u0010\n\u0010\f\u0010\u0107\t\u0010\u0001\u0010\u0001\u0010"+
		"\u0001\u0010\u0005\u0010\u010c\b\u0010\n\u0010\f\u0010\u010f\t\u0010\u0001"+
		"\u0010\u0001\u0010\u0003\u0010\u0113\b\u0010\u0001\u0011\u0001\u0011\u0003"+
		"\u0011\u0117\b\u0011\u0001\u0011\u0003\u0011\u011a\b\u0011\u0001\u0011"+
		"\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0003\u0011\u0121\b\u0011"+
		"\u0001\u0011\u0003\u0011\u0124\b\u0011\u0001\u0011\u0003\u0011\u0127\b"+
		"\u0011\u0003\u0011\u0129\b\u0011\u0001\u0012\u0003\u0012\u012c\b\u0012"+
		"\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012"+
		"\u0003\u0012\u0134\b\u0012\u0001\u0012\u0003\u0012\u0137\b\u0012\u0001"+
		"\u0012\u0005\u0012\u013a\b\u0012\n\u0012\f\u0012\u013d\t\u0012\u0001\u0012"+
		"\u0001\u0012\u0003\u0012\u0141\b\u0012\u0001\u0012\u0001\u0012\u0001\u0012"+
		"\u0001\u0012\u0001\u0012\u0001\u0012\u0003\u0012\u0149\b\u0012\u0001\u0012"+
		"\u0003\u0012\u014c\b\u0012\u0001\u0012\u0005\u0012\u014f\b\u0012\n\u0012"+
		"\f\u0012\u0152\t\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0003\u0012"+
		"\u0157\b\u0012\u0003\u0012\u0159\b\u0012\u0001\u0012\u0001\u0012\u0001"+
		"\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0003\u0012\u0161\b\u0012\u0001"+
		"\u0012\u0003\u0012\u0164\b\u0012\u0003\u0012\u0166\b\u0012\u0001\u0013"+
		"\u0001\u0013\u0001\u0013\u0001\u0014\u0001\u0014\u0001\u0015\u0001\u0015"+
		"\u0001\u0015\u0001\u0015\u0003\u0015\u0171\b\u0015\u0001\u0016\u0001\u0016"+
		"\u0001\u0017\u0001\u0017\u0001\u0017\u0003\u0017\u0178\b\u0017\u0001\u0018"+
		"\u0001\u0018\u0001\u0018\u0003\u0018\u017d\b\u0018\u0003\u0018\u017f\b"+
		"\u0018\u0001\u0018\u0003\u0018\u0182\b\u0018\u0001\u0018\u0001\u0018\u0003"+
		"\u0018\u0186\b\u0018\u0003\u0018\u0188\b\u0018\u0001\u0019\u0001\u0019"+
		"\u0003\u0019\u018c\b\u0019\u0001\u001a\u0001\u001a\u0001\u001a\u0003\u001a"+
		"\u0191\b\u001a\u0001\u001a\u0001\u001a\u0001\u001b\u0001\u001b\u0001\u001b"+
		"\u0003\u001b\u0198\b\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b"+
		"\u0001\u001b\u0001\u001b\u0001\u001b\u0003\u001b\u01a1\b\u001b\u0001\u001b"+
		"\u0001\u001b\u0001\u001b\u0001\u001b\u0003\u001b\u01a7\b\u001b\u0001\u001b"+
		"\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0005\u001b"+
		"\u01af\b\u001b\n\u001b\f\u001b\u01b2\t\u001b\u0003\u001b\u01b4\b\u001b"+
		"\u0001\u001b\u0001\u001b\u0003\u001b\u01b8\b\u001b\u0001\u001b\u0001\u001b"+
		"\u0003\u001b\u01bc\b\u001b\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c"+
		"\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c"+
		"\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c"+
		"\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c"+
		"\u0001\u001c\u0003\u001c\u01d5\b\u001c\u0001\u001d\u0001\u001d\u0001\u001e"+
		"\u0001\u001e\u0001\u001e\u0001\u001e\u0003\u001e\u01dd\b\u001e\u0001\u001e"+
		"\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0003\u001e\u01e4\b\u001e"+
		"\u0005\u001e\u01e6\b\u001e\n\u001e\f\u001e\u01e9\t\u001e\u0001\u001f\u0001"+
		"\u001f\u0001\u001f\u0001\u001f\u0003\u001f\u01ef\b\u001f\u0001 \u0001"+
		" \u0001 \u0001 \u0001 \u0001 \u0003 \u01f7\b \u0001 \u0001 \u0001 \u0003"+
		" \u01fc\b \u0001 \u0001 \u0001 \u0001 \u0005 \u0202\b \n \f \u0205\t "+
		"\u0001!\u0001!\u0001!\u0003!\u020a\b!\u0001!\u0001!\u0001!\u0001!\u0001"+
		"!\u0001!\u0001!\u0001!\u0001!\u0001!\u0001!\u0001!\u0003!\u0218\b!\u0001"+
		"!\u0001!\u0003!\u021c\b!\u0001!\u0001!\u0003!\u0220\b!\u0005!\u0222\b"+
		"!\n!\f!\u0225\t!\u0001\"\u0001\"\u0001\"\u0001\"\u0001\"\u0001\"\u0001"+
		"\"\u0001\"\u0001\"\u0001\"\u0005\"\u0231\b\"\n\"\f\"\u0234\t\"\u0001\""+
		"\u0001\"\u0003\"\u0238\b\"\u0001\"\u0001\"\u0001\"\u0001\"\u0001\"\u0001"+
		"\"\u0001\"\u0001\"\u0005\"\u0242\b\"\n\"\f\"\u0245\t\"\u0001#\u0001#\u0001"+
		"$\u0001$\u0001$\u0001$\u0001$\u0001$\u0001$\u0001$\u0001$\u0001$\u0001"+
		"$\u0001$\u0001$\u0001$\u0003$\u0257\b$\u0001%\u0001%\u0001&\u0001&\u0001"+
		"\'\u0001\'\u0001(\u0001(\u0001(\u0001(\u0001(\u0001(\u0001(\u0003(\u0266"+
		"\b(\u0001(\u0003(\u0269\b(\u0001)\u0003)\u026c\b)\u0001)\u0001)\u0003"+
		")\u0270\b)\u0001)\u0004)\u0273\b)\u000b)\f)\u0274\u0001*\u0001*\u0001"+
		"+\u0001+\u0001+\u0000\u0003@BD,\u0000\u0002\u0004\u0006\b\n\f\u000e\u0010"+
		"\u0012\u0014\u0016\u0018\u001a\u001c\u001e \"$&(*,.02468:<>@BDFHJLNPR"+
		"TV\u0000\u000f\u0002\u0000\u0001\u0001\b\b\u0002\u0000\u0003\u0003\u0007"+
		"\u0007\u0002\u0000\u0011\u0011\u001a\u001a\u0002\u00003355\u0002\u0000"+
		"!!#%\u0006\u0000\r\r\u0011\u0011\u001a\u001a\u001c\u001e\"\"R\u0123\u0002"+
		"\u0000\u0014\u0014..\u0003\u0000\u0015\u0015\u001f\u001f\u0124\u0124\u0003"+
		"\u0000\u0014\u0014)*..\u0002\u0000\u0002\u0002\u0017\u0017\u0001\u0000"+
		"&\'\u0001\u0000)*\u0001\u0000\u0126\u0127\u0003\u000044\u0125\u0125\u012a"+
		"\u012c\u0002\u0000\u001f\u001f\u0124\u0124\u02d8\u0000Y\u0001\u0000\u0000"+
		"\u0000\u0002c\u0001\u0000\u0000\u0000\u0004e\u0001\u0000\u0000\u0000\u0006"+
		"}\u0001\u0000\u0000\u0000\b\u0081\u0001\u0000\u0000\u0000\n\u00a3\u0001"+
		"\u0000\u0000\u0000\f\u00ad\u0001\u0000\u0000\u0000\u000e\u00af\u0001\u0000"+
		"\u0000\u0000\u0010\u00b8\u0001\u0000\u0000\u0000\u0012\u00d5\u0001\u0000"+
		"\u0000\u0000\u0014\u00d7\u0001\u0000\u0000\u0000\u0016\u00e1\u0001\u0000"+
		"\u0000\u0000\u0018\u00e4\u0001\u0000\u0000\u0000\u001a\u00ee\u0001\u0000"+
		"\u0000\u0000\u001c\u00f2\u0001\u0000\u0000\u0000\u001e\u00ff\u0001\u0000"+
		"\u0000\u0000 \u0112\u0001\u0000\u0000\u0000\"\u0128\u0001\u0000\u0000"+
		"\u0000$\u0165\u0001\u0000\u0000\u0000&\u0167\u0001\u0000\u0000\u0000("+
		"\u016a\u0001\u0000\u0000\u0000*\u016c\u0001\u0000\u0000\u0000,\u0172\u0001"+
		"\u0000\u0000\u0000.\u0177\u0001\u0000\u0000\u00000\u0187\u0001\u0000\u0000"+
		"\u00002\u018b\u0001\u0000\u0000\u00004\u018d\u0001\u0000\u0000\u00006"+
		"\u01bb\u0001\u0000\u0000\u00008\u01d4\u0001\u0000\u0000\u0000:\u01d6\u0001"+
		"\u0000\u0000\u0000<\u01dc\u0001\u0000\u0000\u0000>\u01ee\u0001\u0000\u0000"+
		"\u0000@\u01fb\u0001\u0000\u0000\u0000B\u0209\u0001\u0000\u0000\u0000D"+
		"\u0237\u0001\u0000\u0000\u0000F\u0246\u0001\u0000\u0000\u0000H\u0256\u0001"+
		"\u0000\u0000\u0000J\u0258\u0001\u0000\u0000\u0000L\u025a\u0001\u0000\u0000"+
		"\u0000N\u025c\u0001\u0000\u0000\u0000P\u0268\u0001\u0000\u0000\u0000R"+
		"\u026f\u0001\u0000\u0000\u0000T\u0276\u0001\u0000\u0000\u0000V\u0278\u0001"+
		"\u0000\u0000\u0000XZ\u0003\u0002\u0001\u0000YX\u0001\u0000\u0000\u0000"+
		"YZ\u0001\u0000\u0000\u0000Z]\u0001\u0000\u0000\u0000[\\\u0005*\u0000\u0000"+
		"\\^\u0005*\u0000\u0000][\u0001\u0000\u0000\u0000]^\u0001\u0000\u0000\u0000"+
		"^_\u0001\u0000\u0000\u0000_`\u0005\u0000\u0000\u0001`\u0001\u0001\u0000"+
		"\u0000\u0000ad\u0003\u0004\u0002\u0000bd\u0003\f\u0006\u0000ca\u0001\u0000"+
		"\u0000\u0000cb\u0001\u0000\u0000\u0000d\u0003\u0001\u0000\u0000\u0000"+
		"ei\u0005\u001b\u0000\u0000fh\u0003\u0006\u0003\u0000gf\u0001\u0000\u0000"+
		"\u0000hk\u0001\u0000\u0000\u0000ig\u0001\u0000\u0000\u0000ij\u0001\u0000"+
		"\u0000\u0000jl\u0001\u0000\u0000\u0000ki\u0001\u0000\u0000\u0000lm\u0003"+
		"\b\u0004\u0000mo\u0003\u000e\u0007\u0000np\u0003\u0012\t\u0000on\u0001"+
		"\u0000\u0000\u0000op\u0001\u0000\u0000\u0000pr\u0001\u0000\u0000\u0000"+
		"qs\u0003\u0014\n\u0000rq\u0001\u0000\u0000\u0000rs\u0001\u0000\u0000\u0000"+
		"su\u0001\u0000\u0000\u0000tv\u0003\u0016\u000b\u0000ut\u0001\u0000\u0000"+
		"\u0000uv\u0001\u0000\u0000\u0000vx\u0001\u0000\u0000\u0000wy\u0003\u0018"+
		"\f\u0000xw\u0001\u0000\u0000\u0000xy\u0001\u0000\u0000\u0000y{\u0001\u0000"+
		"\u0000\u0000z|\u0003\u001c\u000e\u0000{z\u0001\u0000\u0000\u0000{|\u0001"+
		"\u0000\u0000\u0000|\u0005\u0001\u0000\u0000\u0000}~\u0007\u0000\u0000"+
		"\u0000~\u0007\u0001\u0000\u0000\u0000\u007f\u0082\u0005&\u0000\u0000\u0080"+
		"\u0082\u0003\n\u0005\u0000\u0081\u007f\u0001\u0000\u0000\u0000\u0081\u0080"+
		"\u0001\u0000\u0000\u0000\u0082\u0087\u0001\u0000\u0000\u0000\u0083\u0084"+
		"\u00052\u0000\u0000\u0084\u0086\u0003\n\u0005\u0000\u0085\u0083\u0001"+
		"\u0000\u0000\u0000\u0086\u0089\u0001\u0000\u0000\u0000\u0087\u0085\u0001"+
		"\u0000\u0000\u0000\u0087\u0088\u0001\u0000\u0000\u0000\u0088\t\u0001\u0000"+
		"\u0000\u0000\u0089\u0087\u0001\u0000\u0000\u0000\u008a\u008b\u0003*\u0015"+
		"\u0000\u008b\u008c\u0005/\u0000\u0000\u008c\u008d\u0005&\u0000\u0000\u008d"+
		"\u00a4\u0001\u0000\u0000\u0000\u008e\u0093\u00030\u0018\u0000\u008f\u0091"+
		"\u0005\u0004\u0000\u0000\u0090\u008f\u0001\u0000\u0000\u0000\u0090\u0091"+
		"\u0001\u0000\u0000\u0000\u0091\u0092\u0001\u0000\u0000\u0000\u0092\u0094"+
		"\u0003,\u0016\u0000\u0093\u0090\u0001\u0000\u0000\u0000\u0093\u0094\u0001"+
		"\u0000\u0000\u0000\u0094\u00a4\u0001\u0000\u0000\u0000\u0095\u009a\u0003"+
		"2\u0019\u0000\u0096\u0098\u0005\u0004\u0000\u0000\u0097\u0096\u0001\u0000"+
		"\u0000\u0000\u0097\u0098\u0001\u0000\u0000\u0000\u0098\u0099\u0001\u0000"+
		"\u0000\u0000\u0099\u009b\u0003,\u0016\u0000\u009a\u0097\u0001\u0000\u0000"+
		"\u0000\u009a\u009b\u0001\u0000\u0000\u0000\u009b\u00a4\u0001\u0000\u0000"+
		"\u0000\u009c\u00a1\u0003@ \u0000\u009d\u009f\u0005\u0004\u0000\u0000\u009e"+
		"\u009d\u0001\u0000\u0000\u0000\u009e\u009f\u0001\u0000\u0000\u0000\u009f"+
		"\u00a0\u0001\u0000\u0000\u0000\u00a0\u00a2\u0003,\u0016\u0000\u00a1\u009e"+
		"\u0001\u0000\u0000\u0000\u00a1\u00a2\u0001\u0000\u0000\u0000\u00a2\u00a4"+
		"\u0001\u0000\u0000\u0000\u00a3\u008a\u0001\u0000\u0000\u0000\u00a3\u008e"+
		"\u0001\u0000\u0000\u0000\u00a3\u0095\u0001\u0000\u0000\u0000\u00a3\u009c"+
		"\u0001\u0000\u0000\u0000\u00a4\u000b\u0001\u0000\u0000\u0000\u00a5\u00a6"+
		"\u00050\u0000\u0000\u00a6\u00a7\u0003\u0004\u0002\u0000\u00a7\u00a8\u0005"+
		"1\u0000\u0000\u00a8\u00ae\u0001\u0000\u0000\u0000\u00a9\u00aa\u00050\u0000"+
		"\u0000\u00aa\u00ab\u0003\f\u0006\u0000\u00ab\u00ac\u00051\u0000\u0000"+
		"\u00ac\u00ae\u0001\u0000\u0000\u0000\u00ad\u00a5\u0001\u0000\u0000\u0000"+
		"\u00ad\u00a9\u0001\u0000\u0000\u0000\u00ae\r\u0001\u0000\u0000\u0000\u00af"+
		"\u00b0\u0005\n\u0000\u0000\u00b0\u00b5\u0003 \u0010\u0000\u00b1\u00b2"+
		"\u00052\u0000\u0000\u00b2\u00b4\u0003 \u0010\u0000\u00b3\u00b1\u0001\u0000"+
		"\u0000\u0000\u00b4\u00b7\u0001\u0000\u0000\u0000\u00b5\u00b3\u0001\u0000"+
		"\u0000\u0000\u00b5\u00b6\u0001\u0000\u0000\u0000\u00b6\u000f\u0001\u0000"+
		"\u0000\u0000\u00b7\u00b5\u0001\u0000\u0000\u0000\u00b8\u00bd\u0003 \u0010"+
		"\u0000\u00b9\u00ba\u00052\u0000\u0000\u00ba\u00bc\u0003 \u0010\u0000\u00bb"+
		"\u00b9\u0001\u0000\u0000\u0000\u00bc\u00bf\u0001\u0000\u0000\u0000\u00bd"+
		"\u00bb\u0001\u0000\u0000\u0000\u00bd\u00be\u0001\u0000\u0000\u0000\u00be"+
		"\u0011\u0001\u0000\u0000\u0000\u00bf\u00bd\u0001\u0000\u0000\u0000\u00c0"+
		"\u00c2\u0005 \u0000\u0000\u00c1\u00c3\u0005\u0014\u0000\u0000\u00c2\u00c1"+
		"\u0001\u0000\u0000\u0000\u00c2\u00c3\u0001\u0000\u0000\u0000\u00c3\u00c4"+
		"\u0001\u0000\u0000\u0000\u00c4\u00c5\u0005\t\u0000\u0000\u00c5\u00c6\u0005"+
		"0\u0000\u0000\u00c6\u00c7\u0003\u0002\u0001\u0000\u00c7\u00c8\u00051\u0000"+
		"\u0000\u00c8\u00d6\u0001\u0000\u0000\u0000\u00c9\u00ca\u0005 \u0000\u0000"+
		"\u00ca\u00cc\u0003@ \u0000\u00cb\u00cd\u0005\u0014\u0000\u0000\u00cc\u00cb"+
		"\u0001\u0000\u0000\u0000\u00cc\u00cd\u0001\u0000\u0000\u0000\u00cd\u00ce"+
		"\u0001\u0000\u0000\u0000\u00ce\u00cf\u0005\u000e\u0000\u0000\u00cf\u00d0"+
		"\u00050\u0000\u0000\u00d0\u00d1\u0003\u0002\u0001\u0000\u00d1\u00d2\u0005"+
		"1\u0000\u0000\u00d2\u00d6\u0001\u0000\u0000\u0000\u00d3\u00d4\u0005 \u0000"+
		"\u0000\u00d4\u00d6\u0003@ \u0000\u00d5\u00c0\u0001\u0000\u0000\u0000\u00d5"+
		"\u00c9\u0001\u0000\u0000\u0000\u00d5\u00d3\u0001\u0000\u0000\u0000\u00d6"+
		"\u0013\u0001\u0000\u0000\u0000\u00d7\u00d8\u0005\u000b\u0000\u0000\u00d8"+
		"\u00d9\u0005\u0006\u0000\u0000\u00d9\u00de\u0003@ \u0000\u00da\u00db\u0005"+
		"2\u0000\u0000\u00db\u00dd\u0003@ \u0000\u00dc\u00da\u0001\u0000\u0000"+
		"\u0000\u00dd\u00e0\u0001\u0000\u0000\u0000\u00de\u00dc\u0001\u0000\u0000"+
		"\u0000\u00de\u00df\u0001\u0000\u0000\u0000\u00df\u0015\u0001\u0000\u0000"+
		"\u0000\u00e0\u00de\u0001\u0000\u0000\u0000\u00e1\u00e2\u0005\f\u0000\u0000"+
		"\u00e2\u00e3\u0003@ \u0000\u00e3\u0017\u0001\u0000\u0000\u0000\u00e4\u00e5"+
		"\u0005\u0018\u0000\u0000\u00e5\u00e6\u0005\u0006\u0000\u0000\u00e6\u00eb"+
		"\u0003\u001a\r\u0000\u00e7\u00e8\u00052\u0000\u0000\u00e8\u00ea\u0003"+
		"\u001a\r\u0000\u00e9\u00e7\u0001\u0000\u0000\u0000\u00ea\u00ed\u0001\u0000"+
		"\u0000\u0000\u00eb\u00e9\u0001\u0000\u0000\u0000\u00eb\u00ec\u0001\u0000"+
		"\u0000\u0000\u00ec\u0019\u0001\u0000\u0000\u0000\u00ed\u00eb\u0001\u0000"+
		"\u0000\u0000\u00ee\u00f0\u0003@ \u0000\u00ef\u00f1\u0007\u0001\u0000\u0000"+
		"\u00f0\u00ef\u0001\u0000\u0000\u0000\u00f0\u00f1\u0001\u0000\u0000\u0000"+
		"\u00f1\u001b\u0001\u0000\u0000\u0000\u00f2\u00fd\u0005\u0013\u0000\u0000"+
		"\u00f3\u00f4\u0003\u001e\u000f\u0000\u00f4\u00f5\u00052\u0000\u0000\u00f5"+
		"\u00f7\u0001\u0000\u0000\u0000\u00f6\u00f3\u0001\u0000\u0000\u0000\u00f6"+
		"\u00f7\u0001\u0000\u0000\u0000\u00f7\u00f8\u0001\u0000\u0000\u0000\u00f8"+
		"\u00fe\u0003\u001e\u000f\u0000\u00f9\u00fa\u0003\u001e\u000f\u0000\u00fa"+
		"\u00fb\u00056\u0000\u0000\u00fb\u00fc\u0003\u001e\u000f\u0000\u00fc\u00fe"+
		"\u0001\u0000\u0000\u0000\u00fd\u00f6\u0001\u0000\u0000\u0000\u00fd\u00f9"+
		"\u0001\u0000\u0000\u0000\u00fe\u001d\u0001\u0000\u0000\u0000\u00ff\u0100"+
		"\u00054\u0000\u0000\u0100\u001f\u0001\u0000\u0000\u0000\u0101\u0105\u0003"+
		"\"\u0011\u0000\u0102\u0104\u0003$\u0012\u0000\u0103\u0102\u0001\u0000"+
		"\u0000\u0000\u0104\u0107\u0001\u0000\u0000\u0000\u0105\u0103\u0001\u0000"+
		"\u0000\u0000\u0105\u0106\u0001\u0000\u0000\u0000\u0106\u0113\u0001\u0000"+
		"\u0000\u0000\u0107\u0105\u0001\u0000\u0000\u0000\u0108\u0109\u00050\u0000"+
		"\u0000\u0109\u010d\u0003\"\u0011\u0000\u010a\u010c\u0003$\u0012\u0000"+
		"\u010b\u010a\u0001\u0000\u0000\u0000\u010c\u010f\u0001\u0000\u0000\u0000"+
		"\u010d\u010b\u0001\u0000\u0000\u0000\u010d\u010e\u0001\u0000\u0000\u0000"+
		"\u010e\u0110\u0001\u0000\u0000\u0000\u010f\u010d\u0001\u0000\u0000\u0000"+
		"\u0110\u0111\u00051\u0000\u0000\u0111\u0113\u0001\u0000\u0000\u0000\u0112"+
		"\u0101\u0001\u0000\u0000\u0000\u0112\u0108\u0001\u0000\u0000\u0000\u0113"+
		"!\u0001\u0000\u0000\u0000\u0114\u0119\u0003(\u0014\u0000\u0115\u0117\u0005"+
		"\u0004\u0000\u0000\u0116\u0115\u0001\u0000\u0000\u0000\u0116\u0117\u0001"+
		"\u0000\u0000\u0000\u0117\u0118\u0001\u0000\u0000\u0000\u0118\u011a\u0003"+
		",\u0016\u0000\u0119\u0116\u0001\u0000\u0000\u0000\u0119\u011a\u0001\u0000"+
		"\u0000\u0000\u011a\u0129\u0001\u0000\u0000\u0000\u011b\u0121\u0003\u0002"+
		"\u0001\u0000\u011c\u011d\u00050\u0000\u0000\u011d\u011e\u0003\u0002\u0001"+
		"\u0000\u011e\u011f\u00051\u0000\u0000\u011f\u0121\u0001\u0000\u0000\u0000"+
		"\u0120\u011b\u0001\u0000\u0000\u0000\u0120\u011c\u0001\u0000\u0000\u0000"+
		"\u0121\u0123\u0001\u0000\u0000\u0000\u0122\u0124\u0005\u0004\u0000\u0000"+
		"\u0123\u0122\u0001\u0000\u0000\u0000\u0123\u0124\u0001\u0000\u0000\u0000"+
		"\u0124\u0126\u0001\u0000\u0000\u0000\u0125\u0127\u0003,\u0016\u0000\u0126"+
		"\u0125\u0001\u0000\u0000\u0000\u0126\u0127\u0001\u0000\u0000\u0000\u0127"+
		"\u0129\u0001\u0000\u0000\u0000\u0128\u0114\u0001\u0000\u0000\u0000\u0128"+
		"\u0120\u0001\u0000\u0000\u0000\u0129#\u0001\u0000\u0000\u0000\u012a\u012c"+
		"\u00057\u0000\u0000\u012b\u012a\u0001\u0000\u0000\u0000\u012b\u012c\u0001"+
		"\u0000\u0000\u0000\u012c\u012d\u0001\u0000\u0000\u0000\u012d\u0133\u0005"+
		"\u0010\u0000\u0000\u012e\u012f\u00050\u0000\u0000\u012f\u0130\u0003\u0002"+
		"\u0001\u0000\u0130\u0131\u00051\u0000\u0000\u0131\u0134\u0001\u0000\u0000"+
		"\u0000\u0132\u0134\u0003\"\u0011\u0000\u0133\u012e\u0001\u0000\u0000\u0000"+
		"\u0133\u0132\u0001\u0000\u0000\u0000\u0134\u0136\u0001\u0000\u0000\u0000"+
		"\u0135\u0137\u0003,\u0016\u0000\u0136\u0135\u0001\u0000\u0000\u0000\u0136"+
		"\u0137\u0001\u0000\u0000\u0000\u0137\u013b\u0001\u0000\u0000\u0000\u0138"+
		"\u013a\u0003&\u0013\u0000\u0139\u0138\u0001\u0000\u0000\u0000\u013a\u013d"+
		"\u0001\u0000\u0000\u0000\u013b\u0139\u0001\u0000\u0000\u0000\u013b\u013c"+
		"\u0001\u0000\u0000\u0000\u013c\u0166\u0001\u0000\u0000\u0000\u013d\u013b"+
		"\u0001\u0000\u0000\u0000\u013e\u0140\u0007\u0002\u0000\u0000\u013f\u0141"+
		"\u0005\u0019\u0000\u0000\u0140\u013f\u0001\u0000\u0000\u0000\u0140\u0141"+
		"\u0001\u0000\u0000\u0000\u0141\u0142\u0001\u0000\u0000\u0000\u0142\u0148"+
		"\u0005\u0010\u0000\u0000\u0143\u0144\u00050\u0000\u0000\u0144\u0145\u0003"+
		"\u0002\u0001\u0000\u0145\u0146\u00051\u0000\u0000\u0146\u0149\u0001\u0000"+
		"\u0000\u0000\u0147\u0149\u0003\"\u0011\u0000\u0148\u0143\u0001\u0000\u0000"+
		"\u0000\u0148\u0147\u0001\u0000\u0000\u0000\u0149\u014b\u0001\u0000\u0000"+
		"\u0000\u014a\u014c\u0003,\u0016\u0000\u014b\u014a\u0001\u0000\u0000\u0000"+
		"\u014b\u014c\u0001\u0000\u0000\u0000\u014c\u0150\u0001\u0000\u0000\u0000"+
		"\u014d\u014f\u0003&\u0013\u0000\u014e\u014d\u0001\u0000\u0000\u0000\u014f"+
		"\u0152\u0001\u0000\u0000\u0000\u0150\u014e\u0001\u0000\u0000\u0000\u0150"+
		"\u0151\u0001\u0000\u0000\u0000\u0151\u0166\u0001\u0000\u0000\u0000\u0152"+
		"\u0150\u0001\u0000\u0000\u0000\u0153\u0158\u00058\u0000\u0000\u0154\u0156"+
		"\u0007\u0002\u0000\u0000\u0155\u0157\u0005\u0019\u0000\u0000\u0156\u0155"+
		"\u0001\u0000\u0000\u0000\u0156\u0157\u0001\u0000\u0000\u0000\u0157\u0159"+
		"\u0001\u0000\u0000\u0000\u0158\u0154\u0001\u0000\u0000\u0000\u0158\u0159"+
		"\u0001\u0000\u0000\u0000\u0159\u015a\u0001\u0000\u0000\u0000\u015a\u0160"+
		"\u0005\u0010\u0000\u0000\u015b\u015c\u00050\u0000\u0000\u015c\u015d\u0003"+
		"\u0002\u0001\u0000\u015d\u015e\u00051\u0000\u0000\u015e\u0161\u0001\u0000"+
		"\u0000\u0000\u015f\u0161\u0003\"\u0011\u0000\u0160\u015b\u0001\u0000\u0000"+
		"\u0000\u0160\u015f\u0001\u0000\u0000\u0000\u0161\u0163\u0001\u0000\u0000"+
		"\u0000\u0162\u0164\u0003,\u0016\u0000\u0163\u0162\u0001\u0000\u0000\u0000"+
		"\u0163\u0164\u0001\u0000\u0000\u0000\u0164\u0166\u0001\u0000\u0000\u0000"+
		"\u0165\u012b\u0001\u0000\u0000\u0000\u0165\u013e\u0001\u0000\u0000\u0000"+
		"\u0165\u0153\u0001\u0000\u0000\u0000\u0166%\u0001\u0000\u0000\u0000\u0167"+
		"\u0168\u0005\u0016\u0000\u0000\u0168\u0169\u0003@ \u0000\u0169\'\u0001"+
		"\u0000\u0000\u0000\u016a\u016b\u0003*\u0015\u0000\u016b)\u0001\u0000\u0000"+
		"\u0000\u016c\u0170\u0003,\u0016\u0000\u016d\u0171\u00059\u0000\u0000\u016e"+
		"\u016f\u0005/\u0000\u0000\u016f\u0171\u0003,\u0016\u0000\u0170\u016d\u0001"+
		"\u0000\u0000\u0000\u0170\u016e\u0001\u0000\u0000\u0000\u0170\u0171\u0001"+
		"\u0000\u0000\u0000\u0171+\u0001\u0000\u0000\u0000\u0172\u0173\u0007\u0003"+
		"\u0000\u0000\u0173-\u0001\u0000\u0000\u0000\u0174\u0178\u00059\u0000\u0000"+
		"\u0175\u0176\u0005/\u0000\u0000\u0176\u0178\u0003,\u0016\u0000\u0177\u0174"+
		"\u0001\u0000\u0000\u0000\u0177\u0175\u0001\u0000\u0000\u0000\u0178/\u0001"+
		"\u0000\u0000\u0000\u0179\u017e\u0003,\u0016\u0000\u017a\u017c\u0003.\u0017"+
		"\u0000\u017b\u017d\u0003.\u0017\u0000\u017c\u017b\u0001\u0000\u0000\u0000"+
		"\u017c\u017d\u0001\u0000\u0000\u0000\u017d\u017f\u0001\u0000\u0000\u0000"+
		"\u017e\u017a\u0001\u0000\u0000\u0000\u017e\u017f\u0001\u0000\u0000\u0000"+
		"\u017f\u0188\u0001\u0000\u0000\u0000\u0180\u0182\t\u0000\u0000\u0000\u0181"+
		"\u0180\u0001\u0000\u0000\u0000\u0181\u0182\u0001\u0000\u0000\u0000\u0182"+
		"\u0183\u0001\u0000\u0000\u0000\u0183\u0185\u0003.\u0017\u0000\u0184\u0186"+
		"\u0003.\u0017\u0000\u0185\u0184\u0001\u0000\u0000\u0000\u0185\u0186\u0001"+
		"\u0000\u0000\u0000\u0186\u0188\u0001\u0000\u0000\u0000\u0187\u0179\u0001"+
		"\u0000\u0000\u0000\u0187\u0181\u0001\u0000\u0000\u0000\u01881\u0001\u0000"+
		"\u0000\u0000\u0189\u018c\u00034\u001a\u0000\u018a\u018c\u00036\u001b\u0000"+
		"\u018b\u0189\u0001\u0000\u0000\u0000\u018b\u018a\u0001\u0000\u0000\u0000"+
		"\u018c3\u0001\u0000\u0000\u0000\u018d\u018e\u00038\u001c\u0000\u018e\u0190"+
		"\u00050\u0000\u0000\u018f\u0191\u0003<\u001e\u0000\u0190\u018f\u0001\u0000"+
		"\u0000\u0000\u0190\u0191\u0001\u0000\u0000\u0000\u0191\u0192\u0001\u0000"+
		"\u0000\u0000\u0192\u0193\u00051\u0000\u0000\u01935\u0001\u0000\u0000\u0000"+
		"\u0194\u0195\u0007\u0004\u0000\u0000\u0195\u0197\u00050\u0000\u0000\u0196"+
		"\u0198\u0007\u0000\u0000\u0000\u0197\u0196\u0001\u0000\u0000\u0000\u0197"+
		"\u0198\u0001\u0000\u0000\u0000\u0198\u0199\u0001\u0000\u0000\u0000\u0199"+
		"\u019a\u0003>\u001f\u0000\u019a\u019b\u00051\u0000\u0000\u019b\u01bc\u0001"+
		"\u0000\u0000\u0000\u019c\u019d\u0005\"\u0000\u0000\u019d\u01a0\u00050"+
		"\u0000\u0000\u019e\u01a1\u0005&\u0000\u0000\u019f\u01a1\u0003>\u001f\u0000"+
		"\u01a0\u019e\u0001\u0000\u0000\u0000\u01a0\u019f\u0001\u0000\u0000\u0000"+
		"\u01a1\u01a2\u0001\u0000\u0000\u0000\u01a2\u01bc\u00051\u0000\u0000\u01a3"+
		"\u01a4\u0005:\u0000\u0000\u01a4\u01a6\u00050\u0000\u0000\u01a5\u01a7\u0005"+
		"\b\u0000\u0000\u01a6\u01a5\u0001\u0000\u0000\u0000\u01a6\u01a7\u0001\u0000"+
		"\u0000\u0000\u01a7\u01a8\u0001\u0000\u0000\u0000\u01a8\u01b3\u0003<\u001e"+
		"\u0000\u01a9\u01aa\u0005\u0018\u0000\u0000\u01aa\u01ab\u0005\u0006\u0000"+
		"\u0000\u01ab\u01b0\u0003\u001a\r\u0000\u01ac\u01ad\u00052\u0000\u0000"+
		"\u01ad\u01af\u0003\u001a\r\u0000\u01ae\u01ac\u0001\u0000\u0000\u0000\u01af"+
		"\u01b2\u0001\u0000\u0000\u0000\u01b0\u01ae\u0001\u0000\u0000\u0000\u01b0"+
		"\u01b1\u0001\u0000\u0000\u0000\u01b1\u01b4\u0001\u0000\u0000\u0000\u01b2"+
		"\u01b0\u0001\u0000\u0000\u0000\u01b3\u01a9\u0001\u0000\u0000\u0000\u01b3"+
		"\u01b4\u0001\u0000\u0000\u0000\u01b4\u01b7\u0001\u0000\u0000\u0000\u01b5"+
		"\u01b6\u0005;\u0000\u0000\u01b6\u01b8\u00053\u0000\u0000\u01b7\u01b5\u0001"+
		"\u0000\u0000\u0000\u01b7\u01b8\u0001\u0000\u0000\u0000\u01b8\u01b9\u0001"+
		"\u0000\u0000\u0000\u01b9\u01ba\u00051\u0000\u0000\u01ba\u01bc\u0001\u0000"+
		"\u0000\u0000\u01bb\u0194\u0001\u0000\u0000\u0000\u01bb\u019c\u0001\u0000"+
		"\u0000\u0000\u01bb\u01a3\u0001\u0000\u0000\u0000\u01bc7\u0001\u0000\u0000"+
		"\u0000\u01bd\u01d5\u0003:\u001d\u0000\u01be\u01d5\u0005<\u0000\u0000\u01bf"+
		"\u01d5\u0005=\u0000\u0000\u01c0\u01d5\u0005>\u0000\u0000\u01c1\u01d5\u0005"+
		"?\u0000\u0000\u01c2\u01d5\u0005@\u0000\u0000\u01c3\u01d5\u0005A\u0000"+
		"\u0000\u01c4\u01d5\u0005B\u0000\u0000\u01c5\u01d5\u0005C\u0000\u0000\u01c6"+
		"\u01d5\u0005D\u0000\u0000\u01c7\u01d5\u0005E\u0000\u0000\u01c8\u01d5\u0005"+
		"F\u0000\u0000\u01c9\u01d5\u0005G\u0000\u0000\u01ca\u01d5\u0005H\u0000"+
		"\u0000\u01cb\u01d5\u0005I\u0000\u0000\u01cc\u01d5\u0005J\u0000\u0000\u01cd"+
		"\u01d5\u0005K\u0000\u0000\u01ce\u01d5\u0005L\u0000\u0000\u01cf\u01d5\u0005"+
		"M\u0000\u0000\u01d0\u01d5\u0005N\u0000\u0000\u01d1\u01d5\u0005O\u0000"+
		"\u0000\u01d2\u01d5\u0005P\u0000\u0000\u01d3\u01d5\u0005Q\u0000\u0000\u01d4"+
		"\u01bd\u0001\u0000\u0000\u0000\u01d4\u01be\u0001\u0000\u0000\u0000\u01d4"+
		"\u01bf\u0001\u0000\u0000\u0000\u01d4\u01c0\u0001\u0000\u0000\u0000\u01d4"+
		"\u01c1\u0001\u0000\u0000\u0000\u01d4\u01c2\u0001\u0000\u0000\u0000\u01d4"+
		"\u01c3\u0001\u0000\u0000\u0000\u01d4\u01c4\u0001\u0000\u0000\u0000\u01d4"+
		"\u01c5\u0001\u0000\u0000\u0000\u01d4\u01c6\u0001\u0000\u0000\u0000\u01d4"+
		"\u01c7\u0001\u0000\u0000\u0000\u01d4\u01c8\u0001\u0000\u0000\u0000\u01d4"+
		"\u01c9\u0001\u0000\u0000\u0000\u01d4\u01ca\u0001\u0000\u0000\u0000\u01d4"+
		"\u01cb\u0001\u0000\u0000\u0000\u01d4\u01cc\u0001\u0000\u0000\u0000\u01d4"+
		"\u01cd\u0001\u0000\u0000\u0000\u01d4\u01ce\u0001\u0000\u0000\u0000\u01d4"+
		"\u01cf\u0001\u0000\u0000\u0000\u01d4\u01d0\u0001\u0000\u0000\u0000\u01d4"+
		"\u01d1\u0001\u0000\u0000\u0000\u01d4\u01d2\u0001\u0000\u0000\u0000\u01d4"+
		"\u01d3\u0001\u0000\u0000\u0000\u01d59\u0001\u0000\u0000\u0000\u01d6\u01d7"+
		"\u0007\u0005\u0000\u0000\u01d7;\u0001\u0000\u0000\u0000\u01d8\u01dd\u0003"+
		"P(\u0000\u01d9\u01dd\u00030\u0018\u0000\u01da\u01dd\u00032\u0019\u0000"+
		"\u01db\u01dd\u0003@ \u0000\u01dc\u01d8\u0001\u0000\u0000\u0000\u01dc\u01d9"+
		"\u0001\u0000\u0000\u0000\u01dc\u01da\u0001\u0000\u0000\u0000\u01dc\u01db"+
		"\u0001\u0000\u0000\u0000\u01dd\u01e7\u0001\u0000\u0000\u0000\u01de\u01e3"+
		"\u00052\u0000\u0000\u01df\u01e4\u0003P(\u0000\u01e0\u01e4\u00030\u0018"+
		"\u0000\u01e1\u01e4\u00032\u0019\u0000\u01e2\u01e4\u0003@ \u0000\u01e3"+
		"\u01df\u0001\u0000\u0000\u0000\u01e3\u01e0\u0001\u0000\u0000\u0000\u01e3"+
		"\u01e1\u0001\u0000\u0000\u0000\u01e3\u01e2\u0001\u0000\u0000\u0000\u01e4"+
		"\u01e6\u0001\u0000\u0000\u0000\u01e5\u01de\u0001\u0000\u0000\u0000\u01e6"+
		"\u01e9\u0001\u0000\u0000\u0000\u01e7\u01e5\u0001\u0000\u0000\u0000\u01e7"+
		"\u01e8\u0001\u0000\u0000\u0000\u01e8=\u0001\u0000\u0000\u0000\u01e9\u01e7"+
		"\u0001\u0000\u0000\u0000\u01ea\u01ef\u0003P(\u0000\u01eb\u01ef\u00030"+
		"\u0018\u0000\u01ec\u01ef\u00032\u0019\u0000\u01ed\u01ef\u0003@ \u0000"+
		"\u01ee\u01ea\u0001\u0000\u0000\u0000\u01ee\u01eb\u0001\u0000\u0000\u0000"+
		"\u01ee\u01ec\u0001\u0000\u0000\u0000\u01ee\u01ed\u0001\u0000\u0000\u0000"+
		"\u01ef?\u0001\u0000\u0000\u0000\u01f0\u01f1\u0006 \uffff\uffff\u0000\u01f1"+
		"\u01f2\u0007\u0006\u0000\u0000\u01f2\u01fc\u0003@ \u0004\u01f3\u01f4\u0003"+
		"B!\u0000\u01f4\u01f6\u0005\u000f\u0000\u0000\u01f5\u01f7\u0005\u0014\u0000"+
		"\u0000\u01f6\u01f5\u0001\u0000\u0000\u0000\u01f6\u01f7\u0001\u0000\u0000"+
		"\u0000\u01f7\u01f8\u0001\u0000\u0000\u0000\u01f8\u01f9\u0007\u0007\u0000"+
		"\u0000\u01f9\u01fc\u0001\u0000\u0000\u0000\u01fa\u01fc\u0003B!\u0000\u01fb"+
		"\u01f0\u0001\u0000\u0000\u0000\u01fb\u01f3\u0001\u0000\u0000\u0000\u01fb"+
		"\u01fa\u0001\u0000\u0000\u0000\u01fc\u0203\u0001\u0000\u0000\u0000\u01fd"+
		"\u01fe\n\u0003\u0000\u0000\u01fe\u01ff\u0003J%\u0000\u01ff\u0200\u0003"+
		"@ \u0004\u0200\u0202\u0001\u0000\u0000\u0000\u0201\u01fd\u0001\u0000\u0000"+
		"\u0000\u0202\u0205\u0001\u0000\u0000\u0000\u0203\u0201\u0001\u0000\u0000"+
		"\u0000\u0203\u0204\u0001\u0000\u0000\u0000\u0204A\u0001\u0000\u0000\u0000"+
		"\u0205\u0203\u0001\u0000\u0000\u0000\u0206\u0207\u0006!\uffff\uffff\u0000"+
		"\u0207\u020a\u0003D\"\u0000\u0208\u020a\u00032\u0019\u0000\u0209\u0206"+
		"\u0001\u0000\u0000\u0000\u0209\u0208\u0001\u0000\u0000\u0000\u020a\u0223"+
		"\u0001\u0000\u0000\u0000\u020b\u020c\n\u0004\u0000\u0000\u020c\u020d\u0005"+
		"\u0005\u0000\u0000\u020d\u020e\u0003B!\u0000\u020e\u020f\u0005\u0002\u0000"+
		"\u0000\u020f\u0210\u0003B!\u0005\u0210\u0222\u0001\u0000\u0000\u0000\u0211"+
		"\u0212\n\u0003\u0000\u0000\u0212\u0213\u0003H$\u0000\u0213\u0214\u0003"+
		"B!\u0004\u0214\u0222\u0001\u0000\u0000\u0000\u0215\u0217\n\u0005\u0000"+
		"\u0000\u0216\u0218\u0005\u0014\u0000\u0000\u0217\u0216\u0001\u0000\u0000"+
		"\u0000\u0217\u0218\u0001\u0000\u0000\u0000\u0218\u0219\u0001\u0000\u0000"+
		"\u0000\u0219\u021b\u0005\u0012\u0000\u0000\u021a\u021c\u0005(\u0000\u0000"+
		"\u021b\u021a\u0001\u0000\u0000\u0000\u021b\u021c\u0001\u0000\u0000\u0000"+
		"\u021c\u021d\u0001\u0000\u0000\u0000\u021d\u021f\u0003B!\u0000\u021e\u0220"+
		"\u0005(\u0000\u0000\u021f\u021e\u0001\u0000\u0000\u0000\u021f\u0220\u0001"+
		"\u0000\u0000\u0000\u0220\u0222\u0001\u0000\u0000\u0000\u0221\u020b\u0001"+
		"\u0000\u0000\u0000\u0221\u0211\u0001\u0000\u0000\u0000\u0221\u0215\u0001"+
		"\u0000\u0000\u0000\u0222\u0225\u0001\u0000\u0000\u0000\u0223\u0221\u0001"+
		"\u0000\u0000\u0000\u0223\u0224\u0001\u0000\u0000\u0000\u0224C\u0001\u0000"+
		"\u0000\u0000\u0225\u0223\u0001\u0000\u0000\u0000\u0226\u0227\u0006\"\uffff"+
		"\uffff\u0000\u0227\u0238\u0003P(\u0000\u0228\u0238\u00030\u0018\u0000"+
		"\u0229\u022a\u0003F#\u0000\u022a\u022b\u0003D\"\u0004\u022b\u0238\u0001"+
		"\u0000\u0000\u0000\u022c\u022d\u00050\u0000\u0000\u022d\u0232\u0003@ "+
		"\u0000\u022e\u022f\u00052\u0000\u0000\u022f\u0231\u0003@ \u0000\u0230"+
		"\u022e\u0001\u0000\u0000\u0000\u0231\u0234\u0001\u0000\u0000\u0000\u0232"+
		"\u0230\u0001\u0000\u0000\u0000\u0232\u0233\u0001\u0000\u0000\u0000\u0233"+
		"\u0235\u0001\u0000\u0000\u0000\u0234\u0232\u0001\u0000\u0000\u0000\u0235"+
		"\u0236\u00051\u0000\u0000\u0236\u0238\u0001\u0000\u0000\u0000\u0237\u0226"+
		"\u0001\u0000\u0000\u0000\u0237\u0228\u0001\u0000\u0000\u0000\u0237\u0229"+
		"\u0001\u0000\u0000\u0000\u0237\u022c\u0001\u0000\u0000\u0000\u0238\u0243"+
		"\u0001\u0000\u0000\u0000\u0239\u023a\n\u0002\u0000\u0000\u023a\u023b\u0003"+
		"L&\u0000\u023b\u023c\u0003D\"\u0003\u023c\u0242\u0001\u0000\u0000\u0000"+
		"\u023d\u023e\n\u0001\u0000\u0000\u023e\u023f\u0003N\'\u0000\u023f\u0240"+
		"\u0003D\"\u0002\u0240\u0242\u0001\u0000\u0000\u0000\u0241\u0239\u0001"+
		"\u0000\u0000\u0000\u0241\u023d\u0001\u0000\u0000\u0000\u0242\u0245\u0001"+
		"\u0000\u0000\u0000\u0243\u0241\u0001\u0000\u0000\u0000\u0243\u0244\u0001"+
		"\u0000\u0000\u0000\u0244E\u0001\u0000\u0000\u0000\u0245\u0243\u0001\u0000"+
		"\u0000\u0000\u0246\u0247\u0007\b\u0000\u0000\u0247G\u0001\u0000\u0000"+
		"\u0000\u0248\u0257\u0005+\u0000\u0000\u0249\u0257\u0005,\u0000\u0000\u024a"+
		"\u0257\u0005-\u0000\u0000\u024b\u024c\u0005-\u0000\u0000\u024c\u0257\u0005"+
		"+\u0000\u0000\u024d\u024e\u0005,\u0000\u0000\u024e\u0257\u0005+\u0000"+
		"\u0000\u024f\u0250\u0005-\u0000\u0000\u0250\u0257\u0005,\u0000\u0000\u0251"+
		"\u0252\u0005.\u0000\u0000\u0252\u0257\u0005+\u0000\u0000\u0253\u0254\u0005"+
		"-\u0000\u0000\u0254\u0255\u0005+\u0000\u0000\u0255\u0257\u0005,\u0000"+
		"\u0000\u0256\u0248\u0001\u0000\u0000\u0000\u0256\u0249\u0001\u0000\u0000"+
		"\u0000\u0256\u024a\u0001\u0000\u0000\u0000\u0256\u024b\u0001\u0000\u0000"+
		"\u0000\u0256\u024d\u0001\u0000\u0000\u0000\u0256\u024f\u0001\u0000\u0000"+
		"\u0000\u0256\u0251\u0001\u0000\u0000\u0000\u0256\u0253\u0001\u0000\u0000"+
		"\u0000\u0257I\u0001\u0000\u0000\u0000\u0258\u0259\u0007\t\u0000\u0000"+
		"\u0259K\u0001\u0000\u0000\u0000\u025a\u025b\u0007\n\u0000\u0000\u025b"+
		"M\u0001\u0000\u0000\u0000\u025c\u025d\u0007\u000b\u0000\u0000\u025dO\u0001"+
		"\u0000\u0000\u0000\u025e\u0269\u0003R)\u0000\u025f\u0269\u0003T*\u0000"+
		"\u0260\u0261\u0005*\u0000\u0000\u0261\u0269\u0003T*\u0000\u0262\u0269"+
		"\u0003V+\u0000\u0263\u0269\u0005\u0125\u0000\u0000\u0264\u0266\u0005\u0014"+
		"\u0000\u0000\u0265\u0264\u0001\u0000\u0000\u0000\u0265\u0266\u0001\u0000"+
		"\u0000\u0000\u0266\u0267\u0001\u0000\u0000\u0000\u0267\u0269\u0007\f\u0000"+
		"\u0000\u0268\u025e\u0001\u0000\u0000\u0000\u0268\u025f\u0001\u0000\u0000"+
		"\u0000\u0268\u0260\u0001\u0000\u0000\u0000\u0268\u0262\u0001\u0000\u0000"+
		"\u0000\u0268\u0263\u0001\u0000\u0000\u0000\u0268\u0265\u0001\u0000\u0000"+
		"\u0000\u0269Q\u0001\u0000\u0000\u0000\u026a\u026c\u0005\u0128\u0000\u0000"+
		"\u026b\u026a\u0001\u0000\u0000\u0000\u026b\u026c\u0001\u0000\u0000\u0000"+
		"\u026c\u026d\u0001\u0000\u0000\u0000\u026d\u0270\u00053\u0000\u0000\u026e"+
		"\u0270\u0005\u0129\u0000\u0000\u026f\u026b\u0001\u0000\u0000\u0000\u026f"+
		"\u026e\u0001\u0000\u0000\u0000\u0270\u0272\u0001\u0000\u0000\u0000\u0271"+
		"\u0273\u00053\u0000\u0000\u0272\u0271\u0001\u0000\u0000\u0000\u0273\u0274"+
		"\u0001\u0000\u0000\u0000\u0274\u0272\u0001\u0000\u0000\u0000\u0274\u0275"+
		"\u0001\u0000\u0000\u0000\u0275S\u0001\u0000\u0000\u0000\u0276\u0277\u0007"+
		"\r\u0000\u0000\u0277U\u0001\u0000\u0000\u0000\u0278\u0279\u0007\u000e"+
		"\u0000\u0000\u0279W\u0001\u0000\u0000\u0000[Y]ciorux{\u0081\u0087\u0090"+
		"\u0093\u0097\u009a\u009e\u00a1\u00a3\u00ad\u00b5\u00bd\u00c2\u00cc\u00d5"+
		"\u00de\u00eb\u00f0\u00f6\u00fd\u0105\u010d\u0112\u0116\u0119\u0120\u0123"+
		"\u0126\u0128\u012b\u0133\u0136\u013b\u0140\u0148\u014b\u0150\u0156\u0158"+
		"\u0160\u0163\u0165\u0170\u0177\u017c\u017e\u0181\u0185\u0187\u018b\u0190"+
		"\u0197\u01a0\u01a6\u01b0\u01b3\u01b7\u01bb\u01d4\u01dc\u01e3\u01e7\u01ee"+
		"\u01f6\u01fb\u0203\u0209\u0217\u021b\u021f\u0221\u0223\u0232\u0237\u0241"+
		"\u0243\u0256\u0265\u0268\u026b\u026f\u0274";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}