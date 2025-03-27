/**
 */
package org.bumble.xtext.grammaroptimizer.optimizationrule.impl;

import org.bumble.xtext.grammaroptimizer.grammarrule.GrammarRule;
import org.bumble.xtext.grammaroptimizer.grammarrule.LineEntry;
import org.bumble.xtext.grammaroptimizer.optimizationrule.ChangeABToABorBA;
import org.bumble.xtext.grammaroptimizer.optimizationrule.OptimizationrulePackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Change AB To ABor BA</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.bumble.xtext.grammaroptimizer.optimizationrule.impl.ChangeABToABorBAImpl#getAttrA <em>Attr A</em>}</li>
 *   <li>{@link org.bumble.xtext.grammaroptimizer.optimizationrule.impl.ChangeABToABorBAImpl#getAttrB <em>Attr B</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ChangeABToABorBAImpl extends OptimizationRuleImpl implements ChangeABToABorBA {
	/**
	 * The default value of the '{@link #getAttrA() <em>Attr A</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAttrA()
	 * @generated
	 * @ordered
	 */
	protected static final String ATTR_A_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAttrA() <em>Attr A</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAttrA()
	 * @generated
	 * @ordered
	 */
	protected String attrA = ATTR_A_EDEFAULT;

	/**
	 * The default value of the '{@link #getAttrB() <em>Attr B</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAttrB()
	 * @generated
	 * @ordered
	 */
	protected static final String ATTR_B_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAttrB() <em>Attr B</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAttrB()
	 * @generated
	 * @ordered
	 */
	protected String attrB = ATTR_B_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ChangeABToABorBAImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OptimizationrulePackage.Literals.CHANGE_AB_TO_ABOR_BA;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getAttrA() {
		return attrA;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAttrA(String newAttrA) {
		String oldAttrA = attrA;
		attrA = newAttrA;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OptimizationrulePackage.CHANGE_AB_TO_ABOR_BA__ATTR_A, oldAttrA, attrA));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getAttrB() {
		return attrB;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAttrB(String newAttrB) {
		String oldAttrB = attrB;
		attrB = newAttrB;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OptimizationrulePackage.CHANGE_AB_TO_ABOR_BA__ATTR_B, oldAttrB, attrB));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case OptimizationrulePackage.CHANGE_AB_TO_ABOR_BA__ATTR_A:
				return getAttrA();
			case OptimizationrulePackage.CHANGE_AB_TO_ABOR_BA__ATTR_B:
				return getAttrB();
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
			case OptimizationrulePackage.CHANGE_AB_TO_ABOR_BA__ATTR_A:
				setAttrA((String)newValue);
				return;
			case OptimizationrulePackage.CHANGE_AB_TO_ABOR_BA__ATTR_B:
				setAttrB((String)newValue);
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
			case OptimizationrulePackage.CHANGE_AB_TO_ABOR_BA__ATTR_A:
				setAttrA(ATTR_A_EDEFAULT);
				return;
			case OptimizationrulePackage.CHANGE_AB_TO_ABOR_BA__ATTR_B:
				setAttrB(ATTR_B_EDEFAULT);
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
			case OptimizationrulePackage.CHANGE_AB_TO_ABOR_BA__ATTR_A:
				return ATTR_A_EDEFAULT == null ? attrA != null : !ATTR_A_EDEFAULT.equals(attrA);
			case OptimizationrulePackage.CHANGE_AB_TO_ABOR_BA__ATTR_B:
				return ATTR_B_EDEFAULT == null ? attrB != null : !ATTR_B_EDEFAULT.equals(attrB);
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
		result.append(" (attrA: ");
		result.append(attrA);
		result.append(", attrB: ");
		result.append(attrB);
		result.append(')');
		return result.toString();
	}

	public void apply() {
		if (attrA == null || attrA.isEmpty() ||
			attrB == null || attrB.isEmpty()) 
			return;
		
		for (GrammarRule rule : getGrammar().getRules()) {
			if (rule.getName() == null)
				continue;
			
			if (grammarRule != null && !grammarRule.isEmpty()) {
				if (!rule.getName().equals(grammarRule)) {
					continue;
				}
			}
			
			String originalLineContentA = null;
			String originalLineContentB = null;
			for (LineEntry line : rule.getLines()) {
				if (line.getAttrName() == null || line.getAttrName().isEmpty())
					continue;
				
				if (line.getAttrName().equals(attrA))
					originalLineContentA = line.getLineContent().stripLeading();
				if (line.getAttrName().equals(attrB))
					originalLineContentB = line.getLineContent().stripLeading();
				
				if (originalLineContentA != null && originalLineContentB != null)
					break;
			}
			
			int attrANo = -1;
			int attrBNo = -1;
			
			for (int i = 0; i < rule.getLines().size(); i++) {
				if (rule.getLines().get(i).getAttrName() == null)
					continue;
				
				if (rule.getLines().get(i).getAttrName().equals(attrA)) {
					rule.getLines().get(i).setLineContent(rule.getLines().get(i).getLineContent() + " " + originalLineContentB);
					attrANo = i;
					continue;
				}
				
				if (rule.getLines().get(i).getAttrName().equals(attrB)) {
					rule.getLines().get(i).setLineContent(rule.getLines().get(i).getLineContent() + " " + originalLineContentA);
					attrBNo = i;
					continue;
				}
				
				if (attrANo >= 0 && attrBNo >= 0)
					break;
			}
			
			if (attrANo >= 0 && attrBNo >= 0) {
				if ((attrANo - attrBNo) == 1) {
					String lineContentB = rule.getLines().get(attrBNo).getLineContent();
					lineContentB += "|";
					rule.getLines().get(attrBNo).setLineContent(lineContentB);
				}
				else if ((attrBNo - attrANo) == 1) {
					String lineContentA = rule.getLines().get(attrANo).getLineContent();
					lineContentA += "|";
					rule.getLines().get(attrANo).setLineContent(lineContentA);
				}
			}
			
			if (grammarRule != null && !grammarRule.isEmpty()) {
				break;
			}	
		}
	}
} //ChangeABToABorBAImpl
