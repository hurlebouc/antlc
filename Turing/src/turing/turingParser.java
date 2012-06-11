// $ANTLR 3.4 /Users/hubert/Dropbox/personnel/developpeur/projet/antc-code/hub_version/turing.g 2012-06-11 12:24:48

 package turing;
 import AST.*;
 

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked"})
public class turingParser extends Parser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "AFF", "COMMENT", "ID", "WS", "'#'", "'('", "')'", "','", "'0'", "'1'", "';'", "'='", "'head'", "'if'", "'input'", "'last'", "'return'", "'stop'", "'while'", "'{'", "'}'"
    };

    public static final int EOF=-1;
    public static final int T__8=8;
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
    public static final int AFF=4;
    public static final int COMMENT=5;
    public static final int ID=6;
    public static final int WS=7;

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

    public String[] getTokenNames() { return turingParser.tokenNames; }
    public String getGrammarFileName() { return "/Users/hubert/Dropbox/personnel/developpeur/projet/antc-code/hub_version/turing.g"; }



    // $ANTLR start "expression"
    // /Users/hubert/Dropbox/personnel/developpeur/projet/antc-code/hub_version/turing.g:30:1: expression returns [Expression result] : ( '#' | '0' '(' e= expression ')' | '1' '(' e= expression ')' | 'last' '(' e= expression ')' | 'head' '(' e= expression ')' |n= ID );
    public final Expression expression() throws RecognitionException {
        Expression result = null;


        Token n=null;
        Expression e =null;


        try {
            // /Users/hubert/Dropbox/personnel/developpeur/projet/antc-code/hub_version/turing.g:31:2: ( '#' | '0' '(' e= expression ')' | '1' '(' e= expression ')' | 'last' '(' e= expression ')' | 'head' '(' e= expression ')' |n= ID )
            int alt1=6;
            switch ( input.LA(1) ) {
            case 8:
                {
                alt1=1;
                }
                break;
            case 12:
                {
                alt1=2;
                }
                break;
            case 13:
                {
                alt1=3;
                }
                break;
            case 19:
                {
                alt1=4;
                }
                break;
            case 16:
                {
                alt1=5;
                }
                break;
            case ID:
                {
                alt1=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;

            }

            switch (alt1) {
                case 1 :
                    // /Users/hubert/Dropbox/personnel/developpeur/projet/antc-code/hub_version/turing.g:31:4: '#'
                    {
                    match(input,8,FOLLOW_8_in_expression214); 

                    result = new Valeur("");

                    }
                    break;
                case 2 :
                    // /Users/hubert/Dropbox/personnel/developpeur/projet/antc-code/hub_version/turing.g:32:5: '0' '(' e= expression ')'
                    {
                    match(input,12,FOLLOW_12_in_expression222); 

                    match(input,9,FOLLOW_9_in_expression224); 

                    pushFollow(FOLLOW_expression_in_expression228);
                    e=expression();

                    state._fsp--;


                    match(input,10,FOLLOW_10_in_expression230); 

                    result = new Cons('0', e);

                    }
                    break;
                case 3 :
                    // /Users/hubert/Dropbox/personnel/developpeur/projet/antc-code/hub_version/turing.g:33:5: '1' '(' e= expression ')'
                    {
                    match(input,13,FOLLOW_13_in_expression238); 

                    match(input,9,FOLLOW_9_in_expression240); 

                    pushFollow(FOLLOW_expression_in_expression244);
                    e=expression();

                    state._fsp--;


                    match(input,10,FOLLOW_10_in_expression246); 

                    result = new Cons('1', e);

                    }
                    break;
                case 4 :
                    // /Users/hubert/Dropbox/personnel/developpeur/projet/antc-code/hub_version/turing.g:34:5: 'last' '(' e= expression ')'
                    {
                    match(input,19,FOLLOW_19_in_expression254); 

                    match(input,9,FOLLOW_9_in_expression256); 

                    pushFollow(FOLLOW_expression_in_expression260);
                    e=expression();

                    state._fsp--;


                    match(input,10,FOLLOW_10_in_expression262); 

                    result = new Last(e);

                    }
                    break;
                case 5 :
                    // /Users/hubert/Dropbox/personnel/developpeur/projet/antc-code/hub_version/turing.g:35:5: 'head' '(' e= expression ')'
                    {
                    match(input,16,FOLLOW_16_in_expression270); 

                    match(input,9,FOLLOW_9_in_expression272); 

                    pushFollow(FOLLOW_expression_in_expression276);
                    e=expression();

                    state._fsp--;


                    match(input,10,FOLLOW_10_in_expression278); 

                    result = new Head(e);

                    }
                    break;
                case 6 :
                    // /Users/hubert/Dropbox/personnel/developpeur/projet/antc-code/hub_version/turing.g:36:5: n= ID
                    {
                    n=(Token)match(input,ID,FOLLOW_ID_in_expression288); 

                    result = Variable.init((n!=null?n.getText():null));

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
    // /Users/hubert/Dropbox/personnel/developpeur/projet/antc-code/hub_version/turing.g:39:1: instruction returns [Instruction result] : (n= ID AFF e= expression | 'if' '(' e1= expression '=' e2= expression ')' '{' li= instructions '}' | 'stop' | 'while' '(' e= expression ')' '{' li= instructions '}' | ID n= ID );
    public final Instruction instruction() throws RecognitionException {
        Instruction result = null;


        Token n=null;
        Expression e =null;

        Expression e1 =null;

        Expression e2 =null;

        Instructions li =null;


        try {
            // /Users/hubert/Dropbox/personnel/developpeur/projet/antc-code/hub_version/turing.g:40:2: (n= ID AFF e= expression | 'if' '(' e1= expression '=' e2= expression ')' '{' li= instructions '}' | 'stop' | 'while' '(' e= expression ')' '{' li= instructions '}' | ID n= ID )
            int alt2=5;
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
                    NoViableAltException nvae =
                        new NoViableAltException("", 2, 1, input);

                    throw nvae;

                }
                }
                break;
            case 17:
                {
                alt2=2;
                }
                break;
            case 21:
                {
                alt2=3;
                }
                break;
            case 22:
                {
                alt2=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;

            }

            switch (alt2) {
                case 1 :
                    // /Users/hubert/Dropbox/personnel/developpeur/projet/antc-code/hub_version/turing.g:40:4: n= ID AFF e= expression
                    {
                    n=(Token)match(input,ID,FOLLOW_ID_in_instruction308); 

                    match(input,AFF,FOLLOW_AFF_in_instruction310); 

                    pushFollow(FOLLOW_expression_in_instruction314);
                    e=expression();

                    state._fsp--;


                    result = new Affectation(Variable.init((n!=null?n.getText():null)), e);

                    }
                    break;
                case 2 :
                    // /Users/hubert/Dropbox/personnel/developpeur/projet/antc-code/hub_version/turing.g:41:5: 'if' '(' e1= expression '=' e2= expression ')' '{' li= instructions '}'
                    {
                    match(input,17,FOLLOW_17_in_instruction322); 

                    match(input,9,FOLLOW_9_in_instruction324); 

                    pushFollow(FOLLOW_expression_in_instruction328);
                    e1=expression();

                    state._fsp--;


                    match(input,15,FOLLOW_15_in_instruction330); 

                    pushFollow(FOLLOW_expression_in_instruction334);
                    e2=expression();

                    state._fsp--;


                    match(input,10,FOLLOW_10_in_instruction336); 

                    match(input,23,FOLLOW_23_in_instruction338); 

                    pushFollow(FOLLOW_instructions_in_instruction342);
                    li=instructions();

                    state._fsp--;


                    match(input,24,FOLLOW_24_in_instruction344); 

                    result = new IF(e1, e2, li);

                    }
                    break;
                case 3 :
                    // /Users/hubert/Dropbox/personnel/developpeur/projet/antc-code/hub_version/turing.g:42:5: 'stop'
                    {
                    match(input,21,FOLLOW_21_in_instruction352); 

                    result = new Stop();

                    }
                    break;
                case 4 :
                    // /Users/hubert/Dropbox/personnel/developpeur/projet/antc-code/hub_version/turing.g:43:5: 'while' '(' e= expression ')' '{' li= instructions '}'
                    {
                    match(input,22,FOLLOW_22_in_instruction360); 

                    match(input,9,FOLLOW_9_in_instruction362); 

                    pushFollow(FOLLOW_expression_in_instruction366);
                    e=expression();

                    state._fsp--;


                    match(input,10,FOLLOW_10_in_instruction368); 

                    match(input,23,FOLLOW_23_in_instruction370); 

                    pushFollow(FOLLOW_instructions_in_instruction374);
                    li=instructions();

                    state._fsp--;


                    match(input,24,FOLLOW_24_in_instruction376); 

                    result = new WHILE(e, li);

                    }
                    break;
                case 5 :
                    // /Users/hubert/Dropbox/personnel/developpeur/projet/antc-code/hub_version/turing.g:44:5: ID n= ID
                    {
                    match(input,ID,FOLLOW_ID_in_instruction384); 

                    n=(Token)match(input,ID,FOLLOW_ID_in_instruction388); 

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
    // /Users/hubert/Dropbox/personnel/developpeur/projet/antc-code/hub_version/turing.g:47:1: instructions returns [Instructions result] : ( ';' |i= instruction lia= instructions_aux );
    public final Instructions instructions() throws RecognitionException {
        Instructions result = null;


        Instruction i =null;

        Instructions lia =null;


        try {
            // /Users/hubert/Dropbox/personnel/developpeur/projet/antc-code/hub_version/turing.g:48:2: ( ';' |i= instruction lia= instructions_aux )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==14) ) {
                alt3=1;
            }
            else if ( (LA3_0==ID||LA3_0==17||(LA3_0 >= 21 && LA3_0 <= 22)) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;

            }
            switch (alt3) {
                case 1 :
                    // /Users/hubert/Dropbox/personnel/developpeur/projet/antc-code/hub_version/turing.g:48:4: ';'
                    {
                    match(input,14,FOLLOW_14_in_instructions404); 

                    result = new Instructions();

                    }
                    break;
                case 2 :
                    // /Users/hubert/Dropbox/personnel/developpeur/projet/antc-code/hub_version/turing.g:49:4: i= instruction lia= instructions_aux
                    {
                    pushFollow(FOLLOW_instruction_in_instructions413);
                    i=instruction();

                    state._fsp--;


                    pushFollow(FOLLOW_instructions_aux_in_instructions417);
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
    // /Users/hubert/Dropbox/personnel/developpeur/projet/antc-code/hub_version/turing.g:52:1: instructions_aux returns [Instructions result] : ( ';' | ';' li= instructions );
    public final Instructions instructions_aux() throws RecognitionException {
        Instructions result = null;


        Instructions li =null;


        try {
            // /Users/hubert/Dropbox/personnel/developpeur/projet/antc-code/hub_version/turing.g:53:2: ( ';' | ';' li= instructions )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==14) ) {
                int LA4_1 = input.LA(2);

                if ( (LA4_1==20||LA4_1==24) ) {
                    alt4=1;
                }
                else if ( (LA4_1==ID||LA4_1==14||LA4_1==17||(LA4_1 >= 21 && LA4_1 <= 22)) ) {
                    alt4=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 4, 1, input);

                    throw nvae;

                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;

            }
            switch (alt4) {
                case 1 :
                    // /Users/hubert/Dropbox/personnel/developpeur/projet/antc-code/hub_version/turing.g:53:5: ';'
                    {
                    match(input,14,FOLLOW_14_in_instructions_aux436); 

                    result = new Instructions();

                    }
                    break;
                case 2 :
                    // /Users/hubert/Dropbox/personnel/developpeur/projet/antc-code/hub_version/turing.g:54:4: ';' li= instructions
                    {
                    match(input,14,FOLLOW_14_in_instructions_aux443); 

                    pushFollow(FOLLOW_instructions_in_instructions_aux447);
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
    // /Users/hubert/Dropbox/personnel/developpeur/projet/antc-code/hub_version/turing.g:57:1: arguments returns [Arguments result] : (n= ID |n= ID ',' arg= arguments );
    public final Arguments arguments() throws RecognitionException {
        Arguments result = null;


        Token n=null;
        Arguments arg =null;


        try {
            // /Users/hubert/Dropbox/personnel/developpeur/projet/antc-code/hub_version/turing.g:58:2: (n= ID |n= ID ',' arg= arguments )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==ID) ) {
                int LA5_1 = input.LA(2);

                if ( (LA5_1==11) ) {
                    alt5=2;
                }
                else if ( (LA5_1==10) ) {
                    alt5=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 5, 1, input);

                    throw nvae;

                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;

            }
            switch (alt5) {
                case 1 :
                    // /Users/hubert/Dropbox/personnel/developpeur/projet/antc-code/hub_version/turing.g:58:4: n= ID
                    {
                    n=(Token)match(input,ID,FOLLOW_ID_in_arguments467); 

                    result = new Arguments(Variable.init((n!=null?n.getText():null)));

                    }
                    break;
                case 2 :
                    // /Users/hubert/Dropbox/personnel/developpeur/projet/antc-code/hub_version/turing.g:59:4: n= ID ',' arg= arguments
                    {
                    n=(Token)match(input,ID,FOLLOW_ID_in_arguments476); 

                    match(input,11,FOLLOW_11_in_arguments478); 

                    pushFollow(FOLLOW_arguments_in_arguments482);
                    arg=arguments();

                    state._fsp--;


                    (arg).addFirst(Variable.init((n!=null?n.getText():null))); result = arg;

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
    // /Users/hubert/Dropbox/personnel/developpeur/projet/antc-code/hub_version/turing.g:62:1: program returns [Program result] : 'input' '(' arg= arguments ')' '{' i= instructions 'return' id= ID '}' EOF ;
    public final Program program() throws RecognitionException {
        Program result = null;


        Token id=null;
        Arguments arg =null;

        Instructions i =null;


        try {
            // /Users/hubert/Dropbox/personnel/developpeur/projet/antc-code/hub_version/turing.g:63:2: ( 'input' '(' arg= arguments ')' '{' i= instructions 'return' id= ID '}' EOF )
            // /Users/hubert/Dropbox/personnel/developpeur/projet/antc-code/hub_version/turing.g:63:4: 'input' '(' arg= arguments ')' '{' i= instructions 'return' id= ID '}' EOF
            {
            match(input,18,FOLLOW_18_in_program498); 

            match(input,9,FOLLOW_9_in_program500); 

            pushFollow(FOLLOW_arguments_in_program504);
            arg=arguments();

            state._fsp--;


            match(input,10,FOLLOW_10_in_program506); 

            match(input,23,FOLLOW_23_in_program508); 

            pushFollow(FOLLOW_instructions_in_program512);
            i=instructions();

            state._fsp--;


            match(input,20,FOLLOW_20_in_program514); 

            id=(Token)match(input,ID,FOLLOW_ID_in_program518); 

            match(input,24,FOLLOW_24_in_program520); 

            match(input,EOF,FOLLOW_EOF_in_program522); 

            result = new Program(arg, i, Variable.init((id!=null?id.getText():null)));

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


 

    public static final BitSet FOLLOW_8_in_expression214 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_expression222 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_9_in_expression224 = new BitSet(new long[]{0x0000000000093140L});
    public static final BitSet FOLLOW_expression_in_expression228 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_10_in_expression230 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_expression238 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_9_in_expression240 = new BitSet(new long[]{0x0000000000093140L});
    public static final BitSet FOLLOW_expression_in_expression244 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_10_in_expression246 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_expression254 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_9_in_expression256 = new BitSet(new long[]{0x0000000000093140L});
    public static final BitSet FOLLOW_expression_in_expression260 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_10_in_expression262 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_expression270 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_9_in_expression272 = new BitSet(new long[]{0x0000000000093140L});
    public static final BitSet FOLLOW_expression_in_expression276 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_10_in_expression278 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_expression288 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_instruction308 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_AFF_in_instruction310 = new BitSet(new long[]{0x0000000000093140L});
    public static final BitSet FOLLOW_expression_in_instruction314 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_instruction322 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_9_in_instruction324 = new BitSet(new long[]{0x0000000000093140L});
    public static final BitSet FOLLOW_expression_in_instruction328 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_instruction330 = new BitSet(new long[]{0x0000000000093140L});
    public static final BitSet FOLLOW_expression_in_instruction334 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_10_in_instruction336 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_23_in_instruction338 = new BitSet(new long[]{0x0000000000624040L});
    public static final BitSet FOLLOW_instructions_in_instruction342 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_24_in_instruction344 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_instruction352 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_instruction360 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_9_in_instruction362 = new BitSet(new long[]{0x0000000000093140L});
    public static final BitSet FOLLOW_expression_in_instruction366 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_10_in_instruction368 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_23_in_instruction370 = new BitSet(new long[]{0x0000000000624040L});
    public static final BitSet FOLLOW_instructions_in_instruction374 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_24_in_instruction376 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_instruction384 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_ID_in_instruction388 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_instructions404 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_instruction_in_instructions413 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_instructions_aux_in_instructions417 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_instructions_aux436 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_instructions_aux443 = new BitSet(new long[]{0x0000000000624040L});
    public static final BitSet FOLLOW_instructions_in_instructions_aux447 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_arguments467 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_arguments476 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_11_in_arguments478 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_arguments_in_arguments482 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_program498 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_9_in_program500 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_arguments_in_program504 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_10_in_program506 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_23_in_program508 = new BitSet(new long[]{0x0000000000624040L});
    public static final BitSet FOLLOW_instructions_in_program512 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_program514 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_ID_in_program518 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_24_in_program520 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_program522 = new BitSet(new long[]{0x0000000000000002L});

}