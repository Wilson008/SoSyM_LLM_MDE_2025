/**
 */
package org.bumble.xtext.grammaroptimizer.optimizationrule.impl;

import org.bumble.xtext.grammaroptimizer.grammarrule.GrammarRule;
import org.bumble.xtext.grammaroptimizer.grammarrule.LineEntry;
import org.bumble.xtext.grammaroptimizer.helper.RegexHelper;
import org.bumble.xtext.grammaroptimizer.helper.StringHelper;
import org.bumble.xtext.grammaroptimizer.optimizationrule.Convert0toStarTo0toStaror1toStar;
import org.bumble.xtext.grammaroptimizer.optimizationrule.OptimizationrulePackage;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Convert0to Star To0to Staror1to Star</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class Convert0toStarTo0toStaror1toStarImpl extends OptimizationRuleImpl implements Convert0toStarTo0toStaror1toStar {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Convert0toStarTo0toStaror1toStarImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OptimizationrulePackage.Literals.CONVERT0TO_STAR_TO0TO_STAROR1TO_STAR;
	}

	// convert from ('keyword' X ("," X)*)? to ('keyword' X ("," X)*)? | X ("," X)*
	public void apply() {
		for (GrammarRule rule : grammar.getRules()) {
			if (rule.getName() == null)
				continue;
			
			if (grammarRule != null && !grammarRule.isEmpty()) {
				if (!rule.getName().equals(grammarRule)) {
					continue;
				}
			}			
			
			for (LineEntry lineEntry : rule.getLines()) {
				String lineContent = lineEntry.getLineContent();
				String X = "";
				
				if (attrName != null && !attrName.isEmpty()) {
					if (!RegexHelper.doesStringExist(lineEntry.getLineContent(), attrName))
						continue;				
					X = StringHelper.getX(lineContent, attrName);
					
				}
				else {		
					if (!RegexHelper.doesStringExist(lineContent, "\\+="))
						continue;
					X = StringHelper.getX2(lineContent);			
				}
				
				String XRegex = StringHelper.constructXRegex(X);
				
				if (X != null) {
					String regex = ".*" + XRegex + ".*\\(.*\"\\,\".*" + XRegex + "\\)\\*.*";
					if (RegexHelper.doesStringExist(lineContent, regex)) {
						String replace = lineContent + " | " + X + " (\",\" " + X + ")*";
						lineContent = lineContent.replaceAll(regex, replace);
						lineEntry.setLineContent(lineContent);
					}
				}
			}
			
			if (grammarRule != null && !grammarRule.isEmpty()) {
				break;
			}
		}
	}
} //Convert0toStarTo0toStaror1toStarImpl
