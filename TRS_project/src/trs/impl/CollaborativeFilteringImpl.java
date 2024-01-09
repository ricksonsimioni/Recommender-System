/**
 */
package trs.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import trs.CollaborativeFiltering;
import trs.TrsPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Collaborative Filtering</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link trs.impl.CollaborativeFilteringImpl#isIsUserBased <em>Is User Based</em>}</li>
 *   <li>{@link trs.impl.CollaborativeFilteringImpl#getNeighbors <em>Neighbors</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CollaborativeFilteringImpl extends AlgorithmImpl implements CollaborativeFiltering {
	/**
	 * The default value of the '{@link #isIsUserBased() <em>Is User Based</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsUserBased()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_USER_BASED_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIsUserBased() <em>Is User Based</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsUserBased()
	 * @generated
	 * @ordered
	 */
	protected boolean isUserBased = IS_USER_BASED_EDEFAULT;

	/**
	 * The default value of the '{@link #getNeighbors() <em>Neighbors</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNeighbors()
	 * @generated
	 * @ordered
	 */
	protected static final int NEIGHBORS_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getNeighbors() <em>Neighbors</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNeighbors()
	 * @generated
	 * @ordered
	 */
	protected int neighbors = NEIGHBORS_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CollaborativeFilteringImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TrsPackage.Literals.COLLABORATIVE_FILTERING;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isIsUserBased() {
		return isUserBased;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setIsUserBased(boolean newIsUserBased) {
		boolean oldIsUserBased = isUserBased;
		isUserBased = newIsUserBased;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TrsPackage.COLLABORATIVE_FILTERING__IS_USER_BASED, oldIsUserBased, isUserBased));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getNeighbors() {
		return neighbors;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setNeighbors(int newNeighbors) {
		int oldNeighbors = neighbors;
		neighbors = newNeighbors;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TrsPackage.COLLABORATIVE_FILTERING__NEIGHBORS, oldNeighbors, neighbors));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case TrsPackage.COLLABORATIVE_FILTERING__IS_USER_BASED:
				return isIsUserBased();
			case TrsPackage.COLLABORATIVE_FILTERING__NEIGHBORS:
				return getNeighbors();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case TrsPackage.COLLABORATIVE_FILTERING__IS_USER_BASED:
				setIsUserBased((Boolean)newValue);
				return;
			case TrsPackage.COLLABORATIVE_FILTERING__NEIGHBORS:
				setNeighbors((Integer)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case TrsPackage.COLLABORATIVE_FILTERING__IS_USER_BASED:
				setIsUserBased(IS_USER_BASED_EDEFAULT);
				return;
			case TrsPackage.COLLABORATIVE_FILTERING__NEIGHBORS:
				setNeighbors(NEIGHBORS_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case TrsPackage.COLLABORATIVE_FILTERING__IS_USER_BASED:
				return isUserBased != IS_USER_BASED_EDEFAULT;
			case TrsPackage.COLLABORATIVE_FILTERING__NEIGHBORS:
				return neighbors != NEIGHBORS_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (isUserBased: ");
		result.append(isUserBased);
		result.append(", neighbors: ");
		result.append(neighbors);
		result.append(')');
		return result.toString();
	}

} //CollaborativeFilteringImpl
