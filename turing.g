 grammar turing;
 
  @header{
  package parser;
  import AST.*;
  import AST.expression.*;
  import AST.instruction.*;
  }
 
  @lexer::header{
  package parser;
  }
 
 ID  :	('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'0'..'9'|'_')*
 	;
 
 NUM 	:	('0'..'9') ('0'..'9')*
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
 	:	'#' 									{$result = new Valeur("");}
 		| 'zero' '(' e=expression ')'						{$result = new Cons('0', $e.result);}
 		| 'un' '(' e=expression ')' 						{$result = new Cons('1', $e.result);}
 		| 'last' '(' e=expression ')' 						{$result = new Last($e.result);}
 		| 'head' '(' e=expression ')' 						{$result = new Head($e.result);}
 		| n=ID 									{$result = Variable.newVariable($n.text);}
 		| n=NUM 								{$result = new Nombre($n.text);}
 		;
 
 instruction returns [Instruction result]
 	:	var=ID AFF e=expression 						{$result = new Affectation($var.text, $e.result);}
 		| 'if' '(' e1=expression '=' e2=expression ')' '{' li=instructions '}' 	{$result = new IF($e1.result, $e2.result, $li.result);}
 		| 'stop' 								{$result = new Stop();}
 		| 'while' '(' e=expression ')' '{' li=instructions '}' 			{$result = new WHILE($e.result, $li.result);}
 		| type=ID n=ID 								{$result = new VarDeclaration($n.text, $type.text);}
 		| 'typedef' type=ID 							{$result = new TypeDeclaration($type.text);}
 		| 'return' e=expression 						{$result = new RETURN($e.result);}
 	;
 
 instructions returns [Instructions result]
 	:	';' 									{$result = new Instructions();}
 		|i=instruction lia=instructions_aux 					{($lia.result).addFirst($i.result); $result = $lia.result;}
 	;
 
 instructions_aux returns [Instructions result]
 	: 	';' 									{$result = new Instructions();}
 		|';' li=instructions 							{$result = $li.result;}
 	;
 
 arguments returns [Arguments result]
 	:	type=ID n=ID 								{$result = Arguments.addCouple($n.text, $type.text, Arguments.empty);}
 		|									{$result = Arguments.empty;}
 		|type=ID n=ID ',' arg=arguments						{$result = Arguments.addCouple($n.text, $type.text, $arg.result);}
 	;
 
 program returns [Program result]
 	:	'input' '(' arg=arguments ')' '{' i=instructions '}' EOF 		{$result = new Program($arg.result, $i.result);}
 	;