/**
 */
package trs;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Data Preprocessing Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see trs.TrsPackage#getDataPreprocessingType()
 * @model
 * @generated
 */
public enum DataPreprocessingType implements Enumerator {
	/**
	 * The '<em><b>DUPLICATE REMOVAL</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DUPLICATE_REMOVAL_VALUE
	 * @generated
	 * @ordered
	 */
	DUPLICATE_REMOVAL(0, "DUPLICATE_REMOVAL", "DUPLICATE_REMOVAL"),

	/**
	 * The '<em><b>VECTORIZATION</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #VECTORIZATION_VALUE
	 * @generated
	 * @ordered
	 */
	VECTORIZATION(1, "VECTORIZATION", "VECTORIZATION"),

	/**
	 * The '<em><b>NLP</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NLP_VALUE
	 * @generated
	 * @ordered
	 */
	NLP(2, "NLP", "NLP");

	/**
	 * The '<em><b>DUPLICATE REMOVAL</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DUPLICATE_REMOVAL
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int DUPLICATE_REMOVAL_VALUE = 0;

	/**
	 * The '<em><b>VECTORIZATION</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #VECTORIZATION
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int VECTORIZATION_VALUE = 1;

	/**
	 * The '<em><b>NLP</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NLP
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int NLP_VALUE = 2;

	/**
	 * An array of all the '<em><b>Data Preprocessing Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final DataPreprocessingType[] VALUES_ARRAY =
		new DataPreprocessingType[] {
			DUPLICATE_REMOVAL,
			VECTORIZATION,
			NLP,
		};

	/**
	 * A public read-only list of all the '<em><b>Data Preprocessing Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<DataPreprocessingType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Data Preprocessing Type</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static DataPreprocessingType get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			DataPreprocessingType result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Data Preprocessing Type</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static DataPreprocessingType getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			DataPreprocessingType result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Data Preprocessing Type</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static DataPreprocessingType get(int value) {
		switch (value) {
			case DUPLICATE_REMOVAL_VALUE: return DUPLICATE_REMOVAL;
			case VECTORIZATION_VALUE: return VECTORIZATION;
			case NLP_VALUE: return NLP;
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
	private DataPreprocessingType(int value, String name, String literal) {
		this.value = value;
		this.name = name;
		this.literal = literal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getValue() {
	  return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getName() {
	  return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
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
	
} //DataPreprocessingType
