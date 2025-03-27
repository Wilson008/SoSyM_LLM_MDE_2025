/**
 */
package org.bumble.xtext.grammaroptimizer.optimizationrule.impl;

import org.bumble.xtext.grammaroptimizer.grammarrule.GrammarRule;
import org.bumble.xtext.grammaroptimizer.grammarrule.LineEntry;
import org.bumble.xtext.grammaroptimizer.helper.RegexHelper;
import org.bumble.xtext.grammaroptimizer.optimizationrule.AddOptionalityToOutermostBraces;
import org.bumble.xtext.grammaroptimizer.optimizationrule.MultiplicityKey;
import org.bumble.xtext.grammaroptimizer.optimizationrule.OptimizationrulePackage;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Add Optionality To Outermost Bracket</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.bumble.xtext.grammaroptimizer.optimizationrule.impl.AddOptionalityToOutermostBracesImpl#getMultiplicity <em>Multiplicity</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AddOptionalityToOutermostBracesImpl extends OptimizationRuleImpl implements AddOptionalityToOutermostBraces {
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
	protected AddOptionalityToOutermostBracesImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OptimizationrulePackage.Literals.ADD_OPTIONALITY_TO_OUTERMOST_BRACES;
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
			eNotify(new ENotificationImpl(this, Notification.SET, OptimizationrulePackage.ADD_OPTIONALITY_TO_OUTERMOST_BRACES__MULTIPLICITY, oldMultiplicity, multiplicity));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case OptimizationrulePackage.ADD_OPTIONALITY_TO_OUTERMOST_BRACES__MULTIPLICITY:
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
			case OptimizationrulePackage.ADD_OPTIONALITY_TO_OUTERMOST_BRACES__MULTIPLICITY:
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
			case OptimizationrulePackage.ADD_OPTIONALITY_TO_OUTERMOST_BRACES__MULTIPLICITY:
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
			case OptimizationrulePackage.ADD_OPTIONALITY_TO_OUTERMOST_BRACES__MULTIPLICITY:
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
			
			if (grammarRule != null && !grammarRule.isEmpty()) {
				if (!grammarRule.equals(rule.getName()))
					continue;
			}
			
			if (multiplicity == MultiplicityKey.MULTIPLICITY_OPTIONAL) {
				// if all the attributes are optional
				if (RegexHelper.areAttributesOptional(rule)) {
					for (LineEntry line : rule.getLines()) {
						String lineContent = line.getLineContent();
						
						if (RegexHelper.doesStringExist(lineContent, "\'\\{\'") && !RegexHelper.doesStringExist(lineContent, "[a-zA-Z]")) {
							lineContent = lineContent.replaceAll("\'\\{\'", "('{'");
						}
						
						if (RegexHelper.doesStringExist(lineContent, "\'\\}\'") && !RegexHelper.doesStringExist(lineContent, "[a-zA-Z]")) {
							lineContent = lineContent.replaceAll("\'\\}\'", "'}')?");
						}
						
						line.setLineContent(lineContent);
					}
				}
			}
			else {
				for (LineEntry line : rule.getLines()) {
					String lineContent = line.getLineContent();
					
					if (RegexHelper.doesStringExist(lineContent, "\'\\{\'") && !RegexHelper.doesStringExist(lineContent, "[a-zA-Z]")) {
						lineContent = lineContent.replaceAll("\'\\{\'", "('{'");
					}
					
					if (RegexHelper.doesStringExist(lineContent, "\'\\}\'") && !RegexHelper.doesStringExist(lineContent, "[a-zA-Z]")) {
						if (multiplicity == MultiplicityKey.MULTIPLICITY_ZERO_OR_MORE)
							lineContent = lineContent.replaceAll("\'\\}\'", "'}')*");
						else if (multiplicity == MultiplicityKey.MULTIPLICITY_ONE_OR_MORE)
							lineContent = lineContent.replaceAll("\'\\}\'", "'}')+");
						else 
							lineContent = lineContent.replaceAll("\'\\}\'", "'}')");
					}
					
					line.setLineContent(lineContent);
				}
			}
			
			if (grammarRule != null && !grammarRule.isEmpty())
				break;
		}
	}

} //AddOptionalityToOutermostBracketImpl
