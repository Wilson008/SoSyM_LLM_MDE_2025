/**
 */
package org.bumble.xtext.grammaroptimizer.grammarrule.impl;

import org.bumble.xtext.grammaroptimizer.grammarrule.GrammarrulePackage;
import org.bumble.xtext.grammaroptimizer.grammarrule.LineEntry;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Line Entry</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.bumble.xtext.grammaroptimizer.grammarrule.impl.LineEntryImpl#getLineContent <em>Line Content</em>}</li>
 *   <li>{@link org.bumble.xtext.grammaroptimizer.grammarrule.impl.LineEntryImpl#getAttrName <em>Attr Name</em>}</li>
 * </ul>
 *
 * @generated
 */
public class LineEntryImpl extends MinimalEObjectImpl.Container implements LineEntry {
	/**
	 * The default value of the '{@link #getLineContent() <em>Line Content</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLineContent()
	 * @generated
	 * @ordered
	 */
	protected static final String LINE_CONTENT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLineContent() <em>Line Content</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLineContent()
	 * @generated
	 * @ordered
	 */
	protected String lineContent = LINE_CONTENT_EDEFAULT;

	/**
	 * The default value of the '{@link #getAttrName() <em>Attr Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAttrName()
	 * @generated
	 * @ordered
	 */
	protected static final String ATTR_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAttrName() <em>Attr Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAttrName()
	 * @generated
	 * @ordered
	 */
	protected String attrName = ATTR_NAME_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LineEntryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GrammarrulePackage.Literals.LINE_ENTRY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLineContent() {
		return lineContent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLineContent(String newLineContent) {
		String oldLineContent = lineContent;
		lineContent = newLineContent;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GrammarrulePackage.LINE_ENTRY__LINE_CONTENT, oldLineContent, lineContent));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getAttrName() {
		return attrName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAttrName(String newAttrName) {
		String oldAttrName = attrName;
		attrName = newAttrName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GrammarrulePackage.LINE_ENTRY__ATTR_NAME, oldAttrName, attrName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case GrammarrulePackage.LINE_ENTRY__LINE_CONTENT:
				return getLineContent();
			case GrammarrulePackage.LINE_ENTRY__ATTR_NAME:
				return getAttrName();
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
			case GrammarrulePackage.LINE_ENTRY__LINE_CONTENT:
				setLineContent((String)newValue);
				return;
			case GrammarrulePackage.LINE_ENTRY__ATTR_NAME:
				setAttrName((String)newValue);
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
			case GrammarrulePackage.LINE_ENTRY__LINE_CONTENT:
				setLineContent(LINE_CONTENT_EDEFAULT);
				return;
			case GrammarrulePackage.LINE_ENTRY__ATTR_NAME:
				setAttrName(ATTR_NAME_EDEFAULT);
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
			case GrammarrulePackage.LINE_ENTRY__LINE_CONTENT:
				return LINE_CONTENT_EDEFAULT == null ? lineContent != null : !LINE_CONTENT_EDEFAULT.equals(lineContent);
			case GrammarrulePackage.LINE_ENTRY__ATTR_NAME:
				return ATTR_NAME_EDEFAULT == null ? attrName != null : !ATTR_NAME_EDEFAULT.equals(attrName);
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
		result.append(" (lineContent: ");
		result.append(lineContent);
		result.append(", attrName: ");
		result.append(attrName);
		result.append(')');
		return result.toString();
	}

} //LineEntryImpl
