/**
 */
package org.bumble.xtext.grammaroptimizer.optimizationrule.impl;

import org.bumble.xtext.grammaroptimizer.grammarrule.GrammarRule;
import org.bumble.xtext.grammaroptimizer.grammarrule.LineEntry;
import org.bumble.xtext.grammaroptimizer.helper.RegexHelper;
import org.bumble.xtext.grammaroptimizer.optimizationrule.OptimizationrulePackage;
import org.bumble.xtext.grammaroptimizer.optimizationrule.RemoveAction;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Remove Action</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class RemoveActionImpl extends OptimizationRuleImpl implements RemoveAction {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RemoveActionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OptimizationrulePackage.Literals.REMOVE_ACTION;
	}

	public void apply() {
		if (grammarRule == null || grammarRule.isEmpty())
			return;
		
		for (GrammarRule rule : grammar.getRules()) {
			if (rule.getName() == null)
				continue;
			
			if (!rule.getName().equals(grammarRule))
				continue;
			
			String regex = null;
			
			if (RegexHelper.doesStringExist(grammarRule, "_Impl")) {
				String realRuleName = grammarRule.replaceAll("_Impl", "");
				regex = "\\{" + realRuleName + "\\}";
			}
			else
				regex = "\\{" + grammarRule + "\\}";

			for (LineEntry line : rule.getLines()) {
				String lineContent = line.getLineContent();
				
				if (RegexHelper.doesStringExist(lineContent, regex)) {
					lineContent = lineContent.replaceAll(regex, "");
					line.setLineContent(lineContent);
					break;
				}
			}
			
			break;
		}
	}
} //RemoveActionImpl
