/**
 */
package org.bumble.xtext.grammaroptimizer.optimizationrule.impl;

import org.bumble.xtext.grammaroptimizer.grammarrule.GrammarRule;
import org.bumble.xtext.grammaroptimizer.grammarrule.LineEntry;
import org.bumble.xtext.grammaroptimizer.helper.RegexHelper;
import org.bumble.xtext.grammaroptimizer.optimizationrule.OptimizationrulePackage;
import org.bumble.xtext.grammaroptimizer.optimizationrule.RenameRule;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Rename Rule</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.bumble.xtext.grammaroptimizer.optimizationrule.impl.RenameRuleImpl#getCurrentName <em>Current Name</em>}</li>
 *   <li>{@link org.bumble.xtext.grammaroptimizer.optimizationrule.impl.RenameRuleImpl#getNewName <em>New Name</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RenameRuleImpl extends OptimizationRuleImpl implements RenameRule {
	/**
	 * The default value of the '{@link #getCurrentName() <em>Current Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCurrentName()
	 * @generated
	 * @ordered
	 */
	protected static final String CURRENT_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCurrentName() <em>Current Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCurrentName()
	 * @generated
	 * @ordered
	 */
	protected String currentName = CURRENT_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getNewName() <em>New Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNewName()
	 * @generated
	 * @ordered
	 */
	protected static final String NEW_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getNewName() <em>New Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNewName()
	 * @generated
	 * @ordered
	 */
	protected String newName = NEW_NAME_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RenameRuleImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OptimizationrulePackage.Literals.RENAME_RULE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCurrentName() {
		return currentName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCurrentName(String newCurrentName) {
		String oldCurrentName = currentName;
		currentName = newCurrentName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OptimizationrulePackage.RENAME_RULE__CURRENT_NAME, oldCurrentName, currentName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getNewName() {
		return newName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNewName(String newNewName) {
		String oldNewName = newName;
		newName = newNewName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OptimizationrulePackage.RENAME_RULE__NEW_NAME, oldNewName, newName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case OptimizationrulePackage.RENAME_RULE__CURRENT_NAME:
				return getCurrentName();
			case OptimizationrulePackage.RENAME_RULE__NEW_NAME:
				return getNewName();
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
			case OptimizationrulePackage.RENAME_RULE__CURRENT_NAME:
				setCurrentName((String)newValue);
				return;
			case OptimizationrulePackage.RENAME_RULE__NEW_NAME:
				setNewName((String)newValue);
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
			case OptimizationrulePackage.RENAME_RULE__CURRENT_NAME:
				setCurrentName(CURRENT_NAME_EDEFAULT);
				return;
			case OptimizationrulePackage.RENAME_RULE__NEW_NAME:
				setNewName(NEW_NAME_EDEFAULT);
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
			case OptimizationrulePackage.RENAME_RULE__CURRENT_NAME:
				return CURRENT_NAME_EDEFAULT == null ? currentName != null : !CURRENT_NAME_EDEFAULT.equals(currentName);
			case OptimizationrulePackage.RENAME_RULE__NEW_NAME:
				return NEW_NAME_EDEFAULT == null ? newName != null : !NEW_NAME_EDEFAULT.equals(newName);
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
		result.append(" (currentName: ");
		result.append(currentName);
		result.append(", newName: ");
		result.append(newName);
		result.append(')');
		return result.toString();
	}
	
	public void apply() {
		for (GrammarRule rule : grammar.getRules()) {
			if (rule.getName() != null && rule.getName().equals(grammarRule)) {
				for (LineEntry line : rule.getLines()) {
					if (RegexHelper.doesStringExist(line.getLineContent(), grammarRule)) {
						if (RegexHelper.doesStringExist(line.getLineContent(), "returns")) {
							line.setLineContent(line.getLineContent().replaceAll(grammarRule + "\\sreturns", newName + " returns"));
						}
						else {
							line.setLineContent(line.getLineContent().replaceAll(grammarRule, newName));
						}
						rule.setName(newName);
						break;
					}
				}
				break;
			}
		}
	}

} //RenameRuleImpl
