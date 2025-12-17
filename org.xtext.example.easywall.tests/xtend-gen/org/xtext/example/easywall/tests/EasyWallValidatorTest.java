package org.xtext.example.easywall.tests;

import com.google.inject.Inject;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.testing.InjectWith;
import org.eclipse.xtext.testing.extensions.InjectionExtension;
import org.eclipse.xtext.testing.util.ParseHelper;
import org.eclipse.xtext.testing.validation.ValidationTestHelper;
import org.eclipse.xtext.xbase.lib.Exceptions;
import org.eclipse.xtext.xbase.lib.Extension;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.xtext.example.easywall.easyWall.EFProgram;
import org.xtext.example.easywall.easyWall.EasyWallPackage;
import org.xtext.example.easywall.validation.EasyWallValidator;

@ExtendWith(InjectionExtension.class)
@InjectWith(EasyWallInjectorProvider.class)
@SuppressWarnings("all")
public class EasyWallValidatorTest {
  @Inject
  @Extension
  private ParseHelper<EFProgram> _parseHelper;

  @Inject
  @Extension
  private ValidationTestHelper _validationTestHelper;

  @Test
  public void MissingProtocolTest() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("pack my.fire;");
      _builder.newLine();
      _builder.append("import net.rules.*;");
      _builder.newLine();
      _builder.append("rule r at ApplicationLayer{");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("var RULE_DIRECTION : direction = in;");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("var ip : netip = 192.168.0.1;");
      _builder.newLine();
      _builder.append("}");
      _builder.newLine();
      this._validationTestHelper.assertError(this._parseHelper.parse(_builder), 
        EasyWallPackage.eINSTANCE.getEFRuleClass(), 
        EasyWallValidator.MISSING_PROTOCOL, 
        "Missing protocol");
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }

  @Test
  public void MissingDirectionTest() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("pack my.fire;");
      _builder.newLine();
      _builder.append("import net.rules.*;");
      _builder.newLine();
      _builder.append("rule r at ApplicationLayer{");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("var RULE_PROTOCOL : protocol = HTTP;");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("var ip : netip = 192.168.0.1;");
      _builder.newLine();
      _builder.append("}");
      _builder.newLine();
      this._validationTestHelper.assertError(this._parseHelper.parse(_builder), 
        EasyWallPackage.eINSTANCE.getEFRuleClass(), 
        EasyWallValidator.MISSING_DIRECTION, 
        "Missing direction");
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }

  @Test
  public void ProtocolMismatchTest() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("pack my.fire;");
      _builder.newLine();
      _builder.append("import net.rules.*;");
      _builder.newLine();
      _builder.append("rule r at ApplicationLayer{");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("var RULE_PROTOCOL : protocol = ARP;");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("var RULE_DIRECTION : direction = in;");
      _builder.newLine();
      _builder.append("}");
      _builder.newLine();
      this._validationTestHelper.assertError(this._parseHelper.parse(_builder), 
        EasyWallPackage.eINSTANCE.getEFRuleClass(), 
        EasyWallValidator.PROTOCOL_RULELAYER_MISMATCH, 
        "Protocol ARP does not match the layer defined for the rule.\nRule is at: ApplicationLayer\nProtocol defined is at: Network Layer");
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }

  @Test
  public void WrongNetSyntaxTest() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("pack my.fire;");
      _builder.newLine();
      _builder.append("import net.rules.*;");
      _builder.newLine();
      _builder.append("rule r at ApplicationLayer{");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("var RULE_PROTOCOL : protocol = HTTP;");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("var RULE_DIRECTION : direction = in;");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("var ip : netip = 192.168.0.1;");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("var mask : netport = :443;");
      _builder.newLine();
      _builder.append("    ");
      _builder.append("var mynet : network = ip/mask;");
      _builder.newLine();
      _builder.append("}");
      _builder.newLine();
      this._validationTestHelper.assertError(this._parseHelper.parse(_builder), 
        EasyWallPackage.eINSTANCE.getEFNetworkConstant(), 
        EasyWallValidator.NETWORK_SYNTAX, 
        "Netmask variable does not exist");
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }

  @Test
  public void CorrectTest() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("pack my.fire;");
      _builder.newLine();
      _builder.append("import net.rules.*;");
      _builder.newLine();
      _builder.append("rule r at ApplicationLayer{");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("var RULE_PROTOCOL : protocol = HTTP;");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("var RULE_DIRECTION : direction = in;");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("var ip : netip = 192.168.0.1;");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("var mask : netmask = /24;");
      _builder.newLine();
      _builder.append("    ");
      _builder.append("var mynet : network = ip/mask;");
      _builder.newLine();
      _builder.append("}");
      _builder.newLine();
      this._validationTestHelper.assertNoErrors(this._parseHelper.parse(_builder));
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }

  @Test
  public void CorrectTest2() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("pack my.fire;");
      _builder.newLine();
      _builder.append("import net.rules.*;");
      _builder.newLine();
      _builder.append("rule r at ApplicationLayer{");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("var RULE_PROTOCOL : protocol = HTTP;");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("var RULE_DIRECTION : direction = in;");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("var ip : netip = 192.168.0.1;");
      _builder.newLine();
      _builder.append("    ");
      _builder.append("var mynet : network = ip/24;");
      _builder.newLine();
      _builder.append("}");
      _builder.newLine();
      this._validationTestHelper.assertNoErrors(this._parseHelper.parse(_builder));
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }

  @Test
  public void CorrectTest3() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("pack my.fire;");
      _builder.newLine();
      _builder.append("import net.rules.*;");
      _builder.newLine();
      _builder.append("rule r at ApplicationLayer{");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("var RULE_PROTOCOL : protocol = HTTP;");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("var RULE_DIRECTION : direction = in;");
      _builder.newLine();
      _builder.append("    ");
      _builder.append("var mynet : network = 192.168.0.1/24;");
      _builder.newLine();
      _builder.append("}");
      _builder.newLine();
      this._validationTestHelper.assertNoErrors(this._parseHelper.parse(_builder));
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }

  @Test
  public void CorrectTest4() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("pack my.fire;");
      _builder.newLine();
      _builder.append("import net.rules.*;");
      _builder.newLine();
      _builder.append("rule r at ApplicationLayer{");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("var RULE_PROTOCOL : protocol = HTTP;");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("var RULE_DIRECTION : direction = in;");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("var mask : netmask = /24;");
      _builder.newLine();
      _builder.append("    ");
      _builder.append("var mynet : network = 192.168.0.1/mask;");
      _builder.newLine();
      _builder.append("}");
      _builder.newLine();
      this._validationTestHelper.assertNoErrors(this._parseHelper.parse(_builder));
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }

  @Test
  public void InCorrectTest() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("pack my.fire;");
      _builder.newLine();
      _builder.append("import net.rules.*;");
      _builder.newLine();
      _builder.append("rule r at ApplicationLayer{");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("var RULE_PROTOCOL : protocol = HTTP;");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("var RULE_DIRECTION : direction = in;");
      _builder.newLine();
      _builder.append("    ");
      _builder.append("var mynet : network = 192.168.0.1/443;");
      _builder.newLine();
      _builder.append("}");
      _builder.newLine();
      this._validationTestHelper.assertError(this._parseHelper.parse(_builder), 
        EasyWallPackage.eINSTANCE.getEFNetworkConstant(), 
        EasyWallValidator.NETWORK_SYNTAX, 
        "Netmask must be in the following interval: [0,32]");
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
}
