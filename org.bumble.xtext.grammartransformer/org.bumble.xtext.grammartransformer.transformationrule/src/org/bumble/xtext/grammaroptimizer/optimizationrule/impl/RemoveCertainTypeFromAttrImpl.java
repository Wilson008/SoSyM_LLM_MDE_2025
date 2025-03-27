/**
 */
package org.bumble.xtext.grammaroptimizer.optimizationrule.impl;
import org.bumble.xtext.grammaroptimizer.grammarrule.GrammarRule;
import org.bumble.xtext.grammaroptimizer.grammarrule.LineEntry;
import org.bumble.xtext.grammaroptimizer.helper.RegexHelper;
import org.bumble.xtext.grammaroptimizer.optimizationrule.OptimizationrulePackage;
import org.bumble.xtext.grammaroptimizer.optimizationrule.RemoveCertainTypeFromAttr;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Remove Certain Type From Attr</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.bumble.xtext.grammaroptimizer.optimizationrule.impl.RemoveCertainTypeFromAttrImpl#getType <em>Type</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RemoveCertainTypeFromAttrImpl extends OptimizationRuleImpl implements RemoveCertainTypeFromAttr {
	/**
	 * The default value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected static final String TYPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected String type = TYPE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RemoveCertainTypeFromAttrImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OptimizationrulePackage.Literals.REMOVE_CERTAIN_TYPE_FROM_ATTR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setType(String newType) {
		String oldType = type;
		type = newType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OptimizationrulePackage.REMOVE_CERTAIN_TYPE_FROM_ATTR__TYPE, oldType, type));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case OptimizationrulePackage.REMOVE_CERTAIN_TYPE_FROM_ATTR__TYPE:
				return getType();
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
			case OptimizationrulePackage.REMOVE_CERTAIN_TYPE_FROM_ATTR__TYPE:
				setType((String)newValue);
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
			case OptimizationrulePackage.REMOVE_CERTAIN_TYPE_FROM_ATTR__TYPE:
				setType(TYPE_EDEFAULT);
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
			case OptimizationrulePackage.REMOVE_CERTAIN_TYPE_FROM_ATTR__TYPE:
				return TYPE_EDEFAULT == null ? type != null : !TYPE_EDEFAULT.equals(type);
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
		result.append(" (type: ");
		result.append(type);
		result.append(')');
		return result.toString();
	}

	/**
	 * Remove a certain type from attribute in its cross-reference square bracket
	 * */
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
					if (!RegexHelper.doesStringExist(lineContent, attrName)) {
						continue;
					}
				}				
				
				if (RegexHelper.doesStringExist(lineContent, "\\|" + type)) {
					lineContent = lineContent.replaceAll("\\|" + type, "");
					line.setLineContent(lineContent);
				}
				else if (RegexHelper.doesStringExist(lineContent, type + "\\|")) {
					lineContent = lineContent.replaceAll(type + "\\|", "");
					line.setLineContent(lineContent);
				}
				
				if (attrName != null && !attrName.isEmpty()) {
					break;
				}				
			}
			
			if (grammarRule != null && !grammarRule.isEmpty()) {
				break;
			}
		}
	}
} //RemoveCertainTypeFromAttrImpl
