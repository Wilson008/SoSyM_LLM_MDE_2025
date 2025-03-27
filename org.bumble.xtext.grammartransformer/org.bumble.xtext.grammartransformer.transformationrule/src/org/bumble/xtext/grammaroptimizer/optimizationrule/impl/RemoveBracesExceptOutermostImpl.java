/**
 */
package org.bumble.xtext.grammaroptimizer.optimizationrule.impl;
import org.bumble.xtext.grammaroptimizer.helper.RegexHelper;
import org.bumble.xtext.grammaroptimizer.optimizationrule.OptimizationrulePackage;
import org.bumble.xtext.grammaroptimizer.optimizationrule.RemoveBracesExceptOutermost;
import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Remove Bracket Except Outermost</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class RemoveBracesExceptOutermostImpl extends OptimizationRuleImpl implements RemoveBracesExceptOutermost {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RemoveBracesExceptOutermostImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OptimizationrulePackage.Literals.REMOVE_BRACES_EXCEPT_OUTERMOST;
	}

	/**
	 * Remove the braces from all the attributes except the outermost braces
	 * from a specified grammar rule.
	 * */
	public void apply() {
		for (int i = 0; i < grammar.getRules().size(); i++) {
			if (grammar.getRules().get(i).getName() == null)
				continue;
			
			if (grammarRule != null && !grammarRule.isEmpty()) {
				if (!grammar.getRules().get(i).getName().equals(grammarRule)) {
					continue;
				}
			}			
			
			String regexRuleLeftBracket = "(\\t|(    ))\\'\\{\\'(\\r\\n|\\r|\\n)*";
			String regexRuleRightBracket = "\\'\\}\\'(\\r|\\n|\\;)";
			String regexForLeftBracket = "([\'])([{])([\'])";
			String regexForRightBracket = "([\'])([}])([\'])";
			
			for (int j = 0; j < grammar.getRules().get(i).getLines().size(); j++) {
				if (RegexHelper.doesStringExist(grammar.getRules().get(i).getLines().get(j).getLineContent(), regexRuleLeftBracket))
					continue;
				
				if (RegexHelper.doesStringExist(grammar.getRules().get(i).getLines().get(j).getLineContent(), regexRuleRightBracket))
					continue;
				
				String strTemp = grammar.getRules().get(i).getLines().get(j).getLineContent();
				strTemp = strTemp.replaceAll(regexForLeftBracket, "");

				grammar.getRules().get(i).getLines().get(j).setLineContent(strTemp.replaceAll(regexForRightBracket, ""));
			}
			
			if (grammarRule != null && !grammarRule.isEmpty()) {
				break;
			}			
		}
	}
} //RemoveBracketExceptOutermostImpl
