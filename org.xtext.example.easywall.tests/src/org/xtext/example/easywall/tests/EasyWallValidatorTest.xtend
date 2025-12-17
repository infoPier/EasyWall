package org.xtext.example.easywall.tests

import org.junit.jupiter.api.^extension.ExtendWith
import org.eclipse.xtext.testing.InjectWith
import org.eclipse.xtext.testing.extensions.InjectionExtension
import org.xtext.example.easywall.easyWall.EFProgram
import com.google.inject.Inject
import org.eclipse.xtext.testing.util.ParseHelper
import org.junit.jupiter.api.Test
import org.eclipse.xtext.testing.validation.ValidationTestHelper
import org.xtext.example.easywall.easyWall.EasyWallPackage
import org.xtext.example.easywall.validation.EasyWallValidator

@ExtendWith(InjectionExtension)
@InjectWith(EasyWallInjectorProvider)
class EasyWallValidatorTest {
	@Inject extension ParseHelper<EFProgram>
	@Inject extension ValidationTestHelper
	
	@Test
	def void MissingProtocolTest(){
		'''
		pack my.fire;
		import net.rules.*;
		rule r at ApplicationLayer{
			var RULE_DIRECTION : direction = in;
			var ip : netip = 192.168.0.1;
		}
		'''.parse.assertError(
			EasyWallPackage.eINSTANCE.EFRuleClass,
			EasyWallValidator.MISSING_PROTOCOL,
			"Missing protocol"
		)
	}
	
	@Test
	def void MissingDirectionTest(){
		'''
		pack my.fire;
		import net.rules.*;
		rule r at ApplicationLayer{
			var RULE_PROTOCOL : protocol = HTTP;
			var ip : netip = 192.168.0.1;
		}
		'''.parse.assertError(
			EasyWallPackage.eINSTANCE.EFRuleClass,
			EasyWallValidator.MISSING_DIRECTION,
			"Missing direction"	
		)
	}
	
	@Test
	def void ProtocolMismatchTest(){
		'''
		pack my.fire;
		import net.rules.*;
		rule r at ApplicationLayer{
			var RULE_PROTOCOL : protocol = ARP;
			var RULE_DIRECTION : direction = in;
		}
		'''.parse.assertError(
			EasyWallPackage.eINSTANCE.EFRuleClass,
			EasyWallValidator.PROTOCOL_RULELAYER_MISMATCH,
			"Protocol ARP does not match the layer defined for the rule.\nRule is at: ApplicationLayer\nProtocol defined is at: Network Layer" 
		)
	}
	
	@Test
	def void WrongNetSyntaxTest(){
		'''
		pack my.fire;
		import net.rules.*;
		rule r at ApplicationLayer{
			var RULE_PROTOCOL : protocol = HTTP;
			var RULE_DIRECTION : direction = in;
			var ip : netip = 192.168.0.1;
			var mask : netport = :443;
		    var mynet : network = ip/mask;
		}
		'''.parse.assertError(
			EasyWallPackage.eINSTANCE.EFNetworkConstant,
			EasyWallValidator.NETWORK_SYNTAX,
			"Netmask variable does not exist"
		)
	}
	
	@Test
	def void CorrectTest(){
		'''
		pack my.fire;
		import net.rules.*;
		rule r at ApplicationLayer{
			var RULE_PROTOCOL : protocol = HTTP;
			var RULE_DIRECTION : direction = in;
			var ip : netip = 192.168.0.1;
			var mask : netmask = /24;
		    var mynet : network = ip/mask;
		}
		'''.parse.assertNoErrors
	}
	
	@Test
	def void CorrectTest2(){
		'''
		pack my.fire;
		import net.rules.*;
		rule r at ApplicationLayer{
			var RULE_PROTOCOL : protocol = HTTP;
			var RULE_DIRECTION : direction = in;
			var ip : netip = 192.168.0.1;
		    var mynet : network = ip/24;
		}
		'''.parse.assertNoErrors
	}
	
	@Test
	def void CorrectTest3(){
		'''
		pack my.fire;
		import net.rules.*;
		rule r at ApplicationLayer{
			var RULE_PROTOCOL : protocol = HTTP;
			var RULE_DIRECTION : direction = in;
		    var mynet : network = 192.168.0.1/24;
		}
		'''.parse.assertNoErrors
	}
	
	@Test
	def void CorrectTest4(){
		'''
		pack my.fire;
		import net.rules.*;
		rule r at ApplicationLayer{
			var RULE_PROTOCOL : protocol = HTTP;
			var RULE_DIRECTION : direction = in;
			var mask : netmask = /24;
		    var mynet : network = 192.168.0.1/mask;
		}
		'''.parse.assertNoErrors
	}
	
	@Test
	def void InCorrectTest(){
		'''
		pack my.fire;
		import net.rules.*;
		rule r at ApplicationLayer{
			var RULE_PROTOCOL : protocol = HTTP;
			var RULE_DIRECTION : direction = in;
		    var mynet : network = 192.168.0.1/443;
		}
		'''.parse.assertError(
			EasyWallPackage.eINSTANCE.EFNetworkConstant,
			EasyWallValidator.NETWORK_SYNTAX,
			"Netmask must be in the following interval: [0,32]"
		)
	}
}