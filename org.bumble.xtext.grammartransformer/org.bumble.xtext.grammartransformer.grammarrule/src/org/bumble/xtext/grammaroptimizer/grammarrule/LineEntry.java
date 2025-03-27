/**
 */
package org.bumble.xtext.grammaroptimizer.grammarrule;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Line Entry</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.bumble.xtext.grammaroptimizer.grammarrule.LineEntry#getLineContent <em>Line Content</em>}</li>
 *   <li>{@link org.bumble.xtext.grammaroptimizer.grammarrule.LineEntry#getAttrName <em>Attr Name</em>}</li>
 * </ul>
 *
 * @see org.bumble.xtext.grammaroptimizer.grammarrule.GrammarrulePackage#getLineEntry()
 * @model
 * @generated
 */
public interface LineEntry extends EObject {
	/**
	 * Returns the value of the '<em><b>Line Content</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Line Content</em>' attribute.
	 * @see #setLineContent(String)
	 * @see org.bumble.xtext.grammaroptimizer.grammarrule.GrammarrulePackage#getLineEntry_LineContent()
	 * @model
	 * @generated
	 */
	String getLineContent();

	/**
	 * Sets the value of the '{@link org.bumble.xtext.grammaroptimizer.grammarrule.LineEntry#getLineContent <em>Line Content</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Line Content</em>' attribute.
	 * @see #getLineContent()
	 * @generated
	 */
	void setLineContent(String value);

	/**
	 * Returns the value of the '<em><b>Attr Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Attr Name</em>' attribute.
	 * @see #setAttrName(String)
	 * @see org.bumble.xtext.grammaroptimizer.grammarrule.GrammarrulePackage#getLineEntry_AttrName()
	 * @model
	 * @generated
	 */
	String getAttrName();

	/**
	 * Sets the value of the '{@link org.bumble.xtext.grammaroptimizer.grammarrule.LineEntry#getAttrName <em>Attr Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Attr Name</em>' attribute.
	 * @see #getAttrName()
	 * @generated
	 */
	void setAttrName(String value);

} // LineEntry
