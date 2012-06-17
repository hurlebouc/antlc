// $ANTLR 3.4 /Users/hubert/Dropbox/personnel/developpeur/projet/antc-code/hub_version/turing.g 2012-06-17 17:57:36

  package turing;
  import AST.*;
  

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked"})
public class turingParser extends Parser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "AFF", "COMMENT", "ID", "NUM", "WS", "'#'", "'('", "')'", "','", "';'", "'='", "'head'", "'if'", "'input'", "'last'", "'return'", "'stop'", "'typedef'", "'un'", "'while'", "'zero'", "'{'", "'}'"
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
    // /Users/hubert/Dropbox/personnel/developpeur/projet/antc-code/hub_version/turing.g:33:2: expression returns [Expression result] : ( '#' | 'zero' '(' e= expression ')' | 'un' '(' e= expression ')' | 'last' '(' e= expression ')' | 'head' '(' e= expression ')' |n= ID |n= NUM );
    public final Expression expression() throws RecognitionException {
        Expression result = null;


        Token n=null;
        Expression e =null;


        try {
            // /Users/hubert/Dropbox/personnel/developpeur/projet/antc-code/hub_version/turing.g:34:3: ( '#' | 'zero' '(' e= expression ')' | 'un' '(' e= expression ')' | 'last' '(' e= expression ')' | 'head' '(' e= expression ')' |n= ID |n= NUM )
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
                    // /Users/hubert/Dropbox/personnel/developpeur/projet/antc-code/hub_version/turing.g:34:5: '#'
                    {
                    match(input,9,FOLLOW_9_in_expression222); 

                    result = new Valeur("");

                    }
                    break;
                case 2 :
                    // /Users/hubert/Dropbox/personnel/developpeur/projet/antc-code/hub_version/turing.g:35:6: 'zero' '(' e= expression ')'
                    {
                    match(input,24,FOLLOW_24_in_expression231); 

                    match(input,10,FOLLOW_10_in_expression233); 

                    pushFollow(FOLLOW_expression_in_expression237);
                    e=expression();

                    state._fsp--;


                    match(input,11,FOLLOW_11_in_expression239); 

                    result = new Cons('0', e);

                    }
                    break;
                case 3 :
                    // /Users/hubert/Dropbox/personnel/developpeur/projet/antc-code/hub_version/turing.g:36:6: 'un' '(' e= expression ')'
                    {
                    match(input,22,FOLLOW_22_in_expression248); 

                    match(input,10,FOLLOW_10_in_expression250); 

                    pushFollow(FOLLOW_expression_in_expression254);
                    e=expression();

                    state._fsp--;


                    match(input,11,FOLLOW_11_in_expression256); 

                    result = new Cons('1', e);

                    }
                    break;
                case 4 :
                    // /Users/hubert/Dropbox/personnel/developpeur/projet/antc-code/hub_version/turing.g:37:6: 'last' '(' e= expression ')'
                    {
                    match(input,18,FOLLOW_18_in_expression265); 

                    match(input,10,FOLLOW_10_in_expression267); 

                    pushFollow(FOLLOW_expression_in_expression271);
                    e=expression();

                    state._fsp--;


                    match(input,11,FOLLOW_11_in_expression273); 

                    result = new Last(e);

                    }
                    break;
                case 5 :
                    // /Users/hubert/Dropbox/personnel/developpeur/projet/antc-code/hub_version/turing.g:38:6: 'head' '(' e= expression ')'
                    {
                    match(input,15,FOLLOW_15_in_expression282); 

                    match(input,10,FOLLOW_10_in_expression284); 

                    pushFollow(FOLLOW_expression_in_expression288);
                    e=expression();

                    state._fsp--;


                    match(input,11,FOLLOW_11_in_expression290); 

                    result = new Head(e);

                    }
                    break;
                case 6 :
                    // /Users/hubert/Dropbox/personnel/developpeur/projet/antc-code/hub_version/turing.g:39:6: n= ID
                    {
                    n=(Token)match(input,ID,FOLLOW_ID_in_expression301); 

                    result = Variable.init((n!=null?n.getText():null));

                    }
                    break;
                case 7 :
                    // /Users/hubert/Dropbox/personnel/developpeur/projet/antc-code/hub_version/turing.g:40:6: n= NUM
                    {
                    n=(Token)match(input,NUM,FOLLOW_NUM_in_expression312); 

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
    // /Users/hubert/Dropbox/personnel/developpeur/projet/antc-code/hub_version/turing.g:43:2: instruction returns [Instruction result] : (var= ID AFF e= expression | 'if' '(' e1= expression '=' e2= expression ')' '{' li= instructions '}' | 'stop' | 'while' '(' e= expression ')' '{' li= instructions '}' |type= ID n= ID | 'typedef' type= ID | 'return' e= expression );
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
            // /Users/hubert/Dropbox/personnel/developpeur/projet/antc-code/hub_version/turing.g:44:3: (var= ID AFF e= expression | 'if' '(' e1= expression '=' e2= expression ')' '{' li= instructions '}' | 'stop' | 'while' '(' e= expression ')' '{' li= instructions '}' |type= ID n= ID | 'typedef' type= ID | 'return' e= expression )
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
                    NoViableAltException nvae =
                        new NoViableAltException("", 2, 1, input);

                    throw nvae;

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
                    // /Users/hubert/Dropbox/personnel/developpeur/projet/antc-code/hub_version/turing.g:44:5: var= ID AFF e= expression
                    {
                    var=(Token)match(input,ID,FOLLOW_ID_in_instruction336); 

                    match(input,AFF,FOLLOW_AFF_in_instruction338); 

                    pushFollow(FOLLOW_expression_in_instruction342);
                    e=expression();

                    state._fsp--;


                    result = new Affectation((var!=null?var.getText():null), e);

                    }
                    break;
                case 2 :
                    // /Users/hubert/Dropbox/personnel/developpeur/projet/antc-code/hub_version/turing.g:45:6: 'if' '(' e1= expression '=' e2= expression ')' '{' li= instructions '}'
                    {
                    match(input,16,FOLLOW_16_in_instruction351); 

                    match(input,10,FOLLOW_10_in_instruction353); 

                    pushFollow(FOLLOW_expression_in_instruction357);
                    e1=expression();

                    state._fsp--;


                    match(input,14,FOLLOW_14_in_instruction359); 

                    pushFollow(FOLLOW_expression_in_instruction363);
                    e2=expression();

                    state._fsp--;


                    match(input,11,FOLLOW_11_in_instruction365); 

                    match(input,25,FOLLOW_25_in_instruction367); 

                    pushFollow(FOLLOW_instructions_in_instruction371);
                    li=instructions();

                    state._fsp--;


                    match(input,26,FOLLOW_26_in_instruction373); 

                    result = new IF(e1, e2, li);

                    }
                    break;
                case 3 :
                    // /Users/hubert/Dropbox/personnel/developpeur/projet/antc-code/hub_version/turing.g:46:6: 'stop'
                    {
                    match(input,20,FOLLOW_20_in_instruction382); 

                    result = new Stop();

                    }
                    break;
                case 4 :
                    // /Users/hubert/Dropbox/personnel/developpeur/projet/antc-code/hub_version/turing.g:47:6: 'while' '(' e= expression ')' '{' li= instructions '}'
                    {
                    match(input,23,FOLLOW_23_in_instruction391); 

                    match(input,10,FOLLOW_10_in_instruction393); 

                    pushFollow(FOLLOW_expression_in_instruction397);
                    e=expression();

                    state._fsp--;


                    match(input,11,FOLLOW_11_in_instruction399); 

                    match(input,25,FOLLOW_25_in_instruction401); 

                    pushFollow(FOLLOW_instructions_in_instruction405);
                    li=instructions();

                    state._fsp--;


                    match(input,26,FOLLOW_26_in_instruction407); 

                    result = new WHILE(e, li);

                    }
                    break;
                case 5 :
                    // /Users/hubert/Dropbox/personnel/developpeur/projet/antc-code/hub_version/turing.g:48:6: type= ID n= ID
                    {
                    type=(Token)match(input,ID,FOLLOW_ID_in_instruction418); 

                    n=(Token)match(input,ID,FOLLOW_ID_in_instruction422); 

                    result = new VarDeclaration((n!=null?n.getText():null), (type!=null?type.getText():null));

                    }
                    break;
                case 6 :
                    // /Users/hubert/Dropbox/personnel/developpeur/projet/antc-code/hub_version/turing.g:49:6: 'typedef' type= ID
                    {
                    match(input,21,FOLLOW_21_in_instruction431); 

                    type=(Token)match(input,ID,FOLLOW_ID_in_instruction435); 

                    result = new TypeDeclaration((type!=null?type.getText():null));

                    }
                    break;
                case 7 :
                    // /Users/hubert/Dropbox/personnel/developpeur/projet/antc-code/hub_version/turing.g:50:6: 'return' e= expression
                    {
                    match(input,19,FOLLOW_19_in_instruction444); 

                    pushFollow(FOLLOW_expression_in_instruction448);
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
    // /Users/hubert/Dropbox/personnel/developpeur/projet/antc-code/hub_version/turing.g:53:2: instructions returns [Instructions result] : ( ';' |i= instruction lia= instructions_aux );
    public final Instructions instructions() throws RecognitionException {
        Instructions result = null;


        Instruction i =null;

        Instructions lia =null;


        try {
            // /Users/hubert/Dropbox/personnel/developpeur/projet/antc-code/hub_version/turing.g:54:3: ( ';' |i= instruction lia= instructions_aux )
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
                    // /Users/hubert/Dropbox/personnel/developpeur/projet/antc-code/hub_version/turing.g:54:5: ';'
                    {
                    match(input,13,FOLLOW_13_in_instructions469); 

                    result = new Instructions();

                    }
                    break;
                case 2 :
                    // /Users/hubert/Dropbox/personnel/developpeur/projet/antc-code/hub_version/turing.g:55:5: i= instruction lia= instructions_aux
                    {
                    pushFollow(FOLLOW_instruction_in_instructions479);
                    i=instruction();

                    state._fsp--;


                    pushFollow(FOLLOW_instructions_aux_in_instructions483);
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
    // /Users/hubert/Dropbox/personnel/developpeur/projet/antc-code/hub_version/turing.g:58:2: instructions_aux returns [Instructions result] : ( ';' | ';' li= instructions );
    public final Instructions instructions_aux() throws RecognitionException {
        Instructions result = null;


        Instructions li =null;


        try {
            // /Users/hubert/Dropbox/personnel/developpeur/projet/antc-code/hub_version/turing.g:59:3: ( ';' | ';' li= instructions )
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
                    // /Users/hubert/Dropbox/personnel/developpeur/projet/antc-code/hub_version/turing.g:59:6: ';'
                    {
                    match(input,13,FOLLOW_13_in_instructions_aux505); 

                    result = new Instructions();

                    }
                    break;
                case 2 :
                    // /Users/hubert/Dropbox/personnel/developpeur/projet/antc-code/hub_version/turing.g:60:5: ';' li= instructions
                    {
                    match(input,13,FOLLOW_13_in_instructions_aux513); 

                    pushFollow(FOLLOW_instructions_in_instructions_aux517);
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
    // /Users/hubert/Dropbox/personnel/developpeur/projet/antc-code/hub_version/turing.g:63:2: arguments returns [Arguments result] : (type= ID n= ID |type= ID n= ID ',' arg= arguments );
    public final Arguments arguments() throws RecognitionException {
        Arguments result = null;


        Token type=null;
        Token n=null;
        Arguments arg =null;


        try {
            // /Users/hubert/Dropbox/personnel/developpeur/projet/antc-code/hub_version/turing.g:64:3: (type= ID n= ID |type= ID n= ID ',' arg= arguments )
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
                    // /Users/hubert/Dropbox/personnel/developpeur/projet/antc-code/hub_version/turing.g:64:5: type= ID n= ID
                    {
                    type=(Token)match(input,ID,FOLLOW_ID_in_arguments540); 

                    n=(Token)match(input,ID,FOLLOW_ID_in_arguments544); 

                    result = new Arguments((n!=null?n.getText():null), (type!=null?type.getText():null));

                    }
                    break;
                case 2 :
                    // /Users/hubert/Dropbox/personnel/developpeur/projet/antc-code/hub_version/turing.g:65:5: type= ID n= ID ',' arg= arguments
                    {
                    type=(Token)match(input,ID,FOLLOW_ID_in_arguments554); 

                    n=(Token)match(input,ID,FOLLOW_ID_in_arguments558); 

                    match(input,12,FOLLOW_12_in_arguments560); 

                    pushFollow(FOLLOW_arguments_in_arguments564);
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
    // /Users/hubert/Dropbox/personnel/developpeur/projet/antc-code/hub_version/turing.g:68:2: program returns [Program result] : 'input' '(' arg= arguments ')' '{' i= instructions '}' EOF ;
    public final Program program() throws RecognitionException {
        Program result = null;


        Arguments arg =null;

        Instructions i =null;


        try {
            // /Users/hubert/Dropbox/personnel/developpeur/projet/antc-code/hub_version/turing.g:69:3: ( 'input' '(' arg= arguments ')' '{' i= instructions '}' EOF )
            // /Users/hubert/Dropbox/personnel/developpeur/projet/antc-code/hub_version/turing.g:69:5: 'input' '(' arg= arguments ')' '{' i= instructions '}' EOF
            {
            match(input,17,FOLLOW_17_in_program584); 

            match(input,10,FOLLOW_10_in_program586); 

            pushFollow(FOLLOW_arguments_in_program590);
            arg=arguments();

            state._fsp--;


            match(input,11,FOLLOW_11_in_program592); 

            match(input,25,FOLLOW_25_in_program594); 

            pushFollow(FOLLOW_instructions_in_program598);
            i=instructions();

            state._fsp--;


            match(input,26,FOLLOW_26_in_program600); 

            match(input,EOF,FOLLOW_EOF_in_program602); 

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
    public static final BitSet FOLLOW_24_in_expression231 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_10_in_expression233 = new BitSet(new long[]{0x00000000014482C0L});
    public static final BitSet FOLLOW_expression_in_expression237 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_11_in_expression239 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_expression248 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_10_in_expression250 = new BitSet(new long[]{0x00000000014482C0L});
    public static final BitSet FOLLOW_expression_in_expression254 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_11_in_expression256 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_expression265 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_10_in_expression267 = new BitSet(new long[]{0x00000000014482C0L});
    public static final BitSet FOLLOW_expression_in_expression271 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_11_in_expression273 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_expression282 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_10_in_expression284 = new BitSet(new long[]{0x00000000014482C0L});
    public static final BitSet FOLLOW_expression_in_expression288 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_11_in_expression290 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_expression301 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NUM_in_expression312 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_instruction336 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_AFF_in_instruction338 = new BitSet(new long[]{0x00000000014482C0L});
    public static final BitSet FOLLOW_expression_in_instruction342 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_instruction351 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_10_in_instruction353 = new BitSet(new long[]{0x00000000014482C0L});
    public static final BitSet FOLLOW_expression_in_instruction357 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_instruction359 = new BitSet(new long[]{0x00000000014482C0L});
    public static final BitSet FOLLOW_expression_in_instruction363 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_11_in_instruction365 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_25_in_instruction367 = new BitSet(new long[]{0x0000000000B92040L});
    public static final BitSet FOLLOW_instructions_in_instruction371 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_26_in_instruction373 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_instruction382 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_instruction391 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_10_in_instruction393 = new BitSet(new long[]{0x00000000014482C0L});
    public static final BitSet FOLLOW_expression_in_instruction397 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_11_in_instruction399 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_25_in_instruction401 = new BitSet(new long[]{0x0000000000B92040L});
    public static final BitSet FOLLOW_instructions_in_instruction405 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_26_in_instruction407 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_instruction418 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_ID_in_instruction422 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_instruction431 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_ID_in_instruction435 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_instruction444 = new BitSet(new long[]{0x00000000014482C0L});
    public static final BitSet FOLLOW_expression_in_instruction448 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_instructions469 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_instruction_in_instructions479 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_instructions_aux_in_instructions483 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_instructions_aux505 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_instructions_aux513 = new BitSet(new long[]{0x0000000000B92040L});
    public static final BitSet FOLLOW_instructions_in_instructions_aux517 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_arguments540 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_ID_in_arguments544 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_arguments554 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_ID_in_arguments558 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_arguments560 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_arguments_in_arguments564 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_program584 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_10_in_program586 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_arguments_in_program590 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_11_in_program592 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_25_in_program594 = new BitSet(new long[]{0x0000000000B92040L});
    public static final BitSet FOLLOW_instructions_in_program598 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_26_in_program600 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_program602 = new BitSet(new long[]{0x0000000000000002L});

}