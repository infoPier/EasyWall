package org.xtext.example.easywall.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.common.util.Enumerator;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.xtext.example.easywall.services.EasyWallGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
@SuppressWarnings("all")
public class InternalEasyWallParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'pack'", "';'", "'import'", "'.'", "'.*'", "'firewall'", "'{'", "'}'", "'set'", "'var'", "':'", "'='", "'def'", "'('", "','", "')'", "'return'", "'if'", "'else'", "'true'", "'false'", "'this'", "'super'", "'new'", "'rule'", "'at'", "'||'", "'or'", "'&&'", "'and'", "'!'", "'not'", "'=='", "'!='", "'isequalto'", "'>='", "'<='", "'>'", "'<'", "'network'", "'netip'", "'netport'", "'protocol'", "'direction'", "'in'", "'out'", "'NetworkLayer'", "'TransportLayer'", "'ApplicationLayer'", "'IPv4'", "'IPv6'", "'ARP'", "'ICMP'", "'NAT'", "'RIP'", "'OSPF'", "'IPSEC'", "'IGMP'", "'UDP'", "'TCP'", "'QUIC'", "'SCTP'", "'HTTP'", "'HTTPS'", "'SMTP'", "'POP3'", "'IMAP'", "'FTP'", "'TFTP'", "'SNMP'", "'TELNET'", "'SSH'", "'DNS'", "'DHCP'"
    };
    public static final int T__50=50;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__59=59;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__55=55;
    public static final int T__12=12;
    public static final int T__56=56;
    public static final int T__13=13;
    public static final int T__57=57;
    public static final int T__14=14;
    public static final int T__58=58;
    public static final int T__51=51;
    public static final int T__52=52;
    public static final int T__53=53;
    public static final int T__54=54;
    public static final int T__60=60;
    public static final int T__61=61;
    public static final int RULE_ID=4;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=6;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int T__66=66;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__23=23;
    public static final int T__67=67;
    public static final int T__24=24;
    public static final int T__68=68;
    public static final int T__25=25;
    public static final int T__69=69;
    public static final int T__62=62;
    public static final int T__63=63;
    public static final int T__20=20;
    public static final int T__64=64;
    public static final int T__21=21;
    public static final int T__65=65;
    public static final int T__70=70;
    public static final int T__71=71;
    public static final int T__72=72;
    public static final int RULE_STRING=5;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int T__33=33;
    public static final int T__77=77;
    public static final int T__34=34;
    public static final int T__78=78;
    public static final int T__35=35;
    public static final int T__79=79;
    public static final int T__36=36;
    public static final int T__73=73;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__74=74;
    public static final int T__31=31;
    public static final int T__75=75;
    public static final int T__32=32;
    public static final int T__76=76;
    public static final int T__80=80;
    public static final int T__81=81;
    public static final int T__82=82;
    public static final int T__83=83;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int T__48=48;
    public static final int T__49=49;
    public static final int T__44=44;
    public static final int T__45=45;
    public static final int T__46=46;
    public static final int T__47=47;
    public static final int T__40=40;
    public static final int T__84=84;
    public static final int T__41=41;
    public static final int T__42=42;
    public static final int T__43=43;

    // delegates
    // delegators


        public InternalEasyWallParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalEasyWallParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalEasyWallParser.tokenNames; }
    public String getGrammarFileName() { return "InternalEasyWall.g"; }



     	private EasyWallGrammarAccess grammarAccess;

        public InternalEasyWallParser(TokenStream input, EasyWallGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "EFProgram";
       	}

       	@Override
       	protected EasyWallGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleEFProgram"
    // InternalEasyWall.g:65:1: entryRuleEFProgram returns [EObject current=null] : iv_ruleEFProgram= ruleEFProgram EOF ;
    public final EObject entryRuleEFProgram() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEFProgram = null;


        try {
            // InternalEasyWall.g:65:50: (iv_ruleEFProgram= ruleEFProgram EOF )
            // InternalEasyWall.g:66:2: iv_ruleEFProgram= ruleEFProgram EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getEFProgramRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleEFProgram=ruleEFProgram();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleEFProgram; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleEFProgram"


    // $ANTLR start "ruleEFProgram"
    // InternalEasyWall.g:72:1: ruleEFProgram returns [EObject current=null] : (this_EFHeader_0= ruleEFHeader ( ( (lv_rule_1_0= ruleEFRule ) ) | ( (lv_firewall_2_0= ruleEFfirewall ) ) ) ) ;
    public final EObject ruleEFProgram() throws RecognitionException {
        EObject current = null;

        EObject this_EFHeader_0 = null;

        EObject lv_rule_1_0 = null;

        EObject lv_firewall_2_0 = null;



        	enterRule();

        try {
            // InternalEasyWall.g:78:2: ( (this_EFHeader_0= ruleEFHeader ( ( (lv_rule_1_0= ruleEFRule ) ) | ( (lv_firewall_2_0= ruleEFfirewall ) ) ) ) )
            // InternalEasyWall.g:79:2: (this_EFHeader_0= ruleEFHeader ( ( (lv_rule_1_0= ruleEFRule ) ) | ( (lv_firewall_2_0= ruleEFfirewall ) ) ) )
            {
            // InternalEasyWall.g:79:2: (this_EFHeader_0= ruleEFHeader ( ( (lv_rule_1_0= ruleEFRule ) ) | ( (lv_firewall_2_0= ruleEFfirewall ) ) ) )
            // InternalEasyWall.g:80:3: this_EFHeader_0= ruleEFHeader ( ( (lv_rule_1_0= ruleEFRule ) ) | ( (lv_firewall_2_0= ruleEFfirewall ) ) )
            {
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getEFProgramAccess().getEFHeaderParserRuleCall_0());
              		
            }
            pushFollow(FOLLOW_3);
            this_EFHeader_0=ruleEFHeader();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_EFHeader_0;
              			afterParserOrEnumRuleCall();
              		
            }
            // InternalEasyWall.g:88:3: ( ( (lv_rule_1_0= ruleEFRule ) ) | ( (lv_firewall_2_0= ruleEFfirewall ) ) )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==35) ) {
                alt1=1;
            }
            else if ( (LA1_0==16) ) {
                alt1=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }
            switch (alt1) {
                case 1 :
                    // InternalEasyWall.g:89:4: ( (lv_rule_1_0= ruleEFRule ) )
                    {
                    // InternalEasyWall.g:89:4: ( (lv_rule_1_0= ruleEFRule ) )
                    // InternalEasyWall.g:90:5: (lv_rule_1_0= ruleEFRule )
                    {
                    // InternalEasyWall.g:90:5: (lv_rule_1_0= ruleEFRule )
                    // InternalEasyWall.g:91:6: lv_rule_1_0= ruleEFRule
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getEFProgramAccess().getRuleEFRuleParserRuleCall_1_0_0());
                      					
                    }
                    pushFollow(FOLLOW_2);
                    lv_rule_1_0=ruleEFRule();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getEFProgramRule());
                      						}
                      						set(
                      							current,
                      							"rule",
                      							lv_rule_1_0,
                      							"org.xtext.example.easywall.EasyWall.EFRule");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalEasyWall.g:109:4: ( (lv_firewall_2_0= ruleEFfirewall ) )
                    {
                    // InternalEasyWall.g:109:4: ( (lv_firewall_2_0= ruleEFfirewall ) )
                    // InternalEasyWall.g:110:5: (lv_firewall_2_0= ruleEFfirewall )
                    {
                    // InternalEasyWall.g:110:5: (lv_firewall_2_0= ruleEFfirewall )
                    // InternalEasyWall.g:111:6: lv_firewall_2_0= ruleEFfirewall
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getEFProgramAccess().getFirewallEFfirewallParserRuleCall_1_1_0());
                      					
                    }
                    pushFollow(FOLLOW_2);
                    lv_firewall_2_0=ruleEFfirewall();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getEFProgramRule());
                      						}
                      						set(
                      							current,
                      							"firewall",
                      							lv_firewall_2_0,
                      							"org.xtext.example.easywall.EasyWall.EFfirewall");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }


                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleEFProgram"


    // $ANTLR start "entryRuleEFHeader"
    // InternalEasyWall.g:133:1: entryRuleEFHeader returns [EObject current=null] : iv_ruleEFHeader= ruleEFHeader EOF ;
    public final EObject entryRuleEFHeader() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEFHeader = null;


        try {
            // InternalEasyWall.g:133:49: (iv_ruleEFHeader= ruleEFHeader EOF )
            // InternalEasyWall.g:134:2: iv_ruleEFHeader= ruleEFHeader EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getEFHeaderRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleEFHeader=ruleEFHeader();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleEFHeader; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleEFHeader"


    // $ANTLR start "ruleEFHeader"
    // InternalEasyWall.g:140:1: ruleEFHeader returns [EObject current=null] : ( () (otherlv_1= 'pack' ( (lv_name_2_0= ruleQualifiedName ) ) otherlv_3= ';' )? ( (lv_imports_4_0= ruleEFImports ) )* ) ;
    public final EObject ruleEFHeader() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;

        EObject lv_imports_4_0 = null;



        	enterRule();

        try {
            // InternalEasyWall.g:146:2: ( ( () (otherlv_1= 'pack' ( (lv_name_2_0= ruleQualifiedName ) ) otherlv_3= ';' )? ( (lv_imports_4_0= ruleEFImports ) )* ) )
            // InternalEasyWall.g:147:2: ( () (otherlv_1= 'pack' ( (lv_name_2_0= ruleQualifiedName ) ) otherlv_3= ';' )? ( (lv_imports_4_0= ruleEFImports ) )* )
            {
            // InternalEasyWall.g:147:2: ( () (otherlv_1= 'pack' ( (lv_name_2_0= ruleQualifiedName ) ) otherlv_3= ';' )? ( (lv_imports_4_0= ruleEFImports ) )* )
            // InternalEasyWall.g:148:3: () (otherlv_1= 'pack' ( (lv_name_2_0= ruleQualifiedName ) ) otherlv_3= ';' )? ( (lv_imports_4_0= ruleEFImports ) )*
            {
            // InternalEasyWall.g:148:3: ()
            // InternalEasyWall.g:149:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getEFHeaderAccess().getEFHeaderAction_0(),
              					current);
              			
            }

            }

            // InternalEasyWall.g:155:3: (otherlv_1= 'pack' ( (lv_name_2_0= ruleQualifiedName ) ) otherlv_3= ';' )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==11) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // InternalEasyWall.g:156:4: otherlv_1= 'pack' ( (lv_name_2_0= ruleQualifiedName ) ) otherlv_3= ';'
                    {
                    otherlv_1=(Token)match(input,11,FOLLOW_4); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_1, grammarAccess.getEFHeaderAccess().getPackKeyword_1_0());
                      			
                    }
                    // InternalEasyWall.g:160:4: ( (lv_name_2_0= ruleQualifiedName ) )
                    // InternalEasyWall.g:161:5: (lv_name_2_0= ruleQualifiedName )
                    {
                    // InternalEasyWall.g:161:5: (lv_name_2_0= ruleQualifiedName )
                    // InternalEasyWall.g:162:6: lv_name_2_0= ruleQualifiedName
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getEFHeaderAccess().getNameQualifiedNameParserRuleCall_1_1_0());
                      					
                    }
                    pushFollow(FOLLOW_5);
                    lv_name_2_0=ruleQualifiedName();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getEFHeaderRule());
                      						}
                      						set(
                      							current,
                      							"name",
                      							lv_name_2_0,
                      							"org.xtext.example.easywall.EasyWall.QualifiedName");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }

                    otherlv_3=(Token)match(input,12,FOLLOW_6); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_3, grammarAccess.getEFHeaderAccess().getSemicolonKeyword_1_2());
                      			
                    }

                    }
                    break;

            }

            // InternalEasyWall.g:184:3: ( (lv_imports_4_0= ruleEFImports ) )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==13) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalEasyWall.g:185:4: (lv_imports_4_0= ruleEFImports )
            	    {
            	    // InternalEasyWall.g:185:4: (lv_imports_4_0= ruleEFImports )
            	    // InternalEasyWall.g:186:5: lv_imports_4_0= ruleEFImports
            	    {
            	    if ( state.backtracking==0 ) {

            	      					newCompositeNode(grammarAccess.getEFHeaderAccess().getImportsEFImportsParserRuleCall_2_0());
            	      				
            	    }
            	    pushFollow(FOLLOW_6);
            	    lv_imports_4_0=ruleEFImports();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      					if (current==null) {
            	      						current = createModelElementForParent(grammarAccess.getEFHeaderRule());
            	      					}
            	      					add(
            	      						current,
            	      						"imports",
            	      						lv_imports_4_0,
            	      						"org.xtext.example.easywall.EasyWall.EFImports");
            	      					afterParserOrEnumRuleCall();
            	      				
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleEFHeader"


    // $ANTLR start "entryRuleEFfirewall"
    // InternalEasyWall.g:207:1: entryRuleEFfirewall returns [EObject current=null] : iv_ruleEFfirewall= ruleEFfirewall EOF ;
    public final EObject entryRuleEFfirewall() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEFfirewall = null;


        try {
            // InternalEasyWall.g:207:51: (iv_ruleEFfirewall= ruleEFfirewall EOF )
            // InternalEasyWall.g:208:2: iv_ruleEFfirewall= ruleEFfirewall EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getEFfirewallRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleEFfirewall=ruleEFfirewall();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleEFfirewall; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleEFfirewall"


    // $ANTLR start "ruleEFfirewall"
    // InternalEasyWall.g:214:1: ruleEFfirewall returns [EObject current=null] : ( (lv_firewall_0_0= ruleEFFireClass ) ) ;
    public final EObject ruleEFfirewall() throws RecognitionException {
        EObject current = null;

        EObject lv_firewall_0_0 = null;



        	enterRule();

        try {
            // InternalEasyWall.g:220:2: ( ( (lv_firewall_0_0= ruleEFFireClass ) ) )
            // InternalEasyWall.g:221:2: ( (lv_firewall_0_0= ruleEFFireClass ) )
            {
            // InternalEasyWall.g:221:2: ( (lv_firewall_0_0= ruleEFFireClass ) )
            // InternalEasyWall.g:222:3: (lv_firewall_0_0= ruleEFFireClass )
            {
            // InternalEasyWall.g:222:3: (lv_firewall_0_0= ruleEFFireClass )
            // InternalEasyWall.g:223:4: lv_firewall_0_0= ruleEFFireClass
            {
            if ( state.backtracking==0 ) {

              				newCompositeNode(grammarAccess.getEFfirewallAccess().getFirewallEFFireClassParserRuleCall_0());
              			
            }
            pushFollow(FOLLOW_2);
            lv_firewall_0_0=ruleEFFireClass();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              				if (current==null) {
              					current = createModelElementForParent(grammarAccess.getEFfirewallRule());
              				}
              				set(
              					current,
              					"firewall",
              					lv_firewall_0_0,
              					"org.xtext.example.easywall.EasyWall.EFFireClass");
              				afterParserOrEnumRuleCall();
              			
            }

            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleEFfirewall"


    // $ANTLR start "entryRuleEFImports"
    // InternalEasyWall.g:243:1: entryRuleEFImports returns [EObject current=null] : iv_ruleEFImports= ruleEFImports EOF ;
    public final EObject entryRuleEFImports() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEFImports = null;


        try {
            // InternalEasyWall.g:243:50: (iv_ruleEFImports= ruleEFImports EOF )
            // InternalEasyWall.g:244:2: iv_ruleEFImports= ruleEFImports EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getEFImportsRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleEFImports=ruleEFImports();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleEFImports; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleEFImports"


    // $ANTLR start "ruleEFImports"
    // InternalEasyWall.g:250:1: ruleEFImports returns [EObject current=null] : (otherlv_0= 'import' ( (lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard ) ) otherlv_2= ';' ) ;
    public final EObject ruleEFImports() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        AntlrDatatypeRuleToken lv_importedNamespace_1_0 = null;



        	enterRule();

        try {
            // InternalEasyWall.g:256:2: ( (otherlv_0= 'import' ( (lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard ) ) otherlv_2= ';' ) )
            // InternalEasyWall.g:257:2: (otherlv_0= 'import' ( (lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard ) ) otherlv_2= ';' )
            {
            // InternalEasyWall.g:257:2: (otherlv_0= 'import' ( (lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard ) ) otherlv_2= ';' )
            // InternalEasyWall.g:258:3: otherlv_0= 'import' ( (lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard ) ) otherlv_2= ';'
            {
            otherlv_0=(Token)match(input,13,FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getEFImportsAccess().getImportKeyword_0());
              		
            }
            // InternalEasyWall.g:262:3: ( (lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard ) )
            // InternalEasyWall.g:263:4: (lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard )
            {
            // InternalEasyWall.g:263:4: (lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard )
            // InternalEasyWall.g:264:5: lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getEFImportsAccess().getImportedNamespaceQualifiedNameWithWildcardParserRuleCall_1_0());
              				
            }
            pushFollow(FOLLOW_5);
            lv_importedNamespace_1_0=ruleQualifiedNameWithWildcard();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getEFImportsRule());
              					}
              					set(
              						current,
              						"importedNamespace",
              						lv_importedNamespace_1_0,
              						"org.xtext.example.easywall.EasyWall.QualifiedNameWithWildcard");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getEFImportsAccess().getSemicolonKeyword_2());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleEFImports"


    // $ANTLR start "entryRuleQualifiedName"
    // InternalEasyWall.g:289:1: entryRuleQualifiedName returns [String current=null] : iv_ruleQualifiedName= ruleQualifiedName EOF ;
    public final String entryRuleQualifiedName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleQualifiedName = null;


        try {
            // InternalEasyWall.g:289:53: (iv_ruleQualifiedName= ruleQualifiedName EOF )
            // InternalEasyWall.g:290:2: iv_ruleQualifiedName= ruleQualifiedName EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getQualifiedNameRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleQualifiedName=ruleQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleQualifiedName.getText(); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // InternalEasyWall.g:296:1: ruleQualifiedName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) ;
    public final AntlrDatatypeRuleToken ruleQualifiedName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token kw=null;
        Token this_ID_2=null;


        	enterRule();

        try {
            // InternalEasyWall.g:302:2: ( (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) )
            // InternalEasyWall.g:303:2: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            {
            // InternalEasyWall.g:303:2: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            // InternalEasyWall.g:304:3: this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )*
            {
            this_ID_0=(Token)match(input,RULE_ID,FOLLOW_7); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(this_ID_0);
              		
            }
            if ( state.backtracking==0 ) {

              			newLeafNode(this_ID_0, grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_0());
              		
            }
            // InternalEasyWall.g:311:3: (kw= '.' this_ID_2= RULE_ID )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==14) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalEasyWall.g:312:4: kw= '.' this_ID_2= RULE_ID
            	    {
            	    kw=(Token)match(input,14,FOLLOW_4); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				current.merge(kw);
            	      				newLeafNode(kw, grammarAccess.getQualifiedNameAccess().getFullStopKeyword_1_0());
            	      			
            	    }
            	    this_ID_2=(Token)match(input,RULE_ID,FOLLOW_7); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				current.merge(this_ID_2);
            	      			
            	    }
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(this_ID_2, grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_1_1());
            	      			
            	    }

            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleQualifiedName"


    // $ANTLR start "entryRuleQualifiedNameWithWildcard"
    // InternalEasyWall.g:329:1: entryRuleQualifiedNameWithWildcard returns [String current=null] : iv_ruleQualifiedNameWithWildcard= ruleQualifiedNameWithWildcard EOF ;
    public final String entryRuleQualifiedNameWithWildcard() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleQualifiedNameWithWildcard = null;


        try {
            // InternalEasyWall.g:329:65: (iv_ruleQualifiedNameWithWildcard= ruleQualifiedNameWithWildcard EOF )
            // InternalEasyWall.g:330:2: iv_ruleQualifiedNameWithWildcard= ruleQualifiedNameWithWildcard EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getQualifiedNameWithWildcardRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleQualifiedNameWithWildcard=ruleQualifiedNameWithWildcard();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleQualifiedNameWithWildcard.getText(); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleQualifiedNameWithWildcard"


    // $ANTLR start "ruleQualifiedNameWithWildcard"
    // InternalEasyWall.g:336:1: ruleQualifiedNameWithWildcard returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_QualifiedName_0= ruleQualifiedName kw= '.*' ) ;
    public final AntlrDatatypeRuleToken ruleQualifiedNameWithWildcard() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_QualifiedName_0 = null;



        	enterRule();

        try {
            // InternalEasyWall.g:342:2: ( (this_QualifiedName_0= ruleQualifiedName kw= '.*' ) )
            // InternalEasyWall.g:343:2: (this_QualifiedName_0= ruleQualifiedName kw= '.*' )
            {
            // InternalEasyWall.g:343:2: (this_QualifiedName_0= ruleQualifiedName kw= '.*' )
            // InternalEasyWall.g:344:3: this_QualifiedName_0= ruleQualifiedName kw= '.*'
            {
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getQualifiedNameWithWildcardAccess().getQualifiedNameParserRuleCall_0());
              		
            }
            pushFollow(FOLLOW_8);
            this_QualifiedName_0=ruleQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(this_QualifiedName_0);
              		
            }
            if ( state.backtracking==0 ) {

              			afterParserOrEnumRuleCall();
              		
            }
            kw=(Token)match(input,15,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(kw);
              			newLeafNode(kw, grammarAccess.getQualifiedNameWithWildcardAccess().getFullStopAsteriskKeyword_1());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleQualifiedNameWithWildcard"


    // $ANTLR start "entryRuleEFFireClass"
    // InternalEasyWall.g:363:1: entryRuleEFFireClass returns [EObject current=null] : iv_ruleEFFireClass= ruleEFFireClass EOF ;
    public final EObject entryRuleEFFireClass() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEFFireClass = null;


        try {
            // InternalEasyWall.g:363:52: (iv_ruleEFFireClass= ruleEFFireClass EOF )
            // InternalEasyWall.g:364:2: iv_ruleEFFireClass= ruleEFFireClass EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getEFFireClassRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleEFFireClass=ruleEFFireClass();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleEFFireClass; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleEFFireClass"


    // $ANTLR start "ruleEFFireClass"
    // InternalEasyWall.g:370:1: ruleEFFireClass returns [EObject current=null] : (otherlv_0= 'firewall' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_members_3_0= ruleEFMember ) )* otherlv_4= '}' ) ;
    public final EObject ruleEFFireClass() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_members_3_0 = null;



        	enterRule();

        try {
            // InternalEasyWall.g:376:2: ( (otherlv_0= 'firewall' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_members_3_0= ruleEFMember ) )* otherlv_4= '}' ) )
            // InternalEasyWall.g:377:2: (otherlv_0= 'firewall' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_members_3_0= ruleEFMember ) )* otherlv_4= '}' )
            {
            // InternalEasyWall.g:377:2: (otherlv_0= 'firewall' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_members_3_0= ruleEFMember ) )* otherlv_4= '}' )
            // InternalEasyWall.g:378:3: otherlv_0= 'firewall' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_members_3_0= ruleEFMember ) )* otherlv_4= '}'
            {
            otherlv_0=(Token)match(input,16,FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getEFFireClassAccess().getFirewallKeyword_0());
              		
            }
            // InternalEasyWall.g:382:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalEasyWall.g:383:4: (lv_name_1_0= RULE_ID )
            {
            // InternalEasyWall.g:383:4: (lv_name_1_0= RULE_ID )
            // InternalEasyWall.g:384:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_9); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_name_1_0, grammarAccess.getEFFireClassAccess().getNameIDTerminalRuleCall_1_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getEFFireClassRule());
              					}
              					setWithLastConsumed(
              						current,
              						"name",
              						lv_name_1_0,
              						"org.eclipse.xtext.common.Terminals.ID");
              				
            }

            }


            }

            otherlv_2=(Token)match(input,17,FOLLOW_10); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getEFFireClassAccess().getLeftCurlyBracketKeyword_2());
              		
            }
            // InternalEasyWall.g:404:3: ( (lv_members_3_0= ruleEFMember ) )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( ((LA5_0>=19 && LA5_0<=20)||LA5_0==23) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // InternalEasyWall.g:405:4: (lv_members_3_0= ruleEFMember )
            	    {
            	    // InternalEasyWall.g:405:4: (lv_members_3_0= ruleEFMember )
            	    // InternalEasyWall.g:406:5: lv_members_3_0= ruleEFMember
            	    {
            	    if ( state.backtracking==0 ) {

            	      					newCompositeNode(grammarAccess.getEFFireClassAccess().getMembersEFMemberParserRuleCall_3_0());
            	      				
            	    }
            	    pushFollow(FOLLOW_10);
            	    lv_members_3_0=ruleEFMember();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      					if (current==null) {
            	      						current = createModelElementForParent(grammarAccess.getEFFireClassRule());
            	      					}
            	      					add(
            	      						current,
            	      						"members",
            	      						lv_members_3_0,
            	      						"org.xtext.example.easywall.EasyWall.EFMember");
            	      					afterParserOrEnumRuleCall();
            	      				
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);

            otherlv_4=(Token)match(input,18,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_4, grammarAccess.getEFFireClassAccess().getRightCurlyBracketKeyword_4());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleEFFireClass"


    // $ANTLR start "entryRuleEFMember"
    // InternalEasyWall.g:431:1: entryRuleEFMember returns [EObject current=null] : iv_ruleEFMember= ruleEFMember EOF ;
    public final EObject entryRuleEFMember() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEFMember = null;


        try {
            // InternalEasyWall.g:431:49: (iv_ruleEFMember= ruleEFMember EOF )
            // InternalEasyWall.g:432:2: iv_ruleEFMember= ruleEFMember EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getEFMemberRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleEFMember=ruleEFMember();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleEFMember; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleEFMember"


    // $ANTLR start "ruleEFMember"
    // InternalEasyWall.g:438:1: ruleEFMember returns [EObject current=null] : (this_EFField_0= ruleEFField | this_EFMethod_1= ruleEFMethod ) ;
    public final EObject ruleEFMember() throws RecognitionException {
        EObject current = null;

        EObject this_EFField_0 = null;

        EObject this_EFMethod_1 = null;



        	enterRule();

        try {
            // InternalEasyWall.g:444:2: ( (this_EFField_0= ruleEFField | this_EFMethod_1= ruleEFMethod ) )
            // InternalEasyWall.g:445:2: (this_EFField_0= ruleEFField | this_EFMethod_1= ruleEFMethod )
            {
            // InternalEasyWall.g:445:2: (this_EFField_0= ruleEFField | this_EFMethod_1= ruleEFMethod )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( ((LA6_0>=19 && LA6_0<=20)) ) {
                alt6=1;
            }
            else if ( (LA6_0==23) ) {
                alt6=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // InternalEasyWall.g:446:3: this_EFField_0= ruleEFField
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getEFMemberAccess().getEFFieldParserRuleCall_0());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_EFField_0=ruleEFField();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_EFField_0;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 2 :
                    // InternalEasyWall.g:455:3: this_EFMethod_1= ruleEFMethod
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getEFMemberAccess().getEFMethodParserRuleCall_1());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_EFMethod_1=ruleEFMethod();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_EFMethod_1;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleEFMember"


    // $ANTLR start "entryRuleEFField"
    // InternalEasyWall.g:467:1: entryRuleEFField returns [EObject current=null] : iv_ruleEFField= ruleEFField EOF ;
    public final EObject entryRuleEFField() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEFField = null;


        try {
            // InternalEasyWall.g:467:48: (iv_ruleEFField= ruleEFField EOF )
            // InternalEasyWall.g:468:2: iv_ruleEFField= ruleEFField EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getEFFieldRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleEFField=ruleEFField();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleEFField; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleEFField"


    // $ANTLR start "ruleEFField"
    // InternalEasyWall.g:474:1: ruleEFField returns [EObject current=null] : ( ( (otherlv_0= 'set' | otherlv_1= 'var' ) this_EFTypedDeclaration_2= ruleEFTypedDeclaration[$current] otherlv_3= ';' ) | this_EFVariableDeclaration_4= ruleEFVariableDeclaration ) ;
    public final EObject ruleEFField() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject this_EFTypedDeclaration_2 = null;

        EObject this_EFVariableDeclaration_4 = null;



        	enterRule();

        try {
            // InternalEasyWall.g:480:2: ( ( ( (otherlv_0= 'set' | otherlv_1= 'var' ) this_EFTypedDeclaration_2= ruleEFTypedDeclaration[$current] otherlv_3= ';' ) | this_EFVariableDeclaration_4= ruleEFVariableDeclaration ) )
            // InternalEasyWall.g:481:2: ( ( (otherlv_0= 'set' | otherlv_1= 'var' ) this_EFTypedDeclaration_2= ruleEFTypedDeclaration[$current] otherlv_3= ';' ) | this_EFVariableDeclaration_4= ruleEFVariableDeclaration )
            {
            // InternalEasyWall.g:481:2: ( ( (otherlv_0= 'set' | otherlv_1= 'var' ) this_EFTypedDeclaration_2= ruleEFTypedDeclaration[$current] otherlv_3= ';' ) | this_EFVariableDeclaration_4= ruleEFVariableDeclaration )
            int alt8=2;
            alt8 = dfa8.predict(input);
            switch (alt8) {
                case 1 :
                    // InternalEasyWall.g:482:3: ( (otherlv_0= 'set' | otherlv_1= 'var' ) this_EFTypedDeclaration_2= ruleEFTypedDeclaration[$current] otherlv_3= ';' )
                    {
                    // InternalEasyWall.g:482:3: ( (otherlv_0= 'set' | otherlv_1= 'var' ) this_EFTypedDeclaration_2= ruleEFTypedDeclaration[$current] otherlv_3= ';' )
                    // InternalEasyWall.g:483:4: (otherlv_0= 'set' | otherlv_1= 'var' ) this_EFTypedDeclaration_2= ruleEFTypedDeclaration[$current] otherlv_3= ';'
                    {
                    // InternalEasyWall.g:483:4: (otherlv_0= 'set' | otherlv_1= 'var' )
                    int alt7=2;
                    int LA7_0 = input.LA(1);

                    if ( (LA7_0==19) ) {
                        alt7=1;
                    }
                    else if ( (LA7_0==20) ) {
                        alt7=2;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 7, 0, input);

                        throw nvae;
                    }
                    switch (alt7) {
                        case 1 :
                            // InternalEasyWall.g:484:5: otherlv_0= 'set'
                            {
                            otherlv_0=(Token)match(input,19,FOLLOW_4); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              					newLeafNode(otherlv_0, grammarAccess.getEFFieldAccess().getSetKeyword_0_0_0());
                              				
                            }

                            }
                            break;
                        case 2 :
                            // InternalEasyWall.g:489:5: otherlv_1= 'var'
                            {
                            otherlv_1=(Token)match(input,20,FOLLOW_4); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              					newLeafNode(otherlv_1, grammarAccess.getEFFieldAccess().getVarKeyword_0_0_1());
                              				
                            }

                            }
                            break;

                    }

                    if ( state.backtracking==0 ) {

                      				if (current==null) {
                      					current = createModelElement(grammarAccess.getEFFieldRule());
                      				}
                      				newCompositeNode(grammarAccess.getEFFieldAccess().getEFTypedDeclarationParserRuleCall_0_1());
                      			
                    }
                    pushFollow(FOLLOW_5);
                    this_EFTypedDeclaration_2=ruleEFTypedDeclaration(current);

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = this_EFTypedDeclaration_2;
                      				afterParserOrEnumRuleCall();
                      			
                    }
                    otherlv_3=(Token)match(input,12,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_3, grammarAccess.getEFFieldAccess().getSemicolonKeyword_0_2());
                      			
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalEasyWall.g:511:3: this_EFVariableDeclaration_4= ruleEFVariableDeclaration
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getEFFieldAccess().getEFVariableDeclarationParserRuleCall_1());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_EFVariableDeclaration_4=ruleEFVariableDeclaration();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_EFVariableDeclaration_4;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleEFField"


    // $ANTLR start "ruleEFTypedDeclaration"
    // InternalEasyWall.g:524:1: ruleEFTypedDeclaration[EObject in_current] returns [EObject current=in_current] : ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( ( ( ruleQualifiedName ) ) | ( (lv_nativetype_3_0= ruleEFNetworkNativeType ) ) ) ) ;
    public final EObject ruleEFTypedDeclaration(EObject in_current) throws RecognitionException {
        EObject current = in_current;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Enumerator lv_nativetype_3_0 = null;



        	enterRule();

        try {
            // InternalEasyWall.g:530:2: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( ( ( ruleQualifiedName ) ) | ( (lv_nativetype_3_0= ruleEFNetworkNativeType ) ) ) ) )
            // InternalEasyWall.g:531:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( ( ( ruleQualifiedName ) ) | ( (lv_nativetype_3_0= ruleEFNetworkNativeType ) ) ) )
            {
            // InternalEasyWall.g:531:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( ( ( ruleQualifiedName ) ) | ( (lv_nativetype_3_0= ruleEFNetworkNativeType ) ) ) )
            // InternalEasyWall.g:532:3: ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( ( ( ruleQualifiedName ) ) | ( (lv_nativetype_3_0= ruleEFNetworkNativeType ) ) )
            {
            // InternalEasyWall.g:532:3: ( (lv_name_0_0= RULE_ID ) )
            // InternalEasyWall.g:533:4: (lv_name_0_0= RULE_ID )
            {
            // InternalEasyWall.g:533:4: (lv_name_0_0= RULE_ID )
            // InternalEasyWall.g:534:5: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_11); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_name_0_0, grammarAccess.getEFTypedDeclarationAccess().getNameIDTerminalRuleCall_0_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getEFTypedDeclarationRule());
              					}
              					setWithLastConsumed(
              						current,
              						"name",
              						lv_name_0_0,
              						"org.eclipse.xtext.common.Terminals.ID");
              				
            }

            }


            }

            otherlv_1=(Token)match(input,21,FOLLOW_12); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getEFTypedDeclarationAccess().getColonKeyword_1());
              		
            }
            // InternalEasyWall.g:554:3: ( ( ( ruleQualifiedName ) ) | ( (lv_nativetype_3_0= ruleEFNetworkNativeType ) ) )
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==RULE_ID) ) {
                alt9=1;
            }
            else if ( ((LA9_0>=50 && LA9_0<=54)) ) {
                alt9=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }
            switch (alt9) {
                case 1 :
                    // InternalEasyWall.g:555:4: ( ( ruleQualifiedName ) )
                    {
                    // InternalEasyWall.g:555:4: ( ( ruleQualifiedName ) )
                    // InternalEasyWall.g:556:5: ( ruleQualifiedName )
                    {
                    // InternalEasyWall.g:556:5: ( ruleQualifiedName )
                    // InternalEasyWall.g:557:6: ruleQualifiedName
                    {
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getEFTypedDeclarationRule());
                      						}
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getEFTypedDeclarationAccess().getRuletypeEFRuleClassCrossReference_2_0_0());
                      					
                    }
                    pushFollow(FOLLOW_2);
                    ruleQualifiedName();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalEasyWall.g:572:4: ( (lv_nativetype_3_0= ruleEFNetworkNativeType ) )
                    {
                    // InternalEasyWall.g:572:4: ( (lv_nativetype_3_0= ruleEFNetworkNativeType ) )
                    // InternalEasyWall.g:573:5: (lv_nativetype_3_0= ruleEFNetworkNativeType )
                    {
                    // InternalEasyWall.g:573:5: (lv_nativetype_3_0= ruleEFNetworkNativeType )
                    // InternalEasyWall.g:574:6: lv_nativetype_3_0= ruleEFNetworkNativeType
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getEFTypedDeclarationAccess().getNativetypeEFNetworkNativeTypeEnumRuleCall_2_1_0());
                      					
                    }
                    pushFollow(FOLLOW_2);
                    lv_nativetype_3_0=ruleEFNetworkNativeType();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getEFTypedDeclarationRule());
                      						}
                      						set(
                      							current,
                      							"nativetype",
                      							lv_nativetype_3_0,
                      							"org.xtext.example.easywall.EasyWall.EFNetworkNativeType");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }


                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleEFTypedDeclaration"


    // $ANTLR start "entryRuleEFVariableDeclaration"
    // InternalEasyWall.g:596:1: entryRuleEFVariableDeclaration returns [EObject current=null] : iv_ruleEFVariableDeclaration= ruleEFVariableDeclaration EOF ;
    public final EObject entryRuleEFVariableDeclaration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEFVariableDeclaration = null;


        try {
            // InternalEasyWall.g:596:62: (iv_ruleEFVariableDeclaration= ruleEFVariableDeclaration EOF )
            // InternalEasyWall.g:597:2: iv_ruleEFVariableDeclaration= ruleEFVariableDeclaration EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getEFVariableDeclarationRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleEFVariableDeclaration=ruleEFVariableDeclaration();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleEFVariableDeclaration; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleEFVariableDeclaration"


    // $ANTLR start "ruleEFVariableDeclaration"
    // InternalEasyWall.g:603:1: ruleEFVariableDeclaration returns [EObject current=null] : ( (otherlv_0= 'set' | otherlv_1= 'var' ) this_EFTypedDeclaration_2= ruleEFTypedDeclaration[$current] otherlv_3= '=' ( (lv_expression_4_0= ruleEFExpression ) ) otherlv_5= ';' ) ;
    public final EObject ruleEFVariableDeclaration() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject this_EFTypedDeclaration_2 = null;

        EObject lv_expression_4_0 = null;



        	enterRule();

        try {
            // InternalEasyWall.g:609:2: ( ( (otherlv_0= 'set' | otherlv_1= 'var' ) this_EFTypedDeclaration_2= ruleEFTypedDeclaration[$current] otherlv_3= '=' ( (lv_expression_4_0= ruleEFExpression ) ) otherlv_5= ';' ) )
            // InternalEasyWall.g:610:2: ( (otherlv_0= 'set' | otherlv_1= 'var' ) this_EFTypedDeclaration_2= ruleEFTypedDeclaration[$current] otherlv_3= '=' ( (lv_expression_4_0= ruleEFExpression ) ) otherlv_5= ';' )
            {
            // InternalEasyWall.g:610:2: ( (otherlv_0= 'set' | otherlv_1= 'var' ) this_EFTypedDeclaration_2= ruleEFTypedDeclaration[$current] otherlv_3= '=' ( (lv_expression_4_0= ruleEFExpression ) ) otherlv_5= ';' )
            // InternalEasyWall.g:611:3: (otherlv_0= 'set' | otherlv_1= 'var' ) this_EFTypedDeclaration_2= ruleEFTypedDeclaration[$current] otherlv_3= '=' ( (lv_expression_4_0= ruleEFExpression ) ) otherlv_5= ';'
            {
            // InternalEasyWall.g:611:3: (otherlv_0= 'set' | otherlv_1= 'var' )
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==19) ) {
                alt10=1;
            }
            else if ( (LA10_0==20) ) {
                alt10=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }
            switch (alt10) {
                case 1 :
                    // InternalEasyWall.g:612:4: otherlv_0= 'set'
                    {
                    otherlv_0=(Token)match(input,19,FOLLOW_4); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_0, grammarAccess.getEFVariableDeclarationAccess().getSetKeyword_0_0());
                      			
                    }

                    }
                    break;
                case 2 :
                    // InternalEasyWall.g:617:4: otherlv_1= 'var'
                    {
                    otherlv_1=(Token)match(input,20,FOLLOW_4); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_1, grammarAccess.getEFVariableDeclarationAccess().getVarKeyword_0_1());
                      			
                    }

                    }
                    break;

            }

            if ( state.backtracking==0 ) {

              			if (current==null) {
              				current = createModelElement(grammarAccess.getEFVariableDeclarationRule());
              			}
              			newCompositeNode(grammarAccess.getEFVariableDeclarationAccess().getEFTypedDeclarationParserRuleCall_1());
              		
            }
            pushFollow(FOLLOW_13);
            this_EFTypedDeclaration_2=ruleEFTypedDeclaration(current);

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_EFTypedDeclaration_2;
              			afterParserOrEnumRuleCall();
              		
            }
            otherlv_3=(Token)match(input,22,FOLLOW_14); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_3, grammarAccess.getEFVariableDeclarationAccess().getEqualsSignKeyword_2());
              		
            }
            // InternalEasyWall.g:637:3: ( (lv_expression_4_0= ruleEFExpression ) )
            // InternalEasyWall.g:638:4: (lv_expression_4_0= ruleEFExpression )
            {
            // InternalEasyWall.g:638:4: (lv_expression_4_0= ruleEFExpression )
            // InternalEasyWall.g:639:5: lv_expression_4_0= ruleEFExpression
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getEFVariableDeclarationAccess().getExpressionEFExpressionParserRuleCall_3_0());
              				
            }
            pushFollow(FOLLOW_5);
            lv_expression_4_0=ruleEFExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getEFVariableDeclarationRule());
              					}
              					set(
              						current,
              						"expression",
              						lv_expression_4_0,
              						"org.xtext.example.easywall.EasyWall.EFExpression");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_5=(Token)match(input,12,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_5, grammarAccess.getEFVariableDeclarationAccess().getSemicolonKeyword_4());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleEFVariableDeclaration"


    // $ANTLR start "entryRuleEFMethod"
    // InternalEasyWall.g:664:1: entryRuleEFMethod returns [EObject current=null] : iv_ruleEFMethod= ruleEFMethod EOF ;
    public final EObject entryRuleEFMethod() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEFMethod = null;


        try {
            // InternalEasyWall.g:664:49: (iv_ruleEFMethod= ruleEFMethod EOF )
            // InternalEasyWall.g:665:2: iv_ruleEFMethod= ruleEFMethod EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getEFMethodRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleEFMethod=ruleEFMethod();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleEFMethod; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleEFMethod"


    // $ANTLR start "ruleEFMethod"
    // InternalEasyWall.g:671:1: ruleEFMethod returns [EObject current=null] : (otherlv_0= 'def' this_EFTypedDeclaration_1= ruleEFTypedDeclaration[$current] otherlv_2= '(' ( ( (lv_params_3_0= ruleEFParameter ) ) (otherlv_4= ',' ( (lv_params_5_0= ruleEFParameter ) ) )* )? otherlv_6= ')' ( (lv_body_7_0= ruleEFBlock ) ) ) ;
    public final EObject ruleEFMethod() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        EObject this_EFTypedDeclaration_1 = null;

        EObject lv_params_3_0 = null;

        EObject lv_params_5_0 = null;

        EObject lv_body_7_0 = null;



        	enterRule();

        try {
            // InternalEasyWall.g:677:2: ( (otherlv_0= 'def' this_EFTypedDeclaration_1= ruleEFTypedDeclaration[$current] otherlv_2= '(' ( ( (lv_params_3_0= ruleEFParameter ) ) (otherlv_4= ',' ( (lv_params_5_0= ruleEFParameter ) ) )* )? otherlv_6= ')' ( (lv_body_7_0= ruleEFBlock ) ) ) )
            // InternalEasyWall.g:678:2: (otherlv_0= 'def' this_EFTypedDeclaration_1= ruleEFTypedDeclaration[$current] otherlv_2= '(' ( ( (lv_params_3_0= ruleEFParameter ) ) (otherlv_4= ',' ( (lv_params_5_0= ruleEFParameter ) ) )* )? otherlv_6= ')' ( (lv_body_7_0= ruleEFBlock ) ) )
            {
            // InternalEasyWall.g:678:2: (otherlv_0= 'def' this_EFTypedDeclaration_1= ruleEFTypedDeclaration[$current] otherlv_2= '(' ( ( (lv_params_3_0= ruleEFParameter ) ) (otherlv_4= ',' ( (lv_params_5_0= ruleEFParameter ) ) )* )? otherlv_6= ')' ( (lv_body_7_0= ruleEFBlock ) ) )
            // InternalEasyWall.g:679:3: otherlv_0= 'def' this_EFTypedDeclaration_1= ruleEFTypedDeclaration[$current] otherlv_2= '(' ( ( (lv_params_3_0= ruleEFParameter ) ) (otherlv_4= ',' ( (lv_params_5_0= ruleEFParameter ) ) )* )? otherlv_6= ')' ( (lv_body_7_0= ruleEFBlock ) )
            {
            otherlv_0=(Token)match(input,23,FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getEFMethodAccess().getDefKeyword_0());
              		
            }
            if ( state.backtracking==0 ) {

              			if (current==null) {
              				current = createModelElement(grammarAccess.getEFMethodRule());
              			}
              			newCompositeNode(grammarAccess.getEFMethodAccess().getEFTypedDeclarationParserRuleCall_1());
              		
            }
            pushFollow(FOLLOW_15);
            this_EFTypedDeclaration_1=ruleEFTypedDeclaration(current);

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_EFTypedDeclaration_1;
              			afterParserOrEnumRuleCall();
              		
            }
            otherlv_2=(Token)match(input,24,FOLLOW_16); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getEFMethodAccess().getLeftParenthesisKeyword_2());
              		
            }
            // InternalEasyWall.g:698:3: ( ( (lv_params_3_0= ruleEFParameter ) ) (otherlv_4= ',' ( (lv_params_5_0= ruleEFParameter ) ) )* )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==RULE_ID) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // InternalEasyWall.g:699:4: ( (lv_params_3_0= ruleEFParameter ) ) (otherlv_4= ',' ( (lv_params_5_0= ruleEFParameter ) ) )*
                    {
                    // InternalEasyWall.g:699:4: ( (lv_params_3_0= ruleEFParameter ) )
                    // InternalEasyWall.g:700:5: (lv_params_3_0= ruleEFParameter )
                    {
                    // InternalEasyWall.g:700:5: (lv_params_3_0= ruleEFParameter )
                    // InternalEasyWall.g:701:6: lv_params_3_0= ruleEFParameter
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getEFMethodAccess().getParamsEFParameterParserRuleCall_3_0_0());
                      					
                    }
                    pushFollow(FOLLOW_17);
                    lv_params_3_0=ruleEFParameter();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getEFMethodRule());
                      						}
                      						add(
                      							current,
                      							"params",
                      							lv_params_3_0,
                      							"org.xtext.example.easywall.EasyWall.EFParameter");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }

                    // InternalEasyWall.g:718:4: (otherlv_4= ',' ( (lv_params_5_0= ruleEFParameter ) ) )*
                    loop11:
                    do {
                        int alt11=2;
                        int LA11_0 = input.LA(1);

                        if ( (LA11_0==25) ) {
                            alt11=1;
                        }


                        switch (alt11) {
                    	case 1 :
                    	    // InternalEasyWall.g:719:5: otherlv_4= ',' ( (lv_params_5_0= ruleEFParameter ) )
                    	    {
                    	    otherlv_4=(Token)match(input,25,FOLLOW_4); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      					newLeafNode(otherlv_4, grammarAccess.getEFMethodAccess().getCommaKeyword_3_1_0());
                    	      				
                    	    }
                    	    // InternalEasyWall.g:723:5: ( (lv_params_5_0= ruleEFParameter ) )
                    	    // InternalEasyWall.g:724:6: (lv_params_5_0= ruleEFParameter )
                    	    {
                    	    // InternalEasyWall.g:724:6: (lv_params_5_0= ruleEFParameter )
                    	    // InternalEasyWall.g:725:7: lv_params_5_0= ruleEFParameter
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      							newCompositeNode(grammarAccess.getEFMethodAccess().getParamsEFParameterParserRuleCall_3_1_1_0());
                    	      						
                    	    }
                    	    pushFollow(FOLLOW_17);
                    	    lv_params_5_0=ruleEFParameter();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      							if (current==null) {
                    	      								current = createModelElementForParent(grammarAccess.getEFMethodRule());
                    	      							}
                    	      							add(
                    	      								current,
                    	      								"params",
                    	      								lv_params_5_0,
                    	      								"org.xtext.example.easywall.EasyWall.EFParameter");
                    	      							afterParserOrEnumRuleCall();
                    	      						
                    	    }

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop11;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_6=(Token)match(input,26,FOLLOW_9); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_6, grammarAccess.getEFMethodAccess().getRightParenthesisKeyword_4());
              		
            }
            // InternalEasyWall.g:748:3: ( (lv_body_7_0= ruleEFBlock ) )
            // InternalEasyWall.g:749:4: (lv_body_7_0= ruleEFBlock )
            {
            // InternalEasyWall.g:749:4: (lv_body_7_0= ruleEFBlock )
            // InternalEasyWall.g:750:5: lv_body_7_0= ruleEFBlock
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getEFMethodAccess().getBodyEFBlockParserRuleCall_5_0());
              				
            }
            pushFollow(FOLLOW_2);
            lv_body_7_0=ruleEFBlock();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getEFMethodRule());
              					}
              					set(
              						current,
              						"body",
              						lv_body_7_0,
              						"org.xtext.example.easywall.EasyWall.EFBlock");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleEFMethod"


    // $ANTLR start "entryRuleEFParameter"
    // InternalEasyWall.g:771:1: entryRuleEFParameter returns [EObject current=null] : iv_ruleEFParameter= ruleEFParameter EOF ;
    public final EObject entryRuleEFParameter() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEFParameter = null;


        try {
            // InternalEasyWall.g:771:52: (iv_ruleEFParameter= ruleEFParameter EOF )
            // InternalEasyWall.g:772:2: iv_ruleEFParameter= ruleEFParameter EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getEFParameterRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleEFParameter=ruleEFParameter();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleEFParameter; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleEFParameter"


    // $ANTLR start "ruleEFParameter"
    // InternalEasyWall.g:778:1: ruleEFParameter returns [EObject current=null] : this_EFTypedDeclaration_0= ruleEFTypedDeclaration[$current] ;
    public final EObject ruleEFParameter() throws RecognitionException {
        EObject current = null;

        EObject this_EFTypedDeclaration_0 = null;



        	enterRule();

        try {
            // InternalEasyWall.g:784:2: (this_EFTypedDeclaration_0= ruleEFTypedDeclaration[$current] )
            // InternalEasyWall.g:785:2: this_EFTypedDeclaration_0= ruleEFTypedDeclaration[$current]
            {
            if ( state.backtracking==0 ) {

              		if (current==null) {
              			current = createModelElement(grammarAccess.getEFParameterRule());
              		}
              		newCompositeNode(grammarAccess.getEFParameterAccess().getEFTypedDeclarationParserRuleCall());
              	
            }
            pushFollow(FOLLOW_2);
            this_EFTypedDeclaration_0=ruleEFTypedDeclaration(current);

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current = this_EFTypedDeclaration_0;
              		afterParserOrEnumRuleCall();
              	
            }

            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleEFParameter"


    // $ANTLR start "entryRuleEFBlock"
    // InternalEasyWall.g:799:1: entryRuleEFBlock returns [EObject current=null] : iv_ruleEFBlock= ruleEFBlock EOF ;
    public final EObject entryRuleEFBlock() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEFBlock = null;


        try {
            // InternalEasyWall.g:799:48: (iv_ruleEFBlock= ruleEFBlock EOF )
            // InternalEasyWall.g:800:2: iv_ruleEFBlock= ruleEFBlock EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getEFBlockRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleEFBlock=ruleEFBlock();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleEFBlock; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleEFBlock"


    // $ANTLR start "ruleEFBlock"
    // InternalEasyWall.g:806:1: ruleEFBlock returns [EObject current=null] : ( () otherlv_1= '{' ( (lv_statements_2_0= ruleEFStatement ) )* otherlv_3= '}' ) ;
    public final EObject ruleEFBlock() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_statements_2_0 = null;



        	enterRule();

        try {
            // InternalEasyWall.g:812:2: ( ( () otherlv_1= '{' ( (lv_statements_2_0= ruleEFStatement ) )* otherlv_3= '}' ) )
            // InternalEasyWall.g:813:2: ( () otherlv_1= '{' ( (lv_statements_2_0= ruleEFStatement ) )* otherlv_3= '}' )
            {
            // InternalEasyWall.g:813:2: ( () otherlv_1= '{' ( (lv_statements_2_0= ruleEFStatement ) )* otherlv_3= '}' )
            // InternalEasyWall.g:814:3: () otherlv_1= '{' ( (lv_statements_2_0= ruleEFStatement ) )* otherlv_3= '}'
            {
            // InternalEasyWall.g:814:3: ()
            // InternalEasyWall.g:815:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getEFBlockAccess().getEFBlockAction_0(),
              					current);
              			
            }

            }

            otherlv_1=(Token)match(input,17,FOLLOW_18); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getEFBlockAccess().getLeftCurlyBracketKeyword_1());
              		
            }
            // InternalEasyWall.g:825:3: ( (lv_statements_2_0= ruleEFStatement ) )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( ((LA13_0>=RULE_ID && LA13_0<=RULE_INT)||(LA13_0>=19 && LA13_0<=20)||LA13_0==24||(LA13_0>=27 && LA13_0<=28)||(LA13_0>=30 && LA13_0<=34)||(LA13_0>=41 && LA13_0<=42)||(LA13_0>=50 && LA13_0<=56)||(LA13_0>=60 && LA13_0<=84)) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // InternalEasyWall.g:826:4: (lv_statements_2_0= ruleEFStatement )
            	    {
            	    // InternalEasyWall.g:826:4: (lv_statements_2_0= ruleEFStatement )
            	    // InternalEasyWall.g:827:5: lv_statements_2_0= ruleEFStatement
            	    {
            	    if ( state.backtracking==0 ) {

            	      					newCompositeNode(grammarAccess.getEFBlockAccess().getStatementsEFStatementParserRuleCall_2_0());
            	      				
            	    }
            	    pushFollow(FOLLOW_18);
            	    lv_statements_2_0=ruleEFStatement();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      					if (current==null) {
            	      						current = createModelElementForParent(grammarAccess.getEFBlockRule());
            	      					}
            	      					add(
            	      						current,
            	      						"statements",
            	      						lv_statements_2_0,
            	      						"org.xtext.example.easywall.EasyWall.EFStatement");
            	      					afterParserOrEnumRuleCall();
            	      				
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop13;
                }
            } while (true);

            otherlv_3=(Token)match(input,18,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_3, grammarAccess.getEFBlockAccess().getRightCurlyBracketKeyword_3());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleEFBlock"


    // $ANTLR start "entryRuleEFStatement"
    // InternalEasyWall.g:852:1: entryRuleEFStatement returns [EObject current=null] : iv_ruleEFStatement= ruleEFStatement EOF ;
    public final EObject entryRuleEFStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEFStatement = null;


        try {
            // InternalEasyWall.g:852:52: (iv_ruleEFStatement= ruleEFStatement EOF )
            // InternalEasyWall.g:853:2: iv_ruleEFStatement= ruleEFStatement EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getEFStatementRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleEFStatement=ruleEFStatement();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleEFStatement; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleEFStatement"


    // $ANTLR start "ruleEFStatement"
    // InternalEasyWall.g:859:1: ruleEFStatement returns [EObject current=null] : (this_EFVariableDeclaration_0= ruleEFVariableDeclaration | this_EFReturn_1= ruleEFReturn | (this_EFExpression_2= ruleEFExpression otherlv_3= ';' ) | this_EFIfStatement_4= ruleEFIfStatement ) ;
    public final EObject ruleEFStatement() throws RecognitionException {
        EObject current = null;

        Token otherlv_3=null;
        EObject this_EFVariableDeclaration_0 = null;

        EObject this_EFReturn_1 = null;

        EObject this_EFExpression_2 = null;

        EObject this_EFIfStatement_4 = null;



        	enterRule();

        try {
            // InternalEasyWall.g:865:2: ( (this_EFVariableDeclaration_0= ruleEFVariableDeclaration | this_EFReturn_1= ruleEFReturn | (this_EFExpression_2= ruleEFExpression otherlv_3= ';' ) | this_EFIfStatement_4= ruleEFIfStatement ) )
            // InternalEasyWall.g:866:2: (this_EFVariableDeclaration_0= ruleEFVariableDeclaration | this_EFReturn_1= ruleEFReturn | (this_EFExpression_2= ruleEFExpression otherlv_3= ';' ) | this_EFIfStatement_4= ruleEFIfStatement )
            {
            // InternalEasyWall.g:866:2: (this_EFVariableDeclaration_0= ruleEFVariableDeclaration | this_EFReturn_1= ruleEFReturn | (this_EFExpression_2= ruleEFExpression otherlv_3= ';' ) | this_EFIfStatement_4= ruleEFIfStatement )
            int alt14=4;
            switch ( input.LA(1) ) {
            case 19:
            case 20:
                {
                alt14=1;
                }
                break;
            case 27:
                {
                alt14=2;
                }
                break;
            case RULE_ID:
            case RULE_STRING:
            case RULE_INT:
            case 24:
            case 30:
            case 31:
            case 32:
            case 33:
            case 34:
            case 41:
            case 42:
            case 50:
            case 51:
            case 52:
            case 53:
            case 54:
            case 55:
            case 56:
            case 60:
            case 61:
            case 62:
            case 63:
            case 64:
            case 65:
            case 66:
            case 67:
            case 68:
            case 69:
            case 70:
            case 71:
            case 72:
            case 73:
            case 74:
            case 75:
            case 76:
            case 77:
            case 78:
            case 79:
            case 80:
            case 81:
            case 82:
            case 83:
            case 84:
                {
                alt14=3;
                }
                break;
            case 28:
                {
                alt14=4;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 14, 0, input);

                throw nvae;
            }

            switch (alt14) {
                case 1 :
                    // InternalEasyWall.g:867:3: this_EFVariableDeclaration_0= ruleEFVariableDeclaration
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getEFStatementAccess().getEFVariableDeclarationParserRuleCall_0());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_EFVariableDeclaration_0=ruleEFVariableDeclaration();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_EFVariableDeclaration_0;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 2 :
                    // InternalEasyWall.g:876:3: this_EFReturn_1= ruleEFReturn
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getEFStatementAccess().getEFReturnParserRuleCall_1());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_EFReturn_1=ruleEFReturn();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_EFReturn_1;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 3 :
                    // InternalEasyWall.g:885:3: (this_EFExpression_2= ruleEFExpression otherlv_3= ';' )
                    {
                    // InternalEasyWall.g:885:3: (this_EFExpression_2= ruleEFExpression otherlv_3= ';' )
                    // InternalEasyWall.g:886:4: this_EFExpression_2= ruleEFExpression otherlv_3= ';'
                    {
                    if ( state.backtracking==0 ) {

                      				newCompositeNode(grammarAccess.getEFStatementAccess().getEFExpressionParserRuleCall_2_0());
                      			
                    }
                    pushFollow(FOLLOW_5);
                    this_EFExpression_2=ruleEFExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = this_EFExpression_2;
                      				afterParserOrEnumRuleCall();
                      			
                    }
                    otherlv_3=(Token)match(input,12,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_3, grammarAccess.getEFStatementAccess().getSemicolonKeyword_2_1());
                      			
                    }

                    }


                    }
                    break;
                case 4 :
                    // InternalEasyWall.g:900:3: this_EFIfStatement_4= ruleEFIfStatement
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getEFStatementAccess().getEFIfStatementParserRuleCall_3());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_EFIfStatement_4=ruleEFIfStatement();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_EFIfStatement_4;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleEFStatement"


    // $ANTLR start "entryRuleEFReturn"
    // InternalEasyWall.g:912:1: entryRuleEFReturn returns [EObject current=null] : iv_ruleEFReturn= ruleEFReturn EOF ;
    public final EObject entryRuleEFReturn() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEFReturn = null;


        try {
            // InternalEasyWall.g:912:49: (iv_ruleEFReturn= ruleEFReturn EOF )
            // InternalEasyWall.g:913:2: iv_ruleEFReturn= ruleEFReturn EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getEFReturnRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleEFReturn=ruleEFReturn();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleEFReturn; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleEFReturn"


    // $ANTLR start "ruleEFReturn"
    // InternalEasyWall.g:919:1: ruleEFReturn returns [EObject current=null] : (otherlv_0= 'return' ( (lv_expression_1_0= ruleEFExpression ) ) otherlv_2= ';' ) ;
    public final EObject ruleEFReturn() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_expression_1_0 = null;



        	enterRule();

        try {
            // InternalEasyWall.g:925:2: ( (otherlv_0= 'return' ( (lv_expression_1_0= ruleEFExpression ) ) otherlv_2= ';' ) )
            // InternalEasyWall.g:926:2: (otherlv_0= 'return' ( (lv_expression_1_0= ruleEFExpression ) ) otherlv_2= ';' )
            {
            // InternalEasyWall.g:926:2: (otherlv_0= 'return' ( (lv_expression_1_0= ruleEFExpression ) ) otherlv_2= ';' )
            // InternalEasyWall.g:927:3: otherlv_0= 'return' ( (lv_expression_1_0= ruleEFExpression ) ) otherlv_2= ';'
            {
            otherlv_0=(Token)match(input,27,FOLLOW_14); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getEFReturnAccess().getReturnKeyword_0());
              		
            }
            // InternalEasyWall.g:931:3: ( (lv_expression_1_0= ruleEFExpression ) )
            // InternalEasyWall.g:932:4: (lv_expression_1_0= ruleEFExpression )
            {
            // InternalEasyWall.g:932:4: (lv_expression_1_0= ruleEFExpression )
            // InternalEasyWall.g:933:5: lv_expression_1_0= ruleEFExpression
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getEFReturnAccess().getExpressionEFExpressionParserRuleCall_1_0());
              				
            }
            pushFollow(FOLLOW_5);
            lv_expression_1_0=ruleEFExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getEFReturnRule());
              					}
              					set(
              						current,
              						"expression",
              						lv_expression_1_0,
              						"org.xtext.example.easywall.EasyWall.EFExpression");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getEFReturnAccess().getSemicolonKeyword_2());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleEFReturn"


    // $ANTLR start "entryRuleEFIfStatement"
    // InternalEasyWall.g:958:1: entryRuleEFIfStatement returns [EObject current=null] : iv_ruleEFIfStatement= ruleEFIfStatement EOF ;
    public final EObject entryRuleEFIfStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEFIfStatement = null;


        try {
            // InternalEasyWall.g:958:54: (iv_ruleEFIfStatement= ruleEFIfStatement EOF )
            // InternalEasyWall.g:959:2: iv_ruleEFIfStatement= ruleEFIfStatement EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getEFIfStatementRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleEFIfStatement=ruleEFIfStatement();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleEFIfStatement; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleEFIfStatement"


    // $ANTLR start "ruleEFIfStatement"
    // InternalEasyWall.g:965:1: ruleEFIfStatement returns [EObject current=null] : (otherlv_0= 'if' otherlv_1= '(' ( (lv_expression_2_0= ruleEFExpression ) ) otherlv_3= ')' ( (lv_thenBlock_4_0= ruleEFIfBlock ) ) ( ( ( 'else' )=>otherlv_5= 'else' ) ( (lv_elseBlock_6_0= ruleEFIfBlock ) ) )? ) ;
    public final EObject ruleEFIfStatement() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_expression_2_0 = null;

        EObject lv_thenBlock_4_0 = null;

        EObject lv_elseBlock_6_0 = null;



        	enterRule();

        try {
            // InternalEasyWall.g:971:2: ( (otherlv_0= 'if' otherlv_1= '(' ( (lv_expression_2_0= ruleEFExpression ) ) otherlv_3= ')' ( (lv_thenBlock_4_0= ruleEFIfBlock ) ) ( ( ( 'else' )=>otherlv_5= 'else' ) ( (lv_elseBlock_6_0= ruleEFIfBlock ) ) )? ) )
            // InternalEasyWall.g:972:2: (otherlv_0= 'if' otherlv_1= '(' ( (lv_expression_2_0= ruleEFExpression ) ) otherlv_3= ')' ( (lv_thenBlock_4_0= ruleEFIfBlock ) ) ( ( ( 'else' )=>otherlv_5= 'else' ) ( (lv_elseBlock_6_0= ruleEFIfBlock ) ) )? )
            {
            // InternalEasyWall.g:972:2: (otherlv_0= 'if' otherlv_1= '(' ( (lv_expression_2_0= ruleEFExpression ) ) otherlv_3= ')' ( (lv_thenBlock_4_0= ruleEFIfBlock ) ) ( ( ( 'else' )=>otherlv_5= 'else' ) ( (lv_elseBlock_6_0= ruleEFIfBlock ) ) )? )
            // InternalEasyWall.g:973:3: otherlv_0= 'if' otherlv_1= '(' ( (lv_expression_2_0= ruleEFExpression ) ) otherlv_3= ')' ( (lv_thenBlock_4_0= ruleEFIfBlock ) ) ( ( ( 'else' )=>otherlv_5= 'else' ) ( (lv_elseBlock_6_0= ruleEFIfBlock ) ) )?
            {
            otherlv_0=(Token)match(input,28,FOLLOW_15); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getEFIfStatementAccess().getIfKeyword_0());
              		
            }
            otherlv_1=(Token)match(input,24,FOLLOW_14); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getEFIfStatementAccess().getLeftParenthesisKeyword_1());
              		
            }
            // InternalEasyWall.g:981:3: ( (lv_expression_2_0= ruleEFExpression ) )
            // InternalEasyWall.g:982:4: (lv_expression_2_0= ruleEFExpression )
            {
            // InternalEasyWall.g:982:4: (lv_expression_2_0= ruleEFExpression )
            // InternalEasyWall.g:983:5: lv_expression_2_0= ruleEFExpression
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getEFIfStatementAccess().getExpressionEFExpressionParserRuleCall_2_0());
              				
            }
            pushFollow(FOLLOW_19);
            lv_expression_2_0=ruleEFExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getEFIfStatementRule());
              					}
              					set(
              						current,
              						"expression",
              						lv_expression_2_0,
              						"org.xtext.example.easywall.EasyWall.EFExpression");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_3=(Token)match(input,26,FOLLOW_20); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_3, grammarAccess.getEFIfStatementAccess().getRightParenthesisKeyword_3());
              		
            }
            // InternalEasyWall.g:1004:3: ( (lv_thenBlock_4_0= ruleEFIfBlock ) )
            // InternalEasyWall.g:1005:4: (lv_thenBlock_4_0= ruleEFIfBlock )
            {
            // InternalEasyWall.g:1005:4: (lv_thenBlock_4_0= ruleEFIfBlock )
            // InternalEasyWall.g:1006:5: lv_thenBlock_4_0= ruleEFIfBlock
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getEFIfStatementAccess().getThenBlockEFIfBlockParserRuleCall_4_0());
              				
            }
            pushFollow(FOLLOW_21);
            lv_thenBlock_4_0=ruleEFIfBlock();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getEFIfStatementRule());
              					}
              					set(
              						current,
              						"thenBlock",
              						lv_thenBlock_4_0,
              						"org.xtext.example.easywall.EasyWall.EFIfBlock");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalEasyWall.g:1023:3: ( ( ( 'else' )=>otherlv_5= 'else' ) ( (lv_elseBlock_6_0= ruleEFIfBlock ) ) )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==29) ) {
                int LA15_1 = input.LA(2);

                if ( (synpred1_InternalEasyWall()) ) {
                    alt15=1;
                }
            }
            switch (alt15) {
                case 1 :
                    // InternalEasyWall.g:1024:4: ( ( 'else' )=>otherlv_5= 'else' ) ( (lv_elseBlock_6_0= ruleEFIfBlock ) )
                    {
                    // InternalEasyWall.g:1024:4: ( ( 'else' )=>otherlv_5= 'else' )
                    // InternalEasyWall.g:1025:5: ( 'else' )=>otherlv_5= 'else'
                    {
                    otherlv_5=(Token)match(input,29,FOLLOW_20); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(otherlv_5, grammarAccess.getEFIfStatementAccess().getElseKeyword_5_0());
                      				
                    }

                    }

                    // InternalEasyWall.g:1031:4: ( (lv_elseBlock_6_0= ruleEFIfBlock ) )
                    // InternalEasyWall.g:1032:5: (lv_elseBlock_6_0= ruleEFIfBlock )
                    {
                    // InternalEasyWall.g:1032:5: (lv_elseBlock_6_0= ruleEFIfBlock )
                    // InternalEasyWall.g:1033:6: lv_elseBlock_6_0= ruleEFIfBlock
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getEFIfStatementAccess().getElseBlockEFIfBlockParserRuleCall_5_1_0());
                      					
                    }
                    pushFollow(FOLLOW_2);
                    lv_elseBlock_6_0=ruleEFIfBlock();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getEFIfStatementRule());
                      						}
                      						set(
                      							current,
                      							"elseBlock",
                      							lv_elseBlock_6_0,
                      							"org.xtext.example.easywall.EasyWall.EFIfBlock");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }


                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleEFIfStatement"


    // $ANTLR start "entryRuleEFIfBlock"
    // InternalEasyWall.g:1055:1: entryRuleEFIfBlock returns [EObject current=null] : iv_ruleEFIfBlock= ruleEFIfBlock EOF ;
    public final EObject entryRuleEFIfBlock() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEFIfBlock = null;


        try {
            // InternalEasyWall.g:1055:50: (iv_ruleEFIfBlock= ruleEFIfBlock EOF )
            // InternalEasyWall.g:1056:2: iv_ruleEFIfBlock= ruleEFIfBlock EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getEFIfBlockRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleEFIfBlock=ruleEFIfBlock();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleEFIfBlock; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleEFIfBlock"


    // $ANTLR start "ruleEFIfBlock"
    // InternalEasyWall.g:1062:1: ruleEFIfBlock returns [EObject current=null] : ( ( (lv_statements_0_0= ruleEFStatement ) ) | this_EFBlock_1= ruleEFBlock ) ;
    public final EObject ruleEFIfBlock() throws RecognitionException {
        EObject current = null;

        EObject lv_statements_0_0 = null;

        EObject this_EFBlock_1 = null;



        	enterRule();

        try {
            // InternalEasyWall.g:1068:2: ( ( ( (lv_statements_0_0= ruleEFStatement ) ) | this_EFBlock_1= ruleEFBlock ) )
            // InternalEasyWall.g:1069:2: ( ( (lv_statements_0_0= ruleEFStatement ) ) | this_EFBlock_1= ruleEFBlock )
            {
            // InternalEasyWall.g:1069:2: ( ( (lv_statements_0_0= ruleEFStatement ) ) | this_EFBlock_1= ruleEFBlock )
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( ((LA16_0>=RULE_ID && LA16_0<=RULE_INT)||(LA16_0>=19 && LA16_0<=20)||LA16_0==24||(LA16_0>=27 && LA16_0<=28)||(LA16_0>=30 && LA16_0<=34)||(LA16_0>=41 && LA16_0<=42)||(LA16_0>=50 && LA16_0<=56)||(LA16_0>=60 && LA16_0<=84)) ) {
                alt16=1;
            }
            else if ( (LA16_0==17) ) {
                alt16=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 16, 0, input);

                throw nvae;
            }
            switch (alt16) {
                case 1 :
                    // InternalEasyWall.g:1070:3: ( (lv_statements_0_0= ruleEFStatement ) )
                    {
                    // InternalEasyWall.g:1070:3: ( (lv_statements_0_0= ruleEFStatement ) )
                    // InternalEasyWall.g:1071:4: (lv_statements_0_0= ruleEFStatement )
                    {
                    // InternalEasyWall.g:1071:4: (lv_statements_0_0= ruleEFStatement )
                    // InternalEasyWall.g:1072:5: lv_statements_0_0= ruleEFStatement
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getEFIfBlockAccess().getStatementsEFStatementParserRuleCall_0_0());
                      				
                    }
                    pushFollow(FOLLOW_2);
                    lv_statements_0_0=ruleEFStatement();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElementForParent(grammarAccess.getEFIfBlockRule());
                      					}
                      					add(
                      						current,
                      						"statements",
                      						lv_statements_0_0,
                      						"org.xtext.example.easywall.EasyWall.EFStatement");
                      					afterParserOrEnumRuleCall();
                      				
                    }

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalEasyWall.g:1090:3: this_EFBlock_1= ruleEFBlock
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getEFIfBlockAccess().getEFBlockParserRuleCall_1());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_EFBlock_1=ruleEFBlock();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_EFBlock_1;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleEFIfBlock"


    // $ANTLR start "entryRuleEFExpression"
    // InternalEasyWall.g:1102:1: entryRuleEFExpression returns [EObject current=null] : iv_ruleEFExpression= ruleEFExpression EOF ;
    public final EObject entryRuleEFExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEFExpression = null;


        try {
            // InternalEasyWall.g:1102:53: (iv_ruleEFExpression= ruleEFExpression EOF )
            // InternalEasyWall.g:1103:2: iv_ruleEFExpression= ruleEFExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getEFExpressionRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleEFExpression=ruleEFExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleEFExpression; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleEFExpression"


    // $ANTLR start "ruleEFExpression"
    // InternalEasyWall.g:1109:1: ruleEFExpression returns [EObject current=null] : this_EFAssignment_0= ruleEFAssignment ;
    public final EObject ruleEFExpression() throws RecognitionException {
        EObject current = null;

        EObject this_EFAssignment_0 = null;



        	enterRule();

        try {
            // InternalEasyWall.g:1115:2: (this_EFAssignment_0= ruleEFAssignment )
            // InternalEasyWall.g:1116:2: this_EFAssignment_0= ruleEFAssignment
            {
            if ( state.backtracking==0 ) {

              		newCompositeNode(grammarAccess.getEFExpressionAccess().getEFAssignmentParserRuleCall());
              	
            }
            pushFollow(FOLLOW_2);
            this_EFAssignment_0=ruleEFAssignment();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current = this_EFAssignment_0;
              		afterParserOrEnumRuleCall();
              	
            }

            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleEFExpression"


    // $ANTLR start "entryRuleEFAssignment"
    // InternalEasyWall.g:1127:1: entryRuleEFAssignment returns [EObject current=null] : iv_ruleEFAssignment= ruleEFAssignment EOF ;
    public final EObject entryRuleEFAssignment() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEFAssignment = null;


        try {
            // InternalEasyWall.g:1127:53: (iv_ruleEFAssignment= ruleEFAssignment EOF )
            // InternalEasyWall.g:1128:2: iv_ruleEFAssignment= ruleEFAssignment EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getEFAssignmentRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleEFAssignment=ruleEFAssignment();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleEFAssignment; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleEFAssignment"


    // $ANTLR start "ruleEFAssignment"
    // InternalEasyWall.g:1134:1: ruleEFAssignment returns [EObject current=null] : (this_EFOrExpression_0= ruleEFOrExpression ( () otherlv_2= '=' ( (lv_right_3_0= ruleEFAssignment ) ) )? ) ;
    public final EObject ruleEFAssignment() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_EFOrExpression_0 = null;

        EObject lv_right_3_0 = null;



        	enterRule();

        try {
            // InternalEasyWall.g:1140:2: ( (this_EFOrExpression_0= ruleEFOrExpression ( () otherlv_2= '=' ( (lv_right_3_0= ruleEFAssignment ) ) )? ) )
            // InternalEasyWall.g:1141:2: (this_EFOrExpression_0= ruleEFOrExpression ( () otherlv_2= '=' ( (lv_right_3_0= ruleEFAssignment ) ) )? )
            {
            // InternalEasyWall.g:1141:2: (this_EFOrExpression_0= ruleEFOrExpression ( () otherlv_2= '=' ( (lv_right_3_0= ruleEFAssignment ) ) )? )
            // InternalEasyWall.g:1142:3: this_EFOrExpression_0= ruleEFOrExpression ( () otherlv_2= '=' ( (lv_right_3_0= ruleEFAssignment ) ) )?
            {
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getEFAssignmentAccess().getEFOrExpressionParserRuleCall_0());
              		
            }
            pushFollow(FOLLOW_22);
            this_EFOrExpression_0=ruleEFOrExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_EFOrExpression_0;
              			afterParserOrEnumRuleCall();
              		
            }
            // InternalEasyWall.g:1150:3: ( () otherlv_2= '=' ( (lv_right_3_0= ruleEFAssignment ) ) )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==22) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // InternalEasyWall.g:1151:4: () otherlv_2= '=' ( (lv_right_3_0= ruleEFAssignment ) )
                    {
                    // InternalEasyWall.g:1151:4: ()
                    // InternalEasyWall.g:1152:5: 
                    {
                    if ( state.backtracking==0 ) {

                      					current = forceCreateModelElementAndSet(
                      						grammarAccess.getEFAssignmentAccess().getEFAssignmentLeftAction_1_0(),
                      						current);
                      				
                    }

                    }

                    otherlv_2=(Token)match(input,22,FOLLOW_14); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_2, grammarAccess.getEFAssignmentAccess().getEqualsSignKeyword_1_1());
                      			
                    }
                    // InternalEasyWall.g:1162:4: ( (lv_right_3_0= ruleEFAssignment ) )
                    // InternalEasyWall.g:1163:5: (lv_right_3_0= ruleEFAssignment )
                    {
                    // InternalEasyWall.g:1163:5: (lv_right_3_0= ruleEFAssignment )
                    // InternalEasyWall.g:1164:6: lv_right_3_0= ruleEFAssignment
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getEFAssignmentAccess().getRightEFAssignmentParserRuleCall_1_2_0());
                      					
                    }
                    pushFollow(FOLLOW_2);
                    lv_right_3_0=ruleEFAssignment();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getEFAssignmentRule());
                      						}
                      						set(
                      							current,
                      							"right",
                      							lv_right_3_0,
                      							"org.xtext.example.easywall.EasyWall.EFAssignment");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }


                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleEFAssignment"


    // $ANTLR start "entryRuleEFOrExpression"
    // InternalEasyWall.g:1186:1: entryRuleEFOrExpression returns [EObject current=null] : iv_ruleEFOrExpression= ruleEFOrExpression EOF ;
    public final EObject entryRuleEFOrExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEFOrExpression = null;


        try {
            // InternalEasyWall.g:1186:55: (iv_ruleEFOrExpression= ruleEFOrExpression EOF )
            // InternalEasyWall.g:1187:2: iv_ruleEFOrExpression= ruleEFOrExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getEFOrExpressionRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleEFOrExpression=ruleEFOrExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleEFOrExpression; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleEFOrExpression"


    // $ANTLR start "ruleEFOrExpression"
    // InternalEasyWall.g:1193:1: ruleEFOrExpression returns [EObject current=null] : (this_EFAndExpression_0= ruleEFAndExpression ( () ruleEFOr ( (lv_right_3_0= ruleEFAndExpression ) ) )* ) ;
    public final EObject ruleEFOrExpression() throws RecognitionException {
        EObject current = null;

        EObject this_EFAndExpression_0 = null;

        EObject lv_right_3_0 = null;



        	enterRule();

        try {
            // InternalEasyWall.g:1199:2: ( (this_EFAndExpression_0= ruleEFAndExpression ( () ruleEFOr ( (lv_right_3_0= ruleEFAndExpression ) ) )* ) )
            // InternalEasyWall.g:1200:2: (this_EFAndExpression_0= ruleEFAndExpression ( () ruleEFOr ( (lv_right_3_0= ruleEFAndExpression ) ) )* )
            {
            // InternalEasyWall.g:1200:2: (this_EFAndExpression_0= ruleEFAndExpression ( () ruleEFOr ( (lv_right_3_0= ruleEFAndExpression ) ) )* )
            // InternalEasyWall.g:1201:3: this_EFAndExpression_0= ruleEFAndExpression ( () ruleEFOr ( (lv_right_3_0= ruleEFAndExpression ) ) )*
            {
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getEFOrExpressionAccess().getEFAndExpressionParserRuleCall_0());
              		
            }
            pushFollow(FOLLOW_23);
            this_EFAndExpression_0=ruleEFAndExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_EFAndExpression_0;
              			afterParserOrEnumRuleCall();
              		
            }
            // InternalEasyWall.g:1209:3: ( () ruleEFOr ( (lv_right_3_0= ruleEFAndExpression ) ) )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( ((LA18_0>=37 && LA18_0<=38)) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // InternalEasyWall.g:1210:4: () ruleEFOr ( (lv_right_3_0= ruleEFAndExpression ) )
            	    {
            	    // InternalEasyWall.g:1210:4: ()
            	    // InternalEasyWall.g:1211:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	      					current = forceCreateModelElementAndSet(
            	      						grammarAccess.getEFOrExpressionAccess().getEFOrExpressionLeftAction_1_0(),
            	      						current);
            	      				
            	    }

            	    }

            	    if ( state.backtracking==0 ) {

            	      				newCompositeNode(grammarAccess.getEFOrExpressionAccess().getEFOrParserRuleCall_1_1());
            	      			
            	    }
            	    pushFollow(FOLLOW_14);
            	    ruleEFOr();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				afterParserOrEnumRuleCall();
            	      			
            	    }
            	    // InternalEasyWall.g:1224:4: ( (lv_right_3_0= ruleEFAndExpression ) )
            	    // InternalEasyWall.g:1225:5: (lv_right_3_0= ruleEFAndExpression )
            	    {
            	    // InternalEasyWall.g:1225:5: (lv_right_3_0= ruleEFAndExpression )
            	    // InternalEasyWall.g:1226:6: lv_right_3_0= ruleEFAndExpression
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getEFOrExpressionAccess().getRightEFAndExpressionParserRuleCall_1_2_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_23);
            	    lv_right_3_0=ruleEFAndExpression();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      						if (current==null) {
            	      							current = createModelElementForParent(grammarAccess.getEFOrExpressionRule());
            	      						}
            	      						set(
            	      							current,
            	      							"right",
            	      							lv_right_3_0,
            	      							"org.xtext.example.easywall.EasyWall.EFAndExpression");
            	      						afterParserOrEnumRuleCall();
            	      					
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop18;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleEFOrExpression"


    // $ANTLR start "entryRuleEFAndExpression"
    // InternalEasyWall.g:1248:1: entryRuleEFAndExpression returns [EObject current=null] : iv_ruleEFAndExpression= ruleEFAndExpression EOF ;
    public final EObject entryRuleEFAndExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEFAndExpression = null;


        try {
            // InternalEasyWall.g:1248:56: (iv_ruleEFAndExpression= ruleEFAndExpression EOF )
            // InternalEasyWall.g:1249:2: iv_ruleEFAndExpression= ruleEFAndExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getEFAndExpressionRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleEFAndExpression=ruleEFAndExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleEFAndExpression; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleEFAndExpression"


    // $ANTLR start "ruleEFAndExpression"
    // InternalEasyWall.g:1255:1: ruleEFAndExpression returns [EObject current=null] : (this_EFEqualExpression_0= ruleEFEqualExpression ( () ruleEFAnd ( (lv_right_3_0= ruleEFEqualExpression ) ) )* ) ;
    public final EObject ruleEFAndExpression() throws RecognitionException {
        EObject current = null;

        EObject this_EFEqualExpression_0 = null;

        EObject lv_right_3_0 = null;



        	enterRule();

        try {
            // InternalEasyWall.g:1261:2: ( (this_EFEqualExpression_0= ruleEFEqualExpression ( () ruleEFAnd ( (lv_right_3_0= ruleEFEqualExpression ) ) )* ) )
            // InternalEasyWall.g:1262:2: (this_EFEqualExpression_0= ruleEFEqualExpression ( () ruleEFAnd ( (lv_right_3_0= ruleEFEqualExpression ) ) )* )
            {
            // InternalEasyWall.g:1262:2: (this_EFEqualExpression_0= ruleEFEqualExpression ( () ruleEFAnd ( (lv_right_3_0= ruleEFEqualExpression ) ) )* )
            // InternalEasyWall.g:1263:3: this_EFEqualExpression_0= ruleEFEqualExpression ( () ruleEFAnd ( (lv_right_3_0= ruleEFEqualExpression ) ) )*
            {
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getEFAndExpressionAccess().getEFEqualExpressionParserRuleCall_0());
              		
            }
            pushFollow(FOLLOW_24);
            this_EFEqualExpression_0=ruleEFEqualExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_EFEqualExpression_0;
              			afterParserOrEnumRuleCall();
              		
            }
            // InternalEasyWall.g:1271:3: ( () ruleEFAnd ( (lv_right_3_0= ruleEFEqualExpression ) ) )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( ((LA19_0>=39 && LA19_0<=40)) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // InternalEasyWall.g:1272:4: () ruleEFAnd ( (lv_right_3_0= ruleEFEqualExpression ) )
            	    {
            	    // InternalEasyWall.g:1272:4: ()
            	    // InternalEasyWall.g:1273:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	      					current = forceCreateModelElementAndSet(
            	      						grammarAccess.getEFAndExpressionAccess().getEFAndExpressionLeftAction_1_0(),
            	      						current);
            	      				
            	    }

            	    }

            	    if ( state.backtracking==0 ) {

            	      				newCompositeNode(grammarAccess.getEFAndExpressionAccess().getEFAndParserRuleCall_1_1());
            	      			
            	    }
            	    pushFollow(FOLLOW_14);
            	    ruleEFAnd();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				afterParserOrEnumRuleCall();
            	      			
            	    }
            	    // InternalEasyWall.g:1286:4: ( (lv_right_3_0= ruleEFEqualExpression ) )
            	    // InternalEasyWall.g:1287:5: (lv_right_3_0= ruleEFEqualExpression )
            	    {
            	    // InternalEasyWall.g:1287:5: (lv_right_3_0= ruleEFEqualExpression )
            	    // InternalEasyWall.g:1288:6: lv_right_3_0= ruleEFEqualExpression
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getEFAndExpressionAccess().getRightEFEqualExpressionParserRuleCall_1_2_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_24);
            	    lv_right_3_0=ruleEFEqualExpression();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      						if (current==null) {
            	      							current = createModelElementForParent(grammarAccess.getEFAndExpressionRule());
            	      						}
            	      						set(
            	      							current,
            	      							"right",
            	      							lv_right_3_0,
            	      							"org.xtext.example.easywall.EasyWall.EFEqualExpression");
            	      						afterParserOrEnumRuleCall();
            	      					
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop19;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleEFAndExpression"


    // $ANTLR start "entryRuleEFEqualExpression"
    // InternalEasyWall.g:1310:1: entryRuleEFEqualExpression returns [EObject current=null] : iv_ruleEFEqualExpression= ruleEFEqualExpression EOF ;
    public final EObject entryRuleEFEqualExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEFEqualExpression = null;


        try {
            // InternalEasyWall.g:1310:58: (iv_ruleEFEqualExpression= ruleEFEqualExpression EOF )
            // InternalEasyWall.g:1311:2: iv_ruleEFEqualExpression= ruleEFEqualExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getEFEqualExpressionRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleEFEqualExpression=ruleEFEqualExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleEFEqualExpression; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleEFEqualExpression"


    // $ANTLR start "ruleEFEqualExpression"
    // InternalEasyWall.g:1317:1: ruleEFEqualExpression returns [EObject current=null] : (this_EFRelExpression_0= ruleEFRelExpression ( () ruleEFEqualOperators ( (lv_right_3_0= ruleEFRelExpression ) ) )* ) ;
    public final EObject ruleEFEqualExpression() throws RecognitionException {
        EObject current = null;

        EObject this_EFRelExpression_0 = null;

        EObject lv_right_3_0 = null;



        	enterRule();

        try {
            // InternalEasyWall.g:1323:2: ( (this_EFRelExpression_0= ruleEFRelExpression ( () ruleEFEqualOperators ( (lv_right_3_0= ruleEFRelExpression ) ) )* ) )
            // InternalEasyWall.g:1324:2: (this_EFRelExpression_0= ruleEFRelExpression ( () ruleEFEqualOperators ( (lv_right_3_0= ruleEFRelExpression ) ) )* )
            {
            // InternalEasyWall.g:1324:2: (this_EFRelExpression_0= ruleEFRelExpression ( () ruleEFEqualOperators ( (lv_right_3_0= ruleEFRelExpression ) ) )* )
            // InternalEasyWall.g:1325:3: this_EFRelExpression_0= ruleEFRelExpression ( () ruleEFEqualOperators ( (lv_right_3_0= ruleEFRelExpression ) ) )*
            {
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getEFEqualExpressionAccess().getEFRelExpressionParserRuleCall_0());
              		
            }
            pushFollow(FOLLOW_25);
            this_EFRelExpression_0=ruleEFRelExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_EFRelExpression_0;
              			afterParserOrEnumRuleCall();
              		
            }
            // InternalEasyWall.g:1333:3: ( () ruleEFEqualOperators ( (lv_right_3_0= ruleEFRelExpression ) ) )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( ((LA20_0>=43 && LA20_0<=45)) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // InternalEasyWall.g:1334:4: () ruleEFEqualOperators ( (lv_right_3_0= ruleEFRelExpression ) )
            	    {
            	    // InternalEasyWall.g:1334:4: ()
            	    // InternalEasyWall.g:1335:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	      					current = forceCreateModelElementAndSet(
            	      						grammarAccess.getEFEqualExpressionAccess().getEFEqualExpressionLeftAction_1_0(),
            	      						current);
            	      				
            	    }

            	    }

            	    if ( state.backtracking==0 ) {

            	      				newCompositeNode(grammarAccess.getEFEqualExpressionAccess().getEFEqualOperatorsParserRuleCall_1_1());
            	      			
            	    }
            	    pushFollow(FOLLOW_14);
            	    ruleEFEqualOperators();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				afterParserOrEnumRuleCall();
            	      			
            	    }
            	    // InternalEasyWall.g:1348:4: ( (lv_right_3_0= ruleEFRelExpression ) )
            	    // InternalEasyWall.g:1349:5: (lv_right_3_0= ruleEFRelExpression )
            	    {
            	    // InternalEasyWall.g:1349:5: (lv_right_3_0= ruleEFRelExpression )
            	    // InternalEasyWall.g:1350:6: lv_right_3_0= ruleEFRelExpression
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getEFEqualExpressionAccess().getRightEFRelExpressionParserRuleCall_1_2_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_25);
            	    lv_right_3_0=ruleEFRelExpression();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      						if (current==null) {
            	      							current = createModelElementForParent(grammarAccess.getEFEqualExpressionRule());
            	      						}
            	      						set(
            	      							current,
            	      							"right",
            	      							lv_right_3_0,
            	      							"org.xtext.example.easywall.EasyWall.EFRelExpression");
            	      						afterParserOrEnumRuleCall();
            	      					
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop20;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleEFEqualExpression"


    // $ANTLR start "entryRuleEFRelExpression"
    // InternalEasyWall.g:1372:1: entryRuleEFRelExpression returns [EObject current=null] : iv_ruleEFRelExpression= ruleEFRelExpression EOF ;
    public final EObject entryRuleEFRelExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEFRelExpression = null;


        try {
            // InternalEasyWall.g:1372:56: (iv_ruleEFRelExpression= ruleEFRelExpression EOF )
            // InternalEasyWall.g:1373:2: iv_ruleEFRelExpression= ruleEFRelExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getEFRelExpressionRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleEFRelExpression=ruleEFRelExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleEFRelExpression; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleEFRelExpression"


    // $ANTLR start "ruleEFRelExpression"
    // InternalEasyWall.g:1379:1: ruleEFRelExpression returns [EObject current=null] : (this_EFUnaryExpression_0= ruleEFUnaryExpression ( () ruleEFRelOperators ( (lv_right_3_0= ruleEFUnaryExpression ) ) )* ) ;
    public final EObject ruleEFRelExpression() throws RecognitionException {
        EObject current = null;

        EObject this_EFUnaryExpression_0 = null;

        EObject lv_right_3_0 = null;



        	enterRule();

        try {
            // InternalEasyWall.g:1385:2: ( (this_EFUnaryExpression_0= ruleEFUnaryExpression ( () ruleEFRelOperators ( (lv_right_3_0= ruleEFUnaryExpression ) ) )* ) )
            // InternalEasyWall.g:1386:2: (this_EFUnaryExpression_0= ruleEFUnaryExpression ( () ruleEFRelOperators ( (lv_right_3_0= ruleEFUnaryExpression ) ) )* )
            {
            // InternalEasyWall.g:1386:2: (this_EFUnaryExpression_0= ruleEFUnaryExpression ( () ruleEFRelOperators ( (lv_right_3_0= ruleEFUnaryExpression ) ) )* )
            // InternalEasyWall.g:1387:3: this_EFUnaryExpression_0= ruleEFUnaryExpression ( () ruleEFRelOperators ( (lv_right_3_0= ruleEFUnaryExpression ) ) )*
            {
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getEFRelExpressionAccess().getEFUnaryExpressionParserRuleCall_0());
              		
            }
            pushFollow(FOLLOW_26);
            this_EFUnaryExpression_0=ruleEFUnaryExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_EFUnaryExpression_0;
              			afterParserOrEnumRuleCall();
              		
            }
            // InternalEasyWall.g:1395:3: ( () ruleEFRelOperators ( (lv_right_3_0= ruleEFUnaryExpression ) ) )*
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( ((LA21_0>=46 && LA21_0<=49)) ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // InternalEasyWall.g:1396:4: () ruleEFRelOperators ( (lv_right_3_0= ruleEFUnaryExpression ) )
            	    {
            	    // InternalEasyWall.g:1396:4: ()
            	    // InternalEasyWall.g:1397:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	      					current = forceCreateModelElementAndSet(
            	      						grammarAccess.getEFRelExpressionAccess().getEFRelExpressionLeftAction_1_0(),
            	      						current);
            	      				
            	    }

            	    }

            	    if ( state.backtracking==0 ) {

            	      				newCompositeNode(grammarAccess.getEFRelExpressionAccess().getEFRelOperatorsParserRuleCall_1_1());
            	      			
            	    }
            	    pushFollow(FOLLOW_14);
            	    ruleEFRelOperators();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				afterParserOrEnumRuleCall();
            	      			
            	    }
            	    // InternalEasyWall.g:1410:4: ( (lv_right_3_0= ruleEFUnaryExpression ) )
            	    // InternalEasyWall.g:1411:5: (lv_right_3_0= ruleEFUnaryExpression )
            	    {
            	    // InternalEasyWall.g:1411:5: (lv_right_3_0= ruleEFUnaryExpression )
            	    // InternalEasyWall.g:1412:6: lv_right_3_0= ruleEFUnaryExpression
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getEFRelExpressionAccess().getRightEFUnaryExpressionParserRuleCall_1_2_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_26);
            	    lv_right_3_0=ruleEFUnaryExpression();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      						if (current==null) {
            	      							current = createModelElementForParent(grammarAccess.getEFRelExpressionRule());
            	      						}
            	      						set(
            	      							current,
            	      							"right",
            	      							lv_right_3_0,
            	      							"org.xtext.example.easywall.EasyWall.EFUnaryExpression");
            	      						afterParserOrEnumRuleCall();
            	      					
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop21;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleEFRelExpression"


    // $ANTLR start "entryRuleEFUnaryExpression"
    // InternalEasyWall.g:1434:1: entryRuleEFUnaryExpression returns [EObject current=null] : iv_ruleEFUnaryExpression= ruleEFUnaryExpression EOF ;
    public final EObject entryRuleEFUnaryExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEFUnaryExpression = null;


        try {
            // InternalEasyWall.g:1434:58: (iv_ruleEFUnaryExpression= ruleEFUnaryExpression EOF )
            // InternalEasyWall.g:1435:2: iv_ruleEFUnaryExpression= ruleEFUnaryExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getEFUnaryExpressionRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleEFUnaryExpression=ruleEFUnaryExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleEFUnaryExpression; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleEFUnaryExpression"


    // $ANTLR start "ruleEFUnaryExpression"
    // InternalEasyWall.g:1441:1: ruleEFUnaryExpression returns [EObject current=null] : ( ( () ruleEFNot ( (lv_expression_2_0= ruleEFUnaryExpression ) ) ) | this_EFPrimaryExpression_3= ruleEFPrimaryExpression ) ;
    public final EObject ruleEFUnaryExpression() throws RecognitionException {
        EObject current = null;

        EObject lv_expression_2_0 = null;

        EObject this_EFPrimaryExpression_3 = null;



        	enterRule();

        try {
            // InternalEasyWall.g:1447:2: ( ( ( () ruleEFNot ( (lv_expression_2_0= ruleEFUnaryExpression ) ) ) | this_EFPrimaryExpression_3= ruleEFPrimaryExpression ) )
            // InternalEasyWall.g:1448:2: ( ( () ruleEFNot ( (lv_expression_2_0= ruleEFUnaryExpression ) ) ) | this_EFPrimaryExpression_3= ruleEFPrimaryExpression )
            {
            // InternalEasyWall.g:1448:2: ( ( () ruleEFNot ( (lv_expression_2_0= ruleEFUnaryExpression ) ) ) | this_EFPrimaryExpression_3= ruleEFPrimaryExpression )
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( ((LA22_0>=41 && LA22_0<=42)) ) {
                alt22=1;
            }
            else if ( ((LA22_0>=RULE_ID && LA22_0<=RULE_INT)||LA22_0==24||(LA22_0>=30 && LA22_0<=34)||(LA22_0>=50 && LA22_0<=56)||(LA22_0>=60 && LA22_0<=84)) ) {
                alt22=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 22, 0, input);

                throw nvae;
            }
            switch (alt22) {
                case 1 :
                    // InternalEasyWall.g:1449:3: ( () ruleEFNot ( (lv_expression_2_0= ruleEFUnaryExpression ) ) )
                    {
                    // InternalEasyWall.g:1449:3: ( () ruleEFNot ( (lv_expression_2_0= ruleEFUnaryExpression ) ) )
                    // InternalEasyWall.g:1450:4: () ruleEFNot ( (lv_expression_2_0= ruleEFUnaryExpression ) )
                    {
                    // InternalEasyWall.g:1450:4: ()
                    // InternalEasyWall.g:1451:5: 
                    {
                    if ( state.backtracking==0 ) {

                      					current = forceCreateModelElement(
                      						grammarAccess.getEFUnaryExpressionAccess().getEFNotExpressionAction_0_0(),
                      						current);
                      				
                    }

                    }

                    if ( state.backtracking==0 ) {

                      				newCompositeNode(grammarAccess.getEFUnaryExpressionAccess().getEFNotParserRuleCall_0_1());
                      			
                    }
                    pushFollow(FOLLOW_14);
                    ruleEFNot();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				afterParserOrEnumRuleCall();
                      			
                    }
                    // InternalEasyWall.g:1464:4: ( (lv_expression_2_0= ruleEFUnaryExpression ) )
                    // InternalEasyWall.g:1465:5: (lv_expression_2_0= ruleEFUnaryExpression )
                    {
                    // InternalEasyWall.g:1465:5: (lv_expression_2_0= ruleEFUnaryExpression )
                    // InternalEasyWall.g:1466:6: lv_expression_2_0= ruleEFUnaryExpression
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getEFUnaryExpressionAccess().getExpressionEFUnaryExpressionParserRuleCall_0_2_0());
                      					
                    }
                    pushFollow(FOLLOW_2);
                    lv_expression_2_0=ruleEFUnaryExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getEFUnaryExpressionRule());
                      						}
                      						set(
                      							current,
                      							"expression",
                      							lv_expression_2_0,
                      							"org.xtext.example.easywall.EasyWall.EFUnaryExpression");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalEasyWall.g:1485:3: this_EFPrimaryExpression_3= ruleEFPrimaryExpression
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getEFUnaryExpressionAccess().getEFPrimaryExpressionParserRuleCall_1());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_EFPrimaryExpression_3=ruleEFPrimaryExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_EFPrimaryExpression_3;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleEFUnaryExpression"


    // $ANTLR start "entryRuleEFPrimaryExpression"
    // InternalEasyWall.g:1497:1: entryRuleEFPrimaryExpression returns [EObject current=null] : iv_ruleEFPrimaryExpression= ruleEFPrimaryExpression EOF ;
    public final EObject entryRuleEFPrimaryExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEFPrimaryExpression = null;


        try {
            // InternalEasyWall.g:1497:60: (iv_ruleEFPrimaryExpression= ruleEFPrimaryExpression EOF )
            // InternalEasyWall.g:1498:2: iv_ruleEFPrimaryExpression= ruleEFPrimaryExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getEFPrimaryExpressionRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleEFPrimaryExpression=ruleEFPrimaryExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleEFPrimaryExpression; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleEFPrimaryExpression"


    // $ANTLR start "ruleEFPrimaryExpression"
    // InternalEasyWall.g:1504:1: ruleEFPrimaryExpression returns [EObject current=null] : ( ( () ( (lv_value_1_0= RULE_STRING ) ) ) | ( () ( (lv_value_3_0= RULE_INT ) ) ) | ( () ( ( (lv_value_5_1= 'true' | lv_value_5_2= 'false' ) ) ) ) | ( () ( (lv_type_7_0= ruleEFNetworkNativeType ) ) ) | ( () ( (lv_direction_9_0= ruleEFDirectionNativeType ) ) ) | ( () ( (lv_protocol_11_0= ruleNETWORKLAYERPROTOCOL ) ) ) | ( () ( (lv_protocol_13_0= ruleTRANSPORTLAYERPROTOCOL ) ) ) | ( () ( (lv_protocol_15_0= ruleAPPLICATIONLAYERPROTOCOL ) ) ) | ( () otherlv_17= 'this' ) | ( () otherlv_19= 'super' ) | ( () otherlv_21= 'new' ( ( ruleQualifiedName ) ) otherlv_23= '(' otherlv_24= ')' ) | ( () otherlv_26= '(' ( (lv_expression_27_0= ruleEFExpression ) ) otherlv_28= ')' ) | ( () ( (lv_functionName_30_0= ruleQualifiedName ) ) otherlv_31= '(' ( ( (lv_args_32_0= ruleEFExpression ) ) (otherlv_33= ',' ( (lv_args_34_0= ruleEFExpression ) ) )* )? otherlv_35= ')' ) | ( () ( (lv_symbol_37_0= ruleQualifiedName ) ) ) ) ;
    public final EObject ruleEFPrimaryExpression() throws RecognitionException {
        EObject current = null;

        Token lv_value_1_0=null;
        Token lv_value_3_0=null;
        Token lv_value_5_1=null;
        Token lv_value_5_2=null;
        Token otherlv_17=null;
        Token otherlv_19=null;
        Token otherlv_21=null;
        Token otherlv_23=null;
        Token otherlv_24=null;
        Token otherlv_26=null;
        Token otherlv_28=null;
        Token otherlv_31=null;
        Token otherlv_33=null;
        Token otherlv_35=null;
        Enumerator lv_type_7_0 = null;

        Enumerator lv_direction_9_0 = null;

        Enumerator lv_protocol_11_0 = null;

        Enumerator lv_protocol_13_0 = null;

        Enumerator lv_protocol_15_0 = null;

        EObject lv_expression_27_0 = null;

        AntlrDatatypeRuleToken lv_functionName_30_0 = null;

        EObject lv_args_32_0 = null;

        EObject lv_args_34_0 = null;

        AntlrDatatypeRuleToken lv_symbol_37_0 = null;



        	enterRule();

        try {
            // InternalEasyWall.g:1510:2: ( ( ( () ( (lv_value_1_0= RULE_STRING ) ) ) | ( () ( (lv_value_3_0= RULE_INT ) ) ) | ( () ( ( (lv_value_5_1= 'true' | lv_value_5_2= 'false' ) ) ) ) | ( () ( (lv_type_7_0= ruleEFNetworkNativeType ) ) ) | ( () ( (lv_direction_9_0= ruleEFDirectionNativeType ) ) ) | ( () ( (lv_protocol_11_0= ruleNETWORKLAYERPROTOCOL ) ) ) | ( () ( (lv_protocol_13_0= ruleTRANSPORTLAYERPROTOCOL ) ) ) | ( () ( (lv_protocol_15_0= ruleAPPLICATIONLAYERPROTOCOL ) ) ) | ( () otherlv_17= 'this' ) | ( () otherlv_19= 'super' ) | ( () otherlv_21= 'new' ( ( ruleQualifiedName ) ) otherlv_23= '(' otherlv_24= ')' ) | ( () otherlv_26= '(' ( (lv_expression_27_0= ruleEFExpression ) ) otherlv_28= ')' ) | ( () ( (lv_functionName_30_0= ruleQualifiedName ) ) otherlv_31= '(' ( ( (lv_args_32_0= ruleEFExpression ) ) (otherlv_33= ',' ( (lv_args_34_0= ruleEFExpression ) ) )* )? otherlv_35= ')' ) | ( () ( (lv_symbol_37_0= ruleQualifiedName ) ) ) ) )
            // InternalEasyWall.g:1511:2: ( ( () ( (lv_value_1_0= RULE_STRING ) ) ) | ( () ( (lv_value_3_0= RULE_INT ) ) ) | ( () ( ( (lv_value_5_1= 'true' | lv_value_5_2= 'false' ) ) ) ) | ( () ( (lv_type_7_0= ruleEFNetworkNativeType ) ) ) | ( () ( (lv_direction_9_0= ruleEFDirectionNativeType ) ) ) | ( () ( (lv_protocol_11_0= ruleNETWORKLAYERPROTOCOL ) ) ) | ( () ( (lv_protocol_13_0= ruleTRANSPORTLAYERPROTOCOL ) ) ) | ( () ( (lv_protocol_15_0= ruleAPPLICATIONLAYERPROTOCOL ) ) ) | ( () otherlv_17= 'this' ) | ( () otherlv_19= 'super' ) | ( () otherlv_21= 'new' ( ( ruleQualifiedName ) ) otherlv_23= '(' otherlv_24= ')' ) | ( () otherlv_26= '(' ( (lv_expression_27_0= ruleEFExpression ) ) otherlv_28= ')' ) | ( () ( (lv_functionName_30_0= ruleQualifiedName ) ) otherlv_31= '(' ( ( (lv_args_32_0= ruleEFExpression ) ) (otherlv_33= ',' ( (lv_args_34_0= ruleEFExpression ) ) )* )? otherlv_35= ')' ) | ( () ( (lv_symbol_37_0= ruleQualifiedName ) ) ) )
            {
            // InternalEasyWall.g:1511:2: ( ( () ( (lv_value_1_0= RULE_STRING ) ) ) | ( () ( (lv_value_3_0= RULE_INT ) ) ) | ( () ( ( (lv_value_5_1= 'true' | lv_value_5_2= 'false' ) ) ) ) | ( () ( (lv_type_7_0= ruleEFNetworkNativeType ) ) ) | ( () ( (lv_direction_9_0= ruleEFDirectionNativeType ) ) ) | ( () ( (lv_protocol_11_0= ruleNETWORKLAYERPROTOCOL ) ) ) | ( () ( (lv_protocol_13_0= ruleTRANSPORTLAYERPROTOCOL ) ) ) | ( () ( (lv_protocol_15_0= ruleAPPLICATIONLAYERPROTOCOL ) ) ) | ( () otherlv_17= 'this' ) | ( () otherlv_19= 'super' ) | ( () otherlv_21= 'new' ( ( ruleQualifiedName ) ) otherlv_23= '(' otherlv_24= ')' ) | ( () otherlv_26= '(' ( (lv_expression_27_0= ruleEFExpression ) ) otherlv_28= ')' ) | ( () ( (lv_functionName_30_0= ruleQualifiedName ) ) otherlv_31= '(' ( ( (lv_args_32_0= ruleEFExpression ) ) (otherlv_33= ',' ( (lv_args_34_0= ruleEFExpression ) ) )* )? otherlv_35= ')' ) | ( () ( (lv_symbol_37_0= ruleQualifiedName ) ) ) )
            int alt26=14;
            alt26 = dfa26.predict(input);
            switch (alt26) {
                case 1 :
                    // InternalEasyWall.g:1512:3: ( () ( (lv_value_1_0= RULE_STRING ) ) )
                    {
                    // InternalEasyWall.g:1512:3: ( () ( (lv_value_1_0= RULE_STRING ) ) )
                    // InternalEasyWall.g:1513:4: () ( (lv_value_1_0= RULE_STRING ) )
                    {
                    // InternalEasyWall.g:1513:4: ()
                    // InternalEasyWall.g:1514:5: 
                    {
                    if ( state.backtracking==0 ) {

                      					current = forceCreateModelElement(
                      						grammarAccess.getEFPrimaryExpressionAccess().getEFStringConstantAction_0_0(),
                      						current);
                      				
                    }

                    }

                    // InternalEasyWall.g:1520:4: ( (lv_value_1_0= RULE_STRING ) )
                    // InternalEasyWall.g:1521:5: (lv_value_1_0= RULE_STRING )
                    {
                    // InternalEasyWall.g:1521:5: (lv_value_1_0= RULE_STRING )
                    // InternalEasyWall.g:1522:6: lv_value_1_0= RULE_STRING
                    {
                    lv_value_1_0=(Token)match(input,RULE_STRING,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(lv_value_1_0, grammarAccess.getEFPrimaryExpressionAccess().getValueSTRINGTerminalRuleCall_0_1_0());
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getEFPrimaryExpressionRule());
                      						}
                      						setWithLastConsumed(
                      							current,
                      							"value",
                      							lv_value_1_0,
                      							"org.eclipse.xtext.common.Terminals.STRING");
                      					
                    }

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalEasyWall.g:1540:3: ( () ( (lv_value_3_0= RULE_INT ) ) )
                    {
                    // InternalEasyWall.g:1540:3: ( () ( (lv_value_3_0= RULE_INT ) ) )
                    // InternalEasyWall.g:1541:4: () ( (lv_value_3_0= RULE_INT ) )
                    {
                    // InternalEasyWall.g:1541:4: ()
                    // InternalEasyWall.g:1542:5: 
                    {
                    if ( state.backtracking==0 ) {

                      					current = forceCreateModelElement(
                      						grammarAccess.getEFPrimaryExpressionAccess().getEFIntConstantAction_1_0(),
                      						current);
                      				
                    }

                    }

                    // InternalEasyWall.g:1548:4: ( (lv_value_3_0= RULE_INT ) )
                    // InternalEasyWall.g:1549:5: (lv_value_3_0= RULE_INT )
                    {
                    // InternalEasyWall.g:1549:5: (lv_value_3_0= RULE_INT )
                    // InternalEasyWall.g:1550:6: lv_value_3_0= RULE_INT
                    {
                    lv_value_3_0=(Token)match(input,RULE_INT,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(lv_value_3_0, grammarAccess.getEFPrimaryExpressionAccess().getValueINTTerminalRuleCall_1_1_0());
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getEFPrimaryExpressionRule());
                      						}
                      						setWithLastConsumed(
                      							current,
                      							"value",
                      							lv_value_3_0,
                      							"org.eclipse.xtext.common.Terminals.INT");
                      					
                    }

                    }


                    }


                    }


                    }
                    break;
                case 3 :
                    // InternalEasyWall.g:1568:3: ( () ( ( (lv_value_5_1= 'true' | lv_value_5_2= 'false' ) ) ) )
                    {
                    // InternalEasyWall.g:1568:3: ( () ( ( (lv_value_5_1= 'true' | lv_value_5_2= 'false' ) ) ) )
                    // InternalEasyWall.g:1569:4: () ( ( (lv_value_5_1= 'true' | lv_value_5_2= 'false' ) ) )
                    {
                    // InternalEasyWall.g:1569:4: ()
                    // InternalEasyWall.g:1570:5: 
                    {
                    if ( state.backtracking==0 ) {

                      					current = forceCreateModelElement(
                      						grammarAccess.getEFPrimaryExpressionAccess().getEFBoolConstantAction_2_0(),
                      						current);
                      				
                    }

                    }

                    // InternalEasyWall.g:1576:4: ( ( (lv_value_5_1= 'true' | lv_value_5_2= 'false' ) ) )
                    // InternalEasyWall.g:1577:5: ( (lv_value_5_1= 'true' | lv_value_5_2= 'false' ) )
                    {
                    // InternalEasyWall.g:1577:5: ( (lv_value_5_1= 'true' | lv_value_5_2= 'false' ) )
                    // InternalEasyWall.g:1578:6: (lv_value_5_1= 'true' | lv_value_5_2= 'false' )
                    {
                    // InternalEasyWall.g:1578:6: (lv_value_5_1= 'true' | lv_value_5_2= 'false' )
                    int alt23=2;
                    int LA23_0 = input.LA(1);

                    if ( (LA23_0==30) ) {
                        alt23=1;
                    }
                    else if ( (LA23_0==31) ) {
                        alt23=2;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 23, 0, input);

                        throw nvae;
                    }
                    switch (alt23) {
                        case 1 :
                            // InternalEasyWall.g:1579:7: lv_value_5_1= 'true'
                            {
                            lv_value_5_1=(Token)match(input,30,FOLLOW_2); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              							newLeafNode(lv_value_5_1, grammarAccess.getEFPrimaryExpressionAccess().getValueTrueKeyword_2_1_0_0());
                              						
                            }
                            if ( state.backtracking==0 ) {

                              							if (current==null) {
                              								current = createModelElement(grammarAccess.getEFPrimaryExpressionRule());
                              							}
                              							setWithLastConsumed(current, "value", lv_value_5_1, null);
                              						
                            }

                            }
                            break;
                        case 2 :
                            // InternalEasyWall.g:1590:7: lv_value_5_2= 'false'
                            {
                            lv_value_5_2=(Token)match(input,31,FOLLOW_2); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              							newLeafNode(lv_value_5_2, grammarAccess.getEFPrimaryExpressionAccess().getValueFalseKeyword_2_1_0_1());
                              						
                            }
                            if ( state.backtracking==0 ) {

                              							if (current==null) {
                              								current = createModelElement(grammarAccess.getEFPrimaryExpressionRule());
                              							}
                              							setWithLastConsumed(current, "value", lv_value_5_2, null);
                              						
                            }

                            }
                            break;

                    }


                    }


                    }


                    }


                    }
                    break;
                case 4 :
                    // InternalEasyWall.g:1605:3: ( () ( (lv_type_7_0= ruleEFNetworkNativeType ) ) )
                    {
                    // InternalEasyWall.g:1605:3: ( () ( (lv_type_7_0= ruleEFNetworkNativeType ) ) )
                    // InternalEasyWall.g:1606:4: () ( (lv_type_7_0= ruleEFNetworkNativeType ) )
                    {
                    // InternalEasyWall.g:1606:4: ()
                    // InternalEasyWall.g:1607:5: 
                    {
                    if ( state.backtracking==0 ) {

                      					current = forceCreateModelElement(
                      						grammarAccess.getEFPrimaryExpressionAccess().getEFPrimitiveTypeAction_3_0(),
                      						current);
                      				
                    }

                    }

                    // InternalEasyWall.g:1613:4: ( (lv_type_7_0= ruleEFNetworkNativeType ) )
                    // InternalEasyWall.g:1614:5: (lv_type_7_0= ruleEFNetworkNativeType )
                    {
                    // InternalEasyWall.g:1614:5: (lv_type_7_0= ruleEFNetworkNativeType )
                    // InternalEasyWall.g:1615:6: lv_type_7_0= ruleEFNetworkNativeType
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getEFPrimaryExpressionAccess().getTypeEFNetworkNativeTypeEnumRuleCall_3_1_0());
                      					
                    }
                    pushFollow(FOLLOW_2);
                    lv_type_7_0=ruleEFNetworkNativeType();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getEFPrimaryExpressionRule());
                      						}
                      						set(
                      							current,
                      							"type",
                      							lv_type_7_0,
                      							"org.xtext.example.easywall.EasyWall.EFNetworkNativeType");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }


                    }


                    }
                    break;
                case 5 :
                    // InternalEasyWall.g:1634:3: ( () ( (lv_direction_9_0= ruleEFDirectionNativeType ) ) )
                    {
                    // InternalEasyWall.g:1634:3: ( () ( (lv_direction_9_0= ruleEFDirectionNativeType ) ) )
                    // InternalEasyWall.g:1635:4: () ( (lv_direction_9_0= ruleEFDirectionNativeType ) )
                    {
                    // InternalEasyWall.g:1635:4: ()
                    // InternalEasyWall.g:1636:5: 
                    {
                    if ( state.backtracking==0 ) {

                      					current = forceCreateModelElement(
                      						grammarAccess.getEFPrimaryExpressionAccess().getEFDirectionConstantAction_4_0(),
                      						current);
                      				
                    }

                    }

                    // InternalEasyWall.g:1642:4: ( (lv_direction_9_0= ruleEFDirectionNativeType ) )
                    // InternalEasyWall.g:1643:5: (lv_direction_9_0= ruleEFDirectionNativeType )
                    {
                    // InternalEasyWall.g:1643:5: (lv_direction_9_0= ruleEFDirectionNativeType )
                    // InternalEasyWall.g:1644:6: lv_direction_9_0= ruleEFDirectionNativeType
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getEFPrimaryExpressionAccess().getDirectionEFDirectionNativeTypeEnumRuleCall_4_1_0());
                      					
                    }
                    pushFollow(FOLLOW_2);
                    lv_direction_9_0=ruleEFDirectionNativeType();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getEFPrimaryExpressionRule());
                      						}
                      						set(
                      							current,
                      							"direction",
                      							lv_direction_9_0,
                      							"org.xtext.example.easywall.EasyWall.EFDirectionNativeType");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }


                    }


                    }
                    break;
                case 6 :
                    // InternalEasyWall.g:1663:3: ( () ( (lv_protocol_11_0= ruleNETWORKLAYERPROTOCOL ) ) )
                    {
                    // InternalEasyWall.g:1663:3: ( () ( (lv_protocol_11_0= ruleNETWORKLAYERPROTOCOL ) ) )
                    // InternalEasyWall.g:1664:4: () ( (lv_protocol_11_0= ruleNETWORKLAYERPROTOCOL ) )
                    {
                    // InternalEasyWall.g:1664:4: ()
                    // InternalEasyWall.g:1665:5: 
                    {
                    if ( state.backtracking==0 ) {

                      					current = forceCreateModelElement(
                      						grammarAccess.getEFPrimaryExpressionAccess().getEFNetworkProtocolConstantAction_5_0(),
                      						current);
                      				
                    }

                    }

                    // InternalEasyWall.g:1671:4: ( (lv_protocol_11_0= ruleNETWORKLAYERPROTOCOL ) )
                    // InternalEasyWall.g:1672:5: (lv_protocol_11_0= ruleNETWORKLAYERPROTOCOL )
                    {
                    // InternalEasyWall.g:1672:5: (lv_protocol_11_0= ruleNETWORKLAYERPROTOCOL )
                    // InternalEasyWall.g:1673:6: lv_protocol_11_0= ruleNETWORKLAYERPROTOCOL
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getEFPrimaryExpressionAccess().getProtocolNETWORKLAYERPROTOCOLEnumRuleCall_5_1_0());
                      					
                    }
                    pushFollow(FOLLOW_2);
                    lv_protocol_11_0=ruleNETWORKLAYERPROTOCOL();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getEFPrimaryExpressionRule());
                      						}
                      						set(
                      							current,
                      							"protocol",
                      							lv_protocol_11_0,
                      							"org.xtext.example.easywall.EasyWall.NETWORKLAYERPROTOCOL");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }


                    }


                    }
                    break;
                case 7 :
                    // InternalEasyWall.g:1692:3: ( () ( (lv_protocol_13_0= ruleTRANSPORTLAYERPROTOCOL ) ) )
                    {
                    // InternalEasyWall.g:1692:3: ( () ( (lv_protocol_13_0= ruleTRANSPORTLAYERPROTOCOL ) ) )
                    // InternalEasyWall.g:1693:4: () ( (lv_protocol_13_0= ruleTRANSPORTLAYERPROTOCOL ) )
                    {
                    // InternalEasyWall.g:1693:4: ()
                    // InternalEasyWall.g:1694:5: 
                    {
                    if ( state.backtracking==0 ) {

                      					current = forceCreateModelElement(
                      						grammarAccess.getEFPrimaryExpressionAccess().getEFTransportProtocolConstantAction_6_0(),
                      						current);
                      				
                    }

                    }

                    // InternalEasyWall.g:1700:4: ( (lv_protocol_13_0= ruleTRANSPORTLAYERPROTOCOL ) )
                    // InternalEasyWall.g:1701:5: (lv_protocol_13_0= ruleTRANSPORTLAYERPROTOCOL )
                    {
                    // InternalEasyWall.g:1701:5: (lv_protocol_13_0= ruleTRANSPORTLAYERPROTOCOL )
                    // InternalEasyWall.g:1702:6: lv_protocol_13_0= ruleTRANSPORTLAYERPROTOCOL
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getEFPrimaryExpressionAccess().getProtocolTRANSPORTLAYERPROTOCOLEnumRuleCall_6_1_0());
                      					
                    }
                    pushFollow(FOLLOW_2);
                    lv_protocol_13_0=ruleTRANSPORTLAYERPROTOCOL();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getEFPrimaryExpressionRule());
                      						}
                      						set(
                      							current,
                      							"protocol",
                      							lv_protocol_13_0,
                      							"org.xtext.example.easywall.EasyWall.TRANSPORTLAYERPROTOCOL");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }


                    }


                    }
                    break;
                case 8 :
                    // InternalEasyWall.g:1721:3: ( () ( (lv_protocol_15_0= ruleAPPLICATIONLAYERPROTOCOL ) ) )
                    {
                    // InternalEasyWall.g:1721:3: ( () ( (lv_protocol_15_0= ruleAPPLICATIONLAYERPROTOCOL ) ) )
                    // InternalEasyWall.g:1722:4: () ( (lv_protocol_15_0= ruleAPPLICATIONLAYERPROTOCOL ) )
                    {
                    // InternalEasyWall.g:1722:4: ()
                    // InternalEasyWall.g:1723:5: 
                    {
                    if ( state.backtracking==0 ) {

                      					current = forceCreateModelElement(
                      						grammarAccess.getEFPrimaryExpressionAccess().getEFApplicationProtocolConstantAction_7_0(),
                      						current);
                      				
                    }

                    }

                    // InternalEasyWall.g:1729:4: ( (lv_protocol_15_0= ruleAPPLICATIONLAYERPROTOCOL ) )
                    // InternalEasyWall.g:1730:5: (lv_protocol_15_0= ruleAPPLICATIONLAYERPROTOCOL )
                    {
                    // InternalEasyWall.g:1730:5: (lv_protocol_15_0= ruleAPPLICATIONLAYERPROTOCOL )
                    // InternalEasyWall.g:1731:6: lv_protocol_15_0= ruleAPPLICATIONLAYERPROTOCOL
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getEFPrimaryExpressionAccess().getProtocolAPPLICATIONLAYERPROTOCOLEnumRuleCall_7_1_0());
                      					
                    }
                    pushFollow(FOLLOW_2);
                    lv_protocol_15_0=ruleAPPLICATIONLAYERPROTOCOL();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getEFPrimaryExpressionRule());
                      						}
                      						set(
                      							current,
                      							"protocol",
                      							lv_protocol_15_0,
                      							"org.xtext.example.easywall.EasyWall.APPLICATIONLAYERPROTOCOL");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }


                    }


                    }
                    break;
                case 9 :
                    // InternalEasyWall.g:1750:3: ( () otherlv_17= 'this' )
                    {
                    // InternalEasyWall.g:1750:3: ( () otherlv_17= 'this' )
                    // InternalEasyWall.g:1751:4: () otherlv_17= 'this'
                    {
                    // InternalEasyWall.g:1751:4: ()
                    // InternalEasyWall.g:1752:5: 
                    {
                    if ( state.backtracking==0 ) {

                      					current = forceCreateModelElement(
                      						grammarAccess.getEFPrimaryExpressionAccess().getEFThisAction_8_0(),
                      						current);
                      				
                    }

                    }

                    otherlv_17=(Token)match(input,32,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_17, grammarAccess.getEFPrimaryExpressionAccess().getThisKeyword_8_1());
                      			
                    }

                    }


                    }
                    break;
                case 10 :
                    // InternalEasyWall.g:1764:3: ( () otherlv_19= 'super' )
                    {
                    // InternalEasyWall.g:1764:3: ( () otherlv_19= 'super' )
                    // InternalEasyWall.g:1765:4: () otherlv_19= 'super'
                    {
                    // InternalEasyWall.g:1765:4: ()
                    // InternalEasyWall.g:1766:5: 
                    {
                    if ( state.backtracking==0 ) {

                      					current = forceCreateModelElement(
                      						grammarAccess.getEFPrimaryExpressionAccess().getEFSuperAction_9_0(),
                      						current);
                      				
                    }

                    }

                    otherlv_19=(Token)match(input,33,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_19, grammarAccess.getEFPrimaryExpressionAccess().getSuperKeyword_9_1());
                      			
                    }

                    }


                    }
                    break;
                case 11 :
                    // InternalEasyWall.g:1778:3: ( () otherlv_21= 'new' ( ( ruleQualifiedName ) ) otherlv_23= '(' otherlv_24= ')' )
                    {
                    // InternalEasyWall.g:1778:3: ( () otherlv_21= 'new' ( ( ruleQualifiedName ) ) otherlv_23= '(' otherlv_24= ')' )
                    // InternalEasyWall.g:1779:4: () otherlv_21= 'new' ( ( ruleQualifiedName ) ) otherlv_23= '(' otherlv_24= ')'
                    {
                    // InternalEasyWall.g:1779:4: ()
                    // InternalEasyWall.g:1780:5: 
                    {
                    if ( state.backtracking==0 ) {

                      					current = forceCreateModelElement(
                      						grammarAccess.getEFPrimaryExpressionAccess().getEFNewAction_10_0(),
                      						current);
                      				
                    }

                    }

                    otherlv_21=(Token)match(input,34,FOLLOW_4); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_21, grammarAccess.getEFPrimaryExpressionAccess().getNewKeyword_10_1());
                      			
                    }
                    // InternalEasyWall.g:1790:4: ( ( ruleQualifiedName ) )
                    // InternalEasyWall.g:1791:5: ( ruleQualifiedName )
                    {
                    // InternalEasyWall.g:1791:5: ( ruleQualifiedName )
                    // InternalEasyWall.g:1792:6: ruleQualifiedName
                    {
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getEFPrimaryExpressionRule());
                      						}
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getEFPrimaryExpressionAccess().getTypeEFRuleClassCrossReference_10_2_0());
                      					
                    }
                    pushFollow(FOLLOW_15);
                    ruleQualifiedName();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }

                    otherlv_23=(Token)match(input,24,FOLLOW_19); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_23, grammarAccess.getEFPrimaryExpressionAccess().getLeftParenthesisKeyword_10_3());
                      			
                    }
                    otherlv_24=(Token)match(input,26,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_24, grammarAccess.getEFPrimaryExpressionAccess().getRightParenthesisKeyword_10_4());
                      			
                    }

                    }


                    }
                    break;
                case 12 :
                    // InternalEasyWall.g:1816:3: ( () otherlv_26= '(' ( (lv_expression_27_0= ruleEFExpression ) ) otherlv_28= ')' )
                    {
                    // InternalEasyWall.g:1816:3: ( () otherlv_26= '(' ( (lv_expression_27_0= ruleEFExpression ) ) otherlv_28= ')' )
                    // InternalEasyWall.g:1817:4: () otherlv_26= '(' ( (lv_expression_27_0= ruleEFExpression ) ) otherlv_28= ')'
                    {
                    // InternalEasyWall.g:1817:4: ()
                    // InternalEasyWall.g:1818:5: 
                    {
                    if ( state.backtracking==0 ) {

                      					current = forceCreateModelElement(
                      						grammarAccess.getEFPrimaryExpressionAccess().getEFBRacketsExpressionAction_11_0(),
                      						current);
                      				
                    }

                    }

                    otherlv_26=(Token)match(input,24,FOLLOW_14); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_26, grammarAccess.getEFPrimaryExpressionAccess().getLeftParenthesisKeyword_11_1());
                      			
                    }
                    // InternalEasyWall.g:1828:4: ( (lv_expression_27_0= ruleEFExpression ) )
                    // InternalEasyWall.g:1829:5: (lv_expression_27_0= ruleEFExpression )
                    {
                    // InternalEasyWall.g:1829:5: (lv_expression_27_0= ruleEFExpression )
                    // InternalEasyWall.g:1830:6: lv_expression_27_0= ruleEFExpression
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getEFPrimaryExpressionAccess().getExpressionEFExpressionParserRuleCall_11_2_0());
                      					
                    }
                    pushFollow(FOLLOW_19);
                    lv_expression_27_0=ruleEFExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getEFPrimaryExpressionRule());
                      						}
                      						set(
                      							current,
                      							"expression",
                      							lv_expression_27_0,
                      							"org.xtext.example.easywall.EasyWall.EFExpression");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }

                    otherlv_28=(Token)match(input,26,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_28, grammarAccess.getEFPrimaryExpressionAccess().getRightParenthesisKeyword_11_3());
                      			
                    }

                    }


                    }
                    break;
                case 13 :
                    // InternalEasyWall.g:1853:3: ( () ( (lv_functionName_30_0= ruleQualifiedName ) ) otherlv_31= '(' ( ( (lv_args_32_0= ruleEFExpression ) ) (otherlv_33= ',' ( (lv_args_34_0= ruleEFExpression ) ) )* )? otherlv_35= ')' )
                    {
                    // InternalEasyWall.g:1853:3: ( () ( (lv_functionName_30_0= ruleQualifiedName ) ) otherlv_31= '(' ( ( (lv_args_32_0= ruleEFExpression ) ) (otherlv_33= ',' ( (lv_args_34_0= ruleEFExpression ) ) )* )? otherlv_35= ')' )
                    // InternalEasyWall.g:1854:4: () ( (lv_functionName_30_0= ruleQualifiedName ) ) otherlv_31= '(' ( ( (lv_args_32_0= ruleEFExpression ) ) (otherlv_33= ',' ( (lv_args_34_0= ruleEFExpression ) ) )* )? otherlv_35= ')'
                    {
                    // InternalEasyWall.g:1854:4: ()
                    // InternalEasyWall.g:1855:5: 
                    {
                    if ( state.backtracking==0 ) {

                      					current = forceCreateModelElement(
                      						grammarAccess.getEFPrimaryExpressionAccess().getEFFunctionCallAction_12_0(),
                      						current);
                      				
                    }

                    }

                    // InternalEasyWall.g:1861:4: ( (lv_functionName_30_0= ruleQualifiedName ) )
                    // InternalEasyWall.g:1862:5: (lv_functionName_30_0= ruleQualifiedName )
                    {
                    // InternalEasyWall.g:1862:5: (lv_functionName_30_0= ruleQualifiedName )
                    // InternalEasyWall.g:1863:6: lv_functionName_30_0= ruleQualifiedName
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getEFPrimaryExpressionAccess().getFunctionNameQualifiedNameParserRuleCall_12_1_0());
                      					
                    }
                    pushFollow(FOLLOW_15);
                    lv_functionName_30_0=ruleQualifiedName();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getEFPrimaryExpressionRule());
                      						}
                      						set(
                      							current,
                      							"functionName",
                      							lv_functionName_30_0,
                      							"org.xtext.example.easywall.EasyWall.QualifiedName");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }

                    otherlv_31=(Token)match(input,24,FOLLOW_27); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_31, grammarAccess.getEFPrimaryExpressionAccess().getLeftParenthesisKeyword_12_2());
                      			
                    }
                    // InternalEasyWall.g:1884:4: ( ( (lv_args_32_0= ruleEFExpression ) ) (otherlv_33= ',' ( (lv_args_34_0= ruleEFExpression ) ) )* )?
                    int alt25=2;
                    int LA25_0 = input.LA(1);

                    if ( ((LA25_0>=RULE_ID && LA25_0<=RULE_INT)||LA25_0==24||(LA25_0>=30 && LA25_0<=34)||(LA25_0>=41 && LA25_0<=42)||(LA25_0>=50 && LA25_0<=56)||(LA25_0>=60 && LA25_0<=84)) ) {
                        alt25=1;
                    }
                    switch (alt25) {
                        case 1 :
                            // InternalEasyWall.g:1885:5: ( (lv_args_32_0= ruleEFExpression ) ) (otherlv_33= ',' ( (lv_args_34_0= ruleEFExpression ) ) )*
                            {
                            // InternalEasyWall.g:1885:5: ( (lv_args_32_0= ruleEFExpression ) )
                            // InternalEasyWall.g:1886:6: (lv_args_32_0= ruleEFExpression )
                            {
                            // InternalEasyWall.g:1886:6: (lv_args_32_0= ruleEFExpression )
                            // InternalEasyWall.g:1887:7: lv_args_32_0= ruleEFExpression
                            {
                            if ( state.backtracking==0 ) {

                              							newCompositeNode(grammarAccess.getEFPrimaryExpressionAccess().getArgsEFExpressionParserRuleCall_12_3_0_0());
                              						
                            }
                            pushFollow(FOLLOW_17);
                            lv_args_32_0=ruleEFExpression();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              							if (current==null) {
                              								current = createModelElementForParent(grammarAccess.getEFPrimaryExpressionRule());
                              							}
                              							add(
                              								current,
                              								"args",
                              								lv_args_32_0,
                              								"org.xtext.example.easywall.EasyWall.EFExpression");
                              							afterParserOrEnumRuleCall();
                              						
                            }

                            }


                            }

                            // InternalEasyWall.g:1904:5: (otherlv_33= ',' ( (lv_args_34_0= ruleEFExpression ) ) )*
                            loop24:
                            do {
                                int alt24=2;
                                int LA24_0 = input.LA(1);

                                if ( (LA24_0==25) ) {
                                    alt24=1;
                                }


                                switch (alt24) {
                            	case 1 :
                            	    // InternalEasyWall.g:1905:6: otherlv_33= ',' ( (lv_args_34_0= ruleEFExpression ) )
                            	    {
                            	    otherlv_33=(Token)match(input,25,FOLLOW_14); if (state.failed) return current;
                            	    if ( state.backtracking==0 ) {

                            	      						newLeafNode(otherlv_33, grammarAccess.getEFPrimaryExpressionAccess().getCommaKeyword_12_3_1_0());
                            	      					
                            	    }
                            	    // InternalEasyWall.g:1909:6: ( (lv_args_34_0= ruleEFExpression ) )
                            	    // InternalEasyWall.g:1910:7: (lv_args_34_0= ruleEFExpression )
                            	    {
                            	    // InternalEasyWall.g:1910:7: (lv_args_34_0= ruleEFExpression )
                            	    // InternalEasyWall.g:1911:8: lv_args_34_0= ruleEFExpression
                            	    {
                            	    if ( state.backtracking==0 ) {

                            	      								newCompositeNode(grammarAccess.getEFPrimaryExpressionAccess().getArgsEFExpressionParserRuleCall_12_3_1_1_0());
                            	      							
                            	    }
                            	    pushFollow(FOLLOW_17);
                            	    lv_args_34_0=ruleEFExpression();

                            	    state._fsp--;
                            	    if (state.failed) return current;
                            	    if ( state.backtracking==0 ) {

                            	      								if (current==null) {
                            	      									current = createModelElementForParent(grammarAccess.getEFPrimaryExpressionRule());
                            	      								}
                            	      								add(
                            	      									current,
                            	      									"args",
                            	      									lv_args_34_0,
                            	      									"org.xtext.example.easywall.EasyWall.EFExpression");
                            	      								afterParserOrEnumRuleCall();
                            	      							
                            	    }

                            	    }


                            	    }


                            	    }
                            	    break;

                            	default :
                            	    break loop24;
                                }
                            } while (true);


                            }
                            break;

                    }

                    otherlv_35=(Token)match(input,26,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_35, grammarAccess.getEFPrimaryExpressionAccess().getRightParenthesisKeyword_12_4());
                      			
                    }

                    }


                    }
                    break;
                case 14 :
                    // InternalEasyWall.g:1936:3: ( () ( (lv_symbol_37_0= ruleQualifiedName ) ) )
                    {
                    // InternalEasyWall.g:1936:3: ( () ( (lv_symbol_37_0= ruleQualifiedName ) ) )
                    // InternalEasyWall.g:1937:4: () ( (lv_symbol_37_0= ruleQualifiedName ) )
                    {
                    // InternalEasyWall.g:1937:4: ()
                    // InternalEasyWall.g:1938:5: 
                    {
                    if ( state.backtracking==0 ) {

                      					current = forceCreateModelElement(
                      						grammarAccess.getEFPrimaryExpressionAccess().getEFSymbolRefAction_13_0(),
                      						current);
                      				
                    }

                    }

                    // InternalEasyWall.g:1944:4: ( (lv_symbol_37_0= ruleQualifiedName ) )
                    // InternalEasyWall.g:1945:5: (lv_symbol_37_0= ruleQualifiedName )
                    {
                    // InternalEasyWall.g:1945:5: (lv_symbol_37_0= ruleQualifiedName )
                    // InternalEasyWall.g:1946:6: lv_symbol_37_0= ruleQualifiedName
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getEFPrimaryExpressionAccess().getSymbolQualifiedNameParserRuleCall_13_1_0());
                      					
                    }
                    pushFollow(FOLLOW_2);
                    lv_symbol_37_0=ruleQualifiedName();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getEFPrimaryExpressionRule());
                      						}
                      						set(
                      							current,
                      							"symbol",
                      							lv_symbol_37_0,
                      							"org.xtext.example.easywall.EasyWall.QualifiedName");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }


                    }


                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleEFPrimaryExpression"


    // $ANTLR start "entryRuleEFRule"
    // InternalEasyWall.g:1968:1: entryRuleEFRule returns [EObject current=null] : iv_ruleEFRule= ruleEFRule EOF ;
    public final EObject entryRuleEFRule() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEFRule = null;


        try {
            // InternalEasyWall.g:1968:47: (iv_ruleEFRule= ruleEFRule EOF )
            // InternalEasyWall.g:1969:2: iv_ruleEFRule= ruleEFRule EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getEFRuleRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleEFRule=ruleEFRule();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleEFRule; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleEFRule"


    // $ANTLR start "ruleEFRule"
    // InternalEasyWall.g:1975:1: ruleEFRule returns [EObject current=null] : ( (lv_rules_0_0= ruleEFRuleClass ) ) ;
    public final EObject ruleEFRule() throws RecognitionException {
        EObject current = null;

        EObject lv_rules_0_0 = null;



        	enterRule();

        try {
            // InternalEasyWall.g:1981:2: ( ( (lv_rules_0_0= ruleEFRuleClass ) ) )
            // InternalEasyWall.g:1982:2: ( (lv_rules_0_0= ruleEFRuleClass ) )
            {
            // InternalEasyWall.g:1982:2: ( (lv_rules_0_0= ruleEFRuleClass ) )
            // InternalEasyWall.g:1983:3: (lv_rules_0_0= ruleEFRuleClass )
            {
            // InternalEasyWall.g:1983:3: (lv_rules_0_0= ruleEFRuleClass )
            // InternalEasyWall.g:1984:4: lv_rules_0_0= ruleEFRuleClass
            {
            if ( state.backtracking==0 ) {

              				newCompositeNode(grammarAccess.getEFRuleAccess().getRulesEFRuleClassParserRuleCall_0());
              			
            }
            pushFollow(FOLLOW_2);
            lv_rules_0_0=ruleEFRuleClass();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              				if (current==null) {
              					current = createModelElementForParent(grammarAccess.getEFRuleRule());
              				}
              				set(
              					current,
              					"rules",
              					lv_rules_0_0,
              					"org.xtext.example.easywall.EasyWall.EFRuleClass");
              				afterParserOrEnumRuleCall();
              			
            }

            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleEFRule"


    // $ANTLR start "entryRuleEFRuleClass"
    // InternalEasyWall.g:2004:1: entryRuleEFRuleClass returns [EObject current=null] : iv_ruleEFRuleClass= ruleEFRuleClass EOF ;
    public final EObject entryRuleEFRuleClass() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEFRuleClass = null;


        try {
            // InternalEasyWall.g:2004:52: (iv_ruleEFRuleClass= ruleEFRuleClass EOF )
            // InternalEasyWall.g:2005:2: iv_ruleEFRuleClass= ruleEFRuleClass EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getEFRuleClassRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleEFRuleClass=ruleEFRuleClass();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleEFRuleClass; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleEFRuleClass"


    // $ANTLR start "ruleEFRuleClass"
    // InternalEasyWall.g:2011:1: ruleEFRuleClass returns [EObject current=null] : (otherlv_0= 'rule' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'at' ( (lv_type_3_0= ruleEFRulesTypes ) ) otherlv_4= '{' ( (lv_members_5_0= ruleEFMember ) )* otherlv_6= '}' ) ;
    public final EObject ruleEFRuleClass() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Enumerator lv_type_3_0 = null;

        EObject lv_members_5_0 = null;



        	enterRule();

        try {
            // InternalEasyWall.g:2017:2: ( (otherlv_0= 'rule' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'at' ( (lv_type_3_0= ruleEFRulesTypes ) ) otherlv_4= '{' ( (lv_members_5_0= ruleEFMember ) )* otherlv_6= '}' ) )
            // InternalEasyWall.g:2018:2: (otherlv_0= 'rule' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'at' ( (lv_type_3_0= ruleEFRulesTypes ) ) otherlv_4= '{' ( (lv_members_5_0= ruleEFMember ) )* otherlv_6= '}' )
            {
            // InternalEasyWall.g:2018:2: (otherlv_0= 'rule' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'at' ( (lv_type_3_0= ruleEFRulesTypes ) ) otherlv_4= '{' ( (lv_members_5_0= ruleEFMember ) )* otherlv_6= '}' )
            // InternalEasyWall.g:2019:3: otherlv_0= 'rule' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'at' ( (lv_type_3_0= ruleEFRulesTypes ) ) otherlv_4= '{' ( (lv_members_5_0= ruleEFMember ) )* otherlv_6= '}'
            {
            otherlv_0=(Token)match(input,35,FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getEFRuleClassAccess().getRuleKeyword_0());
              		
            }
            // InternalEasyWall.g:2023:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalEasyWall.g:2024:4: (lv_name_1_0= RULE_ID )
            {
            // InternalEasyWall.g:2024:4: (lv_name_1_0= RULE_ID )
            // InternalEasyWall.g:2025:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_28); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_name_1_0, grammarAccess.getEFRuleClassAccess().getNameIDTerminalRuleCall_1_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getEFRuleClassRule());
              					}
              					setWithLastConsumed(
              						current,
              						"name",
              						lv_name_1_0,
              						"org.eclipse.xtext.common.Terminals.ID");
              				
            }

            }


            }

            otherlv_2=(Token)match(input,36,FOLLOW_29); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getEFRuleClassAccess().getAtKeyword_2());
              		
            }
            // InternalEasyWall.g:2045:3: ( (lv_type_3_0= ruleEFRulesTypes ) )
            // InternalEasyWall.g:2046:4: (lv_type_3_0= ruleEFRulesTypes )
            {
            // InternalEasyWall.g:2046:4: (lv_type_3_0= ruleEFRulesTypes )
            // InternalEasyWall.g:2047:5: lv_type_3_0= ruleEFRulesTypes
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getEFRuleClassAccess().getTypeEFRulesTypesEnumRuleCall_3_0());
              				
            }
            pushFollow(FOLLOW_9);
            lv_type_3_0=ruleEFRulesTypes();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getEFRuleClassRule());
              					}
              					set(
              						current,
              						"type",
              						lv_type_3_0,
              						"org.xtext.example.easywall.EasyWall.EFRulesTypes");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_4=(Token)match(input,17,FOLLOW_10); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_4, grammarAccess.getEFRuleClassAccess().getLeftCurlyBracketKeyword_4());
              		
            }
            // InternalEasyWall.g:2068:3: ( (lv_members_5_0= ruleEFMember ) )*
            loop27:
            do {
                int alt27=2;
                int LA27_0 = input.LA(1);

                if ( ((LA27_0>=19 && LA27_0<=20)||LA27_0==23) ) {
                    alt27=1;
                }


                switch (alt27) {
            	case 1 :
            	    // InternalEasyWall.g:2069:4: (lv_members_5_0= ruleEFMember )
            	    {
            	    // InternalEasyWall.g:2069:4: (lv_members_5_0= ruleEFMember )
            	    // InternalEasyWall.g:2070:5: lv_members_5_0= ruleEFMember
            	    {
            	    if ( state.backtracking==0 ) {

            	      					newCompositeNode(grammarAccess.getEFRuleClassAccess().getMembersEFMemberParserRuleCall_5_0());
            	      				
            	    }
            	    pushFollow(FOLLOW_10);
            	    lv_members_5_0=ruleEFMember();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      					if (current==null) {
            	      						current = createModelElementForParent(grammarAccess.getEFRuleClassRule());
            	      					}
            	      					add(
            	      						current,
            	      						"members",
            	      						lv_members_5_0,
            	      						"org.xtext.example.easywall.EasyWall.EFMember");
            	      					afterParserOrEnumRuleCall();
            	      				
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop27;
                }
            } while (true);

            otherlv_6=(Token)match(input,18,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_6, grammarAccess.getEFRuleClassAccess().getRightCurlyBracketKeyword_6());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleEFRuleClass"


    // $ANTLR start "entryRuleEFOr"
    // InternalEasyWall.g:2095:1: entryRuleEFOr returns [String current=null] : iv_ruleEFOr= ruleEFOr EOF ;
    public final String entryRuleEFOr() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEFOr = null;


        try {
            // InternalEasyWall.g:2095:44: (iv_ruleEFOr= ruleEFOr EOF )
            // InternalEasyWall.g:2096:2: iv_ruleEFOr= ruleEFOr EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getEFOrRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleEFOr=ruleEFOr();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleEFOr.getText(); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleEFOr"


    // $ANTLR start "ruleEFOr"
    // InternalEasyWall.g:2102:1: ruleEFOr returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '||' | kw= 'or' ) ;
    public final AntlrDatatypeRuleToken ruleEFOr() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalEasyWall.g:2108:2: ( (kw= '||' | kw= 'or' ) )
            // InternalEasyWall.g:2109:2: (kw= '||' | kw= 'or' )
            {
            // InternalEasyWall.g:2109:2: (kw= '||' | kw= 'or' )
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==37) ) {
                alt28=1;
            }
            else if ( (LA28_0==38) ) {
                alt28=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 28, 0, input);

                throw nvae;
            }
            switch (alt28) {
                case 1 :
                    // InternalEasyWall.g:2110:3: kw= '||'
                    {
                    kw=(Token)match(input,37,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getEFOrAccess().getVerticalLineVerticalLineKeyword_0());
                      		
                    }

                    }
                    break;
                case 2 :
                    // InternalEasyWall.g:2116:3: kw= 'or'
                    {
                    kw=(Token)match(input,38,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getEFOrAccess().getOrKeyword_1());
                      		
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleEFOr"


    // $ANTLR start "entryRuleEFAnd"
    // InternalEasyWall.g:2125:1: entryRuleEFAnd returns [String current=null] : iv_ruleEFAnd= ruleEFAnd EOF ;
    public final String entryRuleEFAnd() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEFAnd = null;


        try {
            // InternalEasyWall.g:2125:45: (iv_ruleEFAnd= ruleEFAnd EOF )
            // InternalEasyWall.g:2126:2: iv_ruleEFAnd= ruleEFAnd EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getEFAndRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleEFAnd=ruleEFAnd();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleEFAnd.getText(); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleEFAnd"


    // $ANTLR start "ruleEFAnd"
    // InternalEasyWall.g:2132:1: ruleEFAnd returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '&&' | kw= 'and' ) ;
    public final AntlrDatatypeRuleToken ruleEFAnd() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalEasyWall.g:2138:2: ( (kw= '&&' | kw= 'and' ) )
            // InternalEasyWall.g:2139:2: (kw= '&&' | kw= 'and' )
            {
            // InternalEasyWall.g:2139:2: (kw= '&&' | kw= 'and' )
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==39) ) {
                alt29=1;
            }
            else if ( (LA29_0==40) ) {
                alt29=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 29, 0, input);

                throw nvae;
            }
            switch (alt29) {
                case 1 :
                    // InternalEasyWall.g:2140:3: kw= '&&'
                    {
                    kw=(Token)match(input,39,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getEFAndAccess().getAmpersandAmpersandKeyword_0());
                      		
                    }

                    }
                    break;
                case 2 :
                    // InternalEasyWall.g:2146:3: kw= 'and'
                    {
                    kw=(Token)match(input,40,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getEFAndAccess().getAndKeyword_1());
                      		
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleEFAnd"


    // $ANTLR start "entryRuleEFNot"
    // InternalEasyWall.g:2155:1: entryRuleEFNot returns [String current=null] : iv_ruleEFNot= ruleEFNot EOF ;
    public final String entryRuleEFNot() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEFNot = null;


        try {
            // InternalEasyWall.g:2155:45: (iv_ruleEFNot= ruleEFNot EOF )
            // InternalEasyWall.g:2156:2: iv_ruleEFNot= ruleEFNot EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getEFNotRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleEFNot=ruleEFNot();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleEFNot.getText(); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleEFNot"


    // $ANTLR start "ruleEFNot"
    // InternalEasyWall.g:2162:1: ruleEFNot returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '!' | kw= 'not' ) ;
    public final AntlrDatatypeRuleToken ruleEFNot() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalEasyWall.g:2168:2: ( (kw= '!' | kw= 'not' ) )
            // InternalEasyWall.g:2169:2: (kw= '!' | kw= 'not' )
            {
            // InternalEasyWall.g:2169:2: (kw= '!' | kw= 'not' )
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==41) ) {
                alt30=1;
            }
            else if ( (LA30_0==42) ) {
                alt30=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 30, 0, input);

                throw nvae;
            }
            switch (alt30) {
                case 1 :
                    // InternalEasyWall.g:2170:3: kw= '!'
                    {
                    kw=(Token)match(input,41,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getEFNotAccess().getExclamationMarkKeyword_0());
                      		
                    }

                    }
                    break;
                case 2 :
                    // InternalEasyWall.g:2176:3: kw= 'not'
                    {
                    kw=(Token)match(input,42,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getEFNotAccess().getNotKeyword_1());
                      		
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleEFNot"


    // $ANTLR start "entryRuleEFEqualOperators"
    // InternalEasyWall.g:2185:1: entryRuleEFEqualOperators returns [String current=null] : iv_ruleEFEqualOperators= ruleEFEqualOperators EOF ;
    public final String entryRuleEFEqualOperators() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEFEqualOperators = null;


        try {
            // InternalEasyWall.g:2185:56: (iv_ruleEFEqualOperators= ruleEFEqualOperators EOF )
            // InternalEasyWall.g:2186:2: iv_ruleEFEqualOperators= ruleEFEqualOperators EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getEFEqualOperatorsRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleEFEqualOperators=ruleEFEqualOperators();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleEFEqualOperators.getText(); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleEFEqualOperators"


    // $ANTLR start "ruleEFEqualOperators"
    // InternalEasyWall.g:2192:1: ruleEFEqualOperators returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '==' | kw= '!=' | kw= 'isequalto' ) ;
    public final AntlrDatatypeRuleToken ruleEFEqualOperators() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalEasyWall.g:2198:2: ( (kw= '==' | kw= '!=' | kw= 'isequalto' ) )
            // InternalEasyWall.g:2199:2: (kw= '==' | kw= '!=' | kw= 'isequalto' )
            {
            // InternalEasyWall.g:2199:2: (kw= '==' | kw= '!=' | kw= 'isequalto' )
            int alt31=3;
            switch ( input.LA(1) ) {
            case 43:
                {
                alt31=1;
                }
                break;
            case 44:
                {
                alt31=2;
                }
                break;
            case 45:
                {
                alt31=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 31, 0, input);

                throw nvae;
            }

            switch (alt31) {
                case 1 :
                    // InternalEasyWall.g:2200:3: kw= '=='
                    {
                    kw=(Token)match(input,43,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getEFEqualOperatorsAccess().getEqualsSignEqualsSignKeyword_0());
                      		
                    }

                    }
                    break;
                case 2 :
                    // InternalEasyWall.g:2206:3: kw= '!='
                    {
                    kw=(Token)match(input,44,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getEFEqualOperatorsAccess().getExclamationMarkEqualsSignKeyword_1());
                      		
                    }

                    }
                    break;
                case 3 :
                    // InternalEasyWall.g:2212:3: kw= 'isequalto'
                    {
                    kw=(Token)match(input,45,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getEFEqualOperatorsAccess().getIsequaltoKeyword_2());
                      		
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleEFEqualOperators"


    // $ANTLR start "entryRuleEFRelOperators"
    // InternalEasyWall.g:2221:1: entryRuleEFRelOperators returns [String current=null] : iv_ruleEFRelOperators= ruleEFRelOperators EOF ;
    public final String entryRuleEFRelOperators() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEFRelOperators = null;


        try {
            // InternalEasyWall.g:2221:54: (iv_ruleEFRelOperators= ruleEFRelOperators EOF )
            // InternalEasyWall.g:2222:2: iv_ruleEFRelOperators= ruleEFRelOperators EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getEFRelOperatorsRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleEFRelOperators=ruleEFRelOperators();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleEFRelOperators.getText(); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleEFRelOperators"


    // $ANTLR start "ruleEFRelOperators"
    // InternalEasyWall.g:2228:1: ruleEFRelOperators returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '>=' | kw= '<=' | kw= '>' | kw= '<' ) ;
    public final AntlrDatatypeRuleToken ruleEFRelOperators() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalEasyWall.g:2234:2: ( (kw= '>=' | kw= '<=' | kw= '>' | kw= '<' ) )
            // InternalEasyWall.g:2235:2: (kw= '>=' | kw= '<=' | kw= '>' | kw= '<' )
            {
            // InternalEasyWall.g:2235:2: (kw= '>=' | kw= '<=' | kw= '>' | kw= '<' )
            int alt32=4;
            switch ( input.LA(1) ) {
            case 46:
                {
                alt32=1;
                }
                break;
            case 47:
                {
                alt32=2;
                }
                break;
            case 48:
                {
                alt32=3;
                }
                break;
            case 49:
                {
                alt32=4;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 32, 0, input);

                throw nvae;
            }

            switch (alt32) {
                case 1 :
                    // InternalEasyWall.g:2236:3: kw= '>='
                    {
                    kw=(Token)match(input,46,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getEFRelOperatorsAccess().getGreaterThanSignEqualsSignKeyword_0());
                      		
                    }

                    }
                    break;
                case 2 :
                    // InternalEasyWall.g:2242:3: kw= '<='
                    {
                    kw=(Token)match(input,47,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getEFRelOperatorsAccess().getLessThanSignEqualsSignKeyword_1());
                      		
                    }

                    }
                    break;
                case 3 :
                    // InternalEasyWall.g:2248:3: kw= '>'
                    {
                    kw=(Token)match(input,48,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getEFRelOperatorsAccess().getGreaterThanSignKeyword_2());
                      		
                    }

                    }
                    break;
                case 4 :
                    // InternalEasyWall.g:2254:3: kw= '<'
                    {
                    kw=(Token)match(input,49,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getEFRelOperatorsAccess().getLessThanSignKeyword_3());
                      		
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleEFRelOperators"


    // $ANTLR start "ruleEFNetworkNativeType"
    // InternalEasyWall.g:2263:1: ruleEFNetworkNativeType returns [Enumerator current=null] : ( (enumLiteral_0= 'network' ) | (enumLiteral_1= 'netip' ) | (enumLiteral_2= 'netport' ) | (enumLiteral_3= 'protocol' ) | (enumLiteral_4= 'direction' ) ) ;
    public final Enumerator ruleEFNetworkNativeType() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;
        Token enumLiteral_4=null;


        	enterRule();

        try {
            // InternalEasyWall.g:2269:2: ( ( (enumLiteral_0= 'network' ) | (enumLiteral_1= 'netip' ) | (enumLiteral_2= 'netport' ) | (enumLiteral_3= 'protocol' ) | (enumLiteral_4= 'direction' ) ) )
            // InternalEasyWall.g:2270:2: ( (enumLiteral_0= 'network' ) | (enumLiteral_1= 'netip' ) | (enumLiteral_2= 'netport' ) | (enumLiteral_3= 'protocol' ) | (enumLiteral_4= 'direction' ) )
            {
            // InternalEasyWall.g:2270:2: ( (enumLiteral_0= 'network' ) | (enumLiteral_1= 'netip' ) | (enumLiteral_2= 'netport' ) | (enumLiteral_3= 'protocol' ) | (enumLiteral_4= 'direction' ) )
            int alt33=5;
            switch ( input.LA(1) ) {
            case 50:
                {
                alt33=1;
                }
                break;
            case 51:
                {
                alt33=2;
                }
                break;
            case 52:
                {
                alt33=3;
                }
                break;
            case 53:
                {
                alt33=4;
                }
                break;
            case 54:
                {
                alt33=5;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 33, 0, input);

                throw nvae;
            }

            switch (alt33) {
                case 1 :
                    // InternalEasyWall.g:2271:3: (enumLiteral_0= 'network' )
                    {
                    // InternalEasyWall.g:2271:3: (enumLiteral_0= 'network' )
                    // InternalEasyWall.g:2272:4: enumLiteral_0= 'network'
                    {
                    enumLiteral_0=(Token)match(input,50,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getEFNetworkNativeTypeAccess().getNETWORKEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_0, grammarAccess.getEFNetworkNativeTypeAccess().getNETWORKEnumLiteralDeclaration_0());
                      			
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalEasyWall.g:2279:3: (enumLiteral_1= 'netip' )
                    {
                    // InternalEasyWall.g:2279:3: (enumLiteral_1= 'netip' )
                    // InternalEasyWall.g:2280:4: enumLiteral_1= 'netip'
                    {
                    enumLiteral_1=(Token)match(input,51,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getEFNetworkNativeTypeAccess().getIPEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_1, grammarAccess.getEFNetworkNativeTypeAccess().getIPEnumLiteralDeclaration_1());
                      			
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalEasyWall.g:2287:3: (enumLiteral_2= 'netport' )
                    {
                    // InternalEasyWall.g:2287:3: (enumLiteral_2= 'netport' )
                    // InternalEasyWall.g:2288:4: enumLiteral_2= 'netport'
                    {
                    enumLiteral_2=(Token)match(input,52,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getEFNetworkNativeTypeAccess().getPORTEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_2, grammarAccess.getEFNetworkNativeTypeAccess().getPORTEnumLiteralDeclaration_2());
                      			
                    }

                    }


                    }
                    break;
                case 4 :
                    // InternalEasyWall.g:2295:3: (enumLiteral_3= 'protocol' )
                    {
                    // InternalEasyWall.g:2295:3: (enumLiteral_3= 'protocol' )
                    // InternalEasyWall.g:2296:4: enumLiteral_3= 'protocol'
                    {
                    enumLiteral_3=(Token)match(input,53,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getEFNetworkNativeTypeAccess().getPROTOCOLEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_3, grammarAccess.getEFNetworkNativeTypeAccess().getPROTOCOLEnumLiteralDeclaration_3());
                      			
                    }

                    }


                    }
                    break;
                case 5 :
                    // InternalEasyWall.g:2303:3: (enumLiteral_4= 'direction' )
                    {
                    // InternalEasyWall.g:2303:3: (enumLiteral_4= 'direction' )
                    // InternalEasyWall.g:2304:4: enumLiteral_4= 'direction'
                    {
                    enumLiteral_4=(Token)match(input,54,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getEFNetworkNativeTypeAccess().getDIRECTIONEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_4, grammarAccess.getEFNetworkNativeTypeAccess().getDIRECTIONEnumLiteralDeclaration_4());
                      			
                    }

                    }


                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleEFNetworkNativeType"


    // $ANTLR start "ruleEFDirectionNativeType"
    // InternalEasyWall.g:2314:1: ruleEFDirectionNativeType returns [Enumerator current=null] : ( (enumLiteral_0= 'in' ) | (enumLiteral_1= 'out' ) ) ;
    public final Enumerator ruleEFDirectionNativeType() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;


        	enterRule();

        try {
            // InternalEasyWall.g:2320:2: ( ( (enumLiteral_0= 'in' ) | (enumLiteral_1= 'out' ) ) )
            // InternalEasyWall.g:2321:2: ( (enumLiteral_0= 'in' ) | (enumLiteral_1= 'out' ) )
            {
            // InternalEasyWall.g:2321:2: ( (enumLiteral_0= 'in' ) | (enumLiteral_1= 'out' ) )
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( (LA34_0==55) ) {
                alt34=1;
            }
            else if ( (LA34_0==56) ) {
                alt34=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 34, 0, input);

                throw nvae;
            }
            switch (alt34) {
                case 1 :
                    // InternalEasyWall.g:2322:3: (enumLiteral_0= 'in' )
                    {
                    // InternalEasyWall.g:2322:3: (enumLiteral_0= 'in' )
                    // InternalEasyWall.g:2323:4: enumLiteral_0= 'in'
                    {
                    enumLiteral_0=(Token)match(input,55,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getEFDirectionNativeTypeAccess().getINEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_0, grammarAccess.getEFDirectionNativeTypeAccess().getINEnumLiteralDeclaration_0());
                      			
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalEasyWall.g:2330:3: (enumLiteral_1= 'out' )
                    {
                    // InternalEasyWall.g:2330:3: (enumLiteral_1= 'out' )
                    // InternalEasyWall.g:2331:4: enumLiteral_1= 'out'
                    {
                    enumLiteral_1=(Token)match(input,56,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getEFDirectionNativeTypeAccess().getOUTEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_1, grammarAccess.getEFDirectionNativeTypeAccess().getOUTEnumLiteralDeclaration_1());
                      			
                    }

                    }


                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleEFDirectionNativeType"


    // $ANTLR start "ruleEFRulesTypes"
    // InternalEasyWall.g:2341:1: ruleEFRulesTypes returns [Enumerator current=null] : ( (enumLiteral_0= 'NetworkLayer' ) | (enumLiteral_1= 'TransportLayer' ) | (enumLiteral_2= 'ApplicationLayer' ) ) ;
    public final Enumerator ruleEFRulesTypes() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;


        	enterRule();

        try {
            // InternalEasyWall.g:2347:2: ( ( (enumLiteral_0= 'NetworkLayer' ) | (enumLiteral_1= 'TransportLayer' ) | (enumLiteral_2= 'ApplicationLayer' ) ) )
            // InternalEasyWall.g:2348:2: ( (enumLiteral_0= 'NetworkLayer' ) | (enumLiteral_1= 'TransportLayer' ) | (enumLiteral_2= 'ApplicationLayer' ) )
            {
            // InternalEasyWall.g:2348:2: ( (enumLiteral_0= 'NetworkLayer' ) | (enumLiteral_1= 'TransportLayer' ) | (enumLiteral_2= 'ApplicationLayer' ) )
            int alt35=3;
            switch ( input.LA(1) ) {
            case 57:
                {
                alt35=1;
                }
                break;
            case 58:
                {
                alt35=2;
                }
                break;
            case 59:
                {
                alt35=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 35, 0, input);

                throw nvae;
            }

            switch (alt35) {
                case 1 :
                    // InternalEasyWall.g:2349:3: (enumLiteral_0= 'NetworkLayer' )
                    {
                    // InternalEasyWall.g:2349:3: (enumLiteral_0= 'NetworkLayer' )
                    // InternalEasyWall.g:2350:4: enumLiteral_0= 'NetworkLayer'
                    {
                    enumLiteral_0=(Token)match(input,57,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getEFRulesTypesAccess().getIPLEVELEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_0, grammarAccess.getEFRulesTypesAccess().getIPLEVELEnumLiteralDeclaration_0());
                      			
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalEasyWall.g:2357:3: (enumLiteral_1= 'TransportLayer' )
                    {
                    // InternalEasyWall.g:2357:3: (enumLiteral_1= 'TransportLayer' )
                    // InternalEasyWall.g:2358:4: enumLiteral_1= 'TransportLayer'
                    {
                    enumLiteral_1=(Token)match(input,58,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getEFRulesTypesAccess().getTRANSPLEVELEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_1, grammarAccess.getEFRulesTypesAccess().getTRANSPLEVELEnumLiteralDeclaration_1());
                      			
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalEasyWall.g:2365:3: (enumLiteral_2= 'ApplicationLayer' )
                    {
                    // InternalEasyWall.g:2365:3: (enumLiteral_2= 'ApplicationLayer' )
                    // InternalEasyWall.g:2366:4: enumLiteral_2= 'ApplicationLayer'
                    {
                    enumLiteral_2=(Token)match(input,59,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getEFRulesTypesAccess().getAPPLEVELEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_2, grammarAccess.getEFRulesTypesAccess().getAPPLEVELEnumLiteralDeclaration_2());
                      			
                    }

                    }


                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleEFRulesTypes"


    // $ANTLR start "ruleNETWORKLAYERPROTOCOL"
    // InternalEasyWall.g:2376:1: ruleNETWORKLAYERPROTOCOL returns [Enumerator current=null] : ( (enumLiteral_0= 'IPv4' ) | (enumLiteral_1= 'IPv6' ) | (enumLiteral_2= 'ARP' ) | (enumLiteral_3= 'ICMP' ) | (enumLiteral_4= 'NAT' ) | (enumLiteral_5= 'RIP' ) | (enumLiteral_6= 'OSPF' ) | (enumLiteral_7= 'IPSEC' ) | (enumLiteral_8= 'IGMP' ) ) ;
    public final Enumerator ruleNETWORKLAYERPROTOCOL() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;
        Token enumLiteral_4=null;
        Token enumLiteral_5=null;
        Token enumLiteral_6=null;
        Token enumLiteral_7=null;
        Token enumLiteral_8=null;


        	enterRule();

        try {
            // InternalEasyWall.g:2382:2: ( ( (enumLiteral_0= 'IPv4' ) | (enumLiteral_1= 'IPv6' ) | (enumLiteral_2= 'ARP' ) | (enumLiteral_3= 'ICMP' ) | (enumLiteral_4= 'NAT' ) | (enumLiteral_5= 'RIP' ) | (enumLiteral_6= 'OSPF' ) | (enumLiteral_7= 'IPSEC' ) | (enumLiteral_8= 'IGMP' ) ) )
            // InternalEasyWall.g:2383:2: ( (enumLiteral_0= 'IPv4' ) | (enumLiteral_1= 'IPv6' ) | (enumLiteral_2= 'ARP' ) | (enumLiteral_3= 'ICMP' ) | (enumLiteral_4= 'NAT' ) | (enumLiteral_5= 'RIP' ) | (enumLiteral_6= 'OSPF' ) | (enumLiteral_7= 'IPSEC' ) | (enumLiteral_8= 'IGMP' ) )
            {
            // InternalEasyWall.g:2383:2: ( (enumLiteral_0= 'IPv4' ) | (enumLiteral_1= 'IPv6' ) | (enumLiteral_2= 'ARP' ) | (enumLiteral_3= 'ICMP' ) | (enumLiteral_4= 'NAT' ) | (enumLiteral_5= 'RIP' ) | (enumLiteral_6= 'OSPF' ) | (enumLiteral_7= 'IPSEC' ) | (enumLiteral_8= 'IGMP' ) )
            int alt36=9;
            switch ( input.LA(1) ) {
            case 60:
                {
                alt36=1;
                }
                break;
            case 61:
                {
                alt36=2;
                }
                break;
            case 62:
                {
                alt36=3;
                }
                break;
            case 63:
                {
                alt36=4;
                }
                break;
            case 64:
                {
                alt36=5;
                }
                break;
            case 65:
                {
                alt36=6;
                }
                break;
            case 66:
                {
                alt36=7;
                }
                break;
            case 67:
                {
                alt36=8;
                }
                break;
            case 68:
                {
                alt36=9;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 36, 0, input);

                throw nvae;
            }

            switch (alt36) {
                case 1 :
                    // InternalEasyWall.g:2384:3: (enumLiteral_0= 'IPv4' )
                    {
                    // InternalEasyWall.g:2384:3: (enumLiteral_0= 'IPv4' )
                    // InternalEasyWall.g:2385:4: enumLiteral_0= 'IPv4'
                    {
                    enumLiteral_0=(Token)match(input,60,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getNETWORKLAYERPROTOCOLAccess().getIPv4EnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_0, grammarAccess.getNETWORKLAYERPROTOCOLAccess().getIPv4EnumLiteralDeclaration_0());
                      			
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalEasyWall.g:2392:3: (enumLiteral_1= 'IPv6' )
                    {
                    // InternalEasyWall.g:2392:3: (enumLiteral_1= 'IPv6' )
                    // InternalEasyWall.g:2393:4: enumLiteral_1= 'IPv6'
                    {
                    enumLiteral_1=(Token)match(input,61,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getNETWORKLAYERPROTOCOLAccess().getIPv6EnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_1, grammarAccess.getNETWORKLAYERPROTOCOLAccess().getIPv6EnumLiteralDeclaration_1());
                      			
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalEasyWall.g:2400:3: (enumLiteral_2= 'ARP' )
                    {
                    // InternalEasyWall.g:2400:3: (enumLiteral_2= 'ARP' )
                    // InternalEasyWall.g:2401:4: enumLiteral_2= 'ARP'
                    {
                    enumLiteral_2=(Token)match(input,62,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getNETWORKLAYERPROTOCOLAccess().getARPEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_2, grammarAccess.getNETWORKLAYERPROTOCOLAccess().getARPEnumLiteralDeclaration_2());
                      			
                    }

                    }


                    }
                    break;
                case 4 :
                    // InternalEasyWall.g:2408:3: (enumLiteral_3= 'ICMP' )
                    {
                    // InternalEasyWall.g:2408:3: (enumLiteral_3= 'ICMP' )
                    // InternalEasyWall.g:2409:4: enumLiteral_3= 'ICMP'
                    {
                    enumLiteral_3=(Token)match(input,63,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getNETWORKLAYERPROTOCOLAccess().getICMPEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_3, grammarAccess.getNETWORKLAYERPROTOCOLAccess().getICMPEnumLiteralDeclaration_3());
                      			
                    }

                    }


                    }
                    break;
                case 5 :
                    // InternalEasyWall.g:2416:3: (enumLiteral_4= 'NAT' )
                    {
                    // InternalEasyWall.g:2416:3: (enumLiteral_4= 'NAT' )
                    // InternalEasyWall.g:2417:4: enumLiteral_4= 'NAT'
                    {
                    enumLiteral_4=(Token)match(input,64,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getNETWORKLAYERPROTOCOLAccess().getNATEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_4, grammarAccess.getNETWORKLAYERPROTOCOLAccess().getNATEnumLiteralDeclaration_4());
                      			
                    }

                    }


                    }
                    break;
                case 6 :
                    // InternalEasyWall.g:2424:3: (enumLiteral_5= 'RIP' )
                    {
                    // InternalEasyWall.g:2424:3: (enumLiteral_5= 'RIP' )
                    // InternalEasyWall.g:2425:4: enumLiteral_5= 'RIP'
                    {
                    enumLiteral_5=(Token)match(input,65,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getNETWORKLAYERPROTOCOLAccess().getRIPEnumLiteralDeclaration_5().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_5, grammarAccess.getNETWORKLAYERPROTOCOLAccess().getRIPEnumLiteralDeclaration_5());
                      			
                    }

                    }


                    }
                    break;
                case 7 :
                    // InternalEasyWall.g:2432:3: (enumLiteral_6= 'OSPF' )
                    {
                    // InternalEasyWall.g:2432:3: (enumLiteral_6= 'OSPF' )
                    // InternalEasyWall.g:2433:4: enumLiteral_6= 'OSPF'
                    {
                    enumLiteral_6=(Token)match(input,66,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getNETWORKLAYERPROTOCOLAccess().getOSPFEnumLiteralDeclaration_6().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_6, grammarAccess.getNETWORKLAYERPROTOCOLAccess().getOSPFEnumLiteralDeclaration_6());
                      			
                    }

                    }


                    }
                    break;
                case 8 :
                    // InternalEasyWall.g:2440:3: (enumLiteral_7= 'IPSEC' )
                    {
                    // InternalEasyWall.g:2440:3: (enumLiteral_7= 'IPSEC' )
                    // InternalEasyWall.g:2441:4: enumLiteral_7= 'IPSEC'
                    {
                    enumLiteral_7=(Token)match(input,67,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getNETWORKLAYERPROTOCOLAccess().getIPSECEnumLiteralDeclaration_7().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_7, grammarAccess.getNETWORKLAYERPROTOCOLAccess().getIPSECEnumLiteralDeclaration_7());
                      			
                    }

                    }


                    }
                    break;
                case 9 :
                    // InternalEasyWall.g:2448:3: (enumLiteral_8= 'IGMP' )
                    {
                    // InternalEasyWall.g:2448:3: (enumLiteral_8= 'IGMP' )
                    // InternalEasyWall.g:2449:4: enumLiteral_8= 'IGMP'
                    {
                    enumLiteral_8=(Token)match(input,68,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getNETWORKLAYERPROTOCOLAccess().getIGMPEnumLiteralDeclaration_8().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_8, grammarAccess.getNETWORKLAYERPROTOCOLAccess().getIGMPEnumLiteralDeclaration_8());
                      			
                    }

                    }


                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleNETWORKLAYERPROTOCOL"


    // $ANTLR start "ruleTRANSPORTLAYERPROTOCOL"
    // InternalEasyWall.g:2459:1: ruleTRANSPORTLAYERPROTOCOL returns [Enumerator current=null] : ( (enumLiteral_0= 'UDP' ) | (enumLiteral_1= 'TCP' ) | (enumLiteral_2= 'QUIC' ) | (enumLiteral_3= 'SCTP' ) ) ;
    public final Enumerator ruleTRANSPORTLAYERPROTOCOL() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;


        	enterRule();

        try {
            // InternalEasyWall.g:2465:2: ( ( (enumLiteral_0= 'UDP' ) | (enumLiteral_1= 'TCP' ) | (enumLiteral_2= 'QUIC' ) | (enumLiteral_3= 'SCTP' ) ) )
            // InternalEasyWall.g:2466:2: ( (enumLiteral_0= 'UDP' ) | (enumLiteral_1= 'TCP' ) | (enumLiteral_2= 'QUIC' ) | (enumLiteral_3= 'SCTP' ) )
            {
            // InternalEasyWall.g:2466:2: ( (enumLiteral_0= 'UDP' ) | (enumLiteral_1= 'TCP' ) | (enumLiteral_2= 'QUIC' ) | (enumLiteral_3= 'SCTP' ) )
            int alt37=4;
            switch ( input.LA(1) ) {
            case 69:
                {
                alt37=1;
                }
                break;
            case 70:
                {
                alt37=2;
                }
                break;
            case 71:
                {
                alt37=3;
                }
                break;
            case 72:
                {
                alt37=4;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 37, 0, input);

                throw nvae;
            }

            switch (alt37) {
                case 1 :
                    // InternalEasyWall.g:2467:3: (enumLiteral_0= 'UDP' )
                    {
                    // InternalEasyWall.g:2467:3: (enumLiteral_0= 'UDP' )
                    // InternalEasyWall.g:2468:4: enumLiteral_0= 'UDP'
                    {
                    enumLiteral_0=(Token)match(input,69,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getTRANSPORTLAYERPROTOCOLAccess().getUDPEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_0, grammarAccess.getTRANSPORTLAYERPROTOCOLAccess().getUDPEnumLiteralDeclaration_0());
                      			
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalEasyWall.g:2475:3: (enumLiteral_1= 'TCP' )
                    {
                    // InternalEasyWall.g:2475:3: (enumLiteral_1= 'TCP' )
                    // InternalEasyWall.g:2476:4: enumLiteral_1= 'TCP'
                    {
                    enumLiteral_1=(Token)match(input,70,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getTRANSPORTLAYERPROTOCOLAccess().getTCPEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_1, grammarAccess.getTRANSPORTLAYERPROTOCOLAccess().getTCPEnumLiteralDeclaration_1());
                      			
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalEasyWall.g:2483:3: (enumLiteral_2= 'QUIC' )
                    {
                    // InternalEasyWall.g:2483:3: (enumLiteral_2= 'QUIC' )
                    // InternalEasyWall.g:2484:4: enumLiteral_2= 'QUIC'
                    {
                    enumLiteral_2=(Token)match(input,71,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getTRANSPORTLAYERPROTOCOLAccess().getQUICEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_2, grammarAccess.getTRANSPORTLAYERPROTOCOLAccess().getQUICEnumLiteralDeclaration_2());
                      			
                    }

                    }


                    }
                    break;
                case 4 :
                    // InternalEasyWall.g:2491:3: (enumLiteral_3= 'SCTP' )
                    {
                    // InternalEasyWall.g:2491:3: (enumLiteral_3= 'SCTP' )
                    // InternalEasyWall.g:2492:4: enumLiteral_3= 'SCTP'
                    {
                    enumLiteral_3=(Token)match(input,72,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getTRANSPORTLAYERPROTOCOLAccess().getSCTPEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_3, grammarAccess.getTRANSPORTLAYERPROTOCOLAccess().getSCTPEnumLiteralDeclaration_3());
                      			
                    }

                    }


                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleTRANSPORTLAYERPROTOCOL"


    // $ANTLR start "ruleAPPLICATIONLAYERPROTOCOL"
    // InternalEasyWall.g:2502:1: ruleAPPLICATIONLAYERPROTOCOL returns [Enumerator current=null] : ( (enumLiteral_0= 'HTTP' ) | (enumLiteral_1= 'HTTPS' ) | (enumLiteral_2= 'SMTP' ) | (enumLiteral_3= 'POP3' ) | (enumLiteral_4= 'IMAP' ) | (enumLiteral_5= 'FTP' ) | (enumLiteral_6= 'TFTP' ) | (enumLiteral_7= 'SNMP' ) | (enumLiteral_8= 'TELNET' ) | (enumLiteral_9= 'SSH' ) | (enumLiteral_10= 'DNS' ) | (enumLiteral_11= 'DHCP' ) ) ;
    public final Enumerator ruleAPPLICATIONLAYERPROTOCOL() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;
        Token enumLiteral_4=null;
        Token enumLiteral_5=null;
        Token enumLiteral_6=null;
        Token enumLiteral_7=null;
        Token enumLiteral_8=null;
        Token enumLiteral_9=null;
        Token enumLiteral_10=null;
        Token enumLiteral_11=null;


        	enterRule();

        try {
            // InternalEasyWall.g:2508:2: ( ( (enumLiteral_0= 'HTTP' ) | (enumLiteral_1= 'HTTPS' ) | (enumLiteral_2= 'SMTP' ) | (enumLiteral_3= 'POP3' ) | (enumLiteral_4= 'IMAP' ) | (enumLiteral_5= 'FTP' ) | (enumLiteral_6= 'TFTP' ) | (enumLiteral_7= 'SNMP' ) | (enumLiteral_8= 'TELNET' ) | (enumLiteral_9= 'SSH' ) | (enumLiteral_10= 'DNS' ) | (enumLiteral_11= 'DHCP' ) ) )
            // InternalEasyWall.g:2509:2: ( (enumLiteral_0= 'HTTP' ) | (enumLiteral_1= 'HTTPS' ) | (enumLiteral_2= 'SMTP' ) | (enumLiteral_3= 'POP3' ) | (enumLiteral_4= 'IMAP' ) | (enumLiteral_5= 'FTP' ) | (enumLiteral_6= 'TFTP' ) | (enumLiteral_7= 'SNMP' ) | (enumLiteral_8= 'TELNET' ) | (enumLiteral_9= 'SSH' ) | (enumLiteral_10= 'DNS' ) | (enumLiteral_11= 'DHCP' ) )
            {
            // InternalEasyWall.g:2509:2: ( (enumLiteral_0= 'HTTP' ) | (enumLiteral_1= 'HTTPS' ) | (enumLiteral_2= 'SMTP' ) | (enumLiteral_3= 'POP3' ) | (enumLiteral_4= 'IMAP' ) | (enumLiteral_5= 'FTP' ) | (enumLiteral_6= 'TFTP' ) | (enumLiteral_7= 'SNMP' ) | (enumLiteral_8= 'TELNET' ) | (enumLiteral_9= 'SSH' ) | (enumLiteral_10= 'DNS' ) | (enumLiteral_11= 'DHCP' ) )
            int alt38=12;
            switch ( input.LA(1) ) {
            case 73:
                {
                alt38=1;
                }
                break;
            case 74:
                {
                alt38=2;
                }
                break;
            case 75:
                {
                alt38=3;
                }
                break;
            case 76:
                {
                alt38=4;
                }
                break;
            case 77:
                {
                alt38=5;
                }
                break;
            case 78:
                {
                alt38=6;
                }
                break;
            case 79:
                {
                alt38=7;
                }
                break;
            case 80:
                {
                alt38=8;
                }
                break;
            case 81:
                {
                alt38=9;
                }
                break;
            case 82:
                {
                alt38=10;
                }
                break;
            case 83:
                {
                alt38=11;
                }
                break;
            case 84:
                {
                alt38=12;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 38, 0, input);

                throw nvae;
            }

            switch (alt38) {
                case 1 :
                    // InternalEasyWall.g:2510:3: (enumLiteral_0= 'HTTP' )
                    {
                    // InternalEasyWall.g:2510:3: (enumLiteral_0= 'HTTP' )
                    // InternalEasyWall.g:2511:4: enumLiteral_0= 'HTTP'
                    {
                    enumLiteral_0=(Token)match(input,73,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getAPPLICATIONLAYERPROTOCOLAccess().getHTTPEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_0, grammarAccess.getAPPLICATIONLAYERPROTOCOLAccess().getHTTPEnumLiteralDeclaration_0());
                      			
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalEasyWall.g:2518:3: (enumLiteral_1= 'HTTPS' )
                    {
                    // InternalEasyWall.g:2518:3: (enumLiteral_1= 'HTTPS' )
                    // InternalEasyWall.g:2519:4: enumLiteral_1= 'HTTPS'
                    {
                    enumLiteral_1=(Token)match(input,74,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getAPPLICATIONLAYERPROTOCOLAccess().getHTTPSEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_1, grammarAccess.getAPPLICATIONLAYERPROTOCOLAccess().getHTTPSEnumLiteralDeclaration_1());
                      			
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalEasyWall.g:2526:3: (enumLiteral_2= 'SMTP' )
                    {
                    // InternalEasyWall.g:2526:3: (enumLiteral_2= 'SMTP' )
                    // InternalEasyWall.g:2527:4: enumLiteral_2= 'SMTP'
                    {
                    enumLiteral_2=(Token)match(input,75,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getAPPLICATIONLAYERPROTOCOLAccess().getSMTPEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_2, grammarAccess.getAPPLICATIONLAYERPROTOCOLAccess().getSMTPEnumLiteralDeclaration_2());
                      			
                    }

                    }


                    }
                    break;
                case 4 :
                    // InternalEasyWall.g:2534:3: (enumLiteral_3= 'POP3' )
                    {
                    // InternalEasyWall.g:2534:3: (enumLiteral_3= 'POP3' )
                    // InternalEasyWall.g:2535:4: enumLiteral_3= 'POP3'
                    {
                    enumLiteral_3=(Token)match(input,76,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getAPPLICATIONLAYERPROTOCOLAccess().getPOP3EnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_3, grammarAccess.getAPPLICATIONLAYERPROTOCOLAccess().getPOP3EnumLiteralDeclaration_3());
                      			
                    }

                    }


                    }
                    break;
                case 5 :
                    // InternalEasyWall.g:2542:3: (enumLiteral_4= 'IMAP' )
                    {
                    // InternalEasyWall.g:2542:3: (enumLiteral_4= 'IMAP' )
                    // InternalEasyWall.g:2543:4: enumLiteral_4= 'IMAP'
                    {
                    enumLiteral_4=(Token)match(input,77,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getAPPLICATIONLAYERPROTOCOLAccess().getIMAPEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_4, grammarAccess.getAPPLICATIONLAYERPROTOCOLAccess().getIMAPEnumLiteralDeclaration_4());
                      			
                    }

                    }


                    }
                    break;
                case 6 :
                    // InternalEasyWall.g:2550:3: (enumLiteral_5= 'FTP' )
                    {
                    // InternalEasyWall.g:2550:3: (enumLiteral_5= 'FTP' )
                    // InternalEasyWall.g:2551:4: enumLiteral_5= 'FTP'
                    {
                    enumLiteral_5=(Token)match(input,78,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getAPPLICATIONLAYERPROTOCOLAccess().getFTPEnumLiteralDeclaration_5().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_5, grammarAccess.getAPPLICATIONLAYERPROTOCOLAccess().getFTPEnumLiteralDeclaration_5());
                      			
                    }

                    }


                    }
                    break;
                case 7 :
                    // InternalEasyWall.g:2558:3: (enumLiteral_6= 'TFTP' )
                    {
                    // InternalEasyWall.g:2558:3: (enumLiteral_6= 'TFTP' )
                    // InternalEasyWall.g:2559:4: enumLiteral_6= 'TFTP'
                    {
                    enumLiteral_6=(Token)match(input,79,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getAPPLICATIONLAYERPROTOCOLAccess().getTFTPEnumLiteralDeclaration_6().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_6, grammarAccess.getAPPLICATIONLAYERPROTOCOLAccess().getTFTPEnumLiteralDeclaration_6());
                      			
                    }

                    }


                    }
                    break;
                case 8 :
                    // InternalEasyWall.g:2566:3: (enumLiteral_7= 'SNMP' )
                    {
                    // InternalEasyWall.g:2566:3: (enumLiteral_7= 'SNMP' )
                    // InternalEasyWall.g:2567:4: enumLiteral_7= 'SNMP'
                    {
                    enumLiteral_7=(Token)match(input,80,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getAPPLICATIONLAYERPROTOCOLAccess().getSNMPEnumLiteralDeclaration_7().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_7, grammarAccess.getAPPLICATIONLAYERPROTOCOLAccess().getSNMPEnumLiteralDeclaration_7());
                      			
                    }

                    }


                    }
                    break;
                case 9 :
                    // InternalEasyWall.g:2574:3: (enumLiteral_8= 'TELNET' )
                    {
                    // InternalEasyWall.g:2574:3: (enumLiteral_8= 'TELNET' )
                    // InternalEasyWall.g:2575:4: enumLiteral_8= 'TELNET'
                    {
                    enumLiteral_8=(Token)match(input,81,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getAPPLICATIONLAYERPROTOCOLAccess().getTELNETEnumLiteralDeclaration_8().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_8, grammarAccess.getAPPLICATIONLAYERPROTOCOLAccess().getTELNETEnumLiteralDeclaration_8());
                      			
                    }

                    }


                    }
                    break;
                case 10 :
                    // InternalEasyWall.g:2582:3: (enumLiteral_9= 'SSH' )
                    {
                    // InternalEasyWall.g:2582:3: (enumLiteral_9= 'SSH' )
                    // InternalEasyWall.g:2583:4: enumLiteral_9= 'SSH'
                    {
                    enumLiteral_9=(Token)match(input,82,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getAPPLICATIONLAYERPROTOCOLAccess().getSSHEnumLiteralDeclaration_9().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_9, grammarAccess.getAPPLICATIONLAYERPROTOCOLAccess().getSSHEnumLiteralDeclaration_9());
                      			
                    }

                    }


                    }
                    break;
                case 11 :
                    // InternalEasyWall.g:2590:3: (enumLiteral_10= 'DNS' )
                    {
                    // InternalEasyWall.g:2590:3: (enumLiteral_10= 'DNS' )
                    // InternalEasyWall.g:2591:4: enumLiteral_10= 'DNS'
                    {
                    enumLiteral_10=(Token)match(input,83,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getAPPLICATIONLAYERPROTOCOLAccess().getDNSEnumLiteralDeclaration_10().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_10, grammarAccess.getAPPLICATIONLAYERPROTOCOLAccess().getDNSEnumLiteralDeclaration_10());
                      			
                    }

                    }


                    }
                    break;
                case 12 :
                    // InternalEasyWall.g:2598:3: (enumLiteral_11= 'DHCP' )
                    {
                    // InternalEasyWall.g:2598:3: (enumLiteral_11= 'DHCP' )
                    // InternalEasyWall.g:2599:4: enumLiteral_11= 'DHCP'
                    {
                    enumLiteral_11=(Token)match(input,84,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getAPPLICATIONLAYERPROTOCOLAccess().getDHCPEnumLiteralDeclaration_11().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_11, grammarAccess.getAPPLICATIONLAYERPROTOCOLAccess().getDHCPEnumLiteralDeclaration_11());
                      			
                    }

                    }


                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleAPPLICATIONLAYERPROTOCOL"

    // $ANTLR start synpred1_InternalEasyWall
    public final void synpred1_InternalEasyWall_fragment() throws RecognitionException {   
        // InternalEasyWall.g:1025:5: ( 'else' )
        // InternalEasyWall.g:1025:6: 'else'
        {
        match(input,29,FOLLOW_2); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred1_InternalEasyWall

    // Delegated rules

    public final boolean synpred1_InternalEasyWall() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred1_InternalEasyWall_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }


    protected DFA8 dfa8 = new DFA8(this);
    protected DFA26 dfa26 = new DFA26(this);
    static final String dfa_1s = "\17\uffff";
    static final String dfa_2s = "\1\23\2\4\1\25\1\4\6\14\1\4\2\uffff\1\14";
    static final String dfa_3s = "\1\24\2\4\1\25\1\66\6\26\1\4\2\uffff\1\26";
    static final String dfa_4s = "\14\uffff\1\2\1\1\1\uffff";
    static final String dfa_5s = "\17\uffff}>";
    static final String[] dfa_6s = {
            "\1\1\1\2",
            "\1\3",
            "\1\3",
            "\1\4",
            "\1\5\55\uffff\1\6\1\7\1\10\1\11\1\12",
            "\1\15\1\uffff\1\13\7\uffff\1\14",
            "\1\15\11\uffff\1\14",
            "\1\15\11\uffff\1\14",
            "\1\15\11\uffff\1\14",
            "\1\15\11\uffff\1\14",
            "\1\15\11\uffff\1\14",
            "\1\16",
            "",
            "",
            "\1\15\1\uffff\1\13\7\uffff\1\14"
    };

    static final short[] dfa_1 = DFA.unpackEncodedString(dfa_1s);
    static final char[] dfa_2 = DFA.unpackEncodedStringToUnsignedChars(dfa_2s);
    static final char[] dfa_3 = DFA.unpackEncodedStringToUnsignedChars(dfa_3s);
    static final short[] dfa_4 = DFA.unpackEncodedString(dfa_4s);
    static final short[] dfa_5 = DFA.unpackEncodedString(dfa_5s);
    static final short[][] dfa_6 = unpackEncodedStringArray(dfa_6s);

    class DFA8 extends DFA {

        public DFA8(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 8;
            this.eot = dfa_1;
            this.eof = dfa_1;
            this.min = dfa_2;
            this.max = dfa_3;
            this.accept = dfa_4;
            this.special = dfa_5;
            this.transition = dfa_6;
        }
        public String getDescription() {
            return "481:2: ( ( (otherlv_0= 'set' | otherlv_1= 'var' ) this_EFTypedDeclaration_2= ruleEFTypedDeclaration[$current] otherlv_3= ';' ) | this_EFVariableDeclaration_4= ruleEFVariableDeclaration )";
        }
    }
    static final String dfa_7s = "\22\uffff";
    static final String dfa_8s = "\15\uffff\1\20\3\uffff\1\20";
    static final String dfa_9s = "\1\4\14\uffff\1\14\1\4\2\uffff\1\14";
    static final String dfa_10s = "\1\124\14\uffff\1\61\1\4\2\uffff\1\61";
    static final String dfa_11s = "\1\uffff\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\11\1\12\1\13\1\14\2\uffff\1\15\1\16\1\uffff";
    static final String dfa_12s = "\22\uffff}>";
    static final String[] dfa_13s = {
            "\1\15\1\1\1\2\21\uffff\1\14\5\uffff\2\3\1\11\1\12\1\13\17\uffff\5\4\2\5\3\uffff\11\6\4\7\14\10",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\20\1\uffff\1\16\7\uffff\1\20\1\uffff\1\17\2\20\12\uffff\4\20\2\uffff\7\20",
            "\1\21",
            "",
            "",
            "\1\20\1\uffff\1\16\7\uffff\1\20\1\uffff\1\17\2\20\12\uffff\4\20\2\uffff\7\20"
    };

    static final short[] dfa_7 = DFA.unpackEncodedString(dfa_7s);
    static final short[] dfa_8 = DFA.unpackEncodedString(dfa_8s);
    static final char[] dfa_9 = DFA.unpackEncodedStringToUnsignedChars(dfa_9s);
    static final char[] dfa_10 = DFA.unpackEncodedStringToUnsignedChars(dfa_10s);
    static final short[] dfa_11 = DFA.unpackEncodedString(dfa_11s);
    static final short[] dfa_12 = DFA.unpackEncodedString(dfa_12s);
    static final short[][] dfa_13 = unpackEncodedStringArray(dfa_13s);

    class DFA26 extends DFA {

        public DFA26(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 26;
            this.eot = dfa_7;
            this.eof = dfa_8;
            this.min = dfa_9;
            this.max = dfa_10;
            this.accept = dfa_11;
            this.special = dfa_12;
            this.transition = dfa_13;
        }
        public String getDescription() {
            return "1511:2: ( ( () ( (lv_value_1_0= RULE_STRING ) ) ) | ( () ( (lv_value_3_0= RULE_INT ) ) ) | ( () ( ( (lv_value_5_1= 'true' | lv_value_5_2= 'false' ) ) ) ) | ( () ( (lv_type_7_0= ruleEFNetworkNativeType ) ) ) | ( () ( (lv_direction_9_0= ruleEFDirectionNativeType ) ) ) | ( () ( (lv_protocol_11_0= ruleNETWORKLAYERPROTOCOL ) ) ) | ( () ( (lv_protocol_13_0= ruleTRANSPORTLAYERPROTOCOL ) ) ) | ( () ( (lv_protocol_15_0= ruleAPPLICATIONLAYERPROTOCOL ) ) ) | ( () otherlv_17= 'this' ) | ( () otherlv_19= 'super' ) | ( () otherlv_21= 'new' ( ( ruleQualifiedName ) ) otherlv_23= '(' otherlv_24= ')' ) | ( () otherlv_26= '(' ( (lv_expression_27_0= ruleEFExpression ) ) otherlv_28= ')' ) | ( () ( (lv_functionName_30_0= ruleQualifiedName ) ) otherlv_31= '(' ( ( (lv_args_32_0= ruleEFExpression ) ) (otherlv_33= ',' ( (lv_args_34_0= ruleEFExpression ) ) )* )? otherlv_35= ')' ) | ( () ( (lv_symbol_37_0= ruleQualifiedName ) ) ) )";
        }
    }
 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000800010000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000002002L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000004002L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x00000000009C0000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x007C000000000010L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0xF1FC0607C1000070L,0x00000000001FFFFFL});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000004000010L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000006000000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0xF1FC0607D91C0070L,0x00000000001FFFFFL});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0xF1FC0607D91A0070L,0x00000000001FFFFFL});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000020000002L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000000400002L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000006000000002L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000018000000002L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000380000000002L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0003C00000000002L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0xF1FC0607C5000070L,0x00000000001FFFFFL});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0E00000000000000L});

}