package org.eclipse.xpect.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.eclipse.xpect.services.XpectGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalXpectParser extends AbstractInternalAntlrParser {
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

        public InternalXpectParser(TokenStream input, XpectGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "XpectFile";
       	}

       	@Override
       	protected XpectGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleXpectFile"
    // InternalXpectParser.g:57:1: entryRuleXpectFile returns [EObject current=null] : iv_ruleXpectFile= ruleXpectFile EOF ;
    public final EObject entryRuleXpectFile() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXpectFile = null;


        try {
            // InternalXpectParser.g:57:50: (iv_ruleXpectFile= ruleXpectFile EOF )
            // InternalXpectParser.g:58:2: iv_ruleXpectFile= ruleXpectFile EOF
            {
             newCompositeNode(grammarAccess.getXpectFileRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleXpectFile=ruleXpectFile();

            state._fsp--;

             current =iv_ruleXpectFile; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleXpectFile"


    // $ANTLR start "ruleXpectFile"
    // InternalXpectParser.g:64:1: ruleXpectFile returns [EObject current=null] : ( () ( ( ( (lv_members_1_0= ruleText ) ) ( (lv_members_2_0= ruleMember ) ) )* ( (lv_members_3_0= ruleText ) ) )? ) ;
    public final EObject ruleXpectFile() throws RecognitionException {
        EObject current = null;

        EObject lv_members_1_0 = null;

        EObject lv_members_2_0 = null;

        EObject lv_members_3_0 = null;



        	enterRule();

        try {
            // InternalXpectParser.g:70:2: ( ( () ( ( ( (lv_members_1_0= ruleText ) ) ( (lv_members_2_0= ruleMember ) ) )* ( (lv_members_3_0= ruleText ) ) )? ) )
            // InternalXpectParser.g:71:2: ( () ( ( ( (lv_members_1_0= ruleText ) ) ( (lv_members_2_0= ruleMember ) ) )* ( (lv_members_3_0= ruleText ) ) )? )
            {
            // InternalXpectParser.g:71:2: ( () ( ( ( (lv_members_1_0= ruleText ) ) ( (lv_members_2_0= ruleMember ) ) )* ( (lv_members_3_0= ruleText ) ) )? )
            // InternalXpectParser.g:72:3: () ( ( ( (lv_members_1_0= ruleText ) ) ( (lv_members_2_0= ruleMember ) ) )* ( (lv_members_3_0= ruleText ) ) )?
            {
            // InternalXpectParser.g:72:3: ()
            // InternalXpectParser.g:73:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getXpectFileAccess().getXpectFileAction_0(),
            					current);
            			

            }

            // InternalXpectParser.g:79:3: ( ( ( (lv_members_1_0= ruleText ) ) ( (lv_members_2_0= ruleMember ) ) )* ( (lv_members_3_0= ruleText ) ) )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==RULE_ANY_OTHER) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // InternalXpectParser.g:80:4: ( ( (lv_members_1_0= ruleText ) ) ( (lv_members_2_0= ruleMember ) ) )* ( (lv_members_3_0= ruleText ) )
                    {
                    // InternalXpectParser.g:80:4: ( ( (lv_members_1_0= ruleText ) ) ( (lv_members_2_0= ruleMember ) ) )*
                    loop1:
                    do {
                        int alt1=2;
                        alt1 = dfa1.predict(input);
                        switch (alt1) {
                    	case 1 :
                    	    // InternalXpectParser.g:81:5: ( (lv_members_1_0= ruleText ) ) ( (lv_members_2_0= ruleMember ) )
                    	    {
                    	    // InternalXpectParser.g:81:5: ( (lv_members_1_0= ruleText ) )
                    	    // InternalXpectParser.g:82:6: (lv_members_1_0= ruleText )
                    	    {
                    	    // InternalXpectParser.g:82:6: (lv_members_1_0= ruleText )
                    	    // InternalXpectParser.g:83:7: lv_members_1_0= ruleText
                    	    {

                    	    							newCompositeNode(grammarAccess.getXpectFileAccess().getMembersTextParserRuleCall_1_0_0_0());
                    	    						
                    	    pushFollow(FOLLOW_3);
                    	    lv_members_1_0=ruleText();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getXpectFileRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"members",
                    	    								lv_members_1_0,
                    	    								"org.eclipse.xpect.Xpect.Text");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }

                    	    // InternalXpectParser.g:100:5: ( (lv_members_2_0= ruleMember ) )
                    	    // InternalXpectParser.g:101:6: (lv_members_2_0= ruleMember )
                    	    {
                    	    // InternalXpectParser.g:101:6: (lv_members_2_0= ruleMember )
                    	    // InternalXpectParser.g:102:7: lv_members_2_0= ruleMember
                    	    {

                    	    							newCompositeNode(grammarAccess.getXpectFileAccess().getMembersMemberParserRuleCall_1_0_1_0());
                    	    						
                    	    pushFollow(FOLLOW_4);
                    	    lv_members_2_0=ruleMember();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getXpectFileRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"members",
                    	    								lv_members_2_0,
                    	    								"org.eclipse.xpect.Xpect.Member");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop1;
                        }
                    } while (true);

                    // InternalXpectParser.g:120:4: ( (lv_members_3_0= ruleText ) )
                    // InternalXpectParser.g:121:5: (lv_members_3_0= ruleText )
                    {
                    // InternalXpectParser.g:121:5: (lv_members_3_0= ruleText )
                    // InternalXpectParser.g:122:6: lv_members_3_0= ruleText
                    {

                    						newCompositeNode(grammarAccess.getXpectFileAccess().getMembersTextParserRuleCall_1_1_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_members_3_0=ruleText();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getXpectFileRule());
                    						}
                    						add(
                    							current,
                    							"members",
                    							lv_members_3_0,
                    							"org.eclipse.xpect.Xpect.Text");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleXpectFile"


    // $ANTLR start "entryRuleMember"
    // InternalXpectParser.g:144:1: entryRuleMember returns [EObject current=null] : iv_ruleMember= ruleMember EOF ;
    public final EObject entryRuleMember() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMember = null;


        try {
            // InternalXpectParser.g:144:47: (iv_ruleMember= ruleMember EOF )
            // InternalXpectParser.g:145:2: iv_ruleMember= ruleMember EOF
            {
             newCompositeNode(grammarAccess.getMemberRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMember=ruleMember();

            state._fsp--;

             current =iv_ruleMember; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleMember"


    // $ANTLR start "ruleMember"
    // InternalXpectParser.g:151:1: ruleMember returns [EObject current=null] : (this_Lexicalspace_Setup_0= ruleLexicalspace_Setup | this_Lexicalspace_Invocation_1= ruleLexicalspace_Invocation | this_XpectIgnore_2= ruleXpectIgnore ) ;
    public final EObject ruleMember() throws RecognitionException {
        EObject current = null;

        EObject this_Lexicalspace_Setup_0 = null;

        EObject this_Lexicalspace_Invocation_1 = null;

        EObject this_XpectIgnore_2 = null;



        	enterRule();

        try {
            // InternalXpectParser.g:157:2: ( (this_Lexicalspace_Setup_0= ruleLexicalspace_Setup | this_Lexicalspace_Invocation_1= ruleLexicalspace_Invocation | this_XpectIgnore_2= ruleXpectIgnore ) )
            // InternalXpectParser.g:158:2: (this_Lexicalspace_Setup_0= ruleLexicalspace_Setup | this_Lexicalspace_Invocation_1= ruleLexicalspace_Invocation | this_XpectIgnore_2= ruleXpectIgnore )
            {
            // InternalXpectParser.g:158:2: (this_Lexicalspace_Setup_0= ruleLexicalspace_Setup | this_Lexicalspace_Invocation_1= ruleLexicalspace_Invocation | this_XpectIgnore_2= ruleXpectIgnore )
            int alt3=3;
            switch ( input.LA(1) ) {
            case XPECT_SETUP:
                {
                alt3=1;
                }
                break;
            case XPECT:
                {
                alt3=2;
                }
                break;
            case XPECT_IGNORE:
                {
                alt3=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }

            switch (alt3) {
                case 1 :
                    // InternalXpectParser.g:159:3: this_Lexicalspace_Setup_0= ruleLexicalspace_Setup
                    {

                    			newCompositeNode(grammarAccess.getMemberAccess().getLexicalspace_SetupParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_Lexicalspace_Setup_0=ruleLexicalspace_Setup();

                    state._fsp--;


                    			current = this_Lexicalspace_Setup_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalXpectParser.g:168:3: this_Lexicalspace_Invocation_1= ruleLexicalspace_Invocation
                    {

                    			newCompositeNode(grammarAccess.getMemberAccess().getLexicalspace_InvocationParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_Lexicalspace_Invocation_1=ruleLexicalspace_Invocation();

                    state._fsp--;


                    			current = this_Lexicalspace_Invocation_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalXpectParser.g:177:3: this_XpectIgnore_2= ruleXpectIgnore
                    {

                    			newCompositeNode(grammarAccess.getMemberAccess().getXpectIgnoreParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_XpectIgnore_2=ruleXpectIgnore();

                    state._fsp--;


                    			current = this_XpectIgnore_2;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleMember"


    // $ANTLR start "entryRuleText"
    // InternalXpectParser.g:189:1: entryRuleText returns [EObject current=null] : iv_ruleText= ruleText EOF ;
    public final EObject entryRuleText() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleText = null;


        try {
            // InternalXpectParser.g:189:45: (iv_ruleText= ruleText EOF )
            // InternalXpectParser.g:190:2: iv_ruleText= ruleText EOF
            {
             newCompositeNode(grammarAccess.getTextRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleText=ruleText();

            state._fsp--;

             current =iv_ruleText; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleText"


    // $ANTLR start "ruleText"
    // InternalXpectParser.g:196:1: ruleText returns [EObject current=null] : ( (lv_text_0_0= ruleAnyText ) ) ;
    public final EObject ruleText() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_text_0_0 = null;



        	enterRule();

        try {
            // InternalXpectParser.g:202:2: ( ( (lv_text_0_0= ruleAnyText ) ) )
            // InternalXpectParser.g:203:2: ( (lv_text_0_0= ruleAnyText ) )
            {
            // InternalXpectParser.g:203:2: ( (lv_text_0_0= ruleAnyText ) )
            // InternalXpectParser.g:204:3: (lv_text_0_0= ruleAnyText )
            {
            // InternalXpectParser.g:204:3: (lv_text_0_0= ruleAnyText )
            // InternalXpectParser.g:205:4: lv_text_0_0= ruleAnyText
            {

            				newCompositeNode(grammarAccess.getTextAccess().getTextAnyTextParserRuleCall_0());
            			
            pushFollow(FOLLOW_2);
            lv_text_0_0=ruleAnyText();

            state._fsp--;


            				if (current==null) {
            					current = createModelElementForParent(grammarAccess.getTextRule());
            				}
            				set(
            					current,
            					"text",
            					lv_text_0_0,
            					"org.eclipse.xpect.Xpect.AnyText");
            				afterParserOrEnumRuleCall();
            			

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleText"


    // $ANTLR start "entryRuleLexicalspace_Setup"
    // InternalXpectParser.g:225:1: entryRuleLexicalspace_Setup returns [EObject current=null] : iv_ruleLexicalspace_Setup= ruleLexicalspace_Setup EOF ;
    public final EObject entryRuleLexicalspace_Setup() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLexicalspace_Setup = null;



        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT");

        try {
            // InternalXpectParser.g:227:2: (iv_ruleLexicalspace_Setup= ruleLexicalspace_Setup EOF )
            // InternalXpectParser.g:228:2: iv_ruleLexicalspace_Setup= ruleLexicalspace_Setup EOF
            {
             newCompositeNode(grammarAccess.getLexicalspace_SetupRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleLexicalspace_Setup=ruleLexicalspace_Setup();

            state._fsp--;

             current =iv_ruleLexicalspace_Setup; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {

            	myHiddenTokenState.restore();

        }
        return current;
    }
    // $ANTLR end "entryRuleLexicalspace_Setup"


    // $ANTLR start "ruleLexicalspace_Setup"
    // InternalXpectParser.g:237:1: ruleLexicalspace_Setup returns [EObject current=null] : ( () otherlv_1= XPECT_SETUP ( ( ruleQualifiedName ) )? ( (lv_assignments_3_0= ruleAssignment ) )* otherlv_4= END_SETUP ) ;
    public final EObject ruleLexicalspace_Setup() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_4=null;
        EObject lv_assignments_3_0 = null;



        	enterRule();
        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT");

        try {
            // InternalXpectParser.g:244:2: ( ( () otherlv_1= XPECT_SETUP ( ( ruleQualifiedName ) )? ( (lv_assignments_3_0= ruleAssignment ) )* otherlv_4= END_SETUP ) )
            // InternalXpectParser.g:245:2: ( () otherlv_1= XPECT_SETUP ( ( ruleQualifiedName ) )? ( (lv_assignments_3_0= ruleAssignment ) )* otherlv_4= END_SETUP )
            {
            // InternalXpectParser.g:245:2: ( () otherlv_1= XPECT_SETUP ( ( ruleQualifiedName ) )? ( (lv_assignments_3_0= ruleAssignment ) )* otherlv_4= END_SETUP )
            // InternalXpectParser.g:246:3: () otherlv_1= XPECT_SETUP ( ( ruleQualifiedName ) )? ( (lv_assignments_3_0= ruleAssignment ) )* otherlv_4= END_SETUP
            {
            // InternalXpectParser.g:246:3: ()
            // InternalXpectParser.g:247:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getLexicalspace_SetupAccess().getXpectTestAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,XPECT_SETUP,FOLLOW_5); 

            			newLeafNode(otherlv_1, grammarAccess.getLexicalspace_SetupAccess().getXPECT_SETUPKeyword_1());
            		
            // InternalXpectParser.g:257:3: ( ( ruleQualifiedName ) )?
            int alt4=2;
            alt4 = dfa4.predict(input);
            switch (alt4) {
                case 1 :
                    // InternalXpectParser.g:258:4: ( ruleQualifiedName )
                    {
                    // InternalXpectParser.g:258:4: ( ruleQualifiedName )
                    // InternalXpectParser.g:259:5: ruleQualifiedName
                    {

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getLexicalspace_SetupRule());
                    					}
                    				

                    					newCompositeNode(grammarAccess.getLexicalspace_SetupAccess().getDeclaredSuiteJvmDeclaredTypeCrossReference_2_0());
                    				
                    pushFollow(FOLLOW_5);
                    ruleQualifiedName();

                    state._fsp--;


                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            // InternalXpectParser.g:273:3: ( (lv_assignments_3_0= ruleAssignment ) )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==RULE_ID) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // InternalXpectParser.g:274:4: (lv_assignments_3_0= ruleAssignment )
            	    {
            	    // InternalXpectParser.g:274:4: (lv_assignments_3_0= ruleAssignment )
            	    // InternalXpectParser.g:275:5: lv_assignments_3_0= ruleAssignment
            	    {

            	    					newCompositeNode(grammarAccess.getLexicalspace_SetupAccess().getAssignmentsAssignmentParserRuleCall_3_0());
            	    				
            	    pushFollow(FOLLOW_5);
            	    lv_assignments_3_0=ruleAssignment();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getLexicalspace_SetupRule());
            	    					}
            	    					add(
            	    						current,
            	    						"assignments",
            	    						lv_assignments_3_0,
            	    						"org.eclipse.xpect.Xpect.Assignment");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);

            otherlv_4=(Token)match(input,END_SETUP,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getLexicalspace_SetupAccess().getEND_SETUPKeyword_4());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {

            	myHiddenTokenState.restore();

        }
        return current;
    }
    // $ANTLR end "ruleLexicalspace_Setup"


    // $ANTLR start "entryRuleAssignment"
    // InternalXpectParser.g:303:1: entryRuleAssignment returns [EObject current=null] : iv_ruleAssignment= ruleAssignment EOF ;
    public final EObject entryRuleAssignment() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAssignment = null;


        try {
            // InternalXpectParser.g:303:51: (iv_ruleAssignment= ruleAssignment EOF )
            // InternalXpectParser.g:304:2: iv_ruleAssignment= ruleAssignment EOF
            {
             newCompositeNode(grammarAccess.getAssignmentRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAssignment=ruleAssignment();

            state._fsp--;

             current =iv_ruleAssignment; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAssignment"


    // $ANTLR start "ruleAssignment"
    // InternalXpectParser.g:310:1: ruleAssignment returns [EObject current=null] : ( ( ( (otherlv_0= RULE_ID ) ) otherlv_1= EqualsSign ( (lv_value_2_0= ruleValue ) ) ) | ( (lv_value_3_0= ruleComponentLong ) ) ) ;
    public final EObject ruleAssignment() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        EObject lv_value_2_0 = null;

        EObject lv_value_3_0 = null;



        	enterRule();

        try {
            // InternalXpectParser.g:316:2: ( ( ( ( (otherlv_0= RULE_ID ) ) otherlv_1= EqualsSign ( (lv_value_2_0= ruleValue ) ) ) | ( (lv_value_3_0= ruleComponentLong ) ) ) )
            // InternalXpectParser.g:317:2: ( ( ( (otherlv_0= RULE_ID ) ) otherlv_1= EqualsSign ( (lv_value_2_0= ruleValue ) ) ) | ( (lv_value_3_0= ruleComponentLong ) ) )
            {
            // InternalXpectParser.g:317:2: ( ( ( (otherlv_0= RULE_ID ) ) otherlv_1= EqualsSign ( (lv_value_2_0= ruleValue ) ) ) | ( (lv_value_3_0= ruleComponentLong ) ) )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==RULE_ID) ) {
                int LA6_1 = input.LA(2);

                if ( (LA6_1==EqualsSign) ) {
                    alt6=1;
                }
                else if ( ((LA6_1>=False && LA6_1<=True)||LA6_1==FullStop||LA6_1==LeftCurlyBracket||(LA6_1>=RULE_INT && LA6_1<=RULE_STRING)) ) {
                    alt6=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 6, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // InternalXpectParser.g:318:3: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= EqualsSign ( (lv_value_2_0= ruleValue ) ) )
                    {
                    // InternalXpectParser.g:318:3: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= EqualsSign ( (lv_value_2_0= ruleValue ) ) )
                    // InternalXpectParser.g:319:4: ( (otherlv_0= RULE_ID ) ) otherlv_1= EqualsSign ( (lv_value_2_0= ruleValue ) )
                    {
                    // InternalXpectParser.g:319:4: ( (otherlv_0= RULE_ID ) )
                    // InternalXpectParser.g:320:5: (otherlv_0= RULE_ID )
                    {
                    // InternalXpectParser.g:320:5: (otherlv_0= RULE_ID )
                    // InternalXpectParser.g:321:6: otherlv_0= RULE_ID
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getAssignmentRule());
                    						}
                    					
                    otherlv_0=(Token)match(input,RULE_ID,FOLLOW_6); 

                    						newLeafNode(otherlv_0, grammarAccess.getAssignmentAccess().getDeclaredTargetJvmOperationCrossReference_0_0_0());
                    					

                    }


                    }

                    otherlv_1=(Token)match(input,EqualsSign,FOLLOW_7); 

                    				newLeafNode(otherlv_1, grammarAccess.getAssignmentAccess().getEqualsSignKeyword_0_1());
                    			
                    // InternalXpectParser.g:336:4: ( (lv_value_2_0= ruleValue ) )
                    // InternalXpectParser.g:337:5: (lv_value_2_0= ruleValue )
                    {
                    // InternalXpectParser.g:337:5: (lv_value_2_0= ruleValue )
                    // InternalXpectParser.g:338:6: lv_value_2_0= ruleValue
                    {

                    						newCompositeNode(grammarAccess.getAssignmentAccess().getValueValueParserRuleCall_0_2_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_value_2_0=ruleValue();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getAssignmentRule());
                    						}
                    						set(
                    							current,
                    							"value",
                    							lv_value_2_0,
                    							"org.eclipse.xpect.Xpect.Value");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalXpectParser.g:357:3: ( (lv_value_3_0= ruleComponentLong ) )
                    {
                    // InternalXpectParser.g:357:3: ( (lv_value_3_0= ruleComponentLong ) )
                    // InternalXpectParser.g:358:4: (lv_value_3_0= ruleComponentLong )
                    {
                    // InternalXpectParser.g:358:4: (lv_value_3_0= ruleComponentLong )
                    // InternalXpectParser.g:359:5: lv_value_3_0= ruleComponentLong
                    {

                    					newCompositeNode(grammarAccess.getAssignmentAccess().getValueComponentLongParserRuleCall_1_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_value_3_0=ruleComponentLong();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getAssignmentRule());
                    					}
                    					set(
                    						current,
                    						"value",
                    						lv_value_3_0,
                    						"org.eclipse.xpect.Xpect.ComponentLong");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }


                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAssignment"


    // $ANTLR start "entryRuleValue"
    // InternalXpectParser.g:380:1: entryRuleValue returns [EObject current=null] : iv_ruleValue= ruleValue EOF ;
    public final EObject entryRuleValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleValue = null;


        try {
            // InternalXpectParser.g:380:46: (iv_ruleValue= ruleValue EOF )
            // InternalXpectParser.g:381:2: iv_ruleValue= ruleValue EOF
            {
             newCompositeNode(grammarAccess.getValueRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleValue=ruleValue();

            state._fsp--;

             current =iv_ruleValue; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleValue"


    // $ANTLR start "ruleValue"
    // InternalXpectParser.g:387:1: ruleValue returns [EObject current=null] : (this_Literal_0= ruleLiteral | this_ClassLiteral_1= ruleClassLiteral | this_ComponentInline_2= ruleComponentInline ) ;
    public final EObject ruleValue() throws RecognitionException {
        EObject current = null;

        EObject this_Literal_0 = null;

        EObject this_ClassLiteral_1 = null;

        EObject this_ComponentInline_2 = null;



        	enterRule();

        try {
            // InternalXpectParser.g:393:2: ( (this_Literal_0= ruleLiteral | this_ClassLiteral_1= ruleClassLiteral | this_ComponentInline_2= ruleComponentInline ) )
            // InternalXpectParser.g:394:2: (this_Literal_0= ruleLiteral | this_ClassLiteral_1= ruleClassLiteral | this_ComponentInline_2= ruleComponentInline )
            {
            // InternalXpectParser.g:394:2: (this_Literal_0= ruleLiteral | this_ClassLiteral_1= ruleClassLiteral | this_ComponentInline_2= ruleComponentInline )
            int alt7=3;
            alt7 = dfa7.predict(input);
            switch (alt7) {
                case 1 :
                    // InternalXpectParser.g:395:3: this_Literal_0= ruleLiteral
                    {

                    			newCompositeNode(grammarAccess.getValueAccess().getLiteralParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_Literal_0=ruleLiteral();

                    state._fsp--;


                    			current = this_Literal_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalXpectParser.g:404:3: this_ClassLiteral_1= ruleClassLiteral
                    {

                    			newCompositeNode(grammarAccess.getValueAccess().getClassLiteralParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_ClassLiteral_1=ruleClassLiteral();

                    state._fsp--;


                    			current = this_ClassLiteral_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalXpectParser.g:413:3: this_ComponentInline_2= ruleComponentInline
                    {

                    			newCompositeNode(grammarAccess.getValueAccess().getComponentInlineParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_ComponentInline_2=ruleComponentInline();

                    state._fsp--;


                    			current = this_ComponentInline_2;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleValue"


    // $ANTLR start "entryRuleComponentLong"
    // InternalXpectParser.g:425:1: entryRuleComponentLong returns [EObject current=null] : iv_ruleComponentLong= ruleComponentLong EOF ;
    public final EObject entryRuleComponentLong() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleComponentLong = null;


        try {
            // InternalXpectParser.g:425:54: (iv_ruleComponentLong= ruleComponentLong EOF )
            // InternalXpectParser.g:426:2: iv_ruleComponentLong= ruleComponentLong EOF
            {
             newCompositeNode(grammarAccess.getComponentLongRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleComponentLong=ruleComponentLong();

            state._fsp--;

             current =iv_ruleComponentLong; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleComponentLong"


    // $ANTLR start "ruleComponentLong"
    // InternalXpectParser.g:432:1: ruleComponentLong returns [EObject current=null] : ( () ( ( ruleQualifiedName ) ) ( (lv_parameters_2_0= ruleLiteral ) )* (otherlv_3= LeftCurlyBracket ( (lv_assignments_4_0= ruleAssignment ) )* otherlv_5= RightCurlyBracket ) ) ;
    public final EObject ruleComponentLong() throws RecognitionException {
        EObject current = null;

        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_parameters_2_0 = null;

        EObject lv_assignments_4_0 = null;



        	enterRule();

        try {
            // InternalXpectParser.g:438:2: ( ( () ( ( ruleQualifiedName ) ) ( (lv_parameters_2_0= ruleLiteral ) )* (otherlv_3= LeftCurlyBracket ( (lv_assignments_4_0= ruleAssignment ) )* otherlv_5= RightCurlyBracket ) ) )
            // InternalXpectParser.g:439:2: ( () ( ( ruleQualifiedName ) ) ( (lv_parameters_2_0= ruleLiteral ) )* (otherlv_3= LeftCurlyBracket ( (lv_assignments_4_0= ruleAssignment ) )* otherlv_5= RightCurlyBracket ) )
            {
            // InternalXpectParser.g:439:2: ( () ( ( ruleQualifiedName ) ) ( (lv_parameters_2_0= ruleLiteral ) )* (otherlv_3= LeftCurlyBracket ( (lv_assignments_4_0= ruleAssignment ) )* otherlv_5= RightCurlyBracket ) )
            // InternalXpectParser.g:440:3: () ( ( ruleQualifiedName ) ) ( (lv_parameters_2_0= ruleLiteral ) )* (otherlv_3= LeftCurlyBracket ( (lv_assignments_4_0= ruleAssignment ) )* otherlv_5= RightCurlyBracket )
            {
            // InternalXpectParser.g:440:3: ()
            // InternalXpectParser.g:441:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getComponentLongAccess().getComponentAction_0(),
            					current);
            			

            }

            // InternalXpectParser.g:447:3: ( ( ruleQualifiedName ) )
            // InternalXpectParser.g:448:4: ( ruleQualifiedName )
            {
            // InternalXpectParser.g:448:4: ( ruleQualifiedName )
            // InternalXpectParser.g:449:5: ruleQualifiedName
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getComponentLongRule());
            					}
            				

            					newCompositeNode(grammarAccess.getComponentLongAccess().getComponentClassJvmDeclaredTypeCrossReference_1_0());
            				
            pushFollow(FOLLOW_8);
            ruleQualifiedName();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalXpectParser.g:463:3: ( (lv_parameters_2_0= ruleLiteral ) )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( ((LA8_0>=False && LA8_0<=True)||(LA8_0>=RULE_INT && LA8_0<=RULE_STRING)) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalXpectParser.g:464:4: (lv_parameters_2_0= ruleLiteral )
            	    {
            	    // InternalXpectParser.g:464:4: (lv_parameters_2_0= ruleLiteral )
            	    // InternalXpectParser.g:465:5: lv_parameters_2_0= ruleLiteral
            	    {

            	    					newCompositeNode(grammarAccess.getComponentLongAccess().getParametersLiteralParserRuleCall_2_0());
            	    				
            	    pushFollow(FOLLOW_8);
            	    lv_parameters_2_0=ruleLiteral();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getComponentLongRule());
            	    					}
            	    					add(
            	    						current,
            	    						"parameters",
            	    						lv_parameters_2_0,
            	    						"org.eclipse.xpect.Xpect.Literal");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

            // InternalXpectParser.g:482:3: (otherlv_3= LeftCurlyBracket ( (lv_assignments_4_0= ruleAssignment ) )* otherlv_5= RightCurlyBracket )
            // InternalXpectParser.g:483:4: otherlv_3= LeftCurlyBracket ( (lv_assignments_4_0= ruleAssignment ) )* otherlv_5= RightCurlyBracket
            {
            otherlv_3=(Token)match(input,LeftCurlyBracket,FOLLOW_9); 

            				newLeafNode(otherlv_3, grammarAccess.getComponentLongAccess().getLeftCurlyBracketKeyword_3_0());
            			
            // InternalXpectParser.g:487:4: ( (lv_assignments_4_0= ruleAssignment ) )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==RULE_ID) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // InternalXpectParser.g:488:5: (lv_assignments_4_0= ruleAssignment )
            	    {
            	    // InternalXpectParser.g:488:5: (lv_assignments_4_0= ruleAssignment )
            	    // InternalXpectParser.g:489:6: lv_assignments_4_0= ruleAssignment
            	    {

            	    						newCompositeNode(grammarAccess.getComponentLongAccess().getAssignmentsAssignmentParserRuleCall_3_1_0());
            	    					
            	    pushFollow(FOLLOW_9);
            	    lv_assignments_4_0=ruleAssignment();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getComponentLongRule());
            	    						}
            	    						add(
            	    							current,
            	    							"assignments",
            	    							lv_assignments_4_0,
            	    							"org.eclipse.xpect.Xpect.Assignment");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);

            otherlv_5=(Token)match(input,RightCurlyBracket,FOLLOW_2); 

            				newLeafNode(otherlv_5, grammarAccess.getComponentLongAccess().getRightCurlyBracketKeyword_3_2());
            			

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleComponentLong"


    // $ANTLR start "entryRuleComponentInline"
    // InternalXpectParser.g:515:1: entryRuleComponentInline returns [EObject current=null] : iv_ruleComponentInline= ruleComponentInline EOF ;
    public final EObject entryRuleComponentInline() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleComponentInline = null;


        try {
            // InternalXpectParser.g:515:56: (iv_ruleComponentInline= ruleComponentInline EOF )
            // InternalXpectParser.g:516:2: iv_ruleComponentInline= ruleComponentInline EOF
            {
             newCompositeNode(grammarAccess.getComponentInlineRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleComponentInline=ruleComponentInline();

            state._fsp--;

             current =iv_ruleComponentInline; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleComponentInline"


    // $ANTLR start "ruleComponentInline"
    // InternalXpectParser.g:522:1: ruleComponentInline returns [EObject current=null] : ( () ( ( ( ruleQualifiedName ) ) ( (lv_parameters_2_0= ruleLiteral ) )* )? (otherlv_3= LeftCurlyBracket ( (lv_assignments_4_0= ruleAssignment ) )* otherlv_5= RightCurlyBracket ) ) ;
    public final EObject ruleComponentInline() throws RecognitionException {
        EObject current = null;

        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_parameters_2_0 = null;

        EObject lv_assignments_4_0 = null;



        	enterRule();

        try {
            // InternalXpectParser.g:528:2: ( ( () ( ( ( ruleQualifiedName ) ) ( (lv_parameters_2_0= ruleLiteral ) )* )? (otherlv_3= LeftCurlyBracket ( (lv_assignments_4_0= ruleAssignment ) )* otherlv_5= RightCurlyBracket ) ) )
            // InternalXpectParser.g:529:2: ( () ( ( ( ruleQualifiedName ) ) ( (lv_parameters_2_0= ruleLiteral ) )* )? (otherlv_3= LeftCurlyBracket ( (lv_assignments_4_0= ruleAssignment ) )* otherlv_5= RightCurlyBracket ) )
            {
            // InternalXpectParser.g:529:2: ( () ( ( ( ruleQualifiedName ) ) ( (lv_parameters_2_0= ruleLiteral ) )* )? (otherlv_3= LeftCurlyBracket ( (lv_assignments_4_0= ruleAssignment ) )* otherlv_5= RightCurlyBracket ) )
            // InternalXpectParser.g:530:3: () ( ( ( ruleQualifiedName ) ) ( (lv_parameters_2_0= ruleLiteral ) )* )? (otherlv_3= LeftCurlyBracket ( (lv_assignments_4_0= ruleAssignment ) )* otherlv_5= RightCurlyBracket )
            {
            // InternalXpectParser.g:530:3: ()
            // InternalXpectParser.g:531:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getComponentInlineAccess().getComponentAction_0(),
            					current);
            			

            }

            // InternalXpectParser.g:537:3: ( ( ( ruleQualifiedName ) ) ( (lv_parameters_2_0= ruleLiteral ) )* )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==RULE_ID) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // InternalXpectParser.g:538:4: ( ( ruleQualifiedName ) ) ( (lv_parameters_2_0= ruleLiteral ) )*
                    {
                    // InternalXpectParser.g:538:4: ( ( ruleQualifiedName ) )
                    // InternalXpectParser.g:539:5: ( ruleQualifiedName )
                    {
                    // InternalXpectParser.g:539:5: ( ruleQualifiedName )
                    // InternalXpectParser.g:540:6: ruleQualifiedName
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getComponentInlineRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getComponentInlineAccess().getComponentClassJvmDeclaredTypeCrossReference_1_0_0());
                    					
                    pushFollow(FOLLOW_8);
                    ruleQualifiedName();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalXpectParser.g:554:4: ( (lv_parameters_2_0= ruleLiteral ) )*
                    loop10:
                    do {
                        int alt10=2;
                        int LA10_0 = input.LA(1);

                        if ( ((LA10_0>=False && LA10_0<=True)||(LA10_0>=RULE_INT && LA10_0<=RULE_STRING)) ) {
                            alt10=1;
                        }


                        switch (alt10) {
                    	case 1 :
                    	    // InternalXpectParser.g:555:5: (lv_parameters_2_0= ruleLiteral )
                    	    {
                    	    // InternalXpectParser.g:555:5: (lv_parameters_2_0= ruleLiteral )
                    	    // InternalXpectParser.g:556:6: lv_parameters_2_0= ruleLiteral
                    	    {

                    	    						newCompositeNode(grammarAccess.getComponentInlineAccess().getParametersLiteralParserRuleCall_1_1_0());
                    	    					
                    	    pushFollow(FOLLOW_8);
                    	    lv_parameters_2_0=ruleLiteral();

                    	    state._fsp--;


                    	    						if (current==null) {
                    	    							current = createModelElementForParent(grammarAccess.getComponentInlineRule());
                    	    						}
                    	    						add(
                    	    							current,
                    	    							"parameters",
                    	    							lv_parameters_2_0,
                    	    							"org.eclipse.xpect.Xpect.Literal");
                    	    						afterParserOrEnumRuleCall();
                    	    					

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop10;
                        }
                    } while (true);


                    }
                    break;

            }

            // InternalXpectParser.g:574:3: (otherlv_3= LeftCurlyBracket ( (lv_assignments_4_0= ruleAssignment ) )* otherlv_5= RightCurlyBracket )
            // InternalXpectParser.g:575:4: otherlv_3= LeftCurlyBracket ( (lv_assignments_4_0= ruleAssignment ) )* otherlv_5= RightCurlyBracket
            {
            otherlv_3=(Token)match(input,LeftCurlyBracket,FOLLOW_9); 

            				newLeafNode(otherlv_3, grammarAccess.getComponentInlineAccess().getLeftCurlyBracketKeyword_2_0());
            			
            // InternalXpectParser.g:579:4: ( (lv_assignments_4_0= ruleAssignment ) )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==RULE_ID) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // InternalXpectParser.g:580:5: (lv_assignments_4_0= ruleAssignment )
            	    {
            	    // InternalXpectParser.g:580:5: (lv_assignments_4_0= ruleAssignment )
            	    // InternalXpectParser.g:581:6: lv_assignments_4_0= ruleAssignment
            	    {

            	    						newCompositeNode(grammarAccess.getComponentInlineAccess().getAssignmentsAssignmentParserRuleCall_2_1_0());
            	    					
            	    pushFollow(FOLLOW_9);
            	    lv_assignments_4_0=ruleAssignment();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getComponentInlineRule());
            	    						}
            	    						add(
            	    							current,
            	    							"assignments",
            	    							lv_assignments_4_0,
            	    							"org.eclipse.xpect.Xpect.Assignment");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }
            	    break;

            	default :
            	    break loop12;
                }
            } while (true);

            otherlv_5=(Token)match(input,RightCurlyBracket,FOLLOW_2); 

            				newLeafNode(otherlv_5, grammarAccess.getComponentInlineAccess().getRightCurlyBracketKeyword_2_2());
            			

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleComponentInline"


    // $ANTLR start "entryRuleLiteral"
    // InternalXpectParser.g:607:1: entryRuleLiteral returns [EObject current=null] : iv_ruleLiteral= ruleLiteral EOF ;
    public final EObject entryRuleLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLiteral = null;


        try {
            // InternalXpectParser.g:607:48: (iv_ruleLiteral= ruleLiteral EOF )
            // InternalXpectParser.g:608:2: iv_ruleLiteral= ruleLiteral EOF
            {
             newCompositeNode(grammarAccess.getLiteralRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleLiteral=ruleLiteral();

            state._fsp--;

             current =iv_ruleLiteral; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleLiteral"


    // $ANTLR start "ruleLiteral"
    // InternalXpectParser.g:614:1: ruleLiteral returns [EObject current=null] : ( ( () ( ( (lv_value_1_0= True ) ) | otherlv_2= False ) ) | ( () ( (lv_value_4_0= RULE_INT ) ) ) | ( () ( (lv_value_6_0= RULE_STRING ) ) ) ) ;
    public final EObject ruleLiteral() throws RecognitionException {
        EObject current = null;

        Token lv_value_1_0=null;
        Token otherlv_2=null;
        Token lv_value_4_0=null;
        Token lv_value_6_0=null;


        	enterRule();

        try {
            // InternalXpectParser.g:620:2: ( ( ( () ( ( (lv_value_1_0= True ) ) | otherlv_2= False ) ) | ( () ( (lv_value_4_0= RULE_INT ) ) ) | ( () ( (lv_value_6_0= RULE_STRING ) ) ) ) )
            // InternalXpectParser.g:621:2: ( ( () ( ( (lv_value_1_0= True ) ) | otherlv_2= False ) ) | ( () ( (lv_value_4_0= RULE_INT ) ) ) | ( () ( (lv_value_6_0= RULE_STRING ) ) ) )
            {
            // InternalXpectParser.g:621:2: ( ( () ( ( (lv_value_1_0= True ) ) | otherlv_2= False ) ) | ( () ( (lv_value_4_0= RULE_INT ) ) ) | ( () ( (lv_value_6_0= RULE_STRING ) ) ) )
            int alt14=3;
            switch ( input.LA(1) ) {
            case False:
            case True:
                {
                alt14=1;
                }
                break;
            case RULE_INT:
                {
                alt14=2;
                }
                break;
            case RULE_STRING:
                {
                alt14=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 14, 0, input);

                throw nvae;
            }

            switch (alt14) {
                case 1 :
                    // InternalXpectParser.g:622:3: ( () ( ( (lv_value_1_0= True ) ) | otherlv_2= False ) )
                    {
                    // InternalXpectParser.g:622:3: ( () ( ( (lv_value_1_0= True ) ) | otherlv_2= False ) )
                    // InternalXpectParser.g:623:4: () ( ( (lv_value_1_0= True ) ) | otherlv_2= False )
                    {
                    // InternalXpectParser.g:623:4: ()
                    // InternalXpectParser.g:624:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getLiteralAccess().getBooleanLiteralAction_0_0(),
                    						current);
                    				

                    }

                    // InternalXpectParser.g:630:4: ( ( (lv_value_1_0= True ) ) | otherlv_2= False )
                    int alt13=2;
                    int LA13_0 = input.LA(1);

                    if ( (LA13_0==True) ) {
                        alt13=1;
                    }
                    else if ( (LA13_0==False) ) {
                        alt13=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 13, 0, input);

                        throw nvae;
                    }
                    switch (alt13) {
                        case 1 :
                            // InternalXpectParser.g:631:5: ( (lv_value_1_0= True ) )
                            {
                            // InternalXpectParser.g:631:5: ( (lv_value_1_0= True ) )
                            // InternalXpectParser.g:632:6: (lv_value_1_0= True )
                            {
                            // InternalXpectParser.g:632:6: (lv_value_1_0= True )
                            // InternalXpectParser.g:633:7: lv_value_1_0= True
                            {
                            lv_value_1_0=(Token)match(input,True,FOLLOW_2); 

                            							newLeafNode(lv_value_1_0, grammarAccess.getLiteralAccess().getValueTrueKeyword_0_1_0_0());
                            						

                            							if (current==null) {
                            								current = createModelElement(grammarAccess.getLiteralRule());
                            							}
                            							setWithLastConsumed(current, "value", lv_value_1_0 != null, "true");
                            						

                            }


                            }


                            }
                            break;
                        case 2 :
                            // InternalXpectParser.g:646:5: otherlv_2= False
                            {
                            otherlv_2=(Token)match(input,False,FOLLOW_2); 

                            					newLeafNode(otherlv_2, grammarAccess.getLiteralAccess().getFalseKeyword_0_1_1());
                            				

                            }
                            break;

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalXpectParser.g:653:3: ( () ( (lv_value_4_0= RULE_INT ) ) )
                    {
                    // InternalXpectParser.g:653:3: ( () ( (lv_value_4_0= RULE_INT ) ) )
                    // InternalXpectParser.g:654:4: () ( (lv_value_4_0= RULE_INT ) )
                    {
                    // InternalXpectParser.g:654:4: ()
                    // InternalXpectParser.g:655:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getLiteralAccess().getIntLiteralAction_1_0(),
                    						current);
                    				

                    }

                    // InternalXpectParser.g:661:4: ( (lv_value_4_0= RULE_INT ) )
                    // InternalXpectParser.g:662:5: (lv_value_4_0= RULE_INT )
                    {
                    // InternalXpectParser.g:662:5: (lv_value_4_0= RULE_INT )
                    // InternalXpectParser.g:663:6: lv_value_4_0= RULE_INT
                    {
                    lv_value_4_0=(Token)match(input,RULE_INT,FOLLOW_2); 

                    						newLeafNode(lv_value_4_0, grammarAccess.getLiteralAccess().getValueINTTerminalRuleCall_1_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getLiteralRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"value",
                    							lv_value_4_0,
                    							"org.eclipse.xpect.Xpect.INT");
                    					

                    }


                    }


                    }


                    }
                    break;
                case 3 :
                    // InternalXpectParser.g:681:3: ( () ( (lv_value_6_0= RULE_STRING ) ) )
                    {
                    // InternalXpectParser.g:681:3: ( () ( (lv_value_6_0= RULE_STRING ) ) )
                    // InternalXpectParser.g:682:4: () ( (lv_value_6_0= RULE_STRING ) )
                    {
                    // InternalXpectParser.g:682:4: ()
                    // InternalXpectParser.g:683:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getLiteralAccess().getStringLiteralAction_2_0(),
                    						current);
                    				

                    }

                    // InternalXpectParser.g:689:4: ( (lv_value_6_0= RULE_STRING ) )
                    // InternalXpectParser.g:690:5: (lv_value_6_0= RULE_STRING )
                    {
                    // InternalXpectParser.g:690:5: (lv_value_6_0= RULE_STRING )
                    // InternalXpectParser.g:691:6: lv_value_6_0= RULE_STRING
                    {
                    lv_value_6_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

                    						newLeafNode(lv_value_6_0, grammarAccess.getLiteralAccess().getValueSTRINGTerminalRuleCall_2_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getLiteralRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"value",
                    							lv_value_6_0,
                    							"org.eclipse.xpect.Xpect.STRING");
                    					

                    }


                    }


                    }


                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleLiteral"


    // $ANTLR start "entryRuleClassLiteral"
    // InternalXpectParser.g:712:1: entryRuleClassLiteral returns [EObject current=null] : iv_ruleClassLiteral= ruleClassLiteral EOF ;
    public final EObject entryRuleClassLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleClassLiteral = null;


        try {
            // InternalXpectParser.g:712:53: (iv_ruleClassLiteral= ruleClassLiteral EOF )
            // InternalXpectParser.g:713:2: iv_ruleClassLiteral= ruleClassLiteral EOF
            {
             newCompositeNode(grammarAccess.getClassLiteralRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleClassLiteral=ruleClassLiteral();

            state._fsp--;

             current =iv_ruleClassLiteral; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleClassLiteral"


    // $ANTLR start "ruleClassLiteral"
    // InternalXpectParser.g:719:1: ruleClassLiteral returns [EObject current=null] : ( () ( ( ruleQualifiedName ) ) ) ;
    public final EObject ruleClassLiteral() throws RecognitionException {
        EObject current = null;


        	enterRule();

        try {
            // InternalXpectParser.g:725:2: ( ( () ( ( ruleQualifiedName ) ) ) )
            // InternalXpectParser.g:726:2: ( () ( ( ruleQualifiedName ) ) )
            {
            // InternalXpectParser.g:726:2: ( () ( ( ruleQualifiedName ) ) )
            // InternalXpectParser.g:727:3: () ( ( ruleQualifiedName ) )
            {
            // InternalXpectParser.g:727:3: ()
            // InternalXpectParser.g:728:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getClassLiteralAccess().getClassLiteralAction_0(),
            					current);
            			

            }

            // InternalXpectParser.g:734:3: ( ( ruleQualifiedName ) )
            // InternalXpectParser.g:735:4: ( ruleQualifiedName )
            {
            // InternalXpectParser.g:735:4: ( ruleQualifiedName )
            // InternalXpectParser.g:736:5: ruleQualifiedName
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getClassLiteralRule());
            					}
            				

            					newCompositeNode(grammarAccess.getClassLiteralAccess().getTypeJvmDeclaredTypeCrossReference_1_0());
            				
            pushFollow(FOLLOW_2);
            ruleQualifiedName();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleClassLiteral"


    // $ANTLR start "entryRuleXpectIgnore"
    // InternalXpectParser.g:754:1: entryRuleXpectIgnore returns [EObject current=null] : iv_ruleXpectIgnore= ruleXpectIgnore EOF ;
    public final EObject entryRuleXpectIgnore() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXpectIgnore = null;


        try {
            // InternalXpectParser.g:754:52: (iv_ruleXpectIgnore= ruleXpectIgnore EOF )
            // InternalXpectParser.g:755:2: iv_ruleXpectIgnore= ruleXpectIgnore EOF
            {
             newCompositeNode(grammarAccess.getXpectIgnoreRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleXpectIgnore=ruleXpectIgnore();

            state._fsp--;

             current =iv_ruleXpectIgnore; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleXpectIgnore"


    // $ANTLR start "ruleXpectIgnore"
    // InternalXpectParser.g:761:1: ruleXpectIgnore returns [EObject current=null] : ( () otherlv_1= XPECT_IGNORE ) ;
    public final EObject ruleXpectIgnore() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalXpectParser.g:767:2: ( ( () otherlv_1= XPECT_IGNORE ) )
            // InternalXpectParser.g:768:2: ( () otherlv_1= XPECT_IGNORE )
            {
            // InternalXpectParser.g:768:2: ( () otherlv_1= XPECT_IGNORE )
            // InternalXpectParser.g:769:3: () otherlv_1= XPECT_IGNORE
            {
            // InternalXpectParser.g:769:3: ()
            // InternalXpectParser.g:770:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getXpectIgnoreAccess().getXpectIgnoreAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,XPECT_IGNORE,FOLLOW_2); 

            			newLeafNode(otherlv_1, grammarAccess.getXpectIgnoreAccess().getXPECT_IGNOREKeyword_1());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleXpectIgnore"


    // $ANTLR start "entryRuleLexicalspace_Invocation"
    // InternalXpectParser.g:784:1: entryRuleLexicalspace_Invocation returns [EObject current=null] : iv_ruleLexicalspace_Invocation= ruleLexicalspace_Invocation EOF ;
    public final EObject entryRuleLexicalspace_Invocation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLexicalspace_Invocation = null;



        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT");

        try {
            // InternalXpectParser.g:786:2: (iv_ruleLexicalspace_Invocation= ruleLexicalspace_Invocation EOF )
            // InternalXpectParser.g:787:2: iv_ruleLexicalspace_Invocation= ruleLexicalspace_Invocation EOF
            {
             newCompositeNode(grammarAccess.getLexicalspace_InvocationRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleLexicalspace_Invocation=ruleLexicalspace_Invocation();

            state._fsp--;

             current =iv_ruleLexicalspace_Invocation; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {

            	myHiddenTokenState.restore();

        }
        return current;
    }
    // $ANTLR end "entryRuleLexicalspace_Invocation"


    // $ANTLR start "ruleLexicalspace_Invocation"
    // InternalXpectParser.g:796:1: ruleLexicalspace_Invocation returns [EObject current=null] : (otherlv_0= XPECT ( (lv_ignore_1_0= ExclamationMark ) )? ( (lv_fixme_2_0= FIXME ) )? ( (otherlv_3= RULE_INVOCATION ) ) ) ;
    public final EObject ruleLexicalspace_Invocation() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_ignore_1_0=null;
        Token lv_fixme_2_0=null;
        Token otherlv_3=null;


        	enterRule();
        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens("RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT");

        try {
            // InternalXpectParser.g:803:2: ( (otherlv_0= XPECT ( (lv_ignore_1_0= ExclamationMark ) )? ( (lv_fixme_2_0= FIXME ) )? ( (otherlv_3= RULE_INVOCATION ) ) ) )
            // InternalXpectParser.g:804:2: (otherlv_0= XPECT ( (lv_ignore_1_0= ExclamationMark ) )? ( (lv_fixme_2_0= FIXME ) )? ( (otherlv_3= RULE_INVOCATION ) ) )
            {
            // InternalXpectParser.g:804:2: (otherlv_0= XPECT ( (lv_ignore_1_0= ExclamationMark ) )? ( (lv_fixme_2_0= FIXME ) )? ( (otherlv_3= RULE_INVOCATION ) ) )
            // InternalXpectParser.g:805:3: otherlv_0= XPECT ( (lv_ignore_1_0= ExclamationMark ) )? ( (lv_fixme_2_0= FIXME ) )? ( (otherlv_3= RULE_INVOCATION ) )
            {
            otherlv_0=(Token)match(input,XPECT,FOLLOW_10); 

            			newLeafNode(otherlv_0, grammarAccess.getLexicalspace_InvocationAccess().getXPECTKeyword_0());
            		
            // InternalXpectParser.g:809:3: ( (lv_ignore_1_0= ExclamationMark ) )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==ExclamationMark) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // InternalXpectParser.g:810:4: (lv_ignore_1_0= ExclamationMark )
                    {
                    // InternalXpectParser.g:810:4: (lv_ignore_1_0= ExclamationMark )
                    // InternalXpectParser.g:811:5: lv_ignore_1_0= ExclamationMark
                    {
                    lv_ignore_1_0=(Token)match(input,ExclamationMark,FOLLOW_11); 

                    					newLeafNode(lv_ignore_1_0, grammarAccess.getLexicalspace_InvocationAccess().getIgnoreExclamationMarkKeyword_1_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getLexicalspace_InvocationRule());
                    					}
                    					setWithLastConsumed(current, "ignore", lv_ignore_1_0 != null, "!");
                    				

                    }


                    }
                    break;

            }

            // InternalXpectParser.g:823:3: ( (lv_fixme_2_0= FIXME ) )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==FIXME) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // InternalXpectParser.g:824:4: (lv_fixme_2_0= FIXME )
                    {
                    // InternalXpectParser.g:824:4: (lv_fixme_2_0= FIXME )
                    // InternalXpectParser.g:825:5: lv_fixme_2_0= FIXME
                    {
                    lv_fixme_2_0=(Token)match(input,FIXME,FOLLOW_12); 

                    					newLeafNode(lv_fixme_2_0, grammarAccess.getLexicalspace_InvocationAccess().getFixmeFIXMEKeyword_2_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getLexicalspace_InvocationRule());
                    					}
                    					setWithLastConsumed(current, "fixme", lv_fixme_2_0 != null, "FIXME");
                    				

                    }


                    }
                    break;

            }

            // InternalXpectParser.g:837:3: ( (otherlv_3= RULE_INVOCATION ) )
            // InternalXpectParser.g:838:4: (otherlv_3= RULE_INVOCATION )
            {
            // InternalXpectParser.g:838:4: (otherlv_3= RULE_INVOCATION )
            // InternalXpectParser.g:839:5: otherlv_3= RULE_INVOCATION
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getLexicalspace_InvocationRule());
            					}
            				
            otherlv_3=(Token)match(input,RULE_INVOCATION,FOLLOW_2); 

            					newLeafNode(otherlv_3, grammarAccess.getLexicalspace_InvocationAccess().getMethodXjmXpectMethodCrossReference_3_0());
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {

            	myHiddenTokenState.restore();

        }
        return current;
    }
    // $ANTLR end "ruleLexicalspace_Invocation"


    // $ANTLR start "entryRuleAnyText"
    // InternalXpectParser.g:857:1: entryRuleAnyText returns [String current=null] : iv_ruleAnyText= ruleAnyText EOF ;
    public final String entryRuleAnyText() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleAnyText = null;


        try {
            // InternalXpectParser.g:857:47: (iv_ruleAnyText= ruleAnyText EOF )
            // InternalXpectParser.g:858:2: iv_ruleAnyText= ruleAnyText EOF
            {
             newCompositeNode(grammarAccess.getAnyTextRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAnyText=ruleAnyText();

            state._fsp--;

             current =iv_ruleAnyText.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAnyText"


    // $ANTLR start "ruleAnyText"
    // InternalXpectParser.g:864:1: ruleAnyText returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ANY_OTHER_0= RULE_ANY_OTHER )+ ;
    public final AntlrDatatypeRuleToken ruleAnyText() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ANY_OTHER_0=null;


        	enterRule();

        try {
            // InternalXpectParser.g:870:2: ( (this_ANY_OTHER_0= RULE_ANY_OTHER )+ )
            // InternalXpectParser.g:871:2: (this_ANY_OTHER_0= RULE_ANY_OTHER )+
            {
            // InternalXpectParser.g:871:2: (this_ANY_OTHER_0= RULE_ANY_OTHER )+
            int cnt17=0;
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0==RULE_ANY_OTHER) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // InternalXpectParser.g:872:3: this_ANY_OTHER_0= RULE_ANY_OTHER
            	    {
            	    this_ANY_OTHER_0=(Token)match(input,RULE_ANY_OTHER,FOLLOW_13); 

            	    			current.merge(this_ANY_OTHER_0);
            	    		

            	    			newLeafNode(this_ANY_OTHER_0, grammarAccess.getAnyTextAccess().getANY_OTHERTerminalRuleCall());
            	    		

            	    }
            	    break;

            	default :
            	    if ( cnt17 >= 1 ) break loop17;
                        EarlyExitException eee =
                            new EarlyExitException(17, input);
                        throw eee;
                }
                cnt17++;
            } while (true);


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAnyText"


    // $ANTLR start "entryRuleQualifiedName"
    // InternalXpectParser.g:883:1: entryRuleQualifiedName returns [String current=null] : iv_ruleQualifiedName= ruleQualifiedName EOF ;
    public final String entryRuleQualifiedName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleQualifiedName = null;


        try {
            // InternalXpectParser.g:883:53: (iv_ruleQualifiedName= ruleQualifiedName EOF )
            // InternalXpectParser.g:884:2: iv_ruleQualifiedName= ruleQualifiedName EOF
            {
             newCompositeNode(grammarAccess.getQualifiedNameRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleQualifiedName=ruleQualifiedName();

            state._fsp--;

             current =iv_ruleQualifiedName.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleQualifiedName"


    // $ANTLR start "ruleQualifiedName"
    // InternalXpectParser.g:890:1: ruleQualifiedName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID (kw= FullStop this_ID_2= RULE_ID )* ) ;
    public final AntlrDatatypeRuleToken ruleQualifiedName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token kw=null;
        Token this_ID_2=null;


        	enterRule();

        try {
            // InternalXpectParser.g:896:2: ( (this_ID_0= RULE_ID (kw= FullStop this_ID_2= RULE_ID )* ) )
            // InternalXpectParser.g:897:2: (this_ID_0= RULE_ID (kw= FullStop this_ID_2= RULE_ID )* )
            {
            // InternalXpectParser.g:897:2: (this_ID_0= RULE_ID (kw= FullStop this_ID_2= RULE_ID )* )
            // InternalXpectParser.g:898:3: this_ID_0= RULE_ID (kw= FullStop this_ID_2= RULE_ID )*
            {
            this_ID_0=(Token)match(input,RULE_ID,FOLLOW_14); 

            			current.merge(this_ID_0);
            		

            			newLeafNode(this_ID_0, grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_0());
            		
            // InternalXpectParser.g:905:3: (kw= FullStop this_ID_2= RULE_ID )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( (LA18_0==FullStop) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // InternalXpectParser.g:906:4: kw= FullStop this_ID_2= RULE_ID
            	    {
            	    kw=(Token)match(input,FullStop,FOLLOW_15); 

            	    				current.merge(kw);
            	    				newLeafNode(kw, grammarAccess.getQualifiedNameAccess().getFullStopKeyword_1_0());
            	    			
            	    this_ID_2=(Token)match(input,RULE_ID,FOLLOW_14); 

            	    				current.merge(this_ID_2);
            	    			

            	    				newLeafNode(this_ID_2, grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_1_1());
            	    			

            	    }
            	    break;

            	default :
            	    break loop18;
                }
            } while (true);


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleQualifiedName"

    // Delegated rules


    protected DFA1 dfa1 = new DFA1(this);
    protected DFA4 dfa4 = new DFA4(this);
    protected DFA7 dfa7 = new DFA7(this);
    static final String dfa_1s = "\4\uffff";
    static final String dfa_2s = "\1\uffff\1\3\2\uffff";
    static final String dfa_3s = "\1\27\1\4\2\uffff";
    static final String dfa_4s = "\2\27\2\uffff";
    static final String dfa_5s = "\2\uffff\1\1\1\2";
    static final String dfa_6s = "\4\uffff}>";
    static final String[] dfa_7s = {
            "\1\1",
            "\2\2\2\uffff\1\2\16\uffff\1\1",
            "",
            ""
    };

    static final short[] dfa_1 = DFA.unpackEncodedString(dfa_1s);
    static final short[] dfa_2 = DFA.unpackEncodedString(dfa_2s);
    static final char[] dfa_3 = DFA.unpackEncodedStringToUnsignedChars(dfa_3s);
    static final char[] dfa_4 = DFA.unpackEncodedStringToUnsignedChars(dfa_4s);
    static final short[] dfa_5 = DFA.unpackEncodedString(dfa_5s);
    static final short[] dfa_6 = DFA.unpackEncodedString(dfa_6s);
    static final short[][] dfa_7 = unpackEncodedStringArray(dfa_7s);

    class DFA1 extends DFA {

        public DFA1(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 1;
            this.eot = dfa_1;
            this.eof = dfa_2;
            this.min = dfa_3;
            this.max = dfa_4;
            this.accept = dfa_5;
            this.special = dfa_6;
            this.transition = dfa_7;
        }
        public String getDescription() {
            return "()* loopback of 80:4: ( ( (lv_members_1_0= ruleText ) ) ( (lv_members_2_0= ruleMember ) ) )*";
        }
    }
    static final String dfa_8s = "\6\uffff";
    static final String dfa_9s = "\2\6\1\uffff\1\20\1\uffff\1\6";
    static final String dfa_10s = "\1\20\1\23\1\uffff\1\20\1\uffff\1\23";
    static final String dfa_11s = "\2\uffff\1\2\1\uffff\1\1\1\uffff";
    static final String dfa_12s = "\6\uffff}>";
    static final String[] dfa_13s = {
            "\1\2\11\uffff\1\1",
            "\1\4\2\uffff\2\2\1\uffff\1\3\2\2\1\uffff\1\4\1\uffff\2\2",
            "",
            "\1\5",
            "",
            "\1\4\2\uffff\2\2\1\uffff\1\3\1\uffff\1\2\1\uffff\1\4\1\uffff\2\2"
    };

    static final short[] dfa_8 = DFA.unpackEncodedString(dfa_8s);
    static final char[] dfa_9 = DFA.unpackEncodedStringToUnsignedChars(dfa_9s);
    static final char[] dfa_10 = DFA.unpackEncodedStringToUnsignedChars(dfa_10s);
    static final short[] dfa_11 = DFA.unpackEncodedString(dfa_11s);
    static final short[] dfa_12 = DFA.unpackEncodedString(dfa_12s);
    static final short[][] dfa_13 = unpackEncodedStringArray(dfa_13s);

    class DFA4 extends DFA {

        public DFA4(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 4;
            this.eot = dfa_8;
            this.eof = dfa_8;
            this.min = dfa_9;
            this.max = dfa_10;
            this.accept = dfa_11;
            this.special = dfa_12;
            this.transition = dfa_13;
        }
        public String getDescription() {
            return "257:3: ( ( ruleQualifiedName ) )?";
        }
    }
    static final String dfa_14s = "\7\uffff";
    static final String dfa_15s = "\2\uffff\1\5\3\uffff\1\5";
    static final String dfa_16s = "\1\11\1\uffff\1\6\1\uffff\1\20\1\uffff\1\6";
    static final String dfa_17s = "\1\23\1\uffff\1\23\1\uffff\1\20\1\uffff\1\23";
    static final String dfa_18s = "\1\uffff\1\1\1\uffff\1\3\1\uffff\1\2\1\uffff";
    static final String dfa_19s = "\7\uffff}>";
    static final String[] dfa_20s = {
            "\2\1\3\uffff\1\3\1\uffff\1\2\1\uffff\2\1",
            "",
            "\1\5\2\uffff\2\3\1\uffff\1\4\1\uffff\1\3\2\5\1\uffff\2\3",
            "",
            "\1\6",
            "",
            "\1\5\2\uffff\2\3\1\uffff\1\4\1\uffff\1\3\2\5\1\uffff\2\3"
    };

    static final short[] dfa_14 = DFA.unpackEncodedString(dfa_14s);
    static final short[] dfa_15 = DFA.unpackEncodedString(dfa_15s);
    static final char[] dfa_16 = DFA.unpackEncodedStringToUnsignedChars(dfa_16s);
    static final char[] dfa_17 = DFA.unpackEncodedStringToUnsignedChars(dfa_17s);
    static final short[] dfa_18 = DFA.unpackEncodedString(dfa_18s);
    static final short[] dfa_19 = DFA.unpackEncodedString(dfa_19s);
    static final short[][] dfa_20 = unpackEncodedStringArray(dfa_20s);

    class DFA7 extends DFA {

        public DFA7(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 7;
            this.eot = dfa_14;
            this.eof = dfa_15;
            this.min = dfa_16;
            this.max = dfa_17;
            this.accept = dfa_18;
            this.special = dfa_19;
            this.transition = dfa_20;
        }
        public String getDescription() {
            return "394:2: (this_Literal_0= ruleLiteral | this_ClassLiteral_1= ruleClassLiteral | this_ComponentInline_2= ruleComponentInline )";
        }
    }
 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000130L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000010040L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x00000000000D4600L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x00000000000C4600L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000018000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000020880L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000020080L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000800002L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000001002L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000010000L});

}