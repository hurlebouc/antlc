// $ANTLR 3.4 /Users/hubert/Dropbox/personnel/developpeur/projet/antc-code/hub_version/turing.g 2012-06-14 11:51:46

 package turing;
 

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked"})
public class turingLexer extends Lexer {
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
    // delegators
    public Lexer[] getDelegates() {
        return new Lexer[] {};
    }

    public turingLexer() {} 
    public turingLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public turingLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);
    }
    public String getGrammarFileName() { return "/Users/hubert/Dropbox/personnel/developpeur/projet/antc-code/hub_version/turing.g"; }

    // $ANTLR start "T__8"
    public final void mT__8() throws RecognitionException {
        try {
            int _type = T__8;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/hubert/Dropbox/personnel/developpeur/projet/antc-code/hub_version/turing.g:6:6: ( '#' )
            // /Users/hubert/Dropbox/personnel/developpeur/projet/antc-code/hub_version/turing.g:6:8: '#'
            {
            match('#'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__8"

    // $ANTLR start "T__9"
    public final void mT__9() throws RecognitionException {
        try {
            int _type = T__9;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/hubert/Dropbox/personnel/developpeur/projet/antc-code/hub_version/turing.g:7:6: ( '(' )
            // /Users/hubert/Dropbox/personnel/developpeur/projet/antc-code/hub_version/turing.g:7:8: '('
            {
            match('('); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__9"

    // $ANTLR start "T__10"
    public final void mT__10() throws RecognitionException {
        try {
            int _type = T__10;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/hubert/Dropbox/personnel/developpeur/projet/antc-code/hub_version/turing.g:8:7: ( ')' )
            // /Users/hubert/Dropbox/personnel/developpeur/projet/antc-code/hub_version/turing.g:8:9: ')'
            {
            match(')'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__10"

    // $ANTLR start "T__11"
    public final void mT__11() throws RecognitionException {
        try {
            int _type = T__11;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/hubert/Dropbox/personnel/developpeur/projet/antc-code/hub_version/turing.g:9:7: ( ',' )
            // /Users/hubert/Dropbox/personnel/developpeur/projet/antc-code/hub_version/turing.g:9:9: ','
            {
            match(','); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__11"

    // $ANTLR start "T__12"
    public final void mT__12() throws RecognitionException {
        try {
            int _type = T__12;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/hubert/Dropbox/personnel/developpeur/projet/antc-code/hub_version/turing.g:10:7: ( '0' )
            // /Users/hubert/Dropbox/personnel/developpeur/projet/antc-code/hub_version/turing.g:10:9: '0'
            {
            match('0'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__12"

    // $ANTLR start "T__13"
    public final void mT__13() throws RecognitionException {
        try {
            int _type = T__13;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/hubert/Dropbox/personnel/developpeur/projet/antc-code/hub_version/turing.g:11:7: ( '1' )
            // /Users/hubert/Dropbox/personnel/developpeur/projet/antc-code/hub_version/turing.g:11:9: '1'
            {
            match('1'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__13"

    // $ANTLR start "T__14"
    public final void mT__14() throws RecognitionException {
        try {
            int _type = T__14;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/hubert/Dropbox/personnel/developpeur/projet/antc-code/hub_version/turing.g:12:7: ( ';' )
            // /Users/hubert/Dropbox/personnel/developpeur/projet/antc-code/hub_version/turing.g:12:9: ';'
            {
            match(';'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__14"

    // $ANTLR start "T__15"
    public final void mT__15() throws RecognitionException {
        try {
            int _type = T__15;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/hubert/Dropbox/personnel/developpeur/projet/antc-code/hub_version/turing.g:13:7: ( '=' )
            // /Users/hubert/Dropbox/personnel/developpeur/projet/antc-code/hub_version/turing.g:13:9: '='
            {
            match('='); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__15"

    // $ANTLR start "T__16"
    public final void mT__16() throws RecognitionException {
        try {
            int _type = T__16;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/hubert/Dropbox/personnel/developpeur/projet/antc-code/hub_version/turing.g:14:7: ( 'head' )
            // /Users/hubert/Dropbox/personnel/developpeur/projet/antc-code/hub_version/turing.g:14:9: 'head'
            {
            match("head"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__16"

    // $ANTLR start "T__17"
    public final void mT__17() throws RecognitionException {
        try {
            int _type = T__17;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/hubert/Dropbox/personnel/developpeur/projet/antc-code/hub_version/turing.g:15:7: ( 'if' )
            // /Users/hubert/Dropbox/personnel/developpeur/projet/antc-code/hub_version/turing.g:15:9: 'if'
            {
            match("if"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__17"

    // $ANTLR start "T__18"
    public final void mT__18() throws RecognitionException {
        try {
            int _type = T__18;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/hubert/Dropbox/personnel/developpeur/projet/antc-code/hub_version/turing.g:16:7: ( 'input' )
            // /Users/hubert/Dropbox/personnel/developpeur/projet/antc-code/hub_version/turing.g:16:9: 'input'
            {
            match("input"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__18"

    // $ANTLR start "T__19"
    public final void mT__19() throws RecognitionException {
        try {
            int _type = T__19;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/hubert/Dropbox/personnel/developpeur/projet/antc-code/hub_version/turing.g:17:7: ( 'last' )
            // /Users/hubert/Dropbox/personnel/developpeur/projet/antc-code/hub_version/turing.g:17:9: 'last'
            {
            match("last"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__19"

    // $ANTLR start "T__20"
    public final void mT__20() throws RecognitionException {
        try {
            int _type = T__20;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/hubert/Dropbox/personnel/developpeur/projet/antc-code/hub_version/turing.g:18:7: ( 'return' )
            // /Users/hubert/Dropbox/personnel/developpeur/projet/antc-code/hub_version/turing.g:18:9: 'return'
            {
            match("return"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__20"

    // $ANTLR start "T__21"
    public final void mT__21() throws RecognitionException {
        try {
            int _type = T__21;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/hubert/Dropbox/personnel/developpeur/projet/antc-code/hub_version/turing.g:19:7: ( 'stop' )
            // /Users/hubert/Dropbox/personnel/developpeur/projet/antc-code/hub_version/turing.g:19:9: 'stop'
            {
            match("stop"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__21"

    // $ANTLR start "T__22"
    public final void mT__22() throws RecognitionException {
        try {
            int _type = T__22;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/hubert/Dropbox/personnel/developpeur/projet/antc-code/hub_version/turing.g:20:7: ( 'while' )
            // /Users/hubert/Dropbox/personnel/developpeur/projet/antc-code/hub_version/turing.g:20:9: 'while'
            {
            match("while"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__22"

    // $ANTLR start "T__23"
    public final void mT__23() throws RecognitionException {
        try {
            int _type = T__23;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/hubert/Dropbox/personnel/developpeur/projet/antc-code/hub_version/turing.g:21:7: ( '{' )
            // /Users/hubert/Dropbox/personnel/developpeur/projet/antc-code/hub_version/turing.g:21:9: '{'
            {
            match('{'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__23"

    // $ANTLR start "T__24"
    public final void mT__24() throws RecognitionException {
        try {
            int _type = T__24;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/hubert/Dropbox/personnel/developpeur/projet/antc-code/hub_version/turing.g:22:7: ( '}' )
            // /Users/hubert/Dropbox/personnel/developpeur/projet/antc-code/hub_version/turing.g:22:9: '}'
            {
            match('}'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__24"

    // $ANTLR start "ID"
    public final void mID() throws RecognitionException {
        try {
            int _type = ID;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/hubert/Dropbox/personnel/developpeur/projet/antc-code/hub_version/turing.g:12:5: ( ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' )* )
            // /Users/hubert/Dropbox/personnel/developpeur/projet/antc-code/hub_version/turing.g:12:7: ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' )*
            {
            if ( (input.LA(1) >= 'A' && input.LA(1) <= 'Z')||input.LA(1)=='_'||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            // /Users/hubert/Dropbox/personnel/developpeur/projet/antc-code/hub_version/turing.g:12:31: ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( ((LA1_0 >= '0' && LA1_0 <= '9')||(LA1_0 >= 'A' && LA1_0 <= 'Z')||LA1_0=='_'||(LA1_0 >= 'a' && LA1_0 <= 'z')) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // /Users/hubert/Dropbox/personnel/developpeur/projet/antc-code/hub_version/turing.g:
            	    {
            	    if ( (input.LA(1) >= '0' && input.LA(1) <= '9')||(input.LA(1) >= 'A' && input.LA(1) <= 'Z')||input.LA(1)=='_'||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
            	        input.consume();
            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;
            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "ID"

    // $ANTLR start "COMMENT"
    public final void mCOMMENT() throws RecognitionException {
        try {
            int _type = COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/hubert/Dropbox/personnel/developpeur/projet/antc-code/hub_version/turing.g:16:5: ( '//' (~ ( '\\n' | '\\r' ) )* ( '\\r' )? '\\n' | '/*' ( options {greedy=false; } : . )* '*/' )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0=='/') ) {
                int LA5_1 = input.LA(2);

                if ( (LA5_1=='/') ) {
                    alt5=1;
                }
                else if ( (LA5_1=='*') ) {
                    alt5=2;
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
                    // /Users/hubert/Dropbox/personnel/developpeur/projet/antc-code/hub_version/turing.g:16:9: '//' (~ ( '\\n' | '\\r' ) )* ( '\\r' )? '\\n'
                    {
                    match("//"); 



                    // /Users/hubert/Dropbox/personnel/developpeur/projet/antc-code/hub_version/turing.g:16:14: (~ ( '\\n' | '\\r' ) )*
                    loop2:
                    do {
                        int alt2=2;
                        int LA2_0 = input.LA(1);

                        if ( ((LA2_0 >= '\u0000' && LA2_0 <= '\t')||(LA2_0 >= '\u000B' && LA2_0 <= '\f')||(LA2_0 >= '\u000E' && LA2_0 <= '\uFFFF')) ) {
                            alt2=1;
                        }


                        switch (alt2) {
                    	case 1 :
                    	    // /Users/hubert/Dropbox/personnel/developpeur/projet/antc-code/hub_version/turing.g:
                    	    {
                    	    if ( (input.LA(1) >= '\u0000' && input.LA(1) <= '\t')||(input.LA(1) >= '\u000B' && input.LA(1) <= '\f')||(input.LA(1) >= '\u000E' && input.LA(1) <= '\uFFFF') ) {
                    	        input.consume();
                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;
                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop2;
                        }
                    } while (true);


                    // /Users/hubert/Dropbox/personnel/developpeur/projet/antc-code/hub_version/turing.g:16:28: ( '\\r' )?
                    int alt3=2;
                    int LA3_0 = input.LA(1);

                    if ( (LA3_0=='\r') ) {
                        alt3=1;
                    }
                    switch (alt3) {
                        case 1 :
                            // /Users/hubert/Dropbox/personnel/developpeur/projet/antc-code/hub_version/turing.g:16:28: '\\r'
                            {
                            match('\r'); 

                            }
                            break;

                    }


                    match('\n'); 

                    _channel=HIDDEN;

                    }
                    break;
                case 2 :
                    // /Users/hubert/Dropbox/personnel/developpeur/projet/antc-code/hub_version/turing.g:17:9: '/*' ( options {greedy=false; } : . )* '*/'
                    {
                    match("/*"); 



                    // /Users/hubert/Dropbox/personnel/developpeur/projet/antc-code/hub_version/turing.g:17:14: ( options {greedy=false; } : . )*
                    loop4:
                    do {
                        int alt4=2;
                        int LA4_0 = input.LA(1);

                        if ( (LA4_0=='*') ) {
                            int LA4_1 = input.LA(2);

                            if ( (LA4_1=='/') ) {
                                alt4=2;
                            }
                            else if ( ((LA4_1 >= '\u0000' && LA4_1 <= '.')||(LA4_1 >= '0' && LA4_1 <= '\uFFFF')) ) {
                                alt4=1;
                            }


                        }
                        else if ( ((LA4_0 >= '\u0000' && LA4_0 <= ')')||(LA4_0 >= '+' && LA4_0 <= '\uFFFF')) ) {
                            alt4=1;
                        }


                        switch (alt4) {
                    	case 1 :
                    	    // /Users/hubert/Dropbox/personnel/developpeur/projet/antc-code/hub_version/turing.g:17:42: .
                    	    {
                    	    matchAny(); 

                    	    }
                    	    break;

                    	default :
                    	    break loop4;
                        }
                    } while (true);


                    match("*/"); 



                    _channel=HIDDEN;

                    }
                    break;

            }
            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "COMMENT"

    // $ANTLR start "WS"
    public final void mWS() throws RecognitionException {
        try {
            int _type = WS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/hubert/Dropbox/personnel/developpeur/projet/antc-code/hub_version/turing.g:20:5: ( ( ' ' | '\\t' | '\\r' | '\\n' ) )
            // /Users/hubert/Dropbox/personnel/developpeur/projet/antc-code/hub_version/turing.g:20:9: ( ' ' | '\\t' | '\\r' | '\\n' )
            {
            if ( (input.LA(1) >= '\t' && input.LA(1) <= '\n')||input.LA(1)=='\r'||input.LA(1)==' ' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            _channel=HIDDEN;

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "WS"

    // $ANTLR start "AFF"
    public final void mAFF() throws RecognitionException {
        try {
            int _type = AFF;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/hubert/Dropbox/personnel/developpeur/projet/antc-code/hub_version/turing.g:27:5: ( ':=' )
            // /Users/hubert/Dropbox/personnel/developpeur/projet/antc-code/hub_version/turing.g:28:2: ':='
            {
            match(":="); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "AFF"

    public void mTokens() throws RecognitionException {
        // /Users/hubert/Dropbox/personnel/developpeur/projet/antc-code/hub_version/turing.g:1:8: ( T__8 | T__9 | T__10 | T__11 | T__12 | T__13 | T__14 | T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | ID | COMMENT | WS | AFF )
        int alt6=21;
        switch ( input.LA(1) ) {
        case '#':
            {
            alt6=1;
            }
            break;
        case '(':
            {
            alt6=2;
            }
            break;
        case ')':
            {
            alt6=3;
            }
            break;
        case ',':
            {
            alt6=4;
            }
            break;
        case '0':
            {
            alt6=5;
            }
            break;
        case '1':
            {
            alt6=6;
            }
            break;
        case ';':
            {
            alt6=7;
            }
            break;
        case '=':
            {
            alt6=8;
            }
            break;
        case 'h':
            {
            int LA6_9 = input.LA(2);

            if ( (LA6_9=='e') ) {
                int LA6_21 = input.LA(3);

                if ( (LA6_21=='a') ) {
                    int LA6_28 = input.LA(4);

                    if ( (LA6_28=='d') ) {
                        int LA6_35 = input.LA(5);

                        if ( ((LA6_35 >= '0' && LA6_35 <= '9')||(LA6_35 >= 'A' && LA6_35 <= 'Z')||LA6_35=='_'||(LA6_35 >= 'a' && LA6_35 <= 'z')) ) {
                            alt6=18;
                        }
                        else {
                            alt6=9;
                        }
                    }
                    else {
                        alt6=18;
                    }
                }
                else {
                    alt6=18;
                }
            }
            else {
                alt6=18;
            }
            }
            break;
        case 'i':
            {
            switch ( input.LA(2) ) {
            case 'f':
                {
                int LA6_22 = input.LA(3);

                if ( ((LA6_22 >= '0' && LA6_22 <= '9')||(LA6_22 >= 'A' && LA6_22 <= 'Z')||LA6_22=='_'||(LA6_22 >= 'a' && LA6_22 <= 'z')) ) {
                    alt6=18;
                }
                else {
                    alt6=10;
                }
                }
                break;
            case 'n':
                {
                int LA6_23 = input.LA(3);

                if ( (LA6_23=='p') ) {
                    int LA6_30 = input.LA(4);

                    if ( (LA6_30=='u') ) {
                        int LA6_36 = input.LA(5);

                        if ( (LA6_36=='t') ) {
                            int LA6_42 = input.LA(6);

                            if ( ((LA6_42 >= '0' && LA6_42 <= '9')||(LA6_42 >= 'A' && LA6_42 <= 'Z')||LA6_42=='_'||(LA6_42 >= 'a' && LA6_42 <= 'z')) ) {
                                alt6=18;
                            }
                            else {
                                alt6=11;
                            }
                        }
                        else {
                            alt6=18;
                        }
                    }
                    else {
                        alt6=18;
                    }
                }
                else {
                    alt6=18;
                }
                }
                break;
            default:
                alt6=18;
            }

            }
            break;
        case 'l':
            {
            int LA6_11 = input.LA(2);

            if ( (LA6_11=='a') ) {
                int LA6_24 = input.LA(3);

                if ( (LA6_24=='s') ) {
                    int LA6_31 = input.LA(4);

                    if ( (LA6_31=='t') ) {
                        int LA6_37 = input.LA(5);

                        if ( ((LA6_37 >= '0' && LA6_37 <= '9')||(LA6_37 >= 'A' && LA6_37 <= 'Z')||LA6_37=='_'||(LA6_37 >= 'a' && LA6_37 <= 'z')) ) {
                            alt6=18;
                        }
                        else {
                            alt6=12;
                        }
                    }
                    else {
                        alt6=18;
                    }
                }
                else {
                    alt6=18;
                }
            }
            else {
                alt6=18;
            }
            }
            break;
        case 'r':
            {
            int LA6_12 = input.LA(2);

            if ( (LA6_12=='e') ) {
                int LA6_25 = input.LA(3);

                if ( (LA6_25=='t') ) {
                    int LA6_32 = input.LA(4);

                    if ( (LA6_32=='u') ) {
                        int LA6_38 = input.LA(5);

                        if ( (LA6_38=='r') ) {
                            int LA6_44 = input.LA(6);

                            if ( (LA6_44=='n') ) {
                                int LA6_48 = input.LA(7);

                                if ( ((LA6_48 >= '0' && LA6_48 <= '9')||(LA6_48 >= 'A' && LA6_48 <= 'Z')||LA6_48=='_'||(LA6_48 >= 'a' && LA6_48 <= 'z')) ) {
                                    alt6=18;
                                }
                                else {
                                    alt6=13;
                                }
                            }
                            else {
                                alt6=18;
                            }
                        }
                        else {
                            alt6=18;
                        }
                    }
                    else {
                        alt6=18;
                    }
                }
                else {
                    alt6=18;
                }
            }
            else {
                alt6=18;
            }
            }
            break;
        case 's':
            {
            int LA6_13 = input.LA(2);

            if ( (LA6_13=='t') ) {
                int LA6_26 = input.LA(3);

                if ( (LA6_26=='o') ) {
                    int LA6_33 = input.LA(4);

                    if ( (LA6_33=='p') ) {
                        int LA6_39 = input.LA(5);

                        if ( ((LA6_39 >= '0' && LA6_39 <= '9')||(LA6_39 >= 'A' && LA6_39 <= 'Z')||LA6_39=='_'||(LA6_39 >= 'a' && LA6_39 <= 'z')) ) {
                            alt6=18;
                        }
                        else {
                            alt6=14;
                        }
                    }
                    else {
                        alt6=18;
                    }
                }
                else {
                    alt6=18;
                }
            }
            else {
                alt6=18;
            }
            }
            break;
        case 'w':
            {
            int LA6_14 = input.LA(2);

            if ( (LA6_14=='h') ) {
                int LA6_27 = input.LA(3);

                if ( (LA6_27=='i') ) {
                    int LA6_34 = input.LA(4);

                    if ( (LA6_34=='l') ) {
                        int LA6_40 = input.LA(5);

                        if ( (LA6_40=='e') ) {
                            int LA6_46 = input.LA(6);

                            if ( ((LA6_46 >= '0' && LA6_46 <= '9')||(LA6_46 >= 'A' && LA6_46 <= 'Z')||LA6_46=='_'||(LA6_46 >= 'a' && LA6_46 <= 'z')) ) {
                                alt6=18;
                            }
                            else {
                                alt6=15;
                            }
                        }
                        else {
                            alt6=18;
                        }
                    }
                    else {
                        alt6=18;
                    }
                }
                else {
                    alt6=18;
                }
            }
            else {
                alt6=18;
            }
            }
            break;
        case '{':
            {
            alt6=16;
            }
            break;
        case '}':
            {
            alt6=17;
            }
            break;
        case 'A':
        case 'B':
        case 'C':
        case 'D':
        case 'E':
        case 'F':
        case 'G':
        case 'H':
        case 'I':
        case 'J':
        case 'K':
        case 'L':
        case 'M':
        case 'N':
        case 'O':
        case 'P':
        case 'Q':
        case 'R':
        case 'S':
        case 'T':
        case 'U':
        case 'V':
        case 'W':
        case 'X':
        case 'Y':
        case 'Z':
        case '_':
        case 'a':
        case 'b':
        case 'c':
        case 'd':
        case 'e':
        case 'f':
        case 'g':
        case 'j':
        case 'k':
        case 'm':
        case 'n':
        case 'o':
        case 'p':
        case 'q':
        case 't':
        case 'u':
        case 'v':
        case 'x':
        case 'y':
        case 'z':
            {
            alt6=18;
            }
            break;
        case '/':
            {
            alt6=19;
            }
            break;
        case '\t':
        case '\n':
        case '\r':
        case ' ':
            {
            alt6=20;
            }
            break;
        case ':':
            {
            alt6=21;
            }
            break;
        default:
            NoViableAltException nvae =
                new NoViableAltException("", 6, 0, input);

            throw nvae;

        }

        switch (alt6) {
            case 1 :
                // /Users/hubert/Dropbox/personnel/developpeur/projet/antc-code/hub_version/turing.g:1:10: T__8
                {
                mT__8(); 


                }
                break;
            case 2 :
                // /Users/hubert/Dropbox/personnel/developpeur/projet/antc-code/hub_version/turing.g:1:15: T__9
                {
                mT__9(); 


                }
                break;
            case 3 :
                // /Users/hubert/Dropbox/personnel/developpeur/projet/antc-code/hub_version/turing.g:1:20: T__10
                {
                mT__10(); 


                }
                break;
            case 4 :
                // /Users/hubert/Dropbox/personnel/developpeur/projet/antc-code/hub_version/turing.g:1:26: T__11
                {
                mT__11(); 


                }
                break;
            case 5 :
                // /Users/hubert/Dropbox/personnel/developpeur/projet/antc-code/hub_version/turing.g:1:32: T__12
                {
                mT__12(); 


                }
                break;
            case 6 :
                // /Users/hubert/Dropbox/personnel/developpeur/projet/antc-code/hub_version/turing.g:1:38: T__13
                {
                mT__13(); 


                }
                break;
            case 7 :
                // /Users/hubert/Dropbox/personnel/developpeur/projet/antc-code/hub_version/turing.g:1:44: T__14
                {
                mT__14(); 


                }
                break;
            case 8 :
                // /Users/hubert/Dropbox/personnel/developpeur/projet/antc-code/hub_version/turing.g:1:50: T__15
                {
                mT__15(); 


                }
                break;
            case 9 :
                // /Users/hubert/Dropbox/personnel/developpeur/projet/antc-code/hub_version/turing.g:1:56: T__16
                {
                mT__16(); 


                }
                break;
            case 10 :
                // /Users/hubert/Dropbox/personnel/developpeur/projet/antc-code/hub_version/turing.g:1:62: T__17
                {
                mT__17(); 


                }
                break;
            case 11 :
                // /Users/hubert/Dropbox/personnel/developpeur/projet/antc-code/hub_version/turing.g:1:68: T__18
                {
                mT__18(); 


                }
                break;
            case 12 :
                // /Users/hubert/Dropbox/personnel/developpeur/projet/antc-code/hub_version/turing.g:1:74: T__19
                {
                mT__19(); 


                }
                break;
            case 13 :
                // /Users/hubert/Dropbox/personnel/developpeur/projet/antc-code/hub_version/turing.g:1:80: T__20
                {
                mT__20(); 


                }
                break;
            case 14 :
                // /Users/hubert/Dropbox/personnel/developpeur/projet/antc-code/hub_version/turing.g:1:86: T__21
                {
                mT__21(); 


                }
                break;
            case 15 :
                // /Users/hubert/Dropbox/personnel/developpeur/projet/antc-code/hub_version/turing.g:1:92: T__22
                {
                mT__22(); 


                }
                break;
            case 16 :
                // /Users/hubert/Dropbox/personnel/developpeur/projet/antc-code/hub_version/turing.g:1:98: T__23
                {
                mT__23(); 


                }
                break;
            case 17 :
                // /Users/hubert/Dropbox/personnel/developpeur/projet/antc-code/hub_version/turing.g:1:104: T__24
                {
                mT__24(); 


                }
                break;
            case 18 :
                // /Users/hubert/Dropbox/personnel/developpeur/projet/antc-code/hub_version/turing.g:1:110: ID
                {
                mID(); 


                }
                break;
            case 19 :
                // /Users/hubert/Dropbox/personnel/developpeur/projet/antc-code/hub_version/turing.g:1:113: COMMENT
                {
                mCOMMENT(); 


                }
                break;
            case 20 :
                // /Users/hubert/Dropbox/personnel/developpeur/projet/antc-code/hub_version/turing.g:1:121: WS
                {
                mWS(); 


                }
                break;
            case 21 :
                // /Users/hubert/Dropbox/personnel/developpeur/projet/antc-code/hub_version/turing.g:1:124: AFF
                {
                mAFF(); 


                }
                break;

        }

    }


 

}