 grammar turing;
 
 @header{
 package turing;
 import AST.*;
 }
 
 @lexer::header{
 package turing;
 }

ID  :	('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'0'..'9'|'_')*
    ;

COMMENT
    :   '//' ~('\n'|'\r')* '\r'? '\n' {$channel=HIDDEN;}
    |   '/*' ( options {greedy=false;} : . )* '*/' {$channel=HIDDEN;}
    ;

WS  :   ( ' '
        | '\t'
        | '\r'
        | '\n'
        ) {$channel=HIDDEN;}
    ;

AFF	:
	':=';
	
expression returns [Expression result]
	:	'#' {$result = new Valeur("");}
		| '0' '(' e=expression ')' {$result = new Cons('0', $e.result);}
		| '1' '(' e=expression ')' {$result = new Cons('1', $e.result);}
		| 'last' '(' e=expression ')' {$result = new Last($e.result);}
		| 'head' '(' e=expression ')' {$result = new }
		| n=ID {$result = Variable.init($n.text);}
		;

instruction returns [Instruction result]
	:	n=ID AFF e=expression {$result = new Affectation(Variable.init($n.text), $e.result);}
		| 'if' '(' e1=expression '=' e2=expression ')' '{' li=instructions '}' {$result = new IF($e1.result, $e2.result, $li.result);}
		| 'stop' {$result = new Stop();}
		| 'while' '(' e=expression ')' '{' li=instructions '}' {$result = new WHILE($e.result, $li.result);}
	;
	
instructions returns [Instructions result]
	:	';' {$result = new Instructions();}
		|i=instruction lia=instructions_aux {($lia.result).addFirst($i.result); $result = $lia.result;}
	;
	
instructions_aux returns [Instructions result]
	: 	';' {$result = new Instructions();}
		|';' li=instructions {$result = $li.result;}
	;
	
arguments returns [Arguments result]
	:	n=ID {$result = new Arguments(Variable.init($n.text));}
		|n=ID ',' arg=arguments{($arg.result).addFirst(Variable.init($n.text)); $result = $arg.result;}
	;

program returns [Program result]
	:	'input' '(' arg=arguments ')' '{' i=instructions 'return' id=ID '}' EOF {$result = new Program($arg.result, $i.result, Variable.init($id.text));}
	;