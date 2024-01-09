/**
 */
package trs;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Data Representation</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see trs.TrsPackage#getDataRepresentation()
 * @model
 * @generated
 */
public enum DataRepresentation implements Enumerator {
	/**
	 * The '<em><b>CSV</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CSV_VALUE
	 * @generated
	 * @ordered
	 */
	CSV(0, "CSV", "CSV"),

	/**
	 * The '<em><b>JSON</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #JSON_VALUE
	 * @generated
	 * @ordered
	 */
	JSON(1, "JSON", "JSON"),

	/**
	 * The '<em><b>GEOJSON</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #GEOJSON_VALUE
	 * @generated
	 * @ordered
	 */
	GEOJSON(3, "GEOJSON", "GEOJSON");

	/**
	 * The '<em><b>CSV</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CSV
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int CSV_VALUE = 0;

	/**
	 * The '<em><b>JSON</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #JSON
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int JSON_VALUE = 1;

	/**
	 * The '<em><b>GEOJSON</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #GEOJSON
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int GEOJSON_VALUE = 3;

	/**
	 * An array of all the '<em><b>Data Representation</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final DataRepresentation[] VALUES_ARRAY =
		new DataRepresentation[] {
			CSV,
			JSON,
			GEOJSON,
		};

	/**
	 * A public read-only list of all the '<em><b>Data Representation</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<DataRepresentation> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Data Representation</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static DataRepresentation get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			DataRepresentation result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Data Representation</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static DataRepresentation getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			DataRepresentation result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Data Representation</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static DataRepresentation get(int value) {
		switch (value) {
			case CSV_VALUE: return CSV;
			case JSON_VALUE: return JSON;
			case GEOJSON_VALUE: return GEOJSON;
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
	private DataRepresentation(int value, String name, String literal) {
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
	
} //DataRepresentation
