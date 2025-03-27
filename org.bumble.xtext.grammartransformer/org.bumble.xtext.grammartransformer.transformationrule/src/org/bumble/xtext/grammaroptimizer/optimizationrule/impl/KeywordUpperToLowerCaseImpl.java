/**
 */
package org.bumble.xtext.grammaroptimizer.optimizationrule.impl;
import java.util.List;
import java.util.regex.Pattern;

import org.bumble.xtext.grammaroptimizer.grammarrule.GrammarRule;
import org.bumble.xtext.grammaroptimizer.grammarrule.LineEntry;
import org.bumble.xtext.grammaroptimizer.helper.RegexHelper;
import org.bumble.xtext.grammaroptimizer.optimizationrule.KeywordUpperToLowerCase;
import org.bumble.xtext.grammaroptimizer.optimizationrule.OptimizationrulePackage;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Keyword Upper To Lower Case</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.bumble.xtext.grammaroptimizer.optimizationrule.impl.KeywordUpperToLowerCaseImpl#getKeyword <em>Keyword</em>}</li>
 * </ul>
 *
 * @generated
 */
public class KeywordUpperToLowerCaseImpl extends OptimizationRuleImpl implements KeywordUpperToLowerCase {
	/**
	 * The default value of the '{@link #getKeyword() <em>Keyword</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKeyword()
	 * @generated
	 * @ordered
	 */
	protected static final String KEYWORD_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getKeyword() <em>Keyword</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKeyword()
	 * @generated
	 * @ordered
	 */
	protected String keyword = KEYWORD_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected KeywordUpperToLowerCaseImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OptimizationrulePackage.Literals.KEYWORD_UPPER_TO_LOWER_CASE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getKeyword() {
		return keyword;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setKeyword(String newKeyword) {
		String oldKeyword = keyword;
		keyword = newKeyword;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OptimizationrulePackage.KEYWORD_UPPER_TO_LOWER_CASE__KEYWORD, oldKeyword, keyword));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case OptimizationrulePackage.KEYWORD_UPPER_TO_LOWER_CASE__KEYWORD:
				return getKeyword();
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
			case OptimizationrulePackage.KEYWORD_UPPER_TO_LOWER_CASE__KEYWORD:
				setKeyword((String)newValue);
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
			case OptimizationrulePackage.KEYWORD_UPPER_TO_LOWER_CASE__KEYWORD:
				setKeyword(KEYWORD_EDEFAULT);
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
			case OptimizationrulePackage.KEYWORD_UPPER_TO_LOWER_CASE__KEYWORD:
				return KEYWORD_EDEFAULT == null ? keyword != null : !KEYWORD_EDEFAULT.equals(keyword);
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
		result.append(" (keyword: ");
		result.append(keyword);
		result.append(')');
		return result.toString();
	}

	public void apply() {
		for (GrammarRule rule : grammar.getRules()) {
			if (rule.getName() == null)
				continue;
			
			if (grammarRule != null && !grammarRule.isEmpty()) {
				if (!rule.getName().equals(grammarRule))
					continue;
			}
			
			for (LineEntry line : rule.getLines()) {
				String lineContent = line.getLineContent();
				
				if (attrName != null && !attrName.isEmpty()) {
					if (!line.getAttrName().equals(attrName))
						continue;
				}
				
				String regex = "\'(\\w*)\'";
				if (RegexHelper.doesStringExist(lineContent, regex)) {
					Pattern pattern = Pattern.compile(regex);
					List<String> keywordList = RegexHelper.getTargetStringArray(lineContent, pattern);
					
					for (int i = 0; i < keywordList.size(); i++) {
						String innerRegex = "\'" + keywordList.get(i) + "\'";
						String newKeyword = keywordList.get(i).toLowerCase();
						lineContent = lineContent.replaceAll(innerRegex, "'" + newKeyword + "'");
					}
					
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
} //KeywordUpperToLowerCaseImpl
