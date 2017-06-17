grammar miniC;

start
    :   lib? initial? EOF
    ;

lib
    :   '#include' Lib
    ;

initial
    :   'int main()' blockItemList
    ;

blockItemList
    :   LeftBrace (blockItem)* RightBrace
    ;

blockItem
    :   blockItemList
    |   selectionStat
    |   iterationStat
    |   assigmentStat
    |   arithmeticStat
    |   inOutStat
    |   varibleDecl
    |   constDecl
    |   ';'
    ;

selectionStat
    :   If  expression RightParen stat elseStat?
    ;

iterationStat
    :   While expression RightParen stat
    ;

assigmentStat
    :   Word Assign (Word|Number) ';'
    ;

varibleDecl
    :   Identifier Word (Assign (Word|Number))? ';'
    ;

arithmeticStat
    :   Word Assign (Word|Number) ArithmeticOperation (Word|Number) ';'
    ;

inOutStat
    :   scanf
    |   printf
    ;

constDecl
    :   Const Identifier Word Assign (Word|Number) ';'
    ;

expression
    :   (Word|Number) RelationalOperation (Word|Number)
    ;

scanf
    :   'scanf' LeftParen '"' scanVar '"' (',' '&' Word)+ RightParen ';'
    ;

printf
    :   'printf' LeftParen '"' (variables_1)* '"' (variables_2)* RightParen ';'
    ;

stat
    :   block
    |   assigmentStat
    |   arithmeticStat
    |   inOutStat
//    |   '{' (assigmentStat)+ '}'
    ;

block
    :   '{' stat* '}'
    ;

elseStat
    :   Else stat
    ;

scanVar
    :   scanParam+
    ;

scanParam
    :   Param
    ;

variables_1
    :   printParam
    |   printWord
    ;

variables_2
    :   ',' Word|Number
    ;

printParam
    :   Param
    ;

printWord
    :   (Word)+
    ;

Identifier
    :   Int
    |   Float
    |   Long
    |   Short
    |   Double
    ;

RelationalOperation
    :   Less
    |   LessEqual
    |   Greater
    |   GreaterEqual
    |   Equal
    |   NotEqual
    ;

ArithmeticOperation
    :   Plus
    |   Minus
    |   Star
    |   Div
    |   Mod
    ;

LogicalOperation
    :   And
    |   Or
    |   Not
    ;

Else
    :   'else'
    |   'else '
    ;

While
    :   'while('
    |   'while ' LeftParen
    ;

If
    :   'if('
    |   'if ' LeftParen
    ;

Word
    :   Nondigit
        (   Nondigit
        |   Digit
        )*
    ;

Number
    :   Digit
    |   [1-9] (Digit)+
    ;

Floating
    :   Number '.'(Digit)+
    ;

Lib: '<stdio.h>';
Param: ('%d'|'%f');
Less : '<';
LessEqual : '<=';
Greater : '>';
GreaterEqual : '>=';
Equal : '==';
NotEqual : '!=';
And : '&&';
Or : '||';
Not : '!';
Plus : '+';
Minus : '-';
Star : '*';
Div : '/';
Mod : '%';
Assign : '=';
Const : 'const ';
Double : 'double';
Float : 'float';
Int : 'int';
Long : 'long';
Short : 'short';
LeftParen : '(';
RightParen : ')';
LeftBrace : '{';
RightBrace : '}';
Semi : ';';
Comma : ',';
QuotationMarks: '"';

fragment
Nondigit
    :   [a-zA-Z_]
    ;

fragment
Digit
    :   [0-9]
    ;

Whitespace
    :   [ \t]+
        -> skip
    ;
Newline
    :   (   '\r' '\n'?
        |   '\n'
        )
        -> skip
    ;
BlockComment
    :   '/*' .*? '*/'
        -> skip
    ;
LineComment
    :   '//' ~[\r\n]*
        -> skip
    ;