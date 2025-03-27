/**
 */
package org.bumble.xtext.grammaroptimizer.optimizationrule.impl;

import org.bumble.xtext.grammaroptimizer.helper.RegexHelper;
import org.bumble.xtext.grammaroptimizer.optimizationrule.OptimizationrulePackage;
import org.bumble.xtext.grammaroptimizer.optimizationrule.RenameKeyword;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Rename Keyword</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.bumble.xtext.grammaroptimizer.optimizationrule.impl.RenameKeywordImpl#getCurrentKeyword <em>Current Keyword</em>}</li>
 *   <li>{@link org.bumble.xtext.grammaroptimizer.optimizationrule.impl.RenameKeywordImpl#getNewKeyword <em>New Keyword</em>}</li>
 *   <li>{@link org.bumble.xtext.grammaroptimizer.optimizationrule.impl.RenameKeywordImpl#getTargetAttribute <em>Target Attribute</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RenameKeywordImpl extends OptimizationRuleImpl implements RenameKeyword {
	/**
	 * The default value of the '{@link #getCurrentKeyword() <em>Current Keyword</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCurrentKeyword()
	 * @generated
	 * @ordered
	 */
	protected static final String CURRENT_KEYWORD_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCurrentKeyword() <em>Current Keyword</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCurrentKeyword()
	 * @generated
	 * @ordered
	 */
	protected String currentKeyword = CURRENT_KEYWORD_EDEFAULT;

	/**
	 * The default value of the '{@link #getNewKeyword() <em>New Keyword</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNewKeyword()
	 * @generated
	 * @ordered
	 */
	protected static final String NEW_KEYWORD_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getNewKeyword() <em>New Keyword</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNewKeyword()
	 * @generated
	 * @ordered
	 */
	protected String newKeyword = NEW_KEYWORD_EDEFAULT;

	/**
	 * The default value of the '{@link #getTargetAttribute() <em>Target Attribute</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTargetAttribute()
	 * @generated
	 * @ordered
	 */
	protected static final String TARGET_ATTRIBUTE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTargetAttribute() <em>Target Attribute</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTargetAttribute()
	 * @generated
	 * @ordered
	 */
	protected String targetAttribute = TARGET_ATTRIBUTE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RenameKeywordImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OptimizationrulePackage.Literals.RENAME_KEYWORD;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCurrentKeyword() {
		return currentKeyword;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCurrentKeyword(String newCurrentKeyword) {
		String oldCurrentKeyword = currentKeyword;
		currentKeyword = newCurrentKeyword;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OptimizationrulePackage.RENAME_KEYWORD__CURRENT_KEYWORD, oldCurrentKeyword, currentKeyword));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getNewKeyword() {
		return newKeyword;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNewKeyword(String newNewKeyword) {
		String oldNewKeyword = newKeyword;
		newKeyword = newNewKeyword;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OptimizationrulePackage.RENAME_KEYWORD__NEW_KEYWORD, oldNewKeyword, newKeyword));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTargetAttribute() {
		return targetAttribute;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTargetAttribute(String newTargetAttribute) {
		String oldTargetAttribute = targetAttribute;
		targetAttribute = newTargetAttribute;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OptimizationrulePackage.RENAME_KEYWORD__TARGET_ATTRIBUTE, oldTargetAttribute, targetAttribute));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case OptimizationrulePackage.RENAME_KEYWORD__CURRENT_KEYWORD:
				return getCurrentKeyword();
			case OptimizationrulePackage.RENAME_KEYWORD__NEW_KEYWORD:
				return getNewKeyword();
			case OptimizationrulePackage.RENAME_KEYWORD__TARGET_ATTRIBUTE:
				return getTargetAttribute();
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
			case OptimizationrulePackage.RENAME_KEYWORD__CURRENT_KEYWORD:
				setCurrentKeyword((String)newValue);
				return;
			case OptimizationrulePackage.RENAME_KEYWORD__NEW_KEYWORD:
				setNewKeyword((String)newValue);
				return;
			case OptimizationrulePackage.RENAME_KEYWORD__TARGET_ATTRIBUTE:
				setTargetAttribute((String)newValue);
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
			case OptimizationrulePackage.RENAME_KEYWORD__CURRENT_KEYWORD:
				setCurrentKeyword(CURRENT_KEYWORD_EDEFAULT);
				return;
			case OptimizationrulePackage.RENAME_KEYWORD__NEW_KEYWORD:
				setNewKeyword(NEW_KEYWORD_EDEFAULT);
				return;
			case OptimizationrulePackage.RENAME_KEYWORD__TARGET_ATTRIBUTE:
				setTargetAttribute(TARGET_ATTRIBUTE_EDEFAULT);
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
			case OptimizationrulePackage.RENAME_KEYWORD__CURRENT_KEYWORD:
				return CURRENT_KEYWORD_EDEFAULT == null ? currentKeyword != null : !CURRENT_KEYWORD_EDEFAULT.equals(currentKeyword);
			case OptimizationrulePackage.RENAME_KEYWORD__NEW_KEYWORD:
				return NEW_KEYWORD_EDEFAULT == null ? newKeyword != null : !NEW_KEYWORD_EDEFAULT.equals(newKeyword);
			case OptimizationrulePackage.RENAME_KEYWORD__TARGET_ATTRIBUTE:
				return TARGET_ATTRIBUTE_EDEFAULT == null ? targetAttribute != null : !TARGET_ATTRIBUTE_EDEFAULT.equals(targetAttribute);
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
		result.append(" (currentKeyword: ");
		result.append(currentKeyword);
		result.append(", newKeyword: ");
		result.append(newKeyword);
		result.append(", targetAttribute: ");
		result.append(targetAttribute);
		result.append(')');
		return result.toString();
	}
	
	public void apply() {
		if (currentKeyword == null || newKeyword == null) {
			return;
		}
		for (int i = 0; i < grammar.getRules().size(); i++) {
			if (grammar.getRules().get(i).getName() == null)
				continue;
			
			if (grammarRule != null && !grammarRule.isEmpty()) {
				if (!grammar.getRules().get(i).getName().equals(grammarRule)) {
					continue;
				}
			}			
			
			if (targetAttribute != null && !targetAttribute.isEmpty()) {
				if (!RegexHelper.doesAttributeExist(grammar.getRules().get(i), targetAttribute)) {
					continue;
				}
			}
			
			// we have ' ' in both sides of a keyword in xtext file
			String currentKeywordWithQuotes = "\'" + currentKeyword + "\'";
			String newKeywordWithQuotes = "\'" + newKeyword + "\'";
			
			for (int j = 0; j < grammar.getRules().get(i).getLines().size(); j++) {
				// find the line containing the keyword
				if (RegexHelper.doesStringExist(grammar.getRules().get(i).getLines().get(j).getLineContent(), currentKeywordWithQuotes)) {
					// rename the keyword
					String lineContent = grammar.getRules().get(i).getLines().get(j).getLineContent();
					lineContent = lineContent.replaceAll(currentKeywordWithQuotes, newKeywordWithQuotes);
					grammar.getRules().get(i).getLines().get(j).setLineContent(lineContent);
					break;
				}
			}
			
			if (grammarRule != null && !grammarRule.isEmpty()) {
				break;
			}			
		}
	}

} //RenameKeywordImpl
