package org.eclipse.xpect.ide.contentassist.antlr.internal;
import java.util.Map;
import java.util.HashMap;

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.DFA;
import org.eclipse.xpect.services.XpectGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalXpectParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "XPECT_IGNORE", "XPECT_SETUP", "END_SETUP", "FIXME", "XPECT", "False", "True", "ExclamationMark", "FullStop", "EqualsSign", "LeftCurlyBracket", "RightCurlyBracket", "RULE_ID", "RULE_INVOCATION", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER"
    };
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


        public InternalXpectParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalXpectParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalXpectParser.tokenNames; }
    public String getGrammarFileName() { return "InternalXpectParser.g"; }


    	private XpectGrammarAccess grammarAccess;
    	private final Map<String, String> tokenNameToValue = new HashMap<String, String>();
    	
    	{
    		tokenNameToValue.put("ExclamationMark", "'!'");
    		tokenNameToValue.put("FullStop", "'.'");
    		tokenNameToValue.put("EqualsSign", "'='");
    		tokenNameToValue.put("LeftCurlyBracket", "'{'");
    		tokenNameToValue.put("RightCurlyBracket", "'}'");
    		tokenNameToValue.put("True", "'true'");
    		tokenNameToValue.put("FIXME", "'FIXME'");
    		tokenNameToValue.put("XPECT", "'XPECT'");
    		tokenNameToValue.put("False", "'false'");
    		tokenNameToValue.put("END_SETUP", "'END_SETUP'");
    		tokenNameToValue.put("XPECT_SETUP", "'XPECT_SETUP'");
    		tokenNameToValue.put("XPECT_IGNORE", "'XPECT_IGNORE'");
    	}

    	public void setGrammarAccess(XpectGrammarAccess grammarAccess) {
    		this.grammarAccess = grammarAccess;
    	}

    	@Override
    	protected Grammar getGrammar() {
    		return grammarAccess.getGrammar();
    	}

    	@Override
    	protected String getValueForTokenName(String tokenName) {
    		String result = tokenNameToValue.get(tokenName);
    		if (result == null)
    			result = tokenName;
    		return result;
    	}



    // $ANTLR start "entryRuleXpectFile"
    // InternalXpectParser.g:67:1: entryRuleXpectFile : ruleXpectFile EOF ;
    public final void entryRuleXpectFile() throws RecognitionException {
        try {
            // InternalXpectParser.g:68:1: ( ruleXpectFile EOF )
            // InternalXpectParser.g:69:1: ruleXpectFile EOF
            {
             before(grammarAccess.getXpectFileRule()); 
            pushFollow(FOLLOW_1);
            ruleXpectFile();

            state._fsp--;

             after(grammarAccess.getXpectFileRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleXpectFile"


    // $ANTLR start "ruleXpectFile"
    // InternalXpectParser.g:76:1: ruleXpectFile : ( ( rule__XpectFile__Group__0 ) ) ;
    public final void ruleXpectFile() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXpectParser.g:80:2: ( ( ( rule__XpectFile__Group__0 ) ) )
            // InternalXpectParser.g:81:2: ( ( rule__XpectFile__Group__0 ) )
            {
            // InternalXpectParser.g:81:2: ( ( rule__XpectFile__Group__0 ) )
            // InternalXpectParser.g:82:3: ( rule__XpectFile__Group__0 )
            {
             before(grammarAccess.getXpectFileAccess().getGroup()); 
            // InternalXpectParser.g:83:3: ( rule__XpectFile__Group__0 )
            // InternalXpectParser.g:83:4: rule__XpectFile__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__XpectFile__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getXpectFileAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleXpectFile"


    // $ANTLR start "entryRuleMember"
    // InternalXpectParser.g:92:1: entryRuleMember : ruleMember EOF ;
    public final void entryRuleMember() throws RecognitionException {
        try {
            // InternalXpectParser.g:93:1: ( ruleMember EOF )
            // InternalXpectParser.g:94:1: ruleMember EOF
            {
             before(grammarAccess.getMemberRule()); 
            pushFollow(FOLLOW_1);
            ruleMember();

            state._fsp--;

             after(grammarAccess.getMemberRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleMember"


    // $ANTLR start "ruleMember"
    // InternalXpectParser.g:101:1: ruleMember : ( ( rule__Member__Alternatives ) ) ;
    public final void ruleMember() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXpectParser.g:105:2: ( ( ( rule__Member__Alternatives ) ) )
            // InternalXpectParser.g:106:2: ( ( rule__Member__Alternatives ) )
            {
            // InternalXpectParser.g:106:2: ( ( rule__Member__Alternatives ) )
            // InternalXpectParser.g:107:3: ( rule__Member__Alternatives )
            {
             before(grammarAccess.getMemberAccess().getAlternatives()); 
            // InternalXpectParser.g:108:3: ( rule__Member__Alternatives )
            // InternalXpectParser.g:108:4: rule__Member__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Member__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getMemberAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleMember"


    // $ANTLR start "entryRuleText"
    // InternalXpectParser.g:117:1: entryRuleText : ruleText EOF ;
    public final void entryRuleText() throws RecognitionException {
        try {
            // InternalXpectParser.g:118:1: ( ruleText EOF )
            // InternalXpectParser.g:119:1: ruleText EOF
            {
             before(grammarAccess.getTextRule()); 
            pushFollow(FOLLOW_1);
            ruleText();

            state._fsp--;

             after(grammarAccess.getTextRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleText"


    // $ANTLR start "ruleText"
    // InternalXpectParser.g:126:1: ruleText : ( ( rule__Text__TextAssignment ) ) ;
    public final void ruleText() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXpectParser.g:130:2: ( ( ( rule__Text__TextAssignment ) ) )
            // InternalXpectParser.g:131:2: ( ( rule__Text__TextAssignment ) )
            {
            // InternalXpectParser.g:131:2: ( ( rule__Text__TextAssignment ) )
            // InternalXpectParser.g:132:3: ( rule__Text__TextAssignment )
            {
             before(grammarAccess.getTextAccess().getTextAssignment()); 
            // InternalXpectParser.g:133:3: ( rule__Text__TextAssignment )
            // InternalXpectParser.g:133:4: rule__Text__TextAssignment
            {
            pushFollow(FOLLOW_2);
            rule__Text__TextAssignment();

            state._fsp--;


            }

             after(grammarAccess.getTextAccess().getTextAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleText"


    // $ANTLR start "entryRuleLexicalspace_Setup"
    // InternalXpectParser.g:142:1: entryRuleLexicalspace_Setup : ruleLexicalspace_Setup EOF ;
    public final void entryRuleLexicalspace_Setup() throws RecognitionException {
         
        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT");

        try {
            // InternalXpectParser.g:146:1: ( ruleLexicalspace_Setup EOF )
            // InternalXpectParser.g:147:1: ruleLexicalspace_Setup EOF
            {
             before(grammarAccess.getLexicalspace_SetupRule()); 
            pushFollow(FOLLOW_1);
            ruleLexicalspace_Setup();

            state._fsp--;

             after(grammarAccess.getLexicalspace_SetupRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	myHiddenTokenState.restore();

        }
        return ;
    }
    // $ANTLR end "entryRuleLexicalspace_Setup"


    // $ANTLR start "ruleLexicalspace_Setup"
    // InternalXpectParser.g:157:1: ruleLexicalspace_Setup : ( ( rule__Lexicalspace_Setup__Group__0 ) ) ;
    public final void ruleLexicalspace_Setup() throws RecognitionException {

        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT");
        		int stackSize = keepStackSize();
        	
        try {
            // InternalXpectParser.g:162:2: ( ( ( rule__Lexicalspace_Setup__Group__0 ) ) )
            // InternalXpectParser.g:163:2: ( ( rule__Lexicalspace_Setup__Group__0 ) )
            {
            // InternalXpectParser.g:163:2: ( ( rule__Lexicalspace_Setup__Group__0 ) )
            // InternalXpectParser.g:164:3: ( rule__Lexicalspace_Setup__Group__0 )
            {
             before(grammarAccess.getLexicalspace_SetupAccess().getGroup()); 
            // InternalXpectParser.g:165:3: ( rule__Lexicalspace_Setup__Group__0 )
            // InternalXpectParser.g:165:4: rule__Lexicalspace_Setup__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Lexicalspace_Setup__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getLexicalspace_SetupAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);
            	myHiddenTokenState.restore();

        }
        return ;
    }
    // $ANTLR end "ruleLexicalspace_Setup"


    // $ANTLR start "entryRuleAssignment"
    // InternalXpectParser.g:175:1: entryRuleAssignment : ruleAssignment EOF ;
    public final void entryRuleAssignment() throws RecognitionException {
        try {
            // InternalXpectParser.g:176:1: ( ruleAssignment EOF )
            // InternalXpectParser.g:177:1: ruleAssignment EOF
            {
             before(grammarAccess.getAssignmentRule()); 
            pushFollow(FOLLOW_1);
            ruleAssignment();

            state._fsp--;

             after(grammarAccess.getAssignmentRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleAssignment"


    // $ANTLR start "ruleAssignment"
    // InternalXpectParser.g:184:1: ruleAssignment : ( ( rule__Assignment__Alternatives ) ) ;
    public final void ruleAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXpectParser.g:188:2: ( ( ( rule__Assignment__Alternatives ) ) )
            // InternalXpectParser.g:189:2: ( ( rule__Assignment__Alternatives ) )
            {
            // InternalXpectParser.g:189:2: ( ( rule__Assignment__Alternatives ) )
            // InternalXpectParser.g:190:3: ( rule__Assignment__Alternatives )
            {
             before(grammarAccess.getAssignmentAccess().getAlternatives()); 
            // InternalXpectParser.g:191:3: ( rule__Assignment__Alternatives )
            // InternalXpectParser.g:191:4: rule__Assignment__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Assignment__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getAssignmentAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleAssignment"


    // $ANTLR start "entryRuleValue"
    // InternalXpectParser.g:200:1: entryRuleValue : ruleValue EOF ;
    public final void entryRuleValue() throws RecognitionException {
        try {
            // InternalXpectParser.g:201:1: ( ruleValue EOF )
            // InternalXpectParser.g:202:1: ruleValue EOF
            {
             before(grammarAccess.getValueRule()); 
            pushFollow(FOLLOW_1);
            ruleValue();

            state._fsp--;

             after(grammarAccess.getValueRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleValue"


    // $ANTLR start "ruleValue"
    // InternalXpectParser.g:209:1: ruleValue : ( ( rule__Value__Alternatives ) ) ;
    public final void ruleValue() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXpectParser.g:213:2: ( ( ( rule__Value__Alternatives ) ) )
            // InternalXpectParser.g:214:2: ( ( rule__Value__Alternatives ) )
            {
            // InternalXpectParser.g:214:2: ( ( rule__Value__Alternatives ) )
            // InternalXpectParser.g:215:3: ( rule__Value__Alternatives )
            {
             before(grammarAccess.getValueAccess().getAlternatives()); 
            // InternalXpectParser.g:216:3: ( rule__Value__Alternatives )
            // InternalXpectParser.g:216:4: rule__Value__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Value__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getValueAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleValue"


    // $ANTLR start "entryRuleComponentLong"
    // InternalXpectParser.g:225:1: entryRuleComponentLong : ruleComponentLong EOF ;
    public final void entryRuleComponentLong() throws RecognitionException {
        try {
            // InternalXpectParser.g:226:1: ( ruleComponentLong EOF )
            // InternalXpectParser.g:227:1: ruleComponentLong EOF
            {
             before(grammarAccess.getComponentLongRule()); 
            pushFollow(FOLLOW_1);
            ruleComponentLong();

            state._fsp--;

             after(grammarAccess.getComponentLongRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleComponentLong"


    // $ANTLR start "ruleComponentLong"
    // InternalXpectParser.g:234:1: ruleComponentLong : ( ( rule__ComponentLong__Group__0 ) ) ;
    public final void ruleComponentLong() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXpectParser.g:238:2: ( ( ( rule__ComponentLong__Group__0 ) ) )
            // InternalXpectParser.g:239:2: ( ( rule__ComponentLong__Group__0 ) )
            {
            // InternalXpectParser.g:239:2: ( ( rule__ComponentLong__Group__0 ) )
            // InternalXpectParser.g:240:3: ( rule__ComponentLong__Group__0 )
            {
             before(grammarAccess.getComponentLongAccess().getGroup()); 
            // InternalXpectParser.g:241:3: ( rule__ComponentLong__Group__0 )
            // InternalXpectParser.g:241:4: rule__ComponentLong__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ComponentLong__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getComponentLongAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleComponentLong"


    // $ANTLR start "entryRuleComponentInline"
    // InternalXpectParser.g:250:1: entryRuleComponentInline : ruleComponentInline EOF ;
    public final void entryRuleComponentInline() throws RecognitionException {
        try {
            // InternalXpectParser.g:251:1: ( ruleComponentInline EOF )
            // InternalXpectParser.g:252:1: ruleComponentInline EOF
            {
             before(grammarAccess.getComponentInlineRule()); 
            pushFollow(FOLLOW_1);
            ruleComponentInline();

            state._fsp--;

             after(grammarAccess.getComponentInlineRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleComponentInline"


    // $ANTLR start "ruleComponentInline"
    // InternalXpectParser.g:259:1: ruleComponentInline : ( ( rule__ComponentInline__Group__0 ) ) ;
    public final void ruleComponentInline() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXpectParser.g:263:2: ( ( ( rule__ComponentInline__Group__0 ) ) )
            // InternalXpectParser.g:264:2: ( ( rule__ComponentInline__Group__0 ) )
            {
            // InternalXpectParser.g:264:2: ( ( rule__ComponentInline__Group__0 ) )
            // InternalXpectParser.g:265:3: ( rule__ComponentInline__Group__0 )
            {
             before(grammarAccess.getComponentInlineAccess().getGroup()); 
            // InternalXpectParser.g:266:3: ( rule__ComponentInline__Group__0 )
            // InternalXpectParser.g:266:4: rule__ComponentInline__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ComponentInline__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getComponentInlineAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleComponentInline"


    // $ANTLR start "entryRuleLiteral"
    // InternalXpectParser.g:275:1: entryRuleLiteral : ruleLiteral EOF ;
    public final void entryRuleLiteral() throws RecognitionException {
        try {
            // InternalXpectParser.g:276:1: ( ruleLiteral EOF )
            // InternalXpectParser.g:277:1: ruleLiteral EOF
            {
             before(grammarAccess.getLiteralRule()); 
            pushFollow(FOLLOW_1);
            ruleLiteral();

            state._fsp--;

             after(grammarAccess.getLiteralRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleLiteral"


    // $ANTLR start "ruleLiteral"
    // InternalXpectParser.g:284:1: ruleLiteral : ( ( rule__Literal__Alternatives ) ) ;
    public final void ruleLiteral() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXpectParser.g:288:2: ( ( ( rule__Literal__Alternatives ) ) )
            // InternalXpectParser.g:289:2: ( ( rule__Literal__Alternatives ) )
            {
            // InternalXpectParser.g:289:2: ( ( rule__Literal__Alternatives ) )
            // InternalXpectParser.g:290:3: ( rule__Literal__Alternatives )
            {
             before(grammarAccess.getLiteralAccess().getAlternatives()); 
            // InternalXpectParser.g:291:3: ( rule__Literal__Alternatives )
            // InternalXpectParser.g:291:4: rule__Literal__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Literal__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getLiteralAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleLiteral"


    // $ANTLR start "entryRuleClassLiteral"
    // InternalXpectParser.g:300:1: entryRuleClassLiteral : ruleClassLiteral EOF ;
    public final void entryRuleClassLiteral() throws RecognitionException {
        try {
            // InternalXpectParser.g:301:1: ( ruleClassLiteral EOF )
            // InternalXpectParser.g:302:1: ruleClassLiteral EOF
            {
             before(grammarAccess.getClassLiteralRule()); 
            pushFollow(FOLLOW_1);
            ruleClassLiteral();

            state._fsp--;

             after(grammarAccess.getClassLiteralRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleClassLiteral"


    // $ANTLR start "ruleClassLiteral"
    // InternalXpectParser.g:309:1: ruleClassLiteral : ( ( rule__ClassLiteral__Group__0 ) ) ;
    public final void ruleClassLiteral() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXpectParser.g:313:2: ( ( ( rule__ClassLiteral__Group__0 ) ) )
            // InternalXpectParser.g:314:2: ( ( rule__ClassLiteral__Group__0 ) )
            {
            // InternalXpectParser.g:314:2: ( ( rule__ClassLiteral__Group__0 ) )
            // InternalXpectParser.g:315:3: ( rule__ClassLiteral__Group__0 )
            {
             before(grammarAccess.getClassLiteralAccess().getGroup()); 
            // InternalXpectParser.g:316:3: ( rule__ClassLiteral__Group__0 )
            // InternalXpectParser.g:316:4: rule__ClassLiteral__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ClassLiteral__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getClassLiteralAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleClassLiteral"


    // $ANTLR start "entryRuleXpectIgnore"
    // InternalXpectParser.g:325:1: entryRuleXpectIgnore : ruleXpectIgnore EOF ;
    public final void entryRuleXpectIgnore() throws RecognitionException {
        try {
            // InternalXpectParser.g:326:1: ( ruleXpectIgnore EOF )
            // InternalXpectParser.g:327:1: ruleXpectIgnore EOF
            {
             before(grammarAccess.getXpectIgnoreRule()); 
            pushFollow(FOLLOW_1);
            ruleXpectIgnore();

            state._fsp--;

             after(grammarAccess.getXpectIgnoreRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleXpectIgnore"


    // $ANTLR start "ruleXpectIgnore"
    // InternalXpectParser.g:334:1: ruleXpectIgnore : ( ( rule__XpectIgnore__Group__0 ) ) ;
    public final void ruleXpectIgnore() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXpectParser.g:338:2: ( ( ( rule__XpectIgnore__Group__0 ) ) )
            // InternalXpectParser.g:339:2: ( ( rule__XpectIgnore__Group__0 ) )
            {
            // InternalXpectParser.g:339:2: ( ( rule__XpectIgnore__Group__0 ) )
            // InternalXpectParser.g:340:3: ( rule__XpectIgnore__Group__0 )
            {
             before(grammarAccess.getXpectIgnoreAccess().getGroup()); 
            // InternalXpectParser.g:341:3: ( rule__XpectIgnore__Group__0 )
            // InternalXpectParser.g:341:4: rule__XpectIgnore__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__XpectIgnore__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getXpectIgnoreAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleXpectIgnore"


    // $ANTLR start "entryRuleLexicalspace_Invocation"
    // InternalXpectParser.g:350:1: entryRuleLexicalspace_Invocation : ruleLexicalspace_Invocation EOF ;
    public final void entryRuleLexicalspace_Invocation() throws RecognitionException {
         
        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT");

        try {
            // InternalXpectParser.g:354:1: ( ruleLexicalspace_Invocation EOF )
            // InternalXpectParser.g:355:1: ruleLexicalspace_Invocation EOF
            {
             before(grammarAccess.getLexicalspace_InvocationRule()); 
            pushFollow(FOLLOW_1);
            ruleLexicalspace_Invocation();

            state._fsp--;

             after(grammarAccess.getLexicalspace_InvocationRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	myHiddenTokenState.restore();

        }
        return ;
    }
    // $ANTLR end "entryRuleLexicalspace_Invocation"


    // $ANTLR start "ruleLexicalspace_Invocation"
    // InternalXpectParser.g:365:1: ruleLexicalspace_Invocation : ( ( rule__Lexicalspace_Invocation__Group__0 ) ) ;
    public final void ruleLexicalspace_Invocation() throws RecognitionException {

        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT");
        		int stackSize = keepStackSize();
        	
        try {
            // InternalXpectParser.g:370:2: ( ( ( rule__Lexicalspace_Invocation__Group__0 ) ) )
            // InternalXpectParser.g:371:2: ( ( rule__Lexicalspace_Invocation__Group__0 ) )
            {
            // InternalXpectParser.g:371:2: ( ( rule__Lexicalspace_Invocation__Group__0 ) )
            // InternalXpectParser.g:372:3: ( rule__Lexicalspace_Invocation__Group__0 )
            {
             before(grammarAccess.getLexicalspace_InvocationAccess().getGroup()); 
            // InternalXpectParser.g:373:3: ( rule__Lexicalspace_Invocation__Group__0 )
            // InternalXpectParser.g:373:4: rule__Lexicalspace_Invocation__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Lexicalspace_Invocation__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getLexicalspace_InvocationAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);
            	myHiddenTokenState.restore();

        }
        return ;
    }
    // $ANTLR end "ruleLexicalspace_Invocation"


    // $ANTLR start "entryRuleAnyText"
    // InternalXpectParser.g:383:1: entryRuleAnyText : ruleAnyText EOF ;
    public final void entryRuleAnyText() throws RecognitionException {
        try {
            // InternalXpectParser.g:384:1: ( ruleAnyText EOF )
            // InternalXpectParser.g:385:1: ruleAnyText EOF
            {
             before(grammarAccess.getAnyTextRule()); 
            pushFollow(FOLLOW_1);
            ruleAnyText();

            state._fsp--;

             after(grammarAccess.getAnyTextRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleAnyText"


    // $ANTLR start "ruleAnyText"
    // InternalXpectParser.g:392:1: ruleAnyText : ( ( ( RULE_ANY_OTHER ) ) ( ( RULE_ANY_OTHER )* ) ) ;
    public final void ruleAnyText() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXpectParser.g:396:2: ( ( ( ( RULE_ANY_OTHER ) ) ( ( RULE_ANY_OTHER )* ) ) )
            // InternalXpectParser.g:397:2: ( ( ( RULE_ANY_OTHER ) ) ( ( RULE_ANY_OTHER )* ) )
            {
            // InternalXpectParser.g:397:2: ( ( ( RULE_ANY_OTHER ) ) ( ( RULE_ANY_OTHER )* ) )
            // InternalXpectParser.g:398:3: ( ( RULE_ANY_OTHER ) ) ( ( RULE_ANY_OTHER )* )
            {
            // InternalXpectParser.g:398:3: ( ( RULE_ANY_OTHER ) )
            // InternalXpectParser.g:399:4: ( RULE_ANY_OTHER )
            {
             before(grammarAccess.getAnyTextAccess().getANY_OTHERTerminalRuleCall()); 
            // InternalXpectParser.g:400:4: ( RULE_ANY_OTHER )
            // InternalXpectParser.g:400:5: RULE_ANY_OTHER
            {
            match(input,RULE_ANY_OTHER,FOLLOW_3); 

            }

             after(grammarAccess.getAnyTextAccess().getANY_OTHERTerminalRuleCall()); 

            }

            // InternalXpectParser.g:403:3: ( ( RULE_ANY_OTHER )* )
            // InternalXpectParser.g:404:4: ( RULE_ANY_OTHER )*
            {
             before(grammarAccess.getAnyTextAccess().getANY_OTHERTerminalRuleCall()); 
            // InternalXpectParser.g:405:4: ( RULE_ANY_OTHER )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==RULE_ANY_OTHER) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalXpectParser.g:405:5: RULE_ANY_OTHER
            	    {
            	    match(input,RULE_ANY_OTHER,FOLLOW_3); 

            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

             after(grammarAccess.getAnyTextAccess().getANY_OTHERTerminalRuleCall()); 

            }


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleAnyText"


    // $ANTLR start "entryRuleQualifiedName"
    // InternalXpectParser.g:415:1: entryRuleQualifiedName : ruleQualifiedName EOF ;
    public final void entryRuleQualifiedName() throws RecognitionException {
        try {
            // InternalXpectParser.g:416:1: ( ruleQualifiedName EOF )
            // InternalXpectParser.g:417:1: ruleQualifiedName EOF
            {
             before(grammarAccess.getQualifiedNameRule()); 
            pushFollow(FOLLOW_1);
            ruleQualifiedName();

            state._fsp--;

             after(grammarAccess.getQualifiedNameRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleQualifiedName"


    // $ANTLR start "ruleQualifiedName"
    // InternalXpectParser.g:424:1: ruleQualifiedName : ( ( rule__QualifiedName__Group__0 ) ) ;
    public final void ruleQualifiedName() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXpectParser.g:428:2: ( ( ( rule__QualifiedName__Group__0 ) ) )
            // InternalXpectParser.g:429:2: ( ( rule__QualifiedName__Group__0 ) )
            {
            // InternalXpectParser.g:429:2: ( ( rule__QualifiedName__Group__0 ) )
            // InternalXpectParser.g:430:3: ( rule__QualifiedName__Group__0 )
            {
             before(grammarAccess.getQualifiedNameAccess().getGroup()); 
            // InternalXpectParser.g:431:3: ( rule__QualifiedName__Group__0 )
            // InternalXpectParser.g:431:4: rule__QualifiedName__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__QualifiedName__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getQualifiedNameAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleQualifiedName"


    // $ANTLR start "rule__Member__Alternatives"
    // InternalXpectParser.g:439:1: rule__Member__Alternatives : ( ( ruleLexicalspace_Setup ) | ( ruleLexicalspace_Invocation ) | ( ruleXpectIgnore ) );
    public final void rule__Member__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXpectParser.g:443:1: ( ( ruleLexicalspace_Setup ) | ( ruleLexicalspace_Invocation ) | ( ruleXpectIgnore ) )
            int alt2=3;
            switch ( input.LA(1) ) {
            case XPECT_SETUP:
                {
                alt2=1;
                }
                break;
            case XPECT:
                {
                alt2=2;
                }
                break;
            case XPECT_IGNORE:
                {
                alt2=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }

            switch (alt2) {
                case 1 :
                    // InternalXpectParser.g:444:2: ( ruleLexicalspace_Setup )
                    {
                    // InternalXpectParser.g:444:2: ( ruleLexicalspace_Setup )
                    // InternalXpectParser.g:445:3: ruleLexicalspace_Setup
                    {
                     before(grammarAccess.getMemberAccess().getLexicalspace_SetupParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleLexicalspace_Setup();

                    state._fsp--;

                     after(grammarAccess.getMemberAccess().getLexicalspace_SetupParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalXpectParser.g:450:2: ( ruleLexicalspace_Invocation )
                    {
                    // InternalXpectParser.g:450:2: ( ruleLexicalspace_Invocation )
                    // InternalXpectParser.g:451:3: ruleLexicalspace_Invocation
                    {
                     before(grammarAccess.getMemberAccess().getLexicalspace_InvocationParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleLexicalspace_Invocation();

                    state._fsp--;

                     after(grammarAccess.getMemberAccess().getLexicalspace_InvocationParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalXpectParser.g:456:2: ( ruleXpectIgnore )
                    {
                    // InternalXpectParser.g:456:2: ( ruleXpectIgnore )
                    // InternalXpectParser.g:457:3: ruleXpectIgnore
                    {
                     before(grammarAccess.getMemberAccess().getXpectIgnoreParserRuleCall_2()); 
                    pushFollow(FOLLOW_2);
                    ruleXpectIgnore();

                    state._fsp--;

                     after(grammarAccess.getMemberAccess().getXpectIgnoreParserRuleCall_2()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Member__Alternatives"


    // $ANTLR start "rule__Assignment__Alternatives"
    // InternalXpectParser.g:466:1: rule__Assignment__Alternatives : ( ( ( rule__Assignment__Group_0__0 ) ) | ( ( rule__Assignment__ValueAssignment_1 ) ) );
    public final void rule__Assignment__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXpectParser.g:470:1: ( ( ( rule__Assignment__Group_0__0 ) ) | ( ( rule__Assignment__ValueAssignment_1 ) ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==RULE_ID) ) {
                int LA3_1 = input.LA(2);

                if ( ((LA3_1>=False && LA3_1<=True)||LA3_1==FullStop||LA3_1==LeftCurlyBracket||(LA3_1>=RULE_INT && LA3_1<=RULE_STRING)) ) {
                    alt3=2;
                }
                else if ( (LA3_1==EqualsSign) ) {
                    alt3=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 3, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // InternalXpectParser.g:471:2: ( ( rule__Assignment__Group_0__0 ) )
                    {
                    // InternalXpectParser.g:471:2: ( ( rule__Assignment__Group_0__0 ) )
                    // InternalXpectParser.g:472:3: ( rule__Assignment__Group_0__0 )
                    {
                     before(grammarAccess.getAssignmentAccess().getGroup_0()); 
                    // InternalXpectParser.g:473:3: ( rule__Assignment__Group_0__0 )
                    // InternalXpectParser.g:473:4: rule__Assignment__Group_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Assignment__Group_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getAssignmentAccess().getGroup_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalXpectParser.g:477:2: ( ( rule__Assignment__ValueAssignment_1 ) )
                    {
                    // InternalXpectParser.g:477:2: ( ( rule__Assignment__ValueAssignment_1 ) )
                    // InternalXpectParser.g:478:3: ( rule__Assignment__ValueAssignment_1 )
                    {
                     before(grammarAccess.getAssignmentAccess().getValueAssignment_1()); 
                    // InternalXpectParser.g:479:3: ( rule__Assignment__ValueAssignment_1 )
                    // InternalXpectParser.g:479:4: rule__Assignment__ValueAssignment_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__Assignment__ValueAssignment_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getAssignmentAccess().getValueAssignment_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Assignment__Alternatives"


    // $ANTLR start "rule__Value__Alternatives"
    // InternalXpectParser.g:487:1: rule__Value__Alternatives : ( ( ruleLiteral ) | ( ruleClassLiteral ) | ( ruleComponentInline ) );
    public final void rule__Value__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXpectParser.g:491:1: ( ( ruleLiteral ) | ( ruleClassLiteral ) | ( ruleComponentInline ) )
            int alt4=3;
            alt4 = dfa4.predict(input);
            switch (alt4) {
                case 1 :
                    // InternalXpectParser.g:492:2: ( ruleLiteral )
                    {
                    // InternalXpectParser.g:492:2: ( ruleLiteral )
                    // InternalXpectParser.g:493:3: ruleLiteral
                    {
                     before(grammarAccess.getValueAccess().getLiteralParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleLiteral();

                    state._fsp--;

                     after(grammarAccess.getValueAccess().getLiteralParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalXpectParser.g:498:2: ( ruleClassLiteral )
                    {
                    // InternalXpectParser.g:498:2: ( ruleClassLiteral )
                    // InternalXpectParser.g:499:3: ruleClassLiteral
                    {
                     before(grammarAccess.getValueAccess().getClassLiteralParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleClassLiteral();

                    state._fsp--;

                     after(grammarAccess.getValueAccess().getClassLiteralParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalXpectParser.g:504:2: ( ruleComponentInline )
                    {
                    // InternalXpectParser.g:504:2: ( ruleComponentInline )
                    // InternalXpectParser.g:505:3: ruleComponentInline
                    {
                     before(grammarAccess.getValueAccess().getComponentInlineParserRuleCall_2()); 
                    pushFollow(FOLLOW_2);
                    ruleComponentInline();

                    state._fsp--;

                     after(grammarAccess.getValueAccess().getComponentInlineParserRuleCall_2()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Value__Alternatives"


    // $ANTLR start "rule__Literal__Alternatives"
    // InternalXpectParser.g:514:1: rule__Literal__Alternatives : ( ( ( rule__Literal__Group_0__0 ) ) | ( ( rule__Literal__Group_1__0 ) ) | ( ( rule__Literal__Group_2__0 ) ) );
    public final void rule__Literal__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXpectParser.g:518:1: ( ( ( rule__Literal__Group_0__0 ) ) | ( ( rule__Literal__Group_1__0 ) ) | ( ( rule__Literal__Group_2__0 ) ) )
            int alt5=3;
            switch ( input.LA(1) ) {
            case False:
            case True:
                {
                alt5=1;
                }
                break;
            case RULE_INT:
                {
                alt5=2;
                }
                break;
            case RULE_STRING:
                {
                alt5=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }

            switch (alt5) {
                case 1 :
                    // InternalXpectParser.g:519:2: ( ( rule__Literal__Group_0__0 ) )
                    {
                    // InternalXpectParser.g:519:2: ( ( rule__Literal__Group_0__0 ) )
                    // InternalXpectParser.g:520:3: ( rule__Literal__Group_0__0 )
                    {
                     before(grammarAccess.getLiteralAccess().getGroup_0()); 
                    // InternalXpectParser.g:521:3: ( rule__Literal__Group_0__0 )
                    // InternalXpectParser.g:521:4: rule__Literal__Group_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Literal__Group_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getLiteralAccess().getGroup_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalXpectParser.g:525:2: ( ( rule__Literal__Group_1__0 ) )
                    {
                    // InternalXpectParser.g:525:2: ( ( rule__Literal__Group_1__0 ) )
                    // InternalXpectParser.g:526:3: ( rule__Literal__Group_1__0 )
                    {
                     before(grammarAccess.getLiteralAccess().getGroup_1()); 
                    // InternalXpectParser.g:527:3: ( rule__Literal__Group_1__0 )
                    // InternalXpectParser.g:527:4: rule__Literal__Group_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Literal__Group_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getLiteralAccess().getGroup_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalXpectParser.g:531:2: ( ( rule__Literal__Group_2__0 ) )
                    {
                    // InternalXpectParser.g:531:2: ( ( rule__Literal__Group_2__0 ) )
                    // InternalXpectParser.g:532:3: ( rule__Literal__Group_2__0 )
                    {
                     before(grammarAccess.getLiteralAccess().getGroup_2()); 
                    // InternalXpectParser.g:533:3: ( rule__Literal__Group_2__0 )
                    // InternalXpectParser.g:533:4: rule__Literal__Group_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Literal__Group_2__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getLiteralAccess().getGroup_2()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Literal__Alternatives"


    // $ANTLR start "rule__Literal__Alternatives_0_1"
    // InternalXpectParser.g:541:1: rule__Literal__Alternatives_0_1 : ( ( ( rule__Literal__ValueAssignment_0_1_0 ) ) | ( False ) );
    public final void rule__Literal__Alternatives_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXpectParser.g:545:1: ( ( ( rule__Literal__ValueAssignment_0_1_0 ) ) | ( False ) )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==True) ) {
                alt6=1;
            }
            else if ( (LA6_0==False) ) {
                alt6=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // InternalXpectParser.g:546:2: ( ( rule__Literal__ValueAssignment_0_1_0 ) )
                    {
                    // InternalXpectParser.g:546:2: ( ( rule__Literal__ValueAssignment_0_1_0 ) )
                    // InternalXpectParser.g:547:3: ( rule__Literal__ValueAssignment_0_1_0 )
                    {
                     before(grammarAccess.getLiteralAccess().getValueAssignment_0_1_0()); 
                    // InternalXpectParser.g:548:3: ( rule__Literal__ValueAssignment_0_1_0 )
                    // InternalXpectParser.g:548:4: rule__Literal__ValueAssignment_0_1_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Literal__ValueAssignment_0_1_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getLiteralAccess().getValueAssignment_0_1_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalXpectParser.g:552:2: ( False )
                    {
                    // InternalXpectParser.g:552:2: ( False )
                    // InternalXpectParser.g:553:3: False
                    {
                     before(grammarAccess.getLiteralAccess().getFalseKeyword_0_1_1()); 
                    match(input,False,FOLLOW_2); 
                     after(grammarAccess.getLiteralAccess().getFalseKeyword_0_1_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Literal__Alternatives_0_1"


    // $ANTLR start "rule__XpectFile__Group__0"
    // InternalXpectParser.g:562:1: rule__XpectFile__Group__0 : rule__XpectFile__Group__0__Impl rule__XpectFile__Group__1 ;
    public final void rule__XpectFile__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXpectParser.g:566:1: ( rule__XpectFile__Group__0__Impl rule__XpectFile__Group__1 )
            // InternalXpectParser.g:567:2: rule__XpectFile__Group__0__Impl rule__XpectFile__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__XpectFile__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__XpectFile__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XpectFile__Group__0"


    // $ANTLR start "rule__XpectFile__Group__0__Impl"
    // InternalXpectParser.g:574:1: rule__XpectFile__Group__0__Impl : ( () ) ;
    public final void rule__XpectFile__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXpectParser.g:578:1: ( ( () ) )
            // InternalXpectParser.g:579:1: ( () )
            {
            // InternalXpectParser.g:579:1: ( () )
            // InternalXpectParser.g:580:2: ()
            {
             before(grammarAccess.getXpectFileAccess().getXpectFileAction_0()); 
            // InternalXpectParser.g:581:2: ()
            // InternalXpectParser.g:581:3: 
            {
            }

             after(grammarAccess.getXpectFileAccess().getXpectFileAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XpectFile__Group__0__Impl"


    // $ANTLR start "rule__XpectFile__Group__1"
    // InternalXpectParser.g:589:1: rule__XpectFile__Group__1 : rule__XpectFile__Group__1__Impl ;
    public final void rule__XpectFile__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXpectParser.g:593:1: ( rule__XpectFile__Group__1__Impl )
            // InternalXpectParser.g:594:2: rule__XpectFile__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__XpectFile__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XpectFile__Group__1"


    // $ANTLR start "rule__XpectFile__Group__1__Impl"
    // InternalXpectParser.g:600:1: rule__XpectFile__Group__1__Impl : ( ( rule__XpectFile__Group_1__0 )? ) ;
    public final void rule__XpectFile__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXpectParser.g:604:1: ( ( ( rule__XpectFile__Group_1__0 )? ) )
            // InternalXpectParser.g:605:1: ( ( rule__XpectFile__Group_1__0 )? )
            {
            // InternalXpectParser.g:605:1: ( ( rule__XpectFile__Group_1__0 )? )
            // InternalXpectParser.g:606:2: ( rule__XpectFile__Group_1__0 )?
            {
             before(grammarAccess.getXpectFileAccess().getGroup_1()); 
            // InternalXpectParser.g:607:2: ( rule__XpectFile__Group_1__0 )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==RULE_ANY_OTHER) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalXpectParser.g:607:3: rule__XpectFile__Group_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__XpectFile__Group_1__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getXpectFileAccess().getGroup_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XpectFile__Group__1__Impl"


    // $ANTLR start "rule__XpectFile__Group_1__0"
    // InternalXpectParser.g:616:1: rule__XpectFile__Group_1__0 : rule__XpectFile__Group_1__0__Impl rule__XpectFile__Group_1__1 ;
    public final void rule__XpectFile__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXpectParser.g:620:1: ( rule__XpectFile__Group_1__0__Impl rule__XpectFile__Group_1__1 )
            // InternalXpectParser.g:621:2: rule__XpectFile__Group_1__0__Impl rule__XpectFile__Group_1__1
            {
            pushFollow(FOLLOW_4);
            rule__XpectFile__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__XpectFile__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XpectFile__Group_1__0"


    // $ANTLR start "rule__XpectFile__Group_1__0__Impl"
    // InternalXpectParser.g:628:1: rule__XpectFile__Group_1__0__Impl : ( ( rule__XpectFile__Group_1_0__0 )* ) ;
    public final void rule__XpectFile__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXpectParser.g:632:1: ( ( ( rule__XpectFile__Group_1_0__0 )* ) )
            // InternalXpectParser.g:633:1: ( ( rule__XpectFile__Group_1_0__0 )* )
            {
            // InternalXpectParser.g:633:1: ( ( rule__XpectFile__Group_1_0__0 )* )
            // InternalXpectParser.g:634:2: ( rule__XpectFile__Group_1_0__0 )*
            {
             before(grammarAccess.getXpectFileAccess().getGroup_1_0()); 
            // InternalXpectParser.g:635:2: ( rule__XpectFile__Group_1_0__0 )*
            loop8:
            do {
                int alt8=2;
                alt8 = dfa8.predict(input);
                switch (alt8) {
            	case 1 :
            	    // InternalXpectParser.g:635:3: rule__XpectFile__Group_1_0__0
            	    {
            	    pushFollow(FOLLOW_3);
            	    rule__XpectFile__Group_1_0__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

             after(grammarAccess.getXpectFileAccess().getGroup_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XpectFile__Group_1__0__Impl"


    // $ANTLR start "rule__XpectFile__Group_1__1"
    // InternalXpectParser.g:643:1: rule__XpectFile__Group_1__1 : rule__XpectFile__Group_1__1__Impl ;
    public final void rule__XpectFile__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXpectParser.g:647:1: ( rule__XpectFile__Group_1__1__Impl )
            // InternalXpectParser.g:648:2: rule__XpectFile__Group_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__XpectFile__Group_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XpectFile__Group_1__1"


    // $ANTLR start "rule__XpectFile__Group_1__1__Impl"
    // InternalXpectParser.g:654:1: rule__XpectFile__Group_1__1__Impl : ( ( rule__XpectFile__MembersAssignment_1_1 ) ) ;
    public final void rule__XpectFile__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXpectParser.g:658:1: ( ( ( rule__XpectFile__MembersAssignment_1_1 ) ) )
            // InternalXpectParser.g:659:1: ( ( rule__XpectFile__MembersAssignment_1_1 ) )
            {
            // InternalXpectParser.g:659:1: ( ( rule__XpectFile__MembersAssignment_1_1 ) )
            // InternalXpectParser.g:660:2: ( rule__XpectFile__MembersAssignment_1_1 )
            {
             before(grammarAccess.getXpectFileAccess().getMembersAssignment_1_1()); 
            // InternalXpectParser.g:661:2: ( rule__XpectFile__MembersAssignment_1_1 )
            // InternalXpectParser.g:661:3: rule__XpectFile__MembersAssignment_1_1
            {
            pushFollow(FOLLOW_2);
            rule__XpectFile__MembersAssignment_1_1();

            state._fsp--;


            }

             after(grammarAccess.getXpectFileAccess().getMembersAssignment_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XpectFile__Group_1__1__Impl"


    // $ANTLR start "rule__XpectFile__Group_1_0__0"
    // InternalXpectParser.g:670:1: rule__XpectFile__Group_1_0__0 : rule__XpectFile__Group_1_0__0__Impl rule__XpectFile__Group_1_0__1 ;
    public final void rule__XpectFile__Group_1_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXpectParser.g:674:1: ( rule__XpectFile__Group_1_0__0__Impl rule__XpectFile__Group_1_0__1 )
            // InternalXpectParser.g:675:2: rule__XpectFile__Group_1_0__0__Impl rule__XpectFile__Group_1_0__1
            {
            pushFollow(FOLLOW_5);
            rule__XpectFile__Group_1_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__XpectFile__Group_1_0__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XpectFile__Group_1_0__0"


    // $ANTLR start "rule__XpectFile__Group_1_0__0__Impl"
    // InternalXpectParser.g:682:1: rule__XpectFile__Group_1_0__0__Impl : ( ( rule__XpectFile__MembersAssignment_1_0_0 ) ) ;
    public final void rule__XpectFile__Group_1_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXpectParser.g:686:1: ( ( ( rule__XpectFile__MembersAssignment_1_0_0 ) ) )
            // InternalXpectParser.g:687:1: ( ( rule__XpectFile__MembersAssignment_1_0_0 ) )
            {
            // InternalXpectParser.g:687:1: ( ( rule__XpectFile__MembersAssignment_1_0_0 ) )
            // InternalXpectParser.g:688:2: ( rule__XpectFile__MembersAssignment_1_0_0 )
            {
             before(grammarAccess.getXpectFileAccess().getMembersAssignment_1_0_0()); 
            // InternalXpectParser.g:689:2: ( rule__XpectFile__MembersAssignment_1_0_0 )
            // InternalXpectParser.g:689:3: rule__XpectFile__MembersAssignment_1_0_0
            {
            pushFollow(FOLLOW_2);
            rule__XpectFile__MembersAssignment_1_0_0();

            state._fsp--;


            }

             after(grammarAccess.getXpectFileAccess().getMembersAssignment_1_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XpectFile__Group_1_0__0__Impl"


    // $ANTLR start "rule__XpectFile__Group_1_0__1"
    // InternalXpectParser.g:697:1: rule__XpectFile__Group_1_0__1 : rule__XpectFile__Group_1_0__1__Impl ;
    public final void rule__XpectFile__Group_1_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXpectParser.g:701:1: ( rule__XpectFile__Group_1_0__1__Impl )
            // InternalXpectParser.g:702:2: rule__XpectFile__Group_1_0__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__XpectFile__Group_1_0__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XpectFile__Group_1_0__1"


    // $ANTLR start "rule__XpectFile__Group_1_0__1__Impl"
    // InternalXpectParser.g:708:1: rule__XpectFile__Group_1_0__1__Impl : ( ( rule__XpectFile__MembersAssignment_1_0_1 ) ) ;
    public final void rule__XpectFile__Group_1_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXpectParser.g:712:1: ( ( ( rule__XpectFile__MembersAssignment_1_0_1 ) ) )
            // InternalXpectParser.g:713:1: ( ( rule__XpectFile__MembersAssignment_1_0_1 ) )
            {
            // InternalXpectParser.g:713:1: ( ( rule__XpectFile__MembersAssignment_1_0_1 ) )
            // InternalXpectParser.g:714:2: ( rule__XpectFile__MembersAssignment_1_0_1 )
            {
             before(grammarAccess.getXpectFileAccess().getMembersAssignment_1_0_1()); 
            // InternalXpectParser.g:715:2: ( rule__XpectFile__MembersAssignment_1_0_1 )
            // InternalXpectParser.g:715:3: rule__XpectFile__MembersAssignment_1_0_1
            {
            pushFollow(FOLLOW_2);
            rule__XpectFile__MembersAssignment_1_0_1();

            state._fsp--;


            }

             after(grammarAccess.getXpectFileAccess().getMembersAssignment_1_0_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XpectFile__Group_1_0__1__Impl"


    // $ANTLR start "rule__Lexicalspace_Setup__Group__0"
    // InternalXpectParser.g:724:1: rule__Lexicalspace_Setup__Group__0 : rule__Lexicalspace_Setup__Group__0__Impl rule__Lexicalspace_Setup__Group__1 ;
    public final void rule__Lexicalspace_Setup__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXpectParser.g:728:1: ( rule__Lexicalspace_Setup__Group__0__Impl rule__Lexicalspace_Setup__Group__1 )
            // InternalXpectParser.g:729:2: rule__Lexicalspace_Setup__Group__0__Impl rule__Lexicalspace_Setup__Group__1
            {
            pushFollow(FOLLOW_6);
            rule__Lexicalspace_Setup__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Lexicalspace_Setup__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Lexicalspace_Setup__Group__0"


    // $ANTLR start "rule__Lexicalspace_Setup__Group__0__Impl"
    // InternalXpectParser.g:736:1: rule__Lexicalspace_Setup__Group__0__Impl : ( () ) ;
    public final void rule__Lexicalspace_Setup__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXpectParser.g:740:1: ( ( () ) )
            // InternalXpectParser.g:741:1: ( () )
            {
            // InternalXpectParser.g:741:1: ( () )
            // InternalXpectParser.g:742:2: ()
            {
             before(grammarAccess.getLexicalspace_SetupAccess().getXpectTestAction_0()); 
            // InternalXpectParser.g:743:2: ()
            // InternalXpectParser.g:743:3: 
            {
            }

             after(grammarAccess.getLexicalspace_SetupAccess().getXpectTestAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Lexicalspace_Setup__Group__0__Impl"


    // $ANTLR start "rule__Lexicalspace_Setup__Group__1"
    // InternalXpectParser.g:751:1: rule__Lexicalspace_Setup__Group__1 : rule__Lexicalspace_Setup__Group__1__Impl rule__Lexicalspace_Setup__Group__2 ;
    public final void rule__Lexicalspace_Setup__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXpectParser.g:755:1: ( rule__Lexicalspace_Setup__Group__1__Impl rule__Lexicalspace_Setup__Group__2 )
            // InternalXpectParser.g:756:2: rule__Lexicalspace_Setup__Group__1__Impl rule__Lexicalspace_Setup__Group__2
            {
            pushFollow(FOLLOW_7);
            rule__Lexicalspace_Setup__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Lexicalspace_Setup__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Lexicalspace_Setup__Group__1"


    // $ANTLR start "rule__Lexicalspace_Setup__Group__1__Impl"
    // InternalXpectParser.g:763:1: rule__Lexicalspace_Setup__Group__1__Impl : ( XPECT_SETUP ) ;
    public final void rule__Lexicalspace_Setup__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXpectParser.g:767:1: ( ( XPECT_SETUP ) )
            // InternalXpectParser.g:768:1: ( XPECT_SETUP )
            {
            // InternalXpectParser.g:768:1: ( XPECT_SETUP )
            // InternalXpectParser.g:769:2: XPECT_SETUP
            {
             before(grammarAccess.getLexicalspace_SetupAccess().getXPECT_SETUPKeyword_1()); 
            match(input,XPECT_SETUP,FOLLOW_2); 
             after(grammarAccess.getLexicalspace_SetupAccess().getXPECT_SETUPKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Lexicalspace_Setup__Group__1__Impl"


    // $ANTLR start "rule__Lexicalspace_Setup__Group__2"
    // InternalXpectParser.g:778:1: rule__Lexicalspace_Setup__Group__2 : rule__Lexicalspace_Setup__Group__2__Impl rule__Lexicalspace_Setup__Group__3 ;
    public final void rule__Lexicalspace_Setup__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXpectParser.g:782:1: ( rule__Lexicalspace_Setup__Group__2__Impl rule__Lexicalspace_Setup__Group__3 )
            // InternalXpectParser.g:783:2: rule__Lexicalspace_Setup__Group__2__Impl rule__Lexicalspace_Setup__Group__3
            {
            pushFollow(FOLLOW_7);
            rule__Lexicalspace_Setup__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Lexicalspace_Setup__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Lexicalspace_Setup__Group__2"


    // $ANTLR start "rule__Lexicalspace_Setup__Group__2__Impl"
    // InternalXpectParser.g:790:1: rule__Lexicalspace_Setup__Group__2__Impl : ( ( rule__Lexicalspace_Setup__DeclaredSuiteAssignment_2 )? ) ;
    public final void rule__Lexicalspace_Setup__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXpectParser.g:794:1: ( ( ( rule__Lexicalspace_Setup__DeclaredSuiteAssignment_2 )? ) )
            // InternalXpectParser.g:795:1: ( ( rule__Lexicalspace_Setup__DeclaredSuiteAssignment_2 )? )
            {
            // InternalXpectParser.g:795:1: ( ( rule__Lexicalspace_Setup__DeclaredSuiteAssignment_2 )? )
            // InternalXpectParser.g:796:2: ( rule__Lexicalspace_Setup__DeclaredSuiteAssignment_2 )?
            {
             before(grammarAccess.getLexicalspace_SetupAccess().getDeclaredSuiteAssignment_2()); 
            // InternalXpectParser.g:797:2: ( rule__Lexicalspace_Setup__DeclaredSuiteAssignment_2 )?
            int alt9=2;
            alt9 = dfa9.predict(input);
            switch (alt9) {
                case 1 :
                    // InternalXpectParser.g:797:3: rule__Lexicalspace_Setup__DeclaredSuiteAssignment_2
                    {
                    pushFollow(FOLLOW_2);
                    rule__Lexicalspace_Setup__DeclaredSuiteAssignment_2();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getLexicalspace_SetupAccess().getDeclaredSuiteAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Lexicalspace_Setup__Group__2__Impl"


    // $ANTLR start "rule__Lexicalspace_Setup__Group__3"
    // InternalXpectParser.g:805:1: rule__Lexicalspace_Setup__Group__3 : rule__Lexicalspace_Setup__Group__3__Impl rule__Lexicalspace_Setup__Group__4 ;
    public final void rule__Lexicalspace_Setup__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXpectParser.g:809:1: ( rule__Lexicalspace_Setup__Group__3__Impl rule__Lexicalspace_Setup__Group__4 )
            // InternalXpectParser.g:810:2: rule__Lexicalspace_Setup__Group__3__Impl rule__Lexicalspace_Setup__Group__4
            {
            pushFollow(FOLLOW_7);
            rule__Lexicalspace_Setup__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Lexicalspace_Setup__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Lexicalspace_Setup__Group__3"


    // $ANTLR start "rule__Lexicalspace_Setup__Group__3__Impl"
    // InternalXpectParser.g:817:1: rule__Lexicalspace_Setup__Group__3__Impl : ( ( rule__Lexicalspace_Setup__AssignmentsAssignment_3 )* ) ;
    public final void rule__Lexicalspace_Setup__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXpectParser.g:821:1: ( ( ( rule__Lexicalspace_Setup__AssignmentsAssignment_3 )* ) )
            // InternalXpectParser.g:822:1: ( ( rule__Lexicalspace_Setup__AssignmentsAssignment_3 )* )
            {
            // InternalXpectParser.g:822:1: ( ( rule__Lexicalspace_Setup__AssignmentsAssignment_3 )* )
            // InternalXpectParser.g:823:2: ( rule__Lexicalspace_Setup__AssignmentsAssignment_3 )*
            {
             before(grammarAccess.getLexicalspace_SetupAccess().getAssignmentsAssignment_3()); 
            // InternalXpectParser.g:824:2: ( rule__Lexicalspace_Setup__AssignmentsAssignment_3 )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==RULE_ID) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // InternalXpectParser.g:824:3: rule__Lexicalspace_Setup__AssignmentsAssignment_3
            	    {
            	    pushFollow(FOLLOW_8);
            	    rule__Lexicalspace_Setup__AssignmentsAssignment_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);

             after(grammarAccess.getLexicalspace_SetupAccess().getAssignmentsAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Lexicalspace_Setup__Group__3__Impl"


    // $ANTLR start "rule__Lexicalspace_Setup__Group__4"
    // InternalXpectParser.g:832:1: rule__Lexicalspace_Setup__Group__4 : rule__Lexicalspace_Setup__Group__4__Impl ;
    public final void rule__Lexicalspace_Setup__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXpectParser.g:836:1: ( rule__Lexicalspace_Setup__Group__4__Impl )
            // InternalXpectParser.g:837:2: rule__Lexicalspace_Setup__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Lexicalspace_Setup__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Lexicalspace_Setup__Group__4"


    // $ANTLR start "rule__Lexicalspace_Setup__Group__4__Impl"
    // InternalXpectParser.g:843:1: rule__Lexicalspace_Setup__Group__4__Impl : ( END_SETUP ) ;
    public final void rule__Lexicalspace_Setup__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXpectParser.g:847:1: ( ( END_SETUP ) )
            // InternalXpectParser.g:848:1: ( END_SETUP )
            {
            // InternalXpectParser.g:848:1: ( END_SETUP )
            // InternalXpectParser.g:849:2: END_SETUP
            {
             before(grammarAccess.getLexicalspace_SetupAccess().getEND_SETUPKeyword_4()); 
            match(input,END_SETUP,FOLLOW_2); 
             after(grammarAccess.getLexicalspace_SetupAccess().getEND_SETUPKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Lexicalspace_Setup__Group__4__Impl"


    // $ANTLR start "rule__Assignment__Group_0__0"
    // InternalXpectParser.g:859:1: rule__Assignment__Group_0__0 : rule__Assignment__Group_0__0__Impl rule__Assignment__Group_0__1 ;
    public final void rule__Assignment__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXpectParser.g:863:1: ( rule__Assignment__Group_0__0__Impl rule__Assignment__Group_0__1 )
            // InternalXpectParser.g:864:2: rule__Assignment__Group_0__0__Impl rule__Assignment__Group_0__1
            {
            pushFollow(FOLLOW_9);
            rule__Assignment__Group_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Assignment__Group_0__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Assignment__Group_0__0"


    // $ANTLR start "rule__Assignment__Group_0__0__Impl"
    // InternalXpectParser.g:871:1: rule__Assignment__Group_0__0__Impl : ( ( rule__Assignment__DeclaredTargetAssignment_0_0 ) ) ;
    public final void rule__Assignment__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXpectParser.g:875:1: ( ( ( rule__Assignment__DeclaredTargetAssignment_0_0 ) ) )
            // InternalXpectParser.g:876:1: ( ( rule__Assignment__DeclaredTargetAssignment_0_0 ) )
            {
            // InternalXpectParser.g:876:1: ( ( rule__Assignment__DeclaredTargetAssignment_0_0 ) )
            // InternalXpectParser.g:877:2: ( rule__Assignment__DeclaredTargetAssignment_0_0 )
            {
             before(grammarAccess.getAssignmentAccess().getDeclaredTargetAssignment_0_0()); 
            // InternalXpectParser.g:878:2: ( rule__Assignment__DeclaredTargetAssignment_0_0 )
            // InternalXpectParser.g:878:3: rule__Assignment__DeclaredTargetAssignment_0_0
            {
            pushFollow(FOLLOW_2);
            rule__Assignment__DeclaredTargetAssignment_0_0();

            state._fsp--;


            }

             after(grammarAccess.getAssignmentAccess().getDeclaredTargetAssignment_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Assignment__Group_0__0__Impl"


    // $ANTLR start "rule__Assignment__Group_0__1"
    // InternalXpectParser.g:886:1: rule__Assignment__Group_0__1 : rule__Assignment__Group_0__1__Impl rule__Assignment__Group_0__2 ;
    public final void rule__Assignment__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXpectParser.g:890:1: ( rule__Assignment__Group_0__1__Impl rule__Assignment__Group_0__2 )
            // InternalXpectParser.g:891:2: rule__Assignment__Group_0__1__Impl rule__Assignment__Group_0__2
            {
            pushFollow(FOLLOW_10);
            rule__Assignment__Group_0__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Assignment__Group_0__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Assignment__Group_0__1"


    // $ANTLR start "rule__Assignment__Group_0__1__Impl"
    // InternalXpectParser.g:898:1: rule__Assignment__Group_0__1__Impl : ( EqualsSign ) ;
    public final void rule__Assignment__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXpectParser.g:902:1: ( ( EqualsSign ) )
            // InternalXpectParser.g:903:1: ( EqualsSign )
            {
            // InternalXpectParser.g:903:1: ( EqualsSign )
            // InternalXpectParser.g:904:2: EqualsSign
            {
             before(grammarAccess.getAssignmentAccess().getEqualsSignKeyword_0_1()); 
            match(input,EqualsSign,FOLLOW_2); 
             after(grammarAccess.getAssignmentAccess().getEqualsSignKeyword_0_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Assignment__Group_0__1__Impl"


    // $ANTLR start "rule__Assignment__Group_0__2"
    // InternalXpectParser.g:913:1: rule__Assignment__Group_0__2 : rule__Assignment__Group_0__2__Impl ;
    public final void rule__Assignment__Group_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXpectParser.g:917:1: ( rule__Assignment__Group_0__2__Impl )
            // InternalXpectParser.g:918:2: rule__Assignment__Group_0__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Assignment__Group_0__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Assignment__Group_0__2"


    // $ANTLR start "rule__Assignment__Group_0__2__Impl"
    // InternalXpectParser.g:924:1: rule__Assignment__Group_0__2__Impl : ( ( rule__Assignment__ValueAssignment_0_2 ) ) ;
    public final void rule__Assignment__Group_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXpectParser.g:928:1: ( ( ( rule__Assignment__ValueAssignment_0_2 ) ) )
            // InternalXpectParser.g:929:1: ( ( rule__Assignment__ValueAssignment_0_2 ) )
            {
            // InternalXpectParser.g:929:1: ( ( rule__Assignment__ValueAssignment_0_2 ) )
            // InternalXpectParser.g:930:2: ( rule__Assignment__ValueAssignment_0_2 )
            {
             before(grammarAccess.getAssignmentAccess().getValueAssignment_0_2()); 
            // InternalXpectParser.g:931:2: ( rule__Assignment__ValueAssignment_0_2 )
            // InternalXpectParser.g:931:3: rule__Assignment__ValueAssignment_0_2
            {
            pushFollow(FOLLOW_2);
            rule__Assignment__ValueAssignment_0_2();

            state._fsp--;


            }

             after(grammarAccess.getAssignmentAccess().getValueAssignment_0_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Assignment__Group_0__2__Impl"


    // $ANTLR start "rule__ComponentLong__Group__0"
    // InternalXpectParser.g:940:1: rule__ComponentLong__Group__0 : rule__ComponentLong__Group__0__Impl rule__ComponentLong__Group__1 ;
    public final void rule__ComponentLong__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXpectParser.g:944:1: ( rule__ComponentLong__Group__0__Impl rule__ComponentLong__Group__1 )
            // InternalXpectParser.g:945:2: rule__ComponentLong__Group__0__Impl rule__ComponentLong__Group__1
            {
            pushFollow(FOLLOW_11);
            rule__ComponentLong__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ComponentLong__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComponentLong__Group__0"


    // $ANTLR start "rule__ComponentLong__Group__0__Impl"
    // InternalXpectParser.g:952:1: rule__ComponentLong__Group__0__Impl : ( () ) ;
    public final void rule__ComponentLong__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXpectParser.g:956:1: ( ( () ) )
            // InternalXpectParser.g:957:1: ( () )
            {
            // InternalXpectParser.g:957:1: ( () )
            // InternalXpectParser.g:958:2: ()
            {
             before(grammarAccess.getComponentLongAccess().getComponentAction_0()); 
            // InternalXpectParser.g:959:2: ()
            // InternalXpectParser.g:959:3: 
            {
            }

             after(grammarAccess.getComponentLongAccess().getComponentAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComponentLong__Group__0__Impl"


    // $ANTLR start "rule__ComponentLong__Group__1"
    // InternalXpectParser.g:967:1: rule__ComponentLong__Group__1 : rule__ComponentLong__Group__1__Impl rule__ComponentLong__Group__2 ;
    public final void rule__ComponentLong__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXpectParser.g:971:1: ( rule__ComponentLong__Group__1__Impl rule__ComponentLong__Group__2 )
            // InternalXpectParser.g:972:2: rule__ComponentLong__Group__1__Impl rule__ComponentLong__Group__2
            {
            pushFollow(FOLLOW_12);
            rule__ComponentLong__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ComponentLong__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComponentLong__Group__1"


    // $ANTLR start "rule__ComponentLong__Group__1__Impl"
    // InternalXpectParser.g:979:1: rule__ComponentLong__Group__1__Impl : ( ( rule__ComponentLong__ComponentClassAssignment_1 ) ) ;
    public final void rule__ComponentLong__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXpectParser.g:983:1: ( ( ( rule__ComponentLong__ComponentClassAssignment_1 ) ) )
            // InternalXpectParser.g:984:1: ( ( rule__ComponentLong__ComponentClassAssignment_1 ) )
            {
            // InternalXpectParser.g:984:1: ( ( rule__ComponentLong__ComponentClassAssignment_1 ) )
            // InternalXpectParser.g:985:2: ( rule__ComponentLong__ComponentClassAssignment_1 )
            {
             before(grammarAccess.getComponentLongAccess().getComponentClassAssignment_1()); 
            // InternalXpectParser.g:986:2: ( rule__ComponentLong__ComponentClassAssignment_1 )
            // InternalXpectParser.g:986:3: rule__ComponentLong__ComponentClassAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__ComponentLong__ComponentClassAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getComponentLongAccess().getComponentClassAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComponentLong__Group__1__Impl"


    // $ANTLR start "rule__ComponentLong__Group__2"
    // InternalXpectParser.g:994:1: rule__ComponentLong__Group__2 : rule__ComponentLong__Group__2__Impl rule__ComponentLong__Group__3 ;
    public final void rule__ComponentLong__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXpectParser.g:998:1: ( rule__ComponentLong__Group__2__Impl rule__ComponentLong__Group__3 )
            // InternalXpectParser.g:999:2: rule__ComponentLong__Group__2__Impl rule__ComponentLong__Group__3
            {
            pushFollow(FOLLOW_12);
            rule__ComponentLong__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ComponentLong__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComponentLong__Group__2"


    // $ANTLR start "rule__ComponentLong__Group__2__Impl"
    // InternalXpectParser.g:1006:1: rule__ComponentLong__Group__2__Impl : ( ( rule__ComponentLong__ParametersAssignment_2 )* ) ;
    public final void rule__ComponentLong__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXpectParser.g:1010:1: ( ( ( rule__ComponentLong__ParametersAssignment_2 )* ) )
            // InternalXpectParser.g:1011:1: ( ( rule__ComponentLong__ParametersAssignment_2 )* )
            {
            // InternalXpectParser.g:1011:1: ( ( rule__ComponentLong__ParametersAssignment_2 )* )
            // InternalXpectParser.g:1012:2: ( rule__ComponentLong__ParametersAssignment_2 )*
            {
             before(grammarAccess.getComponentLongAccess().getParametersAssignment_2()); 
            // InternalXpectParser.g:1013:2: ( rule__ComponentLong__ParametersAssignment_2 )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( ((LA11_0>=False && LA11_0<=True)||(LA11_0>=RULE_INT && LA11_0<=RULE_STRING)) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // InternalXpectParser.g:1013:3: rule__ComponentLong__ParametersAssignment_2
            	    {
            	    pushFollow(FOLLOW_13);
            	    rule__ComponentLong__ParametersAssignment_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);

             after(grammarAccess.getComponentLongAccess().getParametersAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComponentLong__Group__2__Impl"


    // $ANTLR start "rule__ComponentLong__Group__3"
    // InternalXpectParser.g:1021:1: rule__ComponentLong__Group__3 : rule__ComponentLong__Group__3__Impl ;
    public final void rule__ComponentLong__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXpectParser.g:1025:1: ( rule__ComponentLong__Group__3__Impl )
            // InternalXpectParser.g:1026:2: rule__ComponentLong__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ComponentLong__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComponentLong__Group__3"


    // $ANTLR start "rule__ComponentLong__Group__3__Impl"
    // InternalXpectParser.g:1032:1: rule__ComponentLong__Group__3__Impl : ( ( rule__ComponentLong__Group_3__0 ) ) ;
    public final void rule__ComponentLong__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXpectParser.g:1036:1: ( ( ( rule__ComponentLong__Group_3__0 ) ) )
            // InternalXpectParser.g:1037:1: ( ( rule__ComponentLong__Group_3__0 ) )
            {
            // InternalXpectParser.g:1037:1: ( ( rule__ComponentLong__Group_3__0 ) )
            // InternalXpectParser.g:1038:2: ( rule__ComponentLong__Group_3__0 )
            {
             before(grammarAccess.getComponentLongAccess().getGroup_3()); 
            // InternalXpectParser.g:1039:2: ( rule__ComponentLong__Group_3__0 )
            // InternalXpectParser.g:1039:3: rule__ComponentLong__Group_3__0
            {
            pushFollow(FOLLOW_2);
            rule__ComponentLong__Group_3__0();

            state._fsp--;


            }

             after(grammarAccess.getComponentLongAccess().getGroup_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComponentLong__Group__3__Impl"


    // $ANTLR start "rule__ComponentLong__Group_3__0"
    // InternalXpectParser.g:1048:1: rule__ComponentLong__Group_3__0 : rule__ComponentLong__Group_3__0__Impl rule__ComponentLong__Group_3__1 ;
    public final void rule__ComponentLong__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXpectParser.g:1052:1: ( rule__ComponentLong__Group_3__0__Impl rule__ComponentLong__Group_3__1 )
            // InternalXpectParser.g:1053:2: rule__ComponentLong__Group_3__0__Impl rule__ComponentLong__Group_3__1
            {
            pushFollow(FOLLOW_14);
            rule__ComponentLong__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ComponentLong__Group_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComponentLong__Group_3__0"


    // $ANTLR start "rule__ComponentLong__Group_3__0__Impl"
    // InternalXpectParser.g:1060:1: rule__ComponentLong__Group_3__0__Impl : ( LeftCurlyBracket ) ;
    public final void rule__ComponentLong__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXpectParser.g:1064:1: ( ( LeftCurlyBracket ) )
            // InternalXpectParser.g:1065:1: ( LeftCurlyBracket )
            {
            // InternalXpectParser.g:1065:1: ( LeftCurlyBracket )
            // InternalXpectParser.g:1066:2: LeftCurlyBracket
            {
             before(grammarAccess.getComponentLongAccess().getLeftCurlyBracketKeyword_3_0()); 
            match(input,LeftCurlyBracket,FOLLOW_2); 
             after(grammarAccess.getComponentLongAccess().getLeftCurlyBracketKeyword_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComponentLong__Group_3__0__Impl"


    // $ANTLR start "rule__ComponentLong__Group_3__1"
    // InternalXpectParser.g:1075:1: rule__ComponentLong__Group_3__1 : rule__ComponentLong__Group_3__1__Impl rule__ComponentLong__Group_3__2 ;
    public final void rule__ComponentLong__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXpectParser.g:1079:1: ( rule__ComponentLong__Group_3__1__Impl rule__ComponentLong__Group_3__2 )
            // InternalXpectParser.g:1080:2: rule__ComponentLong__Group_3__1__Impl rule__ComponentLong__Group_3__2
            {
            pushFollow(FOLLOW_14);
            rule__ComponentLong__Group_3__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ComponentLong__Group_3__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComponentLong__Group_3__1"


    // $ANTLR start "rule__ComponentLong__Group_3__1__Impl"
    // InternalXpectParser.g:1087:1: rule__ComponentLong__Group_3__1__Impl : ( ( rule__ComponentLong__AssignmentsAssignment_3_1 )* ) ;
    public final void rule__ComponentLong__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXpectParser.g:1091:1: ( ( ( rule__ComponentLong__AssignmentsAssignment_3_1 )* ) )
            // InternalXpectParser.g:1092:1: ( ( rule__ComponentLong__AssignmentsAssignment_3_1 )* )
            {
            // InternalXpectParser.g:1092:1: ( ( rule__ComponentLong__AssignmentsAssignment_3_1 )* )
            // InternalXpectParser.g:1093:2: ( rule__ComponentLong__AssignmentsAssignment_3_1 )*
            {
             before(grammarAccess.getComponentLongAccess().getAssignmentsAssignment_3_1()); 
            // InternalXpectParser.g:1094:2: ( rule__ComponentLong__AssignmentsAssignment_3_1 )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==RULE_ID) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // InternalXpectParser.g:1094:3: rule__ComponentLong__AssignmentsAssignment_3_1
            	    {
            	    pushFollow(FOLLOW_8);
            	    rule__ComponentLong__AssignmentsAssignment_3_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop12;
                }
            } while (true);

             after(grammarAccess.getComponentLongAccess().getAssignmentsAssignment_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComponentLong__Group_3__1__Impl"


    // $ANTLR start "rule__ComponentLong__Group_3__2"
    // InternalXpectParser.g:1102:1: rule__ComponentLong__Group_3__2 : rule__ComponentLong__Group_3__2__Impl ;
    public final void rule__ComponentLong__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXpectParser.g:1106:1: ( rule__ComponentLong__Group_3__2__Impl )
            // InternalXpectParser.g:1107:2: rule__ComponentLong__Group_3__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ComponentLong__Group_3__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComponentLong__Group_3__2"


    // $ANTLR start "rule__ComponentLong__Group_3__2__Impl"
    // InternalXpectParser.g:1113:1: rule__ComponentLong__Group_3__2__Impl : ( RightCurlyBracket ) ;
    public final void rule__ComponentLong__Group_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXpectParser.g:1117:1: ( ( RightCurlyBracket ) )
            // InternalXpectParser.g:1118:1: ( RightCurlyBracket )
            {
            // InternalXpectParser.g:1118:1: ( RightCurlyBracket )
            // InternalXpectParser.g:1119:2: RightCurlyBracket
            {
             before(grammarAccess.getComponentLongAccess().getRightCurlyBracketKeyword_3_2()); 
            match(input,RightCurlyBracket,FOLLOW_2); 
             after(grammarAccess.getComponentLongAccess().getRightCurlyBracketKeyword_3_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComponentLong__Group_3__2__Impl"


    // $ANTLR start "rule__ComponentInline__Group__0"
    // InternalXpectParser.g:1129:1: rule__ComponentInline__Group__0 : rule__ComponentInline__Group__0__Impl rule__ComponentInline__Group__1 ;
    public final void rule__ComponentInline__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXpectParser.g:1133:1: ( rule__ComponentInline__Group__0__Impl rule__ComponentInline__Group__1 )
            // InternalXpectParser.g:1134:2: rule__ComponentInline__Group__0__Impl rule__ComponentInline__Group__1
            {
            pushFollow(FOLLOW_10);
            rule__ComponentInline__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ComponentInline__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComponentInline__Group__0"


    // $ANTLR start "rule__ComponentInline__Group__0__Impl"
    // InternalXpectParser.g:1141:1: rule__ComponentInline__Group__0__Impl : ( () ) ;
    public final void rule__ComponentInline__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXpectParser.g:1145:1: ( ( () ) )
            // InternalXpectParser.g:1146:1: ( () )
            {
            // InternalXpectParser.g:1146:1: ( () )
            // InternalXpectParser.g:1147:2: ()
            {
             before(grammarAccess.getComponentInlineAccess().getComponentAction_0()); 
            // InternalXpectParser.g:1148:2: ()
            // InternalXpectParser.g:1148:3: 
            {
            }

             after(grammarAccess.getComponentInlineAccess().getComponentAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComponentInline__Group__0__Impl"


    // $ANTLR start "rule__ComponentInline__Group__1"
    // InternalXpectParser.g:1156:1: rule__ComponentInline__Group__1 : rule__ComponentInline__Group__1__Impl rule__ComponentInline__Group__2 ;
    public final void rule__ComponentInline__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXpectParser.g:1160:1: ( rule__ComponentInline__Group__1__Impl rule__ComponentInline__Group__2 )
            // InternalXpectParser.g:1161:2: rule__ComponentInline__Group__1__Impl rule__ComponentInline__Group__2
            {
            pushFollow(FOLLOW_10);
            rule__ComponentInline__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ComponentInline__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComponentInline__Group__1"


    // $ANTLR start "rule__ComponentInline__Group__1__Impl"
    // InternalXpectParser.g:1168:1: rule__ComponentInline__Group__1__Impl : ( ( rule__ComponentInline__Group_1__0 )? ) ;
    public final void rule__ComponentInline__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXpectParser.g:1172:1: ( ( ( rule__ComponentInline__Group_1__0 )? ) )
            // InternalXpectParser.g:1173:1: ( ( rule__ComponentInline__Group_1__0 )? )
            {
            // InternalXpectParser.g:1173:1: ( ( rule__ComponentInline__Group_1__0 )? )
            // InternalXpectParser.g:1174:2: ( rule__ComponentInline__Group_1__0 )?
            {
             before(grammarAccess.getComponentInlineAccess().getGroup_1()); 
            // InternalXpectParser.g:1175:2: ( rule__ComponentInline__Group_1__0 )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==RULE_ID) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // InternalXpectParser.g:1175:3: rule__ComponentInline__Group_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__ComponentInline__Group_1__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getComponentInlineAccess().getGroup_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComponentInline__Group__1__Impl"


    // $ANTLR start "rule__ComponentInline__Group__2"
    // InternalXpectParser.g:1183:1: rule__ComponentInline__Group__2 : rule__ComponentInline__Group__2__Impl ;
    public final void rule__ComponentInline__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXpectParser.g:1187:1: ( rule__ComponentInline__Group__2__Impl )
            // InternalXpectParser.g:1188:2: rule__ComponentInline__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ComponentInline__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComponentInline__Group__2"


    // $ANTLR start "rule__ComponentInline__Group__2__Impl"
    // InternalXpectParser.g:1194:1: rule__ComponentInline__Group__2__Impl : ( ( rule__ComponentInline__Group_2__0 ) ) ;
    public final void rule__ComponentInline__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXpectParser.g:1198:1: ( ( ( rule__ComponentInline__Group_2__0 ) ) )
            // InternalXpectParser.g:1199:1: ( ( rule__ComponentInline__Group_2__0 ) )
            {
            // InternalXpectParser.g:1199:1: ( ( rule__ComponentInline__Group_2__0 ) )
            // InternalXpectParser.g:1200:2: ( rule__ComponentInline__Group_2__0 )
            {
             before(grammarAccess.getComponentInlineAccess().getGroup_2()); 
            // InternalXpectParser.g:1201:2: ( rule__ComponentInline__Group_2__0 )
            // InternalXpectParser.g:1201:3: rule__ComponentInline__Group_2__0
            {
            pushFollow(FOLLOW_2);
            rule__ComponentInline__Group_2__0();

            state._fsp--;


            }

             after(grammarAccess.getComponentInlineAccess().getGroup_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComponentInline__Group__2__Impl"


    // $ANTLR start "rule__ComponentInline__Group_1__0"
    // InternalXpectParser.g:1210:1: rule__ComponentInline__Group_1__0 : rule__ComponentInline__Group_1__0__Impl rule__ComponentInline__Group_1__1 ;
    public final void rule__ComponentInline__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXpectParser.g:1214:1: ( rule__ComponentInline__Group_1__0__Impl rule__ComponentInline__Group_1__1 )
            // InternalXpectParser.g:1215:2: rule__ComponentInline__Group_1__0__Impl rule__ComponentInline__Group_1__1
            {
            pushFollow(FOLLOW_15);
            rule__ComponentInline__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ComponentInline__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComponentInline__Group_1__0"


    // $ANTLR start "rule__ComponentInline__Group_1__0__Impl"
    // InternalXpectParser.g:1222:1: rule__ComponentInline__Group_1__0__Impl : ( ( rule__ComponentInline__ComponentClassAssignment_1_0 ) ) ;
    public final void rule__ComponentInline__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXpectParser.g:1226:1: ( ( ( rule__ComponentInline__ComponentClassAssignment_1_0 ) ) )
            // InternalXpectParser.g:1227:1: ( ( rule__ComponentInline__ComponentClassAssignment_1_0 ) )
            {
            // InternalXpectParser.g:1227:1: ( ( rule__ComponentInline__ComponentClassAssignment_1_0 ) )
            // InternalXpectParser.g:1228:2: ( rule__ComponentInline__ComponentClassAssignment_1_0 )
            {
             before(grammarAccess.getComponentInlineAccess().getComponentClassAssignment_1_0()); 
            // InternalXpectParser.g:1229:2: ( rule__ComponentInline__ComponentClassAssignment_1_0 )
            // InternalXpectParser.g:1229:3: rule__ComponentInline__ComponentClassAssignment_1_0
            {
            pushFollow(FOLLOW_2);
            rule__ComponentInline__ComponentClassAssignment_1_0();

            state._fsp--;


            }

             after(grammarAccess.getComponentInlineAccess().getComponentClassAssignment_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComponentInline__Group_1__0__Impl"


    // $ANTLR start "rule__ComponentInline__Group_1__1"
    // InternalXpectParser.g:1237:1: rule__ComponentInline__Group_1__1 : rule__ComponentInline__Group_1__1__Impl ;
    public final void rule__ComponentInline__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXpectParser.g:1241:1: ( rule__ComponentInline__Group_1__1__Impl )
            // InternalXpectParser.g:1242:2: rule__ComponentInline__Group_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ComponentInline__Group_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComponentInline__Group_1__1"


    // $ANTLR start "rule__ComponentInline__Group_1__1__Impl"
    // InternalXpectParser.g:1248:1: rule__ComponentInline__Group_1__1__Impl : ( ( rule__ComponentInline__ParametersAssignment_1_1 )* ) ;
    public final void rule__ComponentInline__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXpectParser.g:1252:1: ( ( ( rule__ComponentInline__ParametersAssignment_1_1 )* ) )
            // InternalXpectParser.g:1253:1: ( ( rule__ComponentInline__ParametersAssignment_1_1 )* )
            {
            // InternalXpectParser.g:1253:1: ( ( rule__ComponentInline__ParametersAssignment_1_1 )* )
            // InternalXpectParser.g:1254:2: ( rule__ComponentInline__ParametersAssignment_1_1 )*
            {
             before(grammarAccess.getComponentInlineAccess().getParametersAssignment_1_1()); 
            // InternalXpectParser.g:1255:2: ( rule__ComponentInline__ParametersAssignment_1_1 )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( ((LA14_0>=False && LA14_0<=True)||(LA14_0>=RULE_INT && LA14_0<=RULE_STRING)) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // InternalXpectParser.g:1255:3: rule__ComponentInline__ParametersAssignment_1_1
            	    {
            	    pushFollow(FOLLOW_13);
            	    rule__ComponentInline__ParametersAssignment_1_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop14;
                }
            } while (true);

             after(grammarAccess.getComponentInlineAccess().getParametersAssignment_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComponentInline__Group_1__1__Impl"


    // $ANTLR start "rule__ComponentInline__Group_2__0"
    // InternalXpectParser.g:1264:1: rule__ComponentInline__Group_2__0 : rule__ComponentInline__Group_2__0__Impl rule__ComponentInline__Group_2__1 ;
    public final void rule__ComponentInline__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXpectParser.g:1268:1: ( rule__ComponentInline__Group_2__0__Impl rule__ComponentInline__Group_2__1 )
            // InternalXpectParser.g:1269:2: rule__ComponentInline__Group_2__0__Impl rule__ComponentInline__Group_2__1
            {
            pushFollow(FOLLOW_14);
            rule__ComponentInline__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ComponentInline__Group_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComponentInline__Group_2__0"


    // $ANTLR start "rule__ComponentInline__Group_2__0__Impl"
    // InternalXpectParser.g:1276:1: rule__ComponentInline__Group_2__0__Impl : ( LeftCurlyBracket ) ;
    public final void rule__ComponentInline__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXpectParser.g:1280:1: ( ( LeftCurlyBracket ) )
            // InternalXpectParser.g:1281:1: ( LeftCurlyBracket )
            {
            // InternalXpectParser.g:1281:1: ( LeftCurlyBracket )
            // InternalXpectParser.g:1282:2: LeftCurlyBracket
            {
             before(grammarAccess.getComponentInlineAccess().getLeftCurlyBracketKeyword_2_0()); 
            match(input,LeftCurlyBracket,FOLLOW_2); 
             after(grammarAccess.getComponentInlineAccess().getLeftCurlyBracketKeyword_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComponentInline__Group_2__0__Impl"


    // $ANTLR start "rule__ComponentInline__Group_2__1"
    // InternalXpectParser.g:1291:1: rule__ComponentInline__Group_2__1 : rule__ComponentInline__Group_2__1__Impl rule__ComponentInline__Group_2__2 ;
    public final void rule__ComponentInline__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXpectParser.g:1295:1: ( rule__ComponentInline__Group_2__1__Impl rule__ComponentInline__Group_2__2 )
            // InternalXpectParser.g:1296:2: rule__ComponentInline__Group_2__1__Impl rule__ComponentInline__Group_2__2
            {
            pushFollow(FOLLOW_14);
            rule__ComponentInline__Group_2__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ComponentInline__Group_2__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComponentInline__Group_2__1"


    // $ANTLR start "rule__ComponentInline__Group_2__1__Impl"
    // InternalXpectParser.g:1303:1: rule__ComponentInline__Group_2__1__Impl : ( ( rule__ComponentInline__AssignmentsAssignment_2_1 )* ) ;
    public final void rule__ComponentInline__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXpectParser.g:1307:1: ( ( ( rule__ComponentInline__AssignmentsAssignment_2_1 )* ) )
            // InternalXpectParser.g:1308:1: ( ( rule__ComponentInline__AssignmentsAssignment_2_1 )* )
            {
            // InternalXpectParser.g:1308:1: ( ( rule__ComponentInline__AssignmentsAssignment_2_1 )* )
            // InternalXpectParser.g:1309:2: ( rule__ComponentInline__AssignmentsAssignment_2_1 )*
            {
             before(grammarAccess.getComponentInlineAccess().getAssignmentsAssignment_2_1()); 
            // InternalXpectParser.g:1310:2: ( rule__ComponentInline__AssignmentsAssignment_2_1 )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==RULE_ID) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // InternalXpectParser.g:1310:3: rule__ComponentInline__AssignmentsAssignment_2_1
            	    {
            	    pushFollow(FOLLOW_8);
            	    rule__ComponentInline__AssignmentsAssignment_2_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop15;
                }
            } while (true);

             after(grammarAccess.getComponentInlineAccess().getAssignmentsAssignment_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComponentInline__Group_2__1__Impl"


    // $ANTLR start "rule__ComponentInline__Group_2__2"
    // InternalXpectParser.g:1318:1: rule__ComponentInline__Group_2__2 : rule__ComponentInline__Group_2__2__Impl ;
    public final void rule__ComponentInline__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXpectParser.g:1322:1: ( rule__ComponentInline__Group_2__2__Impl )
            // InternalXpectParser.g:1323:2: rule__ComponentInline__Group_2__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ComponentInline__Group_2__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComponentInline__Group_2__2"


    // $ANTLR start "rule__ComponentInline__Group_2__2__Impl"
    // InternalXpectParser.g:1329:1: rule__ComponentInline__Group_2__2__Impl : ( RightCurlyBracket ) ;
    public final void rule__ComponentInline__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXpectParser.g:1333:1: ( ( RightCurlyBracket ) )
            // InternalXpectParser.g:1334:1: ( RightCurlyBracket )
            {
            // InternalXpectParser.g:1334:1: ( RightCurlyBracket )
            // InternalXpectParser.g:1335:2: RightCurlyBracket
            {
             before(grammarAccess.getComponentInlineAccess().getRightCurlyBracketKeyword_2_2()); 
            match(input,RightCurlyBracket,FOLLOW_2); 
             after(grammarAccess.getComponentInlineAccess().getRightCurlyBracketKeyword_2_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComponentInline__Group_2__2__Impl"


    // $ANTLR start "rule__Literal__Group_0__0"
    // InternalXpectParser.g:1345:1: rule__Literal__Group_0__0 : rule__Literal__Group_0__0__Impl rule__Literal__Group_0__1 ;
    public final void rule__Literal__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXpectParser.g:1349:1: ( rule__Literal__Group_0__0__Impl rule__Literal__Group_0__1 )
            // InternalXpectParser.g:1350:2: rule__Literal__Group_0__0__Impl rule__Literal__Group_0__1
            {
            pushFollow(FOLLOW_16);
            rule__Literal__Group_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Literal__Group_0__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Literal__Group_0__0"


    // $ANTLR start "rule__Literal__Group_0__0__Impl"
    // InternalXpectParser.g:1357:1: rule__Literal__Group_0__0__Impl : ( () ) ;
    public final void rule__Literal__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXpectParser.g:1361:1: ( ( () ) )
            // InternalXpectParser.g:1362:1: ( () )
            {
            // InternalXpectParser.g:1362:1: ( () )
            // InternalXpectParser.g:1363:2: ()
            {
             before(grammarAccess.getLiteralAccess().getBooleanLiteralAction_0_0()); 
            // InternalXpectParser.g:1364:2: ()
            // InternalXpectParser.g:1364:3: 
            {
            }

             after(grammarAccess.getLiteralAccess().getBooleanLiteralAction_0_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Literal__Group_0__0__Impl"


    // $ANTLR start "rule__Literal__Group_0__1"
    // InternalXpectParser.g:1372:1: rule__Literal__Group_0__1 : rule__Literal__Group_0__1__Impl ;
    public final void rule__Literal__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXpectParser.g:1376:1: ( rule__Literal__Group_0__1__Impl )
            // InternalXpectParser.g:1377:2: rule__Literal__Group_0__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Literal__Group_0__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Literal__Group_0__1"


    // $ANTLR start "rule__Literal__Group_0__1__Impl"
    // InternalXpectParser.g:1383:1: rule__Literal__Group_0__1__Impl : ( ( rule__Literal__Alternatives_0_1 ) ) ;
    public final void rule__Literal__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXpectParser.g:1387:1: ( ( ( rule__Literal__Alternatives_0_1 ) ) )
            // InternalXpectParser.g:1388:1: ( ( rule__Literal__Alternatives_0_1 ) )
            {
            // InternalXpectParser.g:1388:1: ( ( rule__Literal__Alternatives_0_1 ) )
            // InternalXpectParser.g:1389:2: ( rule__Literal__Alternatives_0_1 )
            {
             before(grammarAccess.getLiteralAccess().getAlternatives_0_1()); 
            // InternalXpectParser.g:1390:2: ( rule__Literal__Alternatives_0_1 )
            // InternalXpectParser.g:1390:3: rule__Literal__Alternatives_0_1
            {
            pushFollow(FOLLOW_2);
            rule__Literal__Alternatives_0_1();

            state._fsp--;


            }

             after(grammarAccess.getLiteralAccess().getAlternatives_0_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Literal__Group_0__1__Impl"


    // $ANTLR start "rule__Literal__Group_1__0"
    // InternalXpectParser.g:1399:1: rule__Literal__Group_1__0 : rule__Literal__Group_1__0__Impl rule__Literal__Group_1__1 ;
    public final void rule__Literal__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXpectParser.g:1403:1: ( rule__Literal__Group_1__0__Impl rule__Literal__Group_1__1 )
            // InternalXpectParser.g:1404:2: rule__Literal__Group_1__0__Impl rule__Literal__Group_1__1
            {
            pushFollow(FOLLOW_17);
            rule__Literal__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Literal__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Literal__Group_1__0"


    // $ANTLR start "rule__Literal__Group_1__0__Impl"
    // InternalXpectParser.g:1411:1: rule__Literal__Group_1__0__Impl : ( () ) ;
    public final void rule__Literal__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXpectParser.g:1415:1: ( ( () ) )
            // InternalXpectParser.g:1416:1: ( () )
            {
            // InternalXpectParser.g:1416:1: ( () )
            // InternalXpectParser.g:1417:2: ()
            {
             before(grammarAccess.getLiteralAccess().getIntLiteralAction_1_0()); 
            // InternalXpectParser.g:1418:2: ()
            // InternalXpectParser.g:1418:3: 
            {
            }

             after(grammarAccess.getLiteralAccess().getIntLiteralAction_1_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Literal__Group_1__0__Impl"


    // $ANTLR start "rule__Literal__Group_1__1"
    // InternalXpectParser.g:1426:1: rule__Literal__Group_1__1 : rule__Literal__Group_1__1__Impl ;
    public final void rule__Literal__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXpectParser.g:1430:1: ( rule__Literal__Group_1__1__Impl )
            // InternalXpectParser.g:1431:2: rule__Literal__Group_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Literal__Group_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Literal__Group_1__1"


    // $ANTLR start "rule__Literal__Group_1__1__Impl"
    // InternalXpectParser.g:1437:1: rule__Literal__Group_1__1__Impl : ( ( rule__Literal__ValueAssignment_1_1 ) ) ;
    public final void rule__Literal__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXpectParser.g:1441:1: ( ( ( rule__Literal__ValueAssignment_1_1 ) ) )
            // InternalXpectParser.g:1442:1: ( ( rule__Literal__ValueAssignment_1_1 ) )
            {
            // InternalXpectParser.g:1442:1: ( ( rule__Literal__ValueAssignment_1_1 ) )
            // InternalXpectParser.g:1443:2: ( rule__Literal__ValueAssignment_1_1 )
            {
             before(grammarAccess.getLiteralAccess().getValueAssignment_1_1()); 
            // InternalXpectParser.g:1444:2: ( rule__Literal__ValueAssignment_1_1 )
            // InternalXpectParser.g:1444:3: rule__Literal__ValueAssignment_1_1
            {
            pushFollow(FOLLOW_2);
            rule__Literal__ValueAssignment_1_1();

            state._fsp--;


            }

             after(grammarAccess.getLiteralAccess().getValueAssignment_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Literal__Group_1__1__Impl"


    // $ANTLR start "rule__Literal__Group_2__0"
    // InternalXpectParser.g:1453:1: rule__Literal__Group_2__0 : rule__Literal__Group_2__0__Impl rule__Literal__Group_2__1 ;
    public final void rule__Literal__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXpectParser.g:1457:1: ( rule__Literal__Group_2__0__Impl rule__Literal__Group_2__1 )
            // InternalXpectParser.g:1458:2: rule__Literal__Group_2__0__Impl rule__Literal__Group_2__1
            {
            pushFollow(FOLLOW_15);
            rule__Literal__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Literal__Group_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Literal__Group_2__0"


    // $ANTLR start "rule__Literal__Group_2__0__Impl"
    // InternalXpectParser.g:1465:1: rule__Literal__Group_2__0__Impl : ( () ) ;
    public final void rule__Literal__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXpectParser.g:1469:1: ( ( () ) )
            // InternalXpectParser.g:1470:1: ( () )
            {
            // InternalXpectParser.g:1470:1: ( () )
            // InternalXpectParser.g:1471:2: ()
            {
             before(grammarAccess.getLiteralAccess().getStringLiteralAction_2_0()); 
            // InternalXpectParser.g:1472:2: ()
            // InternalXpectParser.g:1472:3: 
            {
            }

             after(grammarAccess.getLiteralAccess().getStringLiteralAction_2_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Literal__Group_2__0__Impl"


    // $ANTLR start "rule__Literal__Group_2__1"
    // InternalXpectParser.g:1480:1: rule__Literal__Group_2__1 : rule__Literal__Group_2__1__Impl ;
    public final void rule__Literal__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXpectParser.g:1484:1: ( rule__Literal__Group_2__1__Impl )
            // InternalXpectParser.g:1485:2: rule__Literal__Group_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Literal__Group_2__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Literal__Group_2__1"


    // $ANTLR start "rule__Literal__Group_2__1__Impl"
    // InternalXpectParser.g:1491:1: rule__Literal__Group_2__1__Impl : ( ( rule__Literal__ValueAssignment_2_1 ) ) ;
    public final void rule__Literal__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXpectParser.g:1495:1: ( ( ( rule__Literal__ValueAssignment_2_1 ) ) )
            // InternalXpectParser.g:1496:1: ( ( rule__Literal__ValueAssignment_2_1 ) )
            {
            // InternalXpectParser.g:1496:1: ( ( rule__Literal__ValueAssignment_2_1 ) )
            // InternalXpectParser.g:1497:2: ( rule__Literal__ValueAssignment_2_1 )
            {
             before(grammarAccess.getLiteralAccess().getValueAssignment_2_1()); 
            // InternalXpectParser.g:1498:2: ( rule__Literal__ValueAssignment_2_1 )
            // InternalXpectParser.g:1498:3: rule__Literal__ValueAssignment_2_1
            {
            pushFollow(FOLLOW_2);
            rule__Literal__ValueAssignment_2_1();

            state._fsp--;


            }

             after(grammarAccess.getLiteralAccess().getValueAssignment_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Literal__Group_2__1__Impl"


    // $ANTLR start "rule__ClassLiteral__Group__0"
    // InternalXpectParser.g:1507:1: rule__ClassLiteral__Group__0 : rule__ClassLiteral__Group__0__Impl rule__ClassLiteral__Group__1 ;
    public final void rule__ClassLiteral__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXpectParser.g:1511:1: ( rule__ClassLiteral__Group__0__Impl rule__ClassLiteral__Group__1 )
            // InternalXpectParser.g:1512:2: rule__ClassLiteral__Group__0__Impl rule__ClassLiteral__Group__1
            {
            pushFollow(FOLLOW_11);
            rule__ClassLiteral__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ClassLiteral__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ClassLiteral__Group__0"


    // $ANTLR start "rule__ClassLiteral__Group__0__Impl"
    // InternalXpectParser.g:1519:1: rule__ClassLiteral__Group__0__Impl : ( () ) ;
    public final void rule__ClassLiteral__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXpectParser.g:1523:1: ( ( () ) )
            // InternalXpectParser.g:1524:1: ( () )
            {
            // InternalXpectParser.g:1524:1: ( () )
            // InternalXpectParser.g:1525:2: ()
            {
             before(grammarAccess.getClassLiteralAccess().getClassLiteralAction_0()); 
            // InternalXpectParser.g:1526:2: ()
            // InternalXpectParser.g:1526:3: 
            {
            }

             after(grammarAccess.getClassLiteralAccess().getClassLiteralAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ClassLiteral__Group__0__Impl"


    // $ANTLR start "rule__ClassLiteral__Group__1"
    // InternalXpectParser.g:1534:1: rule__ClassLiteral__Group__1 : rule__ClassLiteral__Group__1__Impl ;
    public final void rule__ClassLiteral__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXpectParser.g:1538:1: ( rule__ClassLiteral__Group__1__Impl )
            // InternalXpectParser.g:1539:2: rule__ClassLiteral__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ClassLiteral__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ClassLiteral__Group__1"


    // $ANTLR start "rule__ClassLiteral__Group__1__Impl"
    // InternalXpectParser.g:1545:1: rule__ClassLiteral__Group__1__Impl : ( ( rule__ClassLiteral__TypeAssignment_1 ) ) ;
    public final void rule__ClassLiteral__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXpectParser.g:1549:1: ( ( ( rule__ClassLiteral__TypeAssignment_1 ) ) )
            // InternalXpectParser.g:1550:1: ( ( rule__ClassLiteral__TypeAssignment_1 ) )
            {
            // InternalXpectParser.g:1550:1: ( ( rule__ClassLiteral__TypeAssignment_1 ) )
            // InternalXpectParser.g:1551:2: ( rule__ClassLiteral__TypeAssignment_1 )
            {
             before(grammarAccess.getClassLiteralAccess().getTypeAssignment_1()); 
            // InternalXpectParser.g:1552:2: ( rule__ClassLiteral__TypeAssignment_1 )
            // InternalXpectParser.g:1552:3: rule__ClassLiteral__TypeAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__ClassLiteral__TypeAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getClassLiteralAccess().getTypeAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ClassLiteral__Group__1__Impl"


    // $ANTLR start "rule__XpectIgnore__Group__0"
    // InternalXpectParser.g:1561:1: rule__XpectIgnore__Group__0 : rule__XpectIgnore__Group__0__Impl rule__XpectIgnore__Group__1 ;
    public final void rule__XpectIgnore__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXpectParser.g:1565:1: ( rule__XpectIgnore__Group__0__Impl rule__XpectIgnore__Group__1 )
            // InternalXpectParser.g:1566:2: rule__XpectIgnore__Group__0__Impl rule__XpectIgnore__Group__1
            {
            pushFollow(FOLLOW_5);
            rule__XpectIgnore__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__XpectIgnore__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XpectIgnore__Group__0"


    // $ANTLR start "rule__XpectIgnore__Group__0__Impl"
    // InternalXpectParser.g:1573:1: rule__XpectIgnore__Group__0__Impl : ( () ) ;
    public final void rule__XpectIgnore__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXpectParser.g:1577:1: ( ( () ) )
            // InternalXpectParser.g:1578:1: ( () )
            {
            // InternalXpectParser.g:1578:1: ( () )
            // InternalXpectParser.g:1579:2: ()
            {
             before(grammarAccess.getXpectIgnoreAccess().getXpectIgnoreAction_0()); 
            // InternalXpectParser.g:1580:2: ()
            // InternalXpectParser.g:1580:3: 
            {
            }

             after(grammarAccess.getXpectIgnoreAccess().getXpectIgnoreAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XpectIgnore__Group__0__Impl"


    // $ANTLR start "rule__XpectIgnore__Group__1"
    // InternalXpectParser.g:1588:1: rule__XpectIgnore__Group__1 : rule__XpectIgnore__Group__1__Impl ;
    public final void rule__XpectIgnore__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXpectParser.g:1592:1: ( rule__XpectIgnore__Group__1__Impl )
            // InternalXpectParser.g:1593:2: rule__XpectIgnore__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__XpectIgnore__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XpectIgnore__Group__1"


    // $ANTLR start "rule__XpectIgnore__Group__1__Impl"
    // InternalXpectParser.g:1599:1: rule__XpectIgnore__Group__1__Impl : ( XPECT_IGNORE ) ;
    public final void rule__XpectIgnore__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXpectParser.g:1603:1: ( ( XPECT_IGNORE ) )
            // InternalXpectParser.g:1604:1: ( XPECT_IGNORE )
            {
            // InternalXpectParser.g:1604:1: ( XPECT_IGNORE )
            // InternalXpectParser.g:1605:2: XPECT_IGNORE
            {
             before(grammarAccess.getXpectIgnoreAccess().getXPECT_IGNOREKeyword_1()); 
            match(input,XPECT_IGNORE,FOLLOW_2); 
             after(grammarAccess.getXpectIgnoreAccess().getXPECT_IGNOREKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XpectIgnore__Group__1__Impl"


    // $ANTLR start "rule__Lexicalspace_Invocation__Group__0"
    // InternalXpectParser.g:1615:1: rule__Lexicalspace_Invocation__Group__0 : rule__Lexicalspace_Invocation__Group__0__Impl rule__Lexicalspace_Invocation__Group__1 ;
    public final void rule__Lexicalspace_Invocation__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXpectParser.g:1619:1: ( rule__Lexicalspace_Invocation__Group__0__Impl rule__Lexicalspace_Invocation__Group__1 )
            // InternalXpectParser.g:1620:2: rule__Lexicalspace_Invocation__Group__0__Impl rule__Lexicalspace_Invocation__Group__1
            {
            pushFollow(FOLLOW_18);
            rule__Lexicalspace_Invocation__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Lexicalspace_Invocation__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Lexicalspace_Invocation__Group__0"


    // $ANTLR start "rule__Lexicalspace_Invocation__Group__0__Impl"
    // InternalXpectParser.g:1627:1: rule__Lexicalspace_Invocation__Group__0__Impl : ( XPECT ) ;
    public final void rule__Lexicalspace_Invocation__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXpectParser.g:1631:1: ( ( XPECT ) )
            // InternalXpectParser.g:1632:1: ( XPECT )
            {
            // InternalXpectParser.g:1632:1: ( XPECT )
            // InternalXpectParser.g:1633:2: XPECT
            {
             before(grammarAccess.getLexicalspace_InvocationAccess().getXPECTKeyword_0()); 
            match(input,XPECT,FOLLOW_2); 
             after(grammarAccess.getLexicalspace_InvocationAccess().getXPECTKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Lexicalspace_Invocation__Group__0__Impl"


    // $ANTLR start "rule__Lexicalspace_Invocation__Group__1"
    // InternalXpectParser.g:1642:1: rule__Lexicalspace_Invocation__Group__1 : rule__Lexicalspace_Invocation__Group__1__Impl rule__Lexicalspace_Invocation__Group__2 ;
    public final void rule__Lexicalspace_Invocation__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXpectParser.g:1646:1: ( rule__Lexicalspace_Invocation__Group__1__Impl rule__Lexicalspace_Invocation__Group__2 )
            // InternalXpectParser.g:1647:2: rule__Lexicalspace_Invocation__Group__1__Impl rule__Lexicalspace_Invocation__Group__2
            {
            pushFollow(FOLLOW_18);
            rule__Lexicalspace_Invocation__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Lexicalspace_Invocation__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Lexicalspace_Invocation__Group__1"


    // $ANTLR start "rule__Lexicalspace_Invocation__Group__1__Impl"
    // InternalXpectParser.g:1654:1: rule__Lexicalspace_Invocation__Group__1__Impl : ( ( rule__Lexicalspace_Invocation__IgnoreAssignment_1 )? ) ;
    public final void rule__Lexicalspace_Invocation__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXpectParser.g:1658:1: ( ( ( rule__Lexicalspace_Invocation__IgnoreAssignment_1 )? ) )
            // InternalXpectParser.g:1659:1: ( ( rule__Lexicalspace_Invocation__IgnoreAssignment_1 )? )
            {
            // InternalXpectParser.g:1659:1: ( ( rule__Lexicalspace_Invocation__IgnoreAssignment_1 )? )
            // InternalXpectParser.g:1660:2: ( rule__Lexicalspace_Invocation__IgnoreAssignment_1 )?
            {
             before(grammarAccess.getLexicalspace_InvocationAccess().getIgnoreAssignment_1()); 
            // InternalXpectParser.g:1661:2: ( rule__Lexicalspace_Invocation__IgnoreAssignment_1 )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==ExclamationMark) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // InternalXpectParser.g:1661:3: rule__Lexicalspace_Invocation__IgnoreAssignment_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__Lexicalspace_Invocation__IgnoreAssignment_1();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getLexicalspace_InvocationAccess().getIgnoreAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Lexicalspace_Invocation__Group__1__Impl"


    // $ANTLR start "rule__Lexicalspace_Invocation__Group__2"
    // InternalXpectParser.g:1669:1: rule__Lexicalspace_Invocation__Group__2 : rule__Lexicalspace_Invocation__Group__2__Impl rule__Lexicalspace_Invocation__Group__3 ;
    public final void rule__Lexicalspace_Invocation__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXpectParser.g:1673:1: ( rule__Lexicalspace_Invocation__Group__2__Impl rule__Lexicalspace_Invocation__Group__3 )
            // InternalXpectParser.g:1674:2: rule__Lexicalspace_Invocation__Group__2__Impl rule__Lexicalspace_Invocation__Group__3
            {
            pushFollow(FOLLOW_18);
            rule__Lexicalspace_Invocation__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Lexicalspace_Invocation__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Lexicalspace_Invocation__Group__2"


    // $ANTLR start "rule__Lexicalspace_Invocation__Group__2__Impl"
    // InternalXpectParser.g:1681:1: rule__Lexicalspace_Invocation__Group__2__Impl : ( ( rule__Lexicalspace_Invocation__FixmeAssignment_2 )? ) ;
    public final void rule__Lexicalspace_Invocation__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXpectParser.g:1685:1: ( ( ( rule__Lexicalspace_Invocation__FixmeAssignment_2 )? ) )
            // InternalXpectParser.g:1686:1: ( ( rule__Lexicalspace_Invocation__FixmeAssignment_2 )? )
            {
            // InternalXpectParser.g:1686:1: ( ( rule__Lexicalspace_Invocation__FixmeAssignment_2 )? )
            // InternalXpectParser.g:1687:2: ( rule__Lexicalspace_Invocation__FixmeAssignment_2 )?
            {
             before(grammarAccess.getLexicalspace_InvocationAccess().getFixmeAssignment_2()); 
            // InternalXpectParser.g:1688:2: ( rule__Lexicalspace_Invocation__FixmeAssignment_2 )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==FIXME) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // InternalXpectParser.g:1688:3: rule__Lexicalspace_Invocation__FixmeAssignment_2
                    {
                    pushFollow(FOLLOW_2);
                    rule__Lexicalspace_Invocation__FixmeAssignment_2();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getLexicalspace_InvocationAccess().getFixmeAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Lexicalspace_Invocation__Group__2__Impl"


    // $ANTLR start "rule__Lexicalspace_Invocation__Group__3"
    // InternalXpectParser.g:1696:1: rule__Lexicalspace_Invocation__Group__3 : rule__Lexicalspace_Invocation__Group__3__Impl ;
    public final void rule__Lexicalspace_Invocation__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXpectParser.g:1700:1: ( rule__Lexicalspace_Invocation__Group__3__Impl )
            // InternalXpectParser.g:1701:2: rule__Lexicalspace_Invocation__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Lexicalspace_Invocation__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Lexicalspace_Invocation__Group__3"


    // $ANTLR start "rule__Lexicalspace_Invocation__Group__3__Impl"
    // InternalXpectParser.g:1707:1: rule__Lexicalspace_Invocation__Group__3__Impl : ( ( rule__Lexicalspace_Invocation__MethodAssignment_3 ) ) ;
    public final void rule__Lexicalspace_Invocation__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXpectParser.g:1711:1: ( ( ( rule__Lexicalspace_Invocation__MethodAssignment_3 ) ) )
            // InternalXpectParser.g:1712:1: ( ( rule__Lexicalspace_Invocation__MethodAssignment_3 ) )
            {
            // InternalXpectParser.g:1712:1: ( ( rule__Lexicalspace_Invocation__MethodAssignment_3 ) )
            // InternalXpectParser.g:1713:2: ( rule__Lexicalspace_Invocation__MethodAssignment_3 )
            {
             before(grammarAccess.getLexicalspace_InvocationAccess().getMethodAssignment_3()); 
            // InternalXpectParser.g:1714:2: ( rule__Lexicalspace_Invocation__MethodAssignment_3 )
            // InternalXpectParser.g:1714:3: rule__Lexicalspace_Invocation__MethodAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__Lexicalspace_Invocation__MethodAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getLexicalspace_InvocationAccess().getMethodAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Lexicalspace_Invocation__Group__3__Impl"


    // $ANTLR start "rule__QualifiedName__Group__0"
    // InternalXpectParser.g:1723:1: rule__QualifiedName__Group__0 : rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1 ;
    public final void rule__QualifiedName__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXpectParser.g:1727:1: ( rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1 )
            // InternalXpectParser.g:1728:2: rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1
            {
            pushFollow(FOLLOW_19);
            rule__QualifiedName__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__QualifiedName__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedName__Group__0"


    // $ANTLR start "rule__QualifiedName__Group__0__Impl"
    // InternalXpectParser.g:1735:1: rule__QualifiedName__Group__0__Impl : ( RULE_ID ) ;
    public final void rule__QualifiedName__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXpectParser.g:1739:1: ( ( RULE_ID ) )
            // InternalXpectParser.g:1740:1: ( RULE_ID )
            {
            // InternalXpectParser.g:1740:1: ( RULE_ID )
            // InternalXpectParser.g:1741:2: RULE_ID
            {
             before(grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedName__Group__0__Impl"


    // $ANTLR start "rule__QualifiedName__Group__1"
    // InternalXpectParser.g:1750:1: rule__QualifiedName__Group__1 : rule__QualifiedName__Group__1__Impl ;
    public final void rule__QualifiedName__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXpectParser.g:1754:1: ( rule__QualifiedName__Group__1__Impl )
            // InternalXpectParser.g:1755:2: rule__QualifiedName__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__QualifiedName__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedName__Group__1"


    // $ANTLR start "rule__QualifiedName__Group__1__Impl"
    // InternalXpectParser.g:1761:1: rule__QualifiedName__Group__1__Impl : ( ( rule__QualifiedName__Group_1__0 )* ) ;
    public final void rule__QualifiedName__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXpectParser.g:1765:1: ( ( ( rule__QualifiedName__Group_1__0 )* ) )
            // InternalXpectParser.g:1766:1: ( ( rule__QualifiedName__Group_1__0 )* )
            {
            // InternalXpectParser.g:1766:1: ( ( rule__QualifiedName__Group_1__0 )* )
            // InternalXpectParser.g:1767:2: ( rule__QualifiedName__Group_1__0 )*
            {
             before(grammarAccess.getQualifiedNameAccess().getGroup_1()); 
            // InternalXpectParser.g:1768:2: ( rule__QualifiedName__Group_1__0 )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( (LA18_0==FullStop) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // InternalXpectParser.g:1768:3: rule__QualifiedName__Group_1__0
            	    {
            	    pushFollow(FOLLOW_20);
            	    rule__QualifiedName__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop18;
                }
            } while (true);

             after(grammarAccess.getQualifiedNameAccess().getGroup_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedName__Group__1__Impl"


    // $ANTLR start "rule__QualifiedName__Group_1__0"
    // InternalXpectParser.g:1777:1: rule__QualifiedName__Group_1__0 : rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1 ;
    public final void rule__QualifiedName__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXpectParser.g:1781:1: ( rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1 )
            // InternalXpectParser.g:1782:2: rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1
            {
            pushFollow(FOLLOW_11);
            rule__QualifiedName__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__QualifiedName__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedName__Group_1__0"


    // $ANTLR start "rule__QualifiedName__Group_1__0__Impl"
    // InternalXpectParser.g:1789:1: rule__QualifiedName__Group_1__0__Impl : ( FullStop ) ;
    public final void rule__QualifiedName__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXpectParser.g:1793:1: ( ( FullStop ) )
            // InternalXpectParser.g:1794:1: ( FullStop )
            {
            // InternalXpectParser.g:1794:1: ( FullStop )
            // InternalXpectParser.g:1795:2: FullStop
            {
             before(grammarAccess.getQualifiedNameAccess().getFullStopKeyword_1_0()); 
            match(input,FullStop,FOLLOW_2); 
             after(grammarAccess.getQualifiedNameAccess().getFullStopKeyword_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedName__Group_1__0__Impl"


    // $ANTLR start "rule__QualifiedName__Group_1__1"
    // InternalXpectParser.g:1804:1: rule__QualifiedName__Group_1__1 : rule__QualifiedName__Group_1__1__Impl ;
    public final void rule__QualifiedName__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXpectParser.g:1808:1: ( rule__QualifiedName__Group_1__1__Impl )
            // InternalXpectParser.g:1809:2: rule__QualifiedName__Group_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__QualifiedName__Group_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedName__Group_1__1"


    // $ANTLR start "rule__QualifiedName__Group_1__1__Impl"
    // InternalXpectParser.g:1815:1: rule__QualifiedName__Group_1__1__Impl : ( RULE_ID ) ;
    public final void rule__QualifiedName__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXpectParser.g:1819:1: ( ( RULE_ID ) )
            // InternalXpectParser.g:1820:1: ( RULE_ID )
            {
            // InternalXpectParser.g:1820:1: ( RULE_ID )
            // InternalXpectParser.g:1821:2: RULE_ID
            {
             before(grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_1_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedName__Group_1__1__Impl"


    // $ANTLR start "rule__XpectFile__MembersAssignment_1_0_0"
    // InternalXpectParser.g:1831:1: rule__XpectFile__MembersAssignment_1_0_0 : ( ruleText ) ;
    public final void rule__XpectFile__MembersAssignment_1_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXpectParser.g:1835:1: ( ( ruleText ) )
            // InternalXpectParser.g:1836:2: ( ruleText )
            {
            // InternalXpectParser.g:1836:2: ( ruleText )
            // InternalXpectParser.g:1837:3: ruleText
            {
             before(grammarAccess.getXpectFileAccess().getMembersTextParserRuleCall_1_0_0_0()); 
            pushFollow(FOLLOW_2);
            ruleText();

            state._fsp--;

             after(grammarAccess.getXpectFileAccess().getMembersTextParserRuleCall_1_0_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XpectFile__MembersAssignment_1_0_0"


    // $ANTLR start "rule__XpectFile__MembersAssignment_1_0_1"
    // InternalXpectParser.g:1846:1: rule__XpectFile__MembersAssignment_1_0_1 : ( ruleMember ) ;
    public final void rule__XpectFile__MembersAssignment_1_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXpectParser.g:1850:1: ( ( ruleMember ) )
            // InternalXpectParser.g:1851:2: ( ruleMember )
            {
            // InternalXpectParser.g:1851:2: ( ruleMember )
            // InternalXpectParser.g:1852:3: ruleMember
            {
             before(grammarAccess.getXpectFileAccess().getMembersMemberParserRuleCall_1_0_1_0()); 
            pushFollow(FOLLOW_2);
            ruleMember();

            state._fsp--;

             after(grammarAccess.getXpectFileAccess().getMembersMemberParserRuleCall_1_0_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XpectFile__MembersAssignment_1_0_1"


    // $ANTLR start "rule__XpectFile__MembersAssignment_1_1"
    // InternalXpectParser.g:1861:1: rule__XpectFile__MembersAssignment_1_1 : ( ruleText ) ;
    public final void rule__XpectFile__MembersAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXpectParser.g:1865:1: ( ( ruleText ) )
            // InternalXpectParser.g:1866:2: ( ruleText )
            {
            // InternalXpectParser.g:1866:2: ( ruleText )
            // InternalXpectParser.g:1867:3: ruleText
            {
             before(grammarAccess.getXpectFileAccess().getMembersTextParserRuleCall_1_1_0()); 
            pushFollow(FOLLOW_2);
            ruleText();

            state._fsp--;

             after(grammarAccess.getXpectFileAccess().getMembersTextParserRuleCall_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__XpectFile__MembersAssignment_1_1"


    // $ANTLR start "rule__Text__TextAssignment"
    // InternalXpectParser.g:1876:1: rule__Text__TextAssignment : ( ruleAnyText ) ;
    public final void rule__Text__TextAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXpectParser.g:1880:1: ( ( ruleAnyText ) )
            // InternalXpectParser.g:1881:2: ( ruleAnyText )
            {
            // InternalXpectParser.g:1881:2: ( ruleAnyText )
            // InternalXpectParser.g:1882:3: ruleAnyText
            {
             before(grammarAccess.getTextAccess().getTextAnyTextParserRuleCall_0()); 
            pushFollow(FOLLOW_2);
            ruleAnyText();

            state._fsp--;

             after(grammarAccess.getTextAccess().getTextAnyTextParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Text__TextAssignment"


    // $ANTLR start "rule__Lexicalspace_Setup__DeclaredSuiteAssignment_2"
    // InternalXpectParser.g:1891:1: rule__Lexicalspace_Setup__DeclaredSuiteAssignment_2 : ( ( ruleQualifiedName ) ) ;
    public final void rule__Lexicalspace_Setup__DeclaredSuiteAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXpectParser.g:1895:1: ( ( ( ruleQualifiedName ) ) )
            // InternalXpectParser.g:1896:2: ( ( ruleQualifiedName ) )
            {
            // InternalXpectParser.g:1896:2: ( ( ruleQualifiedName ) )
            // InternalXpectParser.g:1897:3: ( ruleQualifiedName )
            {
             before(grammarAccess.getLexicalspace_SetupAccess().getDeclaredSuiteJvmDeclaredTypeCrossReference_2_0()); 
            // InternalXpectParser.g:1898:3: ( ruleQualifiedName )
            // InternalXpectParser.g:1899:4: ruleQualifiedName
            {
             before(grammarAccess.getLexicalspace_SetupAccess().getDeclaredSuiteJvmDeclaredTypeQualifiedNameParserRuleCall_2_0_1()); 
            pushFollow(FOLLOW_2);
            ruleQualifiedName();

            state._fsp--;

             after(grammarAccess.getLexicalspace_SetupAccess().getDeclaredSuiteJvmDeclaredTypeQualifiedNameParserRuleCall_2_0_1()); 

            }

             after(grammarAccess.getLexicalspace_SetupAccess().getDeclaredSuiteJvmDeclaredTypeCrossReference_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Lexicalspace_Setup__DeclaredSuiteAssignment_2"


    // $ANTLR start "rule__Lexicalspace_Setup__AssignmentsAssignment_3"
    // InternalXpectParser.g:1910:1: rule__Lexicalspace_Setup__AssignmentsAssignment_3 : ( ruleAssignment ) ;
    public final void rule__Lexicalspace_Setup__AssignmentsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXpectParser.g:1914:1: ( ( ruleAssignment ) )
            // InternalXpectParser.g:1915:2: ( ruleAssignment )
            {
            // InternalXpectParser.g:1915:2: ( ruleAssignment )
            // InternalXpectParser.g:1916:3: ruleAssignment
            {
             before(grammarAccess.getLexicalspace_SetupAccess().getAssignmentsAssignmentParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleAssignment();

            state._fsp--;

             after(grammarAccess.getLexicalspace_SetupAccess().getAssignmentsAssignmentParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Lexicalspace_Setup__AssignmentsAssignment_3"


    // $ANTLR start "rule__Assignment__DeclaredTargetAssignment_0_0"
    // InternalXpectParser.g:1925:1: rule__Assignment__DeclaredTargetAssignment_0_0 : ( ( RULE_ID ) ) ;
    public final void rule__Assignment__DeclaredTargetAssignment_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXpectParser.g:1929:1: ( ( ( RULE_ID ) ) )
            // InternalXpectParser.g:1930:2: ( ( RULE_ID ) )
            {
            // InternalXpectParser.g:1930:2: ( ( RULE_ID ) )
            // InternalXpectParser.g:1931:3: ( RULE_ID )
            {
             before(grammarAccess.getAssignmentAccess().getDeclaredTargetJvmOperationCrossReference_0_0_0()); 
            // InternalXpectParser.g:1932:3: ( RULE_ID )
            // InternalXpectParser.g:1933:4: RULE_ID
            {
             before(grammarAccess.getAssignmentAccess().getDeclaredTargetJvmOperationIDTerminalRuleCall_0_0_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getAssignmentAccess().getDeclaredTargetJvmOperationIDTerminalRuleCall_0_0_0_1()); 

            }

             after(grammarAccess.getAssignmentAccess().getDeclaredTargetJvmOperationCrossReference_0_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Assignment__DeclaredTargetAssignment_0_0"


    // $ANTLR start "rule__Assignment__ValueAssignment_0_2"
    // InternalXpectParser.g:1944:1: rule__Assignment__ValueAssignment_0_2 : ( ruleValue ) ;
    public final void rule__Assignment__ValueAssignment_0_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXpectParser.g:1948:1: ( ( ruleValue ) )
            // InternalXpectParser.g:1949:2: ( ruleValue )
            {
            // InternalXpectParser.g:1949:2: ( ruleValue )
            // InternalXpectParser.g:1950:3: ruleValue
            {
             before(grammarAccess.getAssignmentAccess().getValueValueParserRuleCall_0_2_0()); 
            pushFollow(FOLLOW_2);
            ruleValue();

            state._fsp--;

             after(grammarAccess.getAssignmentAccess().getValueValueParserRuleCall_0_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Assignment__ValueAssignment_0_2"


    // $ANTLR start "rule__Assignment__ValueAssignment_1"
    // InternalXpectParser.g:1959:1: rule__Assignment__ValueAssignment_1 : ( ruleComponentLong ) ;
    public final void rule__Assignment__ValueAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXpectParser.g:1963:1: ( ( ruleComponentLong ) )
            // InternalXpectParser.g:1964:2: ( ruleComponentLong )
            {
            // InternalXpectParser.g:1964:2: ( ruleComponentLong )
            // InternalXpectParser.g:1965:3: ruleComponentLong
            {
             before(grammarAccess.getAssignmentAccess().getValueComponentLongParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleComponentLong();

            state._fsp--;

             after(grammarAccess.getAssignmentAccess().getValueComponentLongParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Assignment__ValueAssignment_1"


    // $ANTLR start "rule__ComponentLong__ComponentClassAssignment_1"
    // InternalXpectParser.g:1974:1: rule__ComponentLong__ComponentClassAssignment_1 : ( ( ruleQualifiedName ) ) ;
    public final void rule__ComponentLong__ComponentClassAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXpectParser.g:1978:1: ( ( ( ruleQualifiedName ) ) )
            // InternalXpectParser.g:1979:2: ( ( ruleQualifiedName ) )
            {
            // InternalXpectParser.g:1979:2: ( ( ruleQualifiedName ) )
            // InternalXpectParser.g:1980:3: ( ruleQualifiedName )
            {
             before(grammarAccess.getComponentLongAccess().getComponentClassJvmDeclaredTypeCrossReference_1_0()); 
            // InternalXpectParser.g:1981:3: ( ruleQualifiedName )
            // InternalXpectParser.g:1982:4: ruleQualifiedName
            {
             before(grammarAccess.getComponentLongAccess().getComponentClassJvmDeclaredTypeQualifiedNameParserRuleCall_1_0_1()); 
            pushFollow(FOLLOW_2);
            ruleQualifiedName();

            state._fsp--;

             after(grammarAccess.getComponentLongAccess().getComponentClassJvmDeclaredTypeQualifiedNameParserRuleCall_1_0_1()); 

            }

             after(grammarAccess.getComponentLongAccess().getComponentClassJvmDeclaredTypeCrossReference_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComponentLong__ComponentClassAssignment_1"


    // $ANTLR start "rule__ComponentLong__ParametersAssignment_2"
    // InternalXpectParser.g:1993:1: rule__ComponentLong__ParametersAssignment_2 : ( ruleLiteral ) ;
    public final void rule__ComponentLong__ParametersAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXpectParser.g:1997:1: ( ( ruleLiteral ) )
            // InternalXpectParser.g:1998:2: ( ruleLiteral )
            {
            // InternalXpectParser.g:1998:2: ( ruleLiteral )
            // InternalXpectParser.g:1999:3: ruleLiteral
            {
             before(grammarAccess.getComponentLongAccess().getParametersLiteralParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleLiteral();

            state._fsp--;

             after(grammarAccess.getComponentLongAccess().getParametersLiteralParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComponentLong__ParametersAssignment_2"


    // $ANTLR start "rule__ComponentLong__AssignmentsAssignment_3_1"
    // InternalXpectParser.g:2008:1: rule__ComponentLong__AssignmentsAssignment_3_1 : ( ruleAssignment ) ;
    public final void rule__ComponentLong__AssignmentsAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXpectParser.g:2012:1: ( ( ruleAssignment ) )
            // InternalXpectParser.g:2013:2: ( ruleAssignment )
            {
            // InternalXpectParser.g:2013:2: ( ruleAssignment )
            // InternalXpectParser.g:2014:3: ruleAssignment
            {
             before(grammarAccess.getComponentLongAccess().getAssignmentsAssignmentParserRuleCall_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleAssignment();

            state._fsp--;

             after(grammarAccess.getComponentLongAccess().getAssignmentsAssignmentParserRuleCall_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComponentLong__AssignmentsAssignment_3_1"


    // $ANTLR start "rule__ComponentInline__ComponentClassAssignment_1_0"
    // InternalXpectParser.g:2023:1: rule__ComponentInline__ComponentClassAssignment_1_0 : ( ( ruleQualifiedName ) ) ;
    public final void rule__ComponentInline__ComponentClassAssignment_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXpectParser.g:2027:1: ( ( ( ruleQualifiedName ) ) )
            // InternalXpectParser.g:2028:2: ( ( ruleQualifiedName ) )
            {
            // InternalXpectParser.g:2028:2: ( ( ruleQualifiedName ) )
            // InternalXpectParser.g:2029:3: ( ruleQualifiedName )
            {
             before(grammarAccess.getComponentInlineAccess().getComponentClassJvmDeclaredTypeCrossReference_1_0_0()); 
            // InternalXpectParser.g:2030:3: ( ruleQualifiedName )
            // InternalXpectParser.g:2031:4: ruleQualifiedName
            {
             before(grammarAccess.getComponentInlineAccess().getComponentClassJvmDeclaredTypeQualifiedNameParserRuleCall_1_0_0_1()); 
            pushFollow(FOLLOW_2);
            ruleQualifiedName();

            state._fsp--;

             after(grammarAccess.getComponentInlineAccess().getComponentClassJvmDeclaredTypeQualifiedNameParserRuleCall_1_0_0_1()); 

            }

             after(grammarAccess.getComponentInlineAccess().getComponentClassJvmDeclaredTypeCrossReference_1_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComponentInline__ComponentClassAssignment_1_0"


    // $ANTLR start "rule__ComponentInline__ParametersAssignment_1_1"
    // InternalXpectParser.g:2042:1: rule__ComponentInline__ParametersAssignment_1_1 : ( ruleLiteral ) ;
    public final void rule__ComponentInline__ParametersAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXpectParser.g:2046:1: ( ( ruleLiteral ) )
            // InternalXpectParser.g:2047:2: ( ruleLiteral )
            {
            // InternalXpectParser.g:2047:2: ( ruleLiteral )
            // InternalXpectParser.g:2048:3: ruleLiteral
            {
             before(grammarAccess.getComponentInlineAccess().getParametersLiteralParserRuleCall_1_1_0()); 
            pushFollow(FOLLOW_2);
            ruleLiteral();

            state._fsp--;

             after(grammarAccess.getComponentInlineAccess().getParametersLiteralParserRuleCall_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComponentInline__ParametersAssignment_1_1"


    // $ANTLR start "rule__ComponentInline__AssignmentsAssignment_2_1"
    // InternalXpectParser.g:2057:1: rule__ComponentInline__AssignmentsAssignment_2_1 : ( ruleAssignment ) ;
    public final void rule__ComponentInline__AssignmentsAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXpectParser.g:2061:1: ( ( ruleAssignment ) )
            // InternalXpectParser.g:2062:2: ( ruleAssignment )
            {
            // InternalXpectParser.g:2062:2: ( ruleAssignment )
            // InternalXpectParser.g:2063:3: ruleAssignment
            {
             before(grammarAccess.getComponentInlineAccess().getAssignmentsAssignmentParserRuleCall_2_1_0()); 
            pushFollow(FOLLOW_2);
            ruleAssignment();

            state._fsp--;

             after(grammarAccess.getComponentInlineAccess().getAssignmentsAssignmentParserRuleCall_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ComponentInline__AssignmentsAssignment_2_1"


    // $ANTLR start "rule__Literal__ValueAssignment_0_1_0"
    // InternalXpectParser.g:2072:1: rule__Literal__ValueAssignment_0_1_0 : ( ( True ) ) ;
    public final void rule__Literal__ValueAssignment_0_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXpectParser.g:2076:1: ( ( ( True ) ) )
            // InternalXpectParser.g:2077:2: ( ( True ) )
            {
            // InternalXpectParser.g:2077:2: ( ( True ) )
            // InternalXpectParser.g:2078:3: ( True )
            {
             before(grammarAccess.getLiteralAccess().getValueTrueKeyword_0_1_0_0()); 
            // InternalXpectParser.g:2079:3: ( True )
            // InternalXpectParser.g:2080:4: True
            {
             before(grammarAccess.getLiteralAccess().getValueTrueKeyword_0_1_0_0()); 
            match(input,True,FOLLOW_2); 
             after(grammarAccess.getLiteralAccess().getValueTrueKeyword_0_1_0_0()); 

            }

             after(grammarAccess.getLiteralAccess().getValueTrueKeyword_0_1_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Literal__ValueAssignment_0_1_0"


    // $ANTLR start "rule__Literal__ValueAssignment_1_1"
    // InternalXpectParser.g:2091:1: rule__Literal__ValueAssignment_1_1 : ( RULE_INT ) ;
    public final void rule__Literal__ValueAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXpectParser.g:2095:1: ( ( RULE_INT ) )
            // InternalXpectParser.g:2096:2: ( RULE_INT )
            {
            // InternalXpectParser.g:2096:2: ( RULE_INT )
            // InternalXpectParser.g:2097:3: RULE_INT
            {
             before(grammarAccess.getLiteralAccess().getValueINTTerminalRuleCall_1_1_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getLiteralAccess().getValueINTTerminalRuleCall_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Literal__ValueAssignment_1_1"


    // $ANTLR start "rule__Literal__ValueAssignment_2_1"
    // InternalXpectParser.g:2106:1: rule__Literal__ValueAssignment_2_1 : ( RULE_STRING ) ;
    public final void rule__Literal__ValueAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXpectParser.g:2110:1: ( ( RULE_STRING ) )
            // InternalXpectParser.g:2111:2: ( RULE_STRING )
            {
            // InternalXpectParser.g:2111:2: ( RULE_STRING )
            // InternalXpectParser.g:2112:3: RULE_STRING
            {
             before(grammarAccess.getLiteralAccess().getValueSTRINGTerminalRuleCall_2_1_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getLiteralAccess().getValueSTRINGTerminalRuleCall_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Literal__ValueAssignment_2_1"


    // $ANTLR start "rule__ClassLiteral__TypeAssignment_1"
    // InternalXpectParser.g:2121:1: rule__ClassLiteral__TypeAssignment_1 : ( ( ruleQualifiedName ) ) ;
    public final void rule__ClassLiteral__TypeAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXpectParser.g:2125:1: ( ( ( ruleQualifiedName ) ) )
            // InternalXpectParser.g:2126:2: ( ( ruleQualifiedName ) )
            {
            // InternalXpectParser.g:2126:2: ( ( ruleQualifiedName ) )
            // InternalXpectParser.g:2127:3: ( ruleQualifiedName )
            {
             before(grammarAccess.getClassLiteralAccess().getTypeJvmDeclaredTypeCrossReference_1_0()); 
            // InternalXpectParser.g:2128:3: ( ruleQualifiedName )
            // InternalXpectParser.g:2129:4: ruleQualifiedName
            {
             before(grammarAccess.getClassLiteralAccess().getTypeJvmDeclaredTypeQualifiedNameParserRuleCall_1_0_1()); 
            pushFollow(FOLLOW_2);
            ruleQualifiedName();

            state._fsp--;

             after(grammarAccess.getClassLiteralAccess().getTypeJvmDeclaredTypeQualifiedNameParserRuleCall_1_0_1()); 

            }

             after(grammarAccess.getClassLiteralAccess().getTypeJvmDeclaredTypeCrossReference_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ClassLiteral__TypeAssignment_1"


    // $ANTLR start "rule__Lexicalspace_Invocation__IgnoreAssignment_1"
    // InternalXpectParser.g:2140:1: rule__Lexicalspace_Invocation__IgnoreAssignment_1 : ( ( ExclamationMark ) ) ;
    public final void rule__Lexicalspace_Invocation__IgnoreAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXpectParser.g:2144:1: ( ( ( ExclamationMark ) ) )
            // InternalXpectParser.g:2145:2: ( ( ExclamationMark ) )
            {
            // InternalXpectParser.g:2145:2: ( ( ExclamationMark ) )
            // InternalXpectParser.g:2146:3: ( ExclamationMark )
            {
             before(grammarAccess.getLexicalspace_InvocationAccess().getIgnoreExclamationMarkKeyword_1_0()); 
            // InternalXpectParser.g:2147:3: ( ExclamationMark )
            // InternalXpectParser.g:2148:4: ExclamationMark
            {
             before(grammarAccess.getLexicalspace_InvocationAccess().getIgnoreExclamationMarkKeyword_1_0()); 
            match(input,ExclamationMark,FOLLOW_2); 
             after(grammarAccess.getLexicalspace_InvocationAccess().getIgnoreExclamationMarkKeyword_1_0()); 

            }

             after(grammarAccess.getLexicalspace_InvocationAccess().getIgnoreExclamationMarkKeyword_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Lexicalspace_Invocation__IgnoreAssignment_1"


    // $ANTLR start "rule__Lexicalspace_Invocation__FixmeAssignment_2"
    // InternalXpectParser.g:2159:1: rule__Lexicalspace_Invocation__FixmeAssignment_2 : ( ( FIXME ) ) ;
    public final void rule__Lexicalspace_Invocation__FixmeAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXpectParser.g:2163:1: ( ( ( FIXME ) ) )
            // InternalXpectParser.g:2164:2: ( ( FIXME ) )
            {
            // InternalXpectParser.g:2164:2: ( ( FIXME ) )
            // InternalXpectParser.g:2165:3: ( FIXME )
            {
             before(grammarAccess.getLexicalspace_InvocationAccess().getFixmeFIXMEKeyword_2_0()); 
            // InternalXpectParser.g:2166:3: ( FIXME )
            // InternalXpectParser.g:2167:4: FIXME
            {
             before(grammarAccess.getLexicalspace_InvocationAccess().getFixmeFIXMEKeyword_2_0()); 
            match(input,FIXME,FOLLOW_2); 
             after(grammarAccess.getLexicalspace_InvocationAccess().getFixmeFIXMEKeyword_2_0()); 

            }

             after(grammarAccess.getLexicalspace_InvocationAccess().getFixmeFIXMEKeyword_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Lexicalspace_Invocation__FixmeAssignment_2"


    // $ANTLR start "rule__Lexicalspace_Invocation__MethodAssignment_3"
    // InternalXpectParser.g:2178:1: rule__Lexicalspace_Invocation__MethodAssignment_3 : ( ( RULE_INVOCATION ) ) ;
    public final void rule__Lexicalspace_Invocation__MethodAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXpectParser.g:2182:1: ( ( ( RULE_INVOCATION ) ) )
            // InternalXpectParser.g:2183:2: ( ( RULE_INVOCATION ) )
            {
            // InternalXpectParser.g:2183:2: ( ( RULE_INVOCATION ) )
            // InternalXpectParser.g:2184:3: ( RULE_INVOCATION )
            {
             before(grammarAccess.getLexicalspace_InvocationAccess().getMethodXjmXpectMethodCrossReference_3_0()); 
            // InternalXpectParser.g:2185:3: ( RULE_INVOCATION )
            // InternalXpectParser.g:2186:4: RULE_INVOCATION
            {
             before(grammarAccess.getLexicalspace_InvocationAccess().getMethodXjmXpectMethodINVOCATIONTerminalRuleCall_3_0_1()); 
            match(input,RULE_INVOCATION,FOLLOW_2); 
             after(grammarAccess.getLexicalspace_InvocationAccess().getMethodXjmXpectMethodINVOCATIONTerminalRuleCall_3_0_1()); 

            }

             after(grammarAccess.getLexicalspace_InvocationAccess().getMethodXjmXpectMethodCrossReference_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Lexicalspace_Invocation__MethodAssignment_3"

    // Delegated rules


    protected DFA4 dfa4 = new DFA4(this);
    protected DFA8 dfa8 = new DFA8(this);
    protected DFA9 dfa9 = new DFA9(this);
    static final String dfa_1s = "\7\uffff";
    static final String dfa_2s = "\2\uffff\1\5\3\uffff\1\5";
    static final String dfa_3s = "\1\11\1\uffff\1\6\1\uffff\1\20\1\uffff\1\6";
    static final String dfa_4s = "\1\23\1\uffff\1\23\1\uffff\1\20\1\uffff\1\23";
    static final String dfa_5s = "\1\uffff\1\1\1\uffff\1\3\1\uffff\1\2\1\uffff";
    static final String dfa_6s = "\7\uffff}>";
    static final String[] dfa_7s = {
            "\2\1\3\uffff\1\3\1\uffff\1\2\1\uffff\2\1",
            "",
            "\1\5\2\uffff\2\3\1\uffff\1\4\1\uffff\1\3\2\5\1\uffff\2\3",
            "",
            "\1\6",
            "",
            "\1\5\2\uffff\2\3\1\uffff\1\4\1\uffff\1\3\2\5\1\uffff\2\3"
    };

    static final short[] dfa_1 = DFA.unpackEncodedString(dfa_1s);
    static final short[] dfa_2 = DFA.unpackEncodedString(dfa_2s);
    static final char[] dfa_3 = DFA.unpackEncodedStringToUnsignedChars(dfa_3s);
    static final char[] dfa_4 = DFA.unpackEncodedStringToUnsignedChars(dfa_4s);
    static final short[] dfa_5 = DFA.unpackEncodedString(dfa_5s);
    static final short[] dfa_6 = DFA.unpackEncodedString(dfa_6s);
    static final short[][] dfa_7 = unpackEncodedStringArray(dfa_7s);

    class DFA4 extends DFA {

        public DFA4(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 4;
            this.eot = dfa_1;
            this.eof = dfa_2;
            this.min = dfa_3;
            this.max = dfa_4;
            this.accept = dfa_5;
            this.special = dfa_6;
            this.transition = dfa_7;
        }
        public String getDescription() {
            return "487:1: rule__Value__Alternatives : ( ( ruleLiteral ) | ( ruleClassLiteral ) | ( ruleComponentInline ) );";
        }
    }
    static final String dfa_8s = "\5\uffff";
    static final String dfa_9s = "\1\uffff\2\4\2\uffff";
    static final String dfa_10s = "\1\27\2\4\2\uffff";
    static final String dfa_11s = "\3\27\2\uffff";
    static final String dfa_12s = "\3\uffff\1\1\1\2";
    static final String dfa_13s = "\5\uffff}>";
    static final String[] dfa_14s = {
            "\1\1",
            "\2\3\2\uffff\1\3\16\uffff\1\2",
            "\2\3\2\uffff\1\3\16\uffff\1\2",
            "",
            ""
    };

    static final short[] dfa_8 = DFA.unpackEncodedString(dfa_8s);
    static final short[] dfa_9 = DFA.unpackEncodedString(dfa_9s);
    static final char[] dfa_10 = DFA.unpackEncodedStringToUnsignedChars(dfa_10s);
    static final char[] dfa_11 = DFA.unpackEncodedStringToUnsignedChars(dfa_11s);
    static final short[] dfa_12 = DFA.unpackEncodedString(dfa_12s);
    static final short[] dfa_13 = DFA.unpackEncodedString(dfa_13s);
    static final short[][] dfa_14 = unpackEncodedStringArray(dfa_14s);

    class DFA8 extends DFA {

        public DFA8(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 8;
            this.eot = dfa_8;
            this.eof = dfa_9;
            this.min = dfa_10;
            this.max = dfa_11;
            this.accept = dfa_12;
            this.special = dfa_13;
            this.transition = dfa_14;
        }
        public String getDescription() {
            return "()* loopback of 635:2: ( rule__XpectFile__Group_1_0__0 )*";
        }
    }
    static final String dfa_15s = "\6\uffff";
    static final String dfa_16s = "\2\6\1\uffff\1\20\1\uffff\1\6";
    static final String dfa_17s = "\1\20\1\23\1\uffff\1\20\1\uffff\1\23";
    static final String dfa_18s = "\2\uffff\1\2\1\uffff\1\1\1\uffff";
    static final String dfa_19s = "\6\uffff}>";
    static final String[] dfa_20s = {
            "\1\2\11\uffff\1\1",
            "\1\4\2\uffff\2\2\1\uffff\1\3\2\2\1\uffff\1\4\1\uffff\2\2",
            "",
            "\1\5",
            "",
            "\1\4\2\uffff\2\2\1\uffff\1\3\1\uffff\1\2\1\uffff\1\4\1\uffff\2\2"
    };

    static final short[] dfa_15 = DFA.unpackEncodedString(dfa_15s);
    static final char[] dfa_16 = DFA.unpackEncodedStringToUnsignedChars(dfa_16s);
    static final char[] dfa_17 = DFA.unpackEncodedStringToUnsignedChars(dfa_17s);
    static final short[] dfa_18 = DFA.unpackEncodedString(dfa_18s);
    static final short[] dfa_19 = DFA.unpackEncodedString(dfa_19s);
    static final short[][] dfa_20 = unpackEncodedStringArray(dfa_20s);

    class DFA9 extends DFA {

        public DFA9(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 9;
            this.eot = dfa_15;
            this.eof = dfa_15;
            this.min = dfa_16;
            this.max = dfa_17;
            this.accept = dfa_18;
            this.special = dfa_19;
            this.transition = dfa_20;
        }
        public String getDescription() {
            return "797:2: ( rule__Lexicalspace_Setup__DeclaredSuiteAssignment_2 )?";
        }
    }
 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000800002L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000000130L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000010040L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000010002L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x00000000000D4600L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x00000000000C4600L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x00000000000C0602L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000018000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x00000000000C0600L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000000600L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000000020880L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000000001002L});

}