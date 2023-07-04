package org.eclipse.xpect.lexer;

// Use our own Lexer superclass by means of import.
import org.eclipse.xpect.services.Lexer;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class XpectRT extends Lexer {
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

    	// state XpectFile = 4
    	// state Lexicalspace_Setup = 1
    	// state Lexicalspace_Invocation = 2
    	private int tokenstate = 4;


    // delegates
    // delegators

    public XpectRT() {;} 
    public XpectRT(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public XpectRT(CharStream input, RecognizerSharedState state) {
        super(input,state);

    }
    public String getGrammarFileName() { return "../org.eclipse.xpect/src-gen/org/eclipse/xpect/lexer/XpectRT.g"; }

    // $ANTLR start "XPECT_IGNORE"
    public final void mXPECT_IGNORE() throws RecognitionException {
        try {
            int _type = XPECT_IGNORE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.eclipse.xpect/src-gen/org/eclipse/xpect/lexer/XpectRT.g:21:13: ({...}? => 'XPECT_IGNORE' )
            // ../org.eclipse.xpect/src-gen/org/eclipse/xpect/lexer/XpectRT.g:21:15: {...}? => 'XPECT_IGNORE'
            {
            if ( !(((tokenstate & 4) != 0 && matches("XPECT_IGNORE"))) ) {
                throw new FailedPredicateException(input, "XPECT_IGNORE", "(tokenstate & 4) != 0 && matches(\"XPECT_IGNORE\")");
            }
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
            // ../org.eclipse.xpect/src-gen/org/eclipse/xpect/lexer/XpectRT.g:22:12: ({...}? => 'XPECT_SETUP' )
            // ../org.eclipse.xpect/src-gen/org/eclipse/xpect/lexer/XpectRT.g:22:14: {...}? => 'XPECT_SETUP'
            {
            if ( !(((tokenstate & 4) != 0 && matches("XPECT_SETUP"))) ) {
                throw new FailedPredicateException(input, "XPECT_SETUP", "(tokenstate & 4) != 0 && matches(\"XPECT_SETUP\")");
            }
            match("XPECT_SETUP"); 

            tokenstate=1;

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "XPECT_SETUP"

    // $ANTLR start "XPECT"
    public final void mXPECT() throws RecognitionException {
        try {
            int _type = XPECT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.eclipse.xpect/src-gen/org/eclipse/xpect/lexer/XpectRT.g:23:6: ({...}? => 'XPECT' )
            // ../org.eclipse.xpect/src-gen/org/eclipse/xpect/lexer/XpectRT.g:23:8: {...}? => 'XPECT'
            {
            if ( !(((tokenstate & 4) != 0 && matches("XPECT"))) ) {
                throw new FailedPredicateException(input, "XPECT", "(tokenstate & 4) != 0 && matches(\"XPECT\")");
            }
            match("XPECT"); 

            tokenstate=2;

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "XPECT"

    // $ANTLR start "EqualsSign"
    public final void mEqualsSign() throws RecognitionException {
        try {
            int _type = EqualsSign;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.eclipse.xpect/src-gen/org/eclipse/xpect/lexer/XpectRT.g:24:11: ({...}? => '=' )
            // ../org.eclipse.xpect/src-gen/org/eclipse/xpect/lexer/XpectRT.g:24:13: {...}? => '='
            {
            if ( !(((tokenstate & 1) != 0 && matches("="))) ) {
                throw new FailedPredicateException(input, "EqualsSign", "(tokenstate & 1) != 0 && matches(\"=\")");
            }
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
            // ../org.eclipse.xpect/src-gen/org/eclipse/xpect/lexer/XpectRT.g:25:17: ({...}? => '{' )
            // ../org.eclipse.xpect/src-gen/org/eclipse/xpect/lexer/XpectRT.g:25:19: {...}? => '{'
            {
            if ( !(((tokenstate & 1) != 0 && matches("{"))) ) {
                throw new FailedPredicateException(input, "LeftCurlyBracket", "(tokenstate & 1) != 0 && matches(\"{\")");
            }
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
            // ../org.eclipse.xpect/src-gen/org/eclipse/xpect/lexer/XpectRT.g:26:18: ({...}? => '}' )
            // ../org.eclipse.xpect/src-gen/org/eclipse/xpect/lexer/XpectRT.g:26:20: {...}? => '}'
            {
            if ( !(((tokenstate & 1) != 0 && matches("}"))) ) {
                throw new FailedPredicateException(input, "RightCurlyBracket", "(tokenstate & 1) != 0 && matches(\"}\")");
            }
            match('}'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RightCurlyBracket"

    // $ANTLR start "True"
    public final void mTrue() throws RecognitionException {
        try {
            int _type = True;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.eclipse.xpect/src-gen/org/eclipse/xpect/lexer/XpectRT.g:27:5: ({...}? => 'true' )
            // ../org.eclipse.xpect/src-gen/org/eclipse/xpect/lexer/XpectRT.g:27:7: {...}? => 'true'
            {
            if ( !(((tokenstate & 1) != 0 && matches("true"))) ) {
                throw new FailedPredicateException(input, "True", "(tokenstate & 1) != 0 && matches(\"true\")");
            }
            match("true"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "True"

    // $ANTLR start "False"
    public final void mFalse() throws RecognitionException {
        try {
            int _type = False;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.eclipse.xpect/src-gen/org/eclipse/xpect/lexer/XpectRT.g:28:6: ({...}? => 'false' )
            // ../org.eclipse.xpect/src-gen/org/eclipse/xpect/lexer/XpectRT.g:28:8: {...}? => 'false'
            {
            if ( !(((tokenstate & 1) != 0 && matches("false"))) ) {
                throw new FailedPredicateException(input, "False", "(tokenstate & 1) != 0 && matches(\"false\")");
            }
            match("false"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "False"

    // $ANTLR start "FullStop"
    public final void mFullStop() throws RecognitionException {
        try {
            int _type = FullStop;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.eclipse.xpect/src-gen/org/eclipse/xpect/lexer/XpectRT.g:29:9: ({...}? => '.' )
            // ../org.eclipse.xpect/src-gen/org/eclipse/xpect/lexer/XpectRT.g:29:11: {...}? => '.'
            {
            if ( !(((tokenstate & 1) != 0 && matches("."))) ) {
                throw new FailedPredicateException(input, "FullStop", "(tokenstate & 1) != 0 && matches(\".\")");
            }
            match('.'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "FullStop"

    // $ANTLR start "END_SETUP"
    public final void mEND_SETUP() throws RecognitionException {
        try {
            int _type = END_SETUP;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.eclipse.xpect/src-gen/org/eclipse/xpect/lexer/XpectRT.g:30:10: ({...}? => 'END_SETUP' )
            // ../org.eclipse.xpect/src-gen/org/eclipse/xpect/lexer/XpectRT.g:30:12: {...}? => 'END_SETUP'
            {
            if ( !(((tokenstate & 1) != 0 && matches("END_SETUP"))) ) {
                throw new FailedPredicateException(input, "END_SETUP", "(tokenstate & 1) != 0 && matches(\"END_SETUP\")");
            }
            match("END_SETUP"); 

            tokenstate=4;

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "END_SETUP"

    // $ANTLR start "ExclamationMark"
    public final void mExclamationMark() throws RecognitionException {
        try {
            int _type = ExclamationMark;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.eclipse.xpect/src-gen/org/eclipse/xpect/lexer/XpectRT.g:31:16: ({...}? => '!' )
            // ../org.eclipse.xpect/src-gen/org/eclipse/xpect/lexer/XpectRT.g:31:18: {...}? => '!'
            {
            if ( !(((tokenstate & 2) != 0 && matches("!"))) ) {
                throw new FailedPredicateException(input, "ExclamationMark", "(tokenstate & 2) != 0 && matches(\"!\")");
            }
            match('!'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "ExclamationMark"

    // $ANTLR start "FIXME"
    public final void mFIXME() throws RecognitionException {
        try {
            int _type = FIXME;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.eclipse.xpect/src-gen/org/eclipse/xpect/lexer/XpectRT.g:32:6: ({...}? => 'FIXME' )
            // ../org.eclipse.xpect/src-gen/org/eclipse/xpect/lexer/XpectRT.g:32:8: {...}? => 'FIXME'
            {
            if ( !(((tokenstate & 2) != 0 && matches("FIXME"))) ) {
                throw new FailedPredicateException(input, "FIXME", "(tokenstate & 2) != 0 && matches(\"FIXME\")");
            }
            match("FIXME"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "FIXME"

    // $ANTLR start "RULE_ID"
    public final void mRULE_ID() throws RecognitionException {
        try {
            int _type = RULE_ID;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../org.eclipse.xpect/src-gen/org/eclipse/xpect/lexer/XpectRT.g:33:8: ({...}? => ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )* )
            // ../org.eclipse.xpect/src-gen/org/eclipse/xpect/lexer/XpectRT.g:33:10: {...}? => ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            {
            if ( !(((tokenstate & 1) != 0)) ) {
                throw new FailedPredicateException(input, "RULE_ID", "(tokenstate & 1) != 0");
            }
            // ../org.eclipse.xpect/src-gen/org/eclipse/xpect/lexer/XpectRT.g:33:37: ( '^' )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0=='^') ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // ../org.eclipse.xpect/src-gen/org/eclipse/xpect/lexer/XpectRT.g:33:37: '^'
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

            // ../org.eclipse.xpect/src-gen/org/eclipse/xpect/lexer/XpectRT.g:33:66: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( ((LA2_0>='0' && LA2_0<='9')||(LA2_0>='A' && LA2_0<='Z')||LA2_0=='_'||(LA2_0>='a' && LA2_0<='z')) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // ../org.eclipse.xpect/src-gen/org/eclipse/xpect/lexer/XpectRT.g:
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
            // ../org.eclipse.xpect/src-gen/org/eclipse/xpect/lexer/XpectRT.g:34:16: ({...}? => ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )* )
            // ../org.eclipse.xpect/src-gen/org/eclipse/xpect/lexer/XpectRT.g:34:18: {...}? => ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            {
            if ( !(((tokenstate & 2) != 0)) ) {
                throw new FailedPredicateException(input, "RULE_INVOCATION", "(tokenstate & 2) != 0");
            }
            // ../org.eclipse.xpect/src-gen/org/eclipse/xpect/lexer/XpectRT.g:34:45: ( '^' )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0=='^') ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // ../org.eclipse.xpect/src-gen/org/eclipse/xpect/lexer/XpectRT.g:34:45: '^'
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

            // ../org.eclipse.xpect/src-gen/org/eclipse/xpect/lexer/XpectRT.g:34:74: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( ((LA4_0>='0' && LA4_0<='9')||(LA4_0>='A' && LA4_0<='Z')||LA4_0=='_'||(LA4_0>='a' && LA4_0<='z')) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // ../org.eclipse.xpect/src-gen/org/eclipse/xpect/lexer/XpectRT.g:
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

            tokenstate=4;

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
            // ../org.eclipse.xpect/src-gen/org/eclipse/xpect/lexer/XpectRT.g:35:9: ({...}? => ( '0' .. '9' )+ )
            // ../org.eclipse.xpect/src-gen/org/eclipse/xpect/lexer/XpectRT.g:35:11: {...}? => ( '0' .. '9' )+
            {
            if ( !(((tokenstate & 1) != 0)) ) {
                throw new FailedPredicateException(input, "RULE_INT", "(tokenstate & 1) != 0");
            }
            // ../org.eclipse.xpect/src-gen/org/eclipse/xpect/lexer/XpectRT.g:35:38: ( '0' .. '9' )+
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
            	    // ../org.eclipse.xpect/src-gen/org/eclipse/xpect/lexer/XpectRT.g:35:39: '0' .. '9'
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
            // ../org.eclipse.xpect/src-gen/org/eclipse/xpect/lexer/XpectRT.g:36:12: ({...}? => ( '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' ) )
            // ../org.eclipse.xpect/src-gen/org/eclipse/xpect/lexer/XpectRT.g:36:14: {...}? => ( '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            {
            if ( !(((tokenstate & 1) != 0)) ) {
                throw new FailedPredicateException(input, "RULE_STRING", "(tokenstate & 1) != 0");
            }
            // ../org.eclipse.xpect/src-gen/org/eclipse/xpect/lexer/XpectRT.g:36:41: ( '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
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
                    // ../org.eclipse.xpect/src-gen/org/eclipse/xpect/lexer/XpectRT.g:36:42: '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"'
                    {
                    match('\"'); 
                    // ../org.eclipse.xpect/src-gen/org/eclipse/xpect/lexer/XpectRT.g:36:46: ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )*
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
                    	    // ../org.eclipse.xpect/src-gen/org/eclipse/xpect/lexer/XpectRT.g:36:47: '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' )
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
                    	    // ../org.eclipse.xpect/src-gen/org/eclipse/xpect/lexer/XpectRT.g:36:92: ~ ( ( '\\\\' | '\"' ) )
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
                    // ../org.eclipse.xpect/src-gen/org/eclipse/xpect/lexer/XpectRT.g:36:112: '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\''
                    {
                    match('\''); 
                    // ../org.eclipse.xpect/src-gen/org/eclipse/xpect/lexer/XpectRT.g:36:117: ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )*
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
                    	    // ../org.eclipse.xpect/src-gen/org/eclipse/xpect/lexer/XpectRT.g:36:118: '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' )
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
                    	    // ../org.eclipse.xpect/src-gen/org/eclipse/xpect/lexer/XpectRT.g:36:163: ~ ( ( '\\\\' | '\\'' ) )
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
            // ../org.eclipse.xpect/src-gen/org/eclipse/xpect/lexer/XpectRT.g:37:16: ({...}? => '/*' ( options {greedy=false; } : . )* '*/' )
            // ../org.eclipse.xpect/src-gen/org/eclipse/xpect/lexer/XpectRT.g:37:18: {...}? => '/*' ( options {greedy=false; } : . )* '*/'
            {
            if ( !(((tokenstate & 3) != 0)) ) {
                throw new FailedPredicateException(input, "RULE_ML_COMMENT", "(tokenstate & 3) != 0");
            }
            match("/*"); 

            // ../org.eclipse.xpect/src-gen/org/eclipse/xpect/lexer/XpectRT.g:37:50: ( options {greedy=false; } : . )*
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
            	    // ../org.eclipse.xpect/src-gen/org/eclipse/xpect/lexer/XpectRT.g:37:78: .
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
            // ../org.eclipse.xpect/src-gen/org/eclipse/xpect/lexer/XpectRT.g:38:16: ({...}? => '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )? )
            // ../org.eclipse.xpect/src-gen/org/eclipse/xpect/lexer/XpectRT.g:38:18: {...}? => '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )?
            {
            if ( !(((tokenstate & 3) != 0)) ) {
                throw new FailedPredicateException(input, "RULE_SL_COMMENT", "(tokenstate & 3) != 0");
            }
            match("//"); 

            // ../org.eclipse.xpect/src-gen/org/eclipse/xpect/lexer/XpectRT.g:38:50: (~ ( ( '\\n' | '\\r' ) ) )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( ((LA10_0>='\u0000' && LA10_0<='\t')||(LA10_0>='\u000B' && LA10_0<='\f')||(LA10_0>='\u000E' && LA10_0<='\uFFFF')) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // ../org.eclipse.xpect/src-gen/org/eclipse/xpect/lexer/XpectRT.g:38:50: ~ ( ( '\\n' | '\\r' ) )
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

            // ../org.eclipse.xpect/src-gen/org/eclipse/xpect/lexer/XpectRT.g:38:66: ( ( '\\r' )? '\\n' )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0=='\n'||LA12_0=='\r') ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // ../org.eclipse.xpect/src-gen/org/eclipse/xpect/lexer/XpectRT.g:38:67: ( '\\r' )? '\\n'
                    {
                    // ../org.eclipse.xpect/src-gen/org/eclipse/xpect/lexer/XpectRT.g:38:67: ( '\\r' )?
                    int alt11=2;
                    int LA11_0 = input.LA(1);

                    if ( (LA11_0=='\r') ) {
                        alt11=1;
                    }
                    switch (alt11) {
                        case 1 :
                            // ../org.eclipse.xpect/src-gen/org/eclipse/xpect/lexer/XpectRT.g:38:67: '\\r'
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
            // ../org.eclipse.xpect/src-gen/org/eclipse/xpect/lexer/XpectRT.g:39:8: ({...}? => ( ' ' | '\\t' | '\\r' | '\\n' )+ )
            // ../org.eclipse.xpect/src-gen/org/eclipse/xpect/lexer/XpectRT.g:39:10: {...}? => ( ' ' | '\\t' | '\\r' | '\\n' )+
            {
            if ( !(((tokenstate & 3) != 0)) ) {
                throw new FailedPredicateException(input, "RULE_WS", "(tokenstate & 3) != 0");
            }
            // ../org.eclipse.xpect/src-gen/org/eclipse/xpect/lexer/XpectRT.g:39:37: ( ' ' | '\\t' | '\\r' | '\\n' )+
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
            	    // ../org.eclipse.xpect/src-gen/org/eclipse/xpect/lexer/XpectRT.g:
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
            // ../org.eclipse.xpect/src-gen/org/eclipse/xpect/lexer/XpectRT.g:40:15: ( . )
            // ../org.eclipse.xpect/src-gen/org/eclipse/xpect/lexer/XpectRT.g:40:18: .
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
        // ../org.eclipse.xpect/src-gen/org/eclipse/xpect/lexer/XpectRT.g:1:8: ( XPECT_IGNORE | XPECT_SETUP | XPECT | EqualsSign | LeftCurlyBracket | RightCurlyBracket | True | False | FullStop | END_SETUP | ExclamationMark | FIXME | RULE_ID | RULE_INVOCATION | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER )
        int alt14=20;
        alt14 = dfa14.predict(input);
        switch (alt14) {
            case 1 :
                // ../org.eclipse.xpect/src-gen/org/eclipse/xpect/lexer/XpectRT.g:1:10: XPECT_IGNORE
                {
                mXPECT_IGNORE(); 

                }
                break;
            case 2 :
                // ../org.eclipse.xpect/src-gen/org/eclipse/xpect/lexer/XpectRT.g:1:23: XPECT_SETUP
                {
                mXPECT_SETUP(); 

                }
                break;
            case 3 :
                // ../org.eclipse.xpect/src-gen/org/eclipse/xpect/lexer/XpectRT.g:1:35: XPECT
                {
                mXPECT(); 

                }
                break;
            case 4 :
                // ../org.eclipse.xpect/src-gen/org/eclipse/xpect/lexer/XpectRT.g:1:41: EqualsSign
                {
                mEqualsSign(); 

                }
                break;
            case 5 :
                // ../org.eclipse.xpect/src-gen/org/eclipse/xpect/lexer/XpectRT.g:1:52: LeftCurlyBracket
                {
                mLeftCurlyBracket(); 

                }
                break;
            case 6 :
                // ../org.eclipse.xpect/src-gen/org/eclipse/xpect/lexer/XpectRT.g:1:69: RightCurlyBracket
                {
                mRightCurlyBracket(); 

                }
                break;
            case 7 :
                // ../org.eclipse.xpect/src-gen/org/eclipse/xpect/lexer/XpectRT.g:1:87: True
                {
                mTrue(); 

                }
                break;
            case 8 :
                // ../org.eclipse.xpect/src-gen/org/eclipse/xpect/lexer/XpectRT.g:1:92: False
                {
                mFalse(); 

                }
                break;
            case 9 :
                // ../org.eclipse.xpect/src-gen/org/eclipse/xpect/lexer/XpectRT.g:1:98: FullStop
                {
                mFullStop(); 

                }
                break;
            case 10 :
                // ../org.eclipse.xpect/src-gen/org/eclipse/xpect/lexer/XpectRT.g:1:107: END_SETUP
                {
                mEND_SETUP(); 

                }
                break;
            case 11 :
                // ../org.eclipse.xpect/src-gen/org/eclipse/xpect/lexer/XpectRT.g:1:117: ExclamationMark
                {
                mExclamationMark(); 

                }
                break;
            case 12 :
                // ../org.eclipse.xpect/src-gen/org/eclipse/xpect/lexer/XpectRT.g:1:133: FIXME
                {
                mFIXME(); 

                }
                break;
            case 13 :
                // ../org.eclipse.xpect/src-gen/org/eclipse/xpect/lexer/XpectRT.g:1:139: RULE_ID
                {
                mRULE_ID(); 

                }
                break;
            case 14 :
                // ../org.eclipse.xpect/src-gen/org/eclipse/xpect/lexer/XpectRT.g:1:147: RULE_INVOCATION
                {
                mRULE_INVOCATION(); 

                }
                break;
            case 15 :
                // ../org.eclipse.xpect/src-gen/org/eclipse/xpect/lexer/XpectRT.g:1:163: RULE_INT
                {
                mRULE_INT(); 

                }
                break;
            case 16 :
                // ../org.eclipse.xpect/src-gen/org/eclipse/xpect/lexer/XpectRT.g:1:172: RULE_STRING
                {
                mRULE_STRING(); 

                }
                break;
            case 17 :
                // ../org.eclipse.xpect/src-gen/org/eclipse/xpect/lexer/XpectRT.g:1:184: RULE_ML_COMMENT
                {
                mRULE_ML_COMMENT(); 

                }
                break;
            case 18 :
                // ../org.eclipse.xpect/src-gen/org/eclipse/xpect/lexer/XpectRT.g:1:200: RULE_SL_COMMENT
                {
                mRULE_SL_COMMENT(); 

                }
                break;
            case 19 :
                // ../org.eclipse.xpect/src-gen/org/eclipse/xpect/lexer/XpectRT.g:1:216: RULE_WS
                {
                mRULE_WS(); 

                }
                break;
            case 20 :
                // ../org.eclipse.xpect/src-gen/org/eclipse/xpect/lexer/XpectRT.g:1:224: RULE_ANY_OTHER
                {
                mRULE_ANY_OTHER(); 

                }
                break;

        }

    }


    protected DFA14 dfa14 = new DFA14(this);
    static final String DFA14_eotS =
        "\1\uffff\1\24\1\26\1\27\1\30\2\24\1\33\1\24\1\35\1\24\1\22\1\24"+
        "\1\40\3\22\1\45\1\uffff\1\50\1\uffff\1\50\3\uffff\2\50\1\uffff\1"+
        "\50\1\uffff\2\50\7\uffff\1\50\6\uffff\2\50\1\uffff\1\50\1\uffff"+
        "\2\50\1\72\3\50\1\77\1\uffff\1\101\1\50\1\103\1\50\3\uffff\1\50"+
        "\1\uffff\2\50\2\uffff\1\50\1\uffff\5\50\1\122\2\50\1\uffff\1\50"+
        "\1\127\1\uffff\1\130\4\uffff";
    static final String DFA14_eofS =
        "\133\uffff";
    static final String DFA14_minS =
        "\1\0\1\60\3\0\2\60\1\0\1\60\1\0\1\60\1\101\2\60\2\0\1\52\1\11\1"+
        "\uffff\1\60\1\0\1\60\3\0\2\60\1\0\1\60\1\0\2\60\1\0\4\uffff\1\0"+
        "\1\uffff\1\60\1\0\5\uffff\2\60\1\uffff\1\60\1\uffff\7\60\1\0\4\60"+
        "\1\0\1\uffff\1\0\1\60\1\0\2\60\2\uffff\1\60\1\uffff\10\60\1\0\2"+
        "\60\1\uffff\1\60\2\0\2\uffff";
    static final String DFA14_maxS =
        "\1\uffff\1\172\3\0\2\172\1\0\1\172\1\0\3\172\1\71\2\uffff\1\57\1"+
        "\40\1\uffff\1\172\1\0\1\172\3\0\2\172\1\0\1\172\1\0\2\172\1\0\4"+
        "\uffff\1\0\1\uffff\1\172\1\0\5\uffff\2\172\1\uffff\1\172\1\uffff"+
        "\7\172\1\0\4\172\1\0\1\uffff\1\0\1\172\1\0\2\172\2\uffff\1\172\1"+
        "\uffff\10\172\1\0\2\172\1\uffff\1\172\2\0\2\uffff";
    static final String DFA14_acceptS =
        "\22\uffff\1\24\16\uffff\1\17\1\20\1\21\1\22\1\uffff\1\23\2\uffff"+
        "\1\15\1\16\1\4\1\5\1\6\2\uffff\1\11\1\uffff\1\13\15\uffff\1\7\5"+
        "\uffff\1\3\1\10\1\uffff\1\14\13\uffff\1\12\3\uffff\1\2\1\1";
    static final String DFA14_specialS =
        "\1\71\1\35\3\uffff\1\53\1\64\1\uffff\1\74\1\uffff\1\101\1\44\1\67"+
        "\1\40\1\72\1\10\1\11\1\65\1\uffff\1\54\1\23\1\24\1\3\1\5\1\6\1\0"+
        "\1\16\1\14\1\26\1\17\1\41\1\75\1\22\4\uffff\1\25\1\uffff\1\56\1"+
        "\12\5\uffff\1\1\1\20\1\uffff\1\30\1\uffff\1\42\1\61\1\55\1\21\1"+
        "\31\1\43\1\66\1\2\1\70\1\32\1\37\1\15\1\100\1\uffff\1\4\1\33\1\13"+
        "\1\45\1\57\2\uffff\1\34\1\uffff\1\46\1\60\1\36\1\47\1\62\1\27\1"+
        "\50\1\63\1\7\1\51\1\52\1\uffff\1\73\1\77\1\76\2\uffff}>";
    static final String[] DFA14_transitionS = {
            "\11\22\2\21\2\22\1\21\22\22\1\21\1\11\1\16\4\22\1\17\6\22\1"+
            "\7\1\20\12\15\3\22\1\2\3\22\4\14\1\10\1\12\21\14\1\1\2\14\3"+
            "\22\1\13\1\14\1\22\5\14\1\6\15\14\1\5\6\14\1\3\1\22\1\4\uff82"+
            "\22",
            "\12\25\7\uffff\17\25\1\23\12\25\4\uffff\1\25\1\uffff\32\25",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\12\25\7\uffff\32\25\4\uffff\1\25\1\uffff\21\25\1\31\10\25",
            "\12\25\7\uffff\32\25\4\uffff\1\25\1\uffff\1\32\31\25",
            "\1\uffff",
            "\12\25\7\uffff\15\25\1\34\14\25\4\uffff\1\25\1\uffff\32\25",
            "\1\uffff",
            "\12\25\7\uffff\10\25\1\36\21\25\4\uffff\1\25\1\uffff\32\25",
            "\32\37\4\uffff\1\37\1\uffff\32\37",
            "\12\25\7\uffff\32\25\4\uffff\1\25\1\uffff\32\25",
            "\12\41",
            "\0\42",
            "\0\42",
            "\1\43\4\uffff\1\44",
            "\2\46\2\uffff\1\46\22\uffff\1\46",
            "",
            "\12\25\7\uffff\4\25\1\47\25\25\4\uffff\1\25\1\uffff\32\25",
            "\1\uffff",
            "\12\25\7\uffff\32\25\4\uffff\1\25\1\uffff\32\25",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\12\25\7\uffff\32\25\4\uffff\1\25\1\uffff\24\25\1\56\5\25",
            "\12\25\7\uffff\32\25\4\uffff\1\25\1\uffff\13\25\1\57\16\25",
            "\1\uffff",
            "\12\25\7\uffff\3\25\1\61\26\25\4\uffff\1\25\1\uffff\32\25",
            "\1\uffff",
            "\12\25\7\uffff\27\25\1\63\2\25\4\uffff\1\25\1\uffff\32\25",
            "\12\25\7\uffff\32\25\4\uffff\1\25\1\uffff\32\25",
            "\1\uffff",
            "",
            "",
            "",
            "",
            "\1\uffff",
            "",
            "\12\25\7\uffff\2\25\1\64\27\25\4\uffff\1\25\1\uffff\32\25",
            "\1\uffff",
            "",
            "",
            "",
            "",
            "",
            "\12\25\7\uffff\32\25\4\uffff\1\25\1\uffff\4\25\1\65\25\25",
            "\12\25\7\uffff\32\25\4\uffff\1\25\1\uffff\22\25\1\66\7\25",
            "",
            "\12\25\7\uffff\32\25\4\uffff\1\67\1\uffff\32\25",
            "",
            "\12\25\7\uffff\14\25\1\70\15\25\4\uffff\1\25\1\uffff\32\25",
            "\12\25\7\uffff\23\25\1\71\6\25\4\uffff\1\25\1\uffff\32\25",
            "\12\25\7\uffff\32\25\4\uffff\1\25\1\uffff\32\25",
            "\12\25\7\uffff\32\25\4\uffff\1\25\1\uffff\4\25\1\73\25\25",
            "\12\25\7\uffff\22\25\1\74\7\25\4\uffff\1\25\1\uffff\32\25",
            "\12\25\7\uffff\4\25\1\75\25\25\4\uffff\1\25\1\uffff\32\25",
            "\12\25\7\uffff\32\25\4\uffff\1\76\1\uffff\32\25",
            "\1\uffff",
            "\12\25\7\uffff\32\25\4\uffff\1\25\1\uffff\32\25",
            "\12\25\7\uffff\4\25\1\102\25\25\4\uffff\1\25\1\uffff\32\25",
            "\12\25\7\uffff\32\25\4\uffff\1\25\1\uffff\32\25",
            "\12\25\7\uffff\10\25\1\104\11\25\1\105\7\25\4\uffff\1\25\1"+
            "\uffff\32\25",
            "\1\uffff",
            "",
            "\1\uffff",
            "\12\25\7\uffff\23\25\1\110\6\25\4\uffff\1\25\1\uffff\32\25",
            "\1\uffff",
            "\12\25\7\uffff\6\25\1\112\23\25\4\uffff\1\25\1\uffff\32\25",
            "\12\25\7\uffff\4\25\1\113\25\25\4\uffff\1\25\1\uffff\32\25",
            "",
            "",
            "\12\25\7\uffff\24\25\1\114\5\25\4\uffff\1\25\1\uffff\32\25",
            "",
            "\12\25\7\uffff\15\25\1\115\14\25\4\uffff\1\25\1\uffff\32\25",
            "\12\25\7\uffff\23\25\1\116\6\25\4\uffff\1\25\1\uffff\32\25",
            "\12\25\7\uffff\17\25\1\117\12\25\4\uffff\1\25\1\uffff\32\25",
            "\12\25\7\uffff\16\25\1\120\13\25\4\uffff\1\25\1\uffff\32\25",
            "\12\25\7\uffff\24\25\1\121\5\25\4\uffff\1\25\1\uffff\32\25",
            "\12\25\7\uffff\32\25\4\uffff\1\25\1\uffff\32\25",
            "\12\25\7\uffff\21\25\1\123\10\25\4\uffff\1\25\1\uffff\32\25",
            "\12\25\7\uffff\17\25\1\124\12\25\4\uffff\1\25\1\uffff\32\25",
            "\1\uffff",
            "\12\25\7\uffff\4\25\1\126\25\25\4\uffff\1\25\1\uffff\32\25",
            "\12\25\7\uffff\32\25\4\uffff\1\25\1\uffff\32\25",
            "",
            "\12\25\7\uffff\32\25\4\uffff\1\25\1\uffff\32\25",
            "\1\uffff",
            "\1\uffff",
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
            return "1:1: Tokens : ( XPECT_IGNORE | XPECT_SETUP | XPECT | EqualsSign | LeftCurlyBracket | RightCurlyBracket | True | False | FullStop | END_SETUP | ExclamationMark | FIXME | RULE_ID | RULE_INVOCATION | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            IntStream input = _input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA14_25 = input.LA(1);

                         
                        int index14_25 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA14_25=='u') && ((((tokenstate & 1) != 0)||((tokenstate & 2) != 0)||((tokenstate & 1) != 0 && matches("true"))))) {s = 46;}

                        else if ( ((LA14_25>='0' && LA14_25<='9')||(LA14_25>='A' && LA14_25<='Z')||LA14_25=='_'||(LA14_25>='a' && LA14_25<='t')||(LA14_25>='v' && LA14_25<='z')) && ((((tokenstate & 1) != 0)||((tokenstate & 2) != 0)))) {s = 21;}

                        else s = 40;

                         
                        input.seek(index14_25);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA14_46 = input.LA(1);

                         
                        int index14_46 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA14_46=='e') && ((((tokenstate & 1) != 0)||((tokenstate & 2) != 0)||((tokenstate & 1) != 0 && matches("true"))))) {s = 53;}

                        else if ( ((LA14_46>='0' && LA14_46<='9')||(LA14_46>='A' && LA14_46<='Z')||LA14_46=='_'||(LA14_46>='a' && LA14_46<='d')||(LA14_46>='f' && LA14_46<='z')) && ((((tokenstate & 1) != 0)||((tokenstate & 2) != 0)))) {s = 21;}

                        else s = 40;

                         
                        input.seek(index14_46);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA14_58 = input.LA(1);

                         
                        int index14_58 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (((tokenstate & 1) != 0 && matches("true"))) ) {s = 64;}

                        else if ( (((tokenstate & 1) != 0)) ) {s = 41;}

                        else if ( (((tokenstate & 2) != 0)) ) {s = 42;}

                         
                        input.seek(index14_58);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA14_22 = input.LA(1);

                         
                        int index14_22 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (((tokenstate & 1) != 0 && matches("="))) ) {s = 43;}

                        else if ( (true) ) {s = 18;}

                         
                        input.seek(index14_22);
                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA14_65 = input.LA(1);

                         
                        int index14_65 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (((tokenstate & 1) != 0 && matches("false"))) ) {s = 71;}

                        else if ( (((tokenstate & 1) != 0)) ) {s = 41;}

                        else if ( (((tokenstate & 2) != 0)) ) {s = 42;}

                         
                        input.seek(index14_65);
                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA14_23 = input.LA(1);

                         
                        int index14_23 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (((tokenstate & 1) != 0 && matches("{"))) ) {s = 44;}

                        else if ( (true) ) {s = 18;}

                         
                        input.seek(index14_23);
                        if ( s>=0 ) return s;
                        break;
                    case 6 : 
                        int LA14_24 = input.LA(1);

                         
                        int index14_24 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (((tokenstate & 1) != 0 && matches("}"))) ) {s = 45;}

                        else if ( (true) ) {s = 18;}

                         
                        input.seek(index14_24);
                        if ( s>=0 ) return s;
                        break;
                    case 7 : 
                        int LA14_82 = input.LA(1);

                         
                        int index14_82 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (((tokenstate & 1) != 0 && matches("END_SETUP"))) ) {s = 85;}

                        else if ( (((tokenstate & 1) != 0)) ) {s = 41;}

                        else if ( (((tokenstate & 2) != 0)) ) {s = 42;}

                         
                        input.seek(index14_82);
                        if ( s>=0 ) return s;
                        break;
                    case 8 : 
                        int LA14_15 = input.LA(1);

                         
                        int index14_15 = input.index();
                        input.rewind();
                        s = -1;
                        if ( ((LA14_15>='\u0000' && LA14_15<='\uFFFF')) && (((tokenstate & 1) != 0))) {s = 34;}

                        else s = 18;

                         
                        input.seek(index14_15);
                        if ( s>=0 ) return s;
                        break;
                    case 9 : 
                        int LA14_16 = input.LA(1);

                         
                        int index14_16 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA14_16=='*') && (((tokenstate & 3) != 0))) {s = 35;}

                        else if ( (LA14_16=='/') && (((tokenstate & 3) != 0))) {s = 36;}

                        else s = 18;

                         
                        input.seek(index14_16);
                        if ( s>=0 ) return s;
                        break;
                    case 10 : 
                        int LA14_40 = input.LA(1);

                         
                        int index14_40 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (((tokenstate & 1) != 0)) ) {s = 41;}

                        else if ( (((tokenstate & 2) != 0)) ) {s = 42;}

                         
                        input.seek(index14_40);
                        if ( s>=0 ) return s;
                        break;
                    case 11 : 
                        int LA14_67 = input.LA(1);

                         
                        int index14_67 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (((tokenstate & 2) != 0 && matches("FIXME"))) ) {s = 73;}

                        else if ( (((tokenstate & 1) != 0)) ) {s = 41;}

                        else if ( (((tokenstate & 2) != 0)) ) {s = 42;}

                         
                        input.seek(index14_67);
                        if ( s>=0 ) return s;
                        break;
                    case 12 : 
                        int LA14_27 = input.LA(1);

                         
                        int index14_27 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (((tokenstate & 1) != 0 && matches("."))) ) {s = 48;}

                        else if ( (true) ) {s = 18;}

                         
                        input.seek(index14_27);
                        if ( s>=0 ) return s;
                        break;
                    case 13 : 
                        int LA14_62 = input.LA(1);

                         
                        int index14_62 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA14_62=='I') && ((((tokenstate & 1) != 0)||((tokenstate & 4) != 0 && matches("XPECT_IGNORE"))||((tokenstate & 2) != 0)))) {s = 68;}

                        else if ( (LA14_62=='S') && ((((tokenstate & 4) != 0 && matches("XPECT_SETUP"))||((tokenstate & 1) != 0)||((tokenstate & 2) != 0)))) {s = 69;}

                        else if ( ((LA14_62>='0' && LA14_62<='9')||(LA14_62>='A' && LA14_62<='H')||(LA14_62>='J' && LA14_62<='R')||(LA14_62>='T' && LA14_62<='Z')||LA14_62=='_'||(LA14_62>='a' && LA14_62<='z')) && ((((tokenstate & 1) != 0)||((tokenstate & 2) != 0)))) {s = 21;}

                        else s = 40;

                         
                        input.seek(index14_62);
                        if ( s>=0 ) return s;
                        break;
                    case 14 : 
                        int LA14_26 = input.LA(1);

                         
                        int index14_26 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA14_26=='l') && ((((tokenstate & 1) != 0 && matches("false"))||((tokenstate & 1) != 0)||((tokenstate & 2) != 0)))) {s = 47;}

                        else if ( ((LA14_26>='0' && LA14_26<='9')||(LA14_26>='A' && LA14_26<='Z')||LA14_26=='_'||(LA14_26>='a' && LA14_26<='k')||(LA14_26>='m' && LA14_26<='z')) && ((((tokenstate & 1) != 0)||((tokenstate & 2) != 0)))) {s = 21;}

                        else s = 40;

                         
                        input.seek(index14_26);
                        if ( s>=0 ) return s;
                        break;
                    case 15 : 
                        int LA14_29 = input.LA(1);

                         
                        int index14_29 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (((tokenstate & 2) != 0 && matches("!"))) ) {s = 50;}

                        else if ( (true) ) {s = 18;}

                         
                        input.seek(index14_29);
                        if ( s>=0 ) return s;
                        break;
                    case 16 : 
                        int LA14_47 = input.LA(1);

                         
                        int index14_47 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA14_47=='s') && ((((tokenstate & 1) != 0 && matches("false"))||((tokenstate & 1) != 0)||((tokenstate & 2) != 0)))) {s = 54;}

                        else if ( ((LA14_47>='0' && LA14_47<='9')||(LA14_47>='A' && LA14_47<='Z')||LA14_47=='_'||(LA14_47>='a' && LA14_47<='r')||(LA14_47>='t' && LA14_47<='z')) && ((((tokenstate & 1) != 0)||((tokenstate & 2) != 0)))) {s = 21;}

                        else s = 40;

                         
                        input.seek(index14_47);
                        if ( s>=0 ) return s;
                        break;
                    case 17 : 
                        int LA14_54 = input.LA(1);

                         
                        int index14_54 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA14_54=='e') && ((((tokenstate & 1) != 0 && matches("false"))||((tokenstate & 1) != 0)||((tokenstate & 2) != 0)))) {s = 59;}

                        else if ( ((LA14_54>='0' && LA14_54<='9')||(LA14_54>='A' && LA14_54<='Z')||LA14_54=='_'||(LA14_54>='a' && LA14_54<='d')||(LA14_54>='f' && LA14_54<='z')) && ((((tokenstate & 1) != 0)||((tokenstate & 2) != 0)))) {s = 21;}

                        else s = 40;

                         
                        input.seek(index14_54);
                        if ( s>=0 ) return s;
                        break;
                    case 18 : 
                        int LA14_32 = input.LA(1);

                         
                        int index14_32 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (((tokenstate & 1) != 0)) ) {s = 33;}

                        else if ( (true) ) {s = 18;}

                         
                        input.seek(index14_32);
                        if ( s>=0 ) return s;
                        break;
                    case 19 : 
                        int LA14_20 = input.LA(1);

                         
                        int index14_20 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (((tokenstate & 1) != 0)) ) {s = 41;}

                        else if ( (((tokenstate & 2) != 0)) ) {s = 42;}

                        else if ( (true) ) {s = 18;}

                         
                        input.seek(index14_20);
                        if ( s>=0 ) return s;
                        break;
                    case 20 : 
                        int LA14_21 = input.LA(1);

                         
                        int index14_21 = input.index();
                        input.rewind();
                        s = -1;
                        if ( ((LA14_21>='0' && LA14_21<='9')||(LA14_21>='A' && LA14_21<='Z')||LA14_21=='_'||(LA14_21>='a' && LA14_21<='z')) && ((((tokenstate & 1) != 0)||((tokenstate & 2) != 0)))) {s = 21;}

                        else s = 40;

                         
                        input.seek(index14_21);
                        if ( s>=0 ) return s;
                        break;
                    case 21 : 
                        int LA14_37 = input.LA(1);

                         
                        int index14_37 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (((tokenstate & 3) != 0)) ) {s = 38;}

                        else if ( (true) ) {s = 18;}

                         
                        input.seek(index14_37);
                        if ( s>=0 ) return s;
                        break;
                    case 22 : 
                        int LA14_28 = input.LA(1);

                         
                        int index14_28 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA14_28=='D') && ((((tokenstate & 1) != 0)||((tokenstate & 2) != 0)||((tokenstate & 1) != 0 && matches("END_SETUP"))))) {s = 49;}

                        else if ( ((LA14_28>='0' && LA14_28<='9')||(LA14_28>='A' && LA14_28<='C')||(LA14_28>='E' && LA14_28<='Z')||LA14_28=='_'||(LA14_28>='a' && LA14_28<='z')) && ((((tokenstate & 1) != 0)||((tokenstate & 2) != 0)))) {s = 21;}

                        else s = 40;

                         
                        input.seek(index14_28);
                        if ( s>=0 ) return s;
                        break;
                    case 23 : 
                        int LA14_79 = input.LA(1);

                         
                        int index14_79 = input.index();
                        input.rewind();
                        s = -1;
                        if ( ((LA14_79>='0' && LA14_79<='9')||(LA14_79>='A' && LA14_79<='Z')||LA14_79=='_'||(LA14_79>='a' && LA14_79<='z')) && ((((tokenstate & 1) != 0)||((tokenstate & 2) != 0)))) {s = 21;}

                        else s = 82;

                         
                        input.seek(index14_79);
                        if ( s>=0 ) return s;
                        break;
                    case 24 : 
                        int LA14_49 = input.LA(1);

                         
                        int index14_49 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA14_49=='_') && ((((tokenstate & 1) != 0)||((tokenstate & 2) != 0)||((tokenstate & 1) != 0 && matches("END_SETUP"))))) {s = 55;}

                        else if ( ((LA14_49>='0' && LA14_49<='9')||(LA14_49>='A' && LA14_49<='Z')||(LA14_49>='a' && LA14_49<='z')) && ((((tokenstate & 1) != 0)||((tokenstate & 2) != 0)))) {s = 21;}

                        else s = 40;

                         
                        input.seek(index14_49);
                        if ( s>=0 ) return s;
                        break;
                    case 25 : 
                        int LA14_55 = input.LA(1);

                         
                        int index14_55 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA14_55=='S') && ((((tokenstate & 1) != 0)||((tokenstate & 2) != 0)||((tokenstate & 1) != 0 && matches("END_SETUP"))))) {s = 60;}

                        else if ( ((LA14_55>='0' && LA14_55<='9')||(LA14_55>='A' && LA14_55<='R')||(LA14_55>='T' && LA14_55<='Z')||LA14_55=='_'||(LA14_55>='a' && LA14_55<='z')) && ((((tokenstate & 1) != 0)||((tokenstate & 2) != 0)))) {s = 21;}

                        else s = 40;

                         
                        input.seek(index14_55);
                        if ( s>=0 ) return s;
                        break;
                    case 26 : 
                        int LA14_60 = input.LA(1);

                         
                        int index14_60 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA14_60=='E') && ((((tokenstate & 1) != 0)||((tokenstate & 2) != 0)||((tokenstate & 1) != 0 && matches("END_SETUP"))))) {s = 66;}

                        else if ( ((LA14_60>='0' && LA14_60<='9')||(LA14_60>='A' && LA14_60<='D')||(LA14_60>='F' && LA14_60<='Z')||LA14_60=='_'||(LA14_60>='a' && LA14_60<='z')) && ((((tokenstate & 1) != 0)||((tokenstate & 2) != 0)))) {s = 21;}

                        else s = 40;

                         
                        input.seek(index14_60);
                        if ( s>=0 ) return s;
                        break;
                    case 27 : 
                        int LA14_66 = input.LA(1);

                         
                        int index14_66 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA14_66=='T') && ((((tokenstate & 1) != 0)||((tokenstate & 2) != 0)||((tokenstate & 1) != 0 && matches("END_SETUP"))))) {s = 72;}

                        else if ( ((LA14_66>='0' && LA14_66<='9')||(LA14_66>='A' && LA14_66<='S')||(LA14_66>='U' && LA14_66<='Z')||LA14_66=='_'||(LA14_66>='a' && LA14_66<='z')) && ((((tokenstate & 1) != 0)||((tokenstate & 2) != 0)))) {s = 21;}

                        else s = 40;

                         
                        input.seek(index14_66);
                        if ( s>=0 ) return s;
                        break;
                    case 28 : 
                        int LA14_72 = input.LA(1);

                         
                        int index14_72 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA14_72=='U') && ((((tokenstate & 1) != 0)||((tokenstate & 2) != 0)||((tokenstate & 1) != 0 && matches("END_SETUP"))))) {s = 76;}

                        else if ( ((LA14_72>='0' && LA14_72<='9')||(LA14_72>='A' && LA14_72<='T')||(LA14_72>='V' && LA14_72<='Z')||LA14_72=='_'||(LA14_72>='a' && LA14_72<='z')) && ((((tokenstate & 1) != 0)||((tokenstate & 2) != 0)))) {s = 21;}

                        else s = 40;

                         
                        input.seek(index14_72);
                        if ( s>=0 ) return s;
                        break;
                    case 29 : 
                        int LA14_1 = input.LA(1);

                         
                        int index14_1 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA14_1=='P') && ((((tokenstate & 4) != 0 && matches("XPECT_SETUP"))||((tokenstate & 1) != 0)||((tokenstate & 4) != 0 && matches("XPECT_IGNORE"))||((tokenstate & 2) != 0)||((tokenstate & 4) != 0 && matches("XPECT"))))) {s = 19;}

                        else if ( ((LA14_1>='0' && LA14_1<='9')||(LA14_1>='A' && LA14_1<='O')||(LA14_1>='Q' && LA14_1<='Z')||LA14_1=='_'||(LA14_1>='a' && LA14_1<='z')) && ((((tokenstate & 1) != 0)||((tokenstate & 2) != 0)))) {s = 21;}

                        else s = 20;

                         
                        input.seek(index14_1);
                        if ( s>=0 ) return s;
                        break;
                    case 30 : 
                        int LA14_76 = input.LA(1);

                         
                        int index14_76 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA14_76=='P') && ((((tokenstate & 1) != 0)||((tokenstate & 2) != 0)||((tokenstate & 1) != 0 && matches("END_SETUP"))))) {s = 79;}

                        else if ( ((LA14_76>='0' && LA14_76<='9')||(LA14_76>='A' && LA14_76<='O')||(LA14_76>='Q' && LA14_76<='Z')||LA14_76=='_'||(LA14_76>='a' && LA14_76<='z')) && ((((tokenstate & 1) != 0)||((tokenstate & 2) != 0)))) {s = 21;}

                        else s = 40;

                         
                        input.seek(index14_76);
                        if ( s>=0 ) return s;
                        break;
                    case 31 : 
                        int LA14_61 = input.LA(1);

                         
                        int index14_61 = input.index();
                        input.rewind();
                        s = -1;
                        if ( ((LA14_61>='0' && LA14_61<='9')||(LA14_61>='A' && LA14_61<='Z')||LA14_61=='_'||(LA14_61>='a' && LA14_61<='z')) && ((((tokenstate & 1) != 0)||((tokenstate & 2) != 0)))) {s = 21;}

                        else s = 67;

                         
                        input.seek(index14_61);
                        if ( s>=0 ) return s;
                        break;
                    case 32 : 
                        int LA14_13 = input.LA(1);

                         
                        int index14_13 = input.index();
                        input.rewind();
                        s = -1;
                        if ( ((LA14_13>='0' && LA14_13<='9')) && (((tokenstate & 1) != 0))) {s = 33;}

                        else s = 32;

                         
                        input.seek(index14_13);
                        if ( s>=0 ) return s;
                        break;
                    case 33 : 
                        int LA14_30 = input.LA(1);

                         
                        int index14_30 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA14_30=='X') && ((((tokenstate & 1) != 0)||((tokenstate & 2) != 0)||((tokenstate & 2) != 0 && matches("FIXME"))))) {s = 51;}

                        else if ( ((LA14_30>='0' && LA14_30<='9')||(LA14_30>='A' && LA14_30<='W')||(LA14_30>='Y' && LA14_30<='Z')||LA14_30=='_'||(LA14_30>='a' && LA14_30<='z')) && ((((tokenstate & 1) != 0)||((tokenstate & 2) != 0)))) {s = 21;}

                        else s = 40;

                         
                        input.seek(index14_30);
                        if ( s>=0 ) return s;
                        break;
                    case 34 : 
                        int LA14_51 = input.LA(1);

                         
                        int index14_51 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA14_51=='M') && ((((tokenstate & 1) != 0)||((tokenstate & 2) != 0)||((tokenstate & 2) != 0 && matches("FIXME"))))) {s = 56;}

                        else if ( ((LA14_51>='0' && LA14_51<='9')||(LA14_51>='A' && LA14_51<='L')||(LA14_51>='N' && LA14_51<='Z')||LA14_51=='_'||(LA14_51>='a' && LA14_51<='z')) && ((((tokenstate & 1) != 0)||((tokenstate & 2) != 0)))) {s = 21;}

                        else s = 40;

                         
                        input.seek(index14_51);
                        if ( s>=0 ) return s;
                        break;
                    case 35 : 
                        int LA14_56 = input.LA(1);

                         
                        int index14_56 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA14_56=='E') && ((((tokenstate & 1) != 0)||((tokenstate & 2) != 0)||((tokenstate & 2) != 0 && matches("FIXME"))))) {s = 61;}

                        else if ( ((LA14_56>='0' && LA14_56<='9')||(LA14_56>='A' && LA14_56<='D')||(LA14_56>='F' && LA14_56<='Z')||LA14_56=='_'||(LA14_56>='a' && LA14_56<='z')) && ((((tokenstate & 1) != 0)||((tokenstate & 2) != 0)))) {s = 21;}

                        else s = 40;

                         
                        input.seek(index14_56);
                        if ( s>=0 ) return s;
                        break;
                    case 36 : 
                        int LA14_11 = input.LA(1);

                         
                        int index14_11 = input.index();
                        input.rewind();
                        s = -1;
                        if ( ((LA14_11>='A' && LA14_11<='Z')||LA14_11=='_'||(LA14_11>='a' && LA14_11<='z')) && ((((tokenstate & 1) != 0)||((tokenstate & 2) != 0)))) {s = 31;}

                        else s = 18;

                         
                        input.seek(index14_11);
                        if ( s>=0 ) return s;
                        break;
                    case 37 : 
                        int LA14_68 = input.LA(1);

                         
                        int index14_68 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA14_68=='G') && ((((tokenstate & 1) != 0)||((tokenstate & 4) != 0 && matches("XPECT_IGNORE"))||((tokenstate & 2) != 0)))) {s = 74;}

                        else if ( ((LA14_68>='0' && LA14_68<='9')||(LA14_68>='A' && LA14_68<='F')||(LA14_68>='H' && LA14_68<='Z')||LA14_68=='_'||(LA14_68>='a' && LA14_68<='z')) && ((((tokenstate & 1) != 0)||((tokenstate & 2) != 0)))) {s = 21;}

                        else s = 40;

                         
                        input.seek(index14_68);
                        if ( s>=0 ) return s;
                        break;
                    case 38 : 
                        int LA14_74 = input.LA(1);

                         
                        int index14_74 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA14_74=='N') && ((((tokenstate & 1) != 0)||((tokenstate & 4) != 0 && matches("XPECT_IGNORE"))||((tokenstate & 2) != 0)))) {s = 77;}

                        else if ( ((LA14_74>='0' && LA14_74<='9')||(LA14_74>='A' && LA14_74<='M')||(LA14_74>='O' && LA14_74<='Z')||LA14_74=='_'||(LA14_74>='a' && LA14_74<='z')) && ((((tokenstate & 1) != 0)||((tokenstate & 2) != 0)))) {s = 21;}

                        else s = 40;

                         
                        input.seek(index14_74);
                        if ( s>=0 ) return s;
                        break;
                    case 39 : 
                        int LA14_77 = input.LA(1);

                         
                        int index14_77 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA14_77=='O') && ((((tokenstate & 1) != 0)||((tokenstate & 4) != 0 && matches("XPECT_IGNORE"))||((tokenstate & 2) != 0)))) {s = 80;}

                        else if ( ((LA14_77>='0' && LA14_77<='9')||(LA14_77>='A' && LA14_77<='N')||(LA14_77>='P' && LA14_77<='Z')||LA14_77=='_'||(LA14_77>='a' && LA14_77<='z')) && ((((tokenstate & 1) != 0)||((tokenstate & 2) != 0)))) {s = 21;}

                        else s = 40;

                         
                        input.seek(index14_77);
                        if ( s>=0 ) return s;
                        break;
                    case 40 : 
                        int LA14_80 = input.LA(1);

                         
                        int index14_80 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA14_80=='R') && ((((tokenstate & 1) != 0)||((tokenstate & 4) != 0 && matches("XPECT_IGNORE"))||((tokenstate & 2) != 0)))) {s = 83;}

                        else if ( ((LA14_80>='0' && LA14_80<='9')||(LA14_80>='A' && LA14_80<='Q')||(LA14_80>='S' && LA14_80<='Z')||LA14_80=='_'||(LA14_80>='a' && LA14_80<='z')) && ((((tokenstate & 1) != 0)||((tokenstate & 2) != 0)))) {s = 21;}

                        else s = 40;

                         
                        input.seek(index14_80);
                        if ( s>=0 ) return s;
                        break;
                    case 41 : 
                        int LA14_83 = input.LA(1);

                         
                        int index14_83 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA14_83=='E') && ((((tokenstate & 1) != 0)||((tokenstate & 4) != 0 && matches("XPECT_IGNORE"))||((tokenstate & 2) != 0)))) {s = 86;}

                        else if ( ((LA14_83>='0' && LA14_83<='9')||(LA14_83>='A' && LA14_83<='D')||(LA14_83>='F' && LA14_83<='Z')||LA14_83=='_'||(LA14_83>='a' && LA14_83<='z')) && ((((tokenstate & 1) != 0)||((tokenstate & 2) != 0)))) {s = 21;}

                        else s = 40;

                         
                        input.seek(index14_83);
                        if ( s>=0 ) return s;
                        break;
                    case 42 : 
                        int LA14_84 = input.LA(1);

                         
                        int index14_84 = input.index();
                        input.rewind();
                        s = -1;
                        if ( ((LA14_84>='0' && LA14_84<='9')||(LA14_84>='A' && LA14_84<='Z')||LA14_84=='_'||(LA14_84>='a' && LA14_84<='z')) && ((((tokenstate & 1) != 0)||((tokenstate & 2) != 0)))) {s = 21;}

                        else s = 87;

                         
                        input.seek(index14_84);
                        if ( s>=0 ) return s;
                        break;
                    case 43 : 
                        int LA14_5 = input.LA(1);

                         
                        int index14_5 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA14_5=='r') && ((((tokenstate & 1) != 0)||((tokenstate & 2) != 0)||((tokenstate & 1) != 0 && matches("true"))))) {s = 25;}

                        else if ( ((LA14_5>='0' && LA14_5<='9')||(LA14_5>='A' && LA14_5<='Z')||LA14_5=='_'||(LA14_5>='a' && LA14_5<='q')||(LA14_5>='s' && LA14_5<='z')) && ((((tokenstate & 1) != 0)||((tokenstate & 2) != 0)))) {s = 21;}

                        else s = 20;

                         
                        input.seek(index14_5);
                        if ( s>=0 ) return s;
                        break;
                    case 44 : 
                        int LA14_19 = input.LA(1);

                         
                        int index14_19 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA14_19=='E') && ((((tokenstate & 4) != 0 && matches("XPECT_SETUP"))||((tokenstate & 1) != 0)||((tokenstate & 4) != 0 && matches("XPECT_IGNORE"))||((tokenstate & 2) != 0)||((tokenstate & 4) != 0 && matches("XPECT"))))) {s = 39;}

                        else if ( ((LA14_19>='0' && LA14_19<='9')||(LA14_19>='A' && LA14_19<='D')||(LA14_19>='F' && LA14_19<='Z')||LA14_19=='_'||(LA14_19>='a' && LA14_19<='z')) && ((((tokenstate & 1) != 0)||((tokenstate & 2) != 0)))) {s = 21;}

                        else s = 40;

                         
                        input.seek(index14_19);
                        if ( s>=0 ) return s;
                        break;
                    case 45 : 
                        int LA14_53 = input.LA(1);

                         
                        int index14_53 = input.index();
                        input.rewind();
                        s = -1;
                        if ( ((LA14_53>='0' && LA14_53<='9')||(LA14_53>='A' && LA14_53<='Z')||LA14_53=='_'||(LA14_53>='a' && LA14_53<='z')) && ((((tokenstate & 1) != 0)||((tokenstate & 2) != 0)))) {s = 21;}

                        else s = 58;

                         
                        input.seek(index14_53);
                        if ( s>=0 ) return s;
                        break;
                    case 46 : 
                        int LA14_39 = input.LA(1);

                         
                        int index14_39 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA14_39=='C') && ((((tokenstate & 4) != 0 && matches("XPECT_SETUP"))||((tokenstate & 1) != 0)||((tokenstate & 4) != 0 && matches("XPECT_IGNORE"))||((tokenstate & 2) != 0)||((tokenstate & 4) != 0 && matches("XPECT"))))) {s = 52;}

                        else if ( ((LA14_39>='0' && LA14_39<='9')||(LA14_39>='A' && LA14_39<='B')||(LA14_39>='D' && LA14_39<='Z')||LA14_39=='_'||(LA14_39>='a' && LA14_39<='z')) && ((((tokenstate & 1) != 0)||((tokenstate & 2) != 0)))) {s = 21;}

                        else s = 40;

                         
                        input.seek(index14_39);
                        if ( s>=0 ) return s;
                        break;
                    case 47 : 
                        int LA14_69 = input.LA(1);

                         
                        int index14_69 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA14_69=='E') && ((((tokenstate & 4) != 0 && matches("XPECT_SETUP"))||((tokenstate & 1) != 0)||((tokenstate & 2) != 0)))) {s = 75;}

                        else if ( ((LA14_69>='0' && LA14_69<='9')||(LA14_69>='A' && LA14_69<='D')||(LA14_69>='F' && LA14_69<='Z')||LA14_69=='_'||(LA14_69>='a' && LA14_69<='z')) && ((((tokenstate & 1) != 0)||((tokenstate & 2) != 0)))) {s = 21;}

                        else s = 40;

                         
                        input.seek(index14_69);
                        if ( s>=0 ) return s;
                        break;
                    case 48 : 
                        int LA14_75 = input.LA(1);

                         
                        int index14_75 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA14_75=='T') && ((((tokenstate & 4) != 0 && matches("XPECT_SETUP"))||((tokenstate & 1) != 0)||((tokenstate & 2) != 0)))) {s = 78;}

                        else if ( ((LA14_75>='0' && LA14_75<='9')||(LA14_75>='A' && LA14_75<='S')||(LA14_75>='U' && LA14_75<='Z')||LA14_75=='_'||(LA14_75>='a' && LA14_75<='z')) && ((((tokenstate & 1) != 0)||((tokenstate & 2) != 0)))) {s = 21;}

                        else s = 40;

                         
                        input.seek(index14_75);
                        if ( s>=0 ) return s;
                        break;
                    case 49 : 
                        int LA14_52 = input.LA(1);

                         
                        int index14_52 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA14_52=='T') && ((((tokenstate & 4) != 0 && matches("XPECT_SETUP"))||((tokenstate & 1) != 0)||((tokenstate & 4) != 0 && matches("XPECT_IGNORE"))||((tokenstate & 2) != 0)||((tokenstate & 4) != 0 && matches("XPECT"))))) {s = 57;}

                        else if ( ((LA14_52>='0' && LA14_52<='9')||(LA14_52>='A' && LA14_52<='S')||(LA14_52>='U' && LA14_52<='Z')||LA14_52=='_'||(LA14_52>='a' && LA14_52<='z')) && ((((tokenstate & 1) != 0)||((tokenstate & 2) != 0)))) {s = 21;}

                        else s = 40;

                         
                        input.seek(index14_52);
                        if ( s>=0 ) return s;
                        break;
                    case 50 : 
                        int LA14_78 = input.LA(1);

                         
                        int index14_78 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA14_78=='U') && ((((tokenstate & 4) != 0 && matches("XPECT_SETUP"))||((tokenstate & 1) != 0)||((tokenstate & 2) != 0)))) {s = 81;}

                        else if ( ((LA14_78>='0' && LA14_78<='9')||(LA14_78>='A' && LA14_78<='T')||(LA14_78>='V' && LA14_78<='Z')||LA14_78=='_'||(LA14_78>='a' && LA14_78<='z')) && ((((tokenstate & 1) != 0)||((tokenstate & 2) != 0)))) {s = 21;}

                        else s = 40;

                         
                        input.seek(index14_78);
                        if ( s>=0 ) return s;
                        break;
                    case 51 : 
                        int LA14_81 = input.LA(1);

                         
                        int index14_81 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA14_81=='P') && ((((tokenstate & 4) != 0 && matches("XPECT_SETUP"))||((tokenstate & 1) != 0)||((tokenstate & 2) != 0)))) {s = 84;}

                        else if ( ((LA14_81>='0' && LA14_81<='9')||(LA14_81>='A' && LA14_81<='O')||(LA14_81>='Q' && LA14_81<='Z')||LA14_81=='_'||(LA14_81>='a' && LA14_81<='z')) && ((((tokenstate & 1) != 0)||((tokenstate & 2) != 0)))) {s = 21;}

                        else s = 40;

                         
                        input.seek(index14_81);
                        if ( s>=0 ) return s;
                        break;
                    case 52 : 
                        int LA14_6 = input.LA(1);

                         
                        int index14_6 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA14_6=='a') && ((((tokenstate & 1) != 0 && matches("false"))||((tokenstate & 1) != 0)||((tokenstate & 2) != 0)))) {s = 26;}

                        else if ( ((LA14_6>='0' && LA14_6<='9')||(LA14_6>='A' && LA14_6<='Z')||LA14_6=='_'||(LA14_6>='b' && LA14_6<='z')) && ((((tokenstate & 1) != 0)||((tokenstate & 2) != 0)))) {s = 21;}

                        else s = 20;

                         
                        input.seek(index14_6);
                        if ( s>=0 ) return s;
                        break;
                    case 53 : 
                        int LA14_17 = input.LA(1);

                         
                        int index14_17 = input.index();
                        input.rewind();
                        s = -1;
                        if ( ((LA14_17>='\t' && LA14_17<='\n')||LA14_17=='\r'||LA14_17==' ') && (((tokenstate & 3) != 0))) {s = 38;}

                        else s = 37;

                         
                        input.seek(index14_17);
                        if ( s>=0 ) return s;
                        break;
                    case 54 : 
                        int LA14_57 = input.LA(1);

                         
                        int index14_57 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA14_57=='_') && ((((tokenstate & 4) != 0 && matches("XPECT_SETUP"))||((tokenstate & 1) != 0)||((tokenstate & 4) != 0 && matches("XPECT_IGNORE"))||((tokenstate & 2) != 0)))) {s = 62;}

                        else if ( ((LA14_57>='0' && LA14_57<='9')||(LA14_57>='A' && LA14_57<='Z')||(LA14_57>='a' && LA14_57<='z')) && ((((tokenstate & 1) != 0)||((tokenstate & 2) != 0)))) {s = 21;}

                        else s = 63;

                         
                        input.seek(index14_57);
                        if ( s>=0 ) return s;
                        break;
                    case 55 : 
                        int LA14_12 = input.LA(1);

                         
                        int index14_12 = input.index();
                        input.rewind();
                        s = -1;
                        if ( ((LA14_12>='0' && LA14_12<='9')||(LA14_12>='A' && LA14_12<='Z')||LA14_12=='_'||(LA14_12>='a' && LA14_12<='z')) && ((((tokenstate & 1) != 0)||((tokenstate & 2) != 0)))) {s = 21;}

                        else s = 20;

                         
                        input.seek(index14_12);
                        if ( s>=0 ) return s;
                        break;
                    case 56 : 
                        int LA14_59 = input.LA(1);

                         
                        int index14_59 = input.index();
                        input.rewind();
                        s = -1;
                        if ( ((LA14_59>='0' && LA14_59<='9')||(LA14_59>='A' && LA14_59<='Z')||LA14_59=='_'||(LA14_59>='a' && LA14_59<='z')) && ((((tokenstate & 1) != 0)||((tokenstate & 2) != 0)))) {s = 21;}

                        else s = 65;

                         
                        input.seek(index14_59);
                        if ( s>=0 ) return s;
                        break;
                    case 57 : 
                        int LA14_0 = input.LA(1);

                        s = -1;
                        if ( (LA14_0=='X') ) {s = 1;}

                        else if ( (LA14_0=='=') ) {s = 2;}

                        else if ( (LA14_0=='{') ) {s = 3;}

                        else if ( (LA14_0=='}') ) {s = 4;}

                        else if ( (LA14_0=='t') ) {s = 5;}

                        else if ( (LA14_0=='f') ) {s = 6;}

                        else if ( (LA14_0=='.') ) {s = 7;}

                        else if ( (LA14_0=='E') ) {s = 8;}

                        else if ( (LA14_0=='!') ) {s = 9;}

                        else if ( (LA14_0=='F') ) {s = 10;}

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
                    case 58 : 
                        int LA14_14 = input.LA(1);

                         
                        int index14_14 = input.index();
                        input.rewind();
                        s = -1;
                        if ( ((LA14_14>='\u0000' && LA14_14<='\uFFFF')) && (((tokenstate & 1) != 0))) {s = 34;}

                        else s = 18;

                         
                        input.seek(index14_14);
                        if ( s>=0 ) return s;
                        break;
                    case 59 : 
                        int LA14_86 = input.LA(1);

                         
                        int index14_86 = input.index();
                        input.rewind();
                        s = -1;
                        if ( ((LA14_86>='0' && LA14_86<='9')||(LA14_86>='A' && LA14_86<='Z')||LA14_86=='_'||(LA14_86>='a' && LA14_86<='z')) && ((((tokenstate & 1) != 0)||((tokenstate & 2) != 0)))) {s = 21;}

                        else s = 88;

                         
                        input.seek(index14_86);
                        if ( s>=0 ) return s;
                        break;
                    case 60 : 
                        int LA14_8 = input.LA(1);

                         
                        int index14_8 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA14_8=='N') && ((((tokenstate & 1) != 0)||((tokenstate & 2) != 0)||((tokenstate & 1) != 0 && matches("END_SETUP"))))) {s = 28;}

                        else if ( ((LA14_8>='0' && LA14_8<='9')||(LA14_8>='A' && LA14_8<='M')||(LA14_8>='O' && LA14_8<='Z')||LA14_8=='_'||(LA14_8>='a' && LA14_8<='z')) && ((((tokenstate & 1) != 0)||((tokenstate & 2) != 0)))) {s = 21;}

                        else s = 20;

                         
                        input.seek(index14_8);
                        if ( s>=0 ) return s;
                        break;
                    case 61 : 
                        int LA14_31 = input.LA(1);

                         
                        int index14_31 = input.index();
                        input.rewind();
                        s = -1;
                        if ( ((LA14_31>='0' && LA14_31<='9')||(LA14_31>='A' && LA14_31<='Z')||LA14_31=='_'||(LA14_31>='a' && LA14_31<='z')) && ((((tokenstate & 1) != 0)||((tokenstate & 2) != 0)))) {s = 21;}

                        else s = 40;

                         
                        input.seek(index14_31);
                        if ( s>=0 ) return s;
                        break;
                    case 62 : 
                        int LA14_88 = input.LA(1);

                         
                        int index14_88 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (((tokenstate & 4) != 0 && matches("XPECT_IGNORE"))) ) {s = 90;}

                        else if ( (((tokenstate & 1) != 0)) ) {s = 41;}

                        else if ( (((tokenstate & 2) != 0)) ) {s = 42;}

                         
                        input.seek(index14_88);
                        if ( s>=0 ) return s;
                        break;
                    case 63 : 
                        int LA14_87 = input.LA(1);

                         
                        int index14_87 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (((tokenstate & 4) != 0 && matches("XPECT_SETUP"))) ) {s = 89;}

                        else if ( (((tokenstate & 1) != 0)) ) {s = 41;}

                        else if ( (((tokenstate & 2) != 0)) ) {s = 42;}

                         
                        input.seek(index14_87);
                        if ( s>=0 ) return s;
                        break;
                    case 64 : 
                        int LA14_63 = input.LA(1);

                         
                        int index14_63 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (((tokenstate & 4) != 0 && matches("XPECT"))) ) {s = 70;}

                        else if ( (((tokenstate & 1) != 0)) ) {s = 41;}

                        else if ( (((tokenstate & 2) != 0)) ) {s = 42;}

                         
                        input.seek(index14_63);
                        if ( s>=0 ) return s;
                        break;
                    case 65 : 
                        int LA14_10 = input.LA(1);

                         
                        int index14_10 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA14_10=='I') && ((((tokenstate & 1) != 0)||((tokenstate & 2) != 0)||((tokenstate & 2) != 0 && matches("FIXME"))))) {s = 30;}

                        else if ( ((LA14_10>='0' && LA14_10<='9')||(LA14_10>='A' && LA14_10<='H')||(LA14_10>='J' && LA14_10<='Z')||LA14_10=='_'||(LA14_10>='a' && LA14_10<='z')) && ((((tokenstate & 1) != 0)||((tokenstate & 2) != 0)))) {s = 21;}

                        else s = 20;

                         
                        input.seek(index14_10);
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