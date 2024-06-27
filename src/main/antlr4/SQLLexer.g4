


lexer grammar SQLLexer;

@header {
package ecwid.parser;
}

options {
    caseInsensitive = true;
}



// Keywords
// Common Keywords

ALL                           : 'ALL';
AND                           : 'AND';
ASC                           : 'ASC';
AS                            : 'AS';
BETWEEN						  : 'BETWEEN'; 
BY                            : 'BY';
DESC                          : 'DESC';
DISTINCT                      : 'DISTINCT';
EXISTS                        : 'EXISTS';

FROM                          : 'FROM';

GROUP                         : 'GROUP';
HAVING                        : 'HAVING';
IFNULL                        : 'IFNULL';

IN                            : 'IN';
IS                            : 'IS';

JOIN                          : 'JOIN';

LEFT                          : 'LEFT';
LIKE                          : 'LIKE';
LIMIT                         : 'LIMIT';

NOT                           : 'NOT';
NULL                          : 'NULL';

ON                            : 'ON';

OR                            : 'OR';
ORDER                         : 'ORDER';

OUTER                         : 'OUTER';


RIGHT                         : 'RIGHT';

SELECT                        : 'SELECT';
STDDEV                        : 'STDDEV';
STDDEV_POP                    : 'STDDEV_POP';
STDDEV_SAMP                   : 'STDDEV_SAMP';

TRUE                          : 'TRUE';

WHERE                         : 'WHERE';



// Group function Keywords

AVG          : 'AVG';

COUNT        : 'COUNT';

MAX          : 'MAX';
MIN          : 'MIN';

SUM          : 'SUM';


// Operators. Arithmetics

STAR   : '*';
DIVIDE : '/';
MODULE : '%';
PLUS   : '+';
MINUS  : '-';

// Operators. Comparation

EQUAL_SYMBOL       : '=';
GREATER_SYMBOL     : '>';
LESS_SYMBOL        : '<';
EXCLAMATION_SYMBOL : '!';



// Constructors symbols

DOT                : '.';
LR_BRACKET         : '(';
RR_BRACKET         : ')';
COMMA              : ',';

STRING_LITERAL:
       [A-Za-z]+  
       ;
DECIMAL_LITERAL: 
        [0-9]+
        ;
               
COLUMN_LITERAL:
       [A-Za-z0-9_]+  
       ;




       