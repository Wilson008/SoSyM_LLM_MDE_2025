/**
 */
package org.bumble.xtext.grammaroptimizer.optimizationrule;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Add Symbol To Attr</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.bumble.xtext.grammaroptimizer.optimizationrule.AddSymbolToAttr#getNewSymbol <em>New Symbol</em>}</li>
 *   <li>{@link org.bumble.xtext.grammaroptimizer.optimizationrule.AddSymbolToAttr#getIgnoredAttributes <em>Ignored Attributes</em>}</li>
 *   <li>{@link org.bumble.xtext.grammaroptimizer.optimizationrule.AddSymbolToAttr#isIsHead <em>Is Head</em>}</li>
 *   <li>{@link org.bumble.xtext.grammaroptimizer.optimizationrule.AddSymbolToAttr#isOnlyCommonRule <em>Only Common Rule</em>}</li>
 *   <li>{@link org.bumble.xtext.grammaroptimizer.optimizationrule.AddSymbolToAttr#isOnlyUpperBoundOne <em>Only Upper Bound One</em>}</li>
 * </ul>
 *
 * @see org.bumble.xtext.grammaroptimizer.optimizationrule.OptimizationrulePackage#getAddSymbolToAttr()
 * @model
 * @generated
 */
public interface AddSymbolToAttr extends OptimizationRule {
	/**
	 * Returns the value of the '<em><b>New Symbol</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>New Symbol</em>' attribute.
	 * @see #setNewSymbol(String)
	 * @see org.bumble.xtext.grammaroptimizer.optimizationrule.OptimizationrulePackage#getAddSymbolToAttr_NewSymbol()
	 * @model
	 * @generated
	 */
	String getNewSymbol();

	/**
	 * Sets the value of the '{@link org.bumble.xtext.grammaroptimizer.optimizationrule.AddSymbolToAttr#getNewSymbol <em>New Symbol</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>New Symbol</em>' attribute.
	 * @see #getNewSymbol()
	 * @generated
	 */
	void setNewSymbol(String value);

	/**
	 * Returns the value of the '<em><b>Ignored Attributes</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ignored Attributes</em>' attribute list.
	 * @see org.bumble.xtext.grammaroptimizer.optimizationrule.OptimizationrulePackage#getAddSymbolToAttr_IgnoredAttributes()
	 * @model
	 * @generated
	 */
	EList<String> getIgnoredAttributes();

	/**
	 * Returns the value of the '<em><b>Is Head</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Head</em>' attribute.
	 * @see #setIsHead(boolean)
	 * @see org.bumble.xtext.grammaroptimizer.optimizationrule.OptimizationrulePackage#getAddSymbolToAttr_IsHead()
	 * @model
	 * @generated
	 */
	boolean isIsHead();

	/**
	 * Sets the value of the '{@link org.bumble.xtext.grammaroptimizer.optimizationrule.AddSymbolToAttr#isIsHead <em>Is Head</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Head</em>' attribute.
	 * @see #isIsHead()
	 * @generated
	 */
	void setIsHead(boolean value);
	
	/**
	 * Returns the value of the '<em><b>Only Common Rule</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Only Common Rule</em>' attribute.
	 * @see #setOnlyCommonRule(boolean)
	 * @see org.bumble.xtext.grammaroptimizer.optimizationrule.OptimizationrulePackage#getAddSymbolToAttr_OnlyCommonRule()
	 * @model
	 * @generated
	 */
	boolean isOnlyCommonRule();

	/**
	 * Sets the value of the '{@link org.bumble.xtext.grammaroptimizer.optimizationrule.AddSymbolToAttr#isOnlyCommonRule <em>Only Common Rule</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Only Common Rule</em>' attribute.
	 * @see #isOnlyCommonRule()
	 * @generated
	 */
	void setOnlyCommonRule(boolean value);

	/**
	 * Returns the value of the '<em><b>Only Upper Bound One</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Only Upper Bound One</em>' attribute.
	 * @see #setOnlyUpperBoundOne(boolean)
	 * @see org.bumble.xtext.grammaroptimizer.optimizationrule.OptimizationrulePackage#getAddSymbolToAttr_OnlyUpperBoundOne()
	 * @model
	 * @generated
	 */
	boolean isOnlyUpperBoundOne();

	/**
	 * Sets the value of the '{@link org.bumble.xtext.grammaroptimizer.optimizationrule.AddSymbolToAttr#isOnlyUpperBoundOne <em>Only Upper Bound One</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Only Upper Bound One</em>' attribute.
	 * @see #isOnlyUpperBoundOne()
	 * @generated
	 */
	void setOnlyUpperBoundOne(boolean value);

} // AddSymbolToAttr
