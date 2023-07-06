package org.eclipse.xpect.ide.contentassist.antlr.internal;

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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ANY_OTHER", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_INVOCATION", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "'false'", "'XPECT_SETUP'", "'END_SETUP'", "'='", "'{'", "'}'", "'XPECT_IGNORE'", "'XPECT'", "'.'", "'true'", "'!'", "'FIXME'"
    };
    public static final int RULE_STRING=7;
    public static final int RULE_SL_COMMENT=10;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int EOF=-1;
    public static final int RULE_ID=5;
    public static final int RULE_WS=11;
    public static final int RULE_ANY_OTHER=4;
    public static final int RULE_INVOCATION=8;
    public static final int RULE_INT=6;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=9;
    public static final int T__23=23;
    public static final int T__20=20;
    public static final int T__21=21;

    // delegates
    // delegators


        public InternalXpectParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalXpectParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalXpectParser.tokenNames; }
    public String getGrammarFileName() { return "InternalXpect.g"; }


    	private XpectGrammarAccess grammarAccess;

    	public void setGrammarAccess(XpectGrammarAccess grammarAccess) {
    		this.grammarAccess = grammarAccess;
    	}

    	@Override
    	protected Grammar getGrammar() {
    		return grammarAccess.getGrammar();
    	}

    	@Override
    	protected String getValueForTokenName(String tokenName) {
    		return tokenName;
    	}



    // $ANTLR start "entryRuleXpectFile"
    // InternalXpect.g:53:1: entryRuleXpectFile : ruleXpectFile EOF ;
    public final void entryRuleXpectFile() throws RecognitionException {
        try {
            // InternalXpect.g:54:1: ( ruleXpectFile EOF )
            // InternalXpect.g:55:1: ruleXpectFile EOF
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
    // InternalXpect.g:62:1: ruleXpectFile : ( ( rule__XpectFile__Group__0 ) ) ;
    public final void ruleXpectFile() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXpect.g:66:2: ( ( ( rule__XpectFile__Group__0 ) ) )
            // InternalXpect.g:67:2: ( ( rule__XpectFile__Group__0 ) )
            {
            // InternalXpect.g:67:2: ( ( rule__XpectFile__Group__0 ) )
            // InternalXpect.g:68:3: ( rule__XpectFile__Group__0 )
            {
             before(grammarAccess.getXpectFileAccess().getGroup()); 
            // InternalXpect.g:69:3: ( rule__XpectFile__Group__0 )
            // InternalXpect.g:69:4: rule__XpectFile__Group__0
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
    // InternalXpect.g:78:1: entryRuleMember : ruleMember EOF ;
    public final void entryRuleMember() throws RecognitionException {
        try {
            // InternalXpect.g:79:1: ( ruleMember EOF )
            // InternalXpect.g:80:1: ruleMember EOF
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
    // InternalXpect.g:87:1: ruleMember : ( ( rule__Member__Alternatives ) ) ;
    public final void ruleMember() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXpect.g:91:2: ( ( ( rule__Member__Alternatives ) ) )
            // InternalXpect.g:92:2: ( ( rule__Member__Alternatives ) )
            {
            // InternalXpect.g:92:2: ( ( rule__Member__Alternatives ) )
            // InternalXpect.g:93:3: ( rule__Member__Alternatives )
            {
             before(grammarAccess.getMemberAccess().getAlternatives()); 
            // InternalXpect.g:94:3: ( rule__Member__Alternatives )
            // InternalXpect.g:94:4: rule__Member__Alternatives
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
    // InternalXpect.g:103:1: entryRuleText : ruleText EOF ;
    public final void entryRuleText() throws RecognitionException {
        try {
            // InternalXpect.g:104:1: ( ruleText EOF )
            // InternalXpect.g:105:1: ruleText EOF
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
    // InternalXpect.g:112:1: ruleText : ( ( rule__Text__TextAssignment ) ) ;
    public final void ruleText() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXpect.g:116:2: ( ( ( rule__Text__TextAssignment ) ) )
            // InternalXpect.g:117:2: ( ( rule__Text__TextAssignment ) )
            {
            // InternalXpect.g:117:2: ( ( rule__Text__TextAssignment ) )
            // InternalXpect.g:118:3: ( rule__Text__TextAssignment )
            {
             before(grammarAccess.getTextAccess().getTextAssignment()); 
            // InternalXpect.g:119:3: ( rule__Text__TextAssignment )
            // InternalXpect.g:119:4: rule__Text__TextAssignment
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
    // InternalXpect.g:128:1: entryRuleLexicalspace_Setup : ruleLexicalspace_Setup EOF ;
    public final void entryRuleLexicalspace_Setup() throws RecognitionException {
         
        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT");

        try {
            // InternalXpect.g:132:1: ( ruleLexicalspace_Setup EOF )
            // InternalXpect.g:133:1: ruleLexicalspace_Setup EOF
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
    // InternalXpect.g:143:1: ruleLexicalspace_Setup : ( ( rule__Lexicalspace_Setup__Group__0 ) ) ;
    public final void ruleLexicalspace_Setup() throws RecognitionException {

        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT");
        		int stackSize = keepStackSize();
        	
        try {
            // InternalXpect.g:148:2: ( ( ( rule__Lexicalspace_Setup__Group__0 ) ) )
            // InternalXpect.g:149:2: ( ( rule__Lexicalspace_Setup__Group__0 ) )
            {
            // InternalXpect.g:149:2: ( ( rule__Lexicalspace_Setup__Group__0 ) )
            // InternalXpect.g:150:3: ( rule__Lexicalspace_Setup__Group__0 )
            {
             before(grammarAccess.getLexicalspace_SetupAccess().getGroup()); 
            // InternalXpect.g:151:3: ( rule__Lexicalspace_Setup__Group__0 )
            // InternalXpect.g:151:4: rule__Lexicalspace_Setup__Group__0
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
    // InternalXpect.g:161:1: entryRuleAssignment : ruleAssignment EOF ;
    public final void entryRuleAssignment() throws RecognitionException {
        try {
            // InternalXpect.g:162:1: ( ruleAssignment EOF )
            // InternalXpect.g:163:1: ruleAssignment EOF
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
    // InternalXpect.g:170:1: ruleAssignment : ( ( rule__Assignment__Alternatives ) ) ;
    public final void ruleAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXpect.g:174:2: ( ( ( rule__Assignment__Alternatives ) ) )
            // InternalXpect.g:175:2: ( ( rule__Assignment__Alternatives ) )
            {
            // InternalXpect.g:175:2: ( ( rule__Assignment__Alternatives ) )
            // InternalXpect.g:176:3: ( rule__Assignment__Alternatives )
            {
             before(grammarAccess.getAssignmentAccess().getAlternatives()); 
            // InternalXpect.g:177:3: ( rule__Assignment__Alternatives )
            // InternalXpect.g:177:4: rule__Assignment__Alternatives
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
    // InternalXpect.g:186:1: entryRuleValue : ruleValue EOF ;
    public final void entryRuleValue() throws RecognitionException {
        try {
            // InternalXpect.g:187:1: ( ruleValue EOF )
            // InternalXpect.g:188:1: ruleValue EOF
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
    // InternalXpect.g:195:1: ruleValue : ( ( rule__Value__Alternatives ) ) ;
    public final void ruleValue() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXpect.g:199:2: ( ( ( rule__Value__Alternatives ) ) )
            // InternalXpect.g:200:2: ( ( rule__Value__Alternatives ) )
            {
            // InternalXpect.g:200:2: ( ( rule__Value__Alternatives ) )
            // InternalXpect.g:201:3: ( rule__Value__Alternatives )
            {
             before(grammarAccess.getValueAccess().getAlternatives()); 
            // InternalXpect.g:202:3: ( rule__Value__Alternatives )
            // InternalXpect.g:202:4: rule__Value__Alternatives
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
    // InternalXpect.g:211:1: entryRuleComponentLong : ruleComponentLong EOF ;
    public final void entryRuleComponentLong() throws RecognitionException {
        try {
            // InternalXpect.g:212:1: ( ruleComponentLong EOF )
            // InternalXpect.g:213:1: ruleComponentLong EOF
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
    // InternalXpect.g:220:1: ruleComponentLong : ( ( rule__ComponentLong__Group__0 ) ) ;
    public final void ruleComponentLong() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXpect.g:224:2: ( ( ( rule__ComponentLong__Group__0 ) ) )
            // InternalXpect.g:225:2: ( ( rule__ComponentLong__Group__0 ) )
            {
            // InternalXpect.g:225:2: ( ( rule__ComponentLong__Group__0 ) )
            // InternalXpect.g:226:3: ( rule__ComponentLong__Group__0 )
            {
             before(grammarAccess.getComponentLongAccess().getGroup()); 
            // InternalXpect.g:227:3: ( rule__ComponentLong__Group__0 )
            // InternalXpect.g:227:4: rule__ComponentLong__Group__0
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
    // InternalXpect.g:236:1: entryRuleComponentInline : ruleComponentInline EOF ;
    public final void entryRuleComponentInline() throws RecognitionException {
        try {
            // InternalXpect.g:237:1: ( ruleComponentInline EOF )
            // InternalXpect.g:238:1: ruleComponentInline EOF
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
    // InternalXpect.g:245:1: ruleComponentInline : ( ( rule__ComponentInline__Group__0 ) ) ;
    public final void ruleComponentInline() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXpect.g:249:2: ( ( ( rule__ComponentInline__Group__0 ) ) )
            // InternalXpect.g:250:2: ( ( rule__ComponentInline__Group__0 ) )
            {
            // InternalXpect.g:250:2: ( ( rule__ComponentInline__Group__0 ) )
            // InternalXpect.g:251:3: ( rule__ComponentInline__Group__0 )
            {
             before(grammarAccess.getComponentInlineAccess().getGroup()); 
            // InternalXpect.g:252:3: ( rule__ComponentInline__Group__0 )
            // InternalXpect.g:252:4: rule__ComponentInline__Group__0
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
    // InternalXpect.g:261:1: entryRuleLiteral : ruleLiteral EOF ;
    public final void entryRuleLiteral() throws RecognitionException {
        try {
            // InternalXpect.g:262:1: ( ruleLiteral EOF )
            // InternalXpect.g:263:1: ruleLiteral EOF
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
    // InternalXpect.g:270:1: ruleLiteral : ( ( rule__Literal__Alternatives ) ) ;
    public final void ruleLiteral() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXpect.g:274:2: ( ( ( rule__Literal__Alternatives ) ) )
            // InternalXpect.g:275:2: ( ( rule__Literal__Alternatives ) )
            {
            // InternalXpect.g:275:2: ( ( rule__Literal__Alternatives ) )
            // InternalXpect.g:276:3: ( rule__Literal__Alternatives )
            {
             before(grammarAccess.getLiteralAccess().getAlternatives()); 
            // InternalXpect.g:277:3: ( rule__Literal__Alternatives )
            // InternalXpect.g:277:4: rule__Literal__Alternatives
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
    // InternalXpect.g:286:1: entryRuleClassLiteral : ruleClassLiteral EOF ;
    public final void entryRuleClassLiteral() throws RecognitionException {
        try {
            // InternalXpect.g:287:1: ( ruleClassLiteral EOF )
            // InternalXpect.g:288:1: ruleClassLiteral EOF
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
    // InternalXpect.g:295:1: ruleClassLiteral : ( ( rule__ClassLiteral__Group__0 ) ) ;
    public final void ruleClassLiteral() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXpect.g:299:2: ( ( ( rule__ClassLiteral__Group__0 ) ) )
            // InternalXpect.g:300:2: ( ( rule__ClassLiteral__Group__0 ) )
            {
            // InternalXpect.g:300:2: ( ( rule__ClassLiteral__Group__0 ) )
            // InternalXpect.g:301:3: ( rule__ClassLiteral__Group__0 )
            {
             before(grammarAccess.getClassLiteralAccess().getGroup()); 
            // InternalXpect.g:302:3: ( rule__ClassLiteral__Group__0 )
            // InternalXpect.g:302:4: rule__ClassLiteral__Group__0
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
    // InternalXpect.g:311:1: entryRuleXpectIgnore : ruleXpectIgnore EOF ;
    public final void entryRuleXpectIgnore() throws RecognitionException {
        try {
            // InternalXpect.g:312:1: ( ruleXpectIgnore EOF )
            // InternalXpect.g:313:1: ruleXpectIgnore EOF
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
    // InternalXpect.g:320:1: ruleXpectIgnore : ( ( rule__XpectIgnore__Group__0 ) ) ;
    public final void ruleXpectIgnore() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXpect.g:324:2: ( ( ( rule__XpectIgnore__Group__0 ) ) )
            // InternalXpect.g:325:2: ( ( rule__XpectIgnore__Group__0 ) )
            {
            // InternalXpect.g:325:2: ( ( rule__XpectIgnore__Group__0 ) )
            // InternalXpect.g:326:3: ( rule__XpectIgnore__Group__0 )
            {
             before(grammarAccess.getXpectIgnoreAccess().getGroup()); 
            // InternalXpect.g:327:3: ( rule__XpectIgnore__Group__0 )
            // InternalXpect.g:327:4: rule__XpectIgnore__Group__0
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
    // InternalXpect.g:336:1: entryRuleLexicalspace_Invocation : ruleLexicalspace_Invocation EOF ;
    public final void entryRuleLexicalspace_Invocation() throws RecognitionException {
         
        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT");

        try {
            // InternalXpect.g:340:1: ( ruleLexicalspace_Invocation EOF )
            // InternalXpect.g:341:1: ruleLexicalspace_Invocation EOF
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
    // InternalXpect.g:351:1: ruleLexicalspace_Invocation : ( ( rule__Lexicalspace_Invocation__Group__0 ) ) ;
    public final void ruleLexicalspace_Invocation() throws RecognitionException {

        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT");
        		int stackSize = keepStackSize();
        	
        try {
            // InternalXpect.g:356:2: ( ( ( rule__Lexicalspace_Invocation__Group__0 ) ) )
            // InternalXpect.g:357:2: ( ( rule__Lexicalspace_Invocation__Group__0 ) )
            {
            // InternalXpect.g:357:2: ( ( rule__Lexicalspace_Invocation__Group__0 ) )
            // InternalXpect.g:358:3: ( rule__Lexicalspace_Invocation__Group__0 )
            {
             before(grammarAccess.getLexicalspace_InvocationAccess().getGroup()); 
            // InternalXpect.g:359:3: ( rule__Lexicalspace_Invocation__Group__0 )
            // InternalXpect.g:359:4: rule__Lexicalspace_Invocation__Group__0
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
    // InternalXpect.g:369:1: entryRuleAnyText : ruleAnyText EOF ;
    public final void entryRuleAnyText() throws RecognitionException {
        try {
            // InternalXpect.g:370:1: ( ruleAnyText EOF )
            // InternalXpect.g:371:1: ruleAnyText EOF
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
    // InternalXpect.g:378:1: ruleAnyText : ( ( ( RULE_ANY_OTHER ) ) ( ( RULE_ANY_OTHER )* ) ) ;
    public final void ruleAnyText() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXpect.g:382:2: ( ( ( ( RULE_ANY_OTHER ) ) ( ( RULE_ANY_OTHER )* ) ) )
            // InternalXpect.g:383:2: ( ( ( RULE_ANY_OTHER ) ) ( ( RULE_ANY_OTHER )* ) )
            {
            // InternalXpect.g:383:2: ( ( ( RULE_ANY_OTHER ) ) ( ( RULE_ANY_OTHER )* ) )
            // InternalXpect.g:384:3: ( ( RULE_ANY_OTHER ) ) ( ( RULE_ANY_OTHER )* )
            {
            // InternalXpect.g:384:3: ( ( RULE_ANY_OTHER ) )
            // InternalXpect.g:385:4: ( RULE_ANY_OTHER )
            {
             before(grammarAccess.getAnyTextAccess().getANY_OTHERTerminalRuleCall()); 
            // InternalXpect.g:386:4: ( RULE_ANY_OTHER )
            // InternalXpect.g:386:5: RULE_ANY_OTHER
            {
            match(input,RULE_ANY_OTHER,FOLLOW_3); 

            }

             after(grammarAccess.getAnyTextAccess().getANY_OTHERTerminalRuleCall()); 

            }

            // InternalXpect.g:389:3: ( ( RULE_ANY_OTHER )* )
            // InternalXpect.g:390:4: ( RULE_ANY_OTHER )*
            {
             before(grammarAccess.getAnyTextAccess().getANY_OTHERTerminalRuleCall()); 
            // InternalXpect.g:391:4: ( RULE_ANY_OTHER )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==RULE_ANY_OTHER) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalXpect.g:391:5: RULE_ANY_OTHER
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
    // InternalXpect.g:401:1: entryRuleQualifiedName : ruleQualifiedName EOF ;
    public final void entryRuleQualifiedName() throws RecognitionException {
        try {
            // InternalXpect.g:402:1: ( ruleQualifiedName EOF )
            // InternalXpect.g:403:1: ruleQualifiedName EOF
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
    // InternalXpect.g:410:1: ruleQualifiedName : ( ( rule__QualifiedName__Group__0 ) ) ;
    public final void ruleQualifiedName() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXpect.g:414:2: ( ( ( rule__QualifiedName__Group__0 ) ) )
            // InternalXpect.g:415:2: ( ( rule__QualifiedName__Group__0 ) )
            {
            // InternalXpect.g:415:2: ( ( rule__QualifiedName__Group__0 ) )
            // InternalXpect.g:416:3: ( rule__QualifiedName__Group__0 )
            {
             before(grammarAccess.getQualifiedNameAccess().getGroup()); 
            // InternalXpect.g:417:3: ( rule__QualifiedName__Group__0 )
            // InternalXpect.g:417:4: rule__QualifiedName__Group__0
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
    // InternalXpect.g:425:1: rule__Member__Alternatives : ( ( ruleLexicalspace_Setup ) | ( ruleLexicalspace_Invocation ) | ( ruleXpectIgnore ) );
    public final void rule__Member__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXpect.g:429:1: ( ( ruleLexicalspace_Setup ) | ( ruleLexicalspace_Invocation ) | ( ruleXpectIgnore ) )
            int alt2=3;
            switch ( input.LA(1) ) {
            case 13:
                {
                alt2=1;
                }
                break;
            case 19:
                {
                alt2=2;
                }
                break;
            case 18:
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
                    // InternalXpect.g:430:2: ( ruleLexicalspace_Setup )
                    {
                    // InternalXpect.g:430:2: ( ruleLexicalspace_Setup )
                    // InternalXpect.g:431:3: ruleLexicalspace_Setup
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
                    // InternalXpect.g:436:2: ( ruleLexicalspace_Invocation )
                    {
                    // InternalXpect.g:436:2: ( ruleLexicalspace_Invocation )
                    // InternalXpect.g:437:3: ruleLexicalspace_Invocation
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
                    // InternalXpect.g:442:2: ( ruleXpectIgnore )
                    {
                    // InternalXpect.g:442:2: ( ruleXpectIgnore )
                    // InternalXpect.g:443:3: ruleXpectIgnore
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
    // InternalXpect.g:452:1: rule__Assignment__Alternatives : ( ( ( rule__Assignment__Group_0__0 ) ) | ( ( rule__Assignment__ValueAssignment_1 ) ) );
    public final void rule__Assignment__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXpect.g:456:1: ( ( ( rule__Assignment__Group_0__0 ) ) | ( ( rule__Assignment__ValueAssignment_1 ) ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==RULE_ID) ) {
                int LA3_1 = input.LA(2);

                if ( ((LA3_1>=RULE_INT && LA3_1<=RULE_STRING)||LA3_1==12||LA3_1==16||(LA3_1>=20 && LA3_1<=21)) ) {
                    alt3=2;
                }
                else if ( (LA3_1==15) ) {
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
                    // InternalXpect.g:457:2: ( ( rule__Assignment__Group_0__0 ) )
                    {
                    // InternalXpect.g:457:2: ( ( rule__Assignment__Group_0__0 ) )
                    // InternalXpect.g:458:3: ( rule__Assignment__Group_0__0 )
                    {
                     before(grammarAccess.getAssignmentAccess().getGroup_0()); 
                    // InternalXpect.g:459:3: ( rule__Assignment__Group_0__0 )
                    // InternalXpect.g:459:4: rule__Assignment__Group_0__0
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
                    // InternalXpect.g:463:2: ( ( rule__Assignment__ValueAssignment_1 ) )
                    {
                    // InternalXpect.g:463:2: ( ( rule__Assignment__ValueAssignment_1 ) )
                    // InternalXpect.g:464:3: ( rule__Assignment__ValueAssignment_1 )
                    {
                     before(grammarAccess.getAssignmentAccess().getValueAssignment_1()); 
                    // InternalXpect.g:465:3: ( rule__Assignment__ValueAssignment_1 )
                    // InternalXpect.g:465:4: rule__Assignment__ValueAssignment_1
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
    // InternalXpect.g:473:1: rule__Value__Alternatives : ( ( ruleLiteral ) | ( ruleClassLiteral ) | ( ruleComponentInline ) );
    public final void rule__Value__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXpect.g:477:1: ( ( ruleLiteral ) | ( ruleClassLiteral ) | ( ruleComponentInline ) )
            int alt4=3;
            alt4 = dfa4.predict(input);
            switch (alt4) {
                case 1 :
                    // InternalXpect.g:478:2: ( ruleLiteral )
                    {
                    // InternalXpect.g:478:2: ( ruleLiteral )
                    // InternalXpect.g:479:3: ruleLiteral
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
                    // InternalXpect.g:484:2: ( ruleClassLiteral )
                    {
                    // InternalXpect.g:484:2: ( ruleClassLiteral )
                    // InternalXpect.g:485:3: ruleClassLiteral
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
                    // InternalXpect.g:490:2: ( ruleComponentInline )
                    {
                    // InternalXpect.g:490:2: ( ruleComponentInline )
                    // InternalXpect.g:491:3: ruleComponentInline
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
    // InternalXpect.g:500:1: rule__Literal__Alternatives : ( ( ( rule__Literal__Group_0__0 ) ) | ( ( rule__Literal__Group_1__0 ) ) | ( ( rule__Literal__Group_2__0 ) ) );
    public final void rule__Literal__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXpect.g:504:1: ( ( ( rule__Literal__Group_0__0 ) ) | ( ( rule__Literal__Group_1__0 ) ) | ( ( rule__Literal__Group_2__0 ) ) )
            int alt5=3;
            switch ( input.LA(1) ) {
            case 12:
            case 21:
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
                    // InternalXpect.g:505:2: ( ( rule__Literal__Group_0__0 ) )
                    {
                    // InternalXpect.g:505:2: ( ( rule__Literal__Group_0__0 ) )
                    // InternalXpect.g:506:3: ( rule__Literal__Group_0__0 )
                    {
                     before(grammarAccess.getLiteralAccess().getGroup_0()); 
                    // InternalXpect.g:507:3: ( rule__Literal__Group_0__0 )
                    // InternalXpect.g:507:4: rule__Literal__Group_0__0
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
                    // InternalXpect.g:511:2: ( ( rule__Literal__Group_1__0 ) )
                    {
                    // InternalXpect.g:511:2: ( ( rule__Literal__Group_1__0 ) )
                    // InternalXpect.g:512:3: ( rule__Literal__Group_1__0 )
                    {
                     before(grammarAccess.getLiteralAccess().getGroup_1()); 
                    // InternalXpect.g:513:3: ( rule__Literal__Group_1__0 )
                    // InternalXpect.g:513:4: rule__Literal__Group_1__0
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
                    // InternalXpect.g:517:2: ( ( rule__Literal__Group_2__0 ) )
                    {
                    // InternalXpect.g:517:2: ( ( rule__Literal__Group_2__0 ) )
                    // InternalXpect.g:518:3: ( rule__Literal__Group_2__0 )
                    {
                     before(grammarAccess.getLiteralAccess().getGroup_2()); 
                    // InternalXpect.g:519:3: ( rule__Literal__Group_2__0 )
                    // InternalXpect.g:519:4: rule__Literal__Group_2__0
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
    // InternalXpect.g:527:1: rule__Literal__Alternatives_0_1 : ( ( ( rule__Literal__ValueAssignment_0_1_0 ) ) | ( 'false' ) );
    public final void rule__Literal__Alternatives_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXpect.g:531:1: ( ( ( rule__Literal__ValueAssignment_0_1_0 ) ) | ( 'false' ) )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==21) ) {
                alt6=1;
            }
            else if ( (LA6_0==12) ) {
                alt6=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // InternalXpect.g:532:2: ( ( rule__Literal__ValueAssignment_0_1_0 ) )
                    {
                    // InternalXpect.g:532:2: ( ( rule__Literal__ValueAssignment_0_1_0 ) )
                    // InternalXpect.g:533:3: ( rule__Literal__ValueAssignment_0_1_0 )
                    {
                     before(grammarAccess.getLiteralAccess().getValueAssignment_0_1_0()); 
                    // InternalXpect.g:534:3: ( rule__Literal__ValueAssignment_0_1_0 )
                    // InternalXpect.g:534:4: rule__Literal__ValueAssignment_0_1_0
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
                    // InternalXpect.g:538:2: ( 'false' )
                    {
                    // InternalXpect.g:538:2: ( 'false' )
                    // InternalXpect.g:539:3: 'false'
                    {
                     before(grammarAccess.getLiteralAccess().getFalseKeyword_0_1_1()); 
                    match(input,12,FOLLOW_2); 
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
    // InternalXpect.g:548:1: rule__XpectFile__Group__0 : rule__XpectFile__Group__0__Impl rule__XpectFile__Group__1 ;
    public final void rule__XpectFile__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXpect.g:552:1: ( rule__XpectFile__Group__0__Impl rule__XpectFile__Group__1 )
            // InternalXpect.g:553:2: rule__XpectFile__Group__0__Impl rule__XpectFile__Group__1
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
    // InternalXpect.g:560:1: rule__XpectFile__Group__0__Impl : ( () ) ;
    public final void rule__XpectFile__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXpect.g:564:1: ( ( () ) )
            // InternalXpect.g:565:1: ( () )
            {
            // InternalXpect.g:565:1: ( () )
            // InternalXpect.g:566:2: ()
            {
             before(grammarAccess.getXpectFileAccess().getXpectFileAction_0()); 
            // InternalXpect.g:567:2: ()
            // InternalXpect.g:567:3: 
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
    // InternalXpect.g:575:1: rule__XpectFile__Group__1 : rule__XpectFile__Group__1__Impl ;
    public final void rule__XpectFile__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXpect.g:579:1: ( rule__XpectFile__Group__1__Impl )
            // InternalXpect.g:580:2: rule__XpectFile__Group__1__Impl
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
    // InternalXpect.g:586:1: rule__XpectFile__Group__1__Impl : ( ( rule__XpectFile__Group_1__0 )? ) ;
    public final void rule__XpectFile__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXpect.g:590:1: ( ( ( rule__XpectFile__Group_1__0 )? ) )
            // InternalXpect.g:591:1: ( ( rule__XpectFile__Group_1__0 )? )
            {
            // InternalXpect.g:591:1: ( ( rule__XpectFile__Group_1__0 )? )
            // InternalXpect.g:592:2: ( rule__XpectFile__Group_1__0 )?
            {
             before(grammarAccess.getXpectFileAccess().getGroup_1()); 
            // InternalXpect.g:593:2: ( rule__XpectFile__Group_1__0 )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==RULE_ANY_OTHER) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalXpect.g:593:3: rule__XpectFile__Group_1__0
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
    // InternalXpect.g:602:1: rule__XpectFile__Group_1__0 : rule__XpectFile__Group_1__0__Impl rule__XpectFile__Group_1__1 ;
    public final void rule__XpectFile__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXpect.g:606:1: ( rule__XpectFile__Group_1__0__Impl rule__XpectFile__Group_1__1 )
            // InternalXpect.g:607:2: rule__XpectFile__Group_1__0__Impl rule__XpectFile__Group_1__1
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
    // InternalXpect.g:614:1: rule__XpectFile__Group_1__0__Impl : ( ( rule__XpectFile__Group_1_0__0 )* ) ;
    public final void rule__XpectFile__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXpect.g:618:1: ( ( ( rule__XpectFile__Group_1_0__0 )* ) )
            // InternalXpect.g:619:1: ( ( rule__XpectFile__Group_1_0__0 )* )
            {
            // InternalXpect.g:619:1: ( ( rule__XpectFile__Group_1_0__0 )* )
            // InternalXpect.g:620:2: ( rule__XpectFile__Group_1_0__0 )*
            {
             before(grammarAccess.getXpectFileAccess().getGroup_1_0()); 
            // InternalXpect.g:621:2: ( rule__XpectFile__Group_1_0__0 )*
            loop8:
            do {
                int alt8=2;
                alt8 = dfa8.predict(input);
                switch (alt8) {
            	case 1 :
            	    // InternalXpect.g:621:3: rule__XpectFile__Group_1_0__0
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
    // InternalXpect.g:629:1: rule__XpectFile__Group_1__1 : rule__XpectFile__Group_1__1__Impl ;
    public final void rule__XpectFile__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXpect.g:633:1: ( rule__XpectFile__Group_1__1__Impl )
            // InternalXpect.g:634:2: rule__XpectFile__Group_1__1__Impl
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
    // InternalXpect.g:640:1: rule__XpectFile__Group_1__1__Impl : ( ( rule__XpectFile__MembersAssignment_1_1 ) ) ;
    public final void rule__XpectFile__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXpect.g:644:1: ( ( ( rule__XpectFile__MembersAssignment_1_1 ) ) )
            // InternalXpect.g:645:1: ( ( rule__XpectFile__MembersAssignment_1_1 ) )
            {
            // InternalXpect.g:645:1: ( ( rule__XpectFile__MembersAssignment_1_1 ) )
            // InternalXpect.g:646:2: ( rule__XpectFile__MembersAssignment_1_1 )
            {
             before(grammarAccess.getXpectFileAccess().getMembersAssignment_1_1()); 
            // InternalXpect.g:647:2: ( rule__XpectFile__MembersAssignment_1_1 )
            // InternalXpect.g:647:3: rule__XpectFile__MembersAssignment_1_1
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
    // InternalXpect.g:656:1: rule__XpectFile__Group_1_0__0 : rule__XpectFile__Group_1_0__0__Impl rule__XpectFile__Group_1_0__1 ;
    public final void rule__XpectFile__Group_1_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXpect.g:660:1: ( rule__XpectFile__Group_1_0__0__Impl rule__XpectFile__Group_1_0__1 )
            // InternalXpect.g:661:2: rule__XpectFile__Group_1_0__0__Impl rule__XpectFile__Group_1_0__1
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
    // InternalXpect.g:668:1: rule__XpectFile__Group_1_0__0__Impl : ( ( rule__XpectFile__MembersAssignment_1_0_0 ) ) ;
    public final void rule__XpectFile__Group_1_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXpect.g:672:1: ( ( ( rule__XpectFile__MembersAssignment_1_0_0 ) ) )
            // InternalXpect.g:673:1: ( ( rule__XpectFile__MembersAssignment_1_0_0 ) )
            {
            // InternalXpect.g:673:1: ( ( rule__XpectFile__MembersAssignment_1_0_0 ) )
            // InternalXpect.g:674:2: ( rule__XpectFile__MembersAssignment_1_0_0 )
            {
             before(grammarAccess.getXpectFileAccess().getMembersAssignment_1_0_0()); 
            // InternalXpect.g:675:2: ( rule__XpectFile__MembersAssignment_1_0_0 )
            // InternalXpect.g:675:3: rule__XpectFile__MembersAssignment_1_0_0
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
    // InternalXpect.g:683:1: rule__XpectFile__Group_1_0__1 : rule__XpectFile__Group_1_0__1__Impl ;
    public final void rule__XpectFile__Group_1_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXpect.g:687:1: ( rule__XpectFile__Group_1_0__1__Impl )
            // InternalXpect.g:688:2: rule__XpectFile__Group_1_0__1__Impl
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
    // InternalXpect.g:694:1: rule__XpectFile__Group_1_0__1__Impl : ( ( rule__XpectFile__MembersAssignment_1_0_1 ) ) ;
    public final void rule__XpectFile__Group_1_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXpect.g:698:1: ( ( ( rule__XpectFile__MembersAssignment_1_0_1 ) ) )
            // InternalXpect.g:699:1: ( ( rule__XpectFile__MembersAssignment_1_0_1 ) )
            {
            // InternalXpect.g:699:1: ( ( rule__XpectFile__MembersAssignment_1_0_1 ) )
            // InternalXpect.g:700:2: ( rule__XpectFile__MembersAssignment_1_0_1 )
            {
             before(grammarAccess.getXpectFileAccess().getMembersAssignment_1_0_1()); 
            // InternalXpect.g:701:2: ( rule__XpectFile__MembersAssignment_1_0_1 )
            // InternalXpect.g:701:3: rule__XpectFile__MembersAssignment_1_0_1
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
    // InternalXpect.g:710:1: rule__Lexicalspace_Setup__Group__0 : rule__Lexicalspace_Setup__Group__0__Impl rule__Lexicalspace_Setup__Group__1 ;
    public final void rule__Lexicalspace_Setup__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXpect.g:714:1: ( rule__Lexicalspace_Setup__Group__0__Impl rule__Lexicalspace_Setup__Group__1 )
            // InternalXpect.g:715:2: rule__Lexicalspace_Setup__Group__0__Impl rule__Lexicalspace_Setup__Group__1
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
    // InternalXpect.g:722:1: rule__Lexicalspace_Setup__Group__0__Impl : ( () ) ;
    public final void rule__Lexicalspace_Setup__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXpect.g:726:1: ( ( () ) )
            // InternalXpect.g:727:1: ( () )
            {
            // InternalXpect.g:727:1: ( () )
            // InternalXpect.g:728:2: ()
            {
             before(grammarAccess.getLexicalspace_SetupAccess().getXpectTestAction_0()); 
            // InternalXpect.g:729:2: ()
            // InternalXpect.g:729:3: 
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
    // InternalXpect.g:737:1: rule__Lexicalspace_Setup__Group__1 : rule__Lexicalspace_Setup__Group__1__Impl rule__Lexicalspace_Setup__Group__2 ;
    public final void rule__Lexicalspace_Setup__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXpect.g:741:1: ( rule__Lexicalspace_Setup__Group__1__Impl rule__Lexicalspace_Setup__Group__2 )
            // InternalXpect.g:742:2: rule__Lexicalspace_Setup__Group__1__Impl rule__Lexicalspace_Setup__Group__2
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
    // InternalXpect.g:749:1: rule__Lexicalspace_Setup__Group__1__Impl : ( 'XPECT_SETUP' ) ;
    public final void rule__Lexicalspace_Setup__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXpect.g:753:1: ( ( 'XPECT_SETUP' ) )
            // InternalXpect.g:754:1: ( 'XPECT_SETUP' )
            {
            // InternalXpect.g:754:1: ( 'XPECT_SETUP' )
            // InternalXpect.g:755:2: 'XPECT_SETUP'
            {
             before(grammarAccess.getLexicalspace_SetupAccess().getXPECT_SETUPKeyword_1()); 
            match(input,13,FOLLOW_2); 
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
    // InternalXpect.g:764:1: rule__Lexicalspace_Setup__Group__2 : rule__Lexicalspace_Setup__Group__2__Impl rule__Lexicalspace_Setup__Group__3 ;
    public final void rule__Lexicalspace_Setup__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXpect.g:768:1: ( rule__Lexicalspace_Setup__Group__2__Impl rule__Lexicalspace_Setup__Group__3 )
            // InternalXpect.g:769:2: rule__Lexicalspace_Setup__Group__2__Impl rule__Lexicalspace_Setup__Group__3
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
    // InternalXpect.g:776:1: rule__Lexicalspace_Setup__Group__2__Impl : ( ( rule__Lexicalspace_Setup__DeclaredSuiteAssignment_2 )? ) ;
    public final void rule__Lexicalspace_Setup__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXpect.g:780:1: ( ( ( rule__Lexicalspace_Setup__DeclaredSuiteAssignment_2 )? ) )
            // InternalXpect.g:781:1: ( ( rule__Lexicalspace_Setup__DeclaredSuiteAssignment_2 )? )
            {
            // InternalXpect.g:781:1: ( ( rule__Lexicalspace_Setup__DeclaredSuiteAssignment_2 )? )
            // InternalXpect.g:782:2: ( rule__Lexicalspace_Setup__DeclaredSuiteAssignment_2 )?
            {
             before(grammarAccess.getLexicalspace_SetupAccess().getDeclaredSuiteAssignment_2()); 
            // InternalXpect.g:783:2: ( rule__Lexicalspace_Setup__DeclaredSuiteAssignment_2 )?
            int alt9=2;
            alt9 = dfa9.predict(input);
            switch (alt9) {
                case 1 :
                    // InternalXpect.g:783:3: rule__Lexicalspace_Setup__DeclaredSuiteAssignment_2
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
    // InternalXpect.g:791:1: rule__Lexicalspace_Setup__Group__3 : rule__Lexicalspace_Setup__Group__3__Impl rule__Lexicalspace_Setup__Group__4 ;
    public final void rule__Lexicalspace_Setup__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXpect.g:795:1: ( rule__Lexicalspace_Setup__Group__3__Impl rule__Lexicalspace_Setup__Group__4 )
            // InternalXpect.g:796:2: rule__Lexicalspace_Setup__Group__3__Impl rule__Lexicalspace_Setup__Group__4
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
    // InternalXpect.g:803:1: rule__Lexicalspace_Setup__Group__3__Impl : ( ( rule__Lexicalspace_Setup__AssignmentsAssignment_3 )* ) ;
    public final void rule__Lexicalspace_Setup__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXpect.g:807:1: ( ( ( rule__Lexicalspace_Setup__AssignmentsAssignment_3 )* ) )
            // InternalXpect.g:808:1: ( ( rule__Lexicalspace_Setup__AssignmentsAssignment_3 )* )
            {
            // InternalXpect.g:808:1: ( ( rule__Lexicalspace_Setup__AssignmentsAssignment_3 )* )
            // InternalXpect.g:809:2: ( rule__Lexicalspace_Setup__AssignmentsAssignment_3 )*
            {
             before(grammarAccess.getLexicalspace_SetupAccess().getAssignmentsAssignment_3()); 
            // InternalXpect.g:810:2: ( rule__Lexicalspace_Setup__AssignmentsAssignment_3 )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==RULE_ID) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // InternalXpect.g:810:3: rule__Lexicalspace_Setup__AssignmentsAssignment_3
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
    // InternalXpect.g:818:1: rule__Lexicalspace_Setup__Group__4 : rule__Lexicalspace_Setup__Group__4__Impl ;
    public final void rule__Lexicalspace_Setup__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXpect.g:822:1: ( rule__Lexicalspace_Setup__Group__4__Impl )
            // InternalXpect.g:823:2: rule__Lexicalspace_Setup__Group__4__Impl
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
    // InternalXpect.g:829:1: rule__Lexicalspace_Setup__Group__4__Impl : ( 'END_SETUP' ) ;
    public final void rule__Lexicalspace_Setup__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXpect.g:833:1: ( ( 'END_SETUP' ) )
            // InternalXpect.g:834:1: ( 'END_SETUP' )
            {
            // InternalXpect.g:834:1: ( 'END_SETUP' )
            // InternalXpect.g:835:2: 'END_SETUP'
            {
             before(grammarAccess.getLexicalspace_SetupAccess().getEND_SETUPKeyword_4()); 
            match(input,14,FOLLOW_2); 
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
    // InternalXpect.g:845:1: rule__Assignment__Group_0__0 : rule__Assignment__Group_0__0__Impl rule__Assignment__Group_0__1 ;
    public final void rule__Assignment__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXpect.g:849:1: ( rule__Assignment__Group_0__0__Impl rule__Assignment__Group_0__1 )
            // InternalXpect.g:850:2: rule__Assignment__Group_0__0__Impl rule__Assignment__Group_0__1
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
    // InternalXpect.g:857:1: rule__Assignment__Group_0__0__Impl : ( ( rule__Assignment__DeclaredTargetAssignment_0_0 ) ) ;
    public final void rule__Assignment__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXpect.g:861:1: ( ( ( rule__Assignment__DeclaredTargetAssignment_0_0 ) ) )
            // InternalXpect.g:862:1: ( ( rule__Assignment__DeclaredTargetAssignment_0_0 ) )
            {
            // InternalXpect.g:862:1: ( ( rule__Assignment__DeclaredTargetAssignment_0_0 ) )
            // InternalXpect.g:863:2: ( rule__Assignment__DeclaredTargetAssignment_0_0 )
            {
             before(grammarAccess.getAssignmentAccess().getDeclaredTargetAssignment_0_0()); 
            // InternalXpect.g:864:2: ( rule__Assignment__DeclaredTargetAssignment_0_0 )
            // InternalXpect.g:864:3: rule__Assignment__DeclaredTargetAssignment_0_0
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
    // InternalXpect.g:872:1: rule__Assignment__Group_0__1 : rule__Assignment__Group_0__1__Impl rule__Assignment__Group_0__2 ;
    public final void rule__Assignment__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXpect.g:876:1: ( rule__Assignment__Group_0__1__Impl rule__Assignment__Group_0__2 )
            // InternalXpect.g:877:2: rule__Assignment__Group_0__1__Impl rule__Assignment__Group_0__2
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
    // InternalXpect.g:884:1: rule__Assignment__Group_0__1__Impl : ( '=' ) ;
    public final void rule__Assignment__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXpect.g:888:1: ( ( '=' ) )
            // InternalXpect.g:889:1: ( '=' )
            {
            // InternalXpect.g:889:1: ( '=' )
            // InternalXpect.g:890:2: '='
            {
             before(grammarAccess.getAssignmentAccess().getEqualsSignKeyword_0_1()); 
            match(input,15,FOLLOW_2); 
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
    // InternalXpect.g:899:1: rule__Assignment__Group_0__2 : rule__Assignment__Group_0__2__Impl ;
    public final void rule__Assignment__Group_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXpect.g:903:1: ( rule__Assignment__Group_0__2__Impl )
            // InternalXpect.g:904:2: rule__Assignment__Group_0__2__Impl
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
    // InternalXpect.g:910:1: rule__Assignment__Group_0__2__Impl : ( ( rule__Assignment__ValueAssignment_0_2 ) ) ;
    public final void rule__Assignment__Group_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXpect.g:914:1: ( ( ( rule__Assignment__ValueAssignment_0_2 ) ) )
            // InternalXpect.g:915:1: ( ( rule__Assignment__ValueAssignment_0_2 ) )
            {
            // InternalXpect.g:915:1: ( ( rule__Assignment__ValueAssignment_0_2 ) )
            // InternalXpect.g:916:2: ( rule__Assignment__ValueAssignment_0_2 )
            {
             before(grammarAccess.getAssignmentAccess().getValueAssignment_0_2()); 
            // InternalXpect.g:917:2: ( rule__Assignment__ValueAssignment_0_2 )
            // InternalXpect.g:917:3: rule__Assignment__ValueAssignment_0_2
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
    // InternalXpect.g:926:1: rule__ComponentLong__Group__0 : rule__ComponentLong__Group__0__Impl rule__ComponentLong__Group__1 ;
    public final void rule__ComponentLong__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXpect.g:930:1: ( rule__ComponentLong__Group__0__Impl rule__ComponentLong__Group__1 )
            // InternalXpect.g:931:2: rule__ComponentLong__Group__0__Impl rule__ComponentLong__Group__1
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
    // InternalXpect.g:938:1: rule__ComponentLong__Group__0__Impl : ( () ) ;
    public final void rule__ComponentLong__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXpect.g:942:1: ( ( () ) )
            // InternalXpect.g:943:1: ( () )
            {
            // InternalXpect.g:943:1: ( () )
            // InternalXpect.g:944:2: ()
            {
             before(grammarAccess.getComponentLongAccess().getComponentAction_0()); 
            // InternalXpect.g:945:2: ()
            // InternalXpect.g:945:3: 
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
    // InternalXpect.g:953:1: rule__ComponentLong__Group__1 : rule__ComponentLong__Group__1__Impl rule__ComponentLong__Group__2 ;
    public final void rule__ComponentLong__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXpect.g:957:1: ( rule__ComponentLong__Group__1__Impl rule__ComponentLong__Group__2 )
            // InternalXpect.g:958:2: rule__ComponentLong__Group__1__Impl rule__ComponentLong__Group__2
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
    // InternalXpect.g:965:1: rule__ComponentLong__Group__1__Impl : ( ( rule__ComponentLong__ComponentClassAssignment_1 ) ) ;
    public final void rule__ComponentLong__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXpect.g:969:1: ( ( ( rule__ComponentLong__ComponentClassAssignment_1 ) ) )
            // InternalXpect.g:970:1: ( ( rule__ComponentLong__ComponentClassAssignment_1 ) )
            {
            // InternalXpect.g:970:1: ( ( rule__ComponentLong__ComponentClassAssignment_1 ) )
            // InternalXpect.g:971:2: ( rule__ComponentLong__ComponentClassAssignment_1 )
            {
             before(grammarAccess.getComponentLongAccess().getComponentClassAssignment_1()); 
            // InternalXpect.g:972:2: ( rule__ComponentLong__ComponentClassAssignment_1 )
            // InternalXpect.g:972:3: rule__ComponentLong__ComponentClassAssignment_1
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
    // InternalXpect.g:980:1: rule__ComponentLong__Group__2 : rule__ComponentLong__Group__2__Impl rule__ComponentLong__Group__3 ;
    public final void rule__ComponentLong__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXpect.g:984:1: ( rule__ComponentLong__Group__2__Impl rule__ComponentLong__Group__3 )
            // InternalXpect.g:985:2: rule__ComponentLong__Group__2__Impl rule__ComponentLong__Group__3
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
    // InternalXpect.g:992:1: rule__ComponentLong__Group__2__Impl : ( ( rule__ComponentLong__ParametersAssignment_2 )* ) ;
    public final void rule__ComponentLong__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXpect.g:996:1: ( ( ( rule__ComponentLong__ParametersAssignment_2 )* ) )
            // InternalXpect.g:997:1: ( ( rule__ComponentLong__ParametersAssignment_2 )* )
            {
            // InternalXpect.g:997:1: ( ( rule__ComponentLong__ParametersAssignment_2 )* )
            // InternalXpect.g:998:2: ( rule__ComponentLong__ParametersAssignment_2 )*
            {
             before(grammarAccess.getComponentLongAccess().getParametersAssignment_2()); 
            // InternalXpect.g:999:2: ( rule__ComponentLong__ParametersAssignment_2 )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( ((LA11_0>=RULE_INT && LA11_0<=RULE_STRING)||LA11_0==12||LA11_0==21) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // InternalXpect.g:999:3: rule__ComponentLong__ParametersAssignment_2
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
    // InternalXpect.g:1007:1: rule__ComponentLong__Group__3 : rule__ComponentLong__Group__3__Impl ;
    public final void rule__ComponentLong__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXpect.g:1011:1: ( rule__ComponentLong__Group__3__Impl )
            // InternalXpect.g:1012:2: rule__ComponentLong__Group__3__Impl
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
    // InternalXpect.g:1018:1: rule__ComponentLong__Group__3__Impl : ( ( rule__ComponentLong__Group_3__0 ) ) ;
    public final void rule__ComponentLong__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXpect.g:1022:1: ( ( ( rule__ComponentLong__Group_3__0 ) ) )
            // InternalXpect.g:1023:1: ( ( rule__ComponentLong__Group_3__0 ) )
            {
            // InternalXpect.g:1023:1: ( ( rule__ComponentLong__Group_3__0 ) )
            // InternalXpect.g:1024:2: ( rule__ComponentLong__Group_3__0 )
            {
             before(grammarAccess.getComponentLongAccess().getGroup_3()); 
            // InternalXpect.g:1025:2: ( rule__ComponentLong__Group_3__0 )
            // InternalXpect.g:1025:3: rule__ComponentLong__Group_3__0
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
    // InternalXpect.g:1034:1: rule__ComponentLong__Group_3__0 : rule__ComponentLong__Group_3__0__Impl rule__ComponentLong__Group_3__1 ;
    public final void rule__ComponentLong__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXpect.g:1038:1: ( rule__ComponentLong__Group_3__0__Impl rule__ComponentLong__Group_3__1 )
            // InternalXpect.g:1039:2: rule__ComponentLong__Group_3__0__Impl rule__ComponentLong__Group_3__1
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
    // InternalXpect.g:1046:1: rule__ComponentLong__Group_3__0__Impl : ( '{' ) ;
    public final void rule__ComponentLong__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXpect.g:1050:1: ( ( '{' ) )
            // InternalXpect.g:1051:1: ( '{' )
            {
            // InternalXpect.g:1051:1: ( '{' )
            // InternalXpect.g:1052:2: '{'
            {
             before(grammarAccess.getComponentLongAccess().getLeftCurlyBracketKeyword_3_0()); 
            match(input,16,FOLLOW_2); 
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
    // InternalXpect.g:1061:1: rule__ComponentLong__Group_3__1 : rule__ComponentLong__Group_3__1__Impl rule__ComponentLong__Group_3__2 ;
    public final void rule__ComponentLong__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXpect.g:1065:1: ( rule__ComponentLong__Group_3__1__Impl rule__ComponentLong__Group_3__2 )
            // InternalXpect.g:1066:2: rule__ComponentLong__Group_3__1__Impl rule__ComponentLong__Group_3__2
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
    // InternalXpect.g:1073:1: rule__ComponentLong__Group_3__1__Impl : ( ( rule__ComponentLong__AssignmentsAssignment_3_1 )* ) ;
    public final void rule__ComponentLong__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXpect.g:1077:1: ( ( ( rule__ComponentLong__AssignmentsAssignment_3_1 )* ) )
            // InternalXpect.g:1078:1: ( ( rule__ComponentLong__AssignmentsAssignment_3_1 )* )
            {
            // InternalXpect.g:1078:1: ( ( rule__ComponentLong__AssignmentsAssignment_3_1 )* )
            // InternalXpect.g:1079:2: ( rule__ComponentLong__AssignmentsAssignment_3_1 )*
            {
             before(grammarAccess.getComponentLongAccess().getAssignmentsAssignment_3_1()); 
            // InternalXpect.g:1080:2: ( rule__ComponentLong__AssignmentsAssignment_3_1 )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==RULE_ID) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // InternalXpect.g:1080:3: rule__ComponentLong__AssignmentsAssignment_3_1
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
    // InternalXpect.g:1088:1: rule__ComponentLong__Group_3__2 : rule__ComponentLong__Group_3__2__Impl ;
    public final void rule__ComponentLong__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXpect.g:1092:1: ( rule__ComponentLong__Group_3__2__Impl )
            // InternalXpect.g:1093:2: rule__ComponentLong__Group_3__2__Impl
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
    // InternalXpect.g:1099:1: rule__ComponentLong__Group_3__2__Impl : ( '}' ) ;
    public final void rule__ComponentLong__Group_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXpect.g:1103:1: ( ( '}' ) )
            // InternalXpect.g:1104:1: ( '}' )
            {
            // InternalXpect.g:1104:1: ( '}' )
            // InternalXpect.g:1105:2: '}'
            {
             before(grammarAccess.getComponentLongAccess().getRightCurlyBracketKeyword_3_2()); 
            match(input,17,FOLLOW_2); 
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
    // InternalXpect.g:1115:1: rule__ComponentInline__Group__0 : rule__ComponentInline__Group__0__Impl rule__ComponentInline__Group__1 ;
    public final void rule__ComponentInline__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXpect.g:1119:1: ( rule__ComponentInline__Group__0__Impl rule__ComponentInline__Group__1 )
            // InternalXpect.g:1120:2: rule__ComponentInline__Group__0__Impl rule__ComponentInline__Group__1
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
    // InternalXpect.g:1127:1: rule__ComponentInline__Group__0__Impl : ( () ) ;
    public final void rule__ComponentInline__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXpect.g:1131:1: ( ( () ) )
            // InternalXpect.g:1132:1: ( () )
            {
            // InternalXpect.g:1132:1: ( () )
            // InternalXpect.g:1133:2: ()
            {
             before(grammarAccess.getComponentInlineAccess().getComponentAction_0()); 
            // InternalXpect.g:1134:2: ()
            // InternalXpect.g:1134:3: 
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
    // InternalXpect.g:1142:1: rule__ComponentInline__Group__1 : rule__ComponentInline__Group__1__Impl rule__ComponentInline__Group__2 ;
    public final void rule__ComponentInline__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXpect.g:1146:1: ( rule__ComponentInline__Group__1__Impl rule__ComponentInline__Group__2 )
            // InternalXpect.g:1147:2: rule__ComponentInline__Group__1__Impl rule__ComponentInline__Group__2
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
    // InternalXpect.g:1154:1: rule__ComponentInline__Group__1__Impl : ( ( rule__ComponentInline__Group_1__0 )? ) ;
    public final void rule__ComponentInline__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXpect.g:1158:1: ( ( ( rule__ComponentInline__Group_1__0 )? ) )
            // InternalXpect.g:1159:1: ( ( rule__ComponentInline__Group_1__0 )? )
            {
            // InternalXpect.g:1159:1: ( ( rule__ComponentInline__Group_1__0 )? )
            // InternalXpect.g:1160:2: ( rule__ComponentInline__Group_1__0 )?
            {
             before(grammarAccess.getComponentInlineAccess().getGroup_1()); 
            // InternalXpect.g:1161:2: ( rule__ComponentInline__Group_1__0 )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==RULE_ID) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // InternalXpect.g:1161:3: rule__ComponentInline__Group_1__0
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
    // InternalXpect.g:1169:1: rule__ComponentInline__Group__2 : rule__ComponentInline__Group__2__Impl ;
    public final void rule__ComponentInline__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXpect.g:1173:1: ( rule__ComponentInline__Group__2__Impl )
            // InternalXpect.g:1174:2: rule__ComponentInline__Group__2__Impl
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
    // InternalXpect.g:1180:1: rule__ComponentInline__Group__2__Impl : ( ( rule__ComponentInline__Group_2__0 ) ) ;
    public final void rule__ComponentInline__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXpect.g:1184:1: ( ( ( rule__ComponentInline__Group_2__0 ) ) )
            // InternalXpect.g:1185:1: ( ( rule__ComponentInline__Group_2__0 ) )
            {
            // InternalXpect.g:1185:1: ( ( rule__ComponentInline__Group_2__0 ) )
            // InternalXpect.g:1186:2: ( rule__ComponentInline__Group_2__0 )
            {
             before(grammarAccess.getComponentInlineAccess().getGroup_2()); 
            // InternalXpect.g:1187:2: ( rule__ComponentInline__Group_2__0 )
            // InternalXpect.g:1187:3: rule__ComponentInline__Group_2__0
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
    // InternalXpect.g:1196:1: rule__ComponentInline__Group_1__0 : rule__ComponentInline__Group_1__0__Impl rule__ComponentInline__Group_1__1 ;
    public final void rule__ComponentInline__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXpect.g:1200:1: ( rule__ComponentInline__Group_1__0__Impl rule__ComponentInline__Group_1__1 )
            // InternalXpect.g:1201:2: rule__ComponentInline__Group_1__0__Impl rule__ComponentInline__Group_1__1
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
    // InternalXpect.g:1208:1: rule__ComponentInline__Group_1__0__Impl : ( ( rule__ComponentInline__ComponentClassAssignment_1_0 ) ) ;
    public final void rule__ComponentInline__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXpect.g:1212:1: ( ( ( rule__ComponentInline__ComponentClassAssignment_1_0 ) ) )
            // InternalXpect.g:1213:1: ( ( rule__ComponentInline__ComponentClassAssignment_1_0 ) )
            {
            // InternalXpect.g:1213:1: ( ( rule__ComponentInline__ComponentClassAssignment_1_0 ) )
            // InternalXpect.g:1214:2: ( rule__ComponentInline__ComponentClassAssignment_1_0 )
            {
             before(grammarAccess.getComponentInlineAccess().getComponentClassAssignment_1_0()); 
            // InternalXpect.g:1215:2: ( rule__ComponentInline__ComponentClassAssignment_1_0 )
            // InternalXpect.g:1215:3: rule__ComponentInline__ComponentClassAssignment_1_0
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
    // InternalXpect.g:1223:1: rule__ComponentInline__Group_1__1 : rule__ComponentInline__Group_1__1__Impl ;
    public final void rule__ComponentInline__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXpect.g:1227:1: ( rule__ComponentInline__Group_1__1__Impl )
            // InternalXpect.g:1228:2: rule__ComponentInline__Group_1__1__Impl
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
    // InternalXpect.g:1234:1: rule__ComponentInline__Group_1__1__Impl : ( ( rule__ComponentInline__ParametersAssignment_1_1 )* ) ;
    public final void rule__ComponentInline__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXpect.g:1238:1: ( ( ( rule__ComponentInline__ParametersAssignment_1_1 )* ) )
            // InternalXpect.g:1239:1: ( ( rule__ComponentInline__ParametersAssignment_1_1 )* )
            {
            // InternalXpect.g:1239:1: ( ( rule__ComponentInline__ParametersAssignment_1_1 )* )
            // InternalXpect.g:1240:2: ( rule__ComponentInline__ParametersAssignment_1_1 )*
            {
             before(grammarAccess.getComponentInlineAccess().getParametersAssignment_1_1()); 
            // InternalXpect.g:1241:2: ( rule__ComponentInline__ParametersAssignment_1_1 )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( ((LA14_0>=RULE_INT && LA14_0<=RULE_STRING)||LA14_0==12||LA14_0==21) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // InternalXpect.g:1241:3: rule__ComponentInline__ParametersAssignment_1_1
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
    // InternalXpect.g:1250:1: rule__ComponentInline__Group_2__0 : rule__ComponentInline__Group_2__0__Impl rule__ComponentInline__Group_2__1 ;
    public final void rule__ComponentInline__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXpect.g:1254:1: ( rule__ComponentInline__Group_2__0__Impl rule__ComponentInline__Group_2__1 )
            // InternalXpect.g:1255:2: rule__ComponentInline__Group_2__0__Impl rule__ComponentInline__Group_2__1
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
    // InternalXpect.g:1262:1: rule__ComponentInline__Group_2__0__Impl : ( '{' ) ;
    public final void rule__ComponentInline__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXpect.g:1266:1: ( ( '{' ) )
            // InternalXpect.g:1267:1: ( '{' )
            {
            // InternalXpect.g:1267:1: ( '{' )
            // InternalXpect.g:1268:2: '{'
            {
             before(grammarAccess.getComponentInlineAccess().getLeftCurlyBracketKeyword_2_0()); 
            match(input,16,FOLLOW_2); 
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
    // InternalXpect.g:1277:1: rule__ComponentInline__Group_2__1 : rule__ComponentInline__Group_2__1__Impl rule__ComponentInline__Group_2__2 ;
    public final void rule__ComponentInline__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXpect.g:1281:1: ( rule__ComponentInline__Group_2__1__Impl rule__ComponentInline__Group_2__2 )
            // InternalXpect.g:1282:2: rule__ComponentInline__Group_2__1__Impl rule__ComponentInline__Group_2__2
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
    // InternalXpect.g:1289:1: rule__ComponentInline__Group_2__1__Impl : ( ( rule__ComponentInline__AssignmentsAssignment_2_1 )* ) ;
    public final void rule__ComponentInline__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXpect.g:1293:1: ( ( ( rule__ComponentInline__AssignmentsAssignment_2_1 )* ) )
            // InternalXpect.g:1294:1: ( ( rule__ComponentInline__AssignmentsAssignment_2_1 )* )
            {
            // InternalXpect.g:1294:1: ( ( rule__ComponentInline__AssignmentsAssignment_2_1 )* )
            // InternalXpect.g:1295:2: ( rule__ComponentInline__AssignmentsAssignment_2_1 )*
            {
             before(grammarAccess.getComponentInlineAccess().getAssignmentsAssignment_2_1()); 
            // InternalXpect.g:1296:2: ( rule__ComponentInline__AssignmentsAssignment_2_1 )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==RULE_ID) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // InternalXpect.g:1296:3: rule__ComponentInline__AssignmentsAssignment_2_1
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
    // InternalXpect.g:1304:1: rule__ComponentInline__Group_2__2 : rule__ComponentInline__Group_2__2__Impl ;
    public final void rule__ComponentInline__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXpect.g:1308:1: ( rule__ComponentInline__Group_2__2__Impl )
            // InternalXpect.g:1309:2: rule__ComponentInline__Group_2__2__Impl
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
    // InternalXpect.g:1315:1: rule__ComponentInline__Group_2__2__Impl : ( '}' ) ;
    public final void rule__ComponentInline__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXpect.g:1319:1: ( ( '}' ) )
            // InternalXpect.g:1320:1: ( '}' )
            {
            // InternalXpect.g:1320:1: ( '}' )
            // InternalXpect.g:1321:2: '}'
            {
             before(grammarAccess.getComponentInlineAccess().getRightCurlyBracketKeyword_2_2()); 
            match(input,17,FOLLOW_2); 
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
    // InternalXpect.g:1331:1: rule__Literal__Group_0__0 : rule__Literal__Group_0__0__Impl rule__Literal__Group_0__1 ;
    public final void rule__Literal__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXpect.g:1335:1: ( rule__Literal__Group_0__0__Impl rule__Literal__Group_0__1 )
            // InternalXpect.g:1336:2: rule__Literal__Group_0__0__Impl rule__Literal__Group_0__1
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
    // InternalXpect.g:1343:1: rule__Literal__Group_0__0__Impl : ( () ) ;
    public final void rule__Literal__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXpect.g:1347:1: ( ( () ) )
            // InternalXpect.g:1348:1: ( () )
            {
            // InternalXpect.g:1348:1: ( () )
            // InternalXpect.g:1349:2: ()
            {
             before(grammarAccess.getLiteralAccess().getBooleanLiteralAction_0_0()); 
            // InternalXpect.g:1350:2: ()
            // InternalXpect.g:1350:3: 
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
    // InternalXpect.g:1358:1: rule__Literal__Group_0__1 : rule__Literal__Group_0__1__Impl ;
    public final void rule__Literal__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXpect.g:1362:1: ( rule__Literal__Group_0__1__Impl )
            // InternalXpect.g:1363:2: rule__Literal__Group_0__1__Impl
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
    // InternalXpect.g:1369:1: rule__Literal__Group_0__1__Impl : ( ( rule__Literal__Alternatives_0_1 ) ) ;
    public final void rule__Literal__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXpect.g:1373:1: ( ( ( rule__Literal__Alternatives_0_1 ) ) )
            // InternalXpect.g:1374:1: ( ( rule__Literal__Alternatives_0_1 ) )
            {
            // InternalXpect.g:1374:1: ( ( rule__Literal__Alternatives_0_1 ) )
            // InternalXpect.g:1375:2: ( rule__Literal__Alternatives_0_1 )
            {
             before(grammarAccess.getLiteralAccess().getAlternatives_0_1()); 
            // InternalXpect.g:1376:2: ( rule__Literal__Alternatives_0_1 )
            // InternalXpect.g:1376:3: rule__Literal__Alternatives_0_1
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
    // InternalXpect.g:1385:1: rule__Literal__Group_1__0 : rule__Literal__Group_1__0__Impl rule__Literal__Group_1__1 ;
    public final void rule__Literal__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXpect.g:1389:1: ( rule__Literal__Group_1__0__Impl rule__Literal__Group_1__1 )
            // InternalXpect.g:1390:2: rule__Literal__Group_1__0__Impl rule__Literal__Group_1__1
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
    // InternalXpect.g:1397:1: rule__Literal__Group_1__0__Impl : ( () ) ;
    public final void rule__Literal__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXpect.g:1401:1: ( ( () ) )
            // InternalXpect.g:1402:1: ( () )
            {
            // InternalXpect.g:1402:1: ( () )
            // InternalXpect.g:1403:2: ()
            {
             before(grammarAccess.getLiteralAccess().getIntLiteralAction_1_0()); 
            // InternalXpect.g:1404:2: ()
            // InternalXpect.g:1404:3: 
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
    // InternalXpect.g:1412:1: rule__Literal__Group_1__1 : rule__Literal__Group_1__1__Impl ;
    public final void rule__Literal__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXpect.g:1416:1: ( rule__Literal__Group_1__1__Impl )
            // InternalXpect.g:1417:2: rule__Literal__Group_1__1__Impl
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
    // InternalXpect.g:1423:1: rule__Literal__Group_1__1__Impl : ( ( rule__Literal__ValueAssignment_1_1 ) ) ;
    public final void rule__Literal__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXpect.g:1427:1: ( ( ( rule__Literal__ValueAssignment_1_1 ) ) )
            // InternalXpect.g:1428:1: ( ( rule__Literal__ValueAssignment_1_1 ) )
            {
            // InternalXpect.g:1428:1: ( ( rule__Literal__ValueAssignment_1_1 ) )
            // InternalXpect.g:1429:2: ( rule__Literal__ValueAssignment_1_1 )
            {
             before(grammarAccess.getLiteralAccess().getValueAssignment_1_1()); 
            // InternalXpect.g:1430:2: ( rule__Literal__ValueAssignment_1_1 )
            // InternalXpect.g:1430:3: rule__Literal__ValueAssignment_1_1
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
    // InternalXpect.g:1439:1: rule__Literal__Group_2__0 : rule__Literal__Group_2__0__Impl rule__Literal__Group_2__1 ;
    public final void rule__Literal__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXpect.g:1443:1: ( rule__Literal__Group_2__0__Impl rule__Literal__Group_2__1 )
            // InternalXpect.g:1444:2: rule__Literal__Group_2__0__Impl rule__Literal__Group_2__1
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
    // InternalXpect.g:1451:1: rule__Literal__Group_2__0__Impl : ( () ) ;
    public final void rule__Literal__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXpect.g:1455:1: ( ( () ) )
            // InternalXpect.g:1456:1: ( () )
            {
            // InternalXpect.g:1456:1: ( () )
            // InternalXpect.g:1457:2: ()
            {
             before(grammarAccess.getLiteralAccess().getStringLiteralAction_2_0()); 
            // InternalXpect.g:1458:2: ()
            // InternalXpect.g:1458:3: 
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
    // InternalXpect.g:1466:1: rule__Literal__Group_2__1 : rule__Literal__Group_2__1__Impl ;
    public final void rule__Literal__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXpect.g:1470:1: ( rule__Literal__Group_2__1__Impl )
            // InternalXpect.g:1471:2: rule__Literal__Group_2__1__Impl
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
    // InternalXpect.g:1477:1: rule__Literal__Group_2__1__Impl : ( ( rule__Literal__ValueAssignment_2_1 ) ) ;
    public final void rule__Literal__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXpect.g:1481:1: ( ( ( rule__Literal__ValueAssignment_2_1 ) ) )
            // InternalXpect.g:1482:1: ( ( rule__Literal__ValueAssignment_2_1 ) )
            {
            // InternalXpect.g:1482:1: ( ( rule__Literal__ValueAssignment_2_1 ) )
            // InternalXpect.g:1483:2: ( rule__Literal__ValueAssignment_2_1 )
            {
             before(grammarAccess.getLiteralAccess().getValueAssignment_2_1()); 
            // InternalXpect.g:1484:2: ( rule__Literal__ValueAssignment_2_1 )
            // InternalXpect.g:1484:3: rule__Literal__ValueAssignment_2_1
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
    // InternalXpect.g:1493:1: rule__ClassLiteral__Group__0 : rule__ClassLiteral__Group__0__Impl rule__ClassLiteral__Group__1 ;
    public final void rule__ClassLiteral__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXpect.g:1497:1: ( rule__ClassLiteral__Group__0__Impl rule__ClassLiteral__Group__1 )
            // InternalXpect.g:1498:2: rule__ClassLiteral__Group__0__Impl rule__ClassLiteral__Group__1
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
    // InternalXpect.g:1505:1: rule__ClassLiteral__Group__0__Impl : ( () ) ;
    public final void rule__ClassLiteral__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXpect.g:1509:1: ( ( () ) )
            // InternalXpect.g:1510:1: ( () )
            {
            // InternalXpect.g:1510:1: ( () )
            // InternalXpect.g:1511:2: ()
            {
             before(grammarAccess.getClassLiteralAccess().getClassLiteralAction_0()); 
            // InternalXpect.g:1512:2: ()
            // InternalXpect.g:1512:3: 
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
    // InternalXpect.g:1520:1: rule__ClassLiteral__Group__1 : rule__ClassLiteral__Group__1__Impl ;
    public final void rule__ClassLiteral__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXpect.g:1524:1: ( rule__ClassLiteral__Group__1__Impl )
            // InternalXpect.g:1525:2: rule__ClassLiteral__Group__1__Impl
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
    // InternalXpect.g:1531:1: rule__ClassLiteral__Group__1__Impl : ( ( rule__ClassLiteral__TypeAssignment_1 ) ) ;
    public final void rule__ClassLiteral__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXpect.g:1535:1: ( ( ( rule__ClassLiteral__TypeAssignment_1 ) ) )
            // InternalXpect.g:1536:1: ( ( rule__ClassLiteral__TypeAssignment_1 ) )
            {
            // InternalXpect.g:1536:1: ( ( rule__ClassLiteral__TypeAssignment_1 ) )
            // InternalXpect.g:1537:2: ( rule__ClassLiteral__TypeAssignment_1 )
            {
             before(grammarAccess.getClassLiteralAccess().getTypeAssignment_1()); 
            // InternalXpect.g:1538:2: ( rule__ClassLiteral__TypeAssignment_1 )
            // InternalXpect.g:1538:3: rule__ClassLiteral__TypeAssignment_1
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
    // InternalXpect.g:1547:1: rule__XpectIgnore__Group__0 : rule__XpectIgnore__Group__0__Impl rule__XpectIgnore__Group__1 ;
    public final void rule__XpectIgnore__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXpect.g:1551:1: ( rule__XpectIgnore__Group__0__Impl rule__XpectIgnore__Group__1 )
            // InternalXpect.g:1552:2: rule__XpectIgnore__Group__0__Impl rule__XpectIgnore__Group__1
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
    // InternalXpect.g:1559:1: rule__XpectIgnore__Group__0__Impl : ( () ) ;
    public final void rule__XpectIgnore__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXpect.g:1563:1: ( ( () ) )
            // InternalXpect.g:1564:1: ( () )
            {
            // InternalXpect.g:1564:1: ( () )
            // InternalXpect.g:1565:2: ()
            {
             before(grammarAccess.getXpectIgnoreAccess().getXpectIgnoreAction_0()); 
            // InternalXpect.g:1566:2: ()
            // InternalXpect.g:1566:3: 
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
    // InternalXpect.g:1574:1: rule__XpectIgnore__Group__1 : rule__XpectIgnore__Group__1__Impl ;
    public final void rule__XpectIgnore__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXpect.g:1578:1: ( rule__XpectIgnore__Group__1__Impl )
            // InternalXpect.g:1579:2: rule__XpectIgnore__Group__1__Impl
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
    // InternalXpect.g:1585:1: rule__XpectIgnore__Group__1__Impl : ( 'XPECT_IGNORE' ) ;
    public final void rule__XpectIgnore__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXpect.g:1589:1: ( ( 'XPECT_IGNORE' ) )
            // InternalXpect.g:1590:1: ( 'XPECT_IGNORE' )
            {
            // InternalXpect.g:1590:1: ( 'XPECT_IGNORE' )
            // InternalXpect.g:1591:2: 'XPECT_IGNORE'
            {
             before(grammarAccess.getXpectIgnoreAccess().getXPECT_IGNOREKeyword_1()); 
            match(input,18,FOLLOW_2); 
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
    // InternalXpect.g:1601:1: rule__Lexicalspace_Invocation__Group__0 : rule__Lexicalspace_Invocation__Group__0__Impl rule__Lexicalspace_Invocation__Group__1 ;
    public final void rule__Lexicalspace_Invocation__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXpect.g:1605:1: ( rule__Lexicalspace_Invocation__Group__0__Impl rule__Lexicalspace_Invocation__Group__1 )
            // InternalXpect.g:1606:2: rule__Lexicalspace_Invocation__Group__0__Impl rule__Lexicalspace_Invocation__Group__1
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
    // InternalXpect.g:1613:1: rule__Lexicalspace_Invocation__Group__0__Impl : ( 'XPECT' ) ;
    public final void rule__Lexicalspace_Invocation__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXpect.g:1617:1: ( ( 'XPECT' ) )
            // InternalXpect.g:1618:1: ( 'XPECT' )
            {
            // InternalXpect.g:1618:1: ( 'XPECT' )
            // InternalXpect.g:1619:2: 'XPECT'
            {
             before(grammarAccess.getLexicalspace_InvocationAccess().getXPECTKeyword_0()); 
            match(input,19,FOLLOW_2); 
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
    // InternalXpect.g:1628:1: rule__Lexicalspace_Invocation__Group__1 : rule__Lexicalspace_Invocation__Group__1__Impl rule__Lexicalspace_Invocation__Group__2 ;
    public final void rule__Lexicalspace_Invocation__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXpect.g:1632:1: ( rule__Lexicalspace_Invocation__Group__1__Impl rule__Lexicalspace_Invocation__Group__2 )
            // InternalXpect.g:1633:2: rule__Lexicalspace_Invocation__Group__1__Impl rule__Lexicalspace_Invocation__Group__2
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
    // InternalXpect.g:1640:1: rule__Lexicalspace_Invocation__Group__1__Impl : ( ( rule__Lexicalspace_Invocation__IgnoreAssignment_1 )? ) ;
    public final void rule__Lexicalspace_Invocation__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXpect.g:1644:1: ( ( ( rule__Lexicalspace_Invocation__IgnoreAssignment_1 )? ) )
            // InternalXpect.g:1645:1: ( ( rule__Lexicalspace_Invocation__IgnoreAssignment_1 )? )
            {
            // InternalXpect.g:1645:1: ( ( rule__Lexicalspace_Invocation__IgnoreAssignment_1 )? )
            // InternalXpect.g:1646:2: ( rule__Lexicalspace_Invocation__IgnoreAssignment_1 )?
            {
             before(grammarAccess.getLexicalspace_InvocationAccess().getIgnoreAssignment_1()); 
            // InternalXpect.g:1647:2: ( rule__Lexicalspace_Invocation__IgnoreAssignment_1 )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==22) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // InternalXpect.g:1647:3: rule__Lexicalspace_Invocation__IgnoreAssignment_1
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
    // InternalXpect.g:1655:1: rule__Lexicalspace_Invocation__Group__2 : rule__Lexicalspace_Invocation__Group__2__Impl rule__Lexicalspace_Invocation__Group__3 ;
    public final void rule__Lexicalspace_Invocation__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXpect.g:1659:1: ( rule__Lexicalspace_Invocation__Group__2__Impl rule__Lexicalspace_Invocation__Group__3 )
            // InternalXpect.g:1660:2: rule__Lexicalspace_Invocation__Group__2__Impl rule__Lexicalspace_Invocation__Group__3
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
    // InternalXpect.g:1667:1: rule__Lexicalspace_Invocation__Group__2__Impl : ( ( rule__Lexicalspace_Invocation__FixmeAssignment_2 )? ) ;
    public final void rule__Lexicalspace_Invocation__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXpect.g:1671:1: ( ( ( rule__Lexicalspace_Invocation__FixmeAssignment_2 )? ) )
            // InternalXpect.g:1672:1: ( ( rule__Lexicalspace_Invocation__FixmeAssignment_2 )? )
            {
            // InternalXpect.g:1672:1: ( ( rule__Lexicalspace_Invocation__FixmeAssignment_2 )? )
            // InternalXpect.g:1673:2: ( rule__Lexicalspace_Invocation__FixmeAssignment_2 )?
            {
             before(grammarAccess.getLexicalspace_InvocationAccess().getFixmeAssignment_2()); 
            // InternalXpect.g:1674:2: ( rule__Lexicalspace_Invocation__FixmeAssignment_2 )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==23) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // InternalXpect.g:1674:3: rule__Lexicalspace_Invocation__FixmeAssignment_2
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
    // InternalXpect.g:1682:1: rule__Lexicalspace_Invocation__Group__3 : rule__Lexicalspace_Invocation__Group__3__Impl ;
    public final void rule__Lexicalspace_Invocation__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXpect.g:1686:1: ( rule__Lexicalspace_Invocation__Group__3__Impl )
            // InternalXpect.g:1687:2: rule__Lexicalspace_Invocation__Group__3__Impl
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
    // InternalXpect.g:1693:1: rule__Lexicalspace_Invocation__Group__3__Impl : ( ( rule__Lexicalspace_Invocation__MethodAssignment_3 ) ) ;
    public final void rule__Lexicalspace_Invocation__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXpect.g:1697:1: ( ( ( rule__Lexicalspace_Invocation__MethodAssignment_3 ) ) )
            // InternalXpect.g:1698:1: ( ( rule__Lexicalspace_Invocation__MethodAssignment_3 ) )
            {
            // InternalXpect.g:1698:1: ( ( rule__Lexicalspace_Invocation__MethodAssignment_3 ) )
            // InternalXpect.g:1699:2: ( rule__Lexicalspace_Invocation__MethodAssignment_3 )
            {
             before(grammarAccess.getLexicalspace_InvocationAccess().getMethodAssignment_3()); 
            // InternalXpect.g:1700:2: ( rule__Lexicalspace_Invocation__MethodAssignment_3 )
            // InternalXpect.g:1700:3: rule__Lexicalspace_Invocation__MethodAssignment_3
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
    // InternalXpect.g:1709:1: rule__QualifiedName__Group__0 : rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1 ;
    public final void rule__QualifiedName__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXpect.g:1713:1: ( rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1 )
            // InternalXpect.g:1714:2: rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1
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
    // InternalXpect.g:1721:1: rule__QualifiedName__Group__0__Impl : ( RULE_ID ) ;
    public final void rule__QualifiedName__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXpect.g:1725:1: ( ( RULE_ID ) )
            // InternalXpect.g:1726:1: ( RULE_ID )
            {
            // InternalXpect.g:1726:1: ( RULE_ID )
            // InternalXpect.g:1727:2: RULE_ID
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
    // InternalXpect.g:1736:1: rule__QualifiedName__Group__1 : rule__QualifiedName__Group__1__Impl ;
    public final void rule__QualifiedName__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXpect.g:1740:1: ( rule__QualifiedName__Group__1__Impl )
            // InternalXpect.g:1741:2: rule__QualifiedName__Group__1__Impl
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
    // InternalXpect.g:1747:1: rule__QualifiedName__Group__1__Impl : ( ( rule__QualifiedName__Group_1__0 )* ) ;
    public final void rule__QualifiedName__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXpect.g:1751:1: ( ( ( rule__QualifiedName__Group_1__0 )* ) )
            // InternalXpect.g:1752:1: ( ( rule__QualifiedName__Group_1__0 )* )
            {
            // InternalXpect.g:1752:1: ( ( rule__QualifiedName__Group_1__0 )* )
            // InternalXpect.g:1753:2: ( rule__QualifiedName__Group_1__0 )*
            {
             before(grammarAccess.getQualifiedNameAccess().getGroup_1()); 
            // InternalXpect.g:1754:2: ( rule__QualifiedName__Group_1__0 )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( (LA18_0==20) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // InternalXpect.g:1754:3: rule__QualifiedName__Group_1__0
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
    // InternalXpect.g:1763:1: rule__QualifiedName__Group_1__0 : rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1 ;
    public final void rule__QualifiedName__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXpect.g:1767:1: ( rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1 )
            // InternalXpect.g:1768:2: rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1
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
    // InternalXpect.g:1775:1: rule__QualifiedName__Group_1__0__Impl : ( '.' ) ;
    public final void rule__QualifiedName__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXpect.g:1779:1: ( ( '.' ) )
            // InternalXpect.g:1780:1: ( '.' )
            {
            // InternalXpect.g:1780:1: ( '.' )
            // InternalXpect.g:1781:2: '.'
            {
             before(grammarAccess.getQualifiedNameAccess().getFullStopKeyword_1_0()); 
            match(input,20,FOLLOW_2); 
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
    // InternalXpect.g:1790:1: rule__QualifiedName__Group_1__1 : rule__QualifiedName__Group_1__1__Impl ;
    public final void rule__QualifiedName__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXpect.g:1794:1: ( rule__QualifiedName__Group_1__1__Impl )
            // InternalXpect.g:1795:2: rule__QualifiedName__Group_1__1__Impl
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
    // InternalXpect.g:1801:1: rule__QualifiedName__Group_1__1__Impl : ( RULE_ID ) ;
    public final void rule__QualifiedName__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXpect.g:1805:1: ( ( RULE_ID ) )
            // InternalXpect.g:1806:1: ( RULE_ID )
            {
            // InternalXpect.g:1806:1: ( RULE_ID )
            // InternalXpect.g:1807:2: RULE_ID
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
    // InternalXpect.g:1817:1: rule__XpectFile__MembersAssignment_1_0_0 : ( ruleText ) ;
    public final void rule__XpectFile__MembersAssignment_1_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXpect.g:1821:1: ( ( ruleText ) )
            // InternalXpect.g:1822:2: ( ruleText )
            {
            // InternalXpect.g:1822:2: ( ruleText )
            // InternalXpect.g:1823:3: ruleText
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
    // InternalXpect.g:1832:1: rule__XpectFile__MembersAssignment_1_0_1 : ( ruleMember ) ;
    public final void rule__XpectFile__MembersAssignment_1_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXpect.g:1836:1: ( ( ruleMember ) )
            // InternalXpect.g:1837:2: ( ruleMember )
            {
            // InternalXpect.g:1837:2: ( ruleMember )
            // InternalXpect.g:1838:3: ruleMember
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
    // InternalXpect.g:1847:1: rule__XpectFile__MembersAssignment_1_1 : ( ruleText ) ;
    public final void rule__XpectFile__MembersAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXpect.g:1851:1: ( ( ruleText ) )
            // InternalXpect.g:1852:2: ( ruleText )
            {
            // InternalXpect.g:1852:2: ( ruleText )
            // InternalXpect.g:1853:3: ruleText
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
    // InternalXpect.g:1862:1: rule__Text__TextAssignment : ( ruleAnyText ) ;
    public final void rule__Text__TextAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXpect.g:1866:1: ( ( ruleAnyText ) )
            // InternalXpect.g:1867:2: ( ruleAnyText )
            {
            // InternalXpect.g:1867:2: ( ruleAnyText )
            // InternalXpect.g:1868:3: ruleAnyText
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
    // InternalXpect.g:1877:1: rule__Lexicalspace_Setup__DeclaredSuiteAssignment_2 : ( ( ruleQualifiedName ) ) ;
    public final void rule__Lexicalspace_Setup__DeclaredSuiteAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXpect.g:1881:1: ( ( ( ruleQualifiedName ) ) )
            // InternalXpect.g:1882:2: ( ( ruleQualifiedName ) )
            {
            // InternalXpect.g:1882:2: ( ( ruleQualifiedName ) )
            // InternalXpect.g:1883:3: ( ruleQualifiedName )
            {
             before(grammarAccess.getLexicalspace_SetupAccess().getDeclaredSuiteJvmDeclaredTypeCrossReference_2_0()); 
            // InternalXpect.g:1884:3: ( ruleQualifiedName )
            // InternalXpect.g:1885:4: ruleQualifiedName
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
    // InternalXpect.g:1896:1: rule__Lexicalspace_Setup__AssignmentsAssignment_3 : ( ruleAssignment ) ;
    public final void rule__Lexicalspace_Setup__AssignmentsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXpect.g:1900:1: ( ( ruleAssignment ) )
            // InternalXpect.g:1901:2: ( ruleAssignment )
            {
            // InternalXpect.g:1901:2: ( ruleAssignment )
            // InternalXpect.g:1902:3: ruleAssignment
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
    // InternalXpect.g:1911:1: rule__Assignment__DeclaredTargetAssignment_0_0 : ( ( RULE_ID ) ) ;
    public final void rule__Assignment__DeclaredTargetAssignment_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXpect.g:1915:1: ( ( ( RULE_ID ) ) )
            // InternalXpect.g:1916:2: ( ( RULE_ID ) )
            {
            // InternalXpect.g:1916:2: ( ( RULE_ID ) )
            // InternalXpect.g:1917:3: ( RULE_ID )
            {
             before(grammarAccess.getAssignmentAccess().getDeclaredTargetJvmOperationCrossReference_0_0_0()); 
            // InternalXpect.g:1918:3: ( RULE_ID )
            // InternalXpect.g:1919:4: RULE_ID
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
    // InternalXpect.g:1930:1: rule__Assignment__ValueAssignment_0_2 : ( ruleValue ) ;
    public final void rule__Assignment__ValueAssignment_0_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXpect.g:1934:1: ( ( ruleValue ) )
            // InternalXpect.g:1935:2: ( ruleValue )
            {
            // InternalXpect.g:1935:2: ( ruleValue )
            // InternalXpect.g:1936:3: ruleValue
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
    // InternalXpect.g:1945:1: rule__Assignment__ValueAssignment_1 : ( ruleComponentLong ) ;
    public final void rule__Assignment__ValueAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXpect.g:1949:1: ( ( ruleComponentLong ) )
            // InternalXpect.g:1950:2: ( ruleComponentLong )
            {
            // InternalXpect.g:1950:2: ( ruleComponentLong )
            // InternalXpect.g:1951:3: ruleComponentLong
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
    // InternalXpect.g:1960:1: rule__ComponentLong__ComponentClassAssignment_1 : ( ( ruleQualifiedName ) ) ;
    public final void rule__ComponentLong__ComponentClassAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXpect.g:1964:1: ( ( ( ruleQualifiedName ) ) )
            // InternalXpect.g:1965:2: ( ( ruleQualifiedName ) )
            {
            // InternalXpect.g:1965:2: ( ( ruleQualifiedName ) )
            // InternalXpect.g:1966:3: ( ruleQualifiedName )
            {
             before(grammarAccess.getComponentLongAccess().getComponentClassJvmDeclaredTypeCrossReference_1_0()); 
            // InternalXpect.g:1967:3: ( ruleQualifiedName )
            // InternalXpect.g:1968:4: ruleQualifiedName
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
    // InternalXpect.g:1979:1: rule__ComponentLong__ParametersAssignment_2 : ( ruleLiteral ) ;
    public final void rule__ComponentLong__ParametersAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXpect.g:1983:1: ( ( ruleLiteral ) )
            // InternalXpect.g:1984:2: ( ruleLiteral )
            {
            // InternalXpect.g:1984:2: ( ruleLiteral )
            // InternalXpect.g:1985:3: ruleLiteral
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
    // InternalXpect.g:1994:1: rule__ComponentLong__AssignmentsAssignment_3_1 : ( ruleAssignment ) ;
    public final void rule__ComponentLong__AssignmentsAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXpect.g:1998:1: ( ( ruleAssignment ) )
            // InternalXpect.g:1999:2: ( ruleAssignment )
            {
            // InternalXpect.g:1999:2: ( ruleAssignment )
            // InternalXpect.g:2000:3: ruleAssignment
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
    // InternalXpect.g:2009:1: rule__ComponentInline__ComponentClassAssignment_1_0 : ( ( ruleQualifiedName ) ) ;
    public final void rule__ComponentInline__ComponentClassAssignment_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXpect.g:2013:1: ( ( ( ruleQualifiedName ) ) )
            // InternalXpect.g:2014:2: ( ( ruleQualifiedName ) )
            {
            // InternalXpect.g:2014:2: ( ( ruleQualifiedName ) )
            // InternalXpect.g:2015:3: ( ruleQualifiedName )
            {
             before(grammarAccess.getComponentInlineAccess().getComponentClassJvmDeclaredTypeCrossReference_1_0_0()); 
            // InternalXpect.g:2016:3: ( ruleQualifiedName )
            // InternalXpect.g:2017:4: ruleQualifiedName
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
    // InternalXpect.g:2028:1: rule__ComponentInline__ParametersAssignment_1_1 : ( ruleLiteral ) ;
    public final void rule__ComponentInline__ParametersAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXpect.g:2032:1: ( ( ruleLiteral ) )
            // InternalXpect.g:2033:2: ( ruleLiteral )
            {
            // InternalXpect.g:2033:2: ( ruleLiteral )
            // InternalXpect.g:2034:3: ruleLiteral
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
    // InternalXpect.g:2043:1: rule__ComponentInline__AssignmentsAssignment_2_1 : ( ruleAssignment ) ;
    public final void rule__ComponentInline__AssignmentsAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXpect.g:2047:1: ( ( ruleAssignment ) )
            // InternalXpect.g:2048:2: ( ruleAssignment )
            {
            // InternalXpect.g:2048:2: ( ruleAssignment )
            // InternalXpect.g:2049:3: ruleAssignment
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
    // InternalXpect.g:2058:1: rule__Literal__ValueAssignment_0_1_0 : ( ( 'true' ) ) ;
    public final void rule__Literal__ValueAssignment_0_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXpect.g:2062:1: ( ( ( 'true' ) ) )
            // InternalXpect.g:2063:2: ( ( 'true' ) )
            {
            // InternalXpect.g:2063:2: ( ( 'true' ) )
            // InternalXpect.g:2064:3: ( 'true' )
            {
             before(grammarAccess.getLiteralAccess().getValueTrueKeyword_0_1_0_0()); 
            // InternalXpect.g:2065:3: ( 'true' )
            // InternalXpect.g:2066:4: 'true'
            {
             before(grammarAccess.getLiteralAccess().getValueTrueKeyword_0_1_0_0()); 
            match(input,21,FOLLOW_2); 
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
    // InternalXpect.g:2077:1: rule__Literal__ValueAssignment_1_1 : ( RULE_INT ) ;
    public final void rule__Literal__ValueAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXpect.g:2081:1: ( ( RULE_INT ) )
            // InternalXpect.g:2082:2: ( RULE_INT )
            {
            // InternalXpect.g:2082:2: ( RULE_INT )
            // InternalXpect.g:2083:3: RULE_INT
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
    // InternalXpect.g:2092:1: rule__Literal__ValueAssignment_2_1 : ( RULE_STRING ) ;
    public final void rule__Literal__ValueAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXpect.g:2096:1: ( ( RULE_STRING ) )
            // InternalXpect.g:2097:2: ( RULE_STRING )
            {
            // InternalXpect.g:2097:2: ( RULE_STRING )
            // InternalXpect.g:2098:3: RULE_STRING
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
    // InternalXpect.g:2107:1: rule__ClassLiteral__TypeAssignment_1 : ( ( ruleQualifiedName ) ) ;
    public final void rule__ClassLiteral__TypeAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXpect.g:2111:1: ( ( ( ruleQualifiedName ) ) )
            // InternalXpect.g:2112:2: ( ( ruleQualifiedName ) )
            {
            // InternalXpect.g:2112:2: ( ( ruleQualifiedName ) )
            // InternalXpect.g:2113:3: ( ruleQualifiedName )
            {
             before(grammarAccess.getClassLiteralAccess().getTypeJvmDeclaredTypeCrossReference_1_0()); 
            // InternalXpect.g:2114:3: ( ruleQualifiedName )
            // InternalXpect.g:2115:4: ruleQualifiedName
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
    // InternalXpect.g:2126:1: rule__Lexicalspace_Invocation__IgnoreAssignment_1 : ( ( '!' ) ) ;
    public final void rule__Lexicalspace_Invocation__IgnoreAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXpect.g:2130:1: ( ( ( '!' ) ) )
            // InternalXpect.g:2131:2: ( ( '!' ) )
            {
            // InternalXpect.g:2131:2: ( ( '!' ) )
            // InternalXpect.g:2132:3: ( '!' )
            {
             before(grammarAccess.getLexicalspace_InvocationAccess().getIgnoreExclamationMarkKeyword_1_0()); 
            // InternalXpect.g:2133:3: ( '!' )
            // InternalXpect.g:2134:4: '!'
            {
             before(grammarAccess.getLexicalspace_InvocationAccess().getIgnoreExclamationMarkKeyword_1_0()); 
            match(input,22,FOLLOW_2); 
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
    // InternalXpect.g:2145:1: rule__Lexicalspace_Invocation__FixmeAssignment_2 : ( ( 'FIXME' ) ) ;
    public final void rule__Lexicalspace_Invocation__FixmeAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXpect.g:2149:1: ( ( ( 'FIXME' ) ) )
            // InternalXpect.g:2150:2: ( ( 'FIXME' ) )
            {
            // InternalXpect.g:2150:2: ( ( 'FIXME' ) )
            // InternalXpect.g:2151:3: ( 'FIXME' )
            {
             before(grammarAccess.getLexicalspace_InvocationAccess().getFixmeFIXMEKeyword_2_0()); 
            // InternalXpect.g:2152:3: ( 'FIXME' )
            // InternalXpect.g:2153:4: 'FIXME'
            {
             before(grammarAccess.getLexicalspace_InvocationAccess().getFixmeFIXMEKeyword_2_0()); 
            match(input,23,FOLLOW_2); 
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
    // InternalXpect.g:2164:1: rule__Lexicalspace_Invocation__MethodAssignment_3 : ( ( RULE_INVOCATION ) ) ;
    public final void rule__Lexicalspace_Invocation__MethodAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXpect.g:2168:1: ( ( ( RULE_INVOCATION ) ) )
            // InternalXpect.g:2169:2: ( ( RULE_INVOCATION ) )
            {
            // InternalXpect.g:2169:2: ( ( RULE_INVOCATION ) )
            // InternalXpect.g:2170:3: ( RULE_INVOCATION )
            {
             before(grammarAccess.getLexicalspace_InvocationAccess().getMethodXjmXpectMethodCrossReference_3_0()); 
            // InternalXpect.g:2171:3: ( RULE_INVOCATION )
            // InternalXpect.g:2172:4: RULE_INVOCATION
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
    static final String dfa_3s = "\1\5\1\uffff\1\5\1\uffff\1\5\1\uffff\1\5";
    static final String dfa_4s = "\1\25\1\uffff\1\25\1\uffff\1\5\1\uffff\1\25";
    static final String dfa_5s = "\1\uffff\1\1\1\uffff\1\3\1\uffff\1\2\1\uffff";
    static final String dfa_6s = "\7\uffff}>";
    static final String[] dfa_7s = {
            "\1\2\2\1\4\uffff\1\1\3\uffff\1\3\4\uffff\1\1",
            "",
            "\1\5\2\3\4\uffff\1\3\1\uffff\1\5\1\uffff\1\3\1\5\2\uffff\1\4\1\3",
            "",
            "\1\6",
            "",
            "\1\5\2\3\4\uffff\1\3\1\uffff\1\5\1\uffff\1\3\1\5\2\uffff\1\4\1\3"
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
            return "473:1: rule__Value__Alternatives : ( ( ruleLiteral ) | ( ruleClassLiteral ) | ( ruleComponentInline ) );";
        }
    }
    static final String dfa_8s = "\5\uffff";
    static final String dfa_9s = "\1\uffff\2\4\2\uffff";
    static final String dfa_10s = "\3\4\2\uffff";
    static final String dfa_11s = "\1\4\2\23\2\uffff";
    static final String dfa_12s = "\3\uffff\1\1\1\2";
    static final String dfa_13s = "\5\uffff}>";
    static final String[] dfa_14s = {
            "\1\1",
            "\1\2\10\uffff\1\3\4\uffff\2\3",
            "\1\2\10\uffff\1\3\4\uffff\2\3",
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
            return "()* loopback of 621:2: ( rule__XpectFile__Group_1_0__0 )*";
        }
    }
    static final String dfa_15s = "\6\uffff";
    static final String dfa_16s = "\2\5\1\uffff\1\5\1\uffff\1\5";
    static final String dfa_17s = "\1\16\1\25\1\uffff\1\5\1\uffff\1\25";
    static final String dfa_18s = "\2\uffff\1\2\1\uffff\1\1\1\uffff";
    static final String dfa_19s = "\6\uffff}>";
    static final String[] dfa_20s = {
            "\1\1\10\uffff\1\2",
            "\1\4\2\2\4\uffff\1\2\1\uffff\1\4\2\2\3\uffff\1\3\1\2",
            "",
            "\1\5",
            "",
            "\1\4\2\2\4\uffff\1\2\1\uffff\1\4\1\uffff\1\2\3\uffff\1\3\1\2"
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
            return "783:2: ( rule__Lexicalspace_Setup__DeclaredSuiteAssignment_2 )?";
        }
    }
 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x00000000000C2000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000004020L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x00000000002110E0L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x00000000002110C0L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x00000000002010C2L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000020020L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x00000000002010C0L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000201000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000000C00100L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000000100002L});

}