/**
 */
package org.bumble.xtext.grammaroptimizer.optimizationrule.impl;

import org.bumble.xtext.grammaroptimizer.grammarrule.GrammarRule;
import org.bumble.xtext.grammaroptimizer.grammarrule.LineEntry;
import org.bumble.xtext.grammaroptimizer.helper.StringHelper;
import org.bumble.xtext.grammaroptimizer.optimizationrule.ChangeAToOptionalAorA;
import org.bumble.xtext.grammaroptimizer.optimizationrule.OptimizationrulePackage;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Change ATo Optional Aor A</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class ChangeAToOptionalAorAImpl extends OptimizationRuleImpl implements ChangeAToOptionalAorA {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ChangeAToOptionalAorAImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OptimizationrulePackage.Literals.CHANGE_ATO_OPTIONAL_AOR_A;
	}

	// ( '(' equalExp ')' )? | equalExp
	public void apply() {
		if (grammarRule == null || attrName == null)
			return;
		
		for (GrammarRule rule : getGrammar().getRules()) {
			if (rule.getName() == null)
				continue;
			if (rule.getName().equals(grammarRule)) {
				for (LineEntry line : rule.getLines()) {
					if (line.getAttrName() == null)
						continue;
					if (line.getAttrName().equals(attrName)) {
						String lineContent = line.getLineContent();
						String equalExp = StringHelper.getX1(lineContent, attrName);
						int numOfWhitespace = StringHelper.getWhitespaceNumAtHead(lineContent);
						lineContent = "( '(' " + equalExp + " ')' )? | " + equalExp;
						lineContent = StringHelper.setWhitespaceToString(lineContent, numOfWhitespace);
						line.setLineContent(lineContent);
						break;
					}
				}
				
				break;
			}
		}
	}
} //ChangeAToOptionalAorAImpl
