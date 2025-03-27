/**
 */
package org.bumble.xtext.grammaroptimizer.optimizationrule;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Package Attributes</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.bumble.xtext.grammaroptimizer.optimizationrule.ChangeAttributeMultiplicity#getStartAttr <em>Start Attr</em>}</li>
 *   <li>{@link org.bumble.xtext.grammaroptimizer.optimizationrule.ChangeAttributeMultiplicity#getEndAttr <em>End Attr</em>}</li>
 *   <li>{@link org.bumble.xtext.grammaroptimizer.optimizationrule.ChangeAttributeMultiplicity#getMultiplicity <em>Multiplicity</em>}</li>
 * </ul>
 *
 * @see org.bumble.xtext.grammaroptimizer.optimizationrule.OptimizationrulePackage#getChangeAttributeMultiplicity()
 * @model
 * @generated
 */
public interface ChangeAttributeMultiplicity extends OptimizationRule {
	/**
	 * Returns the value of the '<em><b>Start Attr</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Start Attr</em>' attribute.
	 * @see #setStartAttr(String)
	 * @see org.bumble.xtext.grammaroptimizer.optimizationrule.OptimizationrulePackage#getChangeAttributeMultiplicity_StartAttr()
	 * @model
	 * @generated
	 */
	String getStartAttr();

	/**
	 * Sets the value of the '{@link org.bumble.xtext.grammaroptimizer.optimizationrule.ChangeAttributeMultiplicity#getStartAttr <em>Start Attr</em>}' attribute.
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
	 * @see org.bumble.xtext.grammaroptimizer.optimizationrule.OptimizationrulePackage#getChangeAttributeMultiplicity_EndAttr()
	 * @model
	 * @generated
	 */
	String getEndAttr();

	/**
	 * Sets the value of the '{@link org.bumble.xtext.grammaroptimizer.optimizationrule.ChangeAttributeMultiplicity#getEndAttr <em>End Attr</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>End Attr</em>' attribute.
	 * @see #getEndAttr()
	 * @generated
	 */
	void setEndAttr(String value);

	/**
	 * Returns the value of the '<em><b>Multiplicity</b></em>' attribute.
	 * The literals are from the enumeration {@link org.bumble.xtext.grammaroptimizer.optimizationrule.MultiplicityKey}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Multiplicity</em>' attribute.
	 * @see org.bumble.xtext.grammaroptimizer.optimizationrule.MultiplicityKey
	 * @see #setMultiplicity(MultiplicityKey)
	 * @see org.bumble.xtext.grammaroptimizer.optimizationrule.OptimizationrulePackage#getChangeAttributeMultiplicity_Multiplicity()
	 * @model
	 * @generated
	 */
	MultiplicityKey getMultiplicity();

	/**
	 * Sets the value of the '{@link org.bumble.xtext.grammaroptimizer.optimizationrule.ChangeAttributeMultiplicity#getMultiplicity <em>Multiplicity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Multiplicity</em>' attribute.
	 * @see org.bumble.xtext.grammaroptimizer.optimizationrule.MultiplicityKey
	 * @see #getMultiplicity()
	 * @generated
	 */
	void setMultiplicity(MultiplicityKey value);

} // PackageAttributes
