/**
 */
package org.bumble.xtext.grammaroptimizer.optimizationrule;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Remove Comma</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.bumble.xtext.grammaroptimizer.optimizationrule.RemoveComma#getAttributes <em>Attributes</em>}</li>
 * </ul>
 *
 * @see org.bumble.xtext.grammaroptimizer.optimizationrule.OptimizationrulePackage#getRemoveComma()
 * @model
 * @generated
 */
public interface RemoveComma extends OptimizationRule {
	/**
	 * Returns the value of the '<em><b>Attributes</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Attributes</em>' attribute list.
	 * @see org.bumble.xtext.grammaroptimizer.optimizationrule.OptimizationrulePackage#getRemoveComma_Attributes()
	 * @model
	 * @generated
	 */
	EList<String> getAttributes();

} // RemoveComma
