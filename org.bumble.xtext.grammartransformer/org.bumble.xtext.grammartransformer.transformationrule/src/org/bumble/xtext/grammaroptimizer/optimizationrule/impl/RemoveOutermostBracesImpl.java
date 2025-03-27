/**
 */
package org.bumble.xtext.grammaroptimizer.optimizationrule.impl;

import org.bumble.xtext.grammaroptimizer.helper.RegexHelper;
import org.bumble.xtext.grammaroptimizer.optimizationrule.OptimizationrulePackage;
import org.bumble.xtext.grammaroptimizer.optimizationrule.RemoveOutermostBraces;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Remove Outermost Bracket</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class RemoveOutermostBracesImpl extends OptimizationRuleImpl implements RemoveOutermostBraces {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RemoveOutermostBracesImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OptimizationrulePackage.Literals.REMOVE_OUTERMOST_BRACES;
	}
	
	@Override
	public void apply() {
		for (int i = 0; i < grammar.getRules().size(); i++) {
			if (grammar.getRules().get(i).getName() == null)
				continue;
			
			if (!grammar.getRules().get(i).getName().equals(grammarRule))
				continue;
			
			String regexForLeftBracket = "(\\t|(    ))\\'\\{\\'(\\r\\n|\\r|\\n)*";
			String regexForRightBracket = "(\\'\\}\\'\\s*\\;)";
			
			for (int j = 0; j < grammar.getRules().get(i).getLines().size(); j++) {
				String strTemp = grammar.getRules().get(i).getLines().get(j).getLineContent();
				
				if (RegexHelper.doesStringExist(strTemp, "\\w+\\+*="))
					continue;
				
				strTemp = strTemp.replaceAll(regexForLeftBracket, "");

				grammar.getRules().get(i).getLines().get(j).setLineContent(strTemp.replaceAll(regexForRightBracket, ";"));
			}
			
			break;
		}
	}

} //RemoveOutermostBracketImpl
