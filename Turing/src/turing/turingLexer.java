// $ANTLR 3.4 /Users/hubert/Dropbox/personnel/developpeur/projet/antc-code/hub_version/turing.g 2012-06-15 09:54:21

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
    public static final int T__25=25;
    public static final int T__26=26;
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
            // /Users/hubert/Dropbox/personnel/developpeur/projet/antc-code/hub_version/turing.g:9:7: ( '+' )
            // /Users/hubert/Dropbox/personnel/developpeur/projet/antc-code/hub_version/turing.g:9:9: '+'
            {
            match('+'); 

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
            // /Users/hubert/Dropbox/personnel/developpeur/projet/antc-code/hub_version/turing.g:10:7: ( ',' )
            // /Users/hubert/Dropbox/personnel/developpeur/projet/antc-code/hub_version/turing.g:10:9: ','
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
    // $ANTLR end "T__12"

    // $ANTLR start "T__13"
    public final void mT__13() throws RecognitionException {
        try {
            int _type = T__13;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/hubert/Dropbox/personnel/developpeur/projet/antc-code/hub_version/turing.g:11:7: ( '0' )
            // /Users/hubert/Dropbox/personnel/developpeur/projet/antc-code/hub_version/turing.g:11:9: '0'
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
    // $ANTLR end "T__13"

    // $ANTLR start "T__14"
    public final void mT__14() throws RecognitionException {
        try {
            int _type = T__14;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/hubert/Dropbox/personnel/developpeur/projet/antc-code/hub_version/turing.g:12:7: ( '1' )
            // /Users/hubert/Dropbox/personnel/developpeur/projet/antc-code/hub_version/turing.g:12:9: '1'
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
    // $ANTLR end "T__14"

    // $ANTLR start "T__15"
    public final void mT__15() throws RecognitionException {
        try {
            int _type = T__15;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/hubert/Dropbox/personnel/developpeur/projet/antc-code/hub_version/turing.g:13:7: ( ';' )
            // /Users/hubert/Dropbox/personnel/developpeur/projet/antc-code/hub_version/turing.g:13:9: ';'
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
    // $ANTLR end "T__15"

    // $ANTLR start "T__16"
    public final void mT__16() throws RecognitionException {
        try {
            int _type = T__16;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/hubert/Dropbox/personnel/developpeur/projet/antc-code/hub_version/turing.g:14:7: ( '=' )
            // /Users/hubert/Dropbox/personnel/developpeur/projet/antc-code/hub_version/turing.g:14:9: '='
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
    // $ANTLR end "T__16"

    // $ANTLR start "T__17"
    public final void mT__17() throws RecognitionException {
        try {
            int _type = T__17;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/hubert/Dropbox/personnel/developpeur/projet/antc-code/hub_version/turing.g:15:7: ( 'head' )
            // /Users/hubert/Dropbox/personnel/developpeur/projet/antc-code/hub_version/turing.g:15:9: 'head'
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
    // $ANTLR end "T__17"

    // $ANTLR start "T__18"
    public final void mT__18() throws RecognitionException {
        try {
            int _type = T__18;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/hubert/Dropbox/personnel/developpeur/projet/antc-code/hub_version/turing.g:16:7: ( 'if' )
            // /Users/hubert/Dropbox/personnel/developpeur/projet/antc-code/hub_version/turing.g:16:9: 'if'
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
    // $ANTLR end "T__18"

    // $ANTLR start "T__19"
    public final void mT__19() throws RecognitionException {
        try {
            int _type = T__19;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/hubert/Dropbox/personnel/developpeur/projet/antc-code/hub_version/turing.g:17:7: ( 'input' )
            // /Users/hubert/Dropbox/personnel/developpeur/projet/antc-code/hub_version/turing.g:17:9: 'input'
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
    // $ANTLR end "T__19"

    // $ANTLR start "T__20"
    public final void mT__20() throws RecognitionException {
        try {
            int _type = T__20;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/hubert/Dropbox/personnel/developpeur/projet/antc-code/hub_version/turing.g:18:7: ( 'last' )
            // /Users/hubert/Dropbox/personnel/developpeur/projet/antc-code/hub_version/turing.g:18:9: 'last'
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
    // $ANTLR end "T__20"

    // $ANTLR start "T__21"
    public final void mT__21() throws RecognitionException {
        try {
            int _type = T__21;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/hubert/Dropbox/personnel/developpeur/projet/antc-code/hub_version/turing.g:19:7: ( 'return' )
            // /Users/hubert/Dropbox/personnel/developpeur/projet/antc-code/hub_version/turing.g:19:9: 'return'
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
    // $ANTLR end "T__21"

    // $ANTLR start "T__22"
    public final void mT__22() throws RecognitionException {
        try {
            int _type = T__22;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/hubert/Dropbox/personnel/developpeur/projet/antc-code/hub_version/turing.g:20:7: ( 'stop' )
            // /Users/hubert/Dropbox/personnel/developpeur/projet/antc-code/hub_version/turing.g:20:9: 'stop'
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
    // $ANTLR end "T__22"

    // $ANTLR start "T__23"
    public final void mT__23() throws RecognitionException {
        try {
            int _type = T__23;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/hubert/Dropbox/personnel/developpeur/projet/antc-code/hub_version/turing.g:21:7: ( 'typedef' )
            // /Users/hubert/Dropbox/personnel/developpeur/projet/antc-code/hub_version/turing.g:21:9: 'typedef'
            {
            match("typedef"); 



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
            // /Users/hubert/Dropbox/personnel/developpeur/projet/antc-code/hub_version/turing.g:22:7: ( 'while' )
            // /Users/hubert/Dropbox/personnel/developpeur/projet/antc-code/hub_version/turing.g:22:9: 'while'
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
    // $ANTLR end "T__24"

    // $ANTLR start "T__25"
    public final void mT__25() throws RecognitionException {
        try {
            int _type = T__25;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/hubert/Dropbox/personnel/developpeur/projet/antc-code/hub_version/turing.g:23:7: ( '{' )
            // /Users/hubert/Dropbox/personnel/developpeur/projet/antc-code/hub_version/turing.g:23:9: '{'
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
    // $ANTLR end "T__25"

    // $ANTLR start "T__26"
    public final void mT__26() throws RecognitionException {
        try {
            int _type = T__26;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/hubert/Dropbox/personnel/developpeur/projet/antc-code/hub_version/turing.g:24:7: ( '}' )
            // /Users/hubert/Dropbox/personnel/developpeur/projet/antc-code/hub_version/turing.g:24:9: '}'
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
    // $ANTLR end "T__26"

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
        // /Users/hubert/Dropbox/personnel/developpeur/projet/antc-code/hub_version/turing.g:1:8: ( T__8 | T__9 | T__10 | T__11 | T__12 | T__13 | T__14 | T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | ID | COMMENT | WS | AFF )
        int alt6=23;
        alt6 = dfa6.predict(input);
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
                // /Users/hubert/Dropbox/personnel/developpeur/projet/antc-code/hub_version/turing.g:1:110: T__25
                {
                mT__25(); 


                }
                break;
            case 19 :
                // /Users/hubert/Dropbox/personnel/developpeur/projet/antc-code/hub_version/turing.g:1:116: T__26
                {
                mT__26(); 


                }
                break;
            case 20 :
                // /Users/hubert/Dropbox/personnel/developpeur/projet/antc-code/hub_version/turing.g:1:122: ID
                {
                mID(); 


                }
                break;
            case 21 :
                // /Users/hubert/Dropbox/personnel/developpeur/projet/antc-code/hub_version/turing.g:1:125: COMMENT
                {
                mCOMMENT(); 


                }
                break;
            case 22 :
                // /Users/hubert/Dropbox/personnel/developpeur/projet/antc-code/hub_version/turing.g:1:133: WS
                {
                mWS(); 


                }
                break;
            case 23 :
                // /Users/hubert/Dropbox/personnel/developpeur/projet/antc-code/hub_version/turing.g:1:136: AFF
                {
                mAFF(); 


                }
                break;

        }

    }


    protected DFA6 dfa6 = new DFA6(this);
    static final String DFA6_eotS =
        "\12\uffff\7\23\6\uffff\1\23\1\40\7\23\1\uffff\6\23\1\56\1\23\1\60"+
        "\1\23\1\62\2\23\1\uffff\1\65\1\uffff\1\23\1\uffff\1\23\1\70\1\uffff"+
        "\1\71\1\23\2\uffff\1\73\1\uffff";
    static final String DFA6_eofS =
        "\74\uffff";
    static final String DFA6_minS =
        "\1\11\11\uffff\1\145\1\146\1\141\1\145\1\164\1\171\1\150\6\uffff"+
        "\1\141\1\60\1\160\1\163\1\164\1\157\1\160\1\151\1\144\1\uffff\1"+
        "\165\1\164\1\165\1\160\1\145\1\154\1\60\1\164\1\60\1\162\1\60\1"+
        "\144\1\145\1\uffff\1\60\1\uffff\1\156\1\uffff\1\145\1\60\1\uffff"+
        "\1\60\1\146\2\uffff\1\60\1\uffff";
    static final String DFA6_maxS =
        "\1\175\11\uffff\1\145\1\156\1\141\1\145\1\164\1\171\1\150\6\uffff"+
        "\1\141\1\172\1\160\1\163\1\164\1\157\1\160\1\151\1\144\1\uffff\1"+
        "\165\1\164\1\165\1\160\1\145\1\154\1\172\1\164\1\172\1\162\1\172"+
        "\1\144\1\145\1\uffff\1\172\1\uffff\1\156\1\uffff\1\145\1\172\1\uffff"+
        "\1\172\1\146\2\uffff\1\172\1\uffff";
    static final String DFA6_acceptS =
        "\1\uffff\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\11\7\uffff\1\22\1\23"+
        "\1\24\1\25\1\26\1\27\11\uffff\1\13\15\uffff\1\12\1\uffff\1\15\1"+
        "\uffff\1\17\2\uffff\1\14\2\uffff\1\21\1\16\1\uffff\1\20";
    static final String DFA6_specialS =
        "\74\uffff}>";
    static final String[] DFA6_transitionS = {
            "\2\25\2\uffff\1\25\22\uffff\1\25\2\uffff\1\1\4\uffff\1\2\1\3"+
            "\1\uffff\1\4\1\5\2\uffff\1\24\1\6\1\7\10\uffff\1\26\1\10\1\uffff"+
            "\1\11\3\uffff\32\23\4\uffff\1\23\1\uffff\7\23\1\12\1\13\2\23"+
            "\1\14\5\23\1\15\1\16\1\17\2\23\1\20\3\23\1\21\1\uffff\1\22",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\27",
            "\1\30\7\uffff\1\31",
            "\1\32",
            "\1\33",
            "\1\34",
            "\1\35",
            "\1\36",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\37",
            "\12\23\7\uffff\32\23\4\uffff\1\23\1\uffff\32\23",
            "\1\41",
            "\1\42",
            "\1\43",
            "\1\44",
            "\1\45",
            "\1\46",
            "\1\47",
            "",
            "\1\50",
            "\1\51",
            "\1\52",
            "\1\53",
            "\1\54",
            "\1\55",
            "\12\23\7\uffff\32\23\4\uffff\1\23\1\uffff\32\23",
            "\1\57",
            "\12\23\7\uffff\32\23\4\uffff\1\23\1\uffff\32\23",
            "\1\61",
            "\12\23\7\uffff\32\23\4\uffff\1\23\1\uffff\32\23",
            "\1\63",
            "\1\64",
            "",
            "\12\23\7\uffff\32\23\4\uffff\1\23\1\uffff\32\23",
            "",
            "\1\66",
            "",
            "\1\67",
            "\12\23\7\uffff\32\23\4\uffff\1\23\1\uffff\32\23",
            "",
            "\12\23\7\uffff\32\23\4\uffff\1\23\1\uffff\32\23",
            "\1\72",
            "",
            "",
            "\12\23\7\uffff\32\23\4\uffff\1\23\1\uffff\32\23",
            ""
    };

    static final short[] DFA6_eot = DFA.unpackEncodedString(DFA6_eotS);
    static final short[] DFA6_eof = DFA.unpackEncodedString(DFA6_eofS);
    static final char[] DFA6_min = DFA.unpackEncodedStringToUnsignedChars(DFA6_minS);
    static final char[] DFA6_max = DFA.unpackEncodedStringToUnsignedChars(DFA6_maxS);
    static final short[] DFA6_accept = DFA.unpackEncodedString(DFA6_acceptS);
    static final short[] DFA6_special = DFA.unpackEncodedString(DFA6_specialS);
    static final short[][] DFA6_transition;

    static {
        int numStates = DFA6_transitionS.length;
        DFA6_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA6_transition[i] = DFA.unpackEncodedString(DFA6_transitionS[i]);
        }
    }

    class DFA6 extends DFA {

        public DFA6(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 6;
            this.eot = DFA6_eot;
            this.eof = DFA6_eof;
            this.min = DFA6_min;
            this.max = DFA6_max;
            this.accept = DFA6_accept;
            this.special = DFA6_special;
            this.transition = DFA6_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( T__8 | T__9 | T__10 | T__11 | T__12 | T__13 | T__14 | T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | ID | COMMENT | WS | AFF );";
        }
    }
 

}