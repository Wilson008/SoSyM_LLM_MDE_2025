/**
 */
package org.bumble.xtext.grammaroptimizer.optimizationrule.impl;
import org.bumble.xtext.grammaroptimizer.grammarrule.GrammarRule;
import org.bumble.xtext.grammaroptimizer.grammarrule.LineEntry;
import org.bumble.xtext.grammaroptimizer.helper.RegexHelper;
import org.bumble.xtext.grammaroptimizer.helper.StringHelper;
import org.bumble.xtext.grammaroptimizer.optimizationrule.ChangeAttrLineContent;
import org.bumble.xtext.grammaroptimizer.optimizationrule.OptimizationrulePackage;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Change Attr Line Content</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.bumble.xtext.grammaroptimizer.optimizationrule.impl.ChangeAttrLineContentImpl#getNewLineContent <em>New Line Content</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ChangeAttrLineContentImpl extends OptimizationRuleImpl implements ChangeAttrLineContent {
	/**
	 * The default value of the '{@link #getNewLineContent() <em>New Line Content</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNewLineContent()
	 * @generated
	 * @ordered
	 */
	protected static final String NEW_LINE_CONTENT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getNewLineContent() <em>New Line Content</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNewLineContent()
	 * @generated
	 * @ordered
	 */
	protected String newLineContent = NEW_LINE_CONTENT_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ChangeAttrLineContentImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OptimizationrulePackage.Literals.CHANGE_ATTR_LINE_CONTENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getNewLineContent() {
		return newLineContent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNewLineContent(String newNewLineContent) {
		String oldNewLineContent = newLineContent;
		newLineContent = newNewLineContent;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OptimizationrulePackage.CHANGE_ATTR_LINE_CONTENT__NEW_LINE_CONTENT, oldNewLineContent, newLineContent));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case OptimizationrulePackage.CHANGE_ATTR_LINE_CONTENT__NEW_LINE_CONTENT:
				return getNewLineContent();
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
			case OptimizationrulePackage.CHANGE_ATTR_LINE_CONTENT__NEW_LINE_CONTENT:
				setNewLineContent((String)newValue);
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
			case OptimizationrulePackage.CHANGE_ATTR_LINE_CONTENT__NEW_LINE_CONTENT:
				setNewLineContent(NEW_LINE_CONTENT_EDEFAULT);
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
			case OptimizationrulePackage.CHANGE_ATTR_LINE_CONTENT__NEW_LINE_CONTENT:
				return NEW_LINE_CONTENT_EDEFAULT == null ? newLineContent != null : !NEW_LINE_CONTENT_EDEFAULT.equals(newLineContent);
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
		result.append(" (newLineContent: ");
		result.append(newLineContent);
		result.append(')');
		return result.toString();
	}

	public void apply() {
		for (GrammarRule rule : grammar.getRules()) {
			if (rule.getName() == null)
				continue;
			
			if (!rule.getName().equals(grammarRule))
				continue;
			
			for (LineEntry line : rule.getLines()) {
				String lineContent = line.getLineContent();
				
				if (line.getAttrName() == null || line.getAttrName().isEmpty()) {
					if (!RegexHelper.doesStringExist(lineContent, "\'" + attrName + "\'")) {
						continue;
					}
				}
				else {
					if (!line.getAttrName().equals(attrName)) {
						continue;
					}
				}
				
				int num = StringHelper.getWhitespaceNumAtHead(lineContent);
				lineContent = StringHelper.setWhitespaceToString(newLineContent, num);
				line.setLineContent(lineContent);
				break;
			}
			
			break;
		}
	}
} //ChangeAttrLineContentImpl
