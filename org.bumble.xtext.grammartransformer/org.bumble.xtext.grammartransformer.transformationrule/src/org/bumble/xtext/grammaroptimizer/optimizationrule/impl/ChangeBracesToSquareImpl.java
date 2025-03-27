/**
 */
package org.bumble.xtext.grammaroptimizer.optimizationrule.impl;

import org.bumble.xtext.grammaroptimizer.helper.RegexHelper;
import org.bumble.xtext.grammaroptimizer.optimizationrule.ChangeBracesToSquare;
import org.bumble.xtext.grammaroptimizer.optimizationrule.OptimizationrulePackage;
import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Change Bracket To Square</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class ChangeBracesToSquareImpl extends OptimizationRuleImpl implements ChangeBracesToSquare {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ChangeBracesToSquareImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OptimizationrulePackage.Literals.CHANGE_BRACES_TO_SQUARE;
	}

	public void apply() {
		for (int i = 0; i < grammar.getRules().size(); i++) {
			if (grammar.getRules().get(i).getName() == null)
				continue;
			
			if (grammarRule != null && !grammarRule.isEmpty()) {
				if (!grammar.getRules().get(i).getName().equals(grammarRule))
					continue;
			}
						
			for (int j = 0; j < grammar.getRules().get(i).getLines().size(); j++) {
				String lineContent = grammar.getRules().get(i).getLines().get(j).getLineContent();
				
				if (attrName != null && !attrName.isEmpty()) {
					if (!RegexHelper.doesStringExist(lineContent, attrName)) {
						continue;
					}
				}				
				
				if (RegexHelper.doesStringExist(lineContent, "\'\\{\'")) {
					lineContent = lineContent.replaceAll("\'\\{\'", "'['");
					grammar.getRules().get(i).getLines().get(j).setLineContent(lineContent);
				}
				if (RegexHelper.doesStringExist(lineContent, "\'\\}\'")) {
					lineContent = lineContent.replaceAll("\'\\}\'", "']'");
					grammar.getRules().get(i).getLines().get(j).setLineContent(lineContent);
				}
				
				if (attrName != null && !attrName.isEmpty()) {
					break;
				}				
			}
			
			if (grammarRule != null && !grammarRule.isEmpty()) {
				break;
			}			
		}
	}
} //ChangeBracketToSquareImpl
