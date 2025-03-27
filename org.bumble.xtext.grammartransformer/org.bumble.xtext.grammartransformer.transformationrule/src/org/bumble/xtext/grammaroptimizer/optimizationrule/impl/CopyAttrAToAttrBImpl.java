/**
 */
package org.bumble.xtext.grammaroptimizer.optimizationrule.impl;

import org.bumble.xtext.grammaroptimizer.grammarrule.GrammarRule;
import org.bumble.xtext.grammaroptimizer.grammarrule.LineEntry;
import org.bumble.xtext.grammaroptimizer.helper.StringHelper;
import org.bumble.xtext.grammaroptimizer.optimizationrule.CopyAttrAToAttrB;
import org.bumble.xtext.grammaroptimizer.optimizationrule.OptimizationrulePackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Copy Attr ATo Attr B</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.bumble.xtext.grammaroptimizer.optimizationrule.impl.CopyAttrAToAttrBImpl#getAttrA <em>Attr A</em>}</li>
 *   <li>{@link org.bumble.xtext.grammaroptimizer.optimizationrule.impl.CopyAttrAToAttrBImpl#getAttrB <em>Attr B</em>}</li>
 *   <li>{@link org.bumble.xtext.grammaroptimizer.optimizationrule.impl.CopyAttrAToAttrBImpl#isIsFront <em>Is Front</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CopyAttrAToAttrBImpl extends OptimizationRuleImpl implements CopyAttrAToAttrB {
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
	 * The default value of the '{@link #isIsFront() <em>Is Front</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsFront()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_FRONT_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIsFront() <em>Is Front</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsFront()
	 * @generated
	 * @ordered
	 */
	protected boolean isFront = IS_FRONT_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CopyAttrAToAttrBImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OptimizationrulePackage.Literals.COPY_ATTR_ATO_ATTR_B;
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
			eNotify(new ENotificationImpl(this, Notification.SET, OptimizationrulePackage.COPY_ATTR_ATO_ATTR_B__ATTR_A, oldAttrA, attrA));
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
			eNotify(new ENotificationImpl(this, Notification.SET, OptimizationrulePackage.COPY_ATTR_ATO_ATTR_B__ATTR_B, oldAttrB, attrB));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isIsFront() {
		return isFront;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsFront(boolean newIsFront) {
		boolean oldIsFront = isFront;
		isFront = newIsFront;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OptimizationrulePackage.COPY_ATTR_ATO_ATTR_B__IS_FRONT, oldIsFront, isFront));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case OptimizationrulePackage.COPY_ATTR_ATO_ATTR_B__ATTR_A:
				return getAttrA();
			case OptimizationrulePackage.COPY_ATTR_ATO_ATTR_B__ATTR_B:
				return getAttrB();
			case OptimizationrulePackage.COPY_ATTR_ATO_ATTR_B__IS_FRONT:
				return isIsFront();
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
			case OptimizationrulePackage.COPY_ATTR_ATO_ATTR_B__ATTR_A:
				setAttrA((String)newValue);
				return;
			case OptimizationrulePackage.COPY_ATTR_ATO_ATTR_B__ATTR_B:
				setAttrB((String)newValue);
				return;
			case OptimizationrulePackage.COPY_ATTR_ATO_ATTR_B__IS_FRONT:
				setIsFront((Boolean)newValue);
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
			case OptimizationrulePackage.COPY_ATTR_ATO_ATTR_B__ATTR_A:
				setAttrA(ATTR_A_EDEFAULT);
				return;
			case OptimizationrulePackage.COPY_ATTR_ATO_ATTR_B__ATTR_B:
				setAttrB(ATTR_B_EDEFAULT);
				return;
			case OptimizationrulePackage.COPY_ATTR_ATO_ATTR_B__IS_FRONT:
				setIsFront(IS_FRONT_EDEFAULT);
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
			case OptimizationrulePackage.COPY_ATTR_ATO_ATTR_B__ATTR_A:
				return ATTR_A_EDEFAULT == null ? attrA != null : !ATTR_A_EDEFAULT.equals(attrA);
			case OptimizationrulePackage.COPY_ATTR_ATO_ATTR_B__ATTR_B:
				return ATTR_B_EDEFAULT == null ? attrB != null : !ATTR_B_EDEFAULT.equals(attrB);
			case OptimizationrulePackage.COPY_ATTR_ATO_ATTR_B__IS_FRONT:
				return isFront != IS_FRONT_EDEFAULT;
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
		result.append(", isFront: ");
		result.append(isFront);
		result.append(')');
		return result.toString();
	}

	public void apply() {
		if (attrA == null || attrB == null)
			return;
		
		for (GrammarRule rule : getGrammar().getRules()) {
			if (rule.getName() == null)
				continue;
			
			if (grammarRule != null && !grammarRule.isEmpty()) {
				if (!rule.getName().equals(grammarRule)) {
					continue;
				}
			}
			
			String coreLineContentOfA = null;
			
			for (LineEntry line : rule.getLines()) {
				if (line.getAttrName() == null)
					continue;
				if (line.getAttrName().equals(attrA)) {
					String lineContent = line.getLineContent();
					coreLineContentOfA = lineContent.stripLeading();
					break;
				}
			}
			
			if (coreLineContentOfA == null)
				break;
			
			for (LineEntry line : rule.getLines()) {
				if (line.getAttrName() == null)
					continue;
				if (line.getAttrName().equals(attrB)) {
					String lineContent = line.getLineContent();
					int numOfWhiteSpace = StringHelper.getWhitespaceNumAtHead(lineContent);
					String coreLineContentOfB = lineContent.stripLeading();
					
					if (isFront) {
						lineContent = coreLineContentOfA + " " + coreLineContentOfB;
					}
					else {
						lineContent = coreLineContentOfB + " " + coreLineContentOfA;
					}					
					
					lineContent = StringHelper.setWhitespaceToString(lineContent, numOfWhiteSpace);
					line.setLineContent(lineContent);
					break;
				}
			}
			
			if (grammarRule != null && !grammarRule.isEmpty()) {
				break;
			}			
		}
	}
} //CopyAttrAToAttrBImpl
