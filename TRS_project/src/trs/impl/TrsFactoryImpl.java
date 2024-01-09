/**
 */
package trs.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import trs.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class TrsFactoryImpl extends EFactoryImpl implements TrsFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static TrsFactory init() {
		try {
			TrsFactory theTrsFactory = (TrsFactory)EPackage.Registry.INSTANCE.getEFactory(TrsPackage.eNS_URI);
			if (theTrsFactory != null) {
				return theTrsFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new TrsFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TrsFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case TrsPackage.COLLABORATIVE_FILTERING: return createCollaborativeFiltering();
			case TrsPackage.CONTENT_BASED: return createContentBased();
			case TrsPackage.CONTEXT_AWARE: return createContextAware();
			case TrsPackage.KNOWLEDGE_BASED: return createKnowledgeBased();
			case TrsPackage.SOCIAL_BASED: return createSocialBased();
			case TrsPackage.DEMOGRAPHIC_BASED: return createDemographicBased();
			case TrsPackage.HYBRID_BASED: return createHybridBased();
			case TrsPackage.TOURISM_RS: return createTourismRS();
			case TrsPackage.POI: return createPOI();
			case TrsPackage.ITINERARY: return createItinerary();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case TrsPackage.DATA_PREPROCESSING_TYPE:
				return createDataPreprocessingTypeFromString(eDataType, initialValue);
			case TrsPackage.DATA_REPRESENTATION:
				return createDataRepresentationFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case TrsPackage.DATA_PREPROCESSING_TYPE:
				return convertDataPreprocessingTypeToString(eDataType, instanceValue);
			case TrsPackage.DATA_REPRESENTATION:
				return convertDataRepresentationToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CollaborativeFiltering createCollaborativeFiltering() {
		CollaborativeFilteringImpl collaborativeFiltering = new CollaborativeFilteringImpl();
		return collaborativeFiltering;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ContentBased createContentBased() {
		ContentBasedImpl contentBased = new ContentBasedImpl();
		return contentBased;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ContextAware createContextAware() {
		ContextAwareImpl contextAware = new ContextAwareImpl();
		return contextAware;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public KnowledgeBased createKnowledgeBased() {
		KnowledgeBasedImpl knowledgeBased = new KnowledgeBasedImpl();
		return knowledgeBased;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SocialBased createSocialBased() {
		SocialBasedImpl socialBased = new SocialBasedImpl();
		return socialBased;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DemographicBased createDemographicBased() {
		DemographicBasedImpl demographicBased = new DemographicBasedImpl();
		return demographicBased;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public HybridBased createHybridBased() {
		HybridBasedImpl hybridBased = new HybridBasedImpl();
		return hybridBased;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TourismRS createTourismRS() {
		TourismRSImpl tourismRS = new TourismRSImpl();
		return tourismRS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public POI createPOI() {
		POIImpl poi = new POIImpl();
		return poi;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Itinerary createItinerary() {
		ItineraryImpl itinerary = new ItineraryImpl();
		return itinerary;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataPreprocessingType createDataPreprocessingTypeFromString(EDataType eDataType, String initialValue) {
		DataPreprocessingType result = DataPreprocessingType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertDataPreprocessingTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataRepresentation createDataRepresentationFromString(EDataType eDataType, String initialValue) {
		DataRepresentation result = DataRepresentation.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertDataRepresentationToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TrsPackage getTrsPackage() {
		return (TrsPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static TrsPackage getPackage() {
		return TrsPackage.eINSTANCE;
	}

} //TrsFactoryImpl
