/**
 */
package org.bumble.xtext.grammaroptimizer.optimizationrule.impl;
import org.bumble.xtext.grammaroptimizer.grammarrule.GrammarRule;
import org.bumble.xtext.grammaroptimizer.optimizationrule.AddStringToRuleKeyword;
import org.bumble.xtext.grammaroptimizer.optimizationrule.GrammaroptimizerFactory;
import org.bumble.xtext.grammaroptimizer.optimizationrule.OptimizationrulePackage;
import org.bumble.xtext.grammaroptimizer.optimizationrule.RenameKeyword;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Add String To Rule Keyword</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.bumble.xtext.grammaroptimizer.optimizationrule.impl.AddStringToRuleKeywordImpl#getTargetAttribute <em>Target Attribute</em>}</li>
 *   <li>{@link org.bumble.xtext.grammaroptimizer.optimizationrule.impl.AddStringToRuleKeywordImpl#getAddedString <em>Added String</em>}</li>
 *   <li>{@link org.bumble.xtext.grammaroptimizer.optimizationrule.impl.AddStringToRuleKeywordImpl#isIsHead <em>Is Head</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AddStringToRuleKeywordImpl extends OptimizationRuleImpl implements AddStringToRuleKeyword {
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
	 * The default value of the '{@link #getAddedString() <em>Added String</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAddedString()
	 * @generated
	 * @ordered
	 */
	protected static final String ADDED_STRING_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAddedString() <em>Added String</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAddedString()
	 * @generated
	 * @ordered
	 */
	protected String addedString = ADDED_STRING_EDEFAULT;

	/**
	 * The default value of the '{@link #isIsHead() <em>Is Head</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsHead()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_HEAD_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIsHead() <em>Is Head</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsHead()
	 * @generated
	 * @ordered
	 */
	protected boolean isHead = IS_HEAD_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AddStringToRuleKeywordImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OptimizationrulePackage.Literals.ADD_STRING_TO_RULE_KEYWORD;
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
			eNotify(new ENotificationImpl(this, Notification.SET, OptimizationrulePackage.ADD_STRING_TO_RULE_KEYWORD__TARGET_ATTRIBUTE, oldTargetAttribute, targetAttribute));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getAddedString() {
		return addedString;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAddedString(String newAddedString) {
		String oldAddedString = addedString;
		addedString = newAddedString;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OptimizationrulePackage.ADD_STRING_TO_RULE_KEYWORD__ADDED_STRING, oldAddedString, addedString));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isIsHead() {
		return isHead;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsHead(boolean newIsHead) {
		boolean oldIsHead = isHead;
		isHead = newIsHead;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OptimizationrulePackage.ADD_STRING_TO_RULE_KEYWORD__IS_HEAD, oldIsHead, isHead));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case OptimizationrulePackage.ADD_STRING_TO_RULE_KEYWORD__TARGET_ATTRIBUTE:
				return getTargetAttribute();
			case OptimizationrulePackage.ADD_STRING_TO_RULE_KEYWORD__ADDED_STRING:
				return getAddedString();
			case OptimizationrulePackage.ADD_STRING_TO_RULE_KEYWORD__IS_HEAD:
				return isIsHead();
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
			case OptimizationrulePackage.ADD_STRING_TO_RULE_KEYWORD__TARGET_ATTRIBUTE:
				setTargetAttribute((String)newValue);
				return;
			case OptimizationrulePackage.ADD_STRING_TO_RULE_KEYWORD__ADDED_STRING:
				setAddedString((String)newValue);
				return;
			case OptimizationrulePackage.ADD_STRING_TO_RULE_KEYWORD__IS_HEAD:
				setIsHead((Boolean)newValue);
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
			case OptimizationrulePackage.ADD_STRING_TO_RULE_KEYWORD__TARGET_ATTRIBUTE:
				setTargetAttribute(TARGET_ATTRIBUTE_EDEFAULT);
				return;
			case OptimizationrulePackage.ADD_STRING_TO_RULE_KEYWORD__ADDED_STRING:
				setAddedString(ADDED_STRING_EDEFAULT);
				return;
			case OptimizationrulePackage.ADD_STRING_TO_RULE_KEYWORD__IS_HEAD:
				setIsHead(IS_HEAD_EDEFAULT);
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
			case OptimizationrulePackage.ADD_STRING_TO_RULE_KEYWORD__TARGET_ATTRIBUTE:
				return TARGET_ATTRIBUTE_EDEFAULT == null ? targetAttribute != null : !TARGET_ATTRIBUTE_EDEFAULT.equals(targetAttribute);
			case OptimizationrulePackage.ADD_STRING_TO_RULE_KEYWORD__ADDED_STRING:
				return ADDED_STRING_EDEFAULT == null ? addedString != null : !ADDED_STRING_EDEFAULT.equals(addedString);
			case OptimizationrulePackage.ADD_STRING_TO_RULE_KEYWORD__IS_HEAD:
				return isHead != IS_HEAD_EDEFAULT;
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
		result.append(" (targetAttribute: ");
		result.append(targetAttribute);
		result.append(", addedString: ");
		result.append(addedString);
		result.append(", isHead: ");
		result.append(isHead);
		result.append(')');
		return result.toString();
	}

	public void apply() {
		for (GrammarRule rule : grammar.getRules()) {
			if (rule.getName() == null)
				continue;
			
			// modify keyword from X to @X
			RenameKeyword renameKeyword = GrammaroptimizerFactory.eINSTANCE.createRenameKeyword();
			renameKeyword.setGrammar(grammar);
			renameKeyword.setGrammarRule(rule.getName());
			renameKeyword.setCurrentKeyword(rule.getName());
			String newKeyword = "";
			
			if (isHead) {
				newKeyword = addedString + rule.getName();
			}
			else {
				newKeyword = rule.getName() + addedString;
			}
			
			renameKeyword.setNewKeyword(newKeyword);
			renameKeyword.setTargetAttribute(targetAttribute);
			renameKeyword.apply();
		}
	}
} //AddStringToRuleKeywordImpl
