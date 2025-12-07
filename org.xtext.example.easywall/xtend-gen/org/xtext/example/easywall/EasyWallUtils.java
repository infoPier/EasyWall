package org.xtext.example.easywall;

import com.google.common.collect.Iterables;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.xtext.example.easywall.easyWall.EFBlock;
import org.xtext.example.easywall.easyWall.EFField;
import org.xtext.example.easywall.easyWall.EFMethod;
import org.xtext.example.easywall.easyWall.EFReturn;
import org.xtext.example.easywall.easyWall.EFRule;

@SuppressWarnings("all")
public class EasyWallUtils {
  /**
   * RULES
   */
  public Iterable<EFField> ruleFields(final EFRule r) {
    return Iterables.<EFField>filter(r.getRules().getMembers(), EFField.class);
  }

  public Iterable<EFMethod> ruleMethods(final EFRule r) {
    return Iterables.<EFMethod>filter(r.getRules().getMembers(), EFMethod.class);
  }

  public EFReturn returnStatement(final EFMethod m) {
    return this.returnStatement(m.getBody());
  }

  public EFReturn returnStatement(final EFBlock b) {
    return IterableExtensions.<EFReturn>head(Iterables.<EFReturn>filter(b.getStatements(), EFReturn.class));
  }
}
