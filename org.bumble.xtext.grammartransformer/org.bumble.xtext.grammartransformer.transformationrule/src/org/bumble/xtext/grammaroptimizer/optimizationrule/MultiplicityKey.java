/**
 */
package org.bumble.xtext.grammaroptimizer.optimizationrule;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Package Key</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.bumble.xtext.grammaroptimizer.optimizationrule.OptimizationrulePackage#getMultiplicityKey()
 * @model
 * @generated
 */
public enum MultiplicityKey implements Enumerator {
	/**
	 * The '<em><b>Package Only</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PACKAGE_ONLY_VALUE
	 * @generated
	 * @ordered
	 */
	PACKAGE_ONLY(0, "PackageOnly", "PackageOnly"),

	/**
	 * The '<em><b>Multiplicity Optional</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MULTIPLICITY_OPTIONAL_VALUE
	 * @generated
	 * @ordered
	 */
	MULTIPLICITY_OPTIONAL(1, "MultiplicityOptional", "MultiplicityOptional"), /**
	 * The '<em><b>Multiplicity Zero Or More</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MULTIPLICITY_ZERO_OR_MORE_VALUE
	 * @generated
	 * @ordered
	 */
	MULTIPLICITY_ZERO_OR_MORE(2, "MultiplicityZeroOrMore", "MultiplicityZeroOrMore"), /**
	 * The '<em><b>Multiplicity One Or More</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MULTIPLICITY_ONE_OR_MORE_VALUE
	 * @generated
	 * @ordered
	 */
	MULTIPLICITY_ONE_OR_MORE(3, "MultiplicityOneOrMore", "MultiplicityOneOrMore");

	/**
	 * The '<em><b>Package Only</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PACKAGE_ONLY
	 * @model name="PackageOnly"
	 * @generated
	 * @ordered
	 */
	public static final int PACKAGE_ONLY_VALUE = 0;

	/**
	 * The '<em><b>Multiplicity Optional</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MULTIPLICITY_OPTIONAL
	 * @model name="MultiplicityOptional"
	 * @generated
	 * @ordered
	 */
	public static final int MULTIPLICITY_OPTIONAL_VALUE = 1;

	/**
	 * The '<em><b>Multiplicity Zero Or More</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MULTIPLICITY_ZERO_OR_MORE
	 * @model name="MultiplicityZeroOrMore"
	 * @generated
	 * @ordered
	 */
	public static final int MULTIPLICITY_ZERO_OR_MORE_VALUE = 2;

	/**
	 * The '<em><b>Multiplicity One Or More</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MULTIPLICITY_ONE_OR_MORE
	 * @model name="MultiplicityOneOrMore"
	 * @generated
	 * @ordered
	 */
	public static final int MULTIPLICITY_ONE_OR_MORE_VALUE = 3;

	/**
	 * An array of all the '<em><b>Multiplicity Key</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final MultiplicityKey[] VALUES_ARRAY =
		new MultiplicityKey[] {
			PACKAGE_ONLY,
			MULTIPLICITY_OPTIONAL,
			MULTIPLICITY_ZERO_OR_MORE,
			MULTIPLICITY_ONE_OR_MORE,
		};

	/**
	 * A public read-only list of all the '<em><b>Multiplicity Key</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<MultiplicityKey> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Multiplicity Key</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static MultiplicityKey get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			MultiplicityKey result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Multiplicity Key</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static MultiplicityKey getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			MultiplicityKey result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Multiplicity Key</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static MultiplicityKey get(int value) {
		switch (value) {
			case PACKAGE_ONLY_VALUE: return PACKAGE_ONLY;
			case MULTIPLICITY_OPTIONAL_VALUE: return MULTIPLICITY_OPTIONAL;
			case MULTIPLICITY_ZERO_OR_MORE_VALUE: return MULTIPLICITY_ZERO_OR_MORE;
			case MULTIPLICITY_ONE_OR_MORE_VALUE: return MULTIPLICITY_ONE_OR_MORE;
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
	private MultiplicityKey(int value, String name, String literal) {
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
	
} //PackageKey
