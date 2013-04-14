// $ANTLR 3.5 /Users/hubert/Dropbox/projects/antlc/turing.g 2013-04-14 20:42:55

  package parser;
  import AST.*;
  import AST.expression.*;
  import AST.instruction.*;
  

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class turingParser extends Parser {
	public static final String[] tokenNames = new String[] {
		"<invalid>", "<EOR>", "<DOWN>", "<UP>", "AFF", "COMMENT", "ID", "NUM", 
		"WS", "'#'", "'('", "')'", "','", "';'", "'='", "'head'", "'if'", "'input'", 
		"'last'", "'return'", "'stop'", "'typedef'", "'un'", "'while'", "'zero'", 
		"'{'", "'}'"
	};
	public static final int EOF=-1;
	public static final int T__9=9;
	public static final int T__10=10;
	public static final int T__11=11;
	public static final int T__12=12;
	public static final int T__13=13;
	public static final int T__14=14;
	public static final int T__15=15;
	public static final int T__16=16;
	public static final int T__17=17;
	public static final int T__18=18;
	public static final int T__19=19;
	public static final int T__20=20;
	public static final int T__21=21;
	public static final int T__22=22;
	public static final int T__23=23;
	public static final int T__24=24;
	public static final int T__25=25;
	public static final int T__26=26;
	public static final int AFF=4;
	public static final int COMMENT=5;
	public static final int ID=6;
	public static final int NUM=7;
	public static final int WS=8;

	// delegates
	public Parser[] getDelegates() {
		return new Parser[] {};
	}

	// delegators


	public turingParser(TokenStream input) {
		this(input, new RecognizerSharedState());
	}
	public turingParser(TokenStream input, RecognizerSharedState state) {
		super(input, state);
	}

	@Override public String[] getTokenNames() { return turingParser.tokenNames; }
	@Override public String getGrammarFileName() { return "/Users/hubert/Dropbox/projects/antlc/turing.g"; }



	// $ANTLR start "expression"
	// /Users/hubert/Dropbox/projects/antlc/turing.g:35:2: expression returns [Expression result] : ( '#' | 'zero' '(' e= expression ')' | 'un' '(' e= expression ')' | 'last' '(' e= expression ')' | 'head' '(' e= expression ')' |n= ID |n= NUM );
	public final Expression expression() throws RecognitionException {
		Expression result = null;


		Token n=null;
		Expression e =null;

		try {
			// /Users/hubert/Dropbox/projects/antlc/turing.g:36:3: ( '#' | 'zero' '(' e= expression ')' | 'un' '(' e= expression ')' | 'last' '(' e= expression ')' | 'head' '(' e= expression ')' |n= ID |n= NUM )
			int alt1=7;
			switch ( input.LA(1) ) {
			case 9:
				{
				alt1=1;
				}
				break;
			case 24:
				{
				alt1=2;
				}
				break;
			case 22:
				{
				alt1=3;
				}
				break;
			case 18:
				{
				alt1=4;
				}
				break;
			case 15:
				{
				alt1=5;
				}
				break;
			case ID:
				{
				alt1=6;
				}
				break;
			case NUM:
				{
				alt1=7;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 1, 0, input);
				throw nvae;
			}
			switch (alt1) {
				case 1 :
					// /Users/hubert/Dropbox/projects/antlc/turing.g:36:5: '#'
					{
					match(input,9,FOLLOW_9_in_expression222); 
					result = new Valeur("");
					}
					break;
				case 2 :
					// /Users/hubert/Dropbox/projects/antlc/turing.g:37:6: 'zero' '(' e= expression ')'
					{
					match(input,24,FOLLOW_24_in_expression240); 
					match(input,10,FOLLOW_10_in_expression242); 
					pushFollow(FOLLOW_expression_in_expression246);
					e=expression();
					state._fsp--;

					match(input,11,FOLLOW_11_in_expression248); 
					result = new Cons('0', e);
					}
					break;
				case 3 :
					// /Users/hubert/Dropbox/projects/antlc/turing.g:38:6: 'un' '(' e= expression ')'
					{
					match(input,22,FOLLOW_22_in_expression262); 
					match(input,10,FOLLOW_10_in_expression264); 
					pushFollow(FOLLOW_expression_in_expression268);
					e=expression();
					state._fsp--;

					match(input,11,FOLLOW_11_in_expression270); 
					result = new Cons('1', e);
					}
					break;
				case 4 :
					// /Users/hubert/Dropbox/projects/antlc/turing.g:39:6: 'last' '(' e= expression ')'
					{
					match(input,18,FOLLOW_18_in_expression285); 
					match(input,10,FOLLOW_10_in_expression287); 
					pushFollow(FOLLOW_expression_in_expression291);
					e=expression();
					state._fsp--;

					match(input,11,FOLLOW_11_in_expression293); 
					result = new Last(e);
					}
					break;
				case 5 :
					// /Users/hubert/Dropbox/projects/antlc/turing.g:40:6: 'head' '(' e= expression ')'
					{
					match(input,15,FOLLOW_15_in_expression308); 
					match(input,10,FOLLOW_10_in_expression310); 
					pushFollow(FOLLOW_expression_in_expression314);
					e=expression();
					state._fsp--;

					match(input,11,FOLLOW_11_in_expression316); 
					result = new Head(e);
					}
					break;
				case 6 :
					// /Users/hubert/Dropbox/projects/antlc/turing.g:41:6: n= ID
					{
					n=(Token)match(input,ID,FOLLOW_ID_in_expression333); 
					result = Variable.newVariable((n!=null?n.getText():null));
					}
					break;
				case 7 :
					// /Users/hubert/Dropbox/projects/antlc/turing.g:42:6: n= NUM
					{
					n=(Token)match(input,NUM,FOLLOW_NUM_in_expression353); 
					result = new Nombre((n!=null?n.getText():null));
					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return result;
	}
	// $ANTLR end "expression"



	// $ANTLR start "instruction"
	// /Users/hubert/Dropbox/projects/antlc/turing.g:45:2: instruction returns [Instruction result] : (var= ID AFF e= expression | 'if' '(' e1= expression '=' e2= expression ')' '{' li= instructions '}' | 'stop' | 'while' '(' e= expression ')' '{' li= instructions '}' |type= ID n= ID | 'typedef' type= ID | 'return' e= expression );
	public final Instruction instruction() throws RecognitionException {
		Instruction result = null;


		Token var=null;
		Token type=null;
		Token n=null;
		Expression e =null;
		Expression e1 =null;
		Expression e2 =null;
		Instructions li =null;

		try {
			// /Users/hubert/Dropbox/projects/antlc/turing.g:46:3: (var= ID AFF e= expression | 'if' '(' e1= expression '=' e2= expression ')' '{' li= instructions '}' | 'stop' | 'while' '(' e= expression ')' '{' li= instructions '}' |type= ID n= ID | 'typedef' type= ID | 'return' e= expression )
			int alt2=7;
			switch ( input.LA(1) ) {
			case ID:
				{
				int LA2_1 = input.LA(2);
				if ( (LA2_1==AFF) ) {
					alt2=1;
				}
				else if ( (LA2_1==ID) ) {
					alt2=5;
				}

				else {
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 2, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			case 16:
				{
				alt2=2;
				}
				break;
			case 20:
				{
				alt2=3;
				}
				break;
			case 23:
				{
				alt2=4;
				}
				break;
			case 21:
				{
				alt2=6;
				}
				break;
			case 19:
				{
				alt2=7;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 2, 0, input);
				throw nvae;
			}
			switch (alt2) {
				case 1 :
					// /Users/hubert/Dropbox/projects/antlc/turing.g:46:5: var= ID AFF e= expression
					{
					var=(Token)match(input,ID,FOLLOW_ID_in_instruction385); 
					match(input,AFF,FOLLOW_AFF_in_instruction387); 
					pushFollow(FOLLOW_expression_in_instruction391);
					e=expression();
					state._fsp--;

					result = new Affectation((var!=null?var.getText():null), e);
					}
					break;
				case 2 :
					// /Users/hubert/Dropbox/projects/antlc/turing.g:47:6: 'if' '(' e1= expression '=' e2= expression ')' '{' li= instructions '}'
					{
					match(input,16,FOLLOW_16_in_instruction406); 
					match(input,10,FOLLOW_10_in_instruction408); 
					pushFollow(FOLLOW_expression_in_instruction412);
					e1=expression();
					state._fsp--;

					match(input,14,FOLLOW_14_in_instruction414); 
					pushFollow(FOLLOW_expression_in_instruction418);
					e2=expression();
					state._fsp--;

					match(input,11,FOLLOW_11_in_instruction420); 
					match(input,25,FOLLOW_25_in_instruction422); 
					pushFollow(FOLLOW_instructions_in_instruction426);
					li=instructions();
					state._fsp--;

					match(input,26,FOLLOW_26_in_instruction428); 
					result = new IF(e1, e2, li);
					}
					break;
				case 3 :
					// /Users/hubert/Dropbox/projects/antlc/turing.g:48:6: 'stop'
					{
					match(input,20,FOLLOW_20_in_instruction438); 
					result = new Stop();
					}
					break;
				case 4 :
					// /Users/hubert/Dropbox/projects/antlc/turing.g:49:6: 'while' '(' e= expression ')' '{' li= instructions '}'
					{
					match(input,23,FOLLOW_23_in_instruction455); 
					match(input,10,FOLLOW_10_in_instruction457); 
					pushFollow(FOLLOW_expression_in_instruction461);
					e=expression();
					state._fsp--;

					match(input,11,FOLLOW_11_in_instruction463); 
					match(input,25,FOLLOW_25_in_instruction465); 
					pushFollow(FOLLOW_instructions_in_instruction469);
					li=instructions();
					state._fsp--;

					match(input,26,FOLLOW_26_in_instruction471); 
					result = new WHILE(e, li);
					}
					break;
				case 5 :
					// /Users/hubert/Dropbox/projects/antlc/turing.g:50:6: type= ID n= ID
					{
					type=(Token)match(input,ID,FOLLOW_ID_in_instruction485); 
					n=(Token)match(input,ID,FOLLOW_ID_in_instruction489); 
					result = new VarDeclaration((n!=null?n.getText():null), (type!=null?type.getText():null));
					}
					break;
				case 6 :
					// /Users/hubert/Dropbox/projects/antlc/turing.g:51:6: 'typedef' type= ID
					{
					match(input,21,FOLLOW_21_in_instruction506); 
					type=(Token)match(input,ID,FOLLOW_ID_in_instruction510); 
					result = new TypeDeclaration((type!=null?type.getText():null));
					}
					break;
				case 7 :
					// /Users/hubert/Dropbox/projects/antlc/turing.g:52:6: 'return' e= expression
					{
					match(input,19,FOLLOW_19_in_instruction526); 
					pushFollow(FOLLOW_expression_in_instruction530);
					e=expression();
					state._fsp--;

					result = new RETURN(e);
					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return result;
	}
	// $ANTLR end "instruction"



	// $ANTLR start "instructions"
	// /Users/hubert/Dropbox/projects/antlc/turing.g:55:2: instructions returns [Instructions result] : ( ';' |i= instruction lia= instructions_aux );
	public final Instructions instructions() throws RecognitionException {
		Instructions result = null;


		Instruction i =null;
		Instructions lia =null;

		try {
			// /Users/hubert/Dropbox/projects/antlc/turing.g:56:3: ( ';' |i= instruction lia= instructions_aux )
			int alt3=2;
			int LA3_0 = input.LA(1);
			if ( (LA3_0==13) ) {
				alt3=1;
			}
			else if ( (LA3_0==ID||LA3_0==16||(LA3_0 >= 19 && LA3_0 <= 21)||LA3_0==23) ) {
				alt3=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 3, 0, input);
				throw nvae;
			}

			switch (alt3) {
				case 1 :
					// /Users/hubert/Dropbox/projects/antlc/turing.g:56:5: ';'
					{
					match(input,13,FOLLOW_13_in_instructions557); 
					result = new Instructions();
					}
					break;
				case 2 :
					// /Users/hubert/Dropbox/projects/antlc/turing.g:57:5: i= instruction lia= instructions_aux
					{
					pushFollow(FOLLOW_instruction_in_instructions576);
					i=instruction();
					state._fsp--;

					pushFollow(FOLLOW_instructions_aux_in_instructions580);
					lia=instructions_aux();
					state._fsp--;

					(lia).addFirst(i); result = lia;
					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return result;
	}
	// $ANTLR end "instructions"



	// $ANTLR start "instructions_aux"
	// /Users/hubert/Dropbox/projects/antlc/turing.g:60:2: instructions_aux returns [Instructions result] : ( ';' | ';' li= instructions );
	public final Instructions instructions_aux() throws RecognitionException {
		Instructions result = null;


		Instructions li =null;

		try {
			// /Users/hubert/Dropbox/projects/antlc/turing.g:61:3: ( ';' | ';' li= instructions )
			int alt4=2;
			int LA4_0 = input.LA(1);
			if ( (LA4_0==13) ) {
				int LA4_1 = input.LA(2);
				if ( (LA4_1==26) ) {
					alt4=1;
				}
				else if ( (LA4_1==ID||LA4_1==13||LA4_1==16||(LA4_1 >= 19 && LA4_1 <= 21)||LA4_1==23) ) {
					alt4=2;
				}

				else {
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 4, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 4, 0, input);
				throw nvae;
			}

			switch (alt4) {
				case 1 :
					// /Users/hubert/Dropbox/projects/antlc/turing.g:61:6: ';'
					{
					match(input,13,FOLLOW_13_in_instructions_aux607); 
					result = new Instructions();
					}
					break;
				case 2 :
					// /Users/hubert/Dropbox/projects/antlc/turing.g:62:5: ';' li= instructions
					{
					match(input,13,FOLLOW_13_in_instructions_aux624); 
					pushFollow(FOLLOW_instructions_in_instructions_aux628);
					li=instructions();
					state._fsp--;

					result = li;
					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return result;
	}
	// $ANTLR end "instructions_aux"



	// $ANTLR start "arguments"
	// /Users/hubert/Dropbox/projects/antlc/turing.g:65:2: arguments returns [Arguments result] : (type= ID n= ID ||type= ID n= ID ',' arg= arguments );
	public final Arguments arguments() throws RecognitionException {
		Arguments result = null;


		Token type=null;
		Token n=null;
		Arguments arg =null;

		try {
			// /Users/hubert/Dropbox/projects/antlc/turing.g:66:3: (type= ID n= ID ||type= ID n= ID ',' arg= arguments )
			int alt5=3;
			int LA5_0 = input.LA(1);
			if ( (LA5_0==ID) ) {
				int LA5_1 = input.LA(2);
				if ( (LA5_1==ID) ) {
					int LA5_3 = input.LA(3);
					if ( (LA5_3==12) ) {
						alt5=3;
					}
					else if ( (LA5_3==11) ) {
						alt5=1;
					}

					else {
						int nvaeMark = input.mark();
						try {
							for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++) {
								input.consume();
							}
							NoViableAltException nvae =
								new NoViableAltException("", 5, 3, input);
							throw nvae;
						} finally {
							input.rewind(nvaeMark);
						}
					}

				}

				else {
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 5, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

			}
			else if ( (LA5_0==11) ) {
				alt5=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 5, 0, input);
				throw nvae;
			}

			switch (alt5) {
				case 1 :
					// /Users/hubert/Dropbox/projects/antlc/turing.g:66:5: type= ID n= ID
					{
					type=(Token)match(input,ID,FOLLOW_ID_in_arguments658); 
					n=(Token)match(input,ID,FOLLOW_ID_in_arguments662); 
					result = Arguments.addCouple((n!=null?n.getText():null), (type!=null?type.getText():null), Arguments.empty);
					}
					break;
				case 2 :
					// /Users/hubert/Dropbox/projects/antlc/turing.g:67:14: 
					{
					result = Arguments.empty;
					}
					break;
				case 3 :
					// /Users/hubert/Dropbox/projects/antlc/turing.g:68:5: type= ID n= ID ',' arg= arguments
					{
					type=(Token)match(input,ID,FOLLOW_ID_in_arguments695); 
					n=(Token)match(input,ID,FOLLOW_ID_in_arguments699); 
					match(input,12,FOLLOW_12_in_arguments701); 
					pushFollow(FOLLOW_arguments_in_arguments705);
					arg=arguments();
					state._fsp--;

					result = Arguments.addCouple((n!=null?n.getText():null), (type!=null?type.getText():null), arg);
					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return result;
	}
	// $ANTLR end "arguments"



	// $ANTLR start "program"
	// /Users/hubert/Dropbox/projects/antlc/turing.g:71:2: program returns [Program result] : 'input' '(' arg= arguments ')' '{' i= instructions '}' EOF ;
	public final Program program() throws RecognitionException {
		Program result = null;


		Arguments arg =null;
		Instructions i =null;

		try {
			// /Users/hubert/Dropbox/projects/antlc/turing.g:72:3: ( 'input' '(' arg= arguments ')' '{' i= instructions '}' EOF )
			// /Users/hubert/Dropbox/projects/antlc/turing.g:72:5: 'input' '(' arg= arguments ')' '{' i= instructions '}' EOF
			{
			match(input,17,FOLLOW_17_in_program731); 
			match(input,10,FOLLOW_10_in_program733); 
			pushFollow(FOLLOW_arguments_in_program737);
			arg=arguments();
			state._fsp--;

			match(input,11,FOLLOW_11_in_program739); 
			match(input,25,FOLLOW_25_in_program741); 
			pushFollow(FOLLOW_instructions_in_program745);
			i=instructions();
			state._fsp--;

			match(input,26,FOLLOW_26_in_program747); 
			match(input,EOF,FOLLOW_EOF_in_program749); 
			result = new Program(arg, i);
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return result;
	}
	// $ANTLR end "program"

	// Delegated rules



	public static final BitSet FOLLOW_9_in_expression222 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_24_in_expression240 = new BitSet(new long[]{0x0000000000000400L});
	public static final BitSet FOLLOW_10_in_expression242 = new BitSet(new long[]{0x00000000014482C0L});
	public static final BitSet FOLLOW_expression_in_expression246 = new BitSet(new long[]{0x0000000000000800L});
	public static final BitSet FOLLOW_11_in_expression248 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_22_in_expression262 = new BitSet(new long[]{0x0000000000000400L});
	public static final BitSet FOLLOW_10_in_expression264 = new BitSet(new long[]{0x00000000014482C0L});
	public static final BitSet FOLLOW_expression_in_expression268 = new BitSet(new long[]{0x0000000000000800L});
	public static final BitSet FOLLOW_11_in_expression270 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_18_in_expression285 = new BitSet(new long[]{0x0000000000000400L});
	public static final BitSet FOLLOW_10_in_expression287 = new BitSet(new long[]{0x00000000014482C0L});
	public static final BitSet FOLLOW_expression_in_expression291 = new BitSet(new long[]{0x0000000000000800L});
	public static final BitSet FOLLOW_11_in_expression293 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_15_in_expression308 = new BitSet(new long[]{0x0000000000000400L});
	public static final BitSet FOLLOW_10_in_expression310 = new BitSet(new long[]{0x00000000014482C0L});
	public static final BitSet FOLLOW_expression_in_expression314 = new BitSet(new long[]{0x0000000000000800L});
	public static final BitSet FOLLOW_11_in_expression316 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ID_in_expression333 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_NUM_in_expression353 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ID_in_instruction385 = new BitSet(new long[]{0x0000000000000010L});
	public static final BitSet FOLLOW_AFF_in_instruction387 = new BitSet(new long[]{0x00000000014482C0L});
	public static final BitSet FOLLOW_expression_in_instruction391 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_16_in_instruction406 = new BitSet(new long[]{0x0000000000000400L});
	public static final BitSet FOLLOW_10_in_instruction408 = new BitSet(new long[]{0x00000000014482C0L});
	public static final BitSet FOLLOW_expression_in_instruction412 = new BitSet(new long[]{0x0000000000004000L});
	public static final BitSet FOLLOW_14_in_instruction414 = new BitSet(new long[]{0x00000000014482C0L});
	public static final BitSet FOLLOW_expression_in_instruction418 = new BitSet(new long[]{0x0000000000000800L});
	public static final BitSet FOLLOW_11_in_instruction420 = new BitSet(new long[]{0x0000000002000000L});
	public static final BitSet FOLLOW_25_in_instruction422 = new BitSet(new long[]{0x0000000000B92040L});
	public static final BitSet FOLLOW_instructions_in_instruction426 = new BitSet(new long[]{0x0000000004000000L});
	public static final BitSet FOLLOW_26_in_instruction428 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_20_in_instruction438 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_23_in_instruction455 = new BitSet(new long[]{0x0000000000000400L});
	public static final BitSet FOLLOW_10_in_instruction457 = new BitSet(new long[]{0x00000000014482C0L});
	public static final BitSet FOLLOW_expression_in_instruction461 = new BitSet(new long[]{0x0000000000000800L});
	public static final BitSet FOLLOW_11_in_instruction463 = new BitSet(new long[]{0x0000000002000000L});
	public static final BitSet FOLLOW_25_in_instruction465 = new BitSet(new long[]{0x0000000000B92040L});
	public static final BitSet FOLLOW_instructions_in_instruction469 = new BitSet(new long[]{0x0000000004000000L});
	public static final BitSet FOLLOW_26_in_instruction471 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ID_in_instruction485 = new BitSet(new long[]{0x0000000000000040L});
	public static final BitSet FOLLOW_ID_in_instruction489 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_21_in_instruction506 = new BitSet(new long[]{0x0000000000000040L});
	public static final BitSet FOLLOW_ID_in_instruction510 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_19_in_instruction526 = new BitSet(new long[]{0x00000000014482C0L});
	public static final BitSet FOLLOW_expression_in_instruction530 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_13_in_instructions557 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_instruction_in_instructions576 = new BitSet(new long[]{0x0000000000002000L});
	public static final BitSet FOLLOW_instructions_aux_in_instructions580 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_13_in_instructions_aux607 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_13_in_instructions_aux624 = new BitSet(new long[]{0x0000000000B92040L});
	public static final BitSet FOLLOW_instructions_in_instructions_aux628 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ID_in_arguments658 = new BitSet(new long[]{0x0000000000000040L});
	public static final BitSet FOLLOW_ID_in_arguments662 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ID_in_arguments695 = new BitSet(new long[]{0x0000000000000040L});
	public static final BitSet FOLLOW_ID_in_arguments699 = new BitSet(new long[]{0x0000000000001000L});
	public static final BitSet FOLLOW_12_in_arguments701 = new BitSet(new long[]{0x0000000000000040L});
	public static final BitSet FOLLOW_arguments_in_arguments705 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_17_in_program731 = new BitSet(new long[]{0x0000000000000400L});
	public static final BitSet FOLLOW_10_in_program733 = new BitSet(new long[]{0x0000000000000840L});
	public static final BitSet FOLLOW_arguments_in_program737 = new BitSet(new long[]{0x0000000000000800L});
	public static final BitSet FOLLOW_11_in_program739 = new BitSet(new long[]{0x0000000002000000L});
	public static final BitSet FOLLOW_25_in_program741 = new BitSet(new long[]{0x0000000000B92040L});
	public static final BitSet FOLLOW_instructions_in_program745 = new BitSet(new long[]{0x0000000004000000L});
	public static final BitSet FOLLOW_26_in_program747 = new BitSet(new long[]{0x0000000000000000L});
	public static final BitSet FOLLOW_EOF_in_program749 = new BitSet(new long[]{0x0000000000000002L});
}
