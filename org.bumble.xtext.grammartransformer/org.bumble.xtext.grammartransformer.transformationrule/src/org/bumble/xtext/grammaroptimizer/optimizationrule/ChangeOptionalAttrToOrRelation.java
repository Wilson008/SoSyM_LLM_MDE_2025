/**
 */
package org.bumble.xtext.grammaroptimizer.optimizationrule;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Change Optional Attr To Or Relation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.bumble.xtext.grammaroptimizer.optimizationrule.ChangeOptionalAttrToOrRelation#isIsAll <em>Is All</em>}</li>
 *   <li>{@link org.bumble.xtext.grammaroptimizer.optimizationrule.ChangeOptionalAttrToOrRelation#getStartAttr <em>Start Attr</em>}</li>
 *   <li>{@link org.bumble.xtext.grammaroptimizer.optimizationrule.ChangeOptionalAttrToOrRelation#getEndAttr <em>End Attr</em>}</li>
 *   <li>{@link org.bumble.xtext.grammaroptimizer.optimizationrule.ChangeOptionalAttrToOrRelation#getExcludedGrammarRule <em>Excluded Grammar Rule</em>}</li>
 * </ul>
 *
 * @see org.bumble.xtext.grammaroptimizer.optimizationrule.OptimizationrulePackage#getChangeOptionalAttrToOrRelation()
 * @model
 * @generated
 */
public interface ChangeOptionalAttrToOrRelation extends OptimizationRule {
	/**
	 * Returns the value of the '<em><b>Is All</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is All</em>' attribute.
	 * @see #setIsAll(boolean)
	 * @see org.bumble.xtext.grammaroptimizer.optimizationrule.OptimizationrulePackage#getChangeOptionalAttrToOrRelation_IsAll()
	 * @model
	 * @generated
	 */
	boolean isIsAll();

	/**
	 * Sets the value of the '{@link org.bumble.xtext.grammaroptimizer.optimizationrule.ChangeOptionalAttrToOrRelation#isIsAll <em>Is All</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is All</em>' attribute.
	 * @see #isIsAll()
	 * @generated
	 */
	void setIsAll(boolean value);

	/**
	 * Returns the value of the '<em><b>Start Attr</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Start Attr</em>' attribute.
	 * @see #setStartAttr(String)
	 * @see org.bumble.xtext.grammaroptimizer.optimizationrule.OptimizationrulePackage#getChangeOptionalAttrToOrRelation_StartAttr()
	 * @model
	 * @generated
	 */
	String getStartAttr();

	/**
	 * Sets the value of the '{@link org.bumble.xtext.grammaroptimizer.optimizationrule.ChangeOptionalAttrToOrRelation#getStartAttr <em>Start Attr</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Start Attr</em>' attribute.
	 * @see #getStartAttr()
	 * @generated
	 */
	void setStartAttr(String value);

	/**
	 * Returns the value of the '<em><b>End Attr</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>End Attr</em>' attribute.
	 * @see #setEndAttr(String)
	 * @see org.bumble.xtext.grammaroptimizer.optimizationrule.OptimizationrulePackage#getChangeOptionalAttrToOrRelation_EndAttr()
	 * @model
	 * @generated
	 */
	String getEndAttr();

	/**
	 * Sets the value of the '{@link org.bumble.xtext.grammaroptimizer.optimizationrule.ChangeOptionalAttrToOrRelation#getEndAttr <em>End Attr</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>End Attr</em>' attribute.
	 * @see #getEndAttr()
	 * @generated
	 */
	void setEndAttr(String value);

	/**
	 * Returns the value of the '<em><b>Excluded Grammar Rule</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Excluded Grammar Rule</em>' attribute list.
	 * @see org.bumble.xtext.grammaroptimizer.optimizationrule.OptimizationrulePackage#getChangeOptionalAttrToOrRelation_ExcludedGrammarRule()
	 * @model
	 * @generated
	 */
	EList<String> getExcludedGrammarRule();

} // ChangeOptionalAttrToOrRelation
