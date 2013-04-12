// $ANTLR 3.5 /Users/hubert/Dropbox/projects/antc-code/hub_version/turing.g 2013-04-12 20:30:36

  package parser;
  

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class turingLexer extends Lexer {
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
	@Override public String getGrammarFileName() { return "/Users/hubert/Dropbox/projects/antc-code/hub_version/turing.g"; }

	// $ANTLR start "T__9"
	public final void mT__9() throws RecognitionException {
		try {
			int _type = T__9;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/hubert/Dropbox/projects/antc-code/hub_version/turing.g:6:6: ( '#' )
			// /Users/hubert/Dropbox/projects/antc-code/hub_version/turing.g:6:8: '#'
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
	// $ANTLR end "T__9"

	// $ANTLR start "T__10"
	public final void mT__10() throws RecognitionException {
		try {
			int _type = T__10;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/hubert/Dropbox/projects/antc-code/hub_version/turing.g:7:7: ( '(' )
			// /Users/hubert/Dropbox/projects/antc-code/hub_version/turing.g:7:9: '('
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
	// $ANTLR end "T__10"

	// $ANTLR start "T__11"
	public final void mT__11() throws RecognitionException {
		try {
			int _type = T__11;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/hubert/Dropbox/projects/antc-code/hub_version/turing.g:8:7: ( ')' )
			// /Users/hubert/Dropbox/projects/antc-code/hub_version/turing.g:8:9: ')'
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
	// $ANTLR end "T__11"

	// $ANTLR start "T__12"
	public final void mT__12() throws RecognitionException {
		try {
			int _type = T__12;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/hubert/Dropbox/projects/antc-code/hub_version/turing.g:9:7: ( ',' )
			// /Users/hubert/Dropbox/projects/antc-code/hub_version/turing.g:9:9: ','
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
			// /Users/hubert/Dropbox/projects/antc-code/hub_version/turing.g:10:7: ( ';' )
			// /Users/hubert/Dropbox/projects/antc-code/hub_version/turing.g:10:9: ';'
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
	// $ANTLR end "T__13"

	// $ANTLR start "T__14"
	public final void mT__14() throws RecognitionException {
		try {
			int _type = T__14;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/hubert/Dropbox/projects/antc-code/hub_version/turing.g:11:7: ( '=' )
			// /Users/hubert/Dropbox/projects/antc-code/hub_version/turing.g:11:9: '='
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
	// $ANTLR end "T__14"

	// $ANTLR start "T__15"
	public final void mT__15() throws RecognitionException {
		try {
			int _type = T__15;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/hubert/Dropbox/projects/antc-code/hub_version/turing.g:12:7: ( 'head' )
			// /Users/hubert/Dropbox/projects/antc-code/hub_version/turing.g:12:9: 'head'
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
	// $ANTLR end "T__15"

	// $ANTLR start "T__16"
	public final void mT__16() throws RecognitionException {
		try {
			int _type = T__16;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/hubert/Dropbox/projects/antc-code/hub_version/turing.g:13:7: ( 'if' )
			// /Users/hubert/Dropbox/projects/antc-code/hub_version/turing.g:13:9: 'if'
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
	// $ANTLR end "T__16"

	// $ANTLR start "T__17"
	public final void mT__17() throws RecognitionException {
		try {
			int _type = T__17;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/hubert/Dropbox/projects/antc-code/hub_version/turing.g:14:7: ( 'input' )
			// /Users/hubert/Dropbox/projects/antc-code/hub_version/turing.g:14:9: 'input'
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
	// $ANTLR end "T__17"

	// $ANTLR start "T__18"
	public final void mT__18() throws RecognitionException {
		try {
			int _type = T__18;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/hubert/Dropbox/projects/antc-code/hub_version/turing.g:15:7: ( 'last' )
			// /Users/hubert/Dropbox/projects/antc-code/hub_version/turing.g:15:9: 'last'
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
	// $ANTLR end "T__18"

	// $ANTLR start "T__19"
	public final void mT__19() throws RecognitionException {
		try {
			int _type = T__19;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/hubert/Dropbox/projects/antc-code/hub_version/turing.g:16:7: ( 'return' )
			// /Users/hubert/Dropbox/projects/antc-code/hub_version/turing.g:16:9: 'return'
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
	// $ANTLR end "T__19"

	// $ANTLR start "T__20"
	public final void mT__20() throws RecognitionException {
		try {
			int _type = T__20;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/hubert/Dropbox/projects/antc-code/hub_version/turing.g:17:7: ( 'stop' )
			// /Users/hubert/Dropbox/projects/antc-code/hub_version/turing.g:17:9: 'stop'
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
	// $ANTLR end "T__20"

	// $ANTLR start "T__21"
	public final void mT__21() throws RecognitionException {
		try {
			int _type = T__21;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/hubert/Dropbox/projects/antc-code/hub_version/turing.g:18:7: ( 'typedef' )
			// /Users/hubert/Dropbox/projects/antc-code/hub_version/turing.g:18:9: 'typedef'
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
	// $ANTLR end "T__21"

	// $ANTLR start "T__22"
	public final void mT__22() throws RecognitionException {
		try {
			int _type = T__22;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/hubert/Dropbox/projects/antc-code/hub_version/turing.g:19:7: ( 'un' )
			// /Users/hubert/Dropbox/projects/antc-code/hub_version/turing.g:19:9: 'un'
			{
			match("un"); 

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
			// /Users/hubert/Dropbox/projects/antc-code/hub_version/turing.g:20:7: ( 'while' )
			// /Users/hubert/Dropbox/projects/antc-code/hub_version/turing.g:20:9: 'while'
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
	// $ANTLR end "T__23"

	// $ANTLR start "T__24"
	public final void mT__24() throws RecognitionException {
		try {
			int _type = T__24;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/hubert/Dropbox/projects/antc-code/hub_version/turing.g:21:7: ( 'zero' )
			// /Users/hubert/Dropbox/projects/antc-code/hub_version/turing.g:21:9: 'zero'
			{
			match("zero"); 

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
			// /Users/hubert/Dropbox/projects/antc-code/hub_version/turing.g:22:7: ( '{' )
			// /Users/hubert/Dropbox/projects/antc-code/hub_version/turing.g:22:9: '{'
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
			// /Users/hubert/Dropbox/projects/antc-code/hub_version/turing.g:23:7: ( '}' )
			// /Users/hubert/Dropbox/projects/antc-code/hub_version/turing.g:23:9: '}'
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
			// /Users/hubert/Dropbox/projects/antc-code/hub_version/turing.g:14:5: ( ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' )* )
			// /Users/hubert/Dropbox/projects/antc-code/hub_version/turing.g:14:7: ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' )*
			{
			if ( (input.LA(1) >= 'A' && input.LA(1) <= 'Z')||input.LA(1)=='_'||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			// /Users/hubert/Dropbox/projects/antc-code/hub_version/turing.g:14:31: ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' )*
			loop1:
			while (true) {
				int alt1=2;
				int LA1_0 = input.LA(1);
				if ( ((LA1_0 >= '0' && LA1_0 <= '9')||(LA1_0 >= 'A' && LA1_0 <= 'Z')||LA1_0=='_'||(LA1_0 >= 'a' && LA1_0 <= 'z')) ) {
					alt1=1;
				}

				switch (alt1) {
				case 1 :
					// /Users/hubert/Dropbox/projects/antc-code/hub_version/turing.g:
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
			}

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "ID"

	// $ANTLR start "NUM"
	public final void mNUM() throws RecognitionException {
		try {
			int _type = NUM;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/hubert/Dropbox/projects/antc-code/hub_version/turing.g:17:6: ( ( '0' .. '9' ) ( '0' .. '9' )* )
			// /Users/hubert/Dropbox/projects/antc-code/hub_version/turing.g:17:8: ( '0' .. '9' ) ( '0' .. '9' )*
			{
			if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			// /Users/hubert/Dropbox/projects/antc-code/hub_version/turing.g:17:19: ( '0' .. '9' )*
			loop2:
			while (true) {
				int alt2=2;
				int LA2_0 = input.LA(1);
				if ( ((LA2_0 >= '0' && LA2_0 <= '9')) ) {
					alt2=1;
				}

				switch (alt2) {
				case 1 :
					// /Users/hubert/Dropbox/projects/antc-code/hub_version/turing.g:
					{
					if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
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
			}

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "NUM"

	// $ANTLR start "COMMENT"
	public final void mCOMMENT() throws RecognitionException {
		try {
			int _type = COMMENT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /Users/hubert/Dropbox/projects/antc-code/hub_version/turing.g:21:3: ( '//' (~ ( '\\n' | '\\r' ) )* ( '\\r' )? '\\n' | '/*' ( options {greedy=false; } : . )* '*/' )
			int alt6=2;
			int LA6_0 = input.LA(1);
			if ( (LA6_0=='/') ) {
				int LA6_1 = input.LA(2);
				if ( (LA6_1=='/') ) {
					alt6=1;
				}
				else if ( (LA6_1=='*') ) {
					alt6=2;
				}

				else {
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 6, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 6, 0, input);
				throw nvae;
			}

			switch (alt6) {
				case 1 :
					// /Users/hubert/Dropbox/projects/antc-code/hub_version/turing.g:21:7: '//' (~ ( '\\n' | '\\r' ) )* ( '\\r' )? '\\n'
					{
					match("//"); 

					// /Users/hubert/Dropbox/projects/antc-code/hub_version/turing.g:21:12: (~ ( '\\n' | '\\r' ) )*
					loop3:
					while (true) {
						int alt3=2;
						int LA3_0 = input.LA(1);
						if ( ((LA3_0 >= '\u0000' && LA3_0 <= '\t')||(LA3_0 >= '\u000B' && LA3_0 <= '\f')||(LA3_0 >= '\u000E' && LA3_0 <= '\uFFFF')) ) {
							alt3=1;
						}

						switch (alt3) {
						case 1 :
							// /Users/hubert/Dropbox/projects/antc-code/hub_version/turing.g:
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
							break loop3;
						}
					}

					// /Users/hubert/Dropbox/projects/antc-code/hub_version/turing.g:21:26: ( '\\r' )?
					int alt4=2;
					int LA4_0 = input.LA(1);
					if ( (LA4_0=='\r') ) {
						alt4=1;
					}
					switch (alt4) {
						case 1 :
							// /Users/hubert/Dropbox/projects/antc-code/hub_version/turing.g:21:26: '\\r'
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
					// /Users/hubert/Dropbox/projects/antc-code/hub_version/turing.g:22:7: '/*' ( options {greedy=false; } : . )* '*/'
					{
					match("/*"); 

					// /Users/hubert/Dropbox/projects/antc-code/hub_version/turing.g:22:12: ( options {greedy=false; } : . )*
					loop5:
					while (true) {
						int alt5=2;
						int LA5_0 = input.LA(1);
						if ( (LA5_0=='*') ) {
							int LA5_1 = input.LA(2);
							if ( (LA5_1=='/') ) {
								alt5=2;
							}
							else if ( ((LA5_1 >= '\u0000' && LA5_1 <= '.')||(LA5_1 >= '0' && LA5_1 <= '\uFFFF')) ) {
								alt5=1;
							}

						}
						else if ( ((LA5_0 >= '\u0000' && LA5_0 <= ')')||(LA5_0 >= '+' && LA5_0 <= '\uFFFF')) ) {
							alt5=1;
						}

						switch (alt5) {
						case 1 :
							// /Users/hubert/Dropbox/projects/antc-code/hub_version/turing.g:22:40: .
							{
							matchAny(); 
							}
							break;

						default :
							break loop5;
						}
					}

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
			// /Users/hubert/Dropbox/projects/antc-code/hub_version/turing.g:25:5: ( ( ' ' | '\\t' | '\\r' | '\\n' ) )
			// /Users/hubert/Dropbox/projects/antc-code/hub_version/turing.g:25:9: ( ' ' | '\\t' | '\\r' | '\\n' )
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
			// /Users/hubert/Dropbox/projects/antc-code/hub_version/turing.g:32:5: ( ':=' )
			// /Users/hubert/Dropbox/projects/antc-code/hub_version/turing.g:33:3: ':='
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

	@Override
	public void mTokens() throws RecognitionException {
		// /Users/hubert/Dropbox/projects/antc-code/hub_version/turing.g:1:8: ( T__9 | T__10 | T__11 | T__12 | T__13 | T__14 | T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | ID | NUM | COMMENT | WS | AFF )
		int alt7=23;
		alt7 = dfa7.predict(input);
		switch (alt7) {
			case 1 :
				// /Users/hubert/Dropbox/projects/antc-code/hub_version/turing.g:1:10: T__9
				{
				mT__9(); 

				}
				break;
			case 2 :
				// /Users/hubert/Dropbox/projects/antc-code/hub_version/turing.g:1:15: T__10
				{
				mT__10(); 

				}
				break;
			case 3 :
				// /Users/hubert/Dropbox/projects/antc-code/hub_version/turing.g:1:21: T__11
				{
				mT__11(); 

				}
				break;
			case 4 :
				// /Users/hubert/Dropbox/projects/antc-code/hub_version/turing.g:1:27: T__12
				{
				mT__12(); 

				}
				break;
			case 5 :
				// /Users/hubert/Dropbox/projects/antc-code/hub_version/turing.g:1:33: T__13
				{
				mT__13(); 

				}
				break;
			case 6 :
				// /Users/hubert/Dropbox/projects/antc-code/hub_version/turing.g:1:39: T__14
				{
				mT__14(); 

				}
				break;
			case 7 :
				// /Users/hubert/Dropbox/projects/antc-code/hub_version/turing.g:1:45: T__15
				{
				mT__15(); 

				}
				break;
			case 8 :
				// /Users/hubert/Dropbox/projects/antc-code/hub_version/turing.g:1:51: T__16
				{
				mT__16(); 

				}
				break;
			case 9 :
				// /Users/hubert/Dropbox/projects/antc-code/hub_version/turing.g:1:57: T__17
				{
				mT__17(); 

				}
				break;
			case 10 :
				// /Users/hubert/Dropbox/projects/antc-code/hub_version/turing.g:1:63: T__18
				{
				mT__18(); 

				}
				break;
			case 11 :
				// /Users/hubert/Dropbox/projects/antc-code/hub_version/turing.g:1:69: T__19
				{
				mT__19(); 

				}
				break;
			case 12 :
				// /Users/hubert/Dropbox/projects/antc-code/hub_version/turing.g:1:75: T__20
				{
				mT__20(); 

				}
				break;
			case 13 :
				// /Users/hubert/Dropbox/projects/antc-code/hub_version/turing.g:1:81: T__21
				{
				mT__21(); 

				}
				break;
			case 14 :
				// /Users/hubert/Dropbox/projects/antc-code/hub_version/turing.g:1:87: T__22
				{
				mT__22(); 

				}
				break;
			case 15 :
				// /Users/hubert/Dropbox/projects/antc-code/hub_version/turing.g:1:93: T__23
				{
				mT__23(); 

				}
				break;
			case 16 :
				// /Users/hubert/Dropbox/projects/antc-code/hub_version/turing.g:1:99: T__24
				{
				mT__24(); 

				}
				break;
			case 17 :
				// /Users/hubert/Dropbox/projects/antc-code/hub_version/turing.g:1:105: T__25
				{
				mT__25(); 

				}
				break;
			case 18 :
				// /Users/hubert/Dropbox/projects/antc-code/hub_version/turing.g:1:111: T__26
				{
				mT__26(); 

				}
				break;
			case 19 :
				// /Users/hubert/Dropbox/projects/antc-code/hub_version/turing.g:1:117: ID
				{
				mID(); 

				}
				break;
			case 20 :
				// /Users/hubert/Dropbox/projects/antc-code/hub_version/turing.g:1:120: NUM
				{
				mNUM(); 

				}
				break;
			case 21 :
				// /Users/hubert/Dropbox/projects/antc-code/hub_version/turing.g:1:124: COMMENT
				{
				mCOMMENT(); 

				}
				break;
			case 22 :
				// /Users/hubert/Dropbox/projects/antc-code/hub_version/turing.g:1:132: WS
				{
				mWS(); 

				}
				break;
			case 23 :
				// /Users/hubert/Dropbox/projects/antc-code/hub_version/turing.g:1:135: AFF
				{
				mAFF(); 

				}
				break;

		}
	}


	protected DFA7 dfa7 = new DFA7(this);
	static final String DFA7_eotS =
		"\7\uffff\11\22\7\uffff\1\22\1\42\5\22\1\50\3\22\1\uffff\5\22\1\uffff\2"+
		"\22\1\63\1\22\1\65\1\22\1\67\2\22\1\72\1\uffff\1\73\1\uffff\1\22\1\uffff"+
		"\1\22\1\76\2\uffff\1\77\1\22\2\uffff\1\101\1\uffff";
	static final String DFA7_eofS =
		"\102\uffff";
	static final String DFA7_minS =
		"\1\11\6\uffff\1\145\1\146\1\141\1\145\1\164\1\171\1\156\1\150\1\145\7"+
		"\uffff\1\141\1\60\1\160\1\163\1\164\1\157\1\160\1\60\1\151\1\162\1\144"+
		"\1\uffff\1\165\1\164\1\165\1\160\1\145\1\uffff\1\154\1\157\1\60\1\164"+
		"\1\60\1\162\1\60\1\144\1\145\1\60\1\uffff\1\60\1\uffff\1\156\1\uffff\1"+
		"\145\1\60\2\uffff\1\60\1\146\2\uffff\1\60\1\uffff";
	static final String DFA7_maxS =
		"\1\175\6\uffff\1\145\1\156\1\141\1\145\1\164\1\171\1\156\1\150\1\145\7"+
		"\uffff\1\141\1\172\1\160\1\163\1\164\1\157\1\160\1\172\1\151\1\162\1\144"+
		"\1\uffff\1\165\1\164\1\165\1\160\1\145\1\uffff\1\154\1\157\1\172\1\164"+
		"\1\172\1\162\1\172\1\144\1\145\1\172\1\uffff\1\172\1\uffff\1\156\1\uffff"+
		"\1\145\1\172\2\uffff\1\172\1\146\2\uffff\1\172\1\uffff";
	static final String DFA7_acceptS =
		"\1\uffff\1\1\1\2\1\3\1\4\1\5\1\6\11\uffff\1\21\1\22\1\23\1\24\1\25\1\26"+
		"\1\27\13\uffff\1\10\5\uffff\1\16\12\uffff\1\7\1\uffff\1\12\1\uffff\1\14"+
		"\2\uffff\1\20\1\11\2\uffff\1\17\1\13\1\uffff\1\15";
	static final String DFA7_specialS =
		"\102\uffff}>";
	static final String[] DFA7_transitionS = {
			"\2\25\2\uffff\1\25\22\uffff\1\25\2\uffff\1\1\4\uffff\1\2\1\3\2\uffff"+
			"\1\4\2\uffff\1\24\12\23\1\26\1\5\1\uffff\1\6\3\uffff\32\22\4\uffff\1"+
			"\22\1\uffff\7\22\1\7\1\10\2\22\1\11\5\22\1\12\1\13\1\14\1\15\1\22\1\16"+
			"\2\22\1\17\1\20\1\uffff\1\21",
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
			"\1\37",
			"\1\40",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"\1\41",
			"\12\22\7\uffff\32\22\4\uffff\1\22\1\uffff\32\22",
			"\1\43",
			"\1\44",
			"\1\45",
			"\1\46",
			"\1\47",
			"\12\22\7\uffff\32\22\4\uffff\1\22\1\uffff\32\22",
			"\1\51",
			"\1\52",
			"\1\53",
			"",
			"\1\54",
			"\1\55",
			"\1\56",
			"\1\57",
			"\1\60",
			"",
			"\1\61",
			"\1\62",
			"\12\22\7\uffff\32\22\4\uffff\1\22\1\uffff\32\22",
			"\1\64",
			"\12\22\7\uffff\32\22\4\uffff\1\22\1\uffff\32\22",
			"\1\66",
			"\12\22\7\uffff\32\22\4\uffff\1\22\1\uffff\32\22",
			"\1\70",
			"\1\71",
			"\12\22\7\uffff\32\22\4\uffff\1\22\1\uffff\32\22",
			"",
			"\12\22\7\uffff\32\22\4\uffff\1\22\1\uffff\32\22",
			"",
			"\1\74",
			"",
			"\1\75",
			"\12\22\7\uffff\32\22\4\uffff\1\22\1\uffff\32\22",
			"",
			"",
			"\12\22\7\uffff\32\22\4\uffff\1\22\1\uffff\32\22",
			"\1\100",
			"",
			"",
			"\12\22\7\uffff\32\22\4\uffff\1\22\1\uffff\32\22",
			""
	};

	static final short[] DFA7_eot = DFA.unpackEncodedString(DFA7_eotS);
	static final short[] DFA7_eof = DFA.unpackEncodedString(DFA7_eofS);
	static final char[] DFA7_min = DFA.unpackEncodedStringToUnsignedChars(DFA7_minS);
	static final char[] DFA7_max = DFA.unpackEncodedStringToUnsignedChars(DFA7_maxS);
	static final short[] DFA7_accept = DFA.unpackEncodedString(DFA7_acceptS);
	static final short[] DFA7_special = DFA.unpackEncodedString(DFA7_specialS);
	static final short[][] DFA7_transition;

	static {
		int numStates = DFA7_transitionS.length;
		DFA7_transition = new short[numStates][];
		for (int i=0; i<numStates; i++) {
			DFA7_transition[i] = DFA.unpackEncodedString(DFA7_transitionS[i]);
		}
	}

	protected class DFA7 extends DFA {

		public DFA7(BaseRecognizer recognizer) {
			this.recognizer = recognizer;
			this.decisionNumber = 7;
			this.eot = DFA7_eot;
			this.eof = DFA7_eof;
			this.min = DFA7_min;
			this.max = DFA7_max;
			this.accept = DFA7_accept;
			this.special = DFA7_special;
			this.transition = DFA7_transition;
		}
		@Override
		public String getDescription() {
			return "1:1: Tokens : ( T__9 | T__10 | T__11 | T__12 | T__13 | T__14 | T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | ID | NUM | COMMENT | WS | AFF );";
		}
	}

}
