/**
 */
package org.bumble.xtext.grammaroptimizer.optimizationrule.impl;

import org.bumble.xtext.grammaroptimizer.grammarrule.GrammarRule;
import org.bumble.xtext.grammaroptimizer.grammarrule.LineEntry;
import org.bumble.xtext.grammaroptimizer.helper.RegexHelper;
import org.bumble.xtext.grammaroptimizer.optimizationrule.AddAlternativeKeyword;
import org.bumble.xtext.grammaroptimizer.optimizationrule.OptimizationrulePackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Add Alternative Keyword</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.bumble.xtext.grammaroptimizer.optimizationrule.impl.AddAlternativeKeywordImpl#getCurrentKeyword <em>Current Keyword</em>}</li>
 *   <li>{@link org.bumble.xtext.grammaroptimizer.optimizationrule.impl.AddAlternativeKeywordImpl#getNewKeyword <em>New Keyword</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AddAlternativeKeywordImpl extends OptimizationRuleImpl implements AddAlternativeKeyword {
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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AddAlternativeKeywordImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OptimizationrulePackage.Literals.ADD_ALTERNATIVE_KEYWORD;
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
			eNotify(new ENotificationImpl(this, Notification.SET, OptimizationrulePackage.ADD_ALTERNATIVE_KEYWORD__CURRENT_KEYWORD, oldCurrentKeyword, currentKeyword));
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
			eNotify(new ENotificationImpl(this, Notification.SET, OptimizationrulePackage.ADD_ALTERNATIVE_KEYWORD__NEW_KEYWORD, oldNewKeyword, newKeyword));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case OptimizationrulePackage.ADD_ALTERNATIVE_KEYWORD__CURRENT_KEYWORD:
				return getCurrentKeyword();
			case OptimizationrulePackage.ADD_ALTERNATIVE_KEYWORD__NEW_KEYWORD:
				return getNewKeyword();
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
			case OptimizationrulePackage.ADD_ALTERNATIVE_KEYWORD__CURRENT_KEYWORD:
				setCurrentKeyword((String)newValue);
				return;
			case OptimizationrulePackage.ADD_ALTERNATIVE_KEYWORD__NEW_KEYWORD:
				setNewKeyword((String)newValue);
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
			case OptimizationrulePackage.ADD_ALTERNATIVE_KEYWORD__CURRENT_KEYWORD:
				setCurrentKeyword(CURRENT_KEYWORD_EDEFAULT);
				return;
			case OptimizationrulePackage.ADD_ALTERNATIVE_KEYWORD__NEW_KEYWORD:
				setNewKeyword(NEW_KEYWORD_EDEFAULT);
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
			case OptimizationrulePackage.ADD_ALTERNATIVE_KEYWORD__CURRENT_KEYWORD:
				return CURRENT_KEYWORD_EDEFAULT == null ? currentKeyword != null : !CURRENT_KEYWORD_EDEFAULT.equals(currentKeyword);
			case OptimizationrulePackage.ADD_ALTERNATIVE_KEYWORD__NEW_KEYWORD:
				return NEW_KEYWORD_EDEFAULT == null ? newKeyword != null : !NEW_KEYWORD_EDEFAULT.equals(newKeyword);
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
		result.append(')');
		return result.toString();
	}
	
	// Add a new keyword (e.g. 'B') to an existing keyword (e.g. 'A'), so then it will be 'A' | 'B'
		public void apply() {
			if (currentKeyword == null || currentKeyword.isEmpty() || newKeyword == null || newKeyword.isEmpty())
				return;
			
			for (GrammarRule rule : getGrammar().getRules()) {
				if (rule.getName() == null)
					continue;
				
				if (grammarRule != null && !grammarRule.isEmpty()) {
					if (!rule.getName().equals(grammarRule)) 
						continue;
				}
				
				String strExistingKeyword = "\'" + currentKeyword + "\'";
				String strNewKeyword = "'" + currentKeyword + "' | '" + newKeyword + "'";
				
				for (LineEntry line : rule.getLines()) {
					String lineContent = line.getLineContent();
					
					if (RegexHelper.doesStringExist(lineContent, strExistingKeyword)) {
						lineContent = lineContent.replaceAll(strExistingKeyword, strNewKeyword);
						line.setLineContent(lineContent);
						break;
					}
				}
				
				if (grammarRule != null && !grammarRule.isEmpty()) {
					break;
				}
			}
		}

} //AddAlternativeKeywordImpl
