


parser grammar SQLParser;

@header {
package ecwid.parser;
}


options {
    tokenVocab = SQLLexer;
}


root
    : selectStatement? (MINUS MINUS)? EOF
    ;

selectStatement
    : querySpecification  # simpleSelect
    | queryExpression     # parenthesisSelect
    ;
    
    
    
querySpecification
    : SELECT selectSpec* selectElements fromClause whereClause? groupByClause? havingClause? orderByClause? limitClause?
    ;
       
selectSpec
    : (ALL | DISTINCT)
    ; 

selectElements
    : (STAR | selectElement) (',' selectElement)*   # projectionElement
    ;    
 
selectElement
    : fullId '.' STAR                              
    | fullColumnName (AS? uid)?                   
    | functionCall (AS? uid)?                      
    | expression (AS? uid)?                        
     ; 
    
queryExpression
    : '(' querySpecification ')'
    | '(' queryExpression ')'
    ;
    
fromClause
    : FROM tableSource (',' tableSource)* 
//    | FROM (tableSources ',')? LR_BRACKET selectStatement RR_BRACKET (uid)? (',' tableSources)?       
       ;  

tableSources
    : tableSource (',' tableSource)*
    ;


whereClause
    : WHERE NOT? EXISTS LR_BRACKET selectStatement RR_BRACKET
    | WHERE expression NOT? IN LR_BRACKET selectStatement RR_BRACKET
    | WHERE expression
    ; 
    
groupByClause
    : GROUP BY expression  (',' expression )* 
    ;    

havingClause
    : HAVING  expression
    ;

orderByClause
    : ORDER BY orderByExpression (',' orderByExpression)*
    ;
    
orderByExpression
    : expression (ASC | DESC)?
    ;    
    
limitClause
    : LIMIT (
        (offset = limitClauseAtom ',')? limit = limitClauseAtom
        | limit = limitClauseAtom OFFSET offset = limitClauseAtom
    )					# limitClauseElement
    ;
    
limitClauseAtom
   : DECIMAL_LITERAL
    ;
    

    
tableSource
    : tableSourceItem joinPart*         # tableSourceBase
    | '(' tableSourceItem joinPart* ')' # tableSourceNested
    ; 
    
tableSourceItem
    : tableName  (AS? alias =uid)?  # atomTableItem
    | (selectStatement | '(' parenthesisSubquery = selectStatement ')') AS? alias = uid?       # subqueryTableItem
    ;    
    
joinPart
    : (INNER)? JOIN (LR_BRACKET selectStatement RR_BRACKET | tableSourceItem) (alias =uid)? joinSpec*      
    | (LEFT | RIGHT) OUTER? JOIN (LR_BRACKET selectStatement RR_BRACKET | tableSourceItem) (alias =uid)? joinSpec* 
    | NATURAL ((LEFT | RIGHT) OUTER?)? JOIN (LR_BRACKET selectStatement RR_BRACKET | tableSourceItem) (alias =uid)?        
    ;

joinSpec
    : (ON expression)
    ;

       
tableName
    : fullId
    ;   
      
      
//    DB Objects

fullId
    : uid (DOT_ID | '.' uid)?
    ;  
    
    
uid
    :  STRING_LITERAL     
    |  COLUMN_LITERAL
    ;    
      
    
dottedId
    : DOT_ID
    | '.' uid
    ;    
    
fullColumnName
    : uid (dottedId dottedId?)?
    | .? dottedId dottedId?
    ;    
    
//    Functions

functionCall
    : specificFunction                         # specificFunctionCall
    | aggregateFunction                # aggregateFunctionCall
    ;
   
specificFunction
    :  scalarFunctionName '(' functionArgs? ')' 
    ;   
   
aggregateFunction
    : (AVG | MAX | MIN | SUM) '(' aggregator = (ALL | DISTINCT)? functionArg ')' 
    | COUNT '(' (
        STAR
        | functionArg
    ) ')' 
     
    | GROUP_CONCAT '(' aggregator = DISTINCT? functionArgs (
        ORDER BY orderByExpression (',' orderByExpression)*
    )? (SEPARATOR separator = STRING_LITERAL)? ')'
    ;    
  
  scalarFunctionName
    : functionNameBase
    | ASCII
    | CURDATE
    | CURRENT_DATE
    | CURRENT_TIME
    | CURRENT_TIMESTAMP
    | CURTIME
    | DATE_ADD
    | DATE_SUB
    | IF
    | LOCALTIME
    | LOCALTIMESTAMP
    | MID
    | NOW
    | REPEAT
    | REPLACE
    | SUBSTR
    | SUBSTRING
    | SYSDATE
    | TRIM
    | UTC_DATE
    | UTC_TIME
    | UTC_TIMESTAMP
    ;
  
  functionNameBase
    : ABS
    | ACOS
    | ADDDATE
    | ADDTIME
    | AREA
    | ASBINARY
    | ASIN
    | ASTEXT
    | ASWKB
    | ASWKT
    | ATAN
    | ATAN2
    | BENCHMARK
    | BIN
    | BIT_COUNT
    | BIT_LENGTH
    | BUFFER
    | CEIL
    | CEILING
    | CENTROID
    | CHARACTER_LENGTH
    | CHARSET
    | CHAR_LENGTH
    | COERCIBILITY
    | COLLATION
    | COMPRESS
    | CONCAT
    | CONCAT_WS
    | CONNECTION_ID
    | CONV
    | CONVERT_TZ
    | COS
    | COT
    | COUNT
    | CUME_DIST
    | DATABASE
    | DATE
    | DATEDIFF
    | DATE_FORMAT
    | DAY
    | DAYNAME
    | DAYOFMONTH
    | DAYOFWEEK
    | DAYOFYEAR
    | DECODE
    | DEGREES
    | DENSE_RANK
    | DES_DECRYPT
    | DES_ENCRYPT
    | DIMENSION
    | DISJOINT
    | ELT
    | ENCODE
    | ENCRYPT
    | ENDPOINT
    | ENVELOPE
    | EQUALS
    | EXP
    | EXPORT_SET
    | EXTERIORRING
    | EXTRACTVALUE
    | FIELD
    | FIND_IN_SET
    | FIRST_VALUE
    | FLOOR
    | FORMAT
    | FOUND_ROWS
    | FROM_BASE64
    | FROM_DAYS
    | FROM_UNIXTIME
    | GLENGTH
    | GREATEST
    | GTID_SUBSET
    | GTID_SUBTRACT
    | HEX
    | HOUR
    | IFNULL
    | INET6_ATON
    | INET6_NTOA
    | INET_ATON
    | INET_NTOA
    | INSTR
    | INTERIORRINGN
    | INTERSECTS
    | INVISIBLE
    | ISCLOSED
    | ISEMPTY
    | ISNULL
    | ISSIMPLE
    | IS_FREE_LOCK
    | IS_IPV4
    | IS_IPV4_COMPAT
    | IS_IPV4_MAPPED
    | IS_IPV6
    | IS_USED_LOCK
    | LAG
    | LAST_INSERT_ID
    | LAST_VALUE
    | LCASE
    | LEAD
    | LEAST
    | LEFT
    | LENGTH
    | LINEFROMTEXT
    | LINEFROMWKB
    | LINESTRING
    | LINESTRINGFROMTEXT
    | LINESTRINGFROMWKB
    | LN
    | LOAD_FILE
    | LOCATE
    | LOG
    | LOG10
    | LOG2
    | LOWER
    | LPAD
    | LTRIM
    | MAKEDATE
    | MAKETIME
    | MAKE_SET
    | MASTER_POS_WAIT
    | MBRCONTAINS
    | MBRDISJOINT
    | MBREQUAL
    | MBRINTERSECTS
    | MBROVERLAPS
    | MBRTOUCHES
    | MBRWITHIN
    | MICROSECOND
    | MINUTE
    | MLINEFROMTEXT
    | MLINEFROMWKB
    | MOD
    | MONTH
    | MONTHNAME
    | NAME_CONST
    | NTH_VALUE
    | NTILE
    | NULLIF
    | NUMGEOMETRIES
    | NUMINTERIORRINGS
    | NUMPOINTS
    | OCT
    | OCTET_LENGTH
    | ORD
    | OVERLAPS
    | PERCENT_RANK
    | PERIOD_ADD
    | PERIOD_DIFF
    | PI
    | POSITION
    | POW
    | POWER
    | QUARTER
    | QUOTE
    | RADIANS
    | RAND
    | RANDOM
    | RANK
    | RANDOM_BYTES
    | RELEASE_LOCK
    | REVERSE
    | RIGHT
    | ROUND
    | ROW_COUNT
    | ROW_NUMBER
    | RPAD
    | RTRIM
    | SCHEMA
    | SECOND
    | SEC_TO_TIME
    | SIGN
    | SIN
    | SOUNDEX
    | SQRT
    | SRID
    | STDDEV
    | STDDEV_POP
    | STDDEV_SAMP
    | STRCMP
    | STR_TO_DATE
    | SUBDATE
    | SUBSTRING_INDEX
    | SUBTIME
    | SYSTEM_USER
    | TAN
    | TIME
    | TIMEDIFF
    | TIMESTAMP
    | TIMESTAMPADD
    | TIMESTAMPDIFF
    | TIME_FORMAT
    | TIME_TO_SEC
    | TOUCHES
    | TO_BASE64
    | TO_DAYS
    | TO_SECONDS
    | UCASE
    | UNCOMPRESS
    | UNCOMPRESSED_LENGTH
    | UNHEX
    | UNIX_TIMESTAMP
    | UPDATEXML
    | UPPER
    | UUID
    | UUID_SHORT
    | VALIDATE_PASSWORD_STRENGTH
    | VERSION
    | VISIBLE
    | WAIT_UNTIL_SQL_THREAD_AFTER_GTIDS
    | WEEK
    | WEEKDAY
    | WEEKOFYEAR
    | WEIGHT_STRING
    | WITHIN
    | YEAR
    | YEARWEEK
    ;
  
  
  functionArgs
    : (constant | fullColumnName | functionCall | expression) (
        ',' (constant | fullColumnName | functionCall | expression)
    )*
    ;
    
    
    
functionArg
    : constant
    | fullColumnName
    | functionCall
    | expression
    ;
        
 // expression
 
expression
    : notOperator =  (NOT | '!') expression                   # notExpression
    | expression logicalOperator expression                  # logicalExpression
    | predicate IS NOT? testValue = (TRUE | FALSE | NULL)    # isExpression
    | predicate                                              # predicateExpression
    ;  
    
predicate
    : predicate NOT? LIKE ('%')?predicate('%')?                               # likePredicate                                 
    | predicate BETWEEN predicate AND  predicate                              # betweenPredicate                                 
    | left = predicate comparisonOperator right = predicate                                # binaryComparisonPredicate                                                      
    | expressionAtom 																	   # expressionAtomPredicate
    | functionCall                                                                         # functionCallPredicate 
    ;  
    
expressionAtom
    : constant                                                  # constantExpressionAtom
    | fullColumnName                                            # fullColumnNameExpressionAtom
    | unaryOperator expressionAtom                              # unaryExpressionAtom
    | LR_BRACKET expression (',' expression)* RR_BRACKET                      # nestedExpressionAtom
    | left = expressionAtom multOperator right = expressionAtom # mathExpressionAtom
    | left = expressionAtom addOperator right = expressionAtom  # mathExpressionAtom
    ;
        
unaryOperator
    : '!'
    | '+'
    | '-'
    | NOT
    ;

comparisonOperator
    : '='
    | '>'
    | '<'
    | '<' '='
    | '>' '='
    | '<' '>'
    | '!' '='
    | '<' '=' '>'
    ;

logicalOperator
    : AND
    | OR
    ;
  
multOperator
    : '*'
    | '/'
    ;

addOperator
    : '+'
    | '-'
    ;
      
//    Literals
constant
    : stringLiteral
    | decimalLiteral
    | '-' decimalLiteral
    | booleanLiteral
    | REAL_LITERAL
    | NOT? nullLiteral = (NULL_LITERAL | NULL_SPEC_LITERAL)
    ; 
    
    
stringLiteral
    : (STRING_CHARSET_NAME? STRING_LITERAL | START_NATIONAL_STRING_LITERAL) STRING_LITERAL+
    ; 
    
    
decimalLiteral
    : DECIMAL_LITERAL
    | ZERO_DECIMAL
    | ONE_DECIMAL
    | TWO_DECIMAL
    | REAL_LITERAL
    ;   
    
booleanLiteral
    : TRUE
    | FALSE
    ;   
                      