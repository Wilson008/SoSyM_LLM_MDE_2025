/**
 */
package org.bumble.xtext.grammaroptimizer.optimizationrule;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Scope Key</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.bumble.xtext.grammaroptimizer.optimizationrule.OptimizationrulePackage#getScopeKey()
 * @model
 * @generated
 */
public enum ScopeKey implements Enumerator {
	/**
	 * The '<em><b>Singlekeword</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SINGLEKEWORD_VALUE
	 * @generated
	 * @ordered
	 */
	SINGLEKEWORD(0, "singlekeword", "singlekeword"), /**
	 * The '<em><b>Singleline</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SINGLELINE_VALUE
	 * @generated
	 * @ordered
	 */
	SINGLELINE(1, "singleline", "singleline"),

	/**
	 * The '<em><b>Multilines</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MULTILINES_VALUE
	 * @generated
	 * @ordered
	 */
	MULTILINES(2, "multilines", "multilines");

	/**
	 * The '<em><b>Singlekeword</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SINGLEKEWORD
	 * @model name="singlekeword"
	 * @generated
	 * @ordered
	 */
	public static final int SINGLEKEWORD_VALUE = 0;

	/**
	 * The '<em><b>Singleline</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SINGLELINE
	 * @model name="singleline"
	 * @generated
	 * @ordered
	 */
	public static final int SINGLELINE_VALUE = 1;

	/**
	 * The '<em><b>Multilines</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MULTILINES
	 * @model name="multilines"
	 * @generated
	 * @ordered
	 */
	public static final int MULTILINES_VALUE = 2;

	/**
	 * An array of all the '<em><b>Scope Key</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final ScopeKey[] VALUES_ARRAY =
		new ScopeKey[] {
			SINGLEKEWORD,
			SINGLELINE,
			MULTILINES,
		};

	/**
	 * A public read-only list of all the '<em><b>Scope Key</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<ScopeKey> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Scope Key</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ScopeKey get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ScopeKey result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Scope Key</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ScopeKey getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ScopeKey result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Scope Key</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ScopeKey get(int value) {
		switch (value) {
			case SINGLEKEWORD_VALUE: return SINGLEKEWORD;
			case SINGLELINE_VALUE: return SINGLELINE;
			case MULTILINES_VALUE: return MULTILINES;
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final int value;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String name;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String literal;

	/**
	 * Only this class can construct instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private ScopeKey(int value, String name, String literal) {
		this.value = value;
		this.name = name;
		this.literal = literal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getValue() {
	  return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
	  return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLiteral() {
	  return literal;
	}

	/**
	 * Returns the literal value of the enumerator, which is its string representation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		return literal;
	}
	
} //ScopeKey
