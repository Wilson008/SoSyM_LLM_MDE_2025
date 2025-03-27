/**
 */
package org.bumble.xtext.grammaroptimizer.optimizationrule;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Move Attr To After Rule Keyword</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.bumble.xtext.grammaroptimizer.optimizationrule.MoveAttrToAfterRuleKeyword#getMovedLine <em>Moved Line</em>}</li>
 * </ul>
 *
 * @see org.bumble.xtext.grammaroptimizer.optimizationrule.OptimizationrulePackage#getMoveAttrToAfterRuleKeyword()
 * @model
 * @generated
 */
public interface MoveAttrToAfterRuleKeyword extends OptimizationRule {
	/**
	 * Returns the value of the '<em><b>Moved Line</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Moved Line</em>' attribute.
	 * @see #setMovedLine(String)
	 * @see org.bumble.xtext.grammaroptimizer.optimizationrule.OptimizationrulePackage#getMoveAttrToAfterRuleKeyword_MovedLine()
	 * @model
	 * @generated
	 */
	String getMovedLine();

	/**
	 * Sets the value of the '{@link org.bumble.xtext.grammaroptimizer.optimizationrule.MoveAttrToAfterRuleKeyword#getMovedLine <em>Moved Line</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Moved Line</em>' attribute.
	 * @see #getMovedLine()
	 * @generated
	 */
	void setMovedLine(String value);

} // MoveAttrToAfterRuleKeyword
