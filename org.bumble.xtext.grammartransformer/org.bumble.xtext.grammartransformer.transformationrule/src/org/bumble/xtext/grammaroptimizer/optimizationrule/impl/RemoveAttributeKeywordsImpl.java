/**
 */
package org.bumble.xtext.grammaroptimizer.optimizationrule.impl;
import org.bumble.xtext.grammaroptimizer.grammarrule.GrammarRule;
import org.bumble.xtext.grammaroptimizer.grammarrule.LineEntry;
import org.bumble.xtext.grammaroptimizer.helper.RegexHelper;
import org.bumble.xtext.grammaroptimizer.optimizationrule.OptimizationrulePackage;
import org.bumble.xtext.grammaroptimizer.optimizationrule.RemoveAttributeKeywords;
import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Remove Keywords Of All Attrs</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class RemoveAttributeKeywordsImpl extends OptimizationRuleImpl implements RemoveAttributeKeywords {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RemoveAttributeKeywordsImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OptimizationrulePackage.Literals.REMOVE_ATTRIBUTE_KEYWORDS;
	}

	/**
	 * Remove all the keywords in a specified rule
	 * */
	public void apply() {
		for (GrammarRule rule : getGrammar().getRules()) {
			if (rule.getName() == null)
				continue;
			
			if (grammarRule != null && !grammarRule.isEmpty()) {
				if (!rule.getName().equals(grammarRule)) {
					continue;
				}
			}
			
			for (LineEntry line : rule.getLines()) {
				String lineContent = line.getLineContent();
				if (!RegexHelper.doesStringExist(lineContent, "(\'\\w*\')"))
					continue;
				
				if (!RegexHelper.doesStringExist(lineContent, "\\="))
					continue;
				
				if (RegexHelper.doesStringExist(lineContent, "\\(\\w*\\?\\=\\'\\w*\\'\\)\\?"))
					continue;
				
				lineContent = lineContent.replaceAll( "(\'\\w*\')", "");
				line.setLineContent(lineContent);
			}
			
			if (grammarRule != null && !grammarRule.isEmpty())
				break;
		}
	}
} //RemoveKeywordsOfAllAttrsImpl
