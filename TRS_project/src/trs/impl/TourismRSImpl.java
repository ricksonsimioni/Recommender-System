/**
 */
package trs.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import trs.Algorithm;
import trs.DataPreprocessingType;
import trs.DataRepresentation;
import trs.RecommendationItem;
import trs.TourismRS;
import trs.TrsPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Tourism RS</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link trs.impl.TourismRSImpl#getAlgorithm <em>Algorithm</em>}</li>
 *   <li>{@link trs.impl.TourismRSImpl#getPreprocessing <em>Preprocessing</em>}</li>
 *   <li>{@link trs.impl.TourismRSImpl#getItem <em>Item</em>}</li>
 *   <li>{@link trs.impl.TourismRSImpl#getName <em>Name</em>}</li>
 *   <li>{@link trs.impl.TourismRSImpl#getData <em>Data</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TourismRSImpl extends MinimalEObjectImpl.Container implements TourismRS {
	/**
	 * The cached value of the '{@link #getAlgorithm() <em>Algorithm</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAlgorithm()
	 * @generated
	 * @ordered
	 */
	protected Algorithm algorithm;

	/**
	 * The cached value of the '{@link #getPreprocessing() <em>Preprocessing</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPreprocessing()
	 * @generated
	 * @ordered
	 */
	protected EList<DataPreprocessingType> preprocessing;

	/**
	 * The cached value of the '{@link #getItem() <em>Item</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getItem()
	 * @generated
	 * @ordered
	 */
	protected EList<RecommendationItem> item;

	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getData() <em>Data</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getData()
	 * @generated
	 * @ordered
	 */
	protected static final DataRepresentation DATA_EDEFAULT = DataRepresentation.CSV;

	/**
	 * The cached value of the '{@link #getData() <em>Data</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getData()
	 * @generated
	 * @ordered
	 */
	protected DataRepresentation data = DATA_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TourismRSImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TrsPackage.Literals.TOURISM_RS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Algorithm getAlgorithm() {
		return algorithm;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAlgorithm(Algorithm newAlgorithm, NotificationChain msgs) {
		Algorithm oldAlgorithm = algorithm;
		algorithm = newAlgorithm;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TrsPackage.TOURISM_RS__ALGORITHM, oldAlgorithm, newAlgorithm);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAlgorithm(Algorithm newAlgorithm) {
		if (newAlgorithm != algorithm) {
			NotificationChain msgs = null;
			if (algorithm != null)
				msgs = ((InternalEObject)algorithm).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TrsPackage.TOURISM_RS__ALGORITHM, null, msgs);
			if (newAlgorithm != null)
				msgs = ((InternalEObject)newAlgorithm).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - TrsPackage.TOURISM_RS__ALGORITHM, null, msgs);
			msgs = basicSetAlgorithm(newAlgorithm, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TrsPackage.TOURISM_RS__ALGORITHM, newAlgorithm, newAlgorithm));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<DataPreprocessingType> getPreprocessing() {
		if (preprocessing == null) {
			preprocessing = new EDataTypeUniqueEList<DataPreprocessingType>(DataPreprocessingType.class, this, TrsPackage.TOURISM_RS__PREPROCESSING);
		}
		return preprocessing;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<RecommendationItem> getItem() {
		if (item == null) {
			item = new EObjectContainmentEList<RecommendationItem>(RecommendationItem.class, this, TrsPackage.TOURISM_RS__ITEM);
		}
		return item;
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
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TrsPackage.TOURISM_RS__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DataRepresentation getData() {
		return data;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setData(DataRepresentation newData) {
		DataRepresentation oldData = data;
		data = newData == null ? DATA_EDEFAULT : newData;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TrsPackage.TOURISM_RS__DATA, oldData, data));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case TrsPackage.TOURISM_RS__ALGORITHM:
				return basicSetAlgorithm(null, msgs);
			case TrsPackage.TOURISM_RS__ITEM:
				return ((InternalEList<?>)getItem()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case TrsPackage.TOURISM_RS__ALGORITHM:
				return getAlgorithm();
			case TrsPackage.TOURISM_RS__PREPROCESSING:
				return getPreprocessing();
			case TrsPackage.TOURISM_RS__ITEM:
				return getItem();
			case TrsPackage.TOURISM_RS__NAME:
				return getName();
			case TrsPackage.TOURISM_RS__DATA:
				return getData();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case TrsPackage.TOURISM_RS__ALGORITHM:
				setAlgorithm((Algorithm)newValue);
				return;
			case TrsPackage.TOURISM_RS__PREPROCESSING:
				getPreprocessing().clear();
				getPreprocessing().addAll((Collection<? extends DataPreprocessingType>)newValue);
				return;
			case TrsPackage.TOURISM_RS__ITEM:
				getItem().clear();
				getItem().addAll((Collection<? extends RecommendationItem>)newValue);
				return;
			case TrsPackage.TOURISM_RS__NAME:
				setName((String)newValue);
				return;
			case TrsPackage.TOURISM_RS__DATA:
				setData((DataRepresentation)newValue);
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
			case TrsPackage.TOURISM_RS__ALGORITHM:
				setAlgorithm((Algorithm)null);
				return;
			case TrsPackage.TOURISM_RS__PREPROCESSING:
				getPreprocessing().clear();
				return;
			case TrsPackage.TOURISM_RS__ITEM:
				getItem().clear();
				return;
			case TrsPackage.TOURISM_RS__NAME:
				setName(NAME_EDEFAULT);
				return;
			case TrsPackage.TOURISM_RS__DATA:
				setData(DATA_EDEFAULT);
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
			case TrsPackage.TOURISM_RS__ALGORITHM:
				return algorithm != null;
			case TrsPackage.TOURISM_RS__PREPROCESSING:
				return preprocessing != null && !preprocessing.isEmpty();
			case TrsPackage.TOURISM_RS__ITEM:
				return item != null && !item.isEmpty();
			case TrsPackage.TOURISM_RS__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case TrsPackage.TOURISM_RS__DATA:
				return data != DATA_EDEFAULT;
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
		result.append(" (preprocessing: ");
		result.append(preprocessing);
		result.append(", name: ");
		result.append(name);
		result.append(", data: ");
		result.append(data);
		result.append(')');
		return result.toString();
	}

} //TourismRSImpl
