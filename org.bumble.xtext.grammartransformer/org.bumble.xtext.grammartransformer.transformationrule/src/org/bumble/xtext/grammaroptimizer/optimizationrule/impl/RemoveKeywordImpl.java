/**
 */
package org.bumble.xtext.grammaroptimizer.optimizationrule.impl;
import org.bumble.xtext.grammaroptimizer.helper.RegexHelper;
import org.bumble.xtext.grammaroptimizer.optimizationrule.OptimizationrulePackage;
import org.bumble.xtext.grammaroptimizer.optimizationrule.RemoveKeyword;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Remove Keyword</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.bumble.xtext.grammaroptimizer.optimizationrule.impl.RemoveKeywordImpl#getKeywordName <em>Keyword Name</em>}</li>
 *   <li>{@link org.bumble.xtext.grammaroptimizer.optimizationrule.impl.RemoveKeywordImpl#getTargetAttribute <em>Target Attribute</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RemoveKeywordImpl extends OptimizationRuleImpl implements RemoveKeyword {
	/**
	 * The default value of the '{@link #getKeywordName() <em>Keyword Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKeywordName()
	 * @generated
	 * @ordered
	 */
	protected static final String KEYWORD_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getKeywordName() <em>Keyword Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKeywordName()
	 * @generated
	 * @ordered
	 */
	protected String keywordName = KEYWORD_NAME_EDEFAULT;

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
	protected RemoveKeywordImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OptimizationrulePackage.Literals.REMOVE_KEYWORD;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getKeywordName() {
		return keywordName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setKeywordName(String newKeywordName) {
		String oldKeywordName = keywordName;
		keywordName = newKeywordName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OptimizationrulePackage.REMOVE_KEYWORD__KEYWORD_NAME, oldKeywordName, keywordName));
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
			eNotify(new ENotificationImpl(this, Notification.SET, OptimizationrulePackage.REMOVE_KEYWORD__TARGET_ATTRIBUTE, oldTargetAttribute, targetAttribute));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case OptimizationrulePackage.REMOVE_KEYWORD__KEYWORD_NAME:
				return getKeywordName();
			case OptimizationrulePackage.REMOVE_KEYWORD__TARGET_ATTRIBUTE:
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
			case OptimizationrulePackage.REMOVE_KEYWORD__KEYWORD_NAME:
				setKeywordName((String)newValue);
				return;
			case OptimizationrulePackage.REMOVE_KEYWORD__TARGET_ATTRIBUTE:
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
			case OptimizationrulePackage.REMOVE_KEYWORD__KEYWORD_NAME:
				setKeywordName(KEYWORD_NAME_EDEFAULT);
				return;
			case OptimizationrulePackage.REMOVE_KEYWORD__TARGET_ATTRIBUTE:
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
			case OptimizationrulePackage.REMOVE_KEYWORD__KEYWORD_NAME:
				return KEYWORD_NAME_EDEFAULT == null ? keywordName != null : !KEYWORD_NAME_EDEFAULT.equals(keywordName);
			case OptimizationrulePackage.REMOVE_KEYWORD__TARGET_ATTRIBUTE:
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
		result.append(" (keywordName: ");
		result.append(keywordName);
		result.append(", targetAttribute: ");
		result.append(targetAttribute);
		result.append(')');
		return result.toString();
	}

	public void apply() {
		for (int i = 0; i < grammar.getRules().size(); i++) {
			if (grammar.getRules().get(i).getName() == null)
				continue;
			
			// if a grammar rule has been specified, then remove the keyword
			// only from the specified grammar rule
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
			
			if (keywordName != null && !keywordName.isEmpty()) {
				// we have ' ' in both sides of a keyword in xtext file
				String keyword = "\'" + keywordName + "\'";
				
				for (int j = 0; j < grammar.getRules().get(i).getLines().size(); j++) {
					String strTemp = grammar.getRules().get(i).getLines().get(j).getLineContent();
					
					// if a attribute is specified, then remove the brackets
					// only from a specified attribute
					if (attrName != null && !attrName.isEmpty()) {
						if (!RegexHelper.doesStringExist(strTemp, attrName + ".*\\=")) {
							continue;
						}
					}
					
					// find the line containing the keyword
					if (RegexHelper.doesStringExist(grammar.getRules().get(i).getLines().get(j).getLineContent(), keyword)) {
						// remove the keyword
						String lineContent = grammar.getRules().get(i).getLines().get(j).getLineContent();
						lineContent = lineContent.replaceAll( keyword, "");
						grammar.getRules().get(i).getLines().get(j).setLineContent(lineContent);
						break;
					}
				}
			}
			else {
				for (int j = 0; j < grammar.getRules().get(i).getLines().size(); j++) {
					String lineContent = grammar.getRules().get(i).getLines().get(j).getLineContent();
					if (!RegexHelper.doesStringExist(lineContent, "(\'\\w*\')"))
						continue;
					
					lineContent = lineContent.replaceAll( "(\'\\w*\')", "");
					grammar.getRules().get(i).getLines().get(j).setLineContent(lineContent);
				}
			}
			
			if (grammarRule != null && !grammarRule.isEmpty()) {
				break;
			}
		}
	}
} //RemoveKeywordImpl
