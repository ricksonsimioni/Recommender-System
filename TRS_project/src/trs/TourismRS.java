/**
 */
package trs;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Tourism RS</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link trs.TourismRS#getAlgorithm <em>Algorithm</em>}</li>
 *   <li>{@link trs.TourismRS#getPreprocessing <em>Preprocessing</em>}</li>
 *   <li>{@link trs.TourismRS#getItem <em>Item</em>}</li>
 *   <li>{@link trs.TourismRS#getName <em>Name</em>}</li>
 *   <li>{@link trs.TourismRS#getData <em>Data</em>}</li>
 * </ul>
 *
 * @see trs.TrsPackage#getTourismRS()
 * @model
 * @generated
 */
public interface TourismRS extends EObject {
	/**
	 * Returns the value of the '<em><b>Algorithm</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Algorithm</em>' containment reference.
	 * @see #setAlgorithm(Algorithm)
	 * @see trs.TrsPackage#getTourismRS_Algorithm()
	 * @model containment="true"
	 * @generated
	 */
	Algorithm getAlgorithm();

	/**
	 * Sets the value of the '{@link trs.TourismRS#getAlgorithm <em>Algorithm</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Algorithm</em>' containment reference.
	 * @see #getAlgorithm()
	 * @generated
	 */
	void setAlgorithm(Algorithm value);

	/**
	 * Returns the value of the '<em><b>Preprocessing</b></em>' attribute list.
	 * The list contents are of type {@link trs.DataPreprocessingType}.
	 * The literals are from the enumeration {@link trs.DataPreprocessingType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Preprocessing</em>' attribute list.
	 * @see trs.DataPreprocessingType
	 * @see trs.TrsPackage#getTourismRS_Preprocessing()
	 * @model
	 * @generated
	 */
	EList<DataPreprocessingType> getPreprocessing();

	/**
	 * Returns the value of the '<em><b>Item</b></em>' containment reference list.
	 * The list contents are of type {@link trs.RecommendationItem}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Item</em>' containment reference list.
	 * @see trs.TrsPackage#getTourismRS_Item()
	 * @model containment="true"
	 * @generated
	 */
	EList<RecommendationItem> getItem();

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see trs.TrsPackage#getTourismRS_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link trs.TourismRS#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Data</b></em>' attribute.
	 * The literals are from the enumeration {@link trs.DataRepresentation}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Data</em>' attribute.
	 * @see trs.DataRepresentation
	 * @see #setData(DataRepresentation)
	 * @see trs.TrsPackage#getTourismRS_Data()
	 * @model
	 * @generated
	 */
	DataRepresentation getData();

	/**
	 * Sets the value of the '{@link trs.TourismRS#getData <em>Data</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Data</em>' attribute.
	 * @see trs.DataRepresentation
	 * @see #getData()
	 * @generated
	 */
	void setData(DataRepresentation value);

} // TourismRS
