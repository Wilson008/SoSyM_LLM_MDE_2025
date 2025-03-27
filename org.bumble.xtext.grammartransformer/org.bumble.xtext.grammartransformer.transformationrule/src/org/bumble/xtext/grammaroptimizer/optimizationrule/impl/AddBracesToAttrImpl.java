/**
 */
package org.bumble.xtext.grammaroptimizer.optimizationrule.impl;
import java.util.regex.Pattern;

import org.bumble.xtext.grammaroptimizer.grammarrule.GrammarRule;
import org.bumble.xtext.grammaroptimizer.grammarrule.LineEntry;
import org.bumble.xtext.grammaroptimizer.helper.RegexHelper;
import org.bumble.xtext.grammaroptimizer.helper.StringHelper;
import org.bumble.xtext.grammaroptimizer.optimizationrule.AddBracesToAttr;
import org.bumble.xtext.grammaroptimizer.optimizationrule.OptimizationrulePackage;
import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Add Bracket To Attr</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class AddBracesToAttrImpl extends OptimizationRuleImpl implements AddBracesToAttr {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AddBracesToAttrImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OptimizationrulePackage.Literals.ADD_BRACES_TO_ATTR;
	}

	public void apply() {
		for (GrammarRule rule : grammar.getRules()) {
			if (rule.getName() == null)
				continue;
			
			if (grammarRule != null || !grammarRule.isEmpty()) {
				if (!rule.getName().equals(grammarRule)) {
					continue;
				}
			}
			
			for (LineEntry line : rule.getLines()) {
				String lineContent = line.getLineContent();
				String regex = "(" + attrName + "\\+*\\=\\w*)";
				if (RegexHelper.doesStringExist(lineContent, regex)) {
					Pattern pattern = Pattern.compile(regex);
					String attrExpression = RegexHelper.getTargetString(lineContent, pattern);
					String X = StringHelper.constructXRegex(attrExpression);
					lineContent = lineContent.replaceAll(X, "'{'" + attrExpression + "'}'");
					line.setLineContent(lineContent);
					break;
				}
			}
			
			if (grammarRule != null || !grammarRule.isEmpty()) {
				break;
			}
		}
	}
} //AddBracketToAttrImpl
