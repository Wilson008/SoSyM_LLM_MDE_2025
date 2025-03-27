/**
 */
package org.bumble.xtext.grammaroptimizer.optimizationrule.impl;
import org.bumble.xtext.grammaroptimizer.grammarrule.GrammarRule;
import org.bumble.xtext.grammaroptimizer.grammarrule.LineEntry;
import org.bumble.xtext.grammaroptimizer.helper.RegexHelper;
import org.bumble.xtext.grammaroptimizer.optimizationrule.ChangeTypeOfAttr;
import org.bumble.xtext.grammaroptimizer.optimizationrule.OptimizationrulePackage;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Change Type Of Attr</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.bumble.xtext.grammaroptimizer.optimizationrule.impl.ChangeTypeOfAttrImpl#getCurrentType <em>Current Type</em>}</li>
 *   <li>{@link org.bumble.xtext.grammaroptimizer.optimizationrule.impl.ChangeTypeOfAttrImpl#getNewType <em>New Type</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ChangeTypeOfAttrImpl extends OptimizationRuleImpl implements ChangeTypeOfAttr {
	/**
	 * The default value of the '{@link #getCurrentType() <em>Current Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCurrentType()
	 * @generated
	 * @ordered
	 */
	protected static final String CURRENT_TYPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCurrentType() <em>Current Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCurrentType()
	 * @generated
	 * @ordered
	 */
	protected String currentType = CURRENT_TYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #getNewType() <em>New Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNewType()
	 * @generated
	 * @ordered
	 */
	protected static final String NEW_TYPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getNewType() <em>New Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNewType()
	 * @generated
	 * @ordered
	 */
	protected String newType = NEW_TYPE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ChangeTypeOfAttrImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OptimizationrulePackage.Literals.CHANGE_TYPE_OF_ATTR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCurrentType() {
		return currentType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCurrentType(String newCurrentType) {
		String oldCurrentType = currentType;
		currentType = newCurrentType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OptimizationrulePackage.CHANGE_TYPE_OF_ATTR__CURRENT_TYPE, oldCurrentType, currentType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getNewType() {
		return newType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNewType(String newNewType) {
		String oldNewType = newType;
		newType = newNewType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OptimizationrulePackage.CHANGE_TYPE_OF_ATTR__NEW_TYPE, oldNewType, newType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case OptimizationrulePackage.CHANGE_TYPE_OF_ATTR__CURRENT_TYPE:
				return getCurrentType();
			case OptimizationrulePackage.CHANGE_TYPE_OF_ATTR__NEW_TYPE:
				return getNewType();
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
			case OptimizationrulePackage.CHANGE_TYPE_OF_ATTR__CURRENT_TYPE:
				setCurrentType((String)newValue);
				return;
			case OptimizationrulePackage.CHANGE_TYPE_OF_ATTR__NEW_TYPE:
				setNewType((String)newValue);
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
			case OptimizationrulePackage.CHANGE_TYPE_OF_ATTR__CURRENT_TYPE:
				setCurrentType(CURRENT_TYPE_EDEFAULT);
				return;
			case OptimizationrulePackage.CHANGE_TYPE_OF_ATTR__NEW_TYPE:
				setNewType(NEW_TYPE_EDEFAULT);
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
			case OptimizationrulePackage.CHANGE_TYPE_OF_ATTR__CURRENT_TYPE:
				return CURRENT_TYPE_EDEFAULT == null ? currentType != null : !CURRENT_TYPE_EDEFAULT.equals(currentType);
			case OptimizationrulePackage.CHANGE_TYPE_OF_ATTR__NEW_TYPE:
				return NEW_TYPE_EDEFAULT == null ? newType != null : !NEW_TYPE_EDEFAULT.equals(newType);
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
		result.append(" (currentType: ");
		result.append(currentType);
		result.append(", newType: ");
		result.append(newType);
		result.append(')');
		return result.toString();
	}
	// examples:
	// 1. name=EString to name=ID
	// 2. attr=[Type|EString] to attr=[Type|ID]
	// 3. Attr=Attr to Attr=AnotherType (i.e., in this case the original type shares the same name with the attribute name)
	// 4. attr+=Type ("," attr+=Type)* to attr+=AnotherType ("," attr+=AnotherType)*
	public void apply() {	
		for (GrammarRule rule : grammar.getRules()) {
			if (rule.getName() == null)
				continue;
			
			if (grammarRule != null && !grammarRule.isEmpty()) {
				if (!rule.getName().equals(grammarRule)) {
					continue;
				}
			}
			
			for (LineEntry line : rule.getLines()) {
				String lineContent = line.getLineContent();
				
				if (attrName != null && !attrName.isEmpty()) {
					if (line.getAttrName() == null || !line.getAttrName().equals(attrName)) {
						continue;
					}
				}
				
				if (RegexHelper.doesStringExist(lineContent, "\\+\\=" + currentType)) {
					String regex = "\\+\\=" + currentType;
					String replacement = "+=" + newType;
					lineContent = lineContent.replaceAll(regex, replacement);
				}
				else {
					lineContent = lineContent.replaceAll(currentType, newType);
				}
				
				line.setLineContent(lineContent);
				
				if (attrName != null && !attrName.isEmpty()) {
					break;
				}
			}
			
			if (grammarRule != null && !grammarRule.isEmpty()) {
				break;
			}			
		}
	}
} //ChangeTypeOfAttrImpl
