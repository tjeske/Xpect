package org.eclipse.xpect.ui.contentassist.antlr.internal; 

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
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.DFA;
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
    // InternalXpectParser.g:75:1: entryRuleXpectFile : ruleXpectFile EOF ;
    public final void entryRuleXpectFile() throws RecognitionException {
        try {
            // InternalXpectParser.g:76:1: ( ruleXpectFile EOF )
            // InternalXpectParser.g:77:1: ruleXpectFile EOF
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
    // InternalXpectParser.g:84:1: ruleXpectFile : ( ( rule__XpectFile__Group__0 ) ) ;
    public final void ruleXpectFile() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalXpectParser.g:88:5: ( ( ( rule__XpectFile__Group__0 ) ) )
            // InternalXpectParser.g:89:1: ( ( rule__XpectFile__Group__0 ) )
            {
            // InternalXpectParser.g:89:1: ( ( rule__XpectFile__Group__0 ) )
            // InternalXpectParser.g:90:1: ( rule__XpectFile__Group__0 )
            {
             before(grammarAccess.getXpectFileAccess().getGroup()); 
            // InternalXpectParser.g:91:1: ( rule__XpectFile__Group__0 )
            // InternalXpectParser.g:91:2: rule__XpectFile__Group__0
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
    // InternalXpectParser.g:103:1: entryRuleMember : ruleMember EOF ;
    public final void entryRuleMember() throws RecognitionException {
        try {
            // InternalXpectParser.g:104:1: ( ruleMember EOF )
            // InternalXpectParser.g:105:1: ruleMember EOF
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
    // InternalXpectParser.g:112:1: ruleMember : ( ( rule__Member__Alternatives ) ) ;
    public final void ruleMember() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalXpectParser.g:116:5: ( ( ( rule__Member__Alternatives ) ) )
            // InternalXpectParser.g:117:1: ( ( rule__Member__Alternatives ) )
            {
            // InternalXpectParser.g:117:1: ( ( rule__Member__Alternatives ) )
            // InternalXpectParser.g:118:1: ( rule__Member__Alternatives )
            {
             before(grammarAccess.getMemberAccess().getAlternatives()); 
            // InternalXpectParser.g:119:1: ( rule__Member__Alternatives )
            // InternalXpectParser.g:119:2: rule__Member__Alternatives
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
    // InternalXpectParser.g:131:1: entryRuleText : ruleText EOF ;
    public final void entryRuleText() throws RecognitionException {
        try {
            // InternalXpectParser.g:132:1: ( ruleText EOF )
            // InternalXpectParser.g:133:1: ruleText EOF
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
    // InternalXpectParser.g:140:1: ruleText : ( ( rule__Text__TextAssignment ) ) ;
    public final void ruleText() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalXpectParser.g:144:5: ( ( ( rule__Text__TextAssignment ) ) )
            // InternalXpectParser.g:145:1: ( ( rule__Text__TextAssignment ) )
            {
            // InternalXpectParser.g:145:1: ( ( rule__Text__TextAssignment ) )
            // InternalXpectParser.g:146:1: ( rule__Text__TextAssignment )
            {
             before(grammarAccess.getTextAccess().getTextAssignment()); 
            // InternalXpectParser.g:147:1: ( rule__Text__TextAssignment )
            // InternalXpectParser.g:147:2: rule__Text__TextAssignment
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
    // InternalXpectParser.g:159:1: entryRuleLexicalspace_Setup : ruleLexicalspace_Setup EOF ;
    public final void entryRuleLexicalspace_Setup() throws RecognitionException {

        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT");

        try {
            // InternalXpectParser.g:163:1: ( ruleLexicalspace_Setup EOF )
            // InternalXpectParser.g:164:1: ruleLexicalspace_Setup EOF
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
    // InternalXpectParser.g:174:1: ruleLexicalspace_Setup : ( ( rule__Lexicalspace_Setup__Group__0 ) ) ;
    public final void ruleLexicalspace_Setup() throws RecognitionException {

        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT");
        		int stackSize = keepStackSize();
            
        try {
            // InternalXpectParser.g:179:5: ( ( ( rule__Lexicalspace_Setup__Group__0 ) ) )
            // InternalXpectParser.g:180:1: ( ( rule__Lexicalspace_Setup__Group__0 ) )
            {
            // InternalXpectParser.g:180:1: ( ( rule__Lexicalspace_Setup__Group__0 ) )
            // InternalXpectParser.g:181:1: ( rule__Lexicalspace_Setup__Group__0 )
            {
             before(grammarAccess.getLexicalspace_SetupAccess().getGroup()); 
            // InternalXpectParser.g:182:1: ( rule__Lexicalspace_Setup__Group__0 )
            // InternalXpectParser.g:182:2: rule__Lexicalspace_Setup__Group__0
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
    // InternalXpectParser.g:195:1: entryRuleAssignment : ruleAssignment EOF ;
    public final void entryRuleAssignment() throws RecognitionException {
        try {
            // InternalXpectParser.g:196:1: ( ruleAssignment EOF )
            // InternalXpectParser.g:197:1: ruleAssignment EOF
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
    // InternalXpectParser.g:204:1: ruleAssignment : ( ( rule__Assignment__Alternatives ) ) ;
    public final void ruleAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalXpectParser.g:208:5: ( ( ( rule__Assignment__Alternatives ) ) )
            // InternalXpectParser.g:209:1: ( ( rule__Assignment__Alternatives ) )
            {
            // InternalXpectParser.g:209:1: ( ( rule__Assignment__Alternatives ) )
            // InternalXpectParser.g:210:1: ( rule__Assignment__Alternatives )
            {
             before(grammarAccess.getAssignmentAccess().getAlternatives()); 
            // InternalXpectParser.g:211:1: ( rule__Assignment__Alternatives )
            // InternalXpectParser.g:211:2: rule__Assignment__Alternatives
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
    // InternalXpectParser.g:223:1: entryRuleValue : ruleValue EOF ;
    public final void entryRuleValue() throws RecognitionException {
        try {
            // InternalXpectParser.g:224:1: ( ruleValue EOF )
            // InternalXpectParser.g:225:1: ruleValue EOF
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
    // InternalXpectParser.g:232:1: ruleValue : ( ( rule__Value__Alternatives ) ) ;
    public final void ruleValue() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalXpectParser.g:236:5: ( ( ( rule__Value__Alternatives ) ) )
            // InternalXpectParser.g:237:1: ( ( rule__Value__Alternatives ) )
            {
            // InternalXpectParser.g:237:1: ( ( rule__Value__Alternatives ) )
            // InternalXpectParser.g:238:1: ( rule__Value__Alternatives )
            {
             before(grammarAccess.getValueAccess().getAlternatives()); 
            // InternalXpectParser.g:239:1: ( rule__Value__Alternatives )
            // InternalXpectParser.g:239:2: rule__Value__Alternatives
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
    // InternalXpectParser.g:251:1: entryRuleComponentLong : ruleComponentLong EOF ;
    public final void entryRuleComponentLong() throws RecognitionException {
        try {
            // InternalXpectParser.g:252:1: ( ruleComponentLong EOF )
            // InternalXpectParser.g:253:1: ruleComponentLong EOF
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
    // InternalXpectParser.g:260:1: ruleComponentLong : ( ( rule__ComponentLong__Group__0 ) ) ;
    public final void ruleComponentLong() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalXpectParser.g:264:5: ( ( ( rule__ComponentLong__Group__0 ) ) )
            // InternalXpectParser.g:265:1: ( ( rule__ComponentLong__Group__0 ) )
            {
            // InternalXpectParser.g:265:1: ( ( rule__ComponentLong__Group__0 ) )
            // InternalXpectParser.g:266:1: ( rule__ComponentLong__Group__0 )
            {
             before(grammarAccess.getComponentLongAccess().getGroup()); 
            // InternalXpectParser.g:267:1: ( rule__ComponentLong__Group__0 )
            // InternalXpectParser.g:267:2: rule__ComponentLong__Group__0
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
    // InternalXpectParser.g:279:1: entryRuleComponentInline : ruleComponentInline EOF ;
    public final void entryRuleComponentInline() throws RecognitionException {
        try {
            // InternalXpectParser.g:280:1: ( ruleComponentInline EOF )
            // InternalXpectParser.g:281:1: ruleComponentInline EOF
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
    // InternalXpectParser.g:288:1: ruleComponentInline : ( ( rule__ComponentInline__Group__0 ) ) ;
    public final void ruleComponentInline() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalXpectParser.g:292:5: ( ( ( rule__ComponentInline__Group__0 ) ) )
            // InternalXpectParser.g:293:1: ( ( rule__ComponentInline__Group__0 ) )
            {
            // InternalXpectParser.g:293:1: ( ( rule__ComponentInline__Group__0 ) )
            // InternalXpectParser.g:294:1: ( rule__ComponentInline__Group__0 )
            {
             before(grammarAccess.getComponentInlineAccess().getGroup()); 
            // InternalXpectParser.g:295:1: ( rule__ComponentInline__Group__0 )
            // InternalXpectParser.g:295:2: rule__ComponentInline__Group__0
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
    // InternalXpectParser.g:307:1: entryRuleLiteral : ruleLiteral EOF ;
    public final void entryRuleLiteral() throws RecognitionException {
        try {
            // InternalXpectParser.g:308:1: ( ruleLiteral EOF )
            // InternalXpectParser.g:309:1: ruleLiteral EOF
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
    // InternalXpectParser.g:316:1: ruleLiteral : ( ( rule__Literal__Alternatives ) ) ;
    public final void ruleLiteral() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalXpectParser.g:320:5: ( ( ( rule__Literal__Alternatives ) ) )
            // InternalXpectParser.g:321:1: ( ( rule__Literal__Alternatives ) )
            {
            // InternalXpectParser.g:321:1: ( ( rule__Literal__Alternatives ) )
            // InternalXpectParser.g:322:1: ( rule__Literal__Alternatives )
            {
             before(grammarAccess.getLiteralAccess().getAlternatives()); 
            // InternalXpectParser.g:323:1: ( rule__Literal__Alternatives )
            // InternalXpectParser.g:323:2: rule__Literal__Alternatives
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
    // InternalXpectParser.g:335:1: entryRuleClassLiteral : ruleClassLiteral EOF ;
    public final void entryRuleClassLiteral() throws RecognitionException {
        try {
            // InternalXpectParser.g:336:1: ( ruleClassLiteral EOF )
            // InternalXpectParser.g:337:1: ruleClassLiteral EOF
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
    // InternalXpectParser.g:344:1: ruleClassLiteral : ( ( rule__ClassLiteral__Group__0 ) ) ;
    public final void ruleClassLiteral() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalXpectParser.g:348:5: ( ( ( rule__ClassLiteral__Group__0 ) ) )
            // InternalXpectParser.g:349:1: ( ( rule__ClassLiteral__Group__0 ) )
            {
            // InternalXpectParser.g:349:1: ( ( rule__ClassLiteral__Group__0 ) )
            // InternalXpectParser.g:350:1: ( rule__ClassLiteral__Group__0 )
            {
             before(grammarAccess.getClassLiteralAccess().getGroup()); 
            // InternalXpectParser.g:351:1: ( rule__ClassLiteral__Group__0 )
            // InternalXpectParser.g:351:2: rule__ClassLiteral__Group__0
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
    // InternalXpectParser.g:363:1: entryRuleXpectIgnore : ruleXpectIgnore EOF ;
    public final void entryRuleXpectIgnore() throws RecognitionException {
        try {
            // InternalXpectParser.g:364:1: ( ruleXpectIgnore EOF )
            // InternalXpectParser.g:365:1: ruleXpectIgnore EOF
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
    // InternalXpectParser.g:372:1: ruleXpectIgnore : ( ( rule__XpectIgnore__Group__0 ) ) ;
    public final void ruleXpectIgnore() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalXpectParser.g:376:5: ( ( ( rule__XpectIgnore__Group__0 ) ) )
            // InternalXpectParser.g:377:1: ( ( rule__XpectIgnore__Group__0 ) )
            {
            // InternalXpectParser.g:377:1: ( ( rule__XpectIgnore__Group__0 ) )
            // InternalXpectParser.g:378:1: ( rule__XpectIgnore__Group__0 )
            {
             before(grammarAccess.getXpectIgnoreAccess().getGroup()); 
            // InternalXpectParser.g:379:1: ( rule__XpectIgnore__Group__0 )
            // InternalXpectParser.g:379:2: rule__XpectIgnore__Group__0
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
    // InternalXpectParser.g:391:1: entryRuleLexicalspace_Invocation : ruleLexicalspace_Invocation EOF ;
    public final void entryRuleLexicalspace_Invocation() throws RecognitionException {

        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT");

        try {
            // InternalXpectParser.g:395:1: ( ruleLexicalspace_Invocation EOF )
            // InternalXpectParser.g:396:1: ruleLexicalspace_Invocation EOF
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
    // InternalXpectParser.g:406:1: ruleLexicalspace_Invocation : ( ( rule__Lexicalspace_Invocation__Group__0 ) ) ;
    public final void ruleLexicalspace_Invocation() throws RecognitionException {

        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT");
        		int stackSize = keepStackSize();
            
        try {
            // InternalXpectParser.g:411:5: ( ( ( rule__Lexicalspace_Invocation__Group__0 ) ) )
            // InternalXpectParser.g:412:1: ( ( rule__Lexicalspace_Invocation__Group__0 ) )
            {
            // InternalXpectParser.g:412:1: ( ( rule__Lexicalspace_Invocation__Group__0 ) )
            // InternalXpectParser.g:413:1: ( rule__Lexicalspace_Invocation__Group__0 )
            {
             before(grammarAccess.getLexicalspace_InvocationAccess().getGroup()); 
            // InternalXpectParser.g:414:1: ( rule__Lexicalspace_Invocation__Group__0 )
            // InternalXpectParser.g:414:2: rule__Lexicalspace_Invocation__Group__0
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
    // InternalXpectParser.g:427:1: entryRuleAnyText : ruleAnyText EOF ;
    public final void entryRuleAnyText() throws RecognitionException {
        try {
            // InternalXpectParser.g:428:1: ( ruleAnyText EOF )
            // InternalXpectParser.g:429:1: ruleAnyText EOF
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
    // InternalXpectParser.g:436:1: ruleAnyText : ( ( ( RULE_ANY_OTHER ) ) ( ( RULE_ANY_OTHER )* ) ) ;
    public final void ruleAnyText() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalXpectParser.g:440:5: ( ( ( ( RULE_ANY_OTHER ) ) ( ( RULE_ANY_OTHER )* ) ) )
            // InternalXpectParser.g:441:1: ( ( ( RULE_ANY_OTHER ) ) ( ( RULE_ANY_OTHER )* ) )
            {
            // InternalXpectParser.g:441:1: ( ( ( RULE_ANY_OTHER ) ) ( ( RULE_ANY_OTHER )* ) )
            // InternalXpectParser.g:442:1: ( ( RULE_ANY_OTHER ) ) ( ( RULE_ANY_OTHER )* )
            {
            // InternalXpectParser.g:442:1: ( ( RULE_ANY_OTHER ) )
            // InternalXpectParser.g:443:1: ( RULE_ANY_OTHER )
            {
             before(grammarAccess.getAnyTextAccess().getANY_OTHERTerminalRuleCall()); 
            // InternalXpectParser.g:444:1: ( RULE_ANY_OTHER )
            // InternalXpectParser.g:444:3: RULE_ANY_OTHER
            {
            match(input,RULE_ANY_OTHER,FOLLOW_3); 

            }

             after(grammarAccess.getAnyTextAccess().getANY_OTHERTerminalRuleCall()); 

            }

            // InternalXpectParser.g:447:1: ( ( RULE_ANY_OTHER )* )
            // InternalXpectParser.g:448:1: ( RULE_ANY_OTHER )*
            {
             before(grammarAccess.getAnyTextAccess().getANY_OTHERTerminalRuleCall()); 
            // InternalXpectParser.g:449:1: ( RULE_ANY_OTHER )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==RULE_ANY_OTHER) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalXpectParser.g:449:3: RULE_ANY_OTHER
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
    // InternalXpectParser.g:462:1: entryRuleQualifiedName : ruleQualifiedName EOF ;
    public final void entryRuleQualifiedName() throws RecognitionException {
        try {
            // InternalXpectParser.g:463:1: ( ruleQualifiedName EOF )
            // InternalXpectParser.g:464:1: ruleQualifiedName EOF
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
    // InternalXpectParser.g:471:1: ruleQualifiedName : ( ( rule__QualifiedName__Group__0 ) ) ;
    public final void ruleQualifiedName() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalXpectParser.g:475:5: ( ( ( rule__QualifiedName__Group__0 ) ) )
            // InternalXpectParser.g:476:1: ( ( rule__QualifiedName__Group__0 ) )
            {
            // InternalXpectParser.g:476:1: ( ( rule__QualifiedName__Group__0 ) )
            // InternalXpectParser.g:477:1: ( rule__QualifiedName__Group__0 )
            {
             before(grammarAccess.getQualifiedNameAccess().getGroup()); 
            // InternalXpectParser.g:478:1: ( rule__QualifiedName__Group__0 )
            // InternalXpectParser.g:478:2: rule__QualifiedName__Group__0
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
    // InternalXpectParser.g:490:1: rule__Member__Alternatives : ( ( ruleLexicalspace_Setup ) | ( ruleLexicalspace_Invocation ) | ( ruleXpectIgnore ) );
    public final void rule__Member__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalXpectParser.g:494:1: ( ( ruleLexicalspace_Setup ) | ( ruleLexicalspace_Invocation ) | ( ruleXpectIgnore ) )
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
                    // InternalXpectParser.g:495:1: ( ruleLexicalspace_Setup )
                    {
                    // InternalXpectParser.g:495:1: ( ruleLexicalspace_Setup )
                    // InternalXpectParser.g:496:1: ruleLexicalspace_Setup
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
                    // InternalXpectParser.g:501:6: ( ruleLexicalspace_Invocation )
                    {
                    // InternalXpectParser.g:501:6: ( ruleLexicalspace_Invocation )
                    // InternalXpectParser.g:502:1: ruleLexicalspace_Invocation
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
                    // InternalXpectParser.g:507:6: ( ruleXpectIgnore )
                    {
                    // InternalXpectParser.g:507:6: ( ruleXpectIgnore )
                    // InternalXpectParser.g:508:1: ruleXpectIgnore
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
    // InternalXpectParser.g:518:1: rule__Assignment__Alternatives : ( ( ( rule__Assignment__Group_0__0 ) ) | ( ( rule__Assignment__ValueAssignment_1 ) ) );
    public final void rule__Assignment__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalXpectParser.g:522:1: ( ( ( rule__Assignment__Group_0__0 ) ) | ( ( rule__Assignment__ValueAssignment_1 ) ) )
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
                    // InternalXpectParser.g:523:1: ( ( rule__Assignment__Group_0__0 ) )
                    {
                    // InternalXpectParser.g:523:1: ( ( rule__Assignment__Group_0__0 ) )
                    // InternalXpectParser.g:524:1: ( rule__Assignment__Group_0__0 )
                    {
                     before(grammarAccess.getAssignmentAccess().getGroup_0()); 
                    // InternalXpectParser.g:525:1: ( rule__Assignment__Group_0__0 )
                    // InternalXpectParser.g:525:2: rule__Assignment__Group_0__0
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
                    // InternalXpectParser.g:529:6: ( ( rule__Assignment__ValueAssignment_1 ) )
                    {
                    // InternalXpectParser.g:529:6: ( ( rule__Assignment__ValueAssignment_1 ) )
                    // InternalXpectParser.g:530:1: ( rule__Assignment__ValueAssignment_1 )
                    {
                     before(grammarAccess.getAssignmentAccess().getValueAssignment_1()); 
                    // InternalXpectParser.g:531:1: ( rule__Assignment__ValueAssignment_1 )
                    // InternalXpectParser.g:531:2: rule__Assignment__ValueAssignment_1
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
    // InternalXpectParser.g:540:1: rule__Value__Alternatives : ( ( ruleLiteral ) | ( ruleClassLiteral ) | ( ruleComponentInline ) );
    public final void rule__Value__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalXpectParser.g:544:1: ( ( ruleLiteral ) | ( ruleClassLiteral ) | ( ruleComponentInline ) )
            int alt4=3;
            alt4 = dfa4.predict(input);
            switch (alt4) {
                case 1 :
                    // InternalXpectParser.g:545:1: ( ruleLiteral )
                    {
                    // InternalXpectParser.g:545:1: ( ruleLiteral )
                    // InternalXpectParser.g:546:1: ruleLiteral
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
                    // InternalXpectParser.g:551:6: ( ruleClassLiteral )
                    {
                    // InternalXpectParser.g:551:6: ( ruleClassLiteral )
                    // InternalXpectParser.g:552:1: ruleClassLiteral
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
                    // InternalXpectParser.g:557:6: ( ruleComponentInline )
                    {
                    // InternalXpectParser.g:557:6: ( ruleComponentInline )
                    // InternalXpectParser.g:558:1: ruleComponentInline
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
    // InternalXpectParser.g:568:1: rule__Literal__Alternatives : ( ( ( rule__Literal__Group_0__0 ) ) | ( ( rule__Literal__Group_1__0 ) ) | ( ( rule__Literal__Group_2__0 ) ) );
    public final void rule__Literal__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalXpectParser.g:572:1: ( ( ( rule__Literal__Group_0__0 ) ) | ( ( rule__Literal__Group_1__0 ) ) | ( ( rule__Literal__Group_2__0 ) ) )
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
                    // InternalXpectParser.g:573:1: ( ( rule__Literal__Group_0__0 ) )
                    {
                    // InternalXpectParser.g:573:1: ( ( rule__Literal__Group_0__0 ) )
                    // InternalXpectParser.g:574:1: ( rule__Literal__Group_0__0 )
                    {
                     before(grammarAccess.getLiteralAccess().getGroup_0()); 
                    // InternalXpectParser.g:575:1: ( rule__Literal__Group_0__0 )
                    // InternalXpectParser.g:575:2: rule__Literal__Group_0__0
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
                    // InternalXpectParser.g:579:6: ( ( rule__Literal__Group_1__0 ) )
                    {
                    // InternalXpectParser.g:579:6: ( ( rule__Literal__Group_1__0 ) )
                    // InternalXpectParser.g:580:1: ( rule__Literal__Group_1__0 )
                    {
                     before(grammarAccess.getLiteralAccess().getGroup_1()); 
                    // InternalXpectParser.g:581:1: ( rule__Literal__Group_1__0 )
                    // InternalXpectParser.g:581:2: rule__Literal__Group_1__0
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
                    // InternalXpectParser.g:585:6: ( ( rule__Literal__Group_2__0 ) )
                    {
                    // InternalXpectParser.g:585:6: ( ( rule__Literal__Group_2__0 ) )
                    // InternalXpectParser.g:586:1: ( rule__Literal__Group_2__0 )
                    {
                     before(grammarAccess.getLiteralAccess().getGroup_2()); 
                    // InternalXpectParser.g:587:1: ( rule__Literal__Group_2__0 )
                    // InternalXpectParser.g:587:2: rule__Literal__Group_2__0
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
    // InternalXpectParser.g:596:1: rule__Literal__Alternatives_0_1 : ( ( ( rule__Literal__ValueAssignment_0_1_0 ) ) | ( False ) );
    public final void rule__Literal__Alternatives_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalXpectParser.g:600:1: ( ( ( rule__Literal__ValueAssignment_0_1_0 ) ) | ( False ) )
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
                    // InternalXpectParser.g:601:1: ( ( rule__Literal__ValueAssignment_0_1_0 ) )
                    {
                    // InternalXpectParser.g:601:1: ( ( rule__Literal__ValueAssignment_0_1_0 ) )
                    // InternalXpectParser.g:602:1: ( rule__Literal__ValueAssignment_0_1_0 )
                    {
                     before(grammarAccess.getLiteralAccess().getValueAssignment_0_1_0()); 
                    // InternalXpectParser.g:603:1: ( rule__Literal__ValueAssignment_0_1_0 )
                    // InternalXpectParser.g:603:2: rule__Literal__ValueAssignment_0_1_0
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
                    // InternalXpectParser.g:607:6: ( False )
                    {
                    // InternalXpectParser.g:607:6: ( False )
                    // InternalXpectParser.g:608:1: False
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
    // InternalXpectParser.g:622:1: rule__XpectFile__Group__0 : rule__XpectFile__Group__0__Impl rule__XpectFile__Group__1 ;
    public final void rule__XpectFile__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalXpectParser.g:626:1: ( rule__XpectFile__Group__0__Impl rule__XpectFile__Group__1 )
            // InternalXpectParser.g:627:2: rule__XpectFile__Group__0__Impl rule__XpectFile__Group__1
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
    // InternalXpectParser.g:634:1: rule__XpectFile__Group__0__Impl : ( () ) ;
    public final void rule__XpectFile__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalXpectParser.g:638:1: ( ( () ) )
            // InternalXpectParser.g:639:1: ( () )
            {
            // InternalXpectParser.g:639:1: ( () )
            // InternalXpectParser.g:640:1: ()
            {
             before(grammarAccess.getXpectFileAccess().getXpectFileAction_0()); 
            // InternalXpectParser.g:641:1: ()
            // InternalXpectParser.g:643:1: 
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
    // InternalXpectParser.g:653:1: rule__XpectFile__Group__1 : rule__XpectFile__Group__1__Impl ;
    public final void rule__XpectFile__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalXpectParser.g:657:1: ( rule__XpectFile__Group__1__Impl )
            // InternalXpectParser.g:658:2: rule__XpectFile__Group__1__Impl
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
    // InternalXpectParser.g:664:1: rule__XpectFile__Group__1__Impl : ( ( rule__XpectFile__Group_1__0 )? ) ;
    public final void rule__XpectFile__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalXpectParser.g:668:1: ( ( ( rule__XpectFile__Group_1__0 )? ) )
            // InternalXpectParser.g:669:1: ( ( rule__XpectFile__Group_1__0 )? )
            {
            // InternalXpectParser.g:669:1: ( ( rule__XpectFile__Group_1__0 )? )
            // InternalXpectParser.g:670:1: ( rule__XpectFile__Group_1__0 )?
            {
             before(grammarAccess.getXpectFileAccess().getGroup_1()); 
            // InternalXpectParser.g:671:1: ( rule__XpectFile__Group_1__0 )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==RULE_ANY_OTHER) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalXpectParser.g:671:2: rule__XpectFile__Group_1__0
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
    // InternalXpectParser.g:685:1: rule__XpectFile__Group_1__0 : rule__XpectFile__Group_1__0__Impl rule__XpectFile__Group_1__1 ;
    public final void rule__XpectFile__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalXpectParser.g:689:1: ( rule__XpectFile__Group_1__0__Impl rule__XpectFile__Group_1__1 )
            // InternalXpectParser.g:690:2: rule__XpectFile__Group_1__0__Impl rule__XpectFile__Group_1__1
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
    // InternalXpectParser.g:697:1: rule__XpectFile__Group_1__0__Impl : ( ( rule__XpectFile__Group_1_0__0 )* ) ;
    public final void rule__XpectFile__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalXpectParser.g:701:1: ( ( ( rule__XpectFile__Group_1_0__0 )* ) )
            // InternalXpectParser.g:702:1: ( ( rule__XpectFile__Group_1_0__0 )* )
            {
            // InternalXpectParser.g:702:1: ( ( rule__XpectFile__Group_1_0__0 )* )
            // InternalXpectParser.g:703:1: ( rule__XpectFile__Group_1_0__0 )*
            {
             before(grammarAccess.getXpectFileAccess().getGroup_1_0()); 
            // InternalXpectParser.g:704:1: ( rule__XpectFile__Group_1_0__0 )*
            loop8:
            do {
                int alt8=2;
                alt8 = dfa8.predict(input);
                switch (alt8) {
            	case 1 :
            	    // InternalXpectParser.g:704:2: rule__XpectFile__Group_1_0__0
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
    // InternalXpectParser.g:714:1: rule__XpectFile__Group_1__1 : rule__XpectFile__Group_1__1__Impl ;
    public final void rule__XpectFile__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalXpectParser.g:718:1: ( rule__XpectFile__Group_1__1__Impl )
            // InternalXpectParser.g:719:2: rule__XpectFile__Group_1__1__Impl
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
    // InternalXpectParser.g:725:1: rule__XpectFile__Group_1__1__Impl : ( ( rule__XpectFile__MembersAssignment_1_1 ) ) ;
    public final void rule__XpectFile__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalXpectParser.g:729:1: ( ( ( rule__XpectFile__MembersAssignment_1_1 ) ) )
            // InternalXpectParser.g:730:1: ( ( rule__XpectFile__MembersAssignment_1_1 ) )
            {
            // InternalXpectParser.g:730:1: ( ( rule__XpectFile__MembersAssignment_1_1 ) )
            // InternalXpectParser.g:731:1: ( rule__XpectFile__MembersAssignment_1_1 )
            {
             before(grammarAccess.getXpectFileAccess().getMembersAssignment_1_1()); 
            // InternalXpectParser.g:732:1: ( rule__XpectFile__MembersAssignment_1_1 )
            // InternalXpectParser.g:732:2: rule__XpectFile__MembersAssignment_1_1
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
    // InternalXpectParser.g:746:1: rule__XpectFile__Group_1_0__0 : rule__XpectFile__Group_1_0__0__Impl rule__XpectFile__Group_1_0__1 ;
    public final void rule__XpectFile__Group_1_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalXpectParser.g:750:1: ( rule__XpectFile__Group_1_0__0__Impl rule__XpectFile__Group_1_0__1 )
            // InternalXpectParser.g:751:2: rule__XpectFile__Group_1_0__0__Impl rule__XpectFile__Group_1_0__1
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
    // InternalXpectParser.g:758:1: rule__XpectFile__Group_1_0__0__Impl : ( ( rule__XpectFile__MembersAssignment_1_0_0 ) ) ;
    public final void rule__XpectFile__Group_1_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalXpectParser.g:762:1: ( ( ( rule__XpectFile__MembersAssignment_1_0_0 ) ) )
            // InternalXpectParser.g:763:1: ( ( rule__XpectFile__MembersAssignment_1_0_0 ) )
            {
            // InternalXpectParser.g:763:1: ( ( rule__XpectFile__MembersAssignment_1_0_0 ) )
            // InternalXpectParser.g:764:1: ( rule__XpectFile__MembersAssignment_1_0_0 )
            {
             before(grammarAccess.getXpectFileAccess().getMembersAssignment_1_0_0()); 
            // InternalXpectParser.g:765:1: ( rule__XpectFile__MembersAssignment_1_0_0 )
            // InternalXpectParser.g:765:2: rule__XpectFile__MembersAssignment_1_0_0
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
    // InternalXpectParser.g:775:1: rule__XpectFile__Group_1_0__1 : rule__XpectFile__Group_1_0__1__Impl ;
    public final void rule__XpectFile__Group_1_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalXpectParser.g:779:1: ( rule__XpectFile__Group_1_0__1__Impl )
            // InternalXpectParser.g:780:2: rule__XpectFile__Group_1_0__1__Impl
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
    // InternalXpectParser.g:786:1: rule__XpectFile__Group_1_0__1__Impl : ( ( rule__XpectFile__MembersAssignment_1_0_1 ) ) ;
    public final void rule__XpectFile__Group_1_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalXpectParser.g:790:1: ( ( ( rule__XpectFile__MembersAssignment_1_0_1 ) ) )
            // InternalXpectParser.g:791:1: ( ( rule__XpectFile__MembersAssignment_1_0_1 ) )
            {
            // InternalXpectParser.g:791:1: ( ( rule__XpectFile__MembersAssignment_1_0_1 ) )
            // InternalXpectParser.g:792:1: ( rule__XpectFile__MembersAssignment_1_0_1 )
            {
             before(grammarAccess.getXpectFileAccess().getMembersAssignment_1_0_1()); 
            // InternalXpectParser.g:793:1: ( rule__XpectFile__MembersAssignment_1_0_1 )
            // InternalXpectParser.g:793:2: rule__XpectFile__MembersAssignment_1_0_1
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
    // InternalXpectParser.g:807:1: rule__Lexicalspace_Setup__Group__0 : rule__Lexicalspace_Setup__Group__0__Impl rule__Lexicalspace_Setup__Group__1 ;
    public final void rule__Lexicalspace_Setup__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalXpectParser.g:811:1: ( rule__Lexicalspace_Setup__Group__0__Impl rule__Lexicalspace_Setup__Group__1 )
            // InternalXpectParser.g:812:2: rule__Lexicalspace_Setup__Group__0__Impl rule__Lexicalspace_Setup__Group__1
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
    // InternalXpectParser.g:819:1: rule__Lexicalspace_Setup__Group__0__Impl : ( () ) ;
    public final void rule__Lexicalspace_Setup__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalXpectParser.g:823:1: ( ( () ) )
            // InternalXpectParser.g:824:1: ( () )
            {
            // InternalXpectParser.g:824:1: ( () )
            // InternalXpectParser.g:825:1: ()
            {
             before(grammarAccess.getLexicalspace_SetupAccess().getXpectTestAction_0()); 
            // InternalXpectParser.g:826:1: ()
            // InternalXpectParser.g:828:1: 
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
    // InternalXpectParser.g:838:1: rule__Lexicalspace_Setup__Group__1 : rule__Lexicalspace_Setup__Group__1__Impl rule__Lexicalspace_Setup__Group__2 ;
    public final void rule__Lexicalspace_Setup__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalXpectParser.g:842:1: ( rule__Lexicalspace_Setup__Group__1__Impl rule__Lexicalspace_Setup__Group__2 )
            // InternalXpectParser.g:843:2: rule__Lexicalspace_Setup__Group__1__Impl rule__Lexicalspace_Setup__Group__2
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
    // InternalXpectParser.g:850:1: rule__Lexicalspace_Setup__Group__1__Impl : ( XPECT_SETUP ) ;
    public final void rule__Lexicalspace_Setup__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalXpectParser.g:854:1: ( ( XPECT_SETUP ) )
            // InternalXpectParser.g:855:1: ( XPECT_SETUP )
            {
            // InternalXpectParser.g:855:1: ( XPECT_SETUP )
            // InternalXpectParser.g:856:1: XPECT_SETUP
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
    // InternalXpectParser.g:869:1: rule__Lexicalspace_Setup__Group__2 : rule__Lexicalspace_Setup__Group__2__Impl rule__Lexicalspace_Setup__Group__3 ;
    public final void rule__Lexicalspace_Setup__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalXpectParser.g:873:1: ( rule__Lexicalspace_Setup__Group__2__Impl rule__Lexicalspace_Setup__Group__3 )
            // InternalXpectParser.g:874:2: rule__Lexicalspace_Setup__Group__2__Impl rule__Lexicalspace_Setup__Group__3
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
    // InternalXpectParser.g:881:1: rule__Lexicalspace_Setup__Group__2__Impl : ( ( rule__Lexicalspace_Setup__DeclaredSuiteAssignment_2 )? ) ;
    public final void rule__Lexicalspace_Setup__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalXpectParser.g:885:1: ( ( ( rule__Lexicalspace_Setup__DeclaredSuiteAssignment_2 )? ) )
            // InternalXpectParser.g:886:1: ( ( rule__Lexicalspace_Setup__DeclaredSuiteAssignment_2 )? )
            {
            // InternalXpectParser.g:886:1: ( ( rule__Lexicalspace_Setup__DeclaredSuiteAssignment_2 )? )
            // InternalXpectParser.g:887:1: ( rule__Lexicalspace_Setup__DeclaredSuiteAssignment_2 )?
            {
             before(grammarAccess.getLexicalspace_SetupAccess().getDeclaredSuiteAssignment_2()); 
            // InternalXpectParser.g:888:1: ( rule__Lexicalspace_Setup__DeclaredSuiteAssignment_2 )?
            int alt9=2;
            alt9 = dfa9.predict(input);
            switch (alt9) {
                case 1 :
                    // InternalXpectParser.g:888:2: rule__Lexicalspace_Setup__DeclaredSuiteAssignment_2
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
    // InternalXpectParser.g:898:1: rule__Lexicalspace_Setup__Group__3 : rule__Lexicalspace_Setup__Group__3__Impl rule__Lexicalspace_Setup__Group__4 ;
    public final void rule__Lexicalspace_Setup__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalXpectParser.g:902:1: ( rule__Lexicalspace_Setup__Group__3__Impl rule__Lexicalspace_Setup__Group__4 )
            // InternalXpectParser.g:903:2: rule__Lexicalspace_Setup__Group__3__Impl rule__Lexicalspace_Setup__Group__4
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
    // InternalXpectParser.g:910:1: rule__Lexicalspace_Setup__Group__3__Impl : ( ( rule__Lexicalspace_Setup__AssignmentsAssignment_3 )* ) ;
    public final void rule__Lexicalspace_Setup__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalXpectParser.g:914:1: ( ( ( rule__Lexicalspace_Setup__AssignmentsAssignment_3 )* ) )
            // InternalXpectParser.g:915:1: ( ( rule__Lexicalspace_Setup__AssignmentsAssignment_3 )* )
            {
            // InternalXpectParser.g:915:1: ( ( rule__Lexicalspace_Setup__AssignmentsAssignment_3 )* )
            // InternalXpectParser.g:916:1: ( rule__Lexicalspace_Setup__AssignmentsAssignment_3 )*
            {
             before(grammarAccess.getLexicalspace_SetupAccess().getAssignmentsAssignment_3()); 
            // InternalXpectParser.g:917:1: ( rule__Lexicalspace_Setup__AssignmentsAssignment_3 )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==RULE_ID) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // InternalXpectParser.g:917:2: rule__Lexicalspace_Setup__AssignmentsAssignment_3
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
    // InternalXpectParser.g:927:1: rule__Lexicalspace_Setup__Group__4 : rule__Lexicalspace_Setup__Group__4__Impl ;
    public final void rule__Lexicalspace_Setup__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalXpectParser.g:931:1: ( rule__Lexicalspace_Setup__Group__4__Impl )
            // InternalXpectParser.g:932:2: rule__Lexicalspace_Setup__Group__4__Impl
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
    // InternalXpectParser.g:938:1: rule__Lexicalspace_Setup__Group__4__Impl : ( END_SETUP ) ;
    public final void rule__Lexicalspace_Setup__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalXpectParser.g:942:1: ( ( END_SETUP ) )
            // InternalXpectParser.g:943:1: ( END_SETUP )
            {
            // InternalXpectParser.g:943:1: ( END_SETUP )
            // InternalXpectParser.g:944:1: END_SETUP
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
    // InternalXpectParser.g:967:1: rule__Assignment__Group_0__0 : rule__Assignment__Group_0__0__Impl rule__Assignment__Group_0__1 ;
    public final void rule__Assignment__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalXpectParser.g:971:1: ( rule__Assignment__Group_0__0__Impl rule__Assignment__Group_0__1 )
            // InternalXpectParser.g:972:2: rule__Assignment__Group_0__0__Impl rule__Assignment__Group_0__1
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
    // InternalXpectParser.g:979:1: rule__Assignment__Group_0__0__Impl : ( ( rule__Assignment__DeclaredTargetAssignment_0_0 ) ) ;
    public final void rule__Assignment__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalXpectParser.g:983:1: ( ( ( rule__Assignment__DeclaredTargetAssignment_0_0 ) ) )
            // InternalXpectParser.g:984:1: ( ( rule__Assignment__DeclaredTargetAssignment_0_0 ) )
            {
            // InternalXpectParser.g:984:1: ( ( rule__Assignment__DeclaredTargetAssignment_0_0 ) )
            // InternalXpectParser.g:985:1: ( rule__Assignment__DeclaredTargetAssignment_0_0 )
            {
             before(grammarAccess.getAssignmentAccess().getDeclaredTargetAssignment_0_0()); 
            // InternalXpectParser.g:986:1: ( rule__Assignment__DeclaredTargetAssignment_0_0 )
            // InternalXpectParser.g:986:2: rule__Assignment__DeclaredTargetAssignment_0_0
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
    // InternalXpectParser.g:996:1: rule__Assignment__Group_0__1 : rule__Assignment__Group_0__1__Impl rule__Assignment__Group_0__2 ;
    public final void rule__Assignment__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalXpectParser.g:1000:1: ( rule__Assignment__Group_0__1__Impl rule__Assignment__Group_0__2 )
            // InternalXpectParser.g:1001:2: rule__Assignment__Group_0__1__Impl rule__Assignment__Group_0__2
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
    // InternalXpectParser.g:1008:1: rule__Assignment__Group_0__1__Impl : ( EqualsSign ) ;
    public final void rule__Assignment__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalXpectParser.g:1012:1: ( ( EqualsSign ) )
            // InternalXpectParser.g:1013:1: ( EqualsSign )
            {
            // InternalXpectParser.g:1013:1: ( EqualsSign )
            // InternalXpectParser.g:1014:1: EqualsSign
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
    // InternalXpectParser.g:1027:1: rule__Assignment__Group_0__2 : rule__Assignment__Group_0__2__Impl ;
    public final void rule__Assignment__Group_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalXpectParser.g:1031:1: ( rule__Assignment__Group_0__2__Impl )
            // InternalXpectParser.g:1032:2: rule__Assignment__Group_0__2__Impl
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
    // InternalXpectParser.g:1038:1: rule__Assignment__Group_0__2__Impl : ( ( rule__Assignment__ValueAssignment_0_2 ) ) ;
    public final void rule__Assignment__Group_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalXpectParser.g:1042:1: ( ( ( rule__Assignment__ValueAssignment_0_2 ) ) )
            // InternalXpectParser.g:1043:1: ( ( rule__Assignment__ValueAssignment_0_2 ) )
            {
            // InternalXpectParser.g:1043:1: ( ( rule__Assignment__ValueAssignment_0_2 ) )
            // InternalXpectParser.g:1044:1: ( rule__Assignment__ValueAssignment_0_2 )
            {
             before(grammarAccess.getAssignmentAccess().getValueAssignment_0_2()); 
            // InternalXpectParser.g:1045:1: ( rule__Assignment__ValueAssignment_0_2 )
            // InternalXpectParser.g:1045:2: rule__Assignment__ValueAssignment_0_2
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
    // InternalXpectParser.g:1061:1: rule__ComponentLong__Group__0 : rule__ComponentLong__Group__0__Impl rule__ComponentLong__Group__1 ;
    public final void rule__ComponentLong__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalXpectParser.g:1065:1: ( rule__ComponentLong__Group__0__Impl rule__ComponentLong__Group__1 )
            // InternalXpectParser.g:1066:2: rule__ComponentLong__Group__0__Impl rule__ComponentLong__Group__1
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
    // InternalXpectParser.g:1073:1: rule__ComponentLong__Group__0__Impl : ( () ) ;
    public final void rule__ComponentLong__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalXpectParser.g:1077:1: ( ( () ) )
            // InternalXpectParser.g:1078:1: ( () )
            {
            // InternalXpectParser.g:1078:1: ( () )
            // InternalXpectParser.g:1079:1: ()
            {
             before(grammarAccess.getComponentLongAccess().getComponentAction_0()); 
            // InternalXpectParser.g:1080:1: ()
            // InternalXpectParser.g:1082:1: 
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
    // InternalXpectParser.g:1092:1: rule__ComponentLong__Group__1 : rule__ComponentLong__Group__1__Impl rule__ComponentLong__Group__2 ;
    public final void rule__ComponentLong__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalXpectParser.g:1096:1: ( rule__ComponentLong__Group__1__Impl rule__ComponentLong__Group__2 )
            // InternalXpectParser.g:1097:2: rule__ComponentLong__Group__1__Impl rule__ComponentLong__Group__2
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
    // InternalXpectParser.g:1104:1: rule__ComponentLong__Group__1__Impl : ( ( rule__ComponentLong__ComponentClassAssignment_1 ) ) ;
    public final void rule__ComponentLong__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalXpectParser.g:1108:1: ( ( ( rule__ComponentLong__ComponentClassAssignment_1 ) ) )
            // InternalXpectParser.g:1109:1: ( ( rule__ComponentLong__ComponentClassAssignment_1 ) )
            {
            // InternalXpectParser.g:1109:1: ( ( rule__ComponentLong__ComponentClassAssignment_1 ) )
            // InternalXpectParser.g:1110:1: ( rule__ComponentLong__ComponentClassAssignment_1 )
            {
             before(grammarAccess.getComponentLongAccess().getComponentClassAssignment_1()); 
            // InternalXpectParser.g:1111:1: ( rule__ComponentLong__ComponentClassAssignment_1 )
            // InternalXpectParser.g:1111:2: rule__ComponentLong__ComponentClassAssignment_1
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
    // InternalXpectParser.g:1121:1: rule__ComponentLong__Group__2 : rule__ComponentLong__Group__2__Impl rule__ComponentLong__Group__3 ;
    public final void rule__ComponentLong__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalXpectParser.g:1125:1: ( rule__ComponentLong__Group__2__Impl rule__ComponentLong__Group__3 )
            // InternalXpectParser.g:1126:2: rule__ComponentLong__Group__2__Impl rule__ComponentLong__Group__3
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
    // InternalXpectParser.g:1133:1: rule__ComponentLong__Group__2__Impl : ( ( rule__ComponentLong__ParametersAssignment_2 )* ) ;
    public final void rule__ComponentLong__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalXpectParser.g:1137:1: ( ( ( rule__ComponentLong__ParametersAssignment_2 )* ) )
            // InternalXpectParser.g:1138:1: ( ( rule__ComponentLong__ParametersAssignment_2 )* )
            {
            // InternalXpectParser.g:1138:1: ( ( rule__ComponentLong__ParametersAssignment_2 )* )
            // InternalXpectParser.g:1139:1: ( rule__ComponentLong__ParametersAssignment_2 )*
            {
             before(grammarAccess.getComponentLongAccess().getParametersAssignment_2()); 
            // InternalXpectParser.g:1140:1: ( rule__ComponentLong__ParametersAssignment_2 )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( ((LA11_0>=False && LA11_0<=True)||(LA11_0>=RULE_INT && LA11_0<=RULE_STRING)) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // InternalXpectParser.g:1140:2: rule__ComponentLong__ParametersAssignment_2
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
    // InternalXpectParser.g:1150:1: rule__ComponentLong__Group__3 : rule__ComponentLong__Group__3__Impl ;
    public final void rule__ComponentLong__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalXpectParser.g:1154:1: ( rule__ComponentLong__Group__3__Impl )
            // InternalXpectParser.g:1155:2: rule__ComponentLong__Group__3__Impl
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
    // InternalXpectParser.g:1161:1: rule__ComponentLong__Group__3__Impl : ( ( rule__ComponentLong__Group_3__0 ) ) ;
    public final void rule__ComponentLong__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalXpectParser.g:1165:1: ( ( ( rule__ComponentLong__Group_3__0 ) ) )
            // InternalXpectParser.g:1166:1: ( ( rule__ComponentLong__Group_3__0 ) )
            {
            // InternalXpectParser.g:1166:1: ( ( rule__ComponentLong__Group_3__0 ) )
            // InternalXpectParser.g:1167:1: ( rule__ComponentLong__Group_3__0 )
            {
             before(grammarAccess.getComponentLongAccess().getGroup_3()); 
            // InternalXpectParser.g:1168:1: ( rule__ComponentLong__Group_3__0 )
            // InternalXpectParser.g:1168:2: rule__ComponentLong__Group_3__0
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
    // InternalXpectParser.g:1186:1: rule__ComponentLong__Group_3__0 : rule__ComponentLong__Group_3__0__Impl rule__ComponentLong__Group_3__1 ;
    public final void rule__ComponentLong__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalXpectParser.g:1190:1: ( rule__ComponentLong__Group_3__0__Impl rule__ComponentLong__Group_3__1 )
            // InternalXpectParser.g:1191:2: rule__ComponentLong__Group_3__0__Impl rule__ComponentLong__Group_3__1
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
    // InternalXpectParser.g:1198:1: rule__ComponentLong__Group_3__0__Impl : ( LeftCurlyBracket ) ;
    public final void rule__ComponentLong__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalXpectParser.g:1202:1: ( ( LeftCurlyBracket ) )
            // InternalXpectParser.g:1203:1: ( LeftCurlyBracket )
            {
            // InternalXpectParser.g:1203:1: ( LeftCurlyBracket )
            // InternalXpectParser.g:1204:1: LeftCurlyBracket
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
    // InternalXpectParser.g:1217:1: rule__ComponentLong__Group_3__1 : rule__ComponentLong__Group_3__1__Impl rule__ComponentLong__Group_3__2 ;
    public final void rule__ComponentLong__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalXpectParser.g:1221:1: ( rule__ComponentLong__Group_3__1__Impl rule__ComponentLong__Group_3__2 )
            // InternalXpectParser.g:1222:2: rule__ComponentLong__Group_3__1__Impl rule__ComponentLong__Group_3__2
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
    // InternalXpectParser.g:1229:1: rule__ComponentLong__Group_3__1__Impl : ( ( rule__ComponentLong__AssignmentsAssignment_3_1 )* ) ;
    public final void rule__ComponentLong__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalXpectParser.g:1233:1: ( ( ( rule__ComponentLong__AssignmentsAssignment_3_1 )* ) )
            // InternalXpectParser.g:1234:1: ( ( rule__ComponentLong__AssignmentsAssignment_3_1 )* )
            {
            // InternalXpectParser.g:1234:1: ( ( rule__ComponentLong__AssignmentsAssignment_3_1 )* )
            // InternalXpectParser.g:1235:1: ( rule__ComponentLong__AssignmentsAssignment_3_1 )*
            {
             before(grammarAccess.getComponentLongAccess().getAssignmentsAssignment_3_1()); 
            // InternalXpectParser.g:1236:1: ( rule__ComponentLong__AssignmentsAssignment_3_1 )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==RULE_ID) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // InternalXpectParser.g:1236:2: rule__ComponentLong__AssignmentsAssignment_3_1
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
    // InternalXpectParser.g:1246:1: rule__ComponentLong__Group_3__2 : rule__ComponentLong__Group_3__2__Impl ;
    public final void rule__ComponentLong__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalXpectParser.g:1250:1: ( rule__ComponentLong__Group_3__2__Impl )
            // InternalXpectParser.g:1251:2: rule__ComponentLong__Group_3__2__Impl
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
    // InternalXpectParser.g:1257:1: rule__ComponentLong__Group_3__2__Impl : ( RightCurlyBracket ) ;
    public final void rule__ComponentLong__Group_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalXpectParser.g:1261:1: ( ( RightCurlyBracket ) )
            // InternalXpectParser.g:1262:1: ( RightCurlyBracket )
            {
            // InternalXpectParser.g:1262:1: ( RightCurlyBracket )
            // InternalXpectParser.g:1263:1: RightCurlyBracket
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
    // InternalXpectParser.g:1282:1: rule__ComponentInline__Group__0 : rule__ComponentInline__Group__0__Impl rule__ComponentInline__Group__1 ;
    public final void rule__ComponentInline__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalXpectParser.g:1286:1: ( rule__ComponentInline__Group__0__Impl rule__ComponentInline__Group__1 )
            // InternalXpectParser.g:1287:2: rule__ComponentInline__Group__0__Impl rule__ComponentInline__Group__1
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
    // InternalXpectParser.g:1294:1: rule__ComponentInline__Group__0__Impl : ( () ) ;
    public final void rule__ComponentInline__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalXpectParser.g:1298:1: ( ( () ) )
            // InternalXpectParser.g:1299:1: ( () )
            {
            // InternalXpectParser.g:1299:1: ( () )
            // InternalXpectParser.g:1300:1: ()
            {
             before(grammarAccess.getComponentInlineAccess().getComponentAction_0()); 
            // InternalXpectParser.g:1301:1: ()
            // InternalXpectParser.g:1303:1: 
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
    // InternalXpectParser.g:1313:1: rule__ComponentInline__Group__1 : rule__ComponentInline__Group__1__Impl rule__ComponentInline__Group__2 ;
    public final void rule__ComponentInline__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalXpectParser.g:1317:1: ( rule__ComponentInline__Group__1__Impl rule__ComponentInline__Group__2 )
            // InternalXpectParser.g:1318:2: rule__ComponentInline__Group__1__Impl rule__ComponentInline__Group__2
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
    // InternalXpectParser.g:1325:1: rule__ComponentInline__Group__1__Impl : ( ( rule__ComponentInline__Group_1__0 )? ) ;
    public final void rule__ComponentInline__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalXpectParser.g:1329:1: ( ( ( rule__ComponentInline__Group_1__0 )? ) )
            // InternalXpectParser.g:1330:1: ( ( rule__ComponentInline__Group_1__0 )? )
            {
            // InternalXpectParser.g:1330:1: ( ( rule__ComponentInline__Group_1__0 )? )
            // InternalXpectParser.g:1331:1: ( rule__ComponentInline__Group_1__0 )?
            {
             before(grammarAccess.getComponentInlineAccess().getGroup_1()); 
            // InternalXpectParser.g:1332:1: ( rule__ComponentInline__Group_1__0 )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==RULE_ID) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // InternalXpectParser.g:1332:2: rule__ComponentInline__Group_1__0
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
    // InternalXpectParser.g:1342:1: rule__ComponentInline__Group__2 : rule__ComponentInline__Group__2__Impl ;
    public final void rule__ComponentInline__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalXpectParser.g:1346:1: ( rule__ComponentInline__Group__2__Impl )
            // InternalXpectParser.g:1347:2: rule__ComponentInline__Group__2__Impl
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
    // InternalXpectParser.g:1353:1: rule__ComponentInline__Group__2__Impl : ( ( rule__ComponentInline__Group_2__0 ) ) ;
    public final void rule__ComponentInline__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalXpectParser.g:1357:1: ( ( ( rule__ComponentInline__Group_2__0 ) ) )
            // InternalXpectParser.g:1358:1: ( ( rule__ComponentInline__Group_2__0 ) )
            {
            // InternalXpectParser.g:1358:1: ( ( rule__ComponentInline__Group_2__0 ) )
            // InternalXpectParser.g:1359:1: ( rule__ComponentInline__Group_2__0 )
            {
             before(grammarAccess.getComponentInlineAccess().getGroup_2()); 
            // InternalXpectParser.g:1360:1: ( rule__ComponentInline__Group_2__0 )
            // InternalXpectParser.g:1360:2: rule__ComponentInline__Group_2__0
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
    // InternalXpectParser.g:1376:1: rule__ComponentInline__Group_1__0 : rule__ComponentInline__Group_1__0__Impl rule__ComponentInline__Group_1__1 ;
    public final void rule__ComponentInline__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalXpectParser.g:1380:1: ( rule__ComponentInline__Group_1__0__Impl rule__ComponentInline__Group_1__1 )
            // InternalXpectParser.g:1381:2: rule__ComponentInline__Group_1__0__Impl rule__ComponentInline__Group_1__1
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
    // InternalXpectParser.g:1388:1: rule__ComponentInline__Group_1__0__Impl : ( ( rule__ComponentInline__ComponentClassAssignment_1_0 ) ) ;
    public final void rule__ComponentInline__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalXpectParser.g:1392:1: ( ( ( rule__ComponentInline__ComponentClassAssignment_1_0 ) ) )
            // InternalXpectParser.g:1393:1: ( ( rule__ComponentInline__ComponentClassAssignment_1_0 ) )
            {
            // InternalXpectParser.g:1393:1: ( ( rule__ComponentInline__ComponentClassAssignment_1_0 ) )
            // InternalXpectParser.g:1394:1: ( rule__ComponentInline__ComponentClassAssignment_1_0 )
            {
             before(grammarAccess.getComponentInlineAccess().getComponentClassAssignment_1_0()); 
            // InternalXpectParser.g:1395:1: ( rule__ComponentInline__ComponentClassAssignment_1_0 )
            // InternalXpectParser.g:1395:2: rule__ComponentInline__ComponentClassAssignment_1_0
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
    // InternalXpectParser.g:1405:1: rule__ComponentInline__Group_1__1 : rule__ComponentInline__Group_1__1__Impl ;
    public final void rule__ComponentInline__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalXpectParser.g:1409:1: ( rule__ComponentInline__Group_1__1__Impl )
            // InternalXpectParser.g:1410:2: rule__ComponentInline__Group_1__1__Impl
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
    // InternalXpectParser.g:1416:1: rule__ComponentInline__Group_1__1__Impl : ( ( rule__ComponentInline__ParametersAssignment_1_1 )* ) ;
    public final void rule__ComponentInline__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalXpectParser.g:1420:1: ( ( ( rule__ComponentInline__ParametersAssignment_1_1 )* ) )
            // InternalXpectParser.g:1421:1: ( ( rule__ComponentInline__ParametersAssignment_1_1 )* )
            {
            // InternalXpectParser.g:1421:1: ( ( rule__ComponentInline__ParametersAssignment_1_1 )* )
            // InternalXpectParser.g:1422:1: ( rule__ComponentInline__ParametersAssignment_1_1 )*
            {
             before(grammarAccess.getComponentInlineAccess().getParametersAssignment_1_1()); 
            // InternalXpectParser.g:1423:1: ( rule__ComponentInline__ParametersAssignment_1_1 )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( ((LA14_0>=False && LA14_0<=True)||(LA14_0>=RULE_INT && LA14_0<=RULE_STRING)) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // InternalXpectParser.g:1423:2: rule__ComponentInline__ParametersAssignment_1_1
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
    // InternalXpectParser.g:1437:1: rule__ComponentInline__Group_2__0 : rule__ComponentInline__Group_2__0__Impl rule__ComponentInline__Group_2__1 ;
    public final void rule__ComponentInline__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalXpectParser.g:1441:1: ( rule__ComponentInline__Group_2__0__Impl rule__ComponentInline__Group_2__1 )
            // InternalXpectParser.g:1442:2: rule__ComponentInline__Group_2__0__Impl rule__ComponentInline__Group_2__1
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
    // InternalXpectParser.g:1449:1: rule__ComponentInline__Group_2__0__Impl : ( LeftCurlyBracket ) ;
    public final void rule__ComponentInline__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalXpectParser.g:1453:1: ( ( LeftCurlyBracket ) )
            // InternalXpectParser.g:1454:1: ( LeftCurlyBracket )
            {
            // InternalXpectParser.g:1454:1: ( LeftCurlyBracket )
            // InternalXpectParser.g:1455:1: LeftCurlyBracket
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
    // InternalXpectParser.g:1468:1: rule__ComponentInline__Group_2__1 : rule__ComponentInline__Group_2__1__Impl rule__ComponentInline__Group_2__2 ;
    public final void rule__ComponentInline__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalXpectParser.g:1472:1: ( rule__ComponentInline__Group_2__1__Impl rule__ComponentInline__Group_2__2 )
            // InternalXpectParser.g:1473:2: rule__ComponentInline__Group_2__1__Impl rule__ComponentInline__Group_2__2
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
    // InternalXpectParser.g:1480:1: rule__ComponentInline__Group_2__1__Impl : ( ( rule__ComponentInline__AssignmentsAssignment_2_1 )* ) ;
    public final void rule__ComponentInline__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalXpectParser.g:1484:1: ( ( ( rule__ComponentInline__AssignmentsAssignment_2_1 )* ) )
            // InternalXpectParser.g:1485:1: ( ( rule__ComponentInline__AssignmentsAssignment_2_1 )* )
            {
            // InternalXpectParser.g:1485:1: ( ( rule__ComponentInline__AssignmentsAssignment_2_1 )* )
            // InternalXpectParser.g:1486:1: ( rule__ComponentInline__AssignmentsAssignment_2_1 )*
            {
             before(grammarAccess.getComponentInlineAccess().getAssignmentsAssignment_2_1()); 
            // InternalXpectParser.g:1487:1: ( rule__ComponentInline__AssignmentsAssignment_2_1 )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==RULE_ID) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // InternalXpectParser.g:1487:2: rule__ComponentInline__AssignmentsAssignment_2_1
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
    // InternalXpectParser.g:1497:1: rule__ComponentInline__Group_2__2 : rule__ComponentInline__Group_2__2__Impl ;
    public final void rule__ComponentInline__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalXpectParser.g:1501:1: ( rule__ComponentInline__Group_2__2__Impl )
            // InternalXpectParser.g:1502:2: rule__ComponentInline__Group_2__2__Impl
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
    // InternalXpectParser.g:1508:1: rule__ComponentInline__Group_2__2__Impl : ( RightCurlyBracket ) ;
    public final void rule__ComponentInline__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalXpectParser.g:1512:1: ( ( RightCurlyBracket ) )
            // InternalXpectParser.g:1513:1: ( RightCurlyBracket )
            {
            // InternalXpectParser.g:1513:1: ( RightCurlyBracket )
            // InternalXpectParser.g:1514:1: RightCurlyBracket
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
    // InternalXpectParser.g:1533:1: rule__Literal__Group_0__0 : rule__Literal__Group_0__0__Impl rule__Literal__Group_0__1 ;
    public final void rule__Literal__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalXpectParser.g:1537:1: ( rule__Literal__Group_0__0__Impl rule__Literal__Group_0__1 )
            // InternalXpectParser.g:1538:2: rule__Literal__Group_0__0__Impl rule__Literal__Group_0__1
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
    // InternalXpectParser.g:1545:1: rule__Literal__Group_0__0__Impl : ( () ) ;
    public final void rule__Literal__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalXpectParser.g:1549:1: ( ( () ) )
            // InternalXpectParser.g:1550:1: ( () )
            {
            // InternalXpectParser.g:1550:1: ( () )
            // InternalXpectParser.g:1551:1: ()
            {
             before(grammarAccess.getLiteralAccess().getBooleanLiteralAction_0_0()); 
            // InternalXpectParser.g:1552:1: ()
            // InternalXpectParser.g:1554:1: 
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
    // InternalXpectParser.g:1564:1: rule__Literal__Group_0__1 : rule__Literal__Group_0__1__Impl ;
    public final void rule__Literal__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalXpectParser.g:1568:1: ( rule__Literal__Group_0__1__Impl )
            // InternalXpectParser.g:1569:2: rule__Literal__Group_0__1__Impl
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
    // InternalXpectParser.g:1575:1: rule__Literal__Group_0__1__Impl : ( ( rule__Literal__Alternatives_0_1 ) ) ;
    public final void rule__Literal__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalXpectParser.g:1579:1: ( ( ( rule__Literal__Alternatives_0_1 ) ) )
            // InternalXpectParser.g:1580:1: ( ( rule__Literal__Alternatives_0_1 ) )
            {
            // InternalXpectParser.g:1580:1: ( ( rule__Literal__Alternatives_0_1 ) )
            // InternalXpectParser.g:1581:1: ( rule__Literal__Alternatives_0_1 )
            {
             before(grammarAccess.getLiteralAccess().getAlternatives_0_1()); 
            // InternalXpectParser.g:1582:1: ( rule__Literal__Alternatives_0_1 )
            // InternalXpectParser.g:1582:2: rule__Literal__Alternatives_0_1
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
    // InternalXpectParser.g:1596:1: rule__Literal__Group_1__0 : rule__Literal__Group_1__0__Impl rule__Literal__Group_1__1 ;
    public final void rule__Literal__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalXpectParser.g:1600:1: ( rule__Literal__Group_1__0__Impl rule__Literal__Group_1__1 )
            // InternalXpectParser.g:1601:2: rule__Literal__Group_1__0__Impl rule__Literal__Group_1__1
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
    // InternalXpectParser.g:1608:1: rule__Literal__Group_1__0__Impl : ( () ) ;
    public final void rule__Literal__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalXpectParser.g:1612:1: ( ( () ) )
            // InternalXpectParser.g:1613:1: ( () )
            {
            // InternalXpectParser.g:1613:1: ( () )
            // InternalXpectParser.g:1614:1: ()
            {
             before(grammarAccess.getLiteralAccess().getIntLiteralAction_1_0()); 
            // InternalXpectParser.g:1615:1: ()
            // InternalXpectParser.g:1617:1: 
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
    // InternalXpectParser.g:1627:1: rule__Literal__Group_1__1 : rule__Literal__Group_1__1__Impl ;
    public final void rule__Literal__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalXpectParser.g:1631:1: ( rule__Literal__Group_1__1__Impl )
            // InternalXpectParser.g:1632:2: rule__Literal__Group_1__1__Impl
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
    // InternalXpectParser.g:1638:1: rule__Literal__Group_1__1__Impl : ( ( rule__Literal__ValueAssignment_1_1 ) ) ;
    public final void rule__Literal__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalXpectParser.g:1642:1: ( ( ( rule__Literal__ValueAssignment_1_1 ) ) )
            // InternalXpectParser.g:1643:1: ( ( rule__Literal__ValueAssignment_1_1 ) )
            {
            // InternalXpectParser.g:1643:1: ( ( rule__Literal__ValueAssignment_1_1 ) )
            // InternalXpectParser.g:1644:1: ( rule__Literal__ValueAssignment_1_1 )
            {
             before(grammarAccess.getLiteralAccess().getValueAssignment_1_1()); 
            // InternalXpectParser.g:1645:1: ( rule__Literal__ValueAssignment_1_1 )
            // InternalXpectParser.g:1645:2: rule__Literal__ValueAssignment_1_1
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
    // InternalXpectParser.g:1659:1: rule__Literal__Group_2__0 : rule__Literal__Group_2__0__Impl rule__Literal__Group_2__1 ;
    public final void rule__Literal__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalXpectParser.g:1663:1: ( rule__Literal__Group_2__0__Impl rule__Literal__Group_2__1 )
            // InternalXpectParser.g:1664:2: rule__Literal__Group_2__0__Impl rule__Literal__Group_2__1
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
    // InternalXpectParser.g:1671:1: rule__Literal__Group_2__0__Impl : ( () ) ;
    public final void rule__Literal__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalXpectParser.g:1675:1: ( ( () ) )
            // InternalXpectParser.g:1676:1: ( () )
            {
            // InternalXpectParser.g:1676:1: ( () )
            // InternalXpectParser.g:1677:1: ()
            {
             before(grammarAccess.getLiteralAccess().getStringLiteralAction_2_0()); 
            // InternalXpectParser.g:1678:1: ()
            // InternalXpectParser.g:1680:1: 
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
    // InternalXpectParser.g:1690:1: rule__Literal__Group_2__1 : rule__Literal__Group_2__1__Impl ;
    public final void rule__Literal__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalXpectParser.g:1694:1: ( rule__Literal__Group_2__1__Impl )
            // InternalXpectParser.g:1695:2: rule__Literal__Group_2__1__Impl
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
    // InternalXpectParser.g:1701:1: rule__Literal__Group_2__1__Impl : ( ( rule__Literal__ValueAssignment_2_1 ) ) ;
    public final void rule__Literal__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalXpectParser.g:1705:1: ( ( ( rule__Literal__ValueAssignment_2_1 ) ) )
            // InternalXpectParser.g:1706:1: ( ( rule__Literal__ValueAssignment_2_1 ) )
            {
            // InternalXpectParser.g:1706:1: ( ( rule__Literal__ValueAssignment_2_1 ) )
            // InternalXpectParser.g:1707:1: ( rule__Literal__ValueAssignment_2_1 )
            {
             before(grammarAccess.getLiteralAccess().getValueAssignment_2_1()); 
            // InternalXpectParser.g:1708:1: ( rule__Literal__ValueAssignment_2_1 )
            // InternalXpectParser.g:1708:2: rule__Literal__ValueAssignment_2_1
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
    // InternalXpectParser.g:1722:1: rule__ClassLiteral__Group__0 : rule__ClassLiteral__Group__0__Impl rule__ClassLiteral__Group__1 ;
    public final void rule__ClassLiteral__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalXpectParser.g:1726:1: ( rule__ClassLiteral__Group__0__Impl rule__ClassLiteral__Group__1 )
            // InternalXpectParser.g:1727:2: rule__ClassLiteral__Group__0__Impl rule__ClassLiteral__Group__1
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
    // InternalXpectParser.g:1734:1: rule__ClassLiteral__Group__0__Impl : ( () ) ;
    public final void rule__ClassLiteral__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalXpectParser.g:1738:1: ( ( () ) )
            // InternalXpectParser.g:1739:1: ( () )
            {
            // InternalXpectParser.g:1739:1: ( () )
            // InternalXpectParser.g:1740:1: ()
            {
             before(grammarAccess.getClassLiteralAccess().getClassLiteralAction_0()); 
            // InternalXpectParser.g:1741:1: ()
            // InternalXpectParser.g:1743:1: 
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
    // InternalXpectParser.g:1753:1: rule__ClassLiteral__Group__1 : rule__ClassLiteral__Group__1__Impl ;
    public final void rule__ClassLiteral__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalXpectParser.g:1757:1: ( rule__ClassLiteral__Group__1__Impl )
            // InternalXpectParser.g:1758:2: rule__ClassLiteral__Group__1__Impl
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
    // InternalXpectParser.g:1764:1: rule__ClassLiteral__Group__1__Impl : ( ( rule__ClassLiteral__TypeAssignment_1 ) ) ;
    public final void rule__ClassLiteral__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalXpectParser.g:1768:1: ( ( ( rule__ClassLiteral__TypeAssignment_1 ) ) )
            // InternalXpectParser.g:1769:1: ( ( rule__ClassLiteral__TypeAssignment_1 ) )
            {
            // InternalXpectParser.g:1769:1: ( ( rule__ClassLiteral__TypeAssignment_1 ) )
            // InternalXpectParser.g:1770:1: ( rule__ClassLiteral__TypeAssignment_1 )
            {
             before(grammarAccess.getClassLiteralAccess().getTypeAssignment_1()); 
            // InternalXpectParser.g:1771:1: ( rule__ClassLiteral__TypeAssignment_1 )
            // InternalXpectParser.g:1771:2: rule__ClassLiteral__TypeAssignment_1
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
    // InternalXpectParser.g:1785:1: rule__XpectIgnore__Group__0 : rule__XpectIgnore__Group__0__Impl rule__XpectIgnore__Group__1 ;
    public final void rule__XpectIgnore__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalXpectParser.g:1789:1: ( rule__XpectIgnore__Group__0__Impl rule__XpectIgnore__Group__1 )
            // InternalXpectParser.g:1790:2: rule__XpectIgnore__Group__0__Impl rule__XpectIgnore__Group__1
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
    // InternalXpectParser.g:1797:1: rule__XpectIgnore__Group__0__Impl : ( () ) ;
    public final void rule__XpectIgnore__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalXpectParser.g:1801:1: ( ( () ) )
            // InternalXpectParser.g:1802:1: ( () )
            {
            // InternalXpectParser.g:1802:1: ( () )
            // InternalXpectParser.g:1803:1: ()
            {
             before(grammarAccess.getXpectIgnoreAccess().getXpectIgnoreAction_0()); 
            // InternalXpectParser.g:1804:1: ()
            // InternalXpectParser.g:1806:1: 
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
    // InternalXpectParser.g:1816:1: rule__XpectIgnore__Group__1 : rule__XpectIgnore__Group__1__Impl ;
    public final void rule__XpectIgnore__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalXpectParser.g:1820:1: ( rule__XpectIgnore__Group__1__Impl )
            // InternalXpectParser.g:1821:2: rule__XpectIgnore__Group__1__Impl
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
    // InternalXpectParser.g:1827:1: rule__XpectIgnore__Group__1__Impl : ( XPECT_IGNORE ) ;
    public final void rule__XpectIgnore__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalXpectParser.g:1831:1: ( ( XPECT_IGNORE ) )
            // InternalXpectParser.g:1832:1: ( XPECT_IGNORE )
            {
            // InternalXpectParser.g:1832:1: ( XPECT_IGNORE )
            // InternalXpectParser.g:1833:1: XPECT_IGNORE
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
    // InternalXpectParser.g:1850:1: rule__Lexicalspace_Invocation__Group__0 : rule__Lexicalspace_Invocation__Group__0__Impl rule__Lexicalspace_Invocation__Group__1 ;
    public final void rule__Lexicalspace_Invocation__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalXpectParser.g:1854:1: ( rule__Lexicalspace_Invocation__Group__0__Impl rule__Lexicalspace_Invocation__Group__1 )
            // InternalXpectParser.g:1855:2: rule__Lexicalspace_Invocation__Group__0__Impl rule__Lexicalspace_Invocation__Group__1
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
    // InternalXpectParser.g:1862:1: rule__Lexicalspace_Invocation__Group__0__Impl : ( XPECT ) ;
    public final void rule__Lexicalspace_Invocation__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalXpectParser.g:1866:1: ( ( XPECT ) )
            // InternalXpectParser.g:1867:1: ( XPECT )
            {
            // InternalXpectParser.g:1867:1: ( XPECT )
            // InternalXpectParser.g:1868:1: XPECT
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
    // InternalXpectParser.g:1881:1: rule__Lexicalspace_Invocation__Group__1 : rule__Lexicalspace_Invocation__Group__1__Impl rule__Lexicalspace_Invocation__Group__2 ;
    public final void rule__Lexicalspace_Invocation__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalXpectParser.g:1885:1: ( rule__Lexicalspace_Invocation__Group__1__Impl rule__Lexicalspace_Invocation__Group__2 )
            // InternalXpectParser.g:1886:2: rule__Lexicalspace_Invocation__Group__1__Impl rule__Lexicalspace_Invocation__Group__2
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
    // InternalXpectParser.g:1893:1: rule__Lexicalspace_Invocation__Group__1__Impl : ( ( rule__Lexicalspace_Invocation__IgnoreAssignment_1 )? ) ;
    public final void rule__Lexicalspace_Invocation__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalXpectParser.g:1897:1: ( ( ( rule__Lexicalspace_Invocation__IgnoreAssignment_1 )? ) )
            // InternalXpectParser.g:1898:1: ( ( rule__Lexicalspace_Invocation__IgnoreAssignment_1 )? )
            {
            // InternalXpectParser.g:1898:1: ( ( rule__Lexicalspace_Invocation__IgnoreAssignment_1 )? )
            // InternalXpectParser.g:1899:1: ( rule__Lexicalspace_Invocation__IgnoreAssignment_1 )?
            {
             before(grammarAccess.getLexicalspace_InvocationAccess().getIgnoreAssignment_1()); 
            // InternalXpectParser.g:1900:1: ( rule__Lexicalspace_Invocation__IgnoreAssignment_1 )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==ExclamationMark) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // InternalXpectParser.g:1900:2: rule__Lexicalspace_Invocation__IgnoreAssignment_1
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
    // InternalXpectParser.g:1910:1: rule__Lexicalspace_Invocation__Group__2 : rule__Lexicalspace_Invocation__Group__2__Impl rule__Lexicalspace_Invocation__Group__3 ;
    public final void rule__Lexicalspace_Invocation__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalXpectParser.g:1914:1: ( rule__Lexicalspace_Invocation__Group__2__Impl rule__Lexicalspace_Invocation__Group__3 )
            // InternalXpectParser.g:1915:2: rule__Lexicalspace_Invocation__Group__2__Impl rule__Lexicalspace_Invocation__Group__3
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
    // InternalXpectParser.g:1922:1: rule__Lexicalspace_Invocation__Group__2__Impl : ( ( rule__Lexicalspace_Invocation__FixmeAssignment_2 )? ) ;
    public final void rule__Lexicalspace_Invocation__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalXpectParser.g:1926:1: ( ( ( rule__Lexicalspace_Invocation__FixmeAssignment_2 )? ) )
            // InternalXpectParser.g:1927:1: ( ( rule__Lexicalspace_Invocation__FixmeAssignment_2 )? )
            {
            // InternalXpectParser.g:1927:1: ( ( rule__Lexicalspace_Invocation__FixmeAssignment_2 )? )
            // InternalXpectParser.g:1928:1: ( rule__Lexicalspace_Invocation__FixmeAssignment_2 )?
            {
             before(grammarAccess.getLexicalspace_InvocationAccess().getFixmeAssignment_2()); 
            // InternalXpectParser.g:1929:1: ( rule__Lexicalspace_Invocation__FixmeAssignment_2 )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==FIXME) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // InternalXpectParser.g:1929:2: rule__Lexicalspace_Invocation__FixmeAssignment_2
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
    // InternalXpectParser.g:1939:1: rule__Lexicalspace_Invocation__Group__3 : rule__Lexicalspace_Invocation__Group__3__Impl ;
    public final void rule__Lexicalspace_Invocation__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalXpectParser.g:1943:1: ( rule__Lexicalspace_Invocation__Group__3__Impl )
            // InternalXpectParser.g:1944:2: rule__Lexicalspace_Invocation__Group__3__Impl
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
    // InternalXpectParser.g:1950:1: rule__Lexicalspace_Invocation__Group__3__Impl : ( ( rule__Lexicalspace_Invocation__MethodAssignment_3 ) ) ;
    public final void rule__Lexicalspace_Invocation__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalXpectParser.g:1954:1: ( ( ( rule__Lexicalspace_Invocation__MethodAssignment_3 ) ) )
            // InternalXpectParser.g:1955:1: ( ( rule__Lexicalspace_Invocation__MethodAssignment_3 ) )
            {
            // InternalXpectParser.g:1955:1: ( ( rule__Lexicalspace_Invocation__MethodAssignment_3 ) )
            // InternalXpectParser.g:1956:1: ( rule__Lexicalspace_Invocation__MethodAssignment_3 )
            {
             before(grammarAccess.getLexicalspace_InvocationAccess().getMethodAssignment_3()); 
            // InternalXpectParser.g:1957:1: ( rule__Lexicalspace_Invocation__MethodAssignment_3 )
            // InternalXpectParser.g:1957:2: rule__Lexicalspace_Invocation__MethodAssignment_3
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
    // InternalXpectParser.g:1975:1: rule__QualifiedName__Group__0 : rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1 ;
    public final void rule__QualifiedName__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalXpectParser.g:1979:1: ( rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1 )
            // InternalXpectParser.g:1980:2: rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1
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
    // InternalXpectParser.g:1987:1: rule__QualifiedName__Group__0__Impl : ( RULE_ID ) ;
    public final void rule__QualifiedName__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalXpectParser.g:1991:1: ( ( RULE_ID ) )
            // InternalXpectParser.g:1992:1: ( RULE_ID )
            {
            // InternalXpectParser.g:1992:1: ( RULE_ID )
            // InternalXpectParser.g:1993:1: RULE_ID
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
    // InternalXpectParser.g:2004:1: rule__QualifiedName__Group__1 : rule__QualifiedName__Group__1__Impl ;
    public final void rule__QualifiedName__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalXpectParser.g:2008:1: ( rule__QualifiedName__Group__1__Impl )
            // InternalXpectParser.g:2009:2: rule__QualifiedName__Group__1__Impl
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
    // InternalXpectParser.g:2015:1: rule__QualifiedName__Group__1__Impl : ( ( rule__QualifiedName__Group_1__0 )* ) ;
    public final void rule__QualifiedName__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalXpectParser.g:2019:1: ( ( ( rule__QualifiedName__Group_1__0 )* ) )
            // InternalXpectParser.g:2020:1: ( ( rule__QualifiedName__Group_1__0 )* )
            {
            // InternalXpectParser.g:2020:1: ( ( rule__QualifiedName__Group_1__0 )* )
            // InternalXpectParser.g:2021:1: ( rule__QualifiedName__Group_1__0 )*
            {
             before(grammarAccess.getQualifiedNameAccess().getGroup_1()); 
            // InternalXpectParser.g:2022:1: ( rule__QualifiedName__Group_1__0 )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( (LA18_0==FullStop) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // InternalXpectParser.g:2022:2: rule__QualifiedName__Group_1__0
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
    // InternalXpectParser.g:2036:1: rule__QualifiedName__Group_1__0 : rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1 ;
    public final void rule__QualifiedName__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalXpectParser.g:2040:1: ( rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1 )
            // InternalXpectParser.g:2041:2: rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1
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
    // InternalXpectParser.g:2048:1: rule__QualifiedName__Group_1__0__Impl : ( FullStop ) ;
    public final void rule__QualifiedName__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalXpectParser.g:2052:1: ( ( FullStop ) )
            // InternalXpectParser.g:2053:1: ( FullStop )
            {
            // InternalXpectParser.g:2053:1: ( FullStop )
            // InternalXpectParser.g:2054:1: FullStop
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
    // InternalXpectParser.g:2067:1: rule__QualifiedName__Group_1__1 : rule__QualifiedName__Group_1__1__Impl ;
    public final void rule__QualifiedName__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalXpectParser.g:2071:1: ( rule__QualifiedName__Group_1__1__Impl )
            // InternalXpectParser.g:2072:2: rule__QualifiedName__Group_1__1__Impl
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
    // InternalXpectParser.g:2078:1: rule__QualifiedName__Group_1__1__Impl : ( RULE_ID ) ;
    public final void rule__QualifiedName__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalXpectParser.g:2082:1: ( ( RULE_ID ) )
            // InternalXpectParser.g:2083:1: ( RULE_ID )
            {
            // InternalXpectParser.g:2083:1: ( RULE_ID )
            // InternalXpectParser.g:2084:1: RULE_ID
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
    // InternalXpectParser.g:2100:1: rule__XpectFile__MembersAssignment_1_0_0 : ( ruleText ) ;
    public final void rule__XpectFile__MembersAssignment_1_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalXpectParser.g:2104:1: ( ( ruleText ) )
            // InternalXpectParser.g:2105:1: ( ruleText )
            {
            // InternalXpectParser.g:2105:1: ( ruleText )
            // InternalXpectParser.g:2106:1: ruleText
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
    // InternalXpectParser.g:2115:1: rule__XpectFile__MembersAssignment_1_0_1 : ( ruleMember ) ;
    public final void rule__XpectFile__MembersAssignment_1_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalXpectParser.g:2119:1: ( ( ruleMember ) )
            // InternalXpectParser.g:2120:1: ( ruleMember )
            {
            // InternalXpectParser.g:2120:1: ( ruleMember )
            // InternalXpectParser.g:2121:1: ruleMember
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
    // InternalXpectParser.g:2130:1: rule__XpectFile__MembersAssignment_1_1 : ( ruleText ) ;
    public final void rule__XpectFile__MembersAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalXpectParser.g:2134:1: ( ( ruleText ) )
            // InternalXpectParser.g:2135:1: ( ruleText )
            {
            // InternalXpectParser.g:2135:1: ( ruleText )
            // InternalXpectParser.g:2136:1: ruleText
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
    // InternalXpectParser.g:2145:1: rule__Text__TextAssignment : ( ruleAnyText ) ;
    public final void rule__Text__TextAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalXpectParser.g:2149:1: ( ( ruleAnyText ) )
            // InternalXpectParser.g:2150:1: ( ruleAnyText )
            {
            // InternalXpectParser.g:2150:1: ( ruleAnyText )
            // InternalXpectParser.g:2151:1: ruleAnyText
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
    // InternalXpectParser.g:2160:1: rule__Lexicalspace_Setup__DeclaredSuiteAssignment_2 : ( ( ruleQualifiedName ) ) ;
    public final void rule__Lexicalspace_Setup__DeclaredSuiteAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalXpectParser.g:2164:1: ( ( ( ruleQualifiedName ) ) )
            // InternalXpectParser.g:2165:1: ( ( ruleQualifiedName ) )
            {
            // InternalXpectParser.g:2165:1: ( ( ruleQualifiedName ) )
            // InternalXpectParser.g:2166:1: ( ruleQualifiedName )
            {
             before(grammarAccess.getLexicalspace_SetupAccess().getDeclaredSuiteJvmDeclaredTypeCrossReference_2_0()); 
            // InternalXpectParser.g:2167:1: ( ruleQualifiedName )
            // InternalXpectParser.g:2168:1: ruleQualifiedName
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
    // InternalXpectParser.g:2179:1: rule__Lexicalspace_Setup__AssignmentsAssignment_3 : ( ruleAssignment ) ;
    public final void rule__Lexicalspace_Setup__AssignmentsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalXpectParser.g:2183:1: ( ( ruleAssignment ) )
            // InternalXpectParser.g:2184:1: ( ruleAssignment )
            {
            // InternalXpectParser.g:2184:1: ( ruleAssignment )
            // InternalXpectParser.g:2185:1: ruleAssignment
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
    // InternalXpectParser.g:2194:1: rule__Assignment__DeclaredTargetAssignment_0_0 : ( ( RULE_ID ) ) ;
    public final void rule__Assignment__DeclaredTargetAssignment_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalXpectParser.g:2198:1: ( ( ( RULE_ID ) ) )
            // InternalXpectParser.g:2199:1: ( ( RULE_ID ) )
            {
            // InternalXpectParser.g:2199:1: ( ( RULE_ID ) )
            // InternalXpectParser.g:2200:1: ( RULE_ID )
            {
             before(grammarAccess.getAssignmentAccess().getDeclaredTargetJvmOperationCrossReference_0_0_0()); 
            // InternalXpectParser.g:2201:1: ( RULE_ID )
            // InternalXpectParser.g:2202:1: RULE_ID
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
    // InternalXpectParser.g:2213:1: rule__Assignment__ValueAssignment_0_2 : ( ruleValue ) ;
    public final void rule__Assignment__ValueAssignment_0_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalXpectParser.g:2217:1: ( ( ruleValue ) )
            // InternalXpectParser.g:2218:1: ( ruleValue )
            {
            // InternalXpectParser.g:2218:1: ( ruleValue )
            // InternalXpectParser.g:2219:1: ruleValue
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
    // InternalXpectParser.g:2228:1: rule__Assignment__ValueAssignment_1 : ( ruleComponentLong ) ;
    public final void rule__Assignment__ValueAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalXpectParser.g:2232:1: ( ( ruleComponentLong ) )
            // InternalXpectParser.g:2233:1: ( ruleComponentLong )
            {
            // InternalXpectParser.g:2233:1: ( ruleComponentLong )
            // InternalXpectParser.g:2234:1: ruleComponentLong
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
    // InternalXpectParser.g:2243:1: rule__ComponentLong__ComponentClassAssignment_1 : ( ( ruleQualifiedName ) ) ;
    public final void rule__ComponentLong__ComponentClassAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalXpectParser.g:2247:1: ( ( ( ruleQualifiedName ) ) )
            // InternalXpectParser.g:2248:1: ( ( ruleQualifiedName ) )
            {
            // InternalXpectParser.g:2248:1: ( ( ruleQualifiedName ) )
            // InternalXpectParser.g:2249:1: ( ruleQualifiedName )
            {
             before(grammarAccess.getComponentLongAccess().getComponentClassJvmDeclaredTypeCrossReference_1_0()); 
            // InternalXpectParser.g:2250:1: ( ruleQualifiedName )
            // InternalXpectParser.g:2251:1: ruleQualifiedName
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
    // InternalXpectParser.g:2262:1: rule__ComponentLong__ParametersAssignment_2 : ( ruleLiteral ) ;
    public final void rule__ComponentLong__ParametersAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalXpectParser.g:2266:1: ( ( ruleLiteral ) )
            // InternalXpectParser.g:2267:1: ( ruleLiteral )
            {
            // InternalXpectParser.g:2267:1: ( ruleLiteral )
            // InternalXpectParser.g:2268:1: ruleLiteral
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
    // InternalXpectParser.g:2277:1: rule__ComponentLong__AssignmentsAssignment_3_1 : ( ruleAssignment ) ;
    public final void rule__ComponentLong__AssignmentsAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalXpectParser.g:2281:1: ( ( ruleAssignment ) )
            // InternalXpectParser.g:2282:1: ( ruleAssignment )
            {
            // InternalXpectParser.g:2282:1: ( ruleAssignment )
            // InternalXpectParser.g:2283:1: ruleAssignment
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
    // InternalXpectParser.g:2292:1: rule__ComponentInline__ComponentClassAssignment_1_0 : ( ( ruleQualifiedName ) ) ;
    public final void rule__ComponentInline__ComponentClassAssignment_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalXpectParser.g:2296:1: ( ( ( ruleQualifiedName ) ) )
            // InternalXpectParser.g:2297:1: ( ( ruleQualifiedName ) )
            {
            // InternalXpectParser.g:2297:1: ( ( ruleQualifiedName ) )
            // InternalXpectParser.g:2298:1: ( ruleQualifiedName )
            {
             before(grammarAccess.getComponentInlineAccess().getComponentClassJvmDeclaredTypeCrossReference_1_0_0()); 
            // InternalXpectParser.g:2299:1: ( ruleQualifiedName )
            // InternalXpectParser.g:2300:1: ruleQualifiedName
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
    // InternalXpectParser.g:2311:1: rule__ComponentInline__ParametersAssignment_1_1 : ( ruleLiteral ) ;
    public final void rule__ComponentInline__ParametersAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalXpectParser.g:2315:1: ( ( ruleLiteral ) )
            // InternalXpectParser.g:2316:1: ( ruleLiteral )
            {
            // InternalXpectParser.g:2316:1: ( ruleLiteral )
            // InternalXpectParser.g:2317:1: ruleLiteral
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
    // InternalXpectParser.g:2326:1: rule__ComponentInline__AssignmentsAssignment_2_1 : ( ruleAssignment ) ;
    public final void rule__ComponentInline__AssignmentsAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalXpectParser.g:2330:1: ( ( ruleAssignment ) )
            // InternalXpectParser.g:2331:1: ( ruleAssignment )
            {
            // InternalXpectParser.g:2331:1: ( ruleAssignment )
            // InternalXpectParser.g:2332:1: ruleAssignment
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
    // InternalXpectParser.g:2341:1: rule__Literal__ValueAssignment_0_1_0 : ( ( True ) ) ;
    public final void rule__Literal__ValueAssignment_0_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalXpectParser.g:2345:1: ( ( ( True ) ) )
            // InternalXpectParser.g:2346:1: ( ( True ) )
            {
            // InternalXpectParser.g:2346:1: ( ( True ) )
            // InternalXpectParser.g:2347:1: ( True )
            {
             before(grammarAccess.getLiteralAccess().getValueTrueKeyword_0_1_0_0()); 
            // InternalXpectParser.g:2348:1: ( True )
            // InternalXpectParser.g:2349:1: True
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
    // InternalXpectParser.g:2364:1: rule__Literal__ValueAssignment_1_1 : ( RULE_INT ) ;
    public final void rule__Literal__ValueAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalXpectParser.g:2368:1: ( ( RULE_INT ) )
            // InternalXpectParser.g:2369:1: ( RULE_INT )
            {
            // InternalXpectParser.g:2369:1: ( RULE_INT )
            // InternalXpectParser.g:2370:1: RULE_INT
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
    // InternalXpectParser.g:2379:1: rule__Literal__ValueAssignment_2_1 : ( RULE_STRING ) ;
    public final void rule__Literal__ValueAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalXpectParser.g:2383:1: ( ( RULE_STRING ) )
            // InternalXpectParser.g:2384:1: ( RULE_STRING )
            {
            // InternalXpectParser.g:2384:1: ( RULE_STRING )
            // InternalXpectParser.g:2385:1: RULE_STRING
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
    // InternalXpectParser.g:2394:1: rule__ClassLiteral__TypeAssignment_1 : ( ( ruleQualifiedName ) ) ;
    public final void rule__ClassLiteral__TypeAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalXpectParser.g:2398:1: ( ( ( ruleQualifiedName ) ) )
            // InternalXpectParser.g:2399:1: ( ( ruleQualifiedName ) )
            {
            // InternalXpectParser.g:2399:1: ( ( ruleQualifiedName ) )
            // InternalXpectParser.g:2400:1: ( ruleQualifiedName )
            {
             before(grammarAccess.getClassLiteralAccess().getTypeJvmDeclaredTypeCrossReference_1_0()); 
            // InternalXpectParser.g:2401:1: ( ruleQualifiedName )
            // InternalXpectParser.g:2402:1: ruleQualifiedName
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
    // InternalXpectParser.g:2413:1: rule__Lexicalspace_Invocation__IgnoreAssignment_1 : ( ( ExclamationMark ) ) ;
    public final void rule__Lexicalspace_Invocation__IgnoreAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalXpectParser.g:2417:1: ( ( ( ExclamationMark ) ) )
            // InternalXpectParser.g:2418:1: ( ( ExclamationMark ) )
            {
            // InternalXpectParser.g:2418:1: ( ( ExclamationMark ) )
            // InternalXpectParser.g:2419:1: ( ExclamationMark )
            {
             before(grammarAccess.getLexicalspace_InvocationAccess().getIgnoreExclamationMarkKeyword_1_0()); 
            // InternalXpectParser.g:2420:1: ( ExclamationMark )
            // InternalXpectParser.g:2421:1: ExclamationMark
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
    // InternalXpectParser.g:2436:1: rule__Lexicalspace_Invocation__FixmeAssignment_2 : ( ( FIXME ) ) ;
    public final void rule__Lexicalspace_Invocation__FixmeAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalXpectParser.g:2440:1: ( ( ( FIXME ) ) )
            // InternalXpectParser.g:2441:1: ( ( FIXME ) )
            {
            // InternalXpectParser.g:2441:1: ( ( FIXME ) )
            // InternalXpectParser.g:2442:1: ( FIXME )
            {
             before(grammarAccess.getLexicalspace_InvocationAccess().getFixmeFIXMEKeyword_2_0()); 
            // InternalXpectParser.g:2443:1: ( FIXME )
            // InternalXpectParser.g:2444:1: FIXME
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
    // InternalXpectParser.g:2459:1: rule__Lexicalspace_Invocation__MethodAssignment_3 : ( ( RULE_INVOCATION ) ) ;
    public final void rule__Lexicalspace_Invocation__MethodAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // InternalXpectParser.g:2463:1: ( ( ( RULE_INVOCATION ) ) )
            // InternalXpectParser.g:2464:1: ( ( RULE_INVOCATION ) )
            {
            // InternalXpectParser.g:2464:1: ( ( RULE_INVOCATION ) )
            // InternalXpectParser.g:2465:1: ( RULE_INVOCATION )
            {
             before(grammarAccess.getLexicalspace_InvocationAccess().getMethodXjmXpectMethodCrossReference_3_0()); 
            // InternalXpectParser.g:2466:1: ( RULE_INVOCATION )
            // InternalXpectParser.g:2467:1: RULE_INVOCATION
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
            return "540:1: rule__Value__Alternatives : ( ( ruleLiteral ) | ( ruleClassLiteral ) | ( ruleComponentInline ) );";
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
            return "()* loopback of 704:1: ( rule__XpectFile__Group_1_0__0 )*";
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
            return "888:1: ( rule__Lexicalspace_Setup__DeclaredSuiteAssignment_2 )?";
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