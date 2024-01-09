/**
 */
package trs.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import trs.Algorithm;
import trs.CollaborativeFiltering;
import trs.ContentBased;
import trs.ContextAware;
import trs.DataPreprocessingType;
import trs.DataRepresentation;
import trs.DemographicBased;
import trs.HybridBased;
import trs.Itinerary;
import trs.KnowledgeBased;
import trs.RecommendationItem;
import trs.SocialBased;
import trs.TourismRS;
import trs.TrsFactory;
import trs.TrsPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class TrsPackageImpl extends EPackageImpl implements TrsPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass algorithmEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass collaborativeFilteringEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass contentBasedEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass contextAwareEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass knowledgeBasedEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass socialBasedEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass demographicBasedEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass hybridBasedEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tourismRSEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass recommendationItemEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass poiEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass itineraryEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum dataPreprocessingTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum dataRepresentationEEnum = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see trs.TrsPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private TrsPackageImpl() {
		super(eNS_URI, TrsFactory.eINSTANCE);
	}
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 *
	 * <p>This method is used to initialize {@link TrsPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static TrsPackage init() {
		if (isInited) return (TrsPackage)EPackage.Registry.INSTANCE.getEPackage(TrsPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredTrsPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		TrsPackageImpl theTrsPackage = registeredTrsPackage instanceof TrsPackageImpl ? (TrsPackageImpl)registeredTrsPackage : new TrsPackageImpl();

		isInited = true;

		// Create package meta-data objects
		theTrsPackage.createPackageContents();

		// Initialize created meta-data
		theTrsPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theTrsPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(TrsPackage.eNS_URI, theTrsPackage);
		return theTrsPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getAlgorithm() {
		return algorithmEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAlgorithm_Name() {
		return (EAttribute)algorithmEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getCollaborativeFiltering() {
		return collaborativeFilteringEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCollaborativeFiltering_IsUserBased() {
		return (EAttribute)collaborativeFilteringEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCollaborativeFiltering_Neighbors() {
		return (EAttribute)collaborativeFilteringEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getContentBased() {
		return contentBasedEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getContextAware() {
		return contextAwareEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getKnowledgeBased() {
		return knowledgeBasedEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getSocialBased() {
		return socialBasedEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDemographicBased() {
		return demographicBasedEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getHybridBased() {
		return hybridBasedEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getTourismRS() {
		return tourismRSEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTourismRS_Algorithm() {
		return (EReference)tourismRSEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTourismRS_Preprocessing() {
		return (EAttribute)tourismRSEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTourismRS_Item() {
		return (EReference)tourismRSEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTourismRS_Name() {
		return (EAttribute)tourismRSEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTourismRS_Data() {
		return (EAttribute)tourismRSEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getRecommendationItem() {
		return recommendationItemEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getRecommendationItem_Name() {
		return (EAttribute)recommendationItemEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPOI() {
		return poiEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getItinerary() {
		return itineraryEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getDataPreprocessingType() {
		return dataPreprocessingTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getDataRepresentation() {
		return dataRepresentationEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TrsFactory getTrsFactory() {
		return (TrsFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		algorithmEClass = createEClass(ALGORITHM);
		createEAttribute(algorithmEClass, ALGORITHM__NAME);

		collaborativeFilteringEClass = createEClass(COLLABORATIVE_FILTERING);
		createEAttribute(collaborativeFilteringEClass, COLLABORATIVE_FILTERING__IS_USER_BASED);
		createEAttribute(collaborativeFilteringEClass, COLLABORATIVE_FILTERING__NEIGHBORS);

		contentBasedEClass = createEClass(CONTENT_BASED);

		contextAwareEClass = createEClass(CONTEXT_AWARE);

		knowledgeBasedEClass = createEClass(KNOWLEDGE_BASED);

		socialBasedEClass = createEClass(SOCIAL_BASED);

		demographicBasedEClass = createEClass(DEMOGRAPHIC_BASED);

		hybridBasedEClass = createEClass(HYBRID_BASED);

		tourismRSEClass = createEClass(TOURISM_RS);
		createEReference(tourismRSEClass, TOURISM_RS__ALGORITHM);
		createEAttribute(tourismRSEClass, TOURISM_RS__PREPROCESSING);
		createEReference(tourismRSEClass, TOURISM_RS__ITEM);
		createEAttribute(tourismRSEClass, TOURISM_RS__NAME);
		createEAttribute(tourismRSEClass, TOURISM_RS__DATA);

		recommendationItemEClass = createEClass(RECOMMENDATION_ITEM);
		createEAttribute(recommendationItemEClass, RECOMMENDATION_ITEM__NAME);

		poiEClass = createEClass(POI);

		itineraryEClass = createEClass(ITINERARY);

		// Create enums
		dataPreprocessingTypeEEnum = createEEnum(DATA_PREPROCESSING_TYPE);
		dataRepresentationEEnum = createEEnum(DATA_REPRESENTATION);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		collaborativeFilteringEClass.getESuperTypes().add(this.getAlgorithm());
		contentBasedEClass.getESuperTypes().add(this.getAlgorithm());
		contextAwareEClass.getESuperTypes().add(this.getAlgorithm());
		knowledgeBasedEClass.getESuperTypes().add(this.getAlgorithm());
		socialBasedEClass.getESuperTypes().add(this.getAlgorithm());
		demographicBasedEClass.getESuperTypes().add(this.getAlgorithm());
		hybridBasedEClass.getESuperTypes().add(this.getAlgorithm());
		poiEClass.getESuperTypes().add(this.getRecommendationItem());
		itineraryEClass.getESuperTypes().add(this.getRecommendationItem());

		// Initialize classes, features, and operations; add parameters
		initEClass(algorithmEClass, Algorithm.class, "Algorithm", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAlgorithm_Name(), ecorePackage.getEString(), "name", null, 0, 1, Algorithm.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(collaborativeFilteringEClass, CollaborativeFiltering.class, "CollaborativeFiltering", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCollaborativeFiltering_IsUserBased(), ecorePackage.getEBoolean(), "isUserBased", null, 0, 1, CollaborativeFiltering.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCollaborativeFiltering_Neighbors(), ecorePackage.getEInt(), "neighbors", null, 0, 1, CollaborativeFiltering.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(contentBasedEClass, ContentBased.class, "ContentBased", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(contextAwareEClass, ContextAware.class, "ContextAware", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(knowledgeBasedEClass, KnowledgeBased.class, "KnowledgeBased", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(socialBasedEClass, SocialBased.class, "SocialBased", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(demographicBasedEClass, DemographicBased.class, "DemographicBased", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(hybridBasedEClass, HybridBased.class, "HybridBased", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(tourismRSEClass, TourismRS.class, "TourismRS", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTourismRS_Algorithm(), this.getAlgorithm(), null, "algorithm", null, 0, 1, TourismRS.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTourismRS_Preprocessing(), this.getDataPreprocessingType(), "preprocessing", null, 0, -1, TourismRS.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTourismRS_Item(), this.getRecommendationItem(), null, "item", null, 0, -1, TourismRS.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTourismRS_Name(), ecorePackage.getEString(), "name", null, 0, 1, TourismRS.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTourismRS_Data(), this.getDataRepresentation(), "data", null, 0, 1, TourismRS.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(recommendationItemEClass, RecommendationItem.class, "RecommendationItem", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRecommendationItem_Name(), ecorePackage.getEString(), "name", null, 0, 1, RecommendationItem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(poiEClass, trs.POI.class, "POI", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(itineraryEClass, Itinerary.class, "Itinerary", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		// Initialize enums and add enum literals
		initEEnum(dataPreprocessingTypeEEnum, DataPreprocessingType.class, "DataPreprocessingType");
		addEEnumLiteral(dataPreprocessingTypeEEnum, DataPreprocessingType.DUPLICATE_REMOVAL);
		addEEnumLiteral(dataPreprocessingTypeEEnum, DataPreprocessingType.VECTORIZATION);
		addEEnumLiteral(dataPreprocessingTypeEEnum, DataPreprocessingType.NLP);

		initEEnum(dataRepresentationEEnum, DataRepresentation.class, "DataRepresentation");
		addEEnumLiteral(dataRepresentationEEnum, DataRepresentation.CSV);
		addEEnumLiteral(dataRepresentationEEnum, DataRepresentation.JSON);
		addEEnumLiteral(dataRepresentationEEnum, DataRepresentation.GEOJSON);

		// Create resource
		createResource(eNS_URI);
	}

} //TrsPackageImpl
