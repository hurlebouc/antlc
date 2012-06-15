// $ANTLR 3.4 /Users/hubert/Dropbox/personnel/developpeur/projet/antc-code/hub_version/turing.g 2012-06-15 11:05:05

 package turing;
 import AST.*;
 

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked"})
public class turingParser extends Parser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "AFF", "COMMENT", "ID", "NUM", "WS", "'#'", "'('", "')'", "','", "'0'", "'1'", "';'", "'='", "'head'", "'if'", "'input'", "'last'", "'return'", "'stop'", "'typedef'", "'while'", "'{'", "'}'"
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

    public String[] getTokenNames() { return turingParser.tokenNames; }
    public String getGrammarFileName() { return "/Users/hubert/Dropbox/personnel/developpeur/projet/antc-code/hub_version/turing.g"; }



    // $ANTLR start "expression"
    // /Users/hubert/Dropbox/personnel/developpeur/projet/antc-code/hub_version/turing.g:33:1: expression returns [Expression result] : ( '#' | '0' '(' e= expression ')' | '1' '(' e= expression ')' | 'last' '(' e= expression ')' | 'head' '(' e= expression ')' |n= ID |n= NUM );
    public final Expression expression() throws RecognitionException {
        Expression result = null;


        Token n=null;
        Expression e =null;


        try {
            // /Users/hubert/Dropbox/personnel/developpeur/projet/antc-code/hub_version/turing.g:34:2: ( '#' | '0' '(' e= expression ')' | '1' '(' e= expression ')' | 'last' '(' e= expression ')' | 'head' '(' e= expression ')' |n= ID |n= NUM )
            int alt1=7;
            switch ( input.LA(1) ) {
            case 9:
                {
                alt1=1;
                }
                break;
            case 13:
                {
                alt1=2;
                }
                break;
            case 14:
                {
                alt1=3;
                }
                break;
            case 20:
                {
                alt1=4;
                }
                break;
            case 17:
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
                    // /Users/hubert/Dropbox/personnel/developpeur/projet/antc-code/hub_version/turing.g:34:4: '#'
                    {
                    match(input,9,FOLLOW_9_in_expression240); 

                    result = new Valeur("");

                    }
                    break;
                case 2 :
                    // /Users/hubert/Dropbox/personnel/developpeur/projet/antc-code/hub_version/turing.g:35:5: '0' '(' e= expression ')'
                    {
                    match(input,13,FOLLOW_13_in_expression248); 

                    match(input,10,FOLLOW_10_in_expression250); 

                    pushFollow(FOLLOW_expression_in_expression254);
                    e=expression();

                    state._fsp--;


                    match(input,11,FOLLOW_11_in_expression256); 

                    result = new Cons('0', e);

                    }
                    break;
                case 3 :
                    // /Users/hubert/Dropbox/personnel/developpeur/projet/antc-code/hub_version/turing.g:36:5: '1' '(' e= expression ')'
                    {
                    match(input,14,FOLLOW_14_in_expression264); 

                    match(input,10,FOLLOW_10_in_expression266); 

                    pushFollow(FOLLOW_expression_in_expression270);
                    e=expression();

                    state._fsp--;


                    match(input,11,FOLLOW_11_in_expression272); 

                    result = new Cons('1', e);

                    }
                    break;
                case 4 :
                    // /Users/hubert/Dropbox/personnel/developpeur/projet/antc-code/hub_version/turing.g:37:5: 'last' '(' e= expression ')'
                    {
                    match(input,20,FOLLOW_20_in_expression280); 

                    match(input,10,FOLLOW_10_in_expression282); 

                    pushFollow(FOLLOW_expression_in_expression286);
                    e=expression();

                    state._fsp--;


                    match(input,11,FOLLOW_11_in_expression288); 

                    result = new Last(e);

                    }
                    break;
                case 5 :
                    // /Users/hubert/Dropbox/personnel/developpeur/projet/antc-code/hub_version/turing.g:38:5: 'head' '(' e= expression ')'
                    {
                    match(input,17,FOLLOW_17_in_expression296); 

                    match(input,10,FOLLOW_10_in_expression298); 

                    pushFollow(FOLLOW_expression_in_expression302);
                    e=expression();

                    state._fsp--;


                    match(input,11,FOLLOW_11_in_expression304); 

                    result = new Head(e);

                    }
                    break;
                case 6 :
                    // /Users/hubert/Dropbox/personnel/developpeur/projet/antc-code/hub_version/turing.g:39:5: n= ID
                    {
                    n=(Token)match(input,ID,FOLLOW_ID_in_expression314); 

                    result = Variable.get((n!=null?n.getText():null));

                    }
                    break;
                case 7 :
                    // /Users/hubert/Dropbox/personnel/developpeur/projet/antc-code/hub_version/turing.g:40:5: n= NUM
                    {
                    n=(Token)match(input,NUM,FOLLOW_NUM_in_expression324); 

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
    // /Users/hubert/Dropbox/personnel/developpeur/projet/antc-code/hub_version/turing.g:43:1: instruction returns [Instruction result] : (var= ID AFF e= expression | 'if' '(' e1= expression '=' e2= expression ')' '{' li= instructions '}' | 'stop' | 'while' '(' e= expression ')' '{' li= instructions '}' |type= ID n= ID | 'typedef' type= ID );
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
            // /Users/hubert/Dropbox/personnel/developpeur/projet/antc-code/hub_version/turing.g:44:2: (var= ID AFF e= expression | 'if' '(' e1= expression '=' e2= expression ')' '{' li= instructions '}' | 'stop' | 'while' '(' e= expression ')' '{' li= instructions '}' |type= ID n= ID | 'typedef' type= ID )
            int alt2=6;
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
            case 18:
                {
                alt2=2;
                }
                break;
            case 22:
                {
                alt2=3;
                }
                break;
            case 24:
                {
                alt2=4;
                }
                break;
            case 23:
                {
                alt2=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;

            }

            switch (alt2) {
                case 1 :
                    // /Users/hubert/Dropbox/personnel/developpeur/projet/antc-code/hub_version/turing.g:44:4: var= ID AFF e= expression
                    {
                    var=(Token)match(input,ID,FOLLOW_ID_in_instruction344); 

                    match(input,AFF,FOLLOW_AFF_in_instruction346); 

                    pushFollow(FOLLOW_expression_in_instruction350);
                    e=expression();

                    state._fsp--;


                    result = new Affectation((var!=null?var.getText():null), e);

                    }
                    break;
                case 2 :
                    // /Users/hubert/Dropbox/personnel/developpeur/projet/antc-code/hub_version/turing.g:45:5: 'if' '(' e1= expression '=' e2= expression ')' '{' li= instructions '}'
                    {
                    match(input,18,FOLLOW_18_in_instruction358); 

                    match(input,10,FOLLOW_10_in_instruction360); 

                    pushFollow(FOLLOW_expression_in_instruction364);
                    e1=expression();

                    state._fsp--;


                    match(input,16,FOLLOW_16_in_instruction366); 

                    pushFollow(FOLLOW_expression_in_instruction370);
                    e2=expression();

                    state._fsp--;


                    match(input,11,FOLLOW_11_in_instruction372); 

                    match(input,25,FOLLOW_25_in_instruction374); 

                    pushFollow(FOLLOW_instructions_in_instruction378);
                    li=instructions();

                    state._fsp--;


                    match(input,26,FOLLOW_26_in_instruction380); 

                    result = new IF(e1, e2, li);

                    }
                    break;
                case 3 :
                    // /Users/hubert/Dropbox/personnel/developpeur/projet/antc-code/hub_version/turing.g:46:5: 'stop'
                    {
                    match(input,22,FOLLOW_22_in_instruction388); 

                    result = new Stop();

                    }
                    break;
                case 4 :
                    // /Users/hubert/Dropbox/personnel/developpeur/projet/antc-code/hub_version/turing.g:47:5: 'while' '(' e= expression ')' '{' li= instructions '}'
                    {
                    match(input,24,FOLLOW_24_in_instruction396); 

                    match(input,10,FOLLOW_10_in_instruction398); 

                    pushFollow(FOLLOW_expression_in_instruction402);
                    e=expression();

                    state._fsp--;


                    match(input,11,FOLLOW_11_in_instruction404); 

                    match(input,25,FOLLOW_25_in_instruction406); 

                    pushFollow(FOLLOW_instructions_in_instruction410);
                    li=instructions();

                    state._fsp--;


                    match(input,26,FOLLOW_26_in_instruction412); 

                    result = new WHILE(e, li);

                    }
                    break;
                case 5 :
                    // /Users/hubert/Dropbox/personnel/developpeur/projet/antc-code/hub_version/turing.g:48:5: type= ID n= ID
                    {
                    type=(Token)match(input,ID,FOLLOW_ID_in_instruction422); 

                    n=(Token)match(input,ID,FOLLOW_ID_in_instruction426); 

                    result = new VarDeclaration((n!=null?n.getText():null), (type!=null?type.getText():null));

                    }
                    break;
                case 6 :
                    // /Users/hubert/Dropbox/personnel/developpeur/projet/antc-code/hub_version/turing.g:49:5: 'typedef' type= ID
                    {
                    match(input,23,FOLLOW_23_in_instruction434); 

                    type=(Token)match(input,ID,FOLLOW_ID_in_instruction438); 

                    result = new TypeDeclaration((type!=null?type.getText():null));

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
    // /Users/hubert/Dropbox/personnel/developpeur/projet/antc-code/hub_version/turing.g:52:1: instructions returns [Instructions result] : ( ';' |i= instruction lia= instructions_aux );
    public final Instructions instructions() throws RecognitionException {
        Instructions result = null;


        Instruction i =null;

        Instructions lia =null;


        try {
            // /Users/hubert/Dropbox/personnel/developpeur/projet/antc-code/hub_version/turing.g:53:2: ( ';' |i= instruction lia= instructions_aux )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==15) ) {
                alt3=1;
            }
            else if ( (LA3_0==ID||LA3_0==18||(LA3_0 >= 22 && LA3_0 <= 24)) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;

            }
            switch (alt3) {
                case 1 :
                    // /Users/hubert/Dropbox/personnel/developpeur/projet/antc-code/hub_version/turing.g:53:4: ';'
                    {
                    match(input,15,FOLLOW_15_in_instructions456); 

                    result = new Instructions();

                    }
                    break;
                case 2 :
                    // /Users/hubert/Dropbox/personnel/developpeur/projet/antc-code/hub_version/turing.g:54:4: i= instruction lia= instructions_aux
                    {
                    pushFollow(FOLLOW_instruction_in_instructions465);
                    i=instruction();

                    state._fsp--;


                    pushFollow(FOLLOW_instructions_aux_in_instructions469);
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
    // /Users/hubert/Dropbox/personnel/developpeur/projet/antc-code/hub_version/turing.g:57:1: instructions_aux returns [Instructions result] : ( ';' | ';' li= instructions );
    public final Instructions instructions_aux() throws RecognitionException {
        Instructions result = null;


        Instructions li =null;


        try {
            // /Users/hubert/Dropbox/personnel/developpeur/projet/antc-code/hub_version/turing.g:58:2: ( ';' | ';' li= instructions )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==15) ) {
                int LA4_1 = input.LA(2);

                if ( (LA4_1==21||LA4_1==26) ) {
                    alt4=1;
                }
                else if ( (LA4_1==ID||LA4_1==15||LA4_1==18||(LA4_1 >= 22 && LA4_1 <= 24)) ) {
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
                    // /Users/hubert/Dropbox/personnel/developpeur/projet/antc-code/hub_version/turing.g:58:5: ';'
                    {
                    match(input,15,FOLLOW_15_in_instructions_aux488); 

                    result = new Instructions();

                    }
                    break;
                case 2 :
                    // /Users/hubert/Dropbox/personnel/developpeur/projet/antc-code/hub_version/turing.g:59:4: ';' li= instructions
                    {
                    match(input,15,FOLLOW_15_in_instructions_aux495); 

                    pushFollow(FOLLOW_instructions_in_instructions_aux499);
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
    // /Users/hubert/Dropbox/personnel/developpeur/projet/antc-code/hub_version/turing.g:62:1: arguments returns [Arguments result] : (type= ID n= ID |type= ID n= ID ',' arg= arguments );
    public final Arguments arguments() throws RecognitionException {
        Arguments result = null;


        Token type=null;
        Token n=null;
        Arguments arg =null;


        try {
            // /Users/hubert/Dropbox/personnel/developpeur/projet/antc-code/hub_version/turing.g:63:2: (type= ID n= ID |type= ID n= ID ',' arg= arguments )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==ID) ) {
                int LA5_1 = input.LA(2);

                if ( (LA5_1==ID) ) {
                    int LA5_2 = input.LA(3);

                    if ( (LA5_2==12) ) {
                        alt5=2;
                    }
                    else if ( (LA5_2==11) ) {
                        alt5=1;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 5, 2, input);

                        throw nvae;

                    }
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
                    // /Users/hubert/Dropbox/personnel/developpeur/projet/antc-code/hub_version/turing.g:63:4: type= ID n= ID
                    {
                    type=(Token)match(input,ID,FOLLOW_ID_in_arguments519); 

                    n=(Token)match(input,ID,FOLLOW_ID_in_arguments523); 

                    result = new Arguments((n!=null?n.getText():null), (type!=null?type.getText():null));

                    }
                    break;
                case 2 :
                    // /Users/hubert/Dropbox/personnel/developpeur/projet/antc-code/hub_version/turing.g:64:4: type= ID n= ID ',' arg= arguments
                    {
                    type=(Token)match(input,ID,FOLLOW_ID_in_arguments532); 

                    n=(Token)match(input,ID,FOLLOW_ID_in_arguments536); 

                    match(input,12,FOLLOW_12_in_arguments538); 

                    pushFollow(FOLLOW_arguments_in_arguments542);
                    arg=arguments();

                    state._fsp--;


                    (arg).addVar((n!=null?n.getText():null), (type!=null?type.getText():null)); result = arg;

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
    // /Users/hubert/Dropbox/personnel/developpeur/projet/antc-code/hub_version/turing.g:67:1: program returns [Program result] : 'input' '(' arg= arguments ')' '{' i= instructions 'return' id= ID '}' EOF ;
    public final Program program() throws RecognitionException {
        Program result = null;


        Token id=null;
        Arguments arg =null;

        Instructions i =null;


        try {
            // /Users/hubert/Dropbox/personnel/developpeur/projet/antc-code/hub_version/turing.g:68:2: ( 'input' '(' arg= arguments ')' '{' i= instructions 'return' id= ID '}' EOF )
            // /Users/hubert/Dropbox/personnel/developpeur/projet/antc-code/hub_version/turing.g:68:4: 'input' '(' arg= arguments ')' '{' i= instructions 'return' id= ID '}' EOF
            {
            match(input,19,FOLLOW_19_in_program558); 

            match(input,10,FOLLOW_10_in_program560); 

            pushFollow(FOLLOW_arguments_in_program564);
            arg=arguments();

            state._fsp--;


            match(input,11,FOLLOW_11_in_program566); 

            match(input,25,FOLLOW_25_in_program568); 

            pushFollow(FOLLOW_instructions_in_program572);
            i=instructions();

            state._fsp--;


            match(input,21,FOLLOW_21_in_program574); 

            id=(Token)match(input,ID,FOLLOW_ID_in_program578); 

            match(input,26,FOLLOW_26_in_program580); 

            match(input,EOF,FOLLOW_EOF_in_program582); 

            result = new Program(arg, i, (id!=null?id.getText():null));

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


 

    public static final BitSet FOLLOW_9_in_expression240 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_expression248 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_10_in_expression250 = new BitSet(new long[]{0x00000000001262C0L});
    public static final BitSet FOLLOW_expression_in_expression254 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_11_in_expression256 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_expression264 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_10_in_expression266 = new BitSet(new long[]{0x00000000001262C0L});
    public static final BitSet FOLLOW_expression_in_expression270 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_11_in_expression272 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_expression280 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_10_in_expression282 = new BitSet(new long[]{0x00000000001262C0L});
    public static final BitSet FOLLOW_expression_in_expression286 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_11_in_expression288 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_expression296 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_10_in_expression298 = new BitSet(new long[]{0x00000000001262C0L});
    public static final BitSet FOLLOW_expression_in_expression302 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_11_in_expression304 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_expression314 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NUM_in_expression324 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_instruction344 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_AFF_in_instruction346 = new BitSet(new long[]{0x00000000001262C0L});
    public static final BitSet FOLLOW_expression_in_instruction350 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_instruction358 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_10_in_instruction360 = new BitSet(new long[]{0x00000000001262C0L});
    public static final BitSet FOLLOW_expression_in_instruction364 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_instruction366 = new BitSet(new long[]{0x00000000001262C0L});
    public static final BitSet FOLLOW_expression_in_instruction370 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_11_in_instruction372 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_25_in_instruction374 = new BitSet(new long[]{0x0000000001C48040L});
    public static final BitSet FOLLOW_instructions_in_instruction378 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_26_in_instruction380 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_instruction388 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_instruction396 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_10_in_instruction398 = new BitSet(new long[]{0x00000000001262C0L});
    public static final BitSet FOLLOW_expression_in_instruction402 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_11_in_instruction404 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_25_in_instruction406 = new BitSet(new long[]{0x0000000001C48040L});
    public static final BitSet FOLLOW_instructions_in_instruction410 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_26_in_instruction412 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_instruction422 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_ID_in_instruction426 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_instruction434 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_ID_in_instruction438 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_instructions456 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_instruction_in_instructions465 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_instructions_aux_in_instructions469 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_instructions_aux488 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_instructions_aux495 = new BitSet(new long[]{0x0000000001C48040L});
    public static final BitSet FOLLOW_instructions_in_instructions_aux499 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_arguments519 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_ID_in_arguments523 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_arguments532 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_ID_in_arguments536 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_arguments538 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_arguments_in_arguments542 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_program558 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_10_in_program560 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_arguments_in_program564 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_11_in_program566 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_25_in_program568 = new BitSet(new long[]{0x0000000001C48040L});
    public static final BitSet FOLLOW_instructions_in_program572 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_21_in_program574 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_ID_in_program578 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_26_in_program580 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_program582 = new BitSet(new long[]{0x0000000000000002L});

}