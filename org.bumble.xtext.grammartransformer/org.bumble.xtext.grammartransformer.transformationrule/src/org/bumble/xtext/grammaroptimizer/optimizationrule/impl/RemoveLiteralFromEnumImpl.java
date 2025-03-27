/**
 */
package org.bumble.xtext.grammaroptimizer.optimizationrule.impl;

import org.bumble.xtext.grammaroptimizer.grammarrule.GrammarRule;
import org.bumble.xtext.grammaroptimizer.helper.RegexHelper;
import org.bumble.xtext.grammaroptimizer.optimizationrule.OptimizationrulePackage;
import org.bumble.xtext.grammaroptimizer.optimizationrule.RemoveLiteralFromEnum;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Remove Literal From Enum</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.bumble.xtext.grammaroptimizer.optimizationrule.impl.RemoveLiteralFromEnumImpl#getLiteralName <em>Literal Name</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RemoveLiteralFromEnumImpl extends OptimizationRuleImpl implements RemoveLiteralFromEnum {
	/**
	 * The default value of the '{@link #getLiteralName() <em>Literal Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLiteralName()
	 * @generated
	 * @ordered
	 */
	protected static final String LITERAL_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLiteralName() <em>Literal Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLiteralName()
	 * @generated
	 * @ordered
	 */
	protected String literalName = LITERAL_NAME_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RemoveLiteralFromEnumImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OptimizationrulePackage.Literals.REMOVE_LITERAL_FROM_ENUM;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLiteralName() {
		return literalName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLiteralName(String newLiteralName) {
		String oldLiteralName = literalName;
		literalName = newLiteralName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OptimizationrulePackage.REMOVE_LITERAL_FROM_ENUM__LITERAL_NAME, oldLiteralName, literalName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case OptimizationrulePackage.REMOVE_LITERAL_FROM_ENUM__LITERAL_NAME:
				return getLiteralName();
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
			case OptimizationrulePackage.REMOVE_LITERAL_FROM_ENUM__LITERAL_NAME:
				setLiteralName((String)newValue);
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
			case OptimizationrulePackage.REMOVE_LITERAL_FROM_ENUM__LITERAL_NAME:
				setLiteralName(LITERAL_NAME_EDEFAULT);
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
			case OptimizationrulePackage.REMOVE_LITERAL_FROM_ENUM__LITERAL_NAME:
				return LITERAL_NAME_EDEFAULT == null ? literalName != null : !LITERAL_NAME_EDEFAULT.equals(literalName);
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
		result.append(" (literalName: ");
		result.append(literalName);
		result.append(')');
		return result.toString();
	}

	public void apply() {
		if (grammarRule == null || grammarRule.isEmpty())
			return;
		
		for (GrammarRule rule : getGrammar().getRules()) {
			if (rule.getName() == null || rule.getName().isEmpty())
				continue;
			
			if (!rule.getName().equals(grammarRule))
				continue;
			
			int lineNum = rule.getLines().size();
			String lineContent = rule.getLines().get(lineNum - 1).getLineContent();
			
			if (lineContent == null || lineContent.isEmpty())
				break;
			
			if (RegexHelper.doesStringExist(lineContent, literalName + "\\s\\=\\s\\'\\w+\\'\\s\\|")) {
				lineContent = lineContent.replaceAll(literalName + "\\s\\=\\s\\'\\w+\\'\\s\\|", "");
			}			
			else if (RegexHelper.doesStringExist(lineContent, "\\|\\s" + literalName + "\\s\\=\\s\\'\\w+\\'")) {
				lineContent = lineContent.replaceAll("\\|\\s" + literalName + "\\s\\=\\s\\'\\w+\\'", "");
			}
			else {
				lineContent = lineContent.replaceAll(literalName + "\\s\\=\\s\\'\\w+\\'", "");
			}
			rule.getLines().get(lineNum - 1).setLineContent(lineContent);
			break;
		}
	}
} //RemoveLiteralFromEnumImpl
