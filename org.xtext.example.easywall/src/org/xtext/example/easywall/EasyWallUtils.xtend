package org.xtext.example.easywall

import org.xtext.example.easywall.easyWall.EFRule
import org.xtext.example.easywall.easyWall.EFField
import org.xtext.example.easywall.easyWall.EFMethod
import org.xtext.example.easywall.easyWall.EFBlock
import org.xtext.example.easywall.easyWall.EFReturn

class EasyWallUtils {
	/*
	 * RULES
	 */
	def ruleFields(EFRule r) {
		r.rules.members.filter(EFField)
	}

	def ruleMethods(EFRule r) {
		r.rules.members.filter(EFMethod)
	}

	
	def returnStatement(EFMethod m){
		m.body.returnStatement
	}
	
	def returnStatement(EFBlock b) {
		b.statements.filter(EFReturn).head
	}
}