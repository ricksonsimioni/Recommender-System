/**
 */
package trs;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Collaborative Filtering</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link trs.CollaborativeFiltering#isIsUserBased <em>Is User Based</em>}</li>
 *   <li>{@link trs.CollaborativeFiltering#getNeighbors <em>Neighbors</em>}</li>
 * </ul>
 *
 * @see trs.TrsPackage#getCollaborativeFiltering()
 * @model
 * @generated
 */
public interface CollaborativeFiltering extends Algorithm {
	/**
	 * Returns the value of the '<em><b>Is User Based</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is User Based</em>' attribute.
	 * @see #setIsUserBased(boolean)
	 * @see trs.TrsPackage#getCollaborativeFiltering_IsUserBased()
	 * @model
	 * @generated
	 */
	boolean isIsUserBased();

	/**
	 * Sets the value of the '{@link trs.CollaborativeFiltering#isIsUserBased <em>Is User Based</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is User Based</em>' attribute.
	 * @see #isIsUserBased()
	 * @generated
	 */
	void setIsUserBased(boolean value);

	/**
	 * Returns the value of the '<em><b>Neighbors</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Neighbors</em>' attribute.
	 * @see #setNeighbors(int)
	 * @see trs.TrsPackage#getCollaborativeFiltering_Neighbors()
	 * @model
	 * @generated
	 */
	int getNeighbors();

	/**
	 * Sets the value of the '{@link trs.CollaborativeFiltering#getNeighbors <em>Neighbors</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Neighbors</em>' attribute.
	 * @see #getNeighbors()
	 * @generated
	 */
	void setNeighbors(int value);

} // CollaborativeFiltering
