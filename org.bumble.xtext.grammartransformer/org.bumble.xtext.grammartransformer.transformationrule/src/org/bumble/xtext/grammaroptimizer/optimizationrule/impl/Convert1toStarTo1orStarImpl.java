/**
 */
package org.bumble.xtext.grammaroptimizer.optimizationrule.impl;
import org.bumble.xtext.grammaroptimizer.grammarrule.GrammarRule;
import org.bumble.xtext.grammaroptimizer.grammarrule.LineEntry;
import org.bumble.xtext.grammaroptimizer.helper.RegexHelper;
import org.bumble.xtext.grammaroptimizer.helper.StringHelper;
import org.bumble.xtext.grammaroptimizer.optimizationrule.Convert1toStarTo1orStar;
import org.bumble.xtext.grammaroptimizer.optimizationrule.OptimizationrulePackage;
import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Convert1to Star To1or Star</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class Convert1toStarTo1orStarImpl extends OptimizationRuleImpl implements Convert1toStarTo1orStar {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Convert1toStarTo1orStarImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OptimizationrulePackage.Literals.CONVERT1TO_STAR_TO1OR_STAR;
	}
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
				
				if (attrName != null && !attrName.isEmpty()) {
					if (!RegexHelper.doesStringExist(lineEntry.getLineContent(), attrName))
						continue;
					
					
					String X = StringHelper.getX(lineContent, attrName);
					X = StringHelper.constructXRegex(X);
					
					if (X != null) {
						String regex = "\\'\\{\\'.*" + X + ".*\\(.*\"\\,\".*" + X + "\\)\\*.*\\'\\}\\'";
						if (RegexHelper.doesStringExist(lineContent, regex)) {
							String replace = X + " \\| \\'{\\' " + X + "\\* \\'}\\'";
							lineContent = lineContent.replaceAll( regex, replace);
							lineEntry.setLineContent(lineContent);
						}
					}
					
					break;
				}
				else {		
					if (!RegexHelper.doesStringExist(lineContent, "\\+="))
						continue;

					String X = StringHelper.getX2(lineContent);
					X = StringHelper.constructXRegex(X);
					
					if (X != null) {
						String regex = "\\'\\{\\'.*" + X + ".*\\(.*\"\\,\".*" + X + "\\)\\*.*\\'\\}\\'";
						if (RegexHelper.doesStringExist(lineContent, regex)) {
							String replace = X + " \\| \\'{\\' " + X + "\\* \\'}\\'";
							lineContent = lineContent.replaceAll( regex, replace);
							lineEntry.setLineContent(lineContent);
						}
					}
				}
			}
			
			if (grammarRule != null && !grammarRule.isEmpty()) {
				break;
			}
		}
	}
} //Convert1toStarTo1orStarImpl
