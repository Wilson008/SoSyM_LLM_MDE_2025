/**
 */
package org.bumble.xtext.grammaroptimizer.optimizationrule.impl;

import java.util.Collection;
import org.bumble.xtext.grammaroptimizer.grammarrule.GrammarRule;
import org.bumble.xtext.grammaroptimizer.grammarrule.LineEntry;
import org.bumble.xtext.grammaroptimizer.helper.RegexHelper;
import org.bumble.xtext.grammaroptimizer.optimizationrule.AddAlternativeValue;
import org.bumble.xtext.grammaroptimizer.optimizationrule.OptimizationrulePackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Add Alternative Value</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.bumble.xtext.grammaroptimizer.optimizationrule.impl.AddAlternativeValueImpl#isIsEnum <em>Is Enum</em>}</li>
 *   <li>{@link org.bumble.xtext.grammaroptimizer.optimizationrule.impl.AddAlternativeValueImpl#getNewValue <em>New Value</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AddAlternativeValueImpl extends OptimizationRuleImpl implements AddAlternativeValue {
	/**
	 * The default value of the '{@link #isIsEnum() <em>Is Enum</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsEnum()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_ENUM_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIsEnum() <em>Is Enum</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsEnum()
	 * @generated
	 * @ordered
	 */
	protected boolean isEnum = IS_ENUM_EDEFAULT;

	/**
	 * The cached value of the '{@link #getNewValue() <em>New Value</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNewValue()
	 * @generated
	 * @ordered
	 */
	protected EList<String> newValue;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AddAlternativeValueImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OptimizationrulePackage.Literals.ADD_ALTERNATIVE_VALUE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isIsEnum() {
		return isEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsEnum(boolean newIsEnum) {
		boolean oldIsEnum = isEnum;
		isEnum = newIsEnum;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OptimizationrulePackage.ADD_ALTERNATIVE_VALUE__IS_ENUM, oldIsEnum, isEnum));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getNewValue() {
		if (newValue == null) {
			newValue = new EDataTypeUniqueEList<String>(String.class, this, OptimizationrulePackage.ADD_ALTERNATIVE_VALUE__NEW_VALUE);
		}
		return newValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case OptimizationrulePackage.ADD_ALTERNATIVE_VALUE__IS_ENUM:
				return isIsEnum();
			case OptimizationrulePackage.ADD_ALTERNATIVE_VALUE__NEW_VALUE:
				return getNewValue();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case OptimizationrulePackage.ADD_ALTERNATIVE_VALUE__IS_ENUM:
				setIsEnum((Boolean)newValue);
				return;
			case OptimizationrulePackage.ADD_ALTERNATIVE_VALUE__NEW_VALUE:
				getNewValue().clear();
				getNewValue().addAll((Collection<? extends String>)newValue);
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
			case OptimizationrulePackage.ADD_ALTERNATIVE_VALUE__IS_ENUM:
				setIsEnum(IS_ENUM_EDEFAULT);
				return;
			case OptimizationrulePackage.ADD_ALTERNATIVE_VALUE__NEW_VALUE:
				getNewValue().clear();
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
			case OptimizationrulePackage.ADD_ALTERNATIVE_VALUE__IS_ENUM:
				return isEnum != IS_ENUM_EDEFAULT;
			case OptimizationrulePackage.ADD_ALTERNATIVE_VALUE__NEW_VALUE:
				return newValue != null && !newValue.isEmpty();
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
		result.append(" (isEnum: ");
		result.append(isEnum);
		result.append(", newValue: ");
		result.append(newValue);
		result.append(')');
		return result.toString();
	}

	public void apply() {
		if (attrName == null || attrName.isEmpty())
			return;
		if (grammarRule == null || grammarRule.isEmpty())
			return;
		if (newValue == null)
			return;
		
		for (GrammarRule rule : getGrammar().getRules()) {
			if (rule.getName() == null || rule.getName().isEmpty())
				continue;
			
			if (!rule.getName().equals(grammarRule))
				continue;
			
			if (isEnum) {
				int lineNum = rule.getLines().size();
				if (lineNum <= 1)
					return;
				String lastLineContent = rule.getLines().get(lineNum - 1).getLineContent();
				String replaceContent = "";
				
				for (int i = 0; i < newValue.size(); i++) {
					replaceContent += " | " + attrName + "='" + newValue.get(i) + "'";
				}
				
				if (!replaceContent.equals("") && !replaceContent.isEmpty()) {
					replaceContent += ";";
					lastLineContent = lastLineContent.replaceAll("\\;", replaceContent);
					rule.getLines().get(lineNum - 1).setLineContent(lastLineContent);
				}
			}
			else {
				for (LineEntry line : rule.getLines()) {
					if (line.getAttrName() == null || line.getAttrName().isEmpty())
						continue;
					
					if (!line.getAttrName().equals(attrName))
						continue;
					
					String lineContent = line.getLineContent();
					
					if (RegexHelper.doesStringExist(lineContent, "\\|")) {
						for (int i = 0; i < newValue.size(); i++) {
							lineContent += " " + attrName + "='" + newValue.get(i) + "' |";
						}
					}
					else {
						for (int i = 0; i < newValue.size(); i++) {
							lineContent += " | " + attrName + "='" + newValue.get(i) + "'";
						}
					}

					
					line.setLineContent(lineContent);
					break;
				}
			}
			
			break;
		}
	}
} //AddAlternativeValueImpl
