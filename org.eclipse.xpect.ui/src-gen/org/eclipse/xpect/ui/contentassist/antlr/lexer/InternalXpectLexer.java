package org.eclipse.xpect.ui.contentassist.antlr.lexer;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.Lexer;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalXpectLexer extends Lexer {
    public static final int XPECT=8;
    public static final int True=10;
    public static final int RULE_STRING=19;
    public static final int False=9;
    public static final int RULE_SL_COMMENT=21;
    public static final int EqualsSign=13;
    public static final int XPECT_SETUP=5;
    public static final int END_SETUP=6;
    public static final int RightCurlyBracket=15;
    public static final int EOF=-1;
    public static final int XPECT_IGNORE=4;
    public static final int ExclamationMark=11;
    public static final int FullStop=12;
    public static final int RULE_ID=16;
    public static final int RULE_WS=22;
    public static final int LeftCurlyBracket=14;
    public static final int RULE_ANY_OTHER=23;
    public static final int RULE_INVOCATION=17;
    public static final int FIXME=7;
    public static final int RULE_INT=18;
    public static final int RULE_ML_COMMENT=20;

    // delegates
    // delegators

    public InternalXpectLexer() {;} 
    public InternalXpectLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public InternalXpectLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);

    }
    public String getGrammarFileName() { return "InternalXpectLexer.g"; }

    // $ANTLR start "XPECT_IGNORE"
    public final void mXPECT_IGNORE() throws RecognitionException {
        try {
            int _type = XPECT_IGNORE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalXpectLexer.g:19:14: ( 'XPECT_IGNORE' )
            // InternalXpectLexer.g:19:16: 'XPECT_IGNORE'
            {
            match("XPECT_IGNORE"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "XPECT_IGNORE"

    // $ANTLR start "XPECT_SETUP"
    public final void mXPECT_SETUP() throws RecognitionException {
        try {
            int _type = XPECT_SETUP;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalXpectLexer.g:21:13: ( 'XPECT_SETUP' )
            // InternalXpectLexer.g:21:15: 'XPECT_SETUP'
            {
            match("XPECT_SETUP"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "XPECT_SETUP"

    // $ANTLR start "END_SETUP"
    public final void mEND_SETUP() throws RecognitionException {
        try {
            int _type = END_SETUP;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalXpectLexer.g:23:11: ( 'END_SETUP' )
            // InternalXpectLexer.g:23:13: 'END_SETUP'
            {
            match("END_SETUP"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "END_SETUP"

    // $ANTLR start "FIXME"
    public final void mFIXME() throws RecognitionException {
        try {
            int _type = FIXME;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalXpectLexer.g:25:7: ( 'FIXME' )
            // InternalXpectLexer.g:25:9: 'FIXME'
            {
            match("FIXME"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "FIXME"

    // $ANTLR start "XPECT"
    public final void mXPECT() throws RecognitionException {
        try {
            int _type = XPECT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalXpectLexer.g:27:7: ( 'XPECT' )
            // InternalXpectLexer.g:27:9: 'XPECT'
            {
            match("XPECT"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "XPECT"

    // $ANTLR start "False"
    public final void mFalse() throws RecognitionException {
        try {
            int _type = False;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalXpectLexer.g:29:7: ( 'false' )
            // InternalXpectLexer.g:29:9: 'false'
            {
            match("false"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "False"

    // $ANTLR start "True"
    public final void mTrue() throws RecognitionException {
        try {
            int _type = True;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalXpectLexer.g:31:6: ( 'true' )
            // InternalXpectLexer.g:31:8: 'true'
            {
            match("true"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "True"

    // $ANTLR start "ExclamationMark"
    public final void mExclamationMark() throws RecognitionException {
        try {
            int _type = ExclamationMark;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalXpectLexer.g:33:17: ( '!' )
            // InternalXpectLexer.g:33:19: '!'
            {
            match('!'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "ExclamationMark"

    // $ANTLR start "FullStop"
    public final void mFullStop() throws RecognitionException {
        try {
            int _type = FullStop;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalXpectLexer.g:35:10: ( '.' )
            // InternalXpectLexer.g:35:12: '.'
            {
            match('.'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "FullStop"

    // $ANTLR start "EqualsSign"
    public final void mEqualsSign() throws RecognitionException {
        try {
            int _type = EqualsSign;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalXpectLexer.g:37:12: ( '=' )
            // InternalXpectLexer.g:37:14: '='
            {
            match('='); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "EqualsSign"

    // $ANTLR start "LeftCurlyBracket"
    public final void mLeftCurlyBracket() throws RecognitionException {
        try {
            int _type = LeftCurlyBracket;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalXpectLexer.g:39:18: ( '{' )
            // InternalXpectLexer.g:39:20: '{'
            {
            match('{'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "LeftCurlyBracket"

    // $ANTLR start "RightCurlyBracket"
    public final void mRightCurlyBracket() throws RecognitionException {
        try {
            int _type = RightCurlyBracket;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalXpectLexer.g:41:19: ( '}' )
            // InternalXpectLexer.g:41:21: '}'
            {
            match('}'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RightCurlyBracket"

    // $ANTLR start "RULE_ID"
    public final void mRULE_ID() throws RecognitionException {
        try {
            int _type = RULE_ID;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalXpectLexer.g:45:9: ( ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )* )
            // InternalXpectLexer.g:45:11: ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            {
            // InternalXpectLexer.g:45:11: ( '^' )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0=='^') ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // InternalXpectLexer.g:45:11: '^'
                    {
                    match('^'); 

                    }
                    break;

            }

            if ( (input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            // InternalXpectLexer.g:45:40: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( ((LA2_0>='0' && LA2_0<='9')||(LA2_0>='A' && LA2_0<='Z')||LA2_0=='_'||(LA2_0>='a' && LA2_0<='z')) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalXpectLexer.g:
            	    {
            	    if ( (input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ID"

    // $ANTLR start "RULE_INVOCATION"
    public final void mRULE_INVOCATION() throws RecognitionException {
        try {
            int _type = RULE_INVOCATION;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalXpectLexer.g:47:17: ( ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )* )
            // InternalXpectLexer.g:47:19: ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            {
            // InternalXpectLexer.g:47:19: ( '^' )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0=='^') ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // InternalXpectLexer.g:47:19: '^'
                    {
                    match('^'); 

                    }
                    break;

            }

            if ( (input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            // InternalXpectLexer.g:47:48: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( ((LA4_0>='0' && LA4_0<='9')||(LA4_0>='A' && LA4_0<='Z')||LA4_0=='_'||(LA4_0>='a' && LA4_0<='z')) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalXpectLexer.g:
            	    {
            	    if ( (input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_INVOCATION"

    // $ANTLR start "RULE_INT"
    public final void mRULE_INT() throws RecognitionException {
        try {
            int _type = RULE_INT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalXpectLexer.g:49:10: ( ( '0' .. '9' )+ )
            // InternalXpectLexer.g:49:12: ( '0' .. '9' )+
            {
            // InternalXpectLexer.g:49:12: ( '0' .. '9' )+
            int cnt5=0;
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( ((LA5_0>='0' && LA5_0<='9')) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // InternalXpectLexer.g:49:13: '0' .. '9'
            	    {
            	    matchRange('0','9'); 

            	    }
            	    break;

            	default :
            	    if ( cnt5 >= 1 ) break loop5;
                        EarlyExitException eee =
                            new EarlyExitException(5, input);
                        throw eee;
                }
                cnt5++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_INT"

    // $ANTLR start "RULE_STRING"
    public final void mRULE_STRING() throws RecognitionException {
        try {
            int _type = RULE_STRING;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalXpectLexer.g:51:13: ( ( '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' ) )
            // InternalXpectLexer.g:51:15: ( '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            {
            // InternalXpectLexer.g:51:15: ( '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0=='\"') ) {
                alt8=1;
            }
            else if ( (LA8_0=='\'') ) {
                alt8=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }
            switch (alt8) {
                case 1 :
                    // InternalXpectLexer.g:51:16: '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"'
                    {
                    match('\"'); 
                    // InternalXpectLexer.g:51:20: ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )*
                    loop6:
                    do {
                        int alt6=3;
                        int LA6_0 = input.LA(1);

                        if ( (LA6_0=='\\') ) {
                            alt6=1;
                        }
                        else if ( ((LA6_0>='\u0000' && LA6_0<='!')||(LA6_0>='#' && LA6_0<='[')||(LA6_0>=']' && LA6_0<='\uFFFF')) ) {
                            alt6=2;
                        }


                        switch (alt6) {
                    	case 1 :
                    	    // InternalXpectLexer.g:51:21: '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' )
                    	    {
                    	    match('\\'); 
                    	    if ( input.LA(1)=='\"'||input.LA(1)=='\''||input.LA(1)=='\\'||input.LA(1)=='b'||input.LA(1)=='f'||input.LA(1)=='n'||input.LA(1)=='r'||(input.LA(1)>='t' && input.LA(1)<='u') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;}


                    	    }
                    	    break;
                    	case 2 :
                    	    // InternalXpectLexer.g:51:66: ~ ( ( '\\\\' | '\"' ) )
                    	    {
                    	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='!')||(input.LA(1)>='#' && input.LA(1)<='[')||(input.LA(1)>=']' && input.LA(1)<='\uFFFF') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;}


                    	    }
                    	    break;

                    	default :
                    	    break loop6;
                        }
                    } while (true);

                    match('\"'); 

                    }
                    break;
                case 2 :
                    // InternalXpectLexer.g:51:86: '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\''
                    {
                    match('\''); 
                    // InternalXpectLexer.g:51:91: ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )*
                    loop7:
                    do {
                        int alt7=3;
                        int LA7_0 = input.LA(1);

                        if ( (LA7_0=='\\') ) {
                            alt7=1;
                        }
                        else if ( ((LA7_0>='\u0000' && LA7_0<='&')||(LA7_0>='(' && LA7_0<='[')||(LA7_0>=']' && LA7_0<='\uFFFF')) ) {
                            alt7=2;
                        }


                        switch (alt7) {
                    	case 1 :
                    	    // InternalXpectLexer.g:51:92: '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' )
                    	    {
                    	    match('\\'); 
                    	    if ( input.LA(1)=='\"'||input.LA(1)=='\''||input.LA(1)=='\\'||input.LA(1)=='b'||input.LA(1)=='f'||input.LA(1)=='n'||input.LA(1)=='r'||(input.LA(1)>='t' && input.LA(1)<='u') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;}


                    	    }
                    	    break;
                    	case 2 :
                    	    // InternalXpectLexer.g:51:137: ~ ( ( '\\\\' | '\\'' ) )
                    	    {
                    	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='&')||(input.LA(1)>='(' && input.LA(1)<='[')||(input.LA(1)>=']' && input.LA(1)<='\uFFFF') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;}


                    	    }
                    	    break;

                    	default :
                    	    break loop7;
                        }
                    } while (true);

                    match('\''); 

                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_STRING"

    // $ANTLR start "RULE_ML_COMMENT"
    public final void mRULE_ML_COMMENT() throws RecognitionException {
        try {
            int _type = RULE_ML_COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalXpectLexer.g:53:17: ( '/*' ( options {greedy=false; } : . )* '*/' )
            // InternalXpectLexer.g:53:19: '/*' ( options {greedy=false; } : . )* '*/'
            {
            match("/*"); 

            // InternalXpectLexer.g:53:24: ( options {greedy=false; } : . )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0=='*') ) {
                    int LA9_1 = input.LA(2);

                    if ( (LA9_1=='/') ) {
                        alt9=2;
                    }
                    else if ( ((LA9_1>='\u0000' && LA9_1<='.')||(LA9_1>='0' && LA9_1<='\uFFFF')) ) {
                        alt9=1;
                    }


                }
                else if ( ((LA9_0>='\u0000' && LA9_0<=')')||(LA9_0>='+' && LA9_0<='\uFFFF')) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // InternalXpectLexer.g:53:52: .
            	    {
            	    matchAny(); 

            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);

            match("*/"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ML_COMMENT"

    // $ANTLR start "RULE_SL_COMMENT"
    public final void mRULE_SL_COMMENT() throws RecognitionException {
        try {
            int _type = RULE_SL_COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalXpectLexer.g:55:17: ( '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )? )
            // InternalXpectLexer.g:55:19: '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )?
            {
            match("//"); 

            // InternalXpectLexer.g:55:24: (~ ( ( '\\n' | '\\r' ) ) )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( ((LA10_0>='\u0000' && LA10_0<='\t')||(LA10_0>='\u000B' && LA10_0<='\f')||(LA10_0>='\u000E' && LA10_0<='\uFFFF')) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // InternalXpectLexer.g:55:24: ~ ( ( '\\n' | '\\r' ) )
            	    {
            	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='\t')||(input.LA(1)>='\u000B' && input.LA(1)<='\f')||(input.LA(1)>='\u000E' && input.LA(1)<='\uFFFF') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);

            // InternalXpectLexer.g:55:40: ( ( '\\r' )? '\\n' )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0=='\n'||LA12_0=='\r') ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // InternalXpectLexer.g:55:41: ( '\\r' )? '\\n'
                    {
                    // InternalXpectLexer.g:55:41: ( '\\r' )?
                    int alt11=2;
                    int LA11_0 = input.LA(1);

                    if ( (LA11_0=='\r') ) {
                        alt11=1;
                    }
                    switch (alt11) {
                        case 1 :
                            // InternalXpectLexer.g:55:41: '\\r'
                            {
                            match('\r'); 

                            }
                            break;

                    }

                    match('\n'); 

                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_SL_COMMENT"

    // $ANTLR start "RULE_WS"
    public final void mRULE_WS() throws RecognitionException {
        try {
            int _type = RULE_WS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalXpectLexer.g:57:9: ( ( ' ' | '\\t' | '\\r' | '\\n' )+ )
            // InternalXpectLexer.g:57:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            {
            // InternalXpectLexer.g:57:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            int cnt13=0;
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( ((LA13_0>='\t' && LA13_0<='\n')||LA13_0=='\r'||LA13_0==' ') ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // InternalXpectLexer.g:
            	    {
            	    if ( (input.LA(1)>='\t' && input.LA(1)<='\n')||input.LA(1)=='\r'||input.LA(1)==' ' ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    if ( cnt13 >= 1 ) break loop13;
                        EarlyExitException eee =
                            new EarlyExitException(13, input);
                        throw eee;
                }
                cnt13++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_WS"

    // $ANTLR start "RULE_ANY_OTHER"
    public final void mRULE_ANY_OTHER() throws RecognitionException {
        try {
            int _type = RULE_ANY_OTHER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalXpectLexer.g:59:16: ( . )
            // InternalXpectLexer.g:59:18: .
            {
            matchAny(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ANY_OTHER"

    public void mTokens() throws RecognitionException {
        // InternalXpectLexer.g:1:8: ( XPECT_IGNORE | XPECT_SETUP | END_SETUP | FIXME | XPECT | False | True | ExclamationMark | FullStop | EqualsSign | LeftCurlyBracket | RightCurlyBracket | RULE_ID | RULE_INVOCATION | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER )
        int alt14=20;
        alt14 = dfa14.predict(input);
        switch (alt14) {
            case 1 :
                // InternalXpectLexer.g:1:10: XPECT_IGNORE
                {
                mXPECT_IGNORE(); 

                }
                break;
            case 2 :
                // InternalXpectLexer.g:1:23: XPECT_SETUP
                {
                mXPECT_SETUP(); 

                }
                break;
            case 3 :
                // InternalXpectLexer.g:1:35: END_SETUP
                {
                mEND_SETUP(); 

                }
                break;
            case 4 :
                // InternalXpectLexer.g:1:45: FIXME
                {
                mFIXME(); 

                }
                break;
            case 5 :
                // InternalXpectLexer.g:1:51: XPECT
                {
                mXPECT(); 

                }
                break;
            case 6 :
                // InternalXpectLexer.g:1:57: False
                {
                mFalse(); 

                }
                break;
            case 7 :
                // InternalXpectLexer.g:1:63: True
                {
                mTrue(); 

                }
                break;
            case 8 :
                // InternalXpectLexer.g:1:68: ExclamationMark
                {
                mExclamationMark(); 

                }
                break;
            case 9 :
                // InternalXpectLexer.g:1:84: FullStop
                {
                mFullStop(); 

                }
                break;
            case 10 :
                // InternalXpectLexer.g:1:93: EqualsSign
                {
                mEqualsSign(); 

                }
                break;
            case 11 :
                // InternalXpectLexer.g:1:104: LeftCurlyBracket
                {
                mLeftCurlyBracket(); 

                }
                break;
            case 12 :
                // InternalXpectLexer.g:1:121: RightCurlyBracket
                {
                mRightCurlyBracket(); 

                }
                break;
            case 13 :
                // InternalXpectLexer.g:1:139: RULE_ID
                {
                mRULE_ID(); 

                }
                break;
            case 14 :
                // InternalXpectLexer.g:1:147: RULE_INVOCATION
                {
                mRULE_INVOCATION(); 

                }
                break;
            case 15 :
                // InternalXpectLexer.g:1:163: RULE_INT
                {
                mRULE_INT(); 

                }
                break;
            case 16 :
                // InternalXpectLexer.g:1:172: RULE_STRING
                {
                mRULE_STRING(); 

                }
                break;
            case 17 :
                // InternalXpectLexer.g:1:184: RULE_ML_COMMENT
                {
                mRULE_ML_COMMENT(); 

                }
                break;
            case 18 :
                // InternalXpectLexer.g:1:200: RULE_SL_COMMENT
                {
                mRULE_SL_COMMENT(); 

                }
                break;
            case 19 :
                // InternalXpectLexer.g:1:216: RULE_WS
                {
                mRULE_WS(); 

                }
                break;
            case 20 :
                // InternalXpectLexer.g:1:224: RULE_ANY_OTHER
                {
                mRULE_ANY_OTHER(); 

                }
                break;

        }

    }


    protected DFA14 dfa14 = new DFA14(this);
    static final String DFA14_eotS =
        "\1\uffff\5\24\5\uffff\1\22\1\24\1\uffff\3\22\2\uffff\1\24\1\uffff\5\24\5\uffff\1\24\5\uffff\11\24\1\63\1\65\1\24\1\67\1\70\1\uffff\1\24\1\uffff\1\24\2\uffff\10\24\1\104\2\24\1\uffff\1\24\1\110\1\111\2\uffff";
    static final String DFA14_eofS =
        "\112\uffff";
    static final String DFA14_minS =
        "\1\0\5\60\5\uffff\1\101\1\60\1\uffff\2\0\1\52\2\uffff\1\60\1\uffff\5\60\5\uffff\1\60\5\uffff\16\60\1\uffff\1\60\1\uffff\1\60\2\uffff\13\60\1\uffff\3\60\2\uffff";
    static final String DFA14_maxS =
        "\1\uffff\5\172\5\uffff\2\172\1\uffff\2\uffff\1\57\2\uffff\1\172\1\uffff\5\172\5\uffff\1\172\5\uffff\16\172\1\uffff\1\172\1\uffff\1\172\2\uffff\13\172\1\uffff\3\172\2\uffff";
    static final String DFA14_acceptS =
        "\6\uffff\1\10\1\11\1\12\1\13\1\14\2\uffff\1\17\3\uffff\1\23\1\24\1\uffff\1\15\5\uffff\1\10\1\11\1\12\1\13\1\14\1\uffff\1\17\1\20\1\21\1\22\1\23\16\uffff\1\7\1\uffff\1\5\1\uffff\1\4\1\6\13\uffff\1\3\3\uffff\1\2\1\1";
    static final String DFA14_specialS =
        "\1\2\15\uffff\1\0\1\1\72\uffff}>";
    static final String[] DFA14_transitionS = {
            "\11\22\2\21\2\22\1\21\22\22\1\21\1\6\1\16\4\22\1\17\6\22\1\7\1\20\12\15\3\22\1\10\3\22\4\14\1\2\1\3\21\14\1\1\2\14\3\22\1\13\1\14\1\22\5\14\1\4\15\14\1\5\6\14\1\11\1\22\1\12\uff82\22",
            "\12\25\7\uffff\17\25\1\23\12\25\4\uffff\1\25\1\uffff\32\25",
            "\12\25\7\uffff\15\25\1\26\14\25\4\uffff\1\25\1\uffff\32\25",
            "\12\25\7\uffff\10\25\1\27\21\25\4\uffff\1\25\1\uffff\32\25",
            "\12\25\7\uffff\32\25\4\uffff\1\25\1\uffff\1\30\31\25",
            "\12\25\7\uffff\32\25\4\uffff\1\25\1\uffff\21\25\1\31\10\25",
            "",
            "",
            "",
            "",
            "",
            "\32\37\4\uffff\1\37\1\uffff\32\37",
            "\12\25\7\uffff\32\25\4\uffff\1\25\1\uffff\32\25",
            "",
            "\0\41",
            "\0\41",
            "\1\42\4\uffff\1\43",
            "",
            "",
            "\12\25\7\uffff\4\25\1\45\25\25\4\uffff\1\25\1\uffff\32\25",
            "",
            "\12\25\7\uffff\32\25\4\uffff\1\25\1\uffff\32\25",
            "\12\25\7\uffff\3\25\1\46\26\25\4\uffff\1\25\1\uffff\32\25",
            "\12\25\7\uffff\27\25\1\47\2\25\4\uffff\1\25\1\uffff\32\25",
            "\12\25\7\uffff\32\25\4\uffff\1\25\1\uffff\13\25\1\50\16\25",
            "\12\25\7\uffff\32\25\4\uffff\1\25\1\uffff\24\25\1\51\5\25",
            "",
            "",
            "",
            "",
            "",
            "\12\25\7\uffff\32\25\4\uffff\1\25\1\uffff\32\25",
            "",
            "",
            "",
            "",
            "",
            "\12\25\7\uffff\2\25\1\52\27\25\4\uffff\1\25\1\uffff\32\25",
            "\12\25\7\uffff\32\25\4\uffff\1\53\1\uffff\32\25",
            "\12\25\7\uffff\14\25\1\54\15\25\4\uffff\1\25\1\uffff\32\25",
            "\12\25\7\uffff\32\25\4\uffff\1\25\1\uffff\22\25\1\55\7\25",
            "\12\25\7\uffff\32\25\4\uffff\1\25\1\uffff\4\25\1\56\25\25",
            "\12\25\7\uffff\23\25\1\57\6\25\4\uffff\1\25\1\uffff\32\25",
            "\12\25\7\uffff\22\25\1\60\7\25\4\uffff\1\25\1\uffff\32\25",
            "\12\25\7\uffff\4\25\1\61\25\25\4\uffff\1\25\1\uffff\32\25",
            "\12\25\7\uffff\32\25\4\uffff\1\25\1\uffff\4\25\1\62\25\25",
            "\12\25\7\uffff\32\25\4\uffff\1\25\1\uffff\32\25",
            "\12\25\7\uffff\32\25\4\uffff\1\64\1\uffff\32\25",
            "\12\25\7\uffff\4\25\1\66\25\25\4\uffff\1\25\1\uffff\32\25",
            "\12\25\7\uffff\32\25\4\uffff\1\25\1\uffff\32\25",
            "\12\25\7\uffff\32\25\4\uffff\1\25\1\uffff\32\25",
            "",
            "\12\25\7\uffff\10\25\1\71\11\25\1\72\7\25\4\uffff\1\25\1\uffff\32\25",
            "",
            "\12\25\7\uffff\23\25\1\73\6\25\4\uffff\1\25\1\uffff\32\25",
            "",
            "",
            "\12\25\7\uffff\6\25\1\74\23\25\4\uffff\1\25\1\uffff\32\25",
            "\12\25\7\uffff\4\25\1\75\25\25\4\uffff\1\25\1\uffff\32\25",
            "\12\25\7\uffff\24\25\1\76\5\25\4\uffff\1\25\1\uffff\32\25",
            "\12\25\7\uffff\15\25\1\77\14\25\4\uffff\1\25\1\uffff\32\25",
            "\12\25\7\uffff\23\25\1\100\6\25\4\uffff\1\25\1\uffff\32\25",
            "\12\25\7\uffff\17\25\1\101\12\25\4\uffff\1\25\1\uffff\32\25",
            "\12\25\7\uffff\16\25\1\102\13\25\4\uffff\1\25\1\uffff\32\25",
            "\12\25\7\uffff\24\25\1\103\5\25\4\uffff\1\25\1\uffff\32\25",
            "\12\25\7\uffff\32\25\4\uffff\1\25\1\uffff\32\25",
            "\12\25\7\uffff\21\25\1\105\10\25\4\uffff\1\25\1\uffff\32\25",
            "\12\25\7\uffff\17\25\1\106\12\25\4\uffff\1\25\1\uffff\32\25",
            "",
            "\12\25\7\uffff\4\25\1\107\25\25\4\uffff\1\25\1\uffff\32\25",
            "\12\25\7\uffff\32\25\4\uffff\1\25\1\uffff\32\25",
            "\12\25\7\uffff\32\25\4\uffff\1\25\1\uffff\32\25",
            "",
            ""
    };

    static final short[] DFA14_eot = DFA.unpackEncodedString(DFA14_eotS);
    static final short[] DFA14_eof = DFA.unpackEncodedString(DFA14_eofS);
    static final char[] DFA14_min = DFA.unpackEncodedStringToUnsignedChars(DFA14_minS);
    static final char[] DFA14_max = DFA.unpackEncodedStringToUnsignedChars(DFA14_maxS);
    static final short[] DFA14_accept = DFA.unpackEncodedString(DFA14_acceptS);
    static final short[] DFA14_special = DFA.unpackEncodedString(DFA14_specialS);
    static final short[][] DFA14_transition;

    static {
        int numStates = DFA14_transitionS.length;
        DFA14_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA14_transition[i] = DFA.unpackEncodedString(DFA14_transitionS[i]);
        }
    }

    class DFA14 extends DFA {

        public DFA14(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 14;
            this.eot = DFA14_eot;
            this.eof = DFA14_eof;
            this.min = DFA14_min;
            this.max = DFA14_max;
            this.accept = DFA14_accept;
            this.special = DFA14_special;
            this.transition = DFA14_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( XPECT_IGNORE | XPECT_SETUP | END_SETUP | FIXME | XPECT | False | True | ExclamationMark | FullStop | EqualsSign | LeftCurlyBracket | RightCurlyBracket | RULE_ID | RULE_INVOCATION | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            IntStream input = _input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA14_14 = input.LA(1);

                        s = -1;
                        if ( ((LA14_14>='\u0000' && LA14_14<='\uFFFF')) ) {s = 33;}

                        else s = 18;

                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA14_15 = input.LA(1);

                        s = -1;
                        if ( ((LA14_15>='\u0000' && LA14_15<='\uFFFF')) ) {s = 33;}

                        else s = 18;

                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA14_0 = input.LA(1);

                        s = -1;
                        if ( (LA14_0=='X') ) {s = 1;}

                        else if ( (LA14_0=='E') ) {s = 2;}

                        else if ( (LA14_0=='F') ) {s = 3;}

                        else if ( (LA14_0=='f') ) {s = 4;}

                        else if ( (LA14_0=='t') ) {s = 5;}

                        else if ( (LA14_0=='!') ) {s = 6;}

                        else if ( (LA14_0=='.') ) {s = 7;}

                        else if ( (LA14_0=='=') ) {s = 8;}

                        else if ( (LA14_0=='{') ) {s = 9;}

                        else if ( (LA14_0=='}') ) {s = 10;}

                        else if ( (LA14_0=='^') ) {s = 11;}

                        else if ( ((LA14_0>='A' && LA14_0<='D')||(LA14_0>='G' && LA14_0<='W')||(LA14_0>='Y' && LA14_0<='Z')||LA14_0=='_'||(LA14_0>='a' && LA14_0<='e')||(LA14_0>='g' && LA14_0<='s')||(LA14_0>='u' && LA14_0<='z')) ) {s = 12;}

                        else if ( ((LA14_0>='0' && LA14_0<='9')) ) {s = 13;}

                        else if ( (LA14_0=='\"') ) {s = 14;}

                        else if ( (LA14_0=='\'') ) {s = 15;}

                        else if ( (LA14_0=='/') ) {s = 16;}

                        else if ( ((LA14_0>='\t' && LA14_0<='\n')||LA14_0=='\r'||LA14_0==' ') ) {s = 17;}

                        else if ( ((LA14_0>='\u0000' && LA14_0<='\b')||(LA14_0>='\u000B' && LA14_0<='\f')||(LA14_0>='\u000E' && LA14_0<='\u001F')||(LA14_0>='#' && LA14_0<='&')||(LA14_0>='(' && LA14_0<='-')||(LA14_0>=':' && LA14_0<='<')||(LA14_0>='>' && LA14_0<='@')||(LA14_0>='[' && LA14_0<=']')||LA14_0=='`'||LA14_0=='|'||(LA14_0>='~' && LA14_0<='\uFFFF')) ) {s = 18;}

                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 14, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

}