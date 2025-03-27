/**
 */
package org.bumble.xtext.grammaroptimizer.optimizationrule.impl;

import org.bumble.xtext.grammaroptimizer.grammarrule.GrammarRule;
import org.bumble.xtext.grammaroptimizer.grammarrule.LineEntry;
import org.bumble.xtext.grammaroptimizer.helper.StringHelper;
import org.bumble.xtext.grammaroptimizer.optimizationrule.CopyXfromStarToY;
import org.bumble.xtext.grammaroptimizer.optimizationrule.OptimizationrulePackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Copy Xfrom Star To Y</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.bumble.xtext.grammaroptimizer.optimizationrule.impl.CopyXfromStarToYImpl#getAttrInX <em>Attr In X</em>}</li>
 *   <li>{@link org.bumble.xtext.grammaroptimizer.optimizationrule.impl.CopyXfromStarToYImpl#getAttrInY <em>Attr In Y</em>}</li>
 *   <li>{@link org.bumble.xtext.grammaroptimizer.optimizationrule.impl.CopyXfromStarToYImpl#isIsFront <em>Is Front</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CopyXfromStarToYImpl extends OptimizationRuleImpl implements CopyXfromStarToY {
	/**
	 * The default value of the '{@link #getAttrInX() <em>Attr In X</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAttrInX()
	 * @generated
	 * @ordered
	 */
	protected static final String ATTR_IN_X_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAttrInX() <em>Attr In X</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAttrInX()
	 * @generated
	 * @ordered
	 */
	protected String attrInX = ATTR_IN_X_EDEFAULT;

	/**
	 * The default value of the '{@link #getAttrInY() <em>Attr In Y</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAttrInY()
	 * @generated
	 * @ordered
	 */
	protected static final String ATTR_IN_Y_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAttrInY() <em>Attr In Y</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAttrInY()
	 * @generated
	 * @ordered
	 */
	protected String attrInY = ATTR_IN_Y_EDEFAULT;

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
	protected CopyXfromStarToYImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OptimizationrulePackage.Literals.COPY_XFROM_STAR_TO_Y;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getAttrInX() {
		return attrInX;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAttrInX(String newAttrInX) {
		String oldAttrInX = attrInX;
		attrInX = newAttrInX;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OptimizationrulePackage.COPY_XFROM_STAR_TO_Y__ATTR_IN_X, oldAttrInX, attrInX));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getAttrInY() {
		return attrInY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAttrInY(String newAttrInY) {
		String oldAttrInY = attrInY;
		attrInY = newAttrInY;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OptimizationrulePackage.COPY_XFROM_STAR_TO_Y__ATTR_IN_Y, oldAttrInY, attrInY));
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
			eNotify(new ENotificationImpl(this, Notification.SET, OptimizationrulePackage.COPY_XFROM_STAR_TO_Y__IS_FRONT, oldIsFront, isFront));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case OptimizationrulePackage.COPY_XFROM_STAR_TO_Y__ATTR_IN_X:
				return getAttrInX();
			case OptimizationrulePackage.COPY_XFROM_STAR_TO_Y__ATTR_IN_Y:
				return getAttrInY();
			case OptimizationrulePackage.COPY_XFROM_STAR_TO_Y__IS_FRONT:
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
			case OptimizationrulePackage.COPY_XFROM_STAR_TO_Y__ATTR_IN_X:
				setAttrInX((String)newValue);
				return;
			case OptimizationrulePackage.COPY_XFROM_STAR_TO_Y__ATTR_IN_Y:
				setAttrInY((String)newValue);
				return;
			case OptimizationrulePackage.COPY_XFROM_STAR_TO_Y__IS_FRONT:
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
			case OptimizationrulePackage.COPY_XFROM_STAR_TO_Y__ATTR_IN_X:
				setAttrInX(ATTR_IN_X_EDEFAULT);
				return;
			case OptimizationrulePackage.COPY_XFROM_STAR_TO_Y__ATTR_IN_Y:
				setAttrInY(ATTR_IN_Y_EDEFAULT);
				return;
			case OptimizationrulePackage.COPY_XFROM_STAR_TO_Y__IS_FRONT:
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
			case OptimizationrulePackage.COPY_XFROM_STAR_TO_Y__ATTR_IN_X:
				return ATTR_IN_X_EDEFAULT == null ? attrInX != null : !ATTR_IN_X_EDEFAULT.equals(attrInX);
			case OptimizationrulePackage.COPY_XFROM_STAR_TO_Y__ATTR_IN_Y:
				return ATTR_IN_Y_EDEFAULT == null ? attrInY != null : !ATTR_IN_Y_EDEFAULT.equals(attrInY);
			case OptimizationrulePackage.COPY_XFROM_STAR_TO_Y__IS_FRONT:
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
		result.append(" (attrInX: ");
		result.append(attrInX);
		result.append(", attrInY: ");
		result.append(attrInY);
		result.append(", isFront: ");
		result.append(isFront);
		result.append(')');
		return result.toString();
	}

	public void apply() {
		if (attrInX == null || attrInY == null)
			return;
		
		for (GrammarRule rule : getGrammar().getRules()) {
			if (rule.getName() == null)
				continue;
			
			if (grammarRule != null && !grammarRule.isEmpty()) {
				if (!rule.getName().equals(grammarRule)) {
					continue;
				}
			}
			
			String expOfXinRange1 = null;
			
			for (LineEntry line : rule.getLines()) {
				if (line.getAttrName() == null)
					continue;
				if (line.getAttrName().equals(attrInX)) {
					String lineContent = line.getLineContent();
					expOfXinRange1 = StringHelper.getX(lineContent, attrInX);					
					break;
				}
			}
			
			if (expOfXinRange1 == null)
				break;
			
			for (LineEntry line : rule.getLines()) {
				if (line.getAttrName() == null)
					continue;
				if (line.getAttrName().equals(attrInY)) {
					String lineContent = line.getLineContent();
					int numOfWhiteSpace = StringHelper.getWhitespaceNumAtHead(lineContent);
					String coreLineContentOfY = lineContent.stripLeading();
					
					if (isFront) {
						lineContent = expOfXinRange1 + " " + coreLineContentOfY;
					}
					else {
						lineContent = coreLineContentOfY + " " + expOfXinRange1;
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
} //CopyXfromStarToYImpl
