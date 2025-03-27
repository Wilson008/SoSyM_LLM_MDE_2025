/**
 */
package org.bumble.xtext.grammaroptimizer.optimizationrule.impl;

import java.lang.reflect.InvocationTargetException;
import org.bumble.xtext.grammaroptimizer.optimizationrule.OptimizationRule;
import org.bumble.xtext.grammaroptimizer.optimizationrule.OptimizationrulePackage;
import org.bumble.xtext.grammaroptimizer.grammarrule.Grammar;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Optimization Rule</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.bumble.xtext.grammaroptimizer.optimizationrule.impl.OptimizationRuleImpl#getGrammar <em>Grammar</em>}</li>
 *   <li>{@link org.bumble.xtext.grammaroptimizer.optimizationrule.impl.OptimizationRuleImpl#getGrammarRule <em>Grammar Rule</em>}</li>
 *   <li>{@link org.bumble.xtext.grammaroptimizer.optimizationrule.impl.OptimizationRuleImpl#getAttrName <em>Attr Name</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class OptimizationRuleImpl extends MinimalEObjectImpl.Container implements OptimizationRule {
	/**
	 * The cached value of the '{@link #getGrammar() <em>Grammar</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGrammar()
	 * @generated
	 * @ordered
	 */
	protected Grammar grammar;

	/**
	 * The default value of the '{@link #getGrammarRule() <em>Grammar Rule</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGrammarRule()
	 * @generated
	 * @ordered
	 */
	protected static final String GRAMMAR_RULE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getGrammarRule() <em>Grammar Rule</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGrammarRule()
	 * @generated
	 * @ordered
	 */
	protected String grammarRule = GRAMMAR_RULE_EDEFAULT;

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
	protected OptimizationRuleImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OptimizationrulePackage.Literals.OPTIMIZATION_RULE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Grammar getGrammar() {
		if (grammar != null && grammar.eIsProxy()) {
			InternalEObject oldGrammar = (InternalEObject)grammar;
			grammar = (Grammar)eResolveProxy(oldGrammar);
			if (grammar != oldGrammar) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, OptimizationrulePackage.OPTIMIZATION_RULE__GRAMMAR, oldGrammar, grammar));
			}
		}
		return grammar;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Grammar basicGetGrammar() {
		return grammar;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGrammar(Grammar newGrammar) {
		Grammar oldGrammar = grammar;
		grammar = newGrammar;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OptimizationrulePackage.OPTIMIZATION_RULE__GRAMMAR, oldGrammar, grammar));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getGrammarRule() {
		return grammarRule;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGrammarRule(String newGrammarRule) {
		String oldGrammarRule = grammarRule;
		grammarRule = newGrammarRule;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OptimizationrulePackage.OPTIMIZATION_RULE__GRAMMAR_RULE, oldGrammarRule, grammarRule));
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
			eNotify(new ENotificationImpl(this, Notification.SET, OptimizationrulePackage.OPTIMIZATION_RULE__ATTR_NAME, oldAttrName, attrName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void apply() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case OptimizationrulePackage.OPTIMIZATION_RULE__GRAMMAR:
				if (resolve) return getGrammar();
				return basicGetGrammar();
			case OptimizationrulePackage.OPTIMIZATION_RULE__GRAMMAR_RULE:
				return getGrammarRule();
			case OptimizationrulePackage.OPTIMIZATION_RULE__ATTR_NAME:
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
			case OptimizationrulePackage.OPTIMIZATION_RULE__GRAMMAR:
				setGrammar((Grammar)newValue);
				return;
			case OptimizationrulePackage.OPTIMIZATION_RULE__GRAMMAR_RULE:
				setGrammarRule((String)newValue);
				return;
			case OptimizationrulePackage.OPTIMIZATION_RULE__ATTR_NAME:
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
			case OptimizationrulePackage.OPTIMIZATION_RULE__GRAMMAR:
				setGrammar((Grammar)null);
				return;
			case OptimizationrulePackage.OPTIMIZATION_RULE__GRAMMAR_RULE:
				setGrammarRule(GRAMMAR_RULE_EDEFAULT);
				return;
			case OptimizationrulePackage.OPTIMIZATION_RULE__ATTR_NAME:
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
			case OptimizationrulePackage.OPTIMIZATION_RULE__GRAMMAR:
				return grammar != null;
			case OptimizationrulePackage.OPTIMIZATION_RULE__GRAMMAR_RULE:
				return GRAMMAR_RULE_EDEFAULT == null ? grammarRule != null : !GRAMMAR_RULE_EDEFAULT.equals(grammarRule);
			case OptimizationrulePackage.OPTIMIZATION_RULE__ATTR_NAME:
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
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case OptimizationrulePackage.OPTIMIZATION_RULE___APPLY:
				apply();
				return null;
		}
		return super.eInvoke(operationID, arguments);
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
		result.append(" (grammarRule: ");
		result.append(grammarRule);
		result.append(", attrName: ");
		result.append(attrName);
		result.append(')');
		return result.toString();
	}

} //OptimizationRuleImpl
