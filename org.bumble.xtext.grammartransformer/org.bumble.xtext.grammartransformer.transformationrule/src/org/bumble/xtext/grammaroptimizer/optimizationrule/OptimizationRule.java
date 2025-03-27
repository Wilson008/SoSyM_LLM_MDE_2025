/**
 */
package org.bumble.xtext.grammaroptimizer.optimizationrule;

import org.bumble.xtext.grammaroptimizer.grammarrule.Grammar;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Optimization Rule</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.bumble.xtext.grammaroptimizer.optimizationrule.OptimizationRule#getGrammar <em>Grammar</em>}</li>
 *   <li>{@link org.bumble.xtext.grammaroptimizer.optimizationrule.OptimizationRule#getGrammarRule <em>Grammar Rule</em>}</li>
 *   <li>{@link org.bumble.xtext.grammaroptimizer.optimizationrule.OptimizationRule#getAttrName <em>Attr Name</em>}</li>
 * </ul>
 *
 * @see org.bumble.xtext.grammaroptimizer.optimizationrule.OptimizationrulePackage#getOptimizationRule()
 * @model abstract="true"
 * @generated
 */
public interface OptimizationRule extends EObject {
	/**
	 * Returns the value of the '<em><b>Grammar</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Grammar</em>' reference.
	 * @see #setGrammar(Grammar)
	 * @see org.bumble.xtext.grammaroptimizer.optimizationrule.OptimizationrulePackage#getOptimizationRule_Grammar()
	 * @model
	 * @generated
	 */
	Grammar getGrammar();

	/**
	 * Sets the value of the '{@link org.bumble.xtext.grammaroptimizer.optimizationrule.OptimizationRule#getGrammar <em>Grammar</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Grammar</em>' reference.
	 * @see #getGrammar()
	 * @generated
	 */
	void setGrammar(Grammar value);

	/**
	 * Returns the value of the '<em><b>Grammar Rule</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Grammar Rule</em>' attribute.
	 * @see #setGrammarRule(String)
	 * @see org.bumble.xtext.grammaroptimizer.optimizationrule.OptimizationrulePackage#getOptimizationRule_GrammarRule()
	 * @model
	 * @generated
	 */
	String getGrammarRule();

	/**
	 * Sets the value of the '{@link org.bumble.xtext.grammaroptimizer.optimizationrule.OptimizationRule#getGrammarRule <em>Grammar Rule</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Grammar Rule</em>' attribute.
	 * @see #getGrammarRule()
	 * @generated
	 */
	void setGrammarRule(String value);

	/**
	 * Returns the value of the '<em><b>Attr Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Attr Name</em>' attribute.
	 * @see #setAttrName(String)
	 * @see org.bumble.xtext.grammaroptimizer.optimizationrule.OptimizationrulePackage#getOptimizationRule_AttrName()
	 * @model
	 * @generated
	 */
	String getAttrName();

	/**
	 * Sets the value of the '{@link org.bumble.xtext.grammaroptimizer.optimizationrule.OptimizationRule#getAttrName <em>Attr Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Attr Name</em>' attribute.
	 * @see #getAttrName()
	 * @generated
	 */
	void setAttrName(String value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void apply();

} // OptimizationRule
