/**
 */
package org.bumble.xtext.grammaroptimizer.optimizationrule.impl;

import java.util.regex.Pattern;

import org.bumble.xtext.grammaroptimizer.grammarrule.GrammarRule;
import org.bumble.xtext.grammaroptimizer.helper.RegexHelper;
import org.bumble.xtext.grammaroptimizer.helper.StringHelper;
import org.bumble.xtext.grammaroptimizer.optimizationrule.AddParenthesesWithoutQuoteToRule;
import org.bumble.xtext.grammaroptimizer.optimizationrule.MultiplicityKey;
import org.bumble.xtext.grammaroptimizer.optimizationrule.OptimizationrulePackage;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Add Parentheses Without Quote To Rule</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.bumble.xtext.grammaroptimizer.optimizationrule.impl.AddParenthesesWithoutQuoteToRuleImpl#getMultiplicity <em>Multiplicity</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AddParenthesesWithoutQuoteToRuleImpl extends OptimizationRuleImpl implements AddParenthesesWithoutQuoteToRule {
	/**
	 * The default value of the '{@link #getMultiplicity() <em>Multiplicity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMultiplicity()
	 * @generated
	 * @ordered
	 */
	protected static final MultiplicityKey MULTIPLICITY_EDEFAULT = MultiplicityKey.PACKAGE_ONLY;
	/**
	 * The cached value of the '{@link #getMultiplicity() <em>Multiplicity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMultiplicity()
	 * @generated
	 * @ordered
	 */
	protected MultiplicityKey multiplicity = MULTIPLICITY_EDEFAULT;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AddParenthesesWithoutQuoteToRuleImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OptimizationrulePackage.Literals.ADD_PARENTHESES_WITHOUT_QUOTE_TO_RULE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MultiplicityKey getMultiplicity() {
		return multiplicity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMultiplicity(MultiplicityKey newMultiplicity) {
		MultiplicityKey oldMultiplicity = multiplicity;
		multiplicity = newMultiplicity == null ? MULTIPLICITY_EDEFAULT : newMultiplicity;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OptimizationrulePackage.ADD_PARENTHESES_WITHOUT_QUOTE_TO_RULE__MULTIPLICITY, oldMultiplicity, multiplicity));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case OptimizationrulePackage.ADD_PARENTHESES_WITHOUT_QUOTE_TO_RULE__MULTIPLICITY:
				return getMultiplicity();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case OptimizationrulePackage.ADD_PARENTHESES_WITHOUT_QUOTE_TO_RULE__MULTIPLICITY:
				setMultiplicity((MultiplicityKey)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case OptimizationrulePackage.ADD_PARENTHESES_WITHOUT_QUOTE_TO_RULE__MULTIPLICITY:
				setMultiplicity(MULTIPLICITY_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case OptimizationrulePackage.ADD_PARENTHESES_WITHOUT_QUOTE_TO_RULE__MULTIPLICITY:
				return multiplicity != MULTIPLICITY_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (multiplicity: ");
		result.append(multiplicity);
		result.append(')');
		return result.toString();
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
			
			int lineCount = rule.getLines().size();
			
			if (lineCount >= 2) {
				int startLineNo = -1;
				String secondLineContent = rule.getLines().get(1).getLineContent();
				if (RegexHelper.doesStringExist(secondLineContent, "\\{\\w+\\}"))
					startLineNo = 2;
				else
					startLineNo = 1;
				
				if (lineCount < (startLineNo + 1))
					break;
				
				secondLineContent = rule.getLines().get(startLineNo).getLineContent();
				int numOfWhitespaceIn2nd = StringHelper.getWhitespaceNumAtHead(secondLineContent);
				String coreContentIn2nd = secondLineContent.stripLeading();
				secondLineContent = "(" + coreContentIn2nd;
				secondLineContent = StringHelper.setWhitespaceToString(secondLineContent, numOfWhitespaceIn2nd);
				rule.getLines().get(startLineNo).setLineContent(secondLineContent);
				
				String lastLineContent = rule.getLines().get(lineCount - 1).getLineContent();
				
				// if at least one English letter exist in the last line
				if (RegexHelper.doesStringExist(lastLineContent, "(\\w*)")) {
					Pattern pattern = Pattern.compile("(\\w*)\\;");
					String coreLastLineContent = RegexHelper.getTargetString(lastLineContent, pattern);
					
					if (coreLastLineContent != null) {
						if (multiplicity == MultiplicityKey.MULTIPLICITY_OPTIONAL)
							lastLineContent = lastLineContent.replaceAll("\\;", ")?;");
						else if (multiplicity == MultiplicityKey.MULTIPLICITY_ONE_OR_MORE)
							lastLineContent = lastLineContent.replaceAll("\\;", ")+;");
						else if (multiplicity == MultiplicityKey.MULTIPLICITY_ZERO_OR_MORE)
							lastLineContent = lastLineContent.replaceAll("\\;", ")*;");
						else
							lastLineContent = lastLineContent.replaceAll("\\;", ");");
					}
				}
				else {
					if (multiplicity == MultiplicityKey.MULTIPLICITY_OPTIONAL)
						lastLineContent = lastLineContent.replaceAll("\\;", ")?;");
					else if (multiplicity == MultiplicityKey.MULTIPLICITY_ONE_OR_MORE)
						lastLineContent = lastLineContent.replaceAll("\\;", ")+;");
					else if (multiplicity == MultiplicityKey.MULTIPLICITY_ZERO_OR_MORE)
						lastLineContent = lastLineContent.replaceAll("\\;", ")*;");
					else
						lastLineContent = lastLineContent.replaceAll("\\;", ");");
				}
				
				rule.getLines().get(lineCount - 1).setLineContent(lastLineContent);
			}
			
			if (grammarRule != null || !grammarRule.isEmpty()) {
				break;
			}
		}
	}
} //AddParenthesesWithoutQuoteToRuleImpl
