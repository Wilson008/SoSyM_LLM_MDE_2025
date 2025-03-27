/**
 */
package org.bumble.xtext.grammaroptimizer.optimizationrule.impl;

import org.bumble.xtext.grammaroptimizer.grammarrule.GrammarRule;
import org.bumble.xtext.grammaroptimizer.grammarrule.LineEntry;
import org.bumble.xtext.grammaroptimizer.helper.RegexHelper;
import org.bumble.xtext.grammaroptimizer.optimizationrule.AddKeywordAfterKeyword;
import org.bumble.xtext.grammaroptimizer.optimizationrule.OptimizationrulePackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Add Keyword After Keyword</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.bumble.xtext.grammaroptimizer.optimizationrule.impl.AddKeywordAfterKeywordImpl#getNewKeyword <em>New Keyword</em>}</li>
 *   <li>{@link org.bumble.xtext.grammaroptimizer.optimizationrule.impl.AddKeywordAfterKeywordImpl#getCurrentKeyword <em>Current Keyword</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AddKeywordAfterKeywordImpl extends OptimizationRuleImpl implements AddKeywordAfterKeyword {
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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AddKeywordAfterKeywordImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OptimizationrulePackage.Literals.ADD_KEYWORD_AFTER_KEYWORD;
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
			eNotify(new ENotificationImpl(this, Notification.SET, OptimizationrulePackage.ADD_KEYWORD_AFTER_KEYWORD__NEW_KEYWORD, oldNewKeyword, newKeyword));
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
			eNotify(new ENotificationImpl(this, Notification.SET, OptimizationrulePackage.ADD_KEYWORD_AFTER_KEYWORD__CURRENT_KEYWORD, oldCurrentKeyword, currentKeyword));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case OptimizationrulePackage.ADD_KEYWORD_AFTER_KEYWORD__NEW_KEYWORD:
				return getNewKeyword();
			case OptimizationrulePackage.ADD_KEYWORD_AFTER_KEYWORD__CURRENT_KEYWORD:
				return getCurrentKeyword();
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
			case OptimizationrulePackage.ADD_KEYWORD_AFTER_KEYWORD__NEW_KEYWORD:
				setNewKeyword((String)newValue);
				return;
			case OptimizationrulePackage.ADD_KEYWORD_AFTER_KEYWORD__CURRENT_KEYWORD:
				setCurrentKeyword((String)newValue);
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
			case OptimizationrulePackage.ADD_KEYWORD_AFTER_KEYWORD__NEW_KEYWORD:
				setNewKeyword(NEW_KEYWORD_EDEFAULT);
				return;
			case OptimizationrulePackage.ADD_KEYWORD_AFTER_KEYWORD__CURRENT_KEYWORD:
				setCurrentKeyword(CURRENT_KEYWORD_EDEFAULT);
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
			case OptimizationrulePackage.ADD_KEYWORD_AFTER_KEYWORD__NEW_KEYWORD:
				return NEW_KEYWORD_EDEFAULT == null ? newKeyword != null : !NEW_KEYWORD_EDEFAULT.equals(newKeyword);
			case OptimizationrulePackage.ADD_KEYWORD_AFTER_KEYWORD__CURRENT_KEYWORD:
				return CURRENT_KEYWORD_EDEFAULT == null ? currentKeyword != null : !CURRENT_KEYWORD_EDEFAULT.equals(currentKeyword);
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
		result.append(" (newKeyword: ");
		result.append(newKeyword);
		result.append(", currentKeyword: ");
		result.append(currentKeyword);
		result.append(')');
		return result.toString();
	}
	
	public void apply() {
		for (GrammarRule rule : getGrammar().getRules()) {
			if (rule.getName() == null)
				continue;
			
			if (grammarRule != null || !grammarRule.isEmpty()) {
				if (!rule.getName().equals(grammarRule)) {
					continue;
				}
			}
			
			for (LineEntry line : rule.getLines()) {
				String lineContent = line.getLineContent();
				
				if (attrName != null && !attrName.isEmpty()) {
					if (!RegexHelper.doesStringExist(lineContent, attrName))
						continue;
					
					if (RegexHelper.doesStringExist(lineContent, "\'" + currentKeyword + "\'")) {
						lineContent = lineContent.replaceAll( "\'" + currentKeyword + "\'", 
								"'" + currentKeyword + "'" + " " + "'" + newKeyword + "'");
						line.setLineContent(lineContent);
						break;
					}
				}
				else {
					if (RegexHelper.doesStringExist(lineContent, "\'" + currentKeyword + "\'")) {
						lineContent = lineContent.replaceAll( "\'" + currentKeyword + "\'", 
								"'" + currentKeyword + "'" + " " + "'" + newKeyword + "'");
						line.setLineContent(lineContent);
						break;
					}
				}
			}
			
			if (grammarRule != null || !grammarRule.isEmpty()) {
				break;
			}
		}
	}

} //AddKeywordAfterKeywordImpl
