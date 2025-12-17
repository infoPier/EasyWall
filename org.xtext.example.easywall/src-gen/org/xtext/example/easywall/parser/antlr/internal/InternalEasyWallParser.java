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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_INT", "RULE_EFIPV6SYNTAX", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'pack'", "';'", "'import'", "'.'", "'.*'", "'firewall'", "'{'", "'}'", "'set'", "'var'", "'='", "':'", "'fun'", "'('", "','", "')'", "'return'", "'if'", "'else'", "'true'", "'false'", "'this'", "'super'", "'new'", "'rule'", "'at'", "'||'", "'or'", "'&&'", "'and'", "'!'", "'not'", "'=='", "'!='", "'isequalto'", "'>='", "'<='", "'>'", "'<'", "'any'", "'localhost'", "'/'", "'network'", "'netip'", "'netipv6'", "'netport'", "'protocol'", "'direction'", "'netmask'", "'in'", "'out'", "'NetworkLayer'", "'TransportLayer'", "'ApplicationLayer'", "'IPv4'", "'IPv6'", "'ARP'", "'ICMP'", "'NAT'", "'RIP'", "'OSPF'", "'IPSEC'", "'IGMP'", "'UDP'", "'TCP'", "'QUIC'", "'SCTP'", "'HTTP'", "'HTTPS'", "'SMTP'", "'POP3'", "'IMAP'", "'FTP'", "'TFTP'", "'SNMP'", "'TELNET'", "'SSH'", "'DNS'", "'DHCP'"
    };
    public static final int T__50=50;
    public static final int T__90=90;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__59=59;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
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
    public static final int RULE_ML_COMMENT=8;
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
    public static final int RULE_SL_COMMENT=9;
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
    public static final int RULE_WS=10;
    public static final int RULE_ANY_OTHER=11;
    public static final int RULE_EFIPV6SYNTAX=7;
    public static final int T__48=48;
    public static final int T__49=49;
    public static final int T__44=44;
    public static final int T__88=88;
    public static final int T__45=45;
    public static final int T__89=89;
    public static final int T__46=46;
    public static final int T__47=47;
    public static final int T__40=40;
    public static final int T__84=84;
    public static final int T__41=41;
    public static final int T__85=85;
    public static final int T__42=42;
    public static final int T__86=86;
    public static final int T__43=43;
    public static final int T__87=87;

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

            if ( (LA1_0==36) ) {
                alt1=1;
            }
            else if ( (LA1_0==17) ) {
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

            if ( (LA2_0==12) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // InternalEasyWall.g:156:4: otherlv_1= 'pack' ( (lv_name_2_0= ruleQualifiedName ) ) otherlv_3= ';'
                    {
                    otherlv_1=(Token)match(input,12,FOLLOW_4); if (state.failed) return current;
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

                    otherlv_3=(Token)match(input,13,FOLLOW_6); if (state.failed) return current;
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

                if ( (LA3_0==14) ) {
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
            otherlv_0=(Token)match(input,14,FOLLOW_4); if (state.failed) return current;
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

            otherlv_2=(Token)match(input,13,FOLLOW_2); if (state.failed) return current;
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

                if ( (LA4_0==15) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalEasyWall.g:312:4: kw= '.' this_ID_2= RULE_ID
            	    {
            	    kw=(Token)match(input,15,FOLLOW_4); if (state.failed) return current;
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
            kw=(Token)match(input,16,FOLLOW_2); if (state.failed) return current;
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
            otherlv_0=(Token)match(input,17,FOLLOW_4); if (state.failed) return current;
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

            otherlv_2=(Token)match(input,18,FOLLOW_10); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getEFFireClassAccess().getLeftCurlyBracketKeyword_2());
              		
            }
            // InternalEasyWall.g:404:3: ( (lv_members_3_0= ruleEFMember ) )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( ((LA5_0>=20 && LA5_0<=21)||LA5_0==24) ) {
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

            otherlv_4=(Token)match(input,19,FOLLOW_2); if (state.failed) return current;
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

            if ( ((LA6_0>=20 && LA6_0<=21)) ) {
                alt6=1;
            }
            else if ( (LA6_0==24) ) {
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
    // InternalEasyWall.g:474:1: ruleEFField returns [EObject current=null] : ( (otherlv_0= 'set' | otherlv_1= 'var' ) this_EFTypedDeclaration_2= ruleEFTypedDeclaration[$current] (otherlv_3= '=' ( (lv_expression_4_0= ruleEFExpression ) ) )? otherlv_5= ';' ) ;
    public final EObject ruleEFField() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject this_EFTypedDeclaration_2 = null;

        EObject lv_expression_4_0 = null;



        	enterRule();

        try {
            // InternalEasyWall.g:480:2: ( ( (otherlv_0= 'set' | otherlv_1= 'var' ) this_EFTypedDeclaration_2= ruleEFTypedDeclaration[$current] (otherlv_3= '=' ( (lv_expression_4_0= ruleEFExpression ) ) )? otherlv_5= ';' ) )
            // InternalEasyWall.g:481:2: ( (otherlv_0= 'set' | otherlv_1= 'var' ) this_EFTypedDeclaration_2= ruleEFTypedDeclaration[$current] (otherlv_3= '=' ( (lv_expression_4_0= ruleEFExpression ) ) )? otherlv_5= ';' )
            {
            // InternalEasyWall.g:481:2: ( (otherlv_0= 'set' | otherlv_1= 'var' ) this_EFTypedDeclaration_2= ruleEFTypedDeclaration[$current] (otherlv_3= '=' ( (lv_expression_4_0= ruleEFExpression ) ) )? otherlv_5= ';' )
            // InternalEasyWall.g:482:3: (otherlv_0= 'set' | otherlv_1= 'var' ) this_EFTypedDeclaration_2= ruleEFTypedDeclaration[$current] (otherlv_3= '=' ( (lv_expression_4_0= ruleEFExpression ) ) )? otherlv_5= ';'
            {
            // InternalEasyWall.g:482:3: (otherlv_0= 'set' | otherlv_1= 'var' )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==20) ) {
                alt7=1;
            }
            else if ( (LA7_0==21) ) {
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
                    // InternalEasyWall.g:483:4: otherlv_0= 'set'
                    {
                    otherlv_0=(Token)match(input,20,FOLLOW_4); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_0, grammarAccess.getEFFieldAccess().getSetKeyword_0_0());
                      			
                    }

                    }
                    break;
                case 2 :
                    // InternalEasyWall.g:488:4: otherlv_1= 'var'
                    {
                    otherlv_1=(Token)match(input,21,FOLLOW_4); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_1, grammarAccess.getEFFieldAccess().getVarKeyword_0_1());
                      			
                    }

                    }
                    break;

            }

            if ( state.backtracking==0 ) {

              			if (current==null) {
              				current = createModelElement(grammarAccess.getEFFieldRule());
              			}
              			newCompositeNode(grammarAccess.getEFFieldAccess().getEFTypedDeclarationParserRuleCall_1());
              		
            }
            pushFollow(FOLLOW_11);
            this_EFTypedDeclaration_2=ruleEFTypedDeclaration(current);

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_EFTypedDeclaration_2;
              			afterParserOrEnumRuleCall();
              		
            }
            // InternalEasyWall.g:504:3: (otherlv_3= '=' ( (lv_expression_4_0= ruleEFExpression ) ) )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==22) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // InternalEasyWall.g:505:4: otherlv_3= '=' ( (lv_expression_4_0= ruleEFExpression ) )
                    {
                    otherlv_3=(Token)match(input,22,FOLLOW_12); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_3, grammarAccess.getEFFieldAccess().getEqualsSignKeyword_2_0());
                      			
                    }
                    // InternalEasyWall.g:509:4: ( (lv_expression_4_0= ruleEFExpression ) )
                    // InternalEasyWall.g:510:5: (lv_expression_4_0= ruleEFExpression )
                    {
                    // InternalEasyWall.g:510:5: (lv_expression_4_0= ruleEFExpression )
                    // InternalEasyWall.g:511:6: lv_expression_4_0= ruleEFExpression
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getEFFieldAccess().getExpressionEFExpressionParserRuleCall_2_1_0());
                      					
                    }
                    pushFollow(FOLLOW_5);
                    lv_expression_4_0=ruleEFExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getEFFieldRule());
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


                    }
                    break;

            }

            otherlv_5=(Token)match(input,13,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_5, grammarAccess.getEFFieldAccess().getSemicolonKeyword_3());
              		
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
    // $ANTLR end "ruleEFField"


    // $ANTLR start "ruleEFTypedDeclaration"
    // InternalEasyWall.g:538:1: ruleEFTypedDeclaration[EObject in_current] returns [EObject current=in_current] : ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( ( ( ruleQualifiedName ) ) | ( (lv_nativetype_3_0= ruleEFNetworkNativeType ) ) ) ) ;
    public final EObject ruleEFTypedDeclaration(EObject in_current) throws RecognitionException {
        EObject current = in_current;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Enumerator lv_nativetype_3_0 = null;



        	enterRule();

        try {
            // InternalEasyWall.g:544:2: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( ( ( ruleQualifiedName ) ) | ( (lv_nativetype_3_0= ruleEFNetworkNativeType ) ) ) ) )
            // InternalEasyWall.g:545:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( ( ( ruleQualifiedName ) ) | ( (lv_nativetype_3_0= ruleEFNetworkNativeType ) ) ) )
            {
            // InternalEasyWall.g:545:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( ( ( ruleQualifiedName ) ) | ( (lv_nativetype_3_0= ruleEFNetworkNativeType ) ) ) )
            // InternalEasyWall.g:546:3: ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( ( ( ruleQualifiedName ) ) | ( (lv_nativetype_3_0= ruleEFNetworkNativeType ) ) )
            {
            // InternalEasyWall.g:546:3: ( (lv_name_0_0= RULE_ID ) )
            // InternalEasyWall.g:547:4: (lv_name_0_0= RULE_ID )
            {
            // InternalEasyWall.g:547:4: (lv_name_0_0= RULE_ID )
            // InternalEasyWall.g:548:5: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_13); if (state.failed) return current;
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

            otherlv_1=(Token)match(input,23,FOLLOW_14); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getEFTypedDeclarationAccess().getColonKeyword_1());
              		
            }
            // InternalEasyWall.g:568:3: ( ( ( ruleQualifiedName ) ) | ( (lv_nativetype_3_0= ruleEFNetworkNativeType ) ) )
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==RULE_ID) ) {
                alt9=1;
            }
            else if ( ((LA9_0>=54 && LA9_0<=60)) ) {
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
                    // InternalEasyWall.g:569:4: ( ( ruleQualifiedName ) )
                    {
                    // InternalEasyWall.g:569:4: ( ( ruleQualifiedName ) )
                    // InternalEasyWall.g:570:5: ( ruleQualifiedName )
                    {
                    // InternalEasyWall.g:570:5: ( ruleQualifiedName )
                    // InternalEasyWall.g:571:6: ruleQualifiedName
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
                    // InternalEasyWall.g:586:4: ( (lv_nativetype_3_0= ruleEFNetworkNativeType ) )
                    {
                    // InternalEasyWall.g:586:4: ( (lv_nativetype_3_0= ruleEFNetworkNativeType ) )
                    // InternalEasyWall.g:587:5: (lv_nativetype_3_0= ruleEFNetworkNativeType )
                    {
                    // InternalEasyWall.g:587:5: (lv_nativetype_3_0= ruleEFNetworkNativeType )
                    // InternalEasyWall.g:588:6: lv_nativetype_3_0= ruleEFNetworkNativeType
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


    // $ANTLR start "entryRuleEFMethod"
    // InternalEasyWall.g:610:1: entryRuleEFMethod returns [EObject current=null] : iv_ruleEFMethod= ruleEFMethod EOF ;
    public final EObject entryRuleEFMethod() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEFMethod = null;


        try {
            // InternalEasyWall.g:610:49: (iv_ruleEFMethod= ruleEFMethod EOF )
            // InternalEasyWall.g:611:2: iv_ruleEFMethod= ruleEFMethod EOF
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
    // InternalEasyWall.g:617:1: ruleEFMethod returns [EObject current=null] : (otherlv_0= 'fun' this_EFTypedDeclaration_1= ruleEFTypedDeclaration[$current] otherlv_2= '(' ( ( (lv_params_3_0= ruleEFParameter ) ) (otherlv_4= ',' ( (lv_params_5_0= ruleEFParameter ) ) )* )? otherlv_6= ')' ( (lv_body_7_0= ruleEFBlock ) ) ) ;
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
            // InternalEasyWall.g:623:2: ( (otherlv_0= 'fun' this_EFTypedDeclaration_1= ruleEFTypedDeclaration[$current] otherlv_2= '(' ( ( (lv_params_3_0= ruleEFParameter ) ) (otherlv_4= ',' ( (lv_params_5_0= ruleEFParameter ) ) )* )? otherlv_6= ')' ( (lv_body_7_0= ruleEFBlock ) ) ) )
            // InternalEasyWall.g:624:2: (otherlv_0= 'fun' this_EFTypedDeclaration_1= ruleEFTypedDeclaration[$current] otherlv_2= '(' ( ( (lv_params_3_0= ruleEFParameter ) ) (otherlv_4= ',' ( (lv_params_5_0= ruleEFParameter ) ) )* )? otherlv_6= ')' ( (lv_body_7_0= ruleEFBlock ) ) )
            {
            // InternalEasyWall.g:624:2: (otherlv_0= 'fun' this_EFTypedDeclaration_1= ruleEFTypedDeclaration[$current] otherlv_2= '(' ( ( (lv_params_3_0= ruleEFParameter ) ) (otherlv_4= ',' ( (lv_params_5_0= ruleEFParameter ) ) )* )? otherlv_6= ')' ( (lv_body_7_0= ruleEFBlock ) ) )
            // InternalEasyWall.g:625:3: otherlv_0= 'fun' this_EFTypedDeclaration_1= ruleEFTypedDeclaration[$current] otherlv_2= '(' ( ( (lv_params_3_0= ruleEFParameter ) ) (otherlv_4= ',' ( (lv_params_5_0= ruleEFParameter ) ) )* )? otherlv_6= ')' ( (lv_body_7_0= ruleEFBlock ) )
            {
            otherlv_0=(Token)match(input,24,FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getEFMethodAccess().getFunKeyword_0());
              		
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
            otherlv_2=(Token)match(input,25,FOLLOW_16); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getEFMethodAccess().getLeftParenthesisKeyword_2());
              		
            }
            // InternalEasyWall.g:644:3: ( ( (lv_params_3_0= ruleEFParameter ) ) (otherlv_4= ',' ( (lv_params_5_0= ruleEFParameter ) ) )* )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==RULE_ID) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // InternalEasyWall.g:645:4: ( (lv_params_3_0= ruleEFParameter ) ) (otherlv_4= ',' ( (lv_params_5_0= ruleEFParameter ) ) )*
                    {
                    // InternalEasyWall.g:645:4: ( (lv_params_3_0= ruleEFParameter ) )
                    // InternalEasyWall.g:646:5: (lv_params_3_0= ruleEFParameter )
                    {
                    // InternalEasyWall.g:646:5: (lv_params_3_0= ruleEFParameter )
                    // InternalEasyWall.g:647:6: lv_params_3_0= ruleEFParameter
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

                    // InternalEasyWall.g:664:4: (otherlv_4= ',' ( (lv_params_5_0= ruleEFParameter ) ) )*
                    loop10:
                    do {
                        int alt10=2;
                        int LA10_0 = input.LA(1);

                        if ( (LA10_0==26) ) {
                            alt10=1;
                        }


                        switch (alt10) {
                    	case 1 :
                    	    // InternalEasyWall.g:665:5: otherlv_4= ',' ( (lv_params_5_0= ruleEFParameter ) )
                    	    {
                    	    otherlv_4=(Token)match(input,26,FOLLOW_4); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      					newLeafNode(otherlv_4, grammarAccess.getEFMethodAccess().getCommaKeyword_3_1_0());
                    	      				
                    	    }
                    	    // InternalEasyWall.g:669:5: ( (lv_params_5_0= ruleEFParameter ) )
                    	    // InternalEasyWall.g:670:6: (lv_params_5_0= ruleEFParameter )
                    	    {
                    	    // InternalEasyWall.g:670:6: (lv_params_5_0= ruleEFParameter )
                    	    // InternalEasyWall.g:671:7: lv_params_5_0= ruleEFParameter
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
                    	    break loop10;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_6=(Token)match(input,27,FOLLOW_9); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_6, grammarAccess.getEFMethodAccess().getRightParenthesisKeyword_4());
              		
            }
            // InternalEasyWall.g:694:3: ( (lv_body_7_0= ruleEFBlock ) )
            // InternalEasyWall.g:695:4: (lv_body_7_0= ruleEFBlock )
            {
            // InternalEasyWall.g:695:4: (lv_body_7_0= ruleEFBlock )
            // InternalEasyWall.g:696:5: lv_body_7_0= ruleEFBlock
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
    // InternalEasyWall.g:717:1: entryRuleEFParameter returns [EObject current=null] : iv_ruleEFParameter= ruleEFParameter EOF ;
    public final EObject entryRuleEFParameter() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEFParameter = null;


        try {
            // InternalEasyWall.g:717:52: (iv_ruleEFParameter= ruleEFParameter EOF )
            // InternalEasyWall.g:718:2: iv_ruleEFParameter= ruleEFParameter EOF
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
    // InternalEasyWall.g:724:1: ruleEFParameter returns [EObject current=null] : this_EFTypedDeclaration_0= ruleEFTypedDeclaration[$current] ;
    public final EObject ruleEFParameter() throws RecognitionException {
        EObject current = null;

        EObject this_EFTypedDeclaration_0 = null;



        	enterRule();

        try {
            // InternalEasyWall.g:730:2: (this_EFTypedDeclaration_0= ruleEFTypedDeclaration[$current] )
            // InternalEasyWall.g:731:2: this_EFTypedDeclaration_0= ruleEFTypedDeclaration[$current]
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
    // InternalEasyWall.g:745:1: entryRuleEFBlock returns [EObject current=null] : iv_ruleEFBlock= ruleEFBlock EOF ;
    public final EObject entryRuleEFBlock() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEFBlock = null;


        try {
            // InternalEasyWall.g:745:48: (iv_ruleEFBlock= ruleEFBlock EOF )
            // InternalEasyWall.g:746:2: iv_ruleEFBlock= ruleEFBlock EOF
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
    // InternalEasyWall.g:752:1: ruleEFBlock returns [EObject current=null] : ( () otherlv_1= '{' ( (lv_statements_2_0= ruleEFStatement ) )* otherlv_3= '}' ) ;
    public final EObject ruleEFBlock() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_statements_2_0 = null;



        	enterRule();

        try {
            // InternalEasyWall.g:758:2: ( ( () otherlv_1= '{' ( (lv_statements_2_0= ruleEFStatement ) )* otherlv_3= '}' ) )
            // InternalEasyWall.g:759:2: ( () otherlv_1= '{' ( (lv_statements_2_0= ruleEFStatement ) )* otherlv_3= '}' )
            {
            // InternalEasyWall.g:759:2: ( () otherlv_1= '{' ( (lv_statements_2_0= ruleEFStatement ) )* otherlv_3= '}' )
            // InternalEasyWall.g:760:3: () otherlv_1= '{' ( (lv_statements_2_0= ruleEFStatement ) )* otherlv_3= '}'
            {
            // InternalEasyWall.g:760:3: ()
            // InternalEasyWall.g:761:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getEFBlockAccess().getEFBlockAction_0(),
              					current);
              			
            }

            }

            otherlv_1=(Token)match(input,18,FOLLOW_18); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getEFBlockAccess().getLeftCurlyBracketKeyword_1());
              		
            }
            // InternalEasyWall.g:771:3: ( (lv_statements_2_0= ruleEFStatement ) )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( ((LA12_0>=RULE_ID && LA12_0<=RULE_EFIPV6SYNTAX)||(LA12_0>=20 && LA12_0<=21)||LA12_0==23||LA12_0==25||(LA12_0>=28 && LA12_0<=29)||(LA12_0>=31 && LA12_0<=35)||(LA12_0>=42 && LA12_0<=43)||(LA12_0>=51 && LA12_0<=62)||(LA12_0>=66 && LA12_0<=90)) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // InternalEasyWall.g:772:4: (lv_statements_2_0= ruleEFStatement )
            	    {
            	    // InternalEasyWall.g:772:4: (lv_statements_2_0= ruleEFStatement )
            	    // InternalEasyWall.g:773:5: lv_statements_2_0= ruleEFStatement
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
            	    break loop12;
                }
            } while (true);

            otherlv_3=(Token)match(input,19,FOLLOW_2); if (state.failed) return current;
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
    // InternalEasyWall.g:798:1: entryRuleEFStatement returns [EObject current=null] : iv_ruleEFStatement= ruleEFStatement EOF ;
    public final EObject entryRuleEFStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEFStatement = null;


        try {
            // InternalEasyWall.g:798:52: (iv_ruleEFStatement= ruleEFStatement EOF )
            // InternalEasyWall.g:799:2: iv_ruleEFStatement= ruleEFStatement EOF
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
    // InternalEasyWall.g:805:1: ruleEFStatement returns [EObject current=null] : (this_EFField_0= ruleEFField | this_EFReturn_1= ruleEFReturn | (this_EFExpression_2= ruleEFExpression otherlv_3= ';' ) | this_EFIfStatement_4= ruleEFIfStatement ) ;
    public final EObject ruleEFStatement() throws RecognitionException {
        EObject current = null;

        Token otherlv_3=null;
        EObject this_EFField_0 = null;

        EObject this_EFReturn_1 = null;

        EObject this_EFExpression_2 = null;

        EObject this_EFIfStatement_4 = null;



        	enterRule();

        try {
            // InternalEasyWall.g:811:2: ( (this_EFField_0= ruleEFField | this_EFReturn_1= ruleEFReturn | (this_EFExpression_2= ruleEFExpression otherlv_3= ';' ) | this_EFIfStatement_4= ruleEFIfStatement ) )
            // InternalEasyWall.g:812:2: (this_EFField_0= ruleEFField | this_EFReturn_1= ruleEFReturn | (this_EFExpression_2= ruleEFExpression otherlv_3= ';' ) | this_EFIfStatement_4= ruleEFIfStatement )
            {
            // InternalEasyWall.g:812:2: (this_EFField_0= ruleEFField | this_EFReturn_1= ruleEFReturn | (this_EFExpression_2= ruleEFExpression otherlv_3= ';' ) | this_EFIfStatement_4= ruleEFIfStatement )
            int alt13=4;
            switch ( input.LA(1) ) {
            case 20:
            case 21:
                {
                alt13=1;
                }
                break;
            case 28:
                {
                alt13=2;
                }
                break;
            case RULE_ID:
            case RULE_STRING:
            case RULE_INT:
            case RULE_EFIPV6SYNTAX:
            case 23:
            case 25:
            case 31:
            case 32:
            case 33:
            case 34:
            case 35:
            case 42:
            case 43:
            case 51:
            case 52:
            case 53:
            case 54:
            case 55:
            case 56:
            case 57:
            case 58:
            case 59:
            case 60:
            case 61:
            case 62:
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
            case 85:
            case 86:
            case 87:
            case 88:
            case 89:
            case 90:
                {
                alt13=3;
                }
                break;
            case 29:
                {
                alt13=4;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 13, 0, input);

                throw nvae;
            }

            switch (alt13) {
                case 1 :
                    // InternalEasyWall.g:813:3: this_EFField_0= ruleEFField
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getEFStatementAccess().getEFFieldParserRuleCall_0());
                      		
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
                    // InternalEasyWall.g:822:3: this_EFReturn_1= ruleEFReturn
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
                    // InternalEasyWall.g:831:3: (this_EFExpression_2= ruleEFExpression otherlv_3= ';' )
                    {
                    // InternalEasyWall.g:831:3: (this_EFExpression_2= ruleEFExpression otherlv_3= ';' )
                    // InternalEasyWall.g:832:4: this_EFExpression_2= ruleEFExpression otherlv_3= ';'
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
                    otherlv_3=(Token)match(input,13,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_3, grammarAccess.getEFStatementAccess().getSemicolonKeyword_2_1());
                      			
                    }

                    }


                    }
                    break;
                case 4 :
                    // InternalEasyWall.g:846:3: this_EFIfStatement_4= ruleEFIfStatement
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
    // InternalEasyWall.g:858:1: entryRuleEFReturn returns [EObject current=null] : iv_ruleEFReturn= ruleEFReturn EOF ;
    public final EObject entryRuleEFReturn() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEFReturn = null;


        try {
            // InternalEasyWall.g:858:49: (iv_ruleEFReturn= ruleEFReturn EOF )
            // InternalEasyWall.g:859:2: iv_ruleEFReturn= ruleEFReturn EOF
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
    // InternalEasyWall.g:865:1: ruleEFReturn returns [EObject current=null] : (otherlv_0= 'return' ( (lv_expression_1_0= ruleEFExpression ) ) otherlv_2= ';' ) ;
    public final EObject ruleEFReturn() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_expression_1_0 = null;



        	enterRule();

        try {
            // InternalEasyWall.g:871:2: ( (otherlv_0= 'return' ( (lv_expression_1_0= ruleEFExpression ) ) otherlv_2= ';' ) )
            // InternalEasyWall.g:872:2: (otherlv_0= 'return' ( (lv_expression_1_0= ruleEFExpression ) ) otherlv_2= ';' )
            {
            // InternalEasyWall.g:872:2: (otherlv_0= 'return' ( (lv_expression_1_0= ruleEFExpression ) ) otherlv_2= ';' )
            // InternalEasyWall.g:873:3: otherlv_0= 'return' ( (lv_expression_1_0= ruleEFExpression ) ) otherlv_2= ';'
            {
            otherlv_0=(Token)match(input,28,FOLLOW_12); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getEFReturnAccess().getReturnKeyword_0());
              		
            }
            // InternalEasyWall.g:877:3: ( (lv_expression_1_0= ruleEFExpression ) )
            // InternalEasyWall.g:878:4: (lv_expression_1_0= ruleEFExpression )
            {
            // InternalEasyWall.g:878:4: (lv_expression_1_0= ruleEFExpression )
            // InternalEasyWall.g:879:5: lv_expression_1_0= ruleEFExpression
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

            otherlv_2=(Token)match(input,13,FOLLOW_2); if (state.failed) return current;
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
    // InternalEasyWall.g:904:1: entryRuleEFIfStatement returns [EObject current=null] : iv_ruleEFIfStatement= ruleEFIfStatement EOF ;
    public final EObject entryRuleEFIfStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEFIfStatement = null;


        try {
            // InternalEasyWall.g:904:54: (iv_ruleEFIfStatement= ruleEFIfStatement EOF )
            // InternalEasyWall.g:905:2: iv_ruleEFIfStatement= ruleEFIfStatement EOF
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
    // InternalEasyWall.g:911:1: ruleEFIfStatement returns [EObject current=null] : (otherlv_0= 'if' otherlv_1= '(' ( (lv_expression_2_0= ruleEFExpression ) ) otherlv_3= ')' ( (lv_thenBlock_4_0= ruleEFIfBlock ) ) ( ( ( 'else' )=>otherlv_5= 'else' ) ( (lv_elseBlock_6_0= ruleEFIfBlock ) ) )? ) ;
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
            // InternalEasyWall.g:917:2: ( (otherlv_0= 'if' otherlv_1= '(' ( (lv_expression_2_0= ruleEFExpression ) ) otherlv_3= ')' ( (lv_thenBlock_4_0= ruleEFIfBlock ) ) ( ( ( 'else' )=>otherlv_5= 'else' ) ( (lv_elseBlock_6_0= ruleEFIfBlock ) ) )? ) )
            // InternalEasyWall.g:918:2: (otherlv_0= 'if' otherlv_1= '(' ( (lv_expression_2_0= ruleEFExpression ) ) otherlv_3= ')' ( (lv_thenBlock_4_0= ruleEFIfBlock ) ) ( ( ( 'else' )=>otherlv_5= 'else' ) ( (lv_elseBlock_6_0= ruleEFIfBlock ) ) )? )
            {
            // InternalEasyWall.g:918:2: (otherlv_0= 'if' otherlv_1= '(' ( (lv_expression_2_0= ruleEFExpression ) ) otherlv_3= ')' ( (lv_thenBlock_4_0= ruleEFIfBlock ) ) ( ( ( 'else' )=>otherlv_5= 'else' ) ( (lv_elseBlock_6_0= ruleEFIfBlock ) ) )? )
            // InternalEasyWall.g:919:3: otherlv_0= 'if' otherlv_1= '(' ( (lv_expression_2_0= ruleEFExpression ) ) otherlv_3= ')' ( (lv_thenBlock_4_0= ruleEFIfBlock ) ) ( ( ( 'else' )=>otherlv_5= 'else' ) ( (lv_elseBlock_6_0= ruleEFIfBlock ) ) )?
            {
            otherlv_0=(Token)match(input,29,FOLLOW_15); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getEFIfStatementAccess().getIfKeyword_0());
              		
            }
            otherlv_1=(Token)match(input,25,FOLLOW_12); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getEFIfStatementAccess().getLeftParenthesisKeyword_1());
              		
            }
            // InternalEasyWall.g:927:3: ( (lv_expression_2_0= ruleEFExpression ) )
            // InternalEasyWall.g:928:4: (lv_expression_2_0= ruleEFExpression )
            {
            // InternalEasyWall.g:928:4: (lv_expression_2_0= ruleEFExpression )
            // InternalEasyWall.g:929:5: lv_expression_2_0= ruleEFExpression
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

            otherlv_3=(Token)match(input,27,FOLLOW_20); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_3, grammarAccess.getEFIfStatementAccess().getRightParenthesisKeyword_3());
              		
            }
            // InternalEasyWall.g:950:3: ( (lv_thenBlock_4_0= ruleEFIfBlock ) )
            // InternalEasyWall.g:951:4: (lv_thenBlock_4_0= ruleEFIfBlock )
            {
            // InternalEasyWall.g:951:4: (lv_thenBlock_4_0= ruleEFIfBlock )
            // InternalEasyWall.g:952:5: lv_thenBlock_4_0= ruleEFIfBlock
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

            // InternalEasyWall.g:969:3: ( ( ( 'else' )=>otherlv_5= 'else' ) ( (lv_elseBlock_6_0= ruleEFIfBlock ) ) )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==30) ) {
                int LA14_1 = input.LA(2);

                if ( (synpred1_InternalEasyWall()) ) {
                    alt14=1;
                }
            }
            switch (alt14) {
                case 1 :
                    // InternalEasyWall.g:970:4: ( ( 'else' )=>otherlv_5= 'else' ) ( (lv_elseBlock_6_0= ruleEFIfBlock ) )
                    {
                    // InternalEasyWall.g:970:4: ( ( 'else' )=>otherlv_5= 'else' )
                    // InternalEasyWall.g:971:5: ( 'else' )=>otherlv_5= 'else'
                    {
                    otherlv_5=(Token)match(input,30,FOLLOW_20); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(otherlv_5, grammarAccess.getEFIfStatementAccess().getElseKeyword_5_0());
                      				
                    }

                    }

                    // InternalEasyWall.g:977:4: ( (lv_elseBlock_6_0= ruleEFIfBlock ) )
                    // InternalEasyWall.g:978:5: (lv_elseBlock_6_0= ruleEFIfBlock )
                    {
                    // InternalEasyWall.g:978:5: (lv_elseBlock_6_0= ruleEFIfBlock )
                    // InternalEasyWall.g:979:6: lv_elseBlock_6_0= ruleEFIfBlock
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
    // InternalEasyWall.g:1001:1: entryRuleEFIfBlock returns [EObject current=null] : iv_ruleEFIfBlock= ruleEFIfBlock EOF ;
    public final EObject entryRuleEFIfBlock() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEFIfBlock = null;


        try {
            // InternalEasyWall.g:1001:50: (iv_ruleEFIfBlock= ruleEFIfBlock EOF )
            // InternalEasyWall.g:1002:2: iv_ruleEFIfBlock= ruleEFIfBlock EOF
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
    // InternalEasyWall.g:1008:1: ruleEFIfBlock returns [EObject current=null] : ( ( (lv_statements_0_0= ruleEFStatement ) ) | this_EFBlock_1= ruleEFBlock ) ;
    public final EObject ruleEFIfBlock() throws RecognitionException {
        EObject current = null;

        EObject lv_statements_0_0 = null;

        EObject this_EFBlock_1 = null;



        	enterRule();

        try {
            // InternalEasyWall.g:1014:2: ( ( ( (lv_statements_0_0= ruleEFStatement ) ) | this_EFBlock_1= ruleEFBlock ) )
            // InternalEasyWall.g:1015:2: ( ( (lv_statements_0_0= ruleEFStatement ) ) | this_EFBlock_1= ruleEFBlock )
            {
            // InternalEasyWall.g:1015:2: ( ( (lv_statements_0_0= ruleEFStatement ) ) | this_EFBlock_1= ruleEFBlock )
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( ((LA15_0>=RULE_ID && LA15_0<=RULE_EFIPV6SYNTAX)||(LA15_0>=20 && LA15_0<=21)||LA15_0==23||LA15_0==25||(LA15_0>=28 && LA15_0<=29)||(LA15_0>=31 && LA15_0<=35)||(LA15_0>=42 && LA15_0<=43)||(LA15_0>=51 && LA15_0<=62)||(LA15_0>=66 && LA15_0<=90)) ) {
                alt15=1;
            }
            else if ( (LA15_0==18) ) {
                alt15=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 15, 0, input);

                throw nvae;
            }
            switch (alt15) {
                case 1 :
                    // InternalEasyWall.g:1016:3: ( (lv_statements_0_0= ruleEFStatement ) )
                    {
                    // InternalEasyWall.g:1016:3: ( (lv_statements_0_0= ruleEFStatement ) )
                    // InternalEasyWall.g:1017:4: (lv_statements_0_0= ruleEFStatement )
                    {
                    // InternalEasyWall.g:1017:4: (lv_statements_0_0= ruleEFStatement )
                    // InternalEasyWall.g:1018:5: lv_statements_0_0= ruleEFStatement
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
                    // InternalEasyWall.g:1036:3: this_EFBlock_1= ruleEFBlock
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
    // InternalEasyWall.g:1048:1: entryRuleEFExpression returns [EObject current=null] : iv_ruleEFExpression= ruleEFExpression EOF ;
    public final EObject entryRuleEFExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEFExpression = null;


        try {
            // InternalEasyWall.g:1048:53: (iv_ruleEFExpression= ruleEFExpression EOF )
            // InternalEasyWall.g:1049:2: iv_ruleEFExpression= ruleEFExpression EOF
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
    // InternalEasyWall.g:1055:1: ruleEFExpression returns [EObject current=null] : this_EFAssignment_0= ruleEFAssignment ;
    public final EObject ruleEFExpression() throws RecognitionException {
        EObject current = null;

        EObject this_EFAssignment_0 = null;



        	enterRule();

        try {
            // InternalEasyWall.g:1061:2: (this_EFAssignment_0= ruleEFAssignment )
            // InternalEasyWall.g:1062:2: this_EFAssignment_0= ruleEFAssignment
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
    // InternalEasyWall.g:1073:1: entryRuleEFAssignment returns [EObject current=null] : iv_ruleEFAssignment= ruleEFAssignment EOF ;
    public final EObject entryRuleEFAssignment() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEFAssignment = null;


        try {
            // InternalEasyWall.g:1073:53: (iv_ruleEFAssignment= ruleEFAssignment EOF )
            // InternalEasyWall.g:1074:2: iv_ruleEFAssignment= ruleEFAssignment EOF
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
    // InternalEasyWall.g:1080:1: ruleEFAssignment returns [EObject current=null] : (this_EFOrExpression_0= ruleEFOrExpression ( () otherlv_2= '=' ( (lv_right_3_0= ruleEFAssignment ) ) )? ) ;
    public final EObject ruleEFAssignment() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_EFOrExpression_0 = null;

        EObject lv_right_3_0 = null;



        	enterRule();

        try {
            // InternalEasyWall.g:1086:2: ( (this_EFOrExpression_0= ruleEFOrExpression ( () otherlv_2= '=' ( (lv_right_3_0= ruleEFAssignment ) ) )? ) )
            // InternalEasyWall.g:1087:2: (this_EFOrExpression_0= ruleEFOrExpression ( () otherlv_2= '=' ( (lv_right_3_0= ruleEFAssignment ) ) )? )
            {
            // InternalEasyWall.g:1087:2: (this_EFOrExpression_0= ruleEFOrExpression ( () otherlv_2= '=' ( (lv_right_3_0= ruleEFAssignment ) ) )? )
            // InternalEasyWall.g:1088:3: this_EFOrExpression_0= ruleEFOrExpression ( () otherlv_2= '=' ( (lv_right_3_0= ruleEFAssignment ) ) )?
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
            // InternalEasyWall.g:1096:3: ( () otherlv_2= '=' ( (lv_right_3_0= ruleEFAssignment ) ) )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==22) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // InternalEasyWall.g:1097:4: () otherlv_2= '=' ( (lv_right_3_0= ruleEFAssignment ) )
                    {
                    // InternalEasyWall.g:1097:4: ()
                    // InternalEasyWall.g:1098:5: 
                    {
                    if ( state.backtracking==0 ) {

                      					current = forceCreateModelElementAndSet(
                      						grammarAccess.getEFAssignmentAccess().getEFAssignmentLeftAction_1_0(),
                      						current);
                      				
                    }

                    }

                    otherlv_2=(Token)match(input,22,FOLLOW_12); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_2, grammarAccess.getEFAssignmentAccess().getEqualsSignKeyword_1_1());
                      			
                    }
                    // InternalEasyWall.g:1108:4: ( (lv_right_3_0= ruleEFAssignment ) )
                    // InternalEasyWall.g:1109:5: (lv_right_3_0= ruleEFAssignment )
                    {
                    // InternalEasyWall.g:1109:5: (lv_right_3_0= ruleEFAssignment )
                    // InternalEasyWall.g:1110:6: lv_right_3_0= ruleEFAssignment
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
    // InternalEasyWall.g:1132:1: entryRuleEFOrExpression returns [EObject current=null] : iv_ruleEFOrExpression= ruleEFOrExpression EOF ;
    public final EObject entryRuleEFOrExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEFOrExpression = null;


        try {
            // InternalEasyWall.g:1132:55: (iv_ruleEFOrExpression= ruleEFOrExpression EOF )
            // InternalEasyWall.g:1133:2: iv_ruleEFOrExpression= ruleEFOrExpression EOF
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
    // InternalEasyWall.g:1139:1: ruleEFOrExpression returns [EObject current=null] : (this_EFAndExpression_0= ruleEFAndExpression ( () ruleEFOr ( (lv_right_3_0= ruleEFAndExpression ) ) )* ) ;
    public final EObject ruleEFOrExpression() throws RecognitionException {
        EObject current = null;

        EObject this_EFAndExpression_0 = null;

        EObject lv_right_3_0 = null;



        	enterRule();

        try {
            // InternalEasyWall.g:1145:2: ( (this_EFAndExpression_0= ruleEFAndExpression ( () ruleEFOr ( (lv_right_3_0= ruleEFAndExpression ) ) )* ) )
            // InternalEasyWall.g:1146:2: (this_EFAndExpression_0= ruleEFAndExpression ( () ruleEFOr ( (lv_right_3_0= ruleEFAndExpression ) ) )* )
            {
            // InternalEasyWall.g:1146:2: (this_EFAndExpression_0= ruleEFAndExpression ( () ruleEFOr ( (lv_right_3_0= ruleEFAndExpression ) ) )* )
            // InternalEasyWall.g:1147:3: this_EFAndExpression_0= ruleEFAndExpression ( () ruleEFOr ( (lv_right_3_0= ruleEFAndExpression ) ) )*
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
            // InternalEasyWall.g:1155:3: ( () ruleEFOr ( (lv_right_3_0= ruleEFAndExpression ) ) )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( ((LA17_0>=38 && LA17_0<=39)) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // InternalEasyWall.g:1156:4: () ruleEFOr ( (lv_right_3_0= ruleEFAndExpression ) )
            	    {
            	    // InternalEasyWall.g:1156:4: ()
            	    // InternalEasyWall.g:1157:5: 
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
            	    pushFollow(FOLLOW_12);
            	    ruleEFOr();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				afterParserOrEnumRuleCall();
            	      			
            	    }
            	    // InternalEasyWall.g:1170:4: ( (lv_right_3_0= ruleEFAndExpression ) )
            	    // InternalEasyWall.g:1171:5: (lv_right_3_0= ruleEFAndExpression )
            	    {
            	    // InternalEasyWall.g:1171:5: (lv_right_3_0= ruleEFAndExpression )
            	    // InternalEasyWall.g:1172:6: lv_right_3_0= ruleEFAndExpression
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
            	    break loop17;
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
    // InternalEasyWall.g:1194:1: entryRuleEFAndExpression returns [EObject current=null] : iv_ruleEFAndExpression= ruleEFAndExpression EOF ;
    public final EObject entryRuleEFAndExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEFAndExpression = null;


        try {
            // InternalEasyWall.g:1194:56: (iv_ruleEFAndExpression= ruleEFAndExpression EOF )
            // InternalEasyWall.g:1195:2: iv_ruleEFAndExpression= ruleEFAndExpression EOF
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
    // InternalEasyWall.g:1201:1: ruleEFAndExpression returns [EObject current=null] : (this_EFEqualExpression_0= ruleEFEqualExpression ( () ruleEFAnd ( (lv_right_3_0= ruleEFEqualExpression ) ) )* ) ;
    public final EObject ruleEFAndExpression() throws RecognitionException {
        EObject current = null;

        EObject this_EFEqualExpression_0 = null;

        EObject lv_right_3_0 = null;



        	enterRule();

        try {
            // InternalEasyWall.g:1207:2: ( (this_EFEqualExpression_0= ruleEFEqualExpression ( () ruleEFAnd ( (lv_right_3_0= ruleEFEqualExpression ) ) )* ) )
            // InternalEasyWall.g:1208:2: (this_EFEqualExpression_0= ruleEFEqualExpression ( () ruleEFAnd ( (lv_right_3_0= ruleEFEqualExpression ) ) )* )
            {
            // InternalEasyWall.g:1208:2: (this_EFEqualExpression_0= ruleEFEqualExpression ( () ruleEFAnd ( (lv_right_3_0= ruleEFEqualExpression ) ) )* )
            // InternalEasyWall.g:1209:3: this_EFEqualExpression_0= ruleEFEqualExpression ( () ruleEFAnd ( (lv_right_3_0= ruleEFEqualExpression ) ) )*
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
            // InternalEasyWall.g:1217:3: ( () ruleEFAnd ( (lv_right_3_0= ruleEFEqualExpression ) ) )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( ((LA18_0>=40 && LA18_0<=41)) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // InternalEasyWall.g:1218:4: () ruleEFAnd ( (lv_right_3_0= ruleEFEqualExpression ) )
            	    {
            	    // InternalEasyWall.g:1218:4: ()
            	    // InternalEasyWall.g:1219:5: 
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
            	    pushFollow(FOLLOW_12);
            	    ruleEFAnd();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				afterParserOrEnumRuleCall();
            	      			
            	    }
            	    // InternalEasyWall.g:1232:4: ( (lv_right_3_0= ruleEFEqualExpression ) )
            	    // InternalEasyWall.g:1233:5: (lv_right_3_0= ruleEFEqualExpression )
            	    {
            	    // InternalEasyWall.g:1233:5: (lv_right_3_0= ruleEFEqualExpression )
            	    // InternalEasyWall.g:1234:6: lv_right_3_0= ruleEFEqualExpression
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
    // $ANTLR end "ruleEFAndExpression"


    // $ANTLR start "entryRuleEFEqualExpression"
    // InternalEasyWall.g:1256:1: entryRuleEFEqualExpression returns [EObject current=null] : iv_ruleEFEqualExpression= ruleEFEqualExpression EOF ;
    public final EObject entryRuleEFEqualExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEFEqualExpression = null;


        try {
            // InternalEasyWall.g:1256:58: (iv_ruleEFEqualExpression= ruleEFEqualExpression EOF )
            // InternalEasyWall.g:1257:2: iv_ruleEFEqualExpression= ruleEFEqualExpression EOF
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
    // InternalEasyWall.g:1263:1: ruleEFEqualExpression returns [EObject current=null] : (this_EFRelExpression_0= ruleEFRelExpression ( () ruleEFEqualOperators ( (lv_right_3_0= ruleEFRelExpression ) ) )* ) ;
    public final EObject ruleEFEqualExpression() throws RecognitionException {
        EObject current = null;

        EObject this_EFRelExpression_0 = null;

        EObject lv_right_3_0 = null;



        	enterRule();

        try {
            // InternalEasyWall.g:1269:2: ( (this_EFRelExpression_0= ruleEFRelExpression ( () ruleEFEqualOperators ( (lv_right_3_0= ruleEFRelExpression ) ) )* ) )
            // InternalEasyWall.g:1270:2: (this_EFRelExpression_0= ruleEFRelExpression ( () ruleEFEqualOperators ( (lv_right_3_0= ruleEFRelExpression ) ) )* )
            {
            // InternalEasyWall.g:1270:2: (this_EFRelExpression_0= ruleEFRelExpression ( () ruleEFEqualOperators ( (lv_right_3_0= ruleEFRelExpression ) ) )* )
            // InternalEasyWall.g:1271:3: this_EFRelExpression_0= ruleEFRelExpression ( () ruleEFEqualOperators ( (lv_right_3_0= ruleEFRelExpression ) ) )*
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
            // InternalEasyWall.g:1279:3: ( () ruleEFEqualOperators ( (lv_right_3_0= ruleEFRelExpression ) ) )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( ((LA19_0>=44 && LA19_0<=46)) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // InternalEasyWall.g:1280:4: () ruleEFEqualOperators ( (lv_right_3_0= ruleEFRelExpression ) )
            	    {
            	    // InternalEasyWall.g:1280:4: ()
            	    // InternalEasyWall.g:1281:5: 
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
            	    pushFollow(FOLLOW_12);
            	    ruleEFEqualOperators();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				afterParserOrEnumRuleCall();
            	      			
            	    }
            	    // InternalEasyWall.g:1294:4: ( (lv_right_3_0= ruleEFRelExpression ) )
            	    // InternalEasyWall.g:1295:5: (lv_right_3_0= ruleEFRelExpression )
            	    {
            	    // InternalEasyWall.g:1295:5: (lv_right_3_0= ruleEFRelExpression )
            	    // InternalEasyWall.g:1296:6: lv_right_3_0= ruleEFRelExpression
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
    // $ANTLR end "ruleEFEqualExpression"


    // $ANTLR start "entryRuleEFRelExpression"
    // InternalEasyWall.g:1318:1: entryRuleEFRelExpression returns [EObject current=null] : iv_ruleEFRelExpression= ruleEFRelExpression EOF ;
    public final EObject entryRuleEFRelExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEFRelExpression = null;


        try {
            // InternalEasyWall.g:1318:56: (iv_ruleEFRelExpression= ruleEFRelExpression EOF )
            // InternalEasyWall.g:1319:2: iv_ruleEFRelExpression= ruleEFRelExpression EOF
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
    // InternalEasyWall.g:1325:1: ruleEFRelExpression returns [EObject current=null] : (this_EFUnaryExpression_0= ruleEFUnaryExpression ( () ruleEFRelOperators ( (lv_right_3_0= ruleEFUnaryExpression ) ) )* ) ;
    public final EObject ruleEFRelExpression() throws RecognitionException {
        EObject current = null;

        EObject this_EFUnaryExpression_0 = null;

        EObject lv_right_3_0 = null;



        	enterRule();

        try {
            // InternalEasyWall.g:1331:2: ( (this_EFUnaryExpression_0= ruleEFUnaryExpression ( () ruleEFRelOperators ( (lv_right_3_0= ruleEFUnaryExpression ) ) )* ) )
            // InternalEasyWall.g:1332:2: (this_EFUnaryExpression_0= ruleEFUnaryExpression ( () ruleEFRelOperators ( (lv_right_3_0= ruleEFUnaryExpression ) ) )* )
            {
            // InternalEasyWall.g:1332:2: (this_EFUnaryExpression_0= ruleEFUnaryExpression ( () ruleEFRelOperators ( (lv_right_3_0= ruleEFUnaryExpression ) ) )* )
            // InternalEasyWall.g:1333:3: this_EFUnaryExpression_0= ruleEFUnaryExpression ( () ruleEFRelOperators ( (lv_right_3_0= ruleEFUnaryExpression ) ) )*
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
            // InternalEasyWall.g:1341:3: ( () ruleEFRelOperators ( (lv_right_3_0= ruleEFUnaryExpression ) ) )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( ((LA20_0>=47 && LA20_0<=50)) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // InternalEasyWall.g:1342:4: () ruleEFRelOperators ( (lv_right_3_0= ruleEFUnaryExpression ) )
            	    {
            	    // InternalEasyWall.g:1342:4: ()
            	    // InternalEasyWall.g:1343:5: 
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
            	    pushFollow(FOLLOW_12);
            	    ruleEFRelOperators();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				afterParserOrEnumRuleCall();
            	      			
            	    }
            	    // InternalEasyWall.g:1356:4: ( (lv_right_3_0= ruleEFUnaryExpression ) )
            	    // InternalEasyWall.g:1357:5: (lv_right_3_0= ruleEFUnaryExpression )
            	    {
            	    // InternalEasyWall.g:1357:5: (lv_right_3_0= ruleEFUnaryExpression )
            	    // InternalEasyWall.g:1358:6: lv_right_3_0= ruleEFUnaryExpression
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
    // $ANTLR end "ruleEFRelExpression"


    // $ANTLR start "entryRuleEFUnaryExpression"
    // InternalEasyWall.g:1380:1: entryRuleEFUnaryExpression returns [EObject current=null] : iv_ruleEFUnaryExpression= ruleEFUnaryExpression EOF ;
    public final EObject entryRuleEFUnaryExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEFUnaryExpression = null;


        try {
            // InternalEasyWall.g:1380:58: (iv_ruleEFUnaryExpression= ruleEFUnaryExpression EOF )
            // InternalEasyWall.g:1381:2: iv_ruleEFUnaryExpression= ruleEFUnaryExpression EOF
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
    // InternalEasyWall.g:1387:1: ruleEFUnaryExpression returns [EObject current=null] : ( ( () ruleEFNot ( (lv_expression_2_0= ruleEFUnaryExpression ) ) ) | this_EFPrimaryExpression_3= ruleEFPrimaryExpression ) ;
    public final EObject ruleEFUnaryExpression() throws RecognitionException {
        EObject current = null;

        EObject lv_expression_2_0 = null;

        EObject this_EFPrimaryExpression_3 = null;



        	enterRule();

        try {
            // InternalEasyWall.g:1393:2: ( ( ( () ruleEFNot ( (lv_expression_2_0= ruleEFUnaryExpression ) ) ) | this_EFPrimaryExpression_3= ruleEFPrimaryExpression ) )
            // InternalEasyWall.g:1394:2: ( ( () ruleEFNot ( (lv_expression_2_0= ruleEFUnaryExpression ) ) ) | this_EFPrimaryExpression_3= ruleEFPrimaryExpression )
            {
            // InternalEasyWall.g:1394:2: ( ( () ruleEFNot ( (lv_expression_2_0= ruleEFUnaryExpression ) ) ) | this_EFPrimaryExpression_3= ruleEFPrimaryExpression )
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( ((LA21_0>=42 && LA21_0<=43)) ) {
                alt21=1;
            }
            else if ( ((LA21_0>=RULE_ID && LA21_0<=RULE_EFIPV6SYNTAX)||LA21_0==23||LA21_0==25||(LA21_0>=31 && LA21_0<=35)||(LA21_0>=51 && LA21_0<=62)||(LA21_0>=66 && LA21_0<=90)) ) {
                alt21=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 21, 0, input);

                throw nvae;
            }
            switch (alt21) {
                case 1 :
                    // InternalEasyWall.g:1395:3: ( () ruleEFNot ( (lv_expression_2_0= ruleEFUnaryExpression ) ) )
                    {
                    // InternalEasyWall.g:1395:3: ( () ruleEFNot ( (lv_expression_2_0= ruleEFUnaryExpression ) ) )
                    // InternalEasyWall.g:1396:4: () ruleEFNot ( (lv_expression_2_0= ruleEFUnaryExpression ) )
                    {
                    // InternalEasyWall.g:1396:4: ()
                    // InternalEasyWall.g:1397:5: 
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
                    pushFollow(FOLLOW_12);
                    ruleEFNot();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				afterParserOrEnumRuleCall();
                      			
                    }
                    // InternalEasyWall.g:1410:4: ( (lv_expression_2_0= ruleEFUnaryExpression ) )
                    // InternalEasyWall.g:1411:5: (lv_expression_2_0= ruleEFUnaryExpression )
                    {
                    // InternalEasyWall.g:1411:5: (lv_expression_2_0= ruleEFUnaryExpression )
                    // InternalEasyWall.g:1412:6: lv_expression_2_0= ruleEFUnaryExpression
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
                    // InternalEasyWall.g:1431:3: this_EFPrimaryExpression_3= ruleEFPrimaryExpression
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
    // InternalEasyWall.g:1443:1: entryRuleEFPrimaryExpression returns [EObject current=null] : iv_ruleEFPrimaryExpression= ruleEFPrimaryExpression EOF ;
    public final EObject entryRuleEFPrimaryExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEFPrimaryExpression = null;


        try {
            // InternalEasyWall.g:1443:60: (iv_ruleEFPrimaryExpression= ruleEFPrimaryExpression EOF )
            // InternalEasyWall.g:1444:2: iv_ruleEFPrimaryExpression= ruleEFPrimaryExpression EOF
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
    // InternalEasyWall.g:1450:1: ruleEFPrimaryExpression returns [EObject current=null] : ( ( () ( (lv_value_1_0= RULE_STRING ) ) ) | ( () ( (lv_value_3_0= RULE_INT ) ) ) | ( () ( ( (lv_value_5_1= 'true' | lv_value_5_2= 'false' ) ) ) ) | ( () ( (lv_type_7_0= ruleEFNetworkNativeType ) ) ) | ( () ( (lv_direction_9_0= ruleEFDirectionNativeType ) ) ) | ( () ( (lv_protocol_11_0= ruleNETWORKLAYERPROTOCOL ) ) ) | ( () ( (lv_protocol_13_0= ruleTRANSPORTLAYERPROTOCOL ) ) ) | ( () ( (lv_protocol_15_0= ruleAPPLICATIONLAYERPROTOCOL ) ) ) | ( () ( (lv_ipv6_17_0= RULE_EFIPV6SYNTAX ) ) ) | ( () ( (lv_ipv4_19_0= ruleEFIPv4SYNTAX ) ) ) | ( () ( (lv_network_21_0= ruleEFNetworkSYNTAX ) ) ) | ( () ( (lv_port_23_0= ruleEFNetportSYNTAX ) ) ) | ( () ( (lv_netmask_25_0= ruleEFNetmaskSYNTAX ) ) ) | ( () otherlv_27= 'this' ) | ( () otherlv_29= 'super' ) | ( () otherlv_31= 'new' ( ( ruleQualifiedName ) ) otherlv_33= '(' otherlv_34= ')' ) | ( () otherlv_36= '(' ( (lv_expression_37_0= ruleEFExpression ) ) otherlv_38= ')' ) | ( () ( (lv_functionName_40_0= ruleQualifiedName ) ) otherlv_41= '(' ( ( (lv_args_42_0= ruleEFExpression ) ) (otherlv_43= ',' ( (lv_args_44_0= ruleEFExpression ) ) )* )? otherlv_45= ')' ) | ( () ( (lv_symbol_47_0= ruleQualifiedName ) ) ) ) ;
    public final EObject ruleEFPrimaryExpression() throws RecognitionException {
        EObject current = null;

        Token lv_value_1_0=null;
        Token lv_value_3_0=null;
        Token lv_value_5_1=null;
        Token lv_value_5_2=null;
        Token lv_ipv6_17_0=null;
        Token otherlv_27=null;
        Token otherlv_29=null;
        Token otherlv_31=null;
        Token otherlv_33=null;
        Token otherlv_34=null;
        Token otherlv_36=null;
        Token otherlv_38=null;
        Token otherlv_41=null;
        Token otherlv_43=null;
        Token otherlv_45=null;
        Enumerator lv_type_7_0 = null;

        Enumerator lv_direction_9_0 = null;

        Enumerator lv_protocol_11_0 = null;

        Enumerator lv_protocol_13_0 = null;

        Enumerator lv_protocol_15_0 = null;

        EObject lv_ipv4_19_0 = null;

        EObject lv_network_21_0 = null;

        EObject lv_port_23_0 = null;

        EObject lv_netmask_25_0 = null;

        EObject lv_expression_37_0 = null;

        AntlrDatatypeRuleToken lv_functionName_40_0 = null;

        EObject lv_args_42_0 = null;

        EObject lv_args_44_0 = null;

        AntlrDatatypeRuleToken lv_symbol_47_0 = null;



        	enterRule();

        try {
            // InternalEasyWall.g:1456:2: ( ( ( () ( (lv_value_1_0= RULE_STRING ) ) ) | ( () ( (lv_value_3_0= RULE_INT ) ) ) | ( () ( ( (lv_value_5_1= 'true' | lv_value_5_2= 'false' ) ) ) ) | ( () ( (lv_type_7_0= ruleEFNetworkNativeType ) ) ) | ( () ( (lv_direction_9_0= ruleEFDirectionNativeType ) ) ) | ( () ( (lv_protocol_11_0= ruleNETWORKLAYERPROTOCOL ) ) ) | ( () ( (lv_protocol_13_0= ruleTRANSPORTLAYERPROTOCOL ) ) ) | ( () ( (lv_protocol_15_0= ruleAPPLICATIONLAYERPROTOCOL ) ) ) | ( () ( (lv_ipv6_17_0= RULE_EFIPV6SYNTAX ) ) ) | ( () ( (lv_ipv4_19_0= ruleEFIPv4SYNTAX ) ) ) | ( () ( (lv_network_21_0= ruleEFNetworkSYNTAX ) ) ) | ( () ( (lv_port_23_0= ruleEFNetportSYNTAX ) ) ) | ( () ( (lv_netmask_25_0= ruleEFNetmaskSYNTAX ) ) ) | ( () otherlv_27= 'this' ) | ( () otherlv_29= 'super' ) | ( () otherlv_31= 'new' ( ( ruleQualifiedName ) ) otherlv_33= '(' otherlv_34= ')' ) | ( () otherlv_36= '(' ( (lv_expression_37_0= ruleEFExpression ) ) otherlv_38= ')' ) | ( () ( (lv_functionName_40_0= ruleQualifiedName ) ) otherlv_41= '(' ( ( (lv_args_42_0= ruleEFExpression ) ) (otherlv_43= ',' ( (lv_args_44_0= ruleEFExpression ) ) )* )? otherlv_45= ')' ) | ( () ( (lv_symbol_47_0= ruleQualifiedName ) ) ) ) )
            // InternalEasyWall.g:1457:2: ( ( () ( (lv_value_1_0= RULE_STRING ) ) ) | ( () ( (lv_value_3_0= RULE_INT ) ) ) | ( () ( ( (lv_value_5_1= 'true' | lv_value_5_2= 'false' ) ) ) ) | ( () ( (lv_type_7_0= ruleEFNetworkNativeType ) ) ) | ( () ( (lv_direction_9_0= ruleEFDirectionNativeType ) ) ) | ( () ( (lv_protocol_11_0= ruleNETWORKLAYERPROTOCOL ) ) ) | ( () ( (lv_protocol_13_0= ruleTRANSPORTLAYERPROTOCOL ) ) ) | ( () ( (lv_protocol_15_0= ruleAPPLICATIONLAYERPROTOCOL ) ) ) | ( () ( (lv_ipv6_17_0= RULE_EFIPV6SYNTAX ) ) ) | ( () ( (lv_ipv4_19_0= ruleEFIPv4SYNTAX ) ) ) | ( () ( (lv_network_21_0= ruleEFNetworkSYNTAX ) ) ) | ( () ( (lv_port_23_0= ruleEFNetportSYNTAX ) ) ) | ( () ( (lv_netmask_25_0= ruleEFNetmaskSYNTAX ) ) ) | ( () otherlv_27= 'this' ) | ( () otherlv_29= 'super' ) | ( () otherlv_31= 'new' ( ( ruleQualifiedName ) ) otherlv_33= '(' otherlv_34= ')' ) | ( () otherlv_36= '(' ( (lv_expression_37_0= ruleEFExpression ) ) otherlv_38= ')' ) | ( () ( (lv_functionName_40_0= ruleQualifiedName ) ) otherlv_41= '(' ( ( (lv_args_42_0= ruleEFExpression ) ) (otherlv_43= ',' ( (lv_args_44_0= ruleEFExpression ) ) )* )? otherlv_45= ')' ) | ( () ( (lv_symbol_47_0= ruleQualifiedName ) ) ) )
            {
            // InternalEasyWall.g:1457:2: ( ( () ( (lv_value_1_0= RULE_STRING ) ) ) | ( () ( (lv_value_3_0= RULE_INT ) ) ) | ( () ( ( (lv_value_5_1= 'true' | lv_value_5_2= 'false' ) ) ) ) | ( () ( (lv_type_7_0= ruleEFNetworkNativeType ) ) ) | ( () ( (lv_direction_9_0= ruleEFDirectionNativeType ) ) ) | ( () ( (lv_protocol_11_0= ruleNETWORKLAYERPROTOCOL ) ) ) | ( () ( (lv_protocol_13_0= ruleTRANSPORTLAYERPROTOCOL ) ) ) | ( () ( (lv_protocol_15_0= ruleAPPLICATIONLAYERPROTOCOL ) ) ) | ( () ( (lv_ipv6_17_0= RULE_EFIPV6SYNTAX ) ) ) | ( () ( (lv_ipv4_19_0= ruleEFIPv4SYNTAX ) ) ) | ( () ( (lv_network_21_0= ruleEFNetworkSYNTAX ) ) ) | ( () ( (lv_port_23_0= ruleEFNetportSYNTAX ) ) ) | ( () ( (lv_netmask_25_0= ruleEFNetmaskSYNTAX ) ) ) | ( () otherlv_27= 'this' ) | ( () otherlv_29= 'super' ) | ( () otherlv_31= 'new' ( ( ruleQualifiedName ) ) otherlv_33= '(' otherlv_34= ')' ) | ( () otherlv_36= '(' ( (lv_expression_37_0= ruleEFExpression ) ) otherlv_38= ')' ) | ( () ( (lv_functionName_40_0= ruleQualifiedName ) ) otherlv_41= '(' ( ( (lv_args_42_0= ruleEFExpression ) ) (otherlv_43= ',' ( (lv_args_44_0= ruleEFExpression ) ) )* )? otherlv_45= ')' ) | ( () ( (lv_symbol_47_0= ruleQualifiedName ) ) ) )
            int alt25=19;
            alt25 = dfa25.predict(input);
            switch (alt25) {
                case 1 :
                    // InternalEasyWall.g:1458:3: ( () ( (lv_value_1_0= RULE_STRING ) ) )
                    {
                    // InternalEasyWall.g:1458:3: ( () ( (lv_value_1_0= RULE_STRING ) ) )
                    // InternalEasyWall.g:1459:4: () ( (lv_value_1_0= RULE_STRING ) )
                    {
                    // InternalEasyWall.g:1459:4: ()
                    // InternalEasyWall.g:1460:5: 
                    {
                    if ( state.backtracking==0 ) {

                      					current = forceCreateModelElement(
                      						grammarAccess.getEFPrimaryExpressionAccess().getEFStringConstantAction_0_0(),
                      						current);
                      				
                    }

                    }

                    // InternalEasyWall.g:1466:4: ( (lv_value_1_0= RULE_STRING ) )
                    // InternalEasyWall.g:1467:5: (lv_value_1_0= RULE_STRING )
                    {
                    // InternalEasyWall.g:1467:5: (lv_value_1_0= RULE_STRING )
                    // InternalEasyWall.g:1468:6: lv_value_1_0= RULE_STRING
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
                    // InternalEasyWall.g:1486:3: ( () ( (lv_value_3_0= RULE_INT ) ) )
                    {
                    // InternalEasyWall.g:1486:3: ( () ( (lv_value_3_0= RULE_INT ) ) )
                    // InternalEasyWall.g:1487:4: () ( (lv_value_3_0= RULE_INT ) )
                    {
                    // InternalEasyWall.g:1487:4: ()
                    // InternalEasyWall.g:1488:5: 
                    {
                    if ( state.backtracking==0 ) {

                      					current = forceCreateModelElement(
                      						grammarAccess.getEFPrimaryExpressionAccess().getEFIntConstantAction_1_0(),
                      						current);
                      				
                    }

                    }

                    // InternalEasyWall.g:1494:4: ( (lv_value_3_0= RULE_INT ) )
                    // InternalEasyWall.g:1495:5: (lv_value_3_0= RULE_INT )
                    {
                    // InternalEasyWall.g:1495:5: (lv_value_3_0= RULE_INT )
                    // InternalEasyWall.g:1496:6: lv_value_3_0= RULE_INT
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
                    // InternalEasyWall.g:1514:3: ( () ( ( (lv_value_5_1= 'true' | lv_value_5_2= 'false' ) ) ) )
                    {
                    // InternalEasyWall.g:1514:3: ( () ( ( (lv_value_5_1= 'true' | lv_value_5_2= 'false' ) ) ) )
                    // InternalEasyWall.g:1515:4: () ( ( (lv_value_5_1= 'true' | lv_value_5_2= 'false' ) ) )
                    {
                    // InternalEasyWall.g:1515:4: ()
                    // InternalEasyWall.g:1516:5: 
                    {
                    if ( state.backtracking==0 ) {

                      					current = forceCreateModelElement(
                      						grammarAccess.getEFPrimaryExpressionAccess().getEFBoolConstantAction_2_0(),
                      						current);
                      				
                    }

                    }

                    // InternalEasyWall.g:1522:4: ( ( (lv_value_5_1= 'true' | lv_value_5_2= 'false' ) ) )
                    // InternalEasyWall.g:1523:5: ( (lv_value_5_1= 'true' | lv_value_5_2= 'false' ) )
                    {
                    // InternalEasyWall.g:1523:5: ( (lv_value_5_1= 'true' | lv_value_5_2= 'false' ) )
                    // InternalEasyWall.g:1524:6: (lv_value_5_1= 'true' | lv_value_5_2= 'false' )
                    {
                    // InternalEasyWall.g:1524:6: (lv_value_5_1= 'true' | lv_value_5_2= 'false' )
                    int alt22=2;
                    int LA22_0 = input.LA(1);

                    if ( (LA22_0==31) ) {
                        alt22=1;
                    }
                    else if ( (LA22_0==32) ) {
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
                            // InternalEasyWall.g:1525:7: lv_value_5_1= 'true'
                            {
                            lv_value_5_1=(Token)match(input,31,FOLLOW_2); if (state.failed) return current;
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
                            // InternalEasyWall.g:1536:7: lv_value_5_2= 'false'
                            {
                            lv_value_5_2=(Token)match(input,32,FOLLOW_2); if (state.failed) return current;
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
                    // InternalEasyWall.g:1551:3: ( () ( (lv_type_7_0= ruleEFNetworkNativeType ) ) )
                    {
                    // InternalEasyWall.g:1551:3: ( () ( (lv_type_7_0= ruleEFNetworkNativeType ) ) )
                    // InternalEasyWall.g:1552:4: () ( (lv_type_7_0= ruleEFNetworkNativeType ) )
                    {
                    // InternalEasyWall.g:1552:4: ()
                    // InternalEasyWall.g:1553:5: 
                    {
                    if ( state.backtracking==0 ) {

                      					current = forceCreateModelElement(
                      						grammarAccess.getEFPrimaryExpressionAccess().getEFPrimitiveTypeAction_3_0(),
                      						current);
                      				
                    }

                    }

                    // InternalEasyWall.g:1559:4: ( (lv_type_7_0= ruleEFNetworkNativeType ) )
                    // InternalEasyWall.g:1560:5: (lv_type_7_0= ruleEFNetworkNativeType )
                    {
                    // InternalEasyWall.g:1560:5: (lv_type_7_0= ruleEFNetworkNativeType )
                    // InternalEasyWall.g:1561:6: lv_type_7_0= ruleEFNetworkNativeType
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
                    // InternalEasyWall.g:1580:3: ( () ( (lv_direction_9_0= ruleEFDirectionNativeType ) ) )
                    {
                    // InternalEasyWall.g:1580:3: ( () ( (lv_direction_9_0= ruleEFDirectionNativeType ) ) )
                    // InternalEasyWall.g:1581:4: () ( (lv_direction_9_0= ruleEFDirectionNativeType ) )
                    {
                    // InternalEasyWall.g:1581:4: ()
                    // InternalEasyWall.g:1582:5: 
                    {
                    if ( state.backtracking==0 ) {

                      					current = forceCreateModelElement(
                      						grammarAccess.getEFPrimaryExpressionAccess().getEFDirectionConstantAction_4_0(),
                      						current);
                      				
                    }

                    }

                    // InternalEasyWall.g:1588:4: ( (lv_direction_9_0= ruleEFDirectionNativeType ) )
                    // InternalEasyWall.g:1589:5: (lv_direction_9_0= ruleEFDirectionNativeType )
                    {
                    // InternalEasyWall.g:1589:5: (lv_direction_9_0= ruleEFDirectionNativeType )
                    // InternalEasyWall.g:1590:6: lv_direction_9_0= ruleEFDirectionNativeType
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
                    // InternalEasyWall.g:1609:3: ( () ( (lv_protocol_11_0= ruleNETWORKLAYERPROTOCOL ) ) )
                    {
                    // InternalEasyWall.g:1609:3: ( () ( (lv_protocol_11_0= ruleNETWORKLAYERPROTOCOL ) ) )
                    // InternalEasyWall.g:1610:4: () ( (lv_protocol_11_0= ruleNETWORKLAYERPROTOCOL ) )
                    {
                    // InternalEasyWall.g:1610:4: ()
                    // InternalEasyWall.g:1611:5: 
                    {
                    if ( state.backtracking==0 ) {

                      					current = forceCreateModelElement(
                      						grammarAccess.getEFPrimaryExpressionAccess().getEFNetworkProtocolConstantAction_5_0(),
                      						current);
                      				
                    }

                    }

                    // InternalEasyWall.g:1617:4: ( (lv_protocol_11_0= ruleNETWORKLAYERPROTOCOL ) )
                    // InternalEasyWall.g:1618:5: (lv_protocol_11_0= ruleNETWORKLAYERPROTOCOL )
                    {
                    // InternalEasyWall.g:1618:5: (lv_protocol_11_0= ruleNETWORKLAYERPROTOCOL )
                    // InternalEasyWall.g:1619:6: lv_protocol_11_0= ruleNETWORKLAYERPROTOCOL
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
                    // InternalEasyWall.g:1638:3: ( () ( (lv_protocol_13_0= ruleTRANSPORTLAYERPROTOCOL ) ) )
                    {
                    // InternalEasyWall.g:1638:3: ( () ( (lv_protocol_13_0= ruleTRANSPORTLAYERPROTOCOL ) ) )
                    // InternalEasyWall.g:1639:4: () ( (lv_protocol_13_0= ruleTRANSPORTLAYERPROTOCOL ) )
                    {
                    // InternalEasyWall.g:1639:4: ()
                    // InternalEasyWall.g:1640:5: 
                    {
                    if ( state.backtracking==0 ) {

                      					current = forceCreateModelElement(
                      						grammarAccess.getEFPrimaryExpressionAccess().getEFTransportProtocolConstantAction_6_0(),
                      						current);
                      				
                    }

                    }

                    // InternalEasyWall.g:1646:4: ( (lv_protocol_13_0= ruleTRANSPORTLAYERPROTOCOL ) )
                    // InternalEasyWall.g:1647:5: (lv_protocol_13_0= ruleTRANSPORTLAYERPROTOCOL )
                    {
                    // InternalEasyWall.g:1647:5: (lv_protocol_13_0= ruleTRANSPORTLAYERPROTOCOL )
                    // InternalEasyWall.g:1648:6: lv_protocol_13_0= ruleTRANSPORTLAYERPROTOCOL
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
                    // InternalEasyWall.g:1667:3: ( () ( (lv_protocol_15_0= ruleAPPLICATIONLAYERPROTOCOL ) ) )
                    {
                    // InternalEasyWall.g:1667:3: ( () ( (lv_protocol_15_0= ruleAPPLICATIONLAYERPROTOCOL ) ) )
                    // InternalEasyWall.g:1668:4: () ( (lv_protocol_15_0= ruleAPPLICATIONLAYERPROTOCOL ) )
                    {
                    // InternalEasyWall.g:1668:4: ()
                    // InternalEasyWall.g:1669:5: 
                    {
                    if ( state.backtracking==0 ) {

                      					current = forceCreateModelElement(
                      						grammarAccess.getEFPrimaryExpressionAccess().getEFApplicationProtocolConstantAction_7_0(),
                      						current);
                      				
                    }

                    }

                    // InternalEasyWall.g:1675:4: ( (lv_protocol_15_0= ruleAPPLICATIONLAYERPROTOCOL ) )
                    // InternalEasyWall.g:1676:5: (lv_protocol_15_0= ruleAPPLICATIONLAYERPROTOCOL )
                    {
                    // InternalEasyWall.g:1676:5: (lv_protocol_15_0= ruleAPPLICATIONLAYERPROTOCOL )
                    // InternalEasyWall.g:1677:6: lv_protocol_15_0= ruleAPPLICATIONLAYERPROTOCOL
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
                    // InternalEasyWall.g:1696:3: ( () ( (lv_ipv6_17_0= RULE_EFIPV6SYNTAX ) ) )
                    {
                    // InternalEasyWall.g:1696:3: ( () ( (lv_ipv6_17_0= RULE_EFIPV6SYNTAX ) ) )
                    // InternalEasyWall.g:1697:4: () ( (lv_ipv6_17_0= RULE_EFIPV6SYNTAX ) )
                    {
                    // InternalEasyWall.g:1697:4: ()
                    // InternalEasyWall.g:1698:5: 
                    {
                    if ( state.backtracking==0 ) {

                      					current = forceCreateModelElement(
                      						grammarAccess.getEFPrimaryExpressionAccess().getEFIPv6ConstantAction_8_0(),
                      						current);
                      				
                    }

                    }

                    // InternalEasyWall.g:1704:4: ( (lv_ipv6_17_0= RULE_EFIPV6SYNTAX ) )
                    // InternalEasyWall.g:1705:5: (lv_ipv6_17_0= RULE_EFIPV6SYNTAX )
                    {
                    // InternalEasyWall.g:1705:5: (lv_ipv6_17_0= RULE_EFIPV6SYNTAX )
                    // InternalEasyWall.g:1706:6: lv_ipv6_17_0= RULE_EFIPV6SYNTAX
                    {
                    lv_ipv6_17_0=(Token)match(input,RULE_EFIPV6SYNTAX,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(lv_ipv6_17_0, grammarAccess.getEFPrimaryExpressionAccess().getIpv6EFIPV6SYNTAXTerminalRuleCall_8_1_0());
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getEFPrimaryExpressionRule());
                      						}
                      						setWithLastConsumed(
                      							current,
                      							"ipv6",
                      							lv_ipv6_17_0,
                      							"org.xtext.example.easywall.EasyWall.EFIPV6SYNTAX");
                      					
                    }

                    }


                    }


                    }


                    }
                    break;
                case 10 :
                    // InternalEasyWall.g:1724:3: ( () ( (lv_ipv4_19_0= ruleEFIPv4SYNTAX ) ) )
                    {
                    // InternalEasyWall.g:1724:3: ( () ( (lv_ipv4_19_0= ruleEFIPv4SYNTAX ) ) )
                    // InternalEasyWall.g:1725:4: () ( (lv_ipv4_19_0= ruleEFIPv4SYNTAX ) )
                    {
                    // InternalEasyWall.g:1725:4: ()
                    // InternalEasyWall.g:1726:5: 
                    {
                    if ( state.backtracking==0 ) {

                      					current = forceCreateModelElement(
                      						grammarAccess.getEFPrimaryExpressionAccess().getEFIPv4ConstantAction_9_0(),
                      						current);
                      				
                    }

                    }

                    // InternalEasyWall.g:1732:4: ( (lv_ipv4_19_0= ruleEFIPv4SYNTAX ) )
                    // InternalEasyWall.g:1733:5: (lv_ipv4_19_0= ruleEFIPv4SYNTAX )
                    {
                    // InternalEasyWall.g:1733:5: (lv_ipv4_19_0= ruleEFIPv4SYNTAX )
                    // InternalEasyWall.g:1734:6: lv_ipv4_19_0= ruleEFIPv4SYNTAX
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getEFPrimaryExpressionAccess().getIpv4EFIPv4SYNTAXParserRuleCall_9_1_0());
                      					
                    }
                    pushFollow(FOLLOW_2);
                    lv_ipv4_19_0=ruleEFIPv4SYNTAX();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getEFPrimaryExpressionRule());
                      						}
                      						set(
                      							current,
                      							"ipv4",
                      							lv_ipv4_19_0,
                      							"org.xtext.example.easywall.EasyWall.EFIPv4SYNTAX");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }


                    }


                    }
                    break;
                case 11 :
                    // InternalEasyWall.g:1753:3: ( () ( (lv_network_21_0= ruleEFNetworkSYNTAX ) ) )
                    {
                    // InternalEasyWall.g:1753:3: ( () ( (lv_network_21_0= ruleEFNetworkSYNTAX ) ) )
                    // InternalEasyWall.g:1754:4: () ( (lv_network_21_0= ruleEFNetworkSYNTAX ) )
                    {
                    // InternalEasyWall.g:1754:4: ()
                    // InternalEasyWall.g:1755:5: 
                    {
                    if ( state.backtracking==0 ) {

                      					current = forceCreateModelElement(
                      						grammarAccess.getEFPrimaryExpressionAccess().getEFNetworkConstantAction_10_0(),
                      						current);
                      				
                    }

                    }

                    // InternalEasyWall.g:1761:4: ( (lv_network_21_0= ruleEFNetworkSYNTAX ) )
                    // InternalEasyWall.g:1762:5: (lv_network_21_0= ruleEFNetworkSYNTAX )
                    {
                    // InternalEasyWall.g:1762:5: (lv_network_21_0= ruleEFNetworkSYNTAX )
                    // InternalEasyWall.g:1763:6: lv_network_21_0= ruleEFNetworkSYNTAX
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getEFPrimaryExpressionAccess().getNetworkEFNetworkSYNTAXParserRuleCall_10_1_0());
                      					
                    }
                    pushFollow(FOLLOW_2);
                    lv_network_21_0=ruleEFNetworkSYNTAX();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getEFPrimaryExpressionRule());
                      						}
                      						set(
                      							current,
                      							"network",
                      							lv_network_21_0,
                      							"org.xtext.example.easywall.EasyWall.EFNetworkSYNTAX");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }


                    }


                    }
                    break;
                case 12 :
                    // InternalEasyWall.g:1782:3: ( () ( (lv_port_23_0= ruleEFNetportSYNTAX ) ) )
                    {
                    // InternalEasyWall.g:1782:3: ( () ( (lv_port_23_0= ruleEFNetportSYNTAX ) ) )
                    // InternalEasyWall.g:1783:4: () ( (lv_port_23_0= ruleEFNetportSYNTAX ) )
                    {
                    // InternalEasyWall.g:1783:4: ()
                    // InternalEasyWall.g:1784:5: 
                    {
                    if ( state.backtracking==0 ) {

                      					current = forceCreateModelElement(
                      						grammarAccess.getEFPrimaryExpressionAccess().getEFNetportConstantAction_11_0(),
                      						current);
                      				
                    }

                    }

                    // InternalEasyWall.g:1790:4: ( (lv_port_23_0= ruleEFNetportSYNTAX ) )
                    // InternalEasyWall.g:1791:5: (lv_port_23_0= ruleEFNetportSYNTAX )
                    {
                    // InternalEasyWall.g:1791:5: (lv_port_23_0= ruleEFNetportSYNTAX )
                    // InternalEasyWall.g:1792:6: lv_port_23_0= ruleEFNetportSYNTAX
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getEFPrimaryExpressionAccess().getPortEFNetportSYNTAXParserRuleCall_11_1_0());
                      					
                    }
                    pushFollow(FOLLOW_2);
                    lv_port_23_0=ruleEFNetportSYNTAX();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getEFPrimaryExpressionRule());
                      						}
                      						set(
                      							current,
                      							"port",
                      							lv_port_23_0,
                      							"org.xtext.example.easywall.EasyWall.EFNetportSYNTAX");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }


                    }


                    }
                    break;
                case 13 :
                    // InternalEasyWall.g:1811:3: ( () ( (lv_netmask_25_0= ruleEFNetmaskSYNTAX ) ) )
                    {
                    // InternalEasyWall.g:1811:3: ( () ( (lv_netmask_25_0= ruleEFNetmaskSYNTAX ) ) )
                    // InternalEasyWall.g:1812:4: () ( (lv_netmask_25_0= ruleEFNetmaskSYNTAX ) )
                    {
                    // InternalEasyWall.g:1812:4: ()
                    // InternalEasyWall.g:1813:5: 
                    {
                    if ( state.backtracking==0 ) {

                      					current = forceCreateModelElement(
                      						grammarAccess.getEFPrimaryExpressionAccess().getEFNetmaskConstantAction_12_0(),
                      						current);
                      				
                    }

                    }

                    // InternalEasyWall.g:1819:4: ( (lv_netmask_25_0= ruleEFNetmaskSYNTAX ) )
                    // InternalEasyWall.g:1820:5: (lv_netmask_25_0= ruleEFNetmaskSYNTAX )
                    {
                    // InternalEasyWall.g:1820:5: (lv_netmask_25_0= ruleEFNetmaskSYNTAX )
                    // InternalEasyWall.g:1821:6: lv_netmask_25_0= ruleEFNetmaskSYNTAX
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getEFPrimaryExpressionAccess().getNetmaskEFNetmaskSYNTAXParserRuleCall_12_1_0());
                      					
                    }
                    pushFollow(FOLLOW_2);
                    lv_netmask_25_0=ruleEFNetmaskSYNTAX();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getEFPrimaryExpressionRule());
                      						}
                      						set(
                      							current,
                      							"netmask",
                      							lv_netmask_25_0,
                      							"org.xtext.example.easywall.EasyWall.EFNetmaskSYNTAX");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }


                    }


                    }
                    break;
                case 14 :
                    // InternalEasyWall.g:1840:3: ( () otherlv_27= 'this' )
                    {
                    // InternalEasyWall.g:1840:3: ( () otherlv_27= 'this' )
                    // InternalEasyWall.g:1841:4: () otherlv_27= 'this'
                    {
                    // InternalEasyWall.g:1841:4: ()
                    // InternalEasyWall.g:1842:5: 
                    {
                    if ( state.backtracking==0 ) {

                      					current = forceCreateModelElement(
                      						grammarAccess.getEFPrimaryExpressionAccess().getEFThisAction_13_0(),
                      						current);
                      				
                    }

                    }

                    otherlv_27=(Token)match(input,33,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_27, grammarAccess.getEFPrimaryExpressionAccess().getThisKeyword_13_1());
                      			
                    }

                    }


                    }
                    break;
                case 15 :
                    // InternalEasyWall.g:1854:3: ( () otherlv_29= 'super' )
                    {
                    // InternalEasyWall.g:1854:3: ( () otherlv_29= 'super' )
                    // InternalEasyWall.g:1855:4: () otherlv_29= 'super'
                    {
                    // InternalEasyWall.g:1855:4: ()
                    // InternalEasyWall.g:1856:5: 
                    {
                    if ( state.backtracking==0 ) {

                      					current = forceCreateModelElement(
                      						grammarAccess.getEFPrimaryExpressionAccess().getEFSuperAction_14_0(),
                      						current);
                      				
                    }

                    }

                    otherlv_29=(Token)match(input,34,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_29, grammarAccess.getEFPrimaryExpressionAccess().getSuperKeyword_14_1());
                      			
                    }

                    }


                    }
                    break;
                case 16 :
                    // InternalEasyWall.g:1868:3: ( () otherlv_31= 'new' ( ( ruleQualifiedName ) ) otherlv_33= '(' otherlv_34= ')' )
                    {
                    // InternalEasyWall.g:1868:3: ( () otherlv_31= 'new' ( ( ruleQualifiedName ) ) otherlv_33= '(' otherlv_34= ')' )
                    // InternalEasyWall.g:1869:4: () otherlv_31= 'new' ( ( ruleQualifiedName ) ) otherlv_33= '(' otherlv_34= ')'
                    {
                    // InternalEasyWall.g:1869:4: ()
                    // InternalEasyWall.g:1870:5: 
                    {
                    if ( state.backtracking==0 ) {

                      					current = forceCreateModelElement(
                      						grammarAccess.getEFPrimaryExpressionAccess().getEFNewAction_15_0(),
                      						current);
                      				
                    }

                    }

                    otherlv_31=(Token)match(input,35,FOLLOW_4); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_31, grammarAccess.getEFPrimaryExpressionAccess().getNewKeyword_15_1());
                      			
                    }
                    // InternalEasyWall.g:1880:4: ( ( ruleQualifiedName ) )
                    // InternalEasyWall.g:1881:5: ( ruleQualifiedName )
                    {
                    // InternalEasyWall.g:1881:5: ( ruleQualifiedName )
                    // InternalEasyWall.g:1882:6: ruleQualifiedName
                    {
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getEFPrimaryExpressionRule());
                      						}
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getEFPrimaryExpressionAccess().getTypeEFRuleClassCrossReference_15_2_0());
                      					
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

                    otherlv_33=(Token)match(input,25,FOLLOW_19); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_33, grammarAccess.getEFPrimaryExpressionAccess().getLeftParenthesisKeyword_15_3());
                      			
                    }
                    otherlv_34=(Token)match(input,27,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_34, grammarAccess.getEFPrimaryExpressionAccess().getRightParenthesisKeyword_15_4());
                      			
                    }

                    }


                    }
                    break;
                case 17 :
                    // InternalEasyWall.g:1906:3: ( () otherlv_36= '(' ( (lv_expression_37_0= ruleEFExpression ) ) otherlv_38= ')' )
                    {
                    // InternalEasyWall.g:1906:3: ( () otherlv_36= '(' ( (lv_expression_37_0= ruleEFExpression ) ) otherlv_38= ')' )
                    // InternalEasyWall.g:1907:4: () otherlv_36= '(' ( (lv_expression_37_0= ruleEFExpression ) ) otherlv_38= ')'
                    {
                    // InternalEasyWall.g:1907:4: ()
                    // InternalEasyWall.g:1908:5: 
                    {
                    if ( state.backtracking==0 ) {

                      					current = forceCreateModelElement(
                      						grammarAccess.getEFPrimaryExpressionAccess().getEFBRacketsExpressionAction_16_0(),
                      						current);
                      				
                    }

                    }

                    otherlv_36=(Token)match(input,25,FOLLOW_12); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_36, grammarAccess.getEFPrimaryExpressionAccess().getLeftParenthesisKeyword_16_1());
                      			
                    }
                    // InternalEasyWall.g:1918:4: ( (lv_expression_37_0= ruleEFExpression ) )
                    // InternalEasyWall.g:1919:5: (lv_expression_37_0= ruleEFExpression )
                    {
                    // InternalEasyWall.g:1919:5: (lv_expression_37_0= ruleEFExpression )
                    // InternalEasyWall.g:1920:6: lv_expression_37_0= ruleEFExpression
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getEFPrimaryExpressionAccess().getExpressionEFExpressionParserRuleCall_16_2_0());
                      					
                    }
                    pushFollow(FOLLOW_19);
                    lv_expression_37_0=ruleEFExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getEFPrimaryExpressionRule());
                      						}
                      						set(
                      							current,
                      							"expression",
                      							lv_expression_37_0,
                      							"org.xtext.example.easywall.EasyWall.EFExpression");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }

                    otherlv_38=(Token)match(input,27,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_38, grammarAccess.getEFPrimaryExpressionAccess().getRightParenthesisKeyword_16_3());
                      			
                    }

                    }


                    }
                    break;
                case 18 :
                    // InternalEasyWall.g:1943:3: ( () ( (lv_functionName_40_0= ruleQualifiedName ) ) otherlv_41= '(' ( ( (lv_args_42_0= ruleEFExpression ) ) (otherlv_43= ',' ( (lv_args_44_0= ruleEFExpression ) ) )* )? otherlv_45= ')' )
                    {
                    // InternalEasyWall.g:1943:3: ( () ( (lv_functionName_40_0= ruleQualifiedName ) ) otherlv_41= '(' ( ( (lv_args_42_0= ruleEFExpression ) ) (otherlv_43= ',' ( (lv_args_44_0= ruleEFExpression ) ) )* )? otherlv_45= ')' )
                    // InternalEasyWall.g:1944:4: () ( (lv_functionName_40_0= ruleQualifiedName ) ) otherlv_41= '(' ( ( (lv_args_42_0= ruleEFExpression ) ) (otherlv_43= ',' ( (lv_args_44_0= ruleEFExpression ) ) )* )? otherlv_45= ')'
                    {
                    // InternalEasyWall.g:1944:4: ()
                    // InternalEasyWall.g:1945:5: 
                    {
                    if ( state.backtracking==0 ) {

                      					current = forceCreateModelElement(
                      						grammarAccess.getEFPrimaryExpressionAccess().getEFFunctionCallAction_17_0(),
                      						current);
                      				
                    }

                    }

                    // InternalEasyWall.g:1951:4: ( (lv_functionName_40_0= ruleQualifiedName ) )
                    // InternalEasyWall.g:1952:5: (lv_functionName_40_0= ruleQualifiedName )
                    {
                    // InternalEasyWall.g:1952:5: (lv_functionName_40_0= ruleQualifiedName )
                    // InternalEasyWall.g:1953:6: lv_functionName_40_0= ruleQualifiedName
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getEFPrimaryExpressionAccess().getFunctionNameQualifiedNameParserRuleCall_17_1_0());
                      					
                    }
                    pushFollow(FOLLOW_15);
                    lv_functionName_40_0=ruleQualifiedName();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getEFPrimaryExpressionRule());
                      						}
                      						set(
                      							current,
                      							"functionName",
                      							lv_functionName_40_0,
                      							"org.xtext.example.easywall.EasyWall.QualifiedName");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }

                    otherlv_41=(Token)match(input,25,FOLLOW_27); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_41, grammarAccess.getEFPrimaryExpressionAccess().getLeftParenthesisKeyword_17_2());
                      			
                    }
                    // InternalEasyWall.g:1974:4: ( ( (lv_args_42_0= ruleEFExpression ) ) (otherlv_43= ',' ( (lv_args_44_0= ruleEFExpression ) ) )* )?
                    int alt24=2;
                    int LA24_0 = input.LA(1);

                    if ( ((LA24_0>=RULE_ID && LA24_0<=RULE_EFIPV6SYNTAX)||LA24_0==23||LA24_0==25||(LA24_0>=31 && LA24_0<=35)||(LA24_0>=42 && LA24_0<=43)||(LA24_0>=51 && LA24_0<=62)||(LA24_0>=66 && LA24_0<=90)) ) {
                        alt24=1;
                    }
                    switch (alt24) {
                        case 1 :
                            // InternalEasyWall.g:1975:5: ( (lv_args_42_0= ruleEFExpression ) ) (otherlv_43= ',' ( (lv_args_44_0= ruleEFExpression ) ) )*
                            {
                            // InternalEasyWall.g:1975:5: ( (lv_args_42_0= ruleEFExpression ) )
                            // InternalEasyWall.g:1976:6: (lv_args_42_0= ruleEFExpression )
                            {
                            // InternalEasyWall.g:1976:6: (lv_args_42_0= ruleEFExpression )
                            // InternalEasyWall.g:1977:7: lv_args_42_0= ruleEFExpression
                            {
                            if ( state.backtracking==0 ) {

                              							newCompositeNode(grammarAccess.getEFPrimaryExpressionAccess().getArgsEFExpressionParserRuleCall_17_3_0_0());
                              						
                            }
                            pushFollow(FOLLOW_17);
                            lv_args_42_0=ruleEFExpression();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              							if (current==null) {
                              								current = createModelElementForParent(grammarAccess.getEFPrimaryExpressionRule());
                              							}
                              							add(
                              								current,
                              								"args",
                              								lv_args_42_0,
                              								"org.xtext.example.easywall.EasyWall.EFExpression");
                              							afterParserOrEnumRuleCall();
                              						
                            }

                            }


                            }

                            // InternalEasyWall.g:1994:5: (otherlv_43= ',' ( (lv_args_44_0= ruleEFExpression ) ) )*
                            loop23:
                            do {
                                int alt23=2;
                                int LA23_0 = input.LA(1);

                                if ( (LA23_0==26) ) {
                                    alt23=1;
                                }


                                switch (alt23) {
                            	case 1 :
                            	    // InternalEasyWall.g:1995:6: otherlv_43= ',' ( (lv_args_44_0= ruleEFExpression ) )
                            	    {
                            	    otherlv_43=(Token)match(input,26,FOLLOW_12); if (state.failed) return current;
                            	    if ( state.backtracking==0 ) {

                            	      						newLeafNode(otherlv_43, grammarAccess.getEFPrimaryExpressionAccess().getCommaKeyword_17_3_1_0());
                            	      					
                            	    }
                            	    // InternalEasyWall.g:1999:6: ( (lv_args_44_0= ruleEFExpression ) )
                            	    // InternalEasyWall.g:2000:7: (lv_args_44_0= ruleEFExpression )
                            	    {
                            	    // InternalEasyWall.g:2000:7: (lv_args_44_0= ruleEFExpression )
                            	    // InternalEasyWall.g:2001:8: lv_args_44_0= ruleEFExpression
                            	    {
                            	    if ( state.backtracking==0 ) {

                            	      								newCompositeNode(grammarAccess.getEFPrimaryExpressionAccess().getArgsEFExpressionParserRuleCall_17_3_1_1_0());
                            	      							
                            	    }
                            	    pushFollow(FOLLOW_17);
                            	    lv_args_44_0=ruleEFExpression();

                            	    state._fsp--;
                            	    if (state.failed) return current;
                            	    if ( state.backtracking==0 ) {

                            	      								if (current==null) {
                            	      									current = createModelElementForParent(grammarAccess.getEFPrimaryExpressionRule());
                            	      								}
                            	      								add(
                            	      									current,
                            	      									"args",
                            	      									lv_args_44_0,
                            	      									"org.xtext.example.easywall.EasyWall.EFExpression");
                            	      								afterParserOrEnumRuleCall();
                            	      							
                            	    }

                            	    }


                            	    }


                            	    }
                            	    break;

                            	default :
                            	    break loop23;
                                }
                            } while (true);


                            }
                            break;

                    }

                    otherlv_45=(Token)match(input,27,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_45, grammarAccess.getEFPrimaryExpressionAccess().getRightParenthesisKeyword_17_4());
                      			
                    }

                    }


                    }
                    break;
                case 19 :
                    // InternalEasyWall.g:2026:3: ( () ( (lv_symbol_47_0= ruleQualifiedName ) ) )
                    {
                    // InternalEasyWall.g:2026:3: ( () ( (lv_symbol_47_0= ruleQualifiedName ) ) )
                    // InternalEasyWall.g:2027:4: () ( (lv_symbol_47_0= ruleQualifiedName ) )
                    {
                    // InternalEasyWall.g:2027:4: ()
                    // InternalEasyWall.g:2028:5: 
                    {
                    if ( state.backtracking==0 ) {

                      					current = forceCreateModelElement(
                      						grammarAccess.getEFPrimaryExpressionAccess().getEFSymbolRefAction_18_0(),
                      						current);
                      				
                    }

                    }

                    // InternalEasyWall.g:2034:4: ( (lv_symbol_47_0= ruleQualifiedName ) )
                    // InternalEasyWall.g:2035:5: (lv_symbol_47_0= ruleQualifiedName )
                    {
                    // InternalEasyWall.g:2035:5: (lv_symbol_47_0= ruleQualifiedName )
                    // InternalEasyWall.g:2036:6: lv_symbol_47_0= ruleQualifiedName
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getEFPrimaryExpressionAccess().getSymbolQualifiedNameParserRuleCall_18_1_0());
                      					
                    }
                    pushFollow(FOLLOW_2);
                    lv_symbol_47_0=ruleQualifiedName();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getEFPrimaryExpressionRule());
                      						}
                      						set(
                      							current,
                      							"symbol",
                      							lv_symbol_47_0,
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
    // InternalEasyWall.g:2058:1: entryRuleEFRule returns [EObject current=null] : iv_ruleEFRule= ruleEFRule EOF ;
    public final EObject entryRuleEFRule() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEFRule = null;


        try {
            // InternalEasyWall.g:2058:47: (iv_ruleEFRule= ruleEFRule EOF )
            // InternalEasyWall.g:2059:2: iv_ruleEFRule= ruleEFRule EOF
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
    // InternalEasyWall.g:2065:1: ruleEFRule returns [EObject current=null] : ( (lv_rules_0_0= ruleEFRuleClass ) ) ;
    public final EObject ruleEFRule() throws RecognitionException {
        EObject current = null;

        EObject lv_rules_0_0 = null;



        	enterRule();

        try {
            // InternalEasyWall.g:2071:2: ( ( (lv_rules_0_0= ruleEFRuleClass ) ) )
            // InternalEasyWall.g:2072:2: ( (lv_rules_0_0= ruleEFRuleClass ) )
            {
            // InternalEasyWall.g:2072:2: ( (lv_rules_0_0= ruleEFRuleClass ) )
            // InternalEasyWall.g:2073:3: (lv_rules_0_0= ruleEFRuleClass )
            {
            // InternalEasyWall.g:2073:3: (lv_rules_0_0= ruleEFRuleClass )
            // InternalEasyWall.g:2074:4: lv_rules_0_0= ruleEFRuleClass
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
    // InternalEasyWall.g:2094:1: entryRuleEFRuleClass returns [EObject current=null] : iv_ruleEFRuleClass= ruleEFRuleClass EOF ;
    public final EObject entryRuleEFRuleClass() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEFRuleClass = null;


        try {
            // InternalEasyWall.g:2094:52: (iv_ruleEFRuleClass= ruleEFRuleClass EOF )
            // InternalEasyWall.g:2095:2: iv_ruleEFRuleClass= ruleEFRuleClass EOF
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
    // InternalEasyWall.g:2101:1: ruleEFRuleClass returns [EObject current=null] : (otherlv_0= 'rule' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'at' ( (lv_type_3_0= ruleEFRulesTypes ) ) otherlv_4= '{' ( (lv_members_5_0= ruleEFMember ) )* otherlv_6= '}' ) ;
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
            // InternalEasyWall.g:2107:2: ( (otherlv_0= 'rule' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'at' ( (lv_type_3_0= ruleEFRulesTypes ) ) otherlv_4= '{' ( (lv_members_5_0= ruleEFMember ) )* otherlv_6= '}' ) )
            // InternalEasyWall.g:2108:2: (otherlv_0= 'rule' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'at' ( (lv_type_3_0= ruleEFRulesTypes ) ) otherlv_4= '{' ( (lv_members_5_0= ruleEFMember ) )* otherlv_6= '}' )
            {
            // InternalEasyWall.g:2108:2: (otherlv_0= 'rule' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'at' ( (lv_type_3_0= ruleEFRulesTypes ) ) otherlv_4= '{' ( (lv_members_5_0= ruleEFMember ) )* otherlv_6= '}' )
            // InternalEasyWall.g:2109:3: otherlv_0= 'rule' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'at' ( (lv_type_3_0= ruleEFRulesTypes ) ) otherlv_4= '{' ( (lv_members_5_0= ruleEFMember ) )* otherlv_6= '}'
            {
            otherlv_0=(Token)match(input,36,FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getEFRuleClassAccess().getRuleKeyword_0());
              		
            }
            // InternalEasyWall.g:2113:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalEasyWall.g:2114:4: (lv_name_1_0= RULE_ID )
            {
            // InternalEasyWall.g:2114:4: (lv_name_1_0= RULE_ID )
            // InternalEasyWall.g:2115:5: lv_name_1_0= RULE_ID
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

            otherlv_2=(Token)match(input,37,FOLLOW_29); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getEFRuleClassAccess().getAtKeyword_2());
              		
            }
            // InternalEasyWall.g:2135:3: ( (lv_type_3_0= ruleEFRulesTypes ) )
            // InternalEasyWall.g:2136:4: (lv_type_3_0= ruleEFRulesTypes )
            {
            // InternalEasyWall.g:2136:4: (lv_type_3_0= ruleEFRulesTypes )
            // InternalEasyWall.g:2137:5: lv_type_3_0= ruleEFRulesTypes
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

            otherlv_4=(Token)match(input,18,FOLLOW_10); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_4, grammarAccess.getEFRuleClassAccess().getLeftCurlyBracketKeyword_4());
              		
            }
            // InternalEasyWall.g:2158:3: ( (lv_members_5_0= ruleEFMember ) )*
            loop26:
            do {
                int alt26=2;
                int LA26_0 = input.LA(1);

                if ( ((LA26_0>=20 && LA26_0<=21)||LA26_0==24) ) {
                    alt26=1;
                }


                switch (alt26) {
            	case 1 :
            	    // InternalEasyWall.g:2159:4: (lv_members_5_0= ruleEFMember )
            	    {
            	    // InternalEasyWall.g:2159:4: (lv_members_5_0= ruleEFMember )
            	    // InternalEasyWall.g:2160:5: lv_members_5_0= ruleEFMember
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
            	    break loop26;
                }
            } while (true);

            otherlv_6=(Token)match(input,19,FOLLOW_2); if (state.failed) return current;
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
    // InternalEasyWall.g:2185:1: entryRuleEFOr returns [String current=null] : iv_ruleEFOr= ruleEFOr EOF ;
    public final String entryRuleEFOr() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEFOr = null;


        try {
            // InternalEasyWall.g:2185:44: (iv_ruleEFOr= ruleEFOr EOF )
            // InternalEasyWall.g:2186:2: iv_ruleEFOr= ruleEFOr EOF
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
    // InternalEasyWall.g:2192:1: ruleEFOr returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '||' | kw= 'or' ) ;
    public final AntlrDatatypeRuleToken ruleEFOr() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalEasyWall.g:2198:2: ( (kw= '||' | kw= 'or' ) )
            // InternalEasyWall.g:2199:2: (kw= '||' | kw= 'or' )
            {
            // InternalEasyWall.g:2199:2: (kw= '||' | kw= 'or' )
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==38) ) {
                alt27=1;
            }
            else if ( (LA27_0==39) ) {
                alt27=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 27, 0, input);

                throw nvae;
            }
            switch (alt27) {
                case 1 :
                    // InternalEasyWall.g:2200:3: kw= '||'
                    {
                    kw=(Token)match(input,38,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getEFOrAccess().getVerticalLineVerticalLineKeyword_0());
                      		
                    }

                    }
                    break;
                case 2 :
                    // InternalEasyWall.g:2206:3: kw= 'or'
                    {
                    kw=(Token)match(input,39,FOLLOW_2); if (state.failed) return current;
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
    // InternalEasyWall.g:2215:1: entryRuleEFAnd returns [String current=null] : iv_ruleEFAnd= ruleEFAnd EOF ;
    public final String entryRuleEFAnd() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEFAnd = null;


        try {
            // InternalEasyWall.g:2215:45: (iv_ruleEFAnd= ruleEFAnd EOF )
            // InternalEasyWall.g:2216:2: iv_ruleEFAnd= ruleEFAnd EOF
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
    // InternalEasyWall.g:2222:1: ruleEFAnd returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '&&' | kw= 'and' ) ;
    public final AntlrDatatypeRuleToken ruleEFAnd() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalEasyWall.g:2228:2: ( (kw= '&&' | kw= 'and' ) )
            // InternalEasyWall.g:2229:2: (kw= '&&' | kw= 'and' )
            {
            // InternalEasyWall.g:2229:2: (kw= '&&' | kw= 'and' )
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==40) ) {
                alt28=1;
            }
            else if ( (LA28_0==41) ) {
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
                    // InternalEasyWall.g:2230:3: kw= '&&'
                    {
                    kw=(Token)match(input,40,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getEFAndAccess().getAmpersandAmpersandKeyword_0());
                      		
                    }

                    }
                    break;
                case 2 :
                    // InternalEasyWall.g:2236:3: kw= 'and'
                    {
                    kw=(Token)match(input,41,FOLLOW_2); if (state.failed) return current;
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
    // InternalEasyWall.g:2245:1: entryRuleEFNot returns [String current=null] : iv_ruleEFNot= ruleEFNot EOF ;
    public final String entryRuleEFNot() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEFNot = null;


        try {
            // InternalEasyWall.g:2245:45: (iv_ruleEFNot= ruleEFNot EOF )
            // InternalEasyWall.g:2246:2: iv_ruleEFNot= ruleEFNot EOF
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
    // InternalEasyWall.g:2252:1: ruleEFNot returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '!' | kw= 'not' ) ;
    public final AntlrDatatypeRuleToken ruleEFNot() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalEasyWall.g:2258:2: ( (kw= '!' | kw= 'not' ) )
            // InternalEasyWall.g:2259:2: (kw= '!' | kw= 'not' )
            {
            // InternalEasyWall.g:2259:2: (kw= '!' | kw= 'not' )
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==42) ) {
                alt29=1;
            }
            else if ( (LA29_0==43) ) {
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
                    // InternalEasyWall.g:2260:3: kw= '!'
                    {
                    kw=(Token)match(input,42,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getEFNotAccess().getExclamationMarkKeyword_0());
                      		
                    }

                    }
                    break;
                case 2 :
                    // InternalEasyWall.g:2266:3: kw= 'not'
                    {
                    kw=(Token)match(input,43,FOLLOW_2); if (state.failed) return current;
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
    // InternalEasyWall.g:2275:1: entryRuleEFEqualOperators returns [String current=null] : iv_ruleEFEqualOperators= ruleEFEqualOperators EOF ;
    public final String entryRuleEFEqualOperators() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEFEqualOperators = null;


        try {
            // InternalEasyWall.g:2275:56: (iv_ruleEFEqualOperators= ruleEFEqualOperators EOF )
            // InternalEasyWall.g:2276:2: iv_ruleEFEqualOperators= ruleEFEqualOperators EOF
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
    // InternalEasyWall.g:2282:1: ruleEFEqualOperators returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '==' | kw= '!=' | kw= 'isequalto' ) ;
    public final AntlrDatatypeRuleToken ruleEFEqualOperators() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalEasyWall.g:2288:2: ( (kw= '==' | kw= '!=' | kw= 'isequalto' ) )
            // InternalEasyWall.g:2289:2: (kw= '==' | kw= '!=' | kw= 'isequalto' )
            {
            // InternalEasyWall.g:2289:2: (kw= '==' | kw= '!=' | kw= 'isequalto' )
            int alt30=3;
            switch ( input.LA(1) ) {
            case 44:
                {
                alt30=1;
                }
                break;
            case 45:
                {
                alt30=2;
                }
                break;
            case 46:
                {
                alt30=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 30, 0, input);

                throw nvae;
            }

            switch (alt30) {
                case 1 :
                    // InternalEasyWall.g:2290:3: kw= '=='
                    {
                    kw=(Token)match(input,44,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getEFEqualOperatorsAccess().getEqualsSignEqualsSignKeyword_0());
                      		
                    }

                    }
                    break;
                case 2 :
                    // InternalEasyWall.g:2296:3: kw= '!='
                    {
                    kw=(Token)match(input,45,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getEFEqualOperatorsAccess().getExclamationMarkEqualsSignKeyword_1());
                      		
                    }

                    }
                    break;
                case 3 :
                    // InternalEasyWall.g:2302:3: kw= 'isequalto'
                    {
                    kw=(Token)match(input,46,FOLLOW_2); if (state.failed) return current;
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
    // InternalEasyWall.g:2311:1: entryRuleEFRelOperators returns [String current=null] : iv_ruleEFRelOperators= ruleEFRelOperators EOF ;
    public final String entryRuleEFRelOperators() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEFRelOperators = null;


        try {
            // InternalEasyWall.g:2311:54: (iv_ruleEFRelOperators= ruleEFRelOperators EOF )
            // InternalEasyWall.g:2312:2: iv_ruleEFRelOperators= ruleEFRelOperators EOF
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
    // InternalEasyWall.g:2318:1: ruleEFRelOperators returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '>=' | kw= '<=' | kw= '>' | kw= '<' ) ;
    public final AntlrDatatypeRuleToken ruleEFRelOperators() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalEasyWall.g:2324:2: ( (kw= '>=' | kw= '<=' | kw= '>' | kw= '<' ) )
            // InternalEasyWall.g:2325:2: (kw= '>=' | kw= '<=' | kw= '>' | kw= '<' )
            {
            // InternalEasyWall.g:2325:2: (kw= '>=' | kw= '<=' | kw= '>' | kw= '<' )
            int alt31=4;
            switch ( input.LA(1) ) {
            case 47:
                {
                alt31=1;
                }
                break;
            case 48:
                {
                alt31=2;
                }
                break;
            case 49:
                {
                alt31=3;
                }
                break;
            case 50:
                {
                alt31=4;
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
                    // InternalEasyWall.g:2326:3: kw= '>='
                    {
                    kw=(Token)match(input,47,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getEFRelOperatorsAccess().getGreaterThanSignEqualsSignKeyword_0());
                      		
                    }

                    }
                    break;
                case 2 :
                    // InternalEasyWall.g:2332:3: kw= '<='
                    {
                    kw=(Token)match(input,48,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getEFRelOperatorsAccess().getLessThanSignEqualsSignKeyword_1());
                      		
                    }

                    }
                    break;
                case 3 :
                    // InternalEasyWall.g:2338:3: kw= '>'
                    {
                    kw=(Token)match(input,49,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getEFRelOperatorsAccess().getGreaterThanSignKeyword_2());
                      		
                    }

                    }
                    break;
                case 4 :
                    // InternalEasyWall.g:2344:3: kw= '<'
                    {
                    kw=(Token)match(input,50,FOLLOW_2); if (state.failed) return current;
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


    // $ANTLR start "entryRuleEFIPv4SYNTAX"
    // InternalEasyWall.g:2353:1: entryRuleEFIPv4SYNTAX returns [EObject current=null] : iv_ruleEFIPv4SYNTAX= ruleEFIPv4SYNTAX EOF ;
    public final EObject entryRuleEFIPv4SYNTAX() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEFIPv4SYNTAX = null;


        try {
            // InternalEasyWall.g:2353:53: (iv_ruleEFIPv4SYNTAX= ruleEFIPv4SYNTAX EOF )
            // InternalEasyWall.g:2354:2: iv_ruleEFIPv4SYNTAX= ruleEFIPv4SYNTAX EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getEFIPv4SYNTAXRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleEFIPv4SYNTAX=ruleEFIPv4SYNTAX();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleEFIPv4SYNTAX; 
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
    // $ANTLR end "entryRuleEFIPv4SYNTAX"


    // $ANTLR start "ruleEFIPv4SYNTAX"
    // InternalEasyWall.g:2360:1: ruleEFIPv4SYNTAX returns [EObject current=null] : ( ( ( (lv_first_0_0= RULE_INT ) ) otherlv_1= '.' ( (lv_second_2_0= RULE_INT ) ) otherlv_3= '.' ( (lv_third_4_0= RULE_INT ) ) otherlv_5= '.' ( (lv_fourth_6_0= RULE_INT ) ) ) | ( (lv_any_7_0= 'any' ) ) | ( (lv_localhost_8_0= 'localhost' ) ) ) ;
    public final EObject ruleEFIPv4SYNTAX() throws RecognitionException {
        EObject current = null;

        Token lv_first_0_0=null;
        Token otherlv_1=null;
        Token lv_second_2_0=null;
        Token otherlv_3=null;
        Token lv_third_4_0=null;
        Token otherlv_5=null;
        Token lv_fourth_6_0=null;
        Token lv_any_7_0=null;
        Token lv_localhost_8_0=null;


        	enterRule();

        try {
            // InternalEasyWall.g:2366:2: ( ( ( ( (lv_first_0_0= RULE_INT ) ) otherlv_1= '.' ( (lv_second_2_0= RULE_INT ) ) otherlv_3= '.' ( (lv_third_4_0= RULE_INT ) ) otherlv_5= '.' ( (lv_fourth_6_0= RULE_INT ) ) ) | ( (lv_any_7_0= 'any' ) ) | ( (lv_localhost_8_0= 'localhost' ) ) ) )
            // InternalEasyWall.g:2367:2: ( ( ( (lv_first_0_0= RULE_INT ) ) otherlv_1= '.' ( (lv_second_2_0= RULE_INT ) ) otherlv_3= '.' ( (lv_third_4_0= RULE_INT ) ) otherlv_5= '.' ( (lv_fourth_6_0= RULE_INT ) ) ) | ( (lv_any_7_0= 'any' ) ) | ( (lv_localhost_8_0= 'localhost' ) ) )
            {
            // InternalEasyWall.g:2367:2: ( ( ( (lv_first_0_0= RULE_INT ) ) otherlv_1= '.' ( (lv_second_2_0= RULE_INT ) ) otherlv_3= '.' ( (lv_third_4_0= RULE_INT ) ) otherlv_5= '.' ( (lv_fourth_6_0= RULE_INT ) ) ) | ( (lv_any_7_0= 'any' ) ) | ( (lv_localhost_8_0= 'localhost' ) ) )
            int alt32=3;
            switch ( input.LA(1) ) {
            case RULE_INT:
                {
                alt32=1;
                }
                break;
            case 51:
                {
                alt32=2;
                }
                break;
            case 52:
                {
                alt32=3;
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
                    // InternalEasyWall.g:2368:3: ( ( (lv_first_0_0= RULE_INT ) ) otherlv_1= '.' ( (lv_second_2_0= RULE_INT ) ) otherlv_3= '.' ( (lv_third_4_0= RULE_INT ) ) otherlv_5= '.' ( (lv_fourth_6_0= RULE_INT ) ) )
                    {
                    // InternalEasyWall.g:2368:3: ( ( (lv_first_0_0= RULE_INT ) ) otherlv_1= '.' ( (lv_second_2_0= RULE_INT ) ) otherlv_3= '.' ( (lv_third_4_0= RULE_INT ) ) otherlv_5= '.' ( (lv_fourth_6_0= RULE_INT ) ) )
                    // InternalEasyWall.g:2369:4: ( (lv_first_0_0= RULE_INT ) ) otherlv_1= '.' ( (lv_second_2_0= RULE_INT ) ) otherlv_3= '.' ( (lv_third_4_0= RULE_INT ) ) otherlv_5= '.' ( (lv_fourth_6_0= RULE_INT ) )
                    {
                    // InternalEasyWall.g:2369:4: ( (lv_first_0_0= RULE_INT ) )
                    // InternalEasyWall.g:2370:5: (lv_first_0_0= RULE_INT )
                    {
                    // InternalEasyWall.g:2370:5: (lv_first_0_0= RULE_INT )
                    // InternalEasyWall.g:2371:6: lv_first_0_0= RULE_INT
                    {
                    lv_first_0_0=(Token)match(input,RULE_INT,FOLLOW_30); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(lv_first_0_0, grammarAccess.getEFIPv4SYNTAXAccess().getFirstINTTerminalRuleCall_0_0_0());
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getEFIPv4SYNTAXRule());
                      						}
                      						setWithLastConsumed(
                      							current,
                      							"first",
                      							lv_first_0_0,
                      							"org.eclipse.xtext.common.Terminals.INT");
                      					
                    }

                    }


                    }

                    otherlv_1=(Token)match(input,15,FOLLOW_31); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_1, grammarAccess.getEFIPv4SYNTAXAccess().getFullStopKeyword_0_1());
                      			
                    }
                    // InternalEasyWall.g:2391:4: ( (lv_second_2_0= RULE_INT ) )
                    // InternalEasyWall.g:2392:5: (lv_second_2_0= RULE_INT )
                    {
                    // InternalEasyWall.g:2392:5: (lv_second_2_0= RULE_INT )
                    // InternalEasyWall.g:2393:6: lv_second_2_0= RULE_INT
                    {
                    lv_second_2_0=(Token)match(input,RULE_INT,FOLLOW_30); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(lv_second_2_0, grammarAccess.getEFIPv4SYNTAXAccess().getSecondINTTerminalRuleCall_0_2_0());
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getEFIPv4SYNTAXRule());
                      						}
                      						setWithLastConsumed(
                      							current,
                      							"second",
                      							lv_second_2_0,
                      							"org.eclipse.xtext.common.Terminals.INT");
                      					
                    }

                    }


                    }

                    otherlv_3=(Token)match(input,15,FOLLOW_31); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_3, grammarAccess.getEFIPv4SYNTAXAccess().getFullStopKeyword_0_3());
                      			
                    }
                    // InternalEasyWall.g:2413:4: ( (lv_third_4_0= RULE_INT ) )
                    // InternalEasyWall.g:2414:5: (lv_third_4_0= RULE_INT )
                    {
                    // InternalEasyWall.g:2414:5: (lv_third_4_0= RULE_INT )
                    // InternalEasyWall.g:2415:6: lv_third_4_0= RULE_INT
                    {
                    lv_third_4_0=(Token)match(input,RULE_INT,FOLLOW_30); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(lv_third_4_0, grammarAccess.getEFIPv4SYNTAXAccess().getThirdINTTerminalRuleCall_0_4_0());
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getEFIPv4SYNTAXRule());
                      						}
                      						setWithLastConsumed(
                      							current,
                      							"third",
                      							lv_third_4_0,
                      							"org.eclipse.xtext.common.Terminals.INT");
                      					
                    }

                    }


                    }

                    otherlv_5=(Token)match(input,15,FOLLOW_31); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_5, grammarAccess.getEFIPv4SYNTAXAccess().getFullStopKeyword_0_5());
                      			
                    }
                    // InternalEasyWall.g:2435:4: ( (lv_fourth_6_0= RULE_INT ) )
                    // InternalEasyWall.g:2436:5: (lv_fourth_6_0= RULE_INT )
                    {
                    // InternalEasyWall.g:2436:5: (lv_fourth_6_0= RULE_INT )
                    // InternalEasyWall.g:2437:6: lv_fourth_6_0= RULE_INT
                    {
                    lv_fourth_6_0=(Token)match(input,RULE_INT,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(lv_fourth_6_0, grammarAccess.getEFIPv4SYNTAXAccess().getFourthINTTerminalRuleCall_0_6_0());
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getEFIPv4SYNTAXRule());
                      						}
                      						setWithLastConsumed(
                      							current,
                      							"fourth",
                      							lv_fourth_6_0,
                      							"org.eclipse.xtext.common.Terminals.INT");
                      					
                    }

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalEasyWall.g:2455:3: ( (lv_any_7_0= 'any' ) )
                    {
                    // InternalEasyWall.g:2455:3: ( (lv_any_7_0= 'any' ) )
                    // InternalEasyWall.g:2456:4: (lv_any_7_0= 'any' )
                    {
                    // InternalEasyWall.g:2456:4: (lv_any_7_0= 'any' )
                    // InternalEasyWall.g:2457:5: lv_any_7_0= 'any'
                    {
                    lv_any_7_0=(Token)match(input,51,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(lv_any_7_0, grammarAccess.getEFIPv4SYNTAXAccess().getAnyAnyKeyword_1_0());
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElement(grammarAccess.getEFIPv4SYNTAXRule());
                      					}
                      					setWithLastConsumed(current, "any", lv_any_7_0, "any");
                      				
                    }

                    }


                    }


                    }
                    break;
                case 3 :
                    // InternalEasyWall.g:2470:3: ( (lv_localhost_8_0= 'localhost' ) )
                    {
                    // InternalEasyWall.g:2470:3: ( (lv_localhost_8_0= 'localhost' ) )
                    // InternalEasyWall.g:2471:4: (lv_localhost_8_0= 'localhost' )
                    {
                    // InternalEasyWall.g:2471:4: (lv_localhost_8_0= 'localhost' )
                    // InternalEasyWall.g:2472:5: lv_localhost_8_0= 'localhost'
                    {
                    lv_localhost_8_0=(Token)match(input,52,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(lv_localhost_8_0, grammarAccess.getEFIPv4SYNTAXAccess().getLocalhostLocalhostKeyword_2_0());
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElement(grammarAccess.getEFIPv4SYNTAXRule());
                      					}
                      					setWithLastConsumed(current, "localhost", lv_localhost_8_0, "localhost");
                      				
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
    // $ANTLR end "ruleEFIPv4SYNTAX"


    // $ANTLR start "entryRuleEFNetworkSYNTAX"
    // InternalEasyWall.g:2488:1: entryRuleEFNetworkSYNTAX returns [EObject current=null] : iv_ruleEFNetworkSYNTAX= ruleEFNetworkSYNTAX EOF ;
    public final EObject entryRuleEFNetworkSYNTAX() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEFNetworkSYNTAX = null;


        try {
            // InternalEasyWall.g:2488:56: (iv_ruleEFNetworkSYNTAX= ruleEFNetworkSYNTAX EOF )
            // InternalEasyWall.g:2489:2: iv_ruleEFNetworkSYNTAX= ruleEFNetworkSYNTAX EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getEFNetworkSYNTAXRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleEFNetworkSYNTAX=ruleEFNetworkSYNTAX();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleEFNetworkSYNTAX; 
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
    // $ANTLR end "entryRuleEFNetworkSYNTAX"


    // $ANTLR start "ruleEFNetworkSYNTAX"
    // InternalEasyWall.g:2495:1: ruleEFNetworkSYNTAX returns [EObject current=null] : ( ( ( (lv_varip_0_0= RULE_ID ) ) otherlv_1= '/' ( (lv_varnetmask_2_0= RULE_ID ) ) ) | ( ( (lv_rawip_3_0= ruleEFIPv4SYNTAX ) ) otherlv_4= '/' ( (lv_rawnetmask_5_0= RULE_INT ) ) ) | ( ( (lv_rawip_6_0= ruleEFIPv4SYNTAX ) ) otherlv_7= '/' ( (lv_varnetmask_8_0= RULE_ID ) ) ) | ( ( (lv_varip_9_0= RULE_ID ) ) otherlv_10= '/' ( (lv_rawnetmask_11_0= RULE_INT ) ) ) ) ;
    public final EObject ruleEFNetworkSYNTAX() throws RecognitionException {
        EObject current = null;

        Token lv_varip_0_0=null;
        Token otherlv_1=null;
        Token lv_varnetmask_2_0=null;
        Token otherlv_4=null;
        Token lv_rawnetmask_5_0=null;
        Token otherlv_7=null;
        Token lv_varnetmask_8_0=null;
        Token lv_varip_9_0=null;
        Token otherlv_10=null;
        Token lv_rawnetmask_11_0=null;
        EObject lv_rawip_3_0 = null;

        EObject lv_rawip_6_0 = null;



        	enterRule();

        try {
            // InternalEasyWall.g:2501:2: ( ( ( ( (lv_varip_0_0= RULE_ID ) ) otherlv_1= '/' ( (lv_varnetmask_2_0= RULE_ID ) ) ) | ( ( (lv_rawip_3_0= ruleEFIPv4SYNTAX ) ) otherlv_4= '/' ( (lv_rawnetmask_5_0= RULE_INT ) ) ) | ( ( (lv_rawip_6_0= ruleEFIPv4SYNTAX ) ) otherlv_7= '/' ( (lv_varnetmask_8_0= RULE_ID ) ) ) | ( ( (lv_varip_9_0= RULE_ID ) ) otherlv_10= '/' ( (lv_rawnetmask_11_0= RULE_INT ) ) ) ) )
            // InternalEasyWall.g:2502:2: ( ( ( (lv_varip_0_0= RULE_ID ) ) otherlv_1= '/' ( (lv_varnetmask_2_0= RULE_ID ) ) ) | ( ( (lv_rawip_3_0= ruleEFIPv4SYNTAX ) ) otherlv_4= '/' ( (lv_rawnetmask_5_0= RULE_INT ) ) ) | ( ( (lv_rawip_6_0= ruleEFIPv4SYNTAX ) ) otherlv_7= '/' ( (lv_varnetmask_8_0= RULE_ID ) ) ) | ( ( (lv_varip_9_0= RULE_ID ) ) otherlv_10= '/' ( (lv_rawnetmask_11_0= RULE_INT ) ) ) )
            {
            // InternalEasyWall.g:2502:2: ( ( ( (lv_varip_0_0= RULE_ID ) ) otherlv_1= '/' ( (lv_varnetmask_2_0= RULE_ID ) ) ) | ( ( (lv_rawip_3_0= ruleEFIPv4SYNTAX ) ) otherlv_4= '/' ( (lv_rawnetmask_5_0= RULE_INT ) ) ) | ( ( (lv_rawip_6_0= ruleEFIPv4SYNTAX ) ) otherlv_7= '/' ( (lv_varnetmask_8_0= RULE_ID ) ) ) | ( ( (lv_varip_9_0= RULE_ID ) ) otherlv_10= '/' ( (lv_rawnetmask_11_0= RULE_INT ) ) ) )
            int alt33=4;
            alt33 = dfa33.predict(input);
            switch (alt33) {
                case 1 :
                    // InternalEasyWall.g:2503:3: ( ( (lv_varip_0_0= RULE_ID ) ) otherlv_1= '/' ( (lv_varnetmask_2_0= RULE_ID ) ) )
                    {
                    // InternalEasyWall.g:2503:3: ( ( (lv_varip_0_0= RULE_ID ) ) otherlv_1= '/' ( (lv_varnetmask_2_0= RULE_ID ) ) )
                    // InternalEasyWall.g:2504:4: ( (lv_varip_0_0= RULE_ID ) ) otherlv_1= '/' ( (lv_varnetmask_2_0= RULE_ID ) )
                    {
                    // InternalEasyWall.g:2504:4: ( (lv_varip_0_0= RULE_ID ) )
                    // InternalEasyWall.g:2505:5: (lv_varip_0_0= RULE_ID )
                    {
                    // InternalEasyWall.g:2505:5: (lv_varip_0_0= RULE_ID )
                    // InternalEasyWall.g:2506:6: lv_varip_0_0= RULE_ID
                    {
                    lv_varip_0_0=(Token)match(input,RULE_ID,FOLLOW_32); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(lv_varip_0_0, grammarAccess.getEFNetworkSYNTAXAccess().getVaripIDTerminalRuleCall_0_0_0());
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getEFNetworkSYNTAXRule());
                      						}
                      						setWithLastConsumed(
                      							current,
                      							"varip",
                      							lv_varip_0_0,
                      							"org.eclipse.xtext.common.Terminals.ID");
                      					
                    }

                    }


                    }

                    otherlv_1=(Token)match(input,53,FOLLOW_4); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_1, grammarAccess.getEFNetworkSYNTAXAccess().getSolidusKeyword_0_1());
                      			
                    }
                    // InternalEasyWall.g:2526:4: ( (lv_varnetmask_2_0= RULE_ID ) )
                    // InternalEasyWall.g:2527:5: (lv_varnetmask_2_0= RULE_ID )
                    {
                    // InternalEasyWall.g:2527:5: (lv_varnetmask_2_0= RULE_ID )
                    // InternalEasyWall.g:2528:6: lv_varnetmask_2_0= RULE_ID
                    {
                    lv_varnetmask_2_0=(Token)match(input,RULE_ID,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(lv_varnetmask_2_0, grammarAccess.getEFNetworkSYNTAXAccess().getVarnetmaskIDTerminalRuleCall_0_2_0());
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getEFNetworkSYNTAXRule());
                      						}
                      						setWithLastConsumed(
                      							current,
                      							"varnetmask",
                      							lv_varnetmask_2_0,
                      							"org.eclipse.xtext.common.Terminals.ID");
                      					
                    }

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalEasyWall.g:2546:3: ( ( (lv_rawip_3_0= ruleEFIPv4SYNTAX ) ) otherlv_4= '/' ( (lv_rawnetmask_5_0= RULE_INT ) ) )
                    {
                    // InternalEasyWall.g:2546:3: ( ( (lv_rawip_3_0= ruleEFIPv4SYNTAX ) ) otherlv_4= '/' ( (lv_rawnetmask_5_0= RULE_INT ) ) )
                    // InternalEasyWall.g:2547:4: ( (lv_rawip_3_0= ruleEFIPv4SYNTAX ) ) otherlv_4= '/' ( (lv_rawnetmask_5_0= RULE_INT ) )
                    {
                    // InternalEasyWall.g:2547:4: ( (lv_rawip_3_0= ruleEFIPv4SYNTAX ) )
                    // InternalEasyWall.g:2548:5: (lv_rawip_3_0= ruleEFIPv4SYNTAX )
                    {
                    // InternalEasyWall.g:2548:5: (lv_rawip_3_0= ruleEFIPv4SYNTAX )
                    // InternalEasyWall.g:2549:6: lv_rawip_3_0= ruleEFIPv4SYNTAX
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getEFNetworkSYNTAXAccess().getRawipEFIPv4SYNTAXParserRuleCall_1_0_0());
                      					
                    }
                    pushFollow(FOLLOW_32);
                    lv_rawip_3_0=ruleEFIPv4SYNTAX();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getEFNetworkSYNTAXRule());
                      						}
                      						set(
                      							current,
                      							"rawip",
                      							lv_rawip_3_0,
                      							"org.xtext.example.easywall.EasyWall.EFIPv4SYNTAX");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }

                    otherlv_4=(Token)match(input,53,FOLLOW_31); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_4, grammarAccess.getEFNetworkSYNTAXAccess().getSolidusKeyword_1_1());
                      			
                    }
                    // InternalEasyWall.g:2570:4: ( (lv_rawnetmask_5_0= RULE_INT ) )
                    // InternalEasyWall.g:2571:5: (lv_rawnetmask_5_0= RULE_INT )
                    {
                    // InternalEasyWall.g:2571:5: (lv_rawnetmask_5_0= RULE_INT )
                    // InternalEasyWall.g:2572:6: lv_rawnetmask_5_0= RULE_INT
                    {
                    lv_rawnetmask_5_0=(Token)match(input,RULE_INT,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(lv_rawnetmask_5_0, grammarAccess.getEFNetworkSYNTAXAccess().getRawnetmaskINTTerminalRuleCall_1_2_0());
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getEFNetworkSYNTAXRule());
                      						}
                      						setWithLastConsumed(
                      							current,
                      							"rawnetmask",
                      							lv_rawnetmask_5_0,
                      							"org.eclipse.xtext.common.Terminals.INT");
                      					
                    }

                    }


                    }


                    }


                    }
                    break;
                case 3 :
                    // InternalEasyWall.g:2590:3: ( ( (lv_rawip_6_0= ruleEFIPv4SYNTAX ) ) otherlv_7= '/' ( (lv_varnetmask_8_0= RULE_ID ) ) )
                    {
                    // InternalEasyWall.g:2590:3: ( ( (lv_rawip_6_0= ruleEFIPv4SYNTAX ) ) otherlv_7= '/' ( (lv_varnetmask_8_0= RULE_ID ) ) )
                    // InternalEasyWall.g:2591:4: ( (lv_rawip_6_0= ruleEFIPv4SYNTAX ) ) otherlv_7= '/' ( (lv_varnetmask_8_0= RULE_ID ) )
                    {
                    // InternalEasyWall.g:2591:4: ( (lv_rawip_6_0= ruleEFIPv4SYNTAX ) )
                    // InternalEasyWall.g:2592:5: (lv_rawip_6_0= ruleEFIPv4SYNTAX )
                    {
                    // InternalEasyWall.g:2592:5: (lv_rawip_6_0= ruleEFIPv4SYNTAX )
                    // InternalEasyWall.g:2593:6: lv_rawip_6_0= ruleEFIPv4SYNTAX
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getEFNetworkSYNTAXAccess().getRawipEFIPv4SYNTAXParserRuleCall_2_0_0());
                      					
                    }
                    pushFollow(FOLLOW_32);
                    lv_rawip_6_0=ruleEFIPv4SYNTAX();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getEFNetworkSYNTAXRule());
                      						}
                      						set(
                      							current,
                      							"rawip",
                      							lv_rawip_6_0,
                      							"org.xtext.example.easywall.EasyWall.EFIPv4SYNTAX");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }

                    otherlv_7=(Token)match(input,53,FOLLOW_4); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_7, grammarAccess.getEFNetworkSYNTAXAccess().getSolidusKeyword_2_1());
                      			
                    }
                    // InternalEasyWall.g:2614:4: ( (lv_varnetmask_8_0= RULE_ID ) )
                    // InternalEasyWall.g:2615:5: (lv_varnetmask_8_0= RULE_ID )
                    {
                    // InternalEasyWall.g:2615:5: (lv_varnetmask_8_0= RULE_ID )
                    // InternalEasyWall.g:2616:6: lv_varnetmask_8_0= RULE_ID
                    {
                    lv_varnetmask_8_0=(Token)match(input,RULE_ID,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(lv_varnetmask_8_0, grammarAccess.getEFNetworkSYNTAXAccess().getVarnetmaskIDTerminalRuleCall_2_2_0());
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getEFNetworkSYNTAXRule());
                      						}
                      						setWithLastConsumed(
                      							current,
                      							"varnetmask",
                      							lv_varnetmask_8_0,
                      							"org.eclipse.xtext.common.Terminals.ID");
                      					
                    }

                    }


                    }


                    }


                    }
                    break;
                case 4 :
                    // InternalEasyWall.g:2634:3: ( ( (lv_varip_9_0= RULE_ID ) ) otherlv_10= '/' ( (lv_rawnetmask_11_0= RULE_INT ) ) )
                    {
                    // InternalEasyWall.g:2634:3: ( ( (lv_varip_9_0= RULE_ID ) ) otherlv_10= '/' ( (lv_rawnetmask_11_0= RULE_INT ) ) )
                    // InternalEasyWall.g:2635:4: ( (lv_varip_9_0= RULE_ID ) ) otherlv_10= '/' ( (lv_rawnetmask_11_0= RULE_INT ) )
                    {
                    // InternalEasyWall.g:2635:4: ( (lv_varip_9_0= RULE_ID ) )
                    // InternalEasyWall.g:2636:5: (lv_varip_9_0= RULE_ID )
                    {
                    // InternalEasyWall.g:2636:5: (lv_varip_9_0= RULE_ID )
                    // InternalEasyWall.g:2637:6: lv_varip_9_0= RULE_ID
                    {
                    lv_varip_9_0=(Token)match(input,RULE_ID,FOLLOW_32); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(lv_varip_9_0, grammarAccess.getEFNetworkSYNTAXAccess().getVaripIDTerminalRuleCall_3_0_0());
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getEFNetworkSYNTAXRule());
                      						}
                      						setWithLastConsumed(
                      							current,
                      							"varip",
                      							lv_varip_9_0,
                      							"org.eclipse.xtext.common.Terminals.ID");
                      					
                    }

                    }


                    }

                    otherlv_10=(Token)match(input,53,FOLLOW_31); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_10, grammarAccess.getEFNetworkSYNTAXAccess().getSolidusKeyword_3_1());
                      			
                    }
                    // InternalEasyWall.g:2657:4: ( (lv_rawnetmask_11_0= RULE_INT ) )
                    // InternalEasyWall.g:2658:5: (lv_rawnetmask_11_0= RULE_INT )
                    {
                    // InternalEasyWall.g:2658:5: (lv_rawnetmask_11_0= RULE_INT )
                    // InternalEasyWall.g:2659:6: lv_rawnetmask_11_0= RULE_INT
                    {
                    lv_rawnetmask_11_0=(Token)match(input,RULE_INT,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(lv_rawnetmask_11_0, grammarAccess.getEFNetworkSYNTAXAccess().getRawnetmaskINTTerminalRuleCall_3_2_0());
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getEFNetworkSYNTAXRule());
                      						}
                      						setWithLastConsumed(
                      							current,
                      							"rawnetmask",
                      							lv_rawnetmask_11_0,
                      							"org.eclipse.xtext.common.Terminals.INT");
                      					
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
    // $ANTLR end "ruleEFNetworkSYNTAX"


    // $ANTLR start "entryRuleEFNetmaskSYNTAX"
    // InternalEasyWall.g:2680:1: entryRuleEFNetmaskSYNTAX returns [EObject current=null] : iv_ruleEFNetmaskSYNTAX= ruleEFNetmaskSYNTAX EOF ;
    public final EObject entryRuleEFNetmaskSYNTAX() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEFNetmaskSYNTAX = null;


        try {
            // InternalEasyWall.g:2680:56: (iv_ruleEFNetmaskSYNTAX= ruleEFNetmaskSYNTAX EOF )
            // InternalEasyWall.g:2681:2: iv_ruleEFNetmaskSYNTAX= ruleEFNetmaskSYNTAX EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getEFNetmaskSYNTAXRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleEFNetmaskSYNTAX=ruleEFNetmaskSYNTAX();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleEFNetmaskSYNTAX; 
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
    // $ANTLR end "entryRuleEFNetmaskSYNTAX"


    // $ANTLR start "ruleEFNetmaskSYNTAX"
    // InternalEasyWall.g:2687:1: ruleEFNetmaskSYNTAX returns [EObject current=null] : (otherlv_0= '/' ( (lv_subnet_1_0= RULE_INT ) ) ) ;
    public final EObject ruleEFNetmaskSYNTAX() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_subnet_1_0=null;


        	enterRule();

        try {
            // InternalEasyWall.g:2693:2: ( (otherlv_0= '/' ( (lv_subnet_1_0= RULE_INT ) ) ) )
            // InternalEasyWall.g:2694:2: (otherlv_0= '/' ( (lv_subnet_1_0= RULE_INT ) ) )
            {
            // InternalEasyWall.g:2694:2: (otherlv_0= '/' ( (lv_subnet_1_0= RULE_INT ) ) )
            // InternalEasyWall.g:2695:3: otherlv_0= '/' ( (lv_subnet_1_0= RULE_INT ) )
            {
            otherlv_0=(Token)match(input,53,FOLLOW_31); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getEFNetmaskSYNTAXAccess().getSolidusKeyword_0());
              		
            }
            // InternalEasyWall.g:2699:3: ( (lv_subnet_1_0= RULE_INT ) )
            // InternalEasyWall.g:2700:4: (lv_subnet_1_0= RULE_INT )
            {
            // InternalEasyWall.g:2700:4: (lv_subnet_1_0= RULE_INT )
            // InternalEasyWall.g:2701:5: lv_subnet_1_0= RULE_INT
            {
            lv_subnet_1_0=(Token)match(input,RULE_INT,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_subnet_1_0, grammarAccess.getEFNetmaskSYNTAXAccess().getSubnetINTTerminalRuleCall_1_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getEFNetmaskSYNTAXRule());
              					}
              					setWithLastConsumed(
              						current,
              						"subnet",
              						lv_subnet_1_0,
              						"org.eclipse.xtext.common.Terminals.INT");
              				
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
    // $ANTLR end "ruleEFNetmaskSYNTAX"


    // $ANTLR start "entryRuleEFNetportSYNTAX"
    // InternalEasyWall.g:2721:1: entryRuleEFNetportSYNTAX returns [EObject current=null] : iv_ruleEFNetportSYNTAX= ruleEFNetportSYNTAX EOF ;
    public final EObject entryRuleEFNetportSYNTAX() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEFNetportSYNTAX = null;


        try {
            // InternalEasyWall.g:2721:56: (iv_ruleEFNetportSYNTAX= ruleEFNetportSYNTAX EOF )
            // InternalEasyWall.g:2722:2: iv_ruleEFNetportSYNTAX= ruleEFNetportSYNTAX EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getEFNetportSYNTAXRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleEFNetportSYNTAX=ruleEFNetportSYNTAX();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleEFNetportSYNTAX; 
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
    // $ANTLR end "entryRuleEFNetportSYNTAX"


    // $ANTLR start "ruleEFNetportSYNTAX"
    // InternalEasyWall.g:2728:1: ruleEFNetportSYNTAX returns [EObject current=null] : (otherlv_0= ':' ( (lv_netport_1_0= RULE_INT ) ) ) ;
    public final EObject ruleEFNetportSYNTAX() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_netport_1_0=null;


        	enterRule();

        try {
            // InternalEasyWall.g:2734:2: ( (otherlv_0= ':' ( (lv_netport_1_0= RULE_INT ) ) ) )
            // InternalEasyWall.g:2735:2: (otherlv_0= ':' ( (lv_netport_1_0= RULE_INT ) ) )
            {
            // InternalEasyWall.g:2735:2: (otherlv_0= ':' ( (lv_netport_1_0= RULE_INT ) ) )
            // InternalEasyWall.g:2736:3: otherlv_0= ':' ( (lv_netport_1_0= RULE_INT ) )
            {
            otherlv_0=(Token)match(input,23,FOLLOW_31); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getEFNetportSYNTAXAccess().getColonKeyword_0());
              		
            }
            // InternalEasyWall.g:2740:3: ( (lv_netport_1_0= RULE_INT ) )
            // InternalEasyWall.g:2741:4: (lv_netport_1_0= RULE_INT )
            {
            // InternalEasyWall.g:2741:4: (lv_netport_1_0= RULE_INT )
            // InternalEasyWall.g:2742:5: lv_netport_1_0= RULE_INT
            {
            lv_netport_1_0=(Token)match(input,RULE_INT,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_netport_1_0, grammarAccess.getEFNetportSYNTAXAccess().getNetportINTTerminalRuleCall_1_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getEFNetportSYNTAXRule());
              					}
              					setWithLastConsumed(
              						current,
              						"netport",
              						lv_netport_1_0,
              						"org.eclipse.xtext.common.Terminals.INT");
              				
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
    // $ANTLR end "ruleEFNetportSYNTAX"


    // $ANTLR start "ruleEFNetworkNativeType"
    // InternalEasyWall.g:2762:1: ruleEFNetworkNativeType returns [Enumerator current=null] : ( (enumLiteral_0= 'network' ) | (enumLiteral_1= 'netip' ) | (enumLiteral_2= 'netipv6' ) | (enumLiteral_3= 'netport' ) | (enumLiteral_4= 'protocol' ) | (enumLiteral_5= 'direction' ) | (enumLiteral_6= 'netmask' ) ) ;
    public final Enumerator ruleEFNetworkNativeType() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;
        Token enumLiteral_4=null;
        Token enumLiteral_5=null;
        Token enumLiteral_6=null;


        	enterRule();

        try {
            // InternalEasyWall.g:2768:2: ( ( (enumLiteral_0= 'network' ) | (enumLiteral_1= 'netip' ) | (enumLiteral_2= 'netipv6' ) | (enumLiteral_3= 'netport' ) | (enumLiteral_4= 'protocol' ) | (enumLiteral_5= 'direction' ) | (enumLiteral_6= 'netmask' ) ) )
            // InternalEasyWall.g:2769:2: ( (enumLiteral_0= 'network' ) | (enumLiteral_1= 'netip' ) | (enumLiteral_2= 'netipv6' ) | (enumLiteral_3= 'netport' ) | (enumLiteral_4= 'protocol' ) | (enumLiteral_5= 'direction' ) | (enumLiteral_6= 'netmask' ) )
            {
            // InternalEasyWall.g:2769:2: ( (enumLiteral_0= 'network' ) | (enumLiteral_1= 'netip' ) | (enumLiteral_2= 'netipv6' ) | (enumLiteral_3= 'netport' ) | (enumLiteral_4= 'protocol' ) | (enumLiteral_5= 'direction' ) | (enumLiteral_6= 'netmask' ) )
            int alt34=7;
            switch ( input.LA(1) ) {
            case 54:
                {
                alt34=1;
                }
                break;
            case 55:
                {
                alt34=2;
                }
                break;
            case 56:
                {
                alt34=3;
                }
                break;
            case 57:
                {
                alt34=4;
                }
                break;
            case 58:
                {
                alt34=5;
                }
                break;
            case 59:
                {
                alt34=6;
                }
                break;
            case 60:
                {
                alt34=7;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 34, 0, input);

                throw nvae;
            }

            switch (alt34) {
                case 1 :
                    // InternalEasyWall.g:2770:3: (enumLiteral_0= 'network' )
                    {
                    // InternalEasyWall.g:2770:3: (enumLiteral_0= 'network' )
                    // InternalEasyWall.g:2771:4: enumLiteral_0= 'network'
                    {
                    enumLiteral_0=(Token)match(input,54,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getEFNetworkNativeTypeAccess().getNETWORKEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_0, grammarAccess.getEFNetworkNativeTypeAccess().getNETWORKEnumLiteralDeclaration_0());
                      			
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalEasyWall.g:2778:3: (enumLiteral_1= 'netip' )
                    {
                    // InternalEasyWall.g:2778:3: (enumLiteral_1= 'netip' )
                    // InternalEasyWall.g:2779:4: enumLiteral_1= 'netip'
                    {
                    enumLiteral_1=(Token)match(input,55,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getEFNetworkNativeTypeAccess().getIPv4EnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_1, grammarAccess.getEFNetworkNativeTypeAccess().getIPv4EnumLiteralDeclaration_1());
                      			
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalEasyWall.g:2786:3: (enumLiteral_2= 'netipv6' )
                    {
                    // InternalEasyWall.g:2786:3: (enumLiteral_2= 'netipv6' )
                    // InternalEasyWall.g:2787:4: enumLiteral_2= 'netipv6'
                    {
                    enumLiteral_2=(Token)match(input,56,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getEFNetworkNativeTypeAccess().getIPv6EnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_2, grammarAccess.getEFNetworkNativeTypeAccess().getIPv6EnumLiteralDeclaration_2());
                      			
                    }

                    }


                    }
                    break;
                case 4 :
                    // InternalEasyWall.g:2794:3: (enumLiteral_3= 'netport' )
                    {
                    // InternalEasyWall.g:2794:3: (enumLiteral_3= 'netport' )
                    // InternalEasyWall.g:2795:4: enumLiteral_3= 'netport'
                    {
                    enumLiteral_3=(Token)match(input,57,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getEFNetworkNativeTypeAccess().getPORTEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_3, grammarAccess.getEFNetworkNativeTypeAccess().getPORTEnumLiteralDeclaration_3());
                      			
                    }

                    }


                    }
                    break;
                case 5 :
                    // InternalEasyWall.g:2802:3: (enumLiteral_4= 'protocol' )
                    {
                    // InternalEasyWall.g:2802:3: (enumLiteral_4= 'protocol' )
                    // InternalEasyWall.g:2803:4: enumLiteral_4= 'protocol'
                    {
                    enumLiteral_4=(Token)match(input,58,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getEFNetworkNativeTypeAccess().getPROTOCOLEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_4, grammarAccess.getEFNetworkNativeTypeAccess().getPROTOCOLEnumLiteralDeclaration_4());
                      			
                    }

                    }


                    }
                    break;
                case 6 :
                    // InternalEasyWall.g:2810:3: (enumLiteral_5= 'direction' )
                    {
                    // InternalEasyWall.g:2810:3: (enumLiteral_5= 'direction' )
                    // InternalEasyWall.g:2811:4: enumLiteral_5= 'direction'
                    {
                    enumLiteral_5=(Token)match(input,59,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getEFNetworkNativeTypeAccess().getDIRECTIONEnumLiteralDeclaration_5().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_5, grammarAccess.getEFNetworkNativeTypeAccess().getDIRECTIONEnumLiteralDeclaration_5());
                      			
                    }

                    }


                    }
                    break;
                case 7 :
                    // InternalEasyWall.g:2818:3: (enumLiteral_6= 'netmask' )
                    {
                    // InternalEasyWall.g:2818:3: (enumLiteral_6= 'netmask' )
                    // InternalEasyWall.g:2819:4: enumLiteral_6= 'netmask'
                    {
                    enumLiteral_6=(Token)match(input,60,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getEFNetworkNativeTypeAccess().getNETMASKEnumLiteralDeclaration_6().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_6, grammarAccess.getEFNetworkNativeTypeAccess().getNETMASKEnumLiteralDeclaration_6());
                      			
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
    // InternalEasyWall.g:2829:1: ruleEFDirectionNativeType returns [Enumerator current=null] : ( (enumLiteral_0= 'in' ) | (enumLiteral_1= 'out' ) ) ;
    public final Enumerator ruleEFDirectionNativeType() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;


        	enterRule();

        try {
            // InternalEasyWall.g:2835:2: ( ( (enumLiteral_0= 'in' ) | (enumLiteral_1= 'out' ) ) )
            // InternalEasyWall.g:2836:2: ( (enumLiteral_0= 'in' ) | (enumLiteral_1= 'out' ) )
            {
            // InternalEasyWall.g:2836:2: ( (enumLiteral_0= 'in' ) | (enumLiteral_1= 'out' ) )
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( (LA35_0==61) ) {
                alt35=1;
            }
            else if ( (LA35_0==62) ) {
                alt35=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 35, 0, input);

                throw nvae;
            }
            switch (alt35) {
                case 1 :
                    // InternalEasyWall.g:2837:3: (enumLiteral_0= 'in' )
                    {
                    // InternalEasyWall.g:2837:3: (enumLiteral_0= 'in' )
                    // InternalEasyWall.g:2838:4: enumLiteral_0= 'in'
                    {
                    enumLiteral_0=(Token)match(input,61,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getEFDirectionNativeTypeAccess().getINEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_0, grammarAccess.getEFDirectionNativeTypeAccess().getINEnumLiteralDeclaration_0());
                      			
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalEasyWall.g:2845:3: (enumLiteral_1= 'out' )
                    {
                    // InternalEasyWall.g:2845:3: (enumLiteral_1= 'out' )
                    // InternalEasyWall.g:2846:4: enumLiteral_1= 'out'
                    {
                    enumLiteral_1=(Token)match(input,62,FOLLOW_2); if (state.failed) return current;
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
    // InternalEasyWall.g:2856:1: ruleEFRulesTypes returns [Enumerator current=null] : ( (enumLiteral_0= 'NetworkLayer' ) | (enumLiteral_1= 'TransportLayer' ) | (enumLiteral_2= 'ApplicationLayer' ) ) ;
    public final Enumerator ruleEFRulesTypes() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;


        	enterRule();

        try {
            // InternalEasyWall.g:2862:2: ( ( (enumLiteral_0= 'NetworkLayer' ) | (enumLiteral_1= 'TransportLayer' ) | (enumLiteral_2= 'ApplicationLayer' ) ) )
            // InternalEasyWall.g:2863:2: ( (enumLiteral_0= 'NetworkLayer' ) | (enumLiteral_1= 'TransportLayer' ) | (enumLiteral_2= 'ApplicationLayer' ) )
            {
            // InternalEasyWall.g:2863:2: ( (enumLiteral_0= 'NetworkLayer' ) | (enumLiteral_1= 'TransportLayer' ) | (enumLiteral_2= 'ApplicationLayer' ) )
            int alt36=3;
            switch ( input.LA(1) ) {
            case 63:
                {
                alt36=1;
                }
                break;
            case 64:
                {
                alt36=2;
                }
                break;
            case 65:
                {
                alt36=3;
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
                    // InternalEasyWall.g:2864:3: (enumLiteral_0= 'NetworkLayer' )
                    {
                    // InternalEasyWall.g:2864:3: (enumLiteral_0= 'NetworkLayer' )
                    // InternalEasyWall.g:2865:4: enumLiteral_0= 'NetworkLayer'
                    {
                    enumLiteral_0=(Token)match(input,63,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getEFRulesTypesAccess().getIPLEVELEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_0, grammarAccess.getEFRulesTypesAccess().getIPLEVELEnumLiteralDeclaration_0());
                      			
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalEasyWall.g:2872:3: (enumLiteral_1= 'TransportLayer' )
                    {
                    // InternalEasyWall.g:2872:3: (enumLiteral_1= 'TransportLayer' )
                    // InternalEasyWall.g:2873:4: enumLiteral_1= 'TransportLayer'
                    {
                    enumLiteral_1=(Token)match(input,64,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getEFRulesTypesAccess().getTRANSPLEVELEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_1, grammarAccess.getEFRulesTypesAccess().getTRANSPLEVELEnumLiteralDeclaration_1());
                      			
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalEasyWall.g:2880:3: (enumLiteral_2= 'ApplicationLayer' )
                    {
                    // InternalEasyWall.g:2880:3: (enumLiteral_2= 'ApplicationLayer' )
                    // InternalEasyWall.g:2881:4: enumLiteral_2= 'ApplicationLayer'
                    {
                    enumLiteral_2=(Token)match(input,65,FOLLOW_2); if (state.failed) return current;
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
    // InternalEasyWall.g:2891:1: ruleNETWORKLAYERPROTOCOL returns [Enumerator current=null] : ( (enumLiteral_0= 'IPv4' ) | (enumLiteral_1= 'IPv6' ) | (enumLiteral_2= 'ARP' ) | (enumLiteral_3= 'ICMP' ) | (enumLiteral_4= 'NAT' ) | (enumLiteral_5= 'RIP' ) | (enumLiteral_6= 'OSPF' ) | (enumLiteral_7= 'IPSEC' ) | (enumLiteral_8= 'IGMP' ) ) ;
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
            // InternalEasyWall.g:2897:2: ( ( (enumLiteral_0= 'IPv4' ) | (enumLiteral_1= 'IPv6' ) | (enumLiteral_2= 'ARP' ) | (enumLiteral_3= 'ICMP' ) | (enumLiteral_4= 'NAT' ) | (enumLiteral_5= 'RIP' ) | (enumLiteral_6= 'OSPF' ) | (enumLiteral_7= 'IPSEC' ) | (enumLiteral_8= 'IGMP' ) ) )
            // InternalEasyWall.g:2898:2: ( (enumLiteral_0= 'IPv4' ) | (enumLiteral_1= 'IPv6' ) | (enumLiteral_2= 'ARP' ) | (enumLiteral_3= 'ICMP' ) | (enumLiteral_4= 'NAT' ) | (enumLiteral_5= 'RIP' ) | (enumLiteral_6= 'OSPF' ) | (enumLiteral_7= 'IPSEC' ) | (enumLiteral_8= 'IGMP' ) )
            {
            // InternalEasyWall.g:2898:2: ( (enumLiteral_0= 'IPv4' ) | (enumLiteral_1= 'IPv6' ) | (enumLiteral_2= 'ARP' ) | (enumLiteral_3= 'ICMP' ) | (enumLiteral_4= 'NAT' ) | (enumLiteral_5= 'RIP' ) | (enumLiteral_6= 'OSPF' ) | (enumLiteral_7= 'IPSEC' ) | (enumLiteral_8= 'IGMP' ) )
            int alt37=9;
            switch ( input.LA(1) ) {
            case 66:
                {
                alt37=1;
                }
                break;
            case 67:
                {
                alt37=2;
                }
                break;
            case 68:
                {
                alt37=3;
                }
                break;
            case 69:
                {
                alt37=4;
                }
                break;
            case 70:
                {
                alt37=5;
                }
                break;
            case 71:
                {
                alt37=6;
                }
                break;
            case 72:
                {
                alt37=7;
                }
                break;
            case 73:
                {
                alt37=8;
                }
                break;
            case 74:
                {
                alt37=9;
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
                    // InternalEasyWall.g:2899:3: (enumLiteral_0= 'IPv4' )
                    {
                    // InternalEasyWall.g:2899:3: (enumLiteral_0= 'IPv4' )
                    // InternalEasyWall.g:2900:4: enumLiteral_0= 'IPv4'
                    {
                    enumLiteral_0=(Token)match(input,66,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getNETWORKLAYERPROTOCOLAccess().getIPv4EnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_0, grammarAccess.getNETWORKLAYERPROTOCOLAccess().getIPv4EnumLiteralDeclaration_0());
                      			
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalEasyWall.g:2907:3: (enumLiteral_1= 'IPv6' )
                    {
                    // InternalEasyWall.g:2907:3: (enumLiteral_1= 'IPv6' )
                    // InternalEasyWall.g:2908:4: enumLiteral_1= 'IPv6'
                    {
                    enumLiteral_1=(Token)match(input,67,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getNETWORKLAYERPROTOCOLAccess().getIPv6EnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_1, grammarAccess.getNETWORKLAYERPROTOCOLAccess().getIPv6EnumLiteralDeclaration_1());
                      			
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalEasyWall.g:2915:3: (enumLiteral_2= 'ARP' )
                    {
                    // InternalEasyWall.g:2915:3: (enumLiteral_2= 'ARP' )
                    // InternalEasyWall.g:2916:4: enumLiteral_2= 'ARP'
                    {
                    enumLiteral_2=(Token)match(input,68,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getNETWORKLAYERPROTOCOLAccess().getARPEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_2, grammarAccess.getNETWORKLAYERPROTOCOLAccess().getARPEnumLiteralDeclaration_2());
                      			
                    }

                    }


                    }
                    break;
                case 4 :
                    // InternalEasyWall.g:2923:3: (enumLiteral_3= 'ICMP' )
                    {
                    // InternalEasyWall.g:2923:3: (enumLiteral_3= 'ICMP' )
                    // InternalEasyWall.g:2924:4: enumLiteral_3= 'ICMP'
                    {
                    enumLiteral_3=(Token)match(input,69,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getNETWORKLAYERPROTOCOLAccess().getICMPEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_3, grammarAccess.getNETWORKLAYERPROTOCOLAccess().getICMPEnumLiteralDeclaration_3());
                      			
                    }

                    }


                    }
                    break;
                case 5 :
                    // InternalEasyWall.g:2931:3: (enumLiteral_4= 'NAT' )
                    {
                    // InternalEasyWall.g:2931:3: (enumLiteral_4= 'NAT' )
                    // InternalEasyWall.g:2932:4: enumLiteral_4= 'NAT'
                    {
                    enumLiteral_4=(Token)match(input,70,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getNETWORKLAYERPROTOCOLAccess().getNATEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_4, grammarAccess.getNETWORKLAYERPROTOCOLAccess().getNATEnumLiteralDeclaration_4());
                      			
                    }

                    }


                    }
                    break;
                case 6 :
                    // InternalEasyWall.g:2939:3: (enumLiteral_5= 'RIP' )
                    {
                    // InternalEasyWall.g:2939:3: (enumLiteral_5= 'RIP' )
                    // InternalEasyWall.g:2940:4: enumLiteral_5= 'RIP'
                    {
                    enumLiteral_5=(Token)match(input,71,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getNETWORKLAYERPROTOCOLAccess().getRIPEnumLiteralDeclaration_5().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_5, grammarAccess.getNETWORKLAYERPROTOCOLAccess().getRIPEnumLiteralDeclaration_5());
                      			
                    }

                    }


                    }
                    break;
                case 7 :
                    // InternalEasyWall.g:2947:3: (enumLiteral_6= 'OSPF' )
                    {
                    // InternalEasyWall.g:2947:3: (enumLiteral_6= 'OSPF' )
                    // InternalEasyWall.g:2948:4: enumLiteral_6= 'OSPF'
                    {
                    enumLiteral_6=(Token)match(input,72,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getNETWORKLAYERPROTOCOLAccess().getOSPFEnumLiteralDeclaration_6().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_6, grammarAccess.getNETWORKLAYERPROTOCOLAccess().getOSPFEnumLiteralDeclaration_6());
                      			
                    }

                    }


                    }
                    break;
                case 8 :
                    // InternalEasyWall.g:2955:3: (enumLiteral_7= 'IPSEC' )
                    {
                    // InternalEasyWall.g:2955:3: (enumLiteral_7= 'IPSEC' )
                    // InternalEasyWall.g:2956:4: enumLiteral_7= 'IPSEC'
                    {
                    enumLiteral_7=(Token)match(input,73,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getNETWORKLAYERPROTOCOLAccess().getIPSECEnumLiteralDeclaration_7().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_7, grammarAccess.getNETWORKLAYERPROTOCOLAccess().getIPSECEnumLiteralDeclaration_7());
                      			
                    }

                    }


                    }
                    break;
                case 9 :
                    // InternalEasyWall.g:2963:3: (enumLiteral_8= 'IGMP' )
                    {
                    // InternalEasyWall.g:2963:3: (enumLiteral_8= 'IGMP' )
                    // InternalEasyWall.g:2964:4: enumLiteral_8= 'IGMP'
                    {
                    enumLiteral_8=(Token)match(input,74,FOLLOW_2); if (state.failed) return current;
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
    // InternalEasyWall.g:2974:1: ruleTRANSPORTLAYERPROTOCOL returns [Enumerator current=null] : ( (enumLiteral_0= 'UDP' ) | (enumLiteral_1= 'TCP' ) | (enumLiteral_2= 'QUIC' ) | (enumLiteral_3= 'SCTP' ) ) ;
    public final Enumerator ruleTRANSPORTLAYERPROTOCOL() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;


        	enterRule();

        try {
            // InternalEasyWall.g:2980:2: ( ( (enumLiteral_0= 'UDP' ) | (enumLiteral_1= 'TCP' ) | (enumLiteral_2= 'QUIC' ) | (enumLiteral_3= 'SCTP' ) ) )
            // InternalEasyWall.g:2981:2: ( (enumLiteral_0= 'UDP' ) | (enumLiteral_1= 'TCP' ) | (enumLiteral_2= 'QUIC' ) | (enumLiteral_3= 'SCTP' ) )
            {
            // InternalEasyWall.g:2981:2: ( (enumLiteral_0= 'UDP' ) | (enumLiteral_1= 'TCP' ) | (enumLiteral_2= 'QUIC' ) | (enumLiteral_3= 'SCTP' ) )
            int alt38=4;
            switch ( input.LA(1) ) {
            case 75:
                {
                alt38=1;
                }
                break;
            case 76:
                {
                alt38=2;
                }
                break;
            case 77:
                {
                alt38=3;
                }
                break;
            case 78:
                {
                alt38=4;
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
                    // InternalEasyWall.g:2982:3: (enumLiteral_0= 'UDP' )
                    {
                    // InternalEasyWall.g:2982:3: (enumLiteral_0= 'UDP' )
                    // InternalEasyWall.g:2983:4: enumLiteral_0= 'UDP'
                    {
                    enumLiteral_0=(Token)match(input,75,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getTRANSPORTLAYERPROTOCOLAccess().getUDPEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_0, grammarAccess.getTRANSPORTLAYERPROTOCOLAccess().getUDPEnumLiteralDeclaration_0());
                      			
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalEasyWall.g:2990:3: (enumLiteral_1= 'TCP' )
                    {
                    // InternalEasyWall.g:2990:3: (enumLiteral_1= 'TCP' )
                    // InternalEasyWall.g:2991:4: enumLiteral_1= 'TCP'
                    {
                    enumLiteral_1=(Token)match(input,76,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getTRANSPORTLAYERPROTOCOLAccess().getTCPEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_1, grammarAccess.getTRANSPORTLAYERPROTOCOLAccess().getTCPEnumLiteralDeclaration_1());
                      			
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalEasyWall.g:2998:3: (enumLiteral_2= 'QUIC' )
                    {
                    // InternalEasyWall.g:2998:3: (enumLiteral_2= 'QUIC' )
                    // InternalEasyWall.g:2999:4: enumLiteral_2= 'QUIC'
                    {
                    enumLiteral_2=(Token)match(input,77,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getTRANSPORTLAYERPROTOCOLAccess().getQUICEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_2, grammarAccess.getTRANSPORTLAYERPROTOCOLAccess().getQUICEnumLiteralDeclaration_2());
                      			
                    }

                    }


                    }
                    break;
                case 4 :
                    // InternalEasyWall.g:3006:3: (enumLiteral_3= 'SCTP' )
                    {
                    // InternalEasyWall.g:3006:3: (enumLiteral_3= 'SCTP' )
                    // InternalEasyWall.g:3007:4: enumLiteral_3= 'SCTP'
                    {
                    enumLiteral_3=(Token)match(input,78,FOLLOW_2); if (state.failed) return current;
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
    // InternalEasyWall.g:3017:1: ruleAPPLICATIONLAYERPROTOCOL returns [Enumerator current=null] : ( (enumLiteral_0= 'HTTP' ) | (enumLiteral_1= 'HTTPS' ) | (enumLiteral_2= 'SMTP' ) | (enumLiteral_3= 'POP3' ) | (enumLiteral_4= 'IMAP' ) | (enumLiteral_5= 'FTP' ) | (enumLiteral_6= 'TFTP' ) | (enumLiteral_7= 'SNMP' ) | (enumLiteral_8= 'TELNET' ) | (enumLiteral_9= 'SSH' ) | (enumLiteral_10= 'DNS' ) | (enumLiteral_11= 'DHCP' ) ) ;
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
            // InternalEasyWall.g:3023:2: ( ( (enumLiteral_0= 'HTTP' ) | (enumLiteral_1= 'HTTPS' ) | (enumLiteral_2= 'SMTP' ) | (enumLiteral_3= 'POP3' ) | (enumLiteral_4= 'IMAP' ) | (enumLiteral_5= 'FTP' ) | (enumLiteral_6= 'TFTP' ) | (enumLiteral_7= 'SNMP' ) | (enumLiteral_8= 'TELNET' ) | (enumLiteral_9= 'SSH' ) | (enumLiteral_10= 'DNS' ) | (enumLiteral_11= 'DHCP' ) ) )
            // InternalEasyWall.g:3024:2: ( (enumLiteral_0= 'HTTP' ) | (enumLiteral_1= 'HTTPS' ) | (enumLiteral_2= 'SMTP' ) | (enumLiteral_3= 'POP3' ) | (enumLiteral_4= 'IMAP' ) | (enumLiteral_5= 'FTP' ) | (enumLiteral_6= 'TFTP' ) | (enumLiteral_7= 'SNMP' ) | (enumLiteral_8= 'TELNET' ) | (enumLiteral_9= 'SSH' ) | (enumLiteral_10= 'DNS' ) | (enumLiteral_11= 'DHCP' ) )
            {
            // InternalEasyWall.g:3024:2: ( (enumLiteral_0= 'HTTP' ) | (enumLiteral_1= 'HTTPS' ) | (enumLiteral_2= 'SMTP' ) | (enumLiteral_3= 'POP3' ) | (enumLiteral_4= 'IMAP' ) | (enumLiteral_5= 'FTP' ) | (enumLiteral_6= 'TFTP' ) | (enumLiteral_7= 'SNMP' ) | (enumLiteral_8= 'TELNET' ) | (enumLiteral_9= 'SSH' ) | (enumLiteral_10= 'DNS' ) | (enumLiteral_11= 'DHCP' ) )
            int alt39=12;
            switch ( input.LA(1) ) {
            case 79:
                {
                alt39=1;
                }
                break;
            case 80:
                {
                alt39=2;
                }
                break;
            case 81:
                {
                alt39=3;
                }
                break;
            case 82:
                {
                alt39=4;
                }
                break;
            case 83:
                {
                alt39=5;
                }
                break;
            case 84:
                {
                alt39=6;
                }
                break;
            case 85:
                {
                alt39=7;
                }
                break;
            case 86:
                {
                alt39=8;
                }
                break;
            case 87:
                {
                alt39=9;
                }
                break;
            case 88:
                {
                alt39=10;
                }
                break;
            case 89:
                {
                alt39=11;
                }
                break;
            case 90:
                {
                alt39=12;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 39, 0, input);

                throw nvae;
            }

            switch (alt39) {
                case 1 :
                    // InternalEasyWall.g:3025:3: (enumLiteral_0= 'HTTP' )
                    {
                    // InternalEasyWall.g:3025:3: (enumLiteral_0= 'HTTP' )
                    // InternalEasyWall.g:3026:4: enumLiteral_0= 'HTTP'
                    {
                    enumLiteral_0=(Token)match(input,79,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getAPPLICATIONLAYERPROTOCOLAccess().getHTTPEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_0, grammarAccess.getAPPLICATIONLAYERPROTOCOLAccess().getHTTPEnumLiteralDeclaration_0());
                      			
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalEasyWall.g:3033:3: (enumLiteral_1= 'HTTPS' )
                    {
                    // InternalEasyWall.g:3033:3: (enumLiteral_1= 'HTTPS' )
                    // InternalEasyWall.g:3034:4: enumLiteral_1= 'HTTPS'
                    {
                    enumLiteral_1=(Token)match(input,80,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getAPPLICATIONLAYERPROTOCOLAccess().getHTTPSEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_1, grammarAccess.getAPPLICATIONLAYERPROTOCOLAccess().getHTTPSEnumLiteralDeclaration_1());
                      			
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalEasyWall.g:3041:3: (enumLiteral_2= 'SMTP' )
                    {
                    // InternalEasyWall.g:3041:3: (enumLiteral_2= 'SMTP' )
                    // InternalEasyWall.g:3042:4: enumLiteral_2= 'SMTP'
                    {
                    enumLiteral_2=(Token)match(input,81,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getAPPLICATIONLAYERPROTOCOLAccess().getSMTPEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_2, grammarAccess.getAPPLICATIONLAYERPROTOCOLAccess().getSMTPEnumLiteralDeclaration_2());
                      			
                    }

                    }


                    }
                    break;
                case 4 :
                    // InternalEasyWall.g:3049:3: (enumLiteral_3= 'POP3' )
                    {
                    // InternalEasyWall.g:3049:3: (enumLiteral_3= 'POP3' )
                    // InternalEasyWall.g:3050:4: enumLiteral_3= 'POP3'
                    {
                    enumLiteral_3=(Token)match(input,82,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getAPPLICATIONLAYERPROTOCOLAccess().getPOP3EnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_3, grammarAccess.getAPPLICATIONLAYERPROTOCOLAccess().getPOP3EnumLiteralDeclaration_3());
                      			
                    }

                    }


                    }
                    break;
                case 5 :
                    // InternalEasyWall.g:3057:3: (enumLiteral_4= 'IMAP' )
                    {
                    // InternalEasyWall.g:3057:3: (enumLiteral_4= 'IMAP' )
                    // InternalEasyWall.g:3058:4: enumLiteral_4= 'IMAP'
                    {
                    enumLiteral_4=(Token)match(input,83,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getAPPLICATIONLAYERPROTOCOLAccess().getIMAPEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_4, grammarAccess.getAPPLICATIONLAYERPROTOCOLAccess().getIMAPEnumLiteralDeclaration_4());
                      			
                    }

                    }


                    }
                    break;
                case 6 :
                    // InternalEasyWall.g:3065:3: (enumLiteral_5= 'FTP' )
                    {
                    // InternalEasyWall.g:3065:3: (enumLiteral_5= 'FTP' )
                    // InternalEasyWall.g:3066:4: enumLiteral_5= 'FTP'
                    {
                    enumLiteral_5=(Token)match(input,84,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getAPPLICATIONLAYERPROTOCOLAccess().getFTPEnumLiteralDeclaration_5().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_5, grammarAccess.getAPPLICATIONLAYERPROTOCOLAccess().getFTPEnumLiteralDeclaration_5());
                      			
                    }

                    }


                    }
                    break;
                case 7 :
                    // InternalEasyWall.g:3073:3: (enumLiteral_6= 'TFTP' )
                    {
                    // InternalEasyWall.g:3073:3: (enumLiteral_6= 'TFTP' )
                    // InternalEasyWall.g:3074:4: enumLiteral_6= 'TFTP'
                    {
                    enumLiteral_6=(Token)match(input,85,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getAPPLICATIONLAYERPROTOCOLAccess().getTFTPEnumLiteralDeclaration_6().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_6, grammarAccess.getAPPLICATIONLAYERPROTOCOLAccess().getTFTPEnumLiteralDeclaration_6());
                      			
                    }

                    }


                    }
                    break;
                case 8 :
                    // InternalEasyWall.g:3081:3: (enumLiteral_7= 'SNMP' )
                    {
                    // InternalEasyWall.g:3081:3: (enumLiteral_7= 'SNMP' )
                    // InternalEasyWall.g:3082:4: enumLiteral_7= 'SNMP'
                    {
                    enumLiteral_7=(Token)match(input,86,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getAPPLICATIONLAYERPROTOCOLAccess().getSNMPEnumLiteralDeclaration_7().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_7, grammarAccess.getAPPLICATIONLAYERPROTOCOLAccess().getSNMPEnumLiteralDeclaration_7());
                      			
                    }

                    }


                    }
                    break;
                case 9 :
                    // InternalEasyWall.g:3089:3: (enumLiteral_8= 'TELNET' )
                    {
                    // InternalEasyWall.g:3089:3: (enumLiteral_8= 'TELNET' )
                    // InternalEasyWall.g:3090:4: enumLiteral_8= 'TELNET'
                    {
                    enumLiteral_8=(Token)match(input,87,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getAPPLICATIONLAYERPROTOCOLAccess().getTELNETEnumLiteralDeclaration_8().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_8, grammarAccess.getAPPLICATIONLAYERPROTOCOLAccess().getTELNETEnumLiteralDeclaration_8());
                      			
                    }

                    }


                    }
                    break;
                case 10 :
                    // InternalEasyWall.g:3097:3: (enumLiteral_9= 'SSH' )
                    {
                    // InternalEasyWall.g:3097:3: (enumLiteral_9= 'SSH' )
                    // InternalEasyWall.g:3098:4: enumLiteral_9= 'SSH'
                    {
                    enumLiteral_9=(Token)match(input,88,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getAPPLICATIONLAYERPROTOCOLAccess().getSSHEnumLiteralDeclaration_9().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_9, grammarAccess.getAPPLICATIONLAYERPROTOCOLAccess().getSSHEnumLiteralDeclaration_9());
                      			
                    }

                    }


                    }
                    break;
                case 11 :
                    // InternalEasyWall.g:3105:3: (enumLiteral_10= 'DNS' )
                    {
                    // InternalEasyWall.g:3105:3: (enumLiteral_10= 'DNS' )
                    // InternalEasyWall.g:3106:4: enumLiteral_10= 'DNS'
                    {
                    enumLiteral_10=(Token)match(input,89,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getAPPLICATIONLAYERPROTOCOLAccess().getDNSEnumLiteralDeclaration_10().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_10, grammarAccess.getAPPLICATIONLAYERPROTOCOLAccess().getDNSEnumLiteralDeclaration_10());
                      			
                    }

                    }


                    }
                    break;
                case 12 :
                    // InternalEasyWall.g:3113:3: (enumLiteral_11= 'DHCP' )
                    {
                    // InternalEasyWall.g:3113:3: (enumLiteral_11= 'DHCP' )
                    // InternalEasyWall.g:3114:4: enumLiteral_11= 'DHCP'
                    {
                    enumLiteral_11=(Token)match(input,90,FOLLOW_2); if (state.failed) return current;
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
        // InternalEasyWall.g:971:5: ( 'else' )
        // InternalEasyWall.g:971:6: 'else'
        {
        match(input,30,FOLLOW_2); if (state.failed) return ;

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


    protected DFA25 dfa25 = new DFA25(this);
    protected DFA33 dfa33 = new DFA33(this);
    static final String dfa_1s = "\40\uffff";
    static final String dfa_2s = "\2\uffff\1\24\7\uffff\2\25\1\31\16\uffff\1\31\3\uffff\1\25";
    static final String dfa_3s = "\1\4\1\uffff\1\15\7\uffff\3\15\6\uffff\1\6\3\uffff\1\4\2\uffff\1\17\1\15\1\6\1\17\1\6\1\15";
    static final String dfa_4s = "\1\132\1\uffff\1\62\7\uffff\3\65\6\uffff\1\6\3\uffff\1\4\2\uffff\1\17\1\62\1\6\1\17\1\6\1\65";
    static final String dfa_5s = "\1\uffff\1\1\1\uffff\1\3\1\4\1\5\1\6\1\7\1\10\1\11\3\uffff\1\14\1\15\1\16\1\17\1\20\1\21\1\uffff\1\2\1\12\1\13\1\uffff\1\22\1\23\6\uffff";
    static final String dfa_6s = "\40\uffff}>";
    static final String[] dfa_7s = {
            "\1\14\1\1\1\2\1\11\17\uffff\1\15\1\uffff\1\22\5\uffff\2\3\1\17\1\20\1\21\17\uffff\1\12\1\13\1\16\7\4\2\5\3\uffff\11\6\4\7\14\10",
            "",
            "\1\24\1\uffff\1\23\6\uffff\1\24\3\uffff\2\24\12\uffff\4\24\2\uffff\7\24",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\25\10\uffff\1\25\3\uffff\2\25\12\uffff\4\25\2\uffff\7\25\2\uffff\1\26",
            "\1\25\10\uffff\1\25\3\uffff\2\25\12\uffff\4\25\2\uffff\7\25\2\uffff\1\26",
            "\1\31\1\uffff\1\27\6\uffff\1\31\2\uffff\1\30\2\31\12\uffff\4\31\2\uffff\7\31\2\uffff\1\26",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\32",
            "",
            "",
            "",
            "\1\33",
            "",
            "",
            "\1\34",
            "\1\31\1\uffff\1\27\6\uffff\1\31\2\uffff\1\30\2\31\12\uffff\4\31\2\uffff\7\31",
            "\1\35",
            "\1\36",
            "\1\37",
            "\1\25\10\uffff\1\25\3\uffff\2\25\12\uffff\4\25\2\uffff\7\25\2\uffff\1\26"
    };

    static final short[] dfa_1 = DFA.unpackEncodedString(dfa_1s);
    static final short[] dfa_2 = DFA.unpackEncodedString(dfa_2s);
    static final char[] dfa_3 = DFA.unpackEncodedStringToUnsignedChars(dfa_3s);
    static final char[] dfa_4 = DFA.unpackEncodedStringToUnsignedChars(dfa_4s);
    static final short[] dfa_5 = DFA.unpackEncodedString(dfa_5s);
    static final short[] dfa_6 = DFA.unpackEncodedString(dfa_6s);
    static final short[][] dfa_7 = unpackEncodedStringArray(dfa_7s);

    class DFA25 extends DFA {

        public DFA25(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 25;
            this.eot = dfa_1;
            this.eof = dfa_2;
            this.min = dfa_3;
            this.max = dfa_4;
            this.accept = dfa_5;
            this.special = dfa_6;
            this.transition = dfa_7;
        }
        public String getDescription() {
            return "1457:2: ( ( () ( (lv_value_1_0= RULE_STRING ) ) ) | ( () ( (lv_value_3_0= RULE_INT ) ) ) | ( () ( ( (lv_value_5_1= 'true' | lv_value_5_2= 'false' ) ) ) ) | ( () ( (lv_type_7_0= ruleEFNetworkNativeType ) ) ) | ( () ( (lv_direction_9_0= ruleEFDirectionNativeType ) ) ) | ( () ( (lv_protocol_11_0= ruleNETWORKLAYERPROTOCOL ) ) ) | ( () ( (lv_protocol_13_0= ruleTRANSPORTLAYERPROTOCOL ) ) ) | ( () ( (lv_protocol_15_0= ruleAPPLICATIONLAYERPROTOCOL ) ) ) | ( () ( (lv_ipv6_17_0= RULE_EFIPV6SYNTAX ) ) ) | ( () ( (lv_ipv4_19_0= ruleEFIPv4SYNTAX ) ) ) | ( () ( (lv_network_21_0= ruleEFNetworkSYNTAX ) ) ) | ( () ( (lv_port_23_0= ruleEFNetportSYNTAX ) ) ) | ( () ( (lv_netmask_25_0= ruleEFNetmaskSYNTAX ) ) ) | ( () otherlv_27= 'this' ) | ( () otherlv_29= 'super' ) | ( () otherlv_31= 'new' ( ( ruleQualifiedName ) ) otherlv_33= '(' otherlv_34= ')' ) | ( () otherlv_36= '(' ( (lv_expression_37_0= ruleEFExpression ) ) otherlv_38= ')' ) | ( () ( (lv_functionName_40_0= ruleQualifiedName ) ) otherlv_41= '(' ( ( (lv_args_42_0= ruleEFExpression ) ) (otherlv_43= ',' ( (lv_args_44_0= ruleEFExpression ) ) )* )? otherlv_45= ')' ) | ( () ( (lv_symbol_47_0= ruleQualifiedName ) ) ) )";
        }
    }
    static final String dfa_8s = "\21\uffff";
    static final String dfa_9s = "\1\4\1\65\1\17\2\65\1\4\1\6\1\4\2\uffff\1\17\2\uffff\1\6\1\17\1\6\1\65";
    static final String dfa_10s = "\1\64\1\65\1\17\2\65\3\6\2\uffff\1\17\2\uffff\1\6\1\17\1\6\1\65";
    static final String dfa_11s = "\10\uffff\1\1\1\4\1\uffff\1\3\1\2\4\uffff";
    static final String dfa_12s = "\21\uffff}>";
    static final String[] dfa_13s = {
            "\1\1\1\uffff\1\2\54\uffff\1\3\1\4",
            "\1\5",
            "\1\6",
            "\1\7",
            "\1\7",
            "\1\10\1\uffff\1\11",
            "\1\12",
            "\1\13\1\uffff\1\14",
            "",
            "",
            "\1\15",
            "",
            "",
            "\1\16",
            "\1\17",
            "\1\20",
            "\1\7"
    };

    static final short[] dfa_8 = DFA.unpackEncodedString(dfa_8s);
    static final char[] dfa_9 = DFA.unpackEncodedStringToUnsignedChars(dfa_9s);
    static final char[] dfa_10 = DFA.unpackEncodedStringToUnsignedChars(dfa_10s);
    static final short[] dfa_11 = DFA.unpackEncodedString(dfa_11s);
    static final short[] dfa_12 = DFA.unpackEncodedString(dfa_12s);
    static final short[][] dfa_13 = unpackEncodedStringArray(dfa_13s);

    class DFA33 extends DFA {

        public DFA33(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 33;
            this.eot = dfa_8;
            this.eof = dfa_8;
            this.min = dfa_9;
            this.max = dfa_10;
            this.accept = dfa_11;
            this.special = dfa_12;
            this.transition = dfa_13;
        }
        public String getDescription() {
            return "2502:2: ( ( ( (lv_varip_0_0= RULE_ID ) ) otherlv_1= '/' ( (lv_varnetmask_2_0= RULE_ID ) ) ) | ( ( (lv_rawip_3_0= ruleEFIPv4SYNTAX ) ) otherlv_4= '/' ( (lv_rawnetmask_5_0= RULE_INT ) ) ) | ( ( (lv_rawip_6_0= ruleEFIPv4SYNTAX ) ) otherlv_7= '/' ( (lv_varnetmask_8_0= RULE_ID ) ) ) | ( ( (lv_varip_9_0= RULE_ID ) ) otherlv_10= '/' ( (lv_rawnetmask_11_0= RULE_INT ) ) ) )";
        }
    }
 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000001000020000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000004002L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000008002L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000001380000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000402000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x7FF80C0F828000F0L,0x0000000007FFFFFCL});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x1FC0000000000010L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000008000010L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x000000000C000000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x7FF80C0FB2B800F0L,0x0000000007FFFFFCL});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x7FF80C0FB2B400F0L,0x0000000007FFFFFCL});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000040000002L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000000400002L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x000000C000000002L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000030000000002L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000700000000002L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0007800000000002L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x7FF80C0F8A8000F0L,0x0000000007FFFFFCL});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x8000000000000000L,0x0000000000000003L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0020000000000000L});

}