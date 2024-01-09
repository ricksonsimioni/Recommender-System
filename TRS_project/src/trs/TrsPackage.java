/**
 */
package trs;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see trs.TrsFactory
 * @model kind="package"
 * @generated
 */
public interface TrsPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "trs";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "https://org.trs";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "org.trs";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	TrsPackage eINSTANCE = trs.impl.TrsPackageImpl.init();

	/**
	 * The meta object id for the '{@link trs.impl.AlgorithmImpl <em>Algorithm</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see trs.impl.AlgorithmImpl
	 * @see trs.impl.TrsPackageImpl#getAlgorithm()
	 * @generated
	 */
	int ALGORITHM = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALGORITHM__NAME = 0;

	/**
	 * The number of structural features of the '<em>Algorithm</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALGORITHM_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Algorithm</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALGORITHM_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link trs.impl.CollaborativeFilteringImpl <em>Collaborative Filtering</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see trs.impl.CollaborativeFilteringImpl
	 * @see trs.impl.TrsPackageImpl#getCollaborativeFiltering()
	 * @generated
	 */
	int COLLABORATIVE_FILTERING = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLABORATIVE_FILTERING__NAME = ALGORITHM__NAME;

	/**
	 * The feature id for the '<em><b>Is User Based</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLABORATIVE_FILTERING__IS_USER_BASED = ALGORITHM_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Neighbors</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLABORATIVE_FILTERING__NEIGHBORS = ALGORITHM_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Collaborative Filtering</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLABORATIVE_FILTERING_FEATURE_COUNT = ALGORITHM_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Collaborative Filtering</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLLABORATIVE_FILTERING_OPERATION_COUNT = ALGORITHM_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link trs.impl.ContentBasedImpl <em>Content Based</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see trs.impl.ContentBasedImpl
	 * @see trs.impl.TrsPackageImpl#getContentBased()
	 * @generated
	 */
	int CONTENT_BASED = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENT_BASED__NAME = ALGORITHM__NAME;

	/**
	 * The number of structural features of the '<em>Content Based</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENT_BASED_FEATURE_COUNT = ALGORITHM_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Content Based</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENT_BASED_OPERATION_COUNT = ALGORITHM_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link trs.impl.ContextAwareImpl <em>Context Aware</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see trs.impl.ContextAwareImpl
	 * @see trs.impl.TrsPackageImpl#getContextAware()
	 * @generated
	 */
	int CONTEXT_AWARE = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTEXT_AWARE__NAME = ALGORITHM__NAME;

	/**
	 * The number of structural features of the '<em>Context Aware</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTEXT_AWARE_FEATURE_COUNT = ALGORITHM_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Context Aware</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTEXT_AWARE_OPERATION_COUNT = ALGORITHM_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link trs.impl.KnowledgeBasedImpl <em>Knowledge Based</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see trs.impl.KnowledgeBasedImpl
	 * @see trs.impl.TrsPackageImpl#getKnowledgeBased()
	 * @generated
	 */
	int KNOWLEDGE_BASED = 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KNOWLEDGE_BASED__NAME = ALGORITHM__NAME;

	/**
	 * The number of structural features of the '<em>Knowledge Based</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KNOWLEDGE_BASED_FEATURE_COUNT = ALGORITHM_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Knowledge Based</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KNOWLEDGE_BASED_OPERATION_COUNT = ALGORITHM_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link trs.impl.SocialBasedImpl <em>Social Based</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see trs.impl.SocialBasedImpl
	 * @see trs.impl.TrsPackageImpl#getSocialBased()
	 * @generated
	 */
	int SOCIAL_BASED = 5;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOCIAL_BASED__NAME = ALGORITHM__NAME;

	/**
	 * The number of structural features of the '<em>Social Based</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOCIAL_BASED_FEATURE_COUNT = ALGORITHM_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Social Based</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOCIAL_BASED_OPERATION_COUNT = ALGORITHM_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link trs.impl.DemographicBasedImpl <em>Demographic Based</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see trs.impl.DemographicBasedImpl
	 * @see trs.impl.TrsPackageImpl#getDemographicBased()
	 * @generated
	 */
	int DEMOGRAPHIC_BASED = 6;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEMOGRAPHIC_BASED__NAME = ALGORITHM__NAME;

	/**
	 * The number of structural features of the '<em>Demographic Based</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEMOGRAPHIC_BASED_FEATURE_COUNT = ALGORITHM_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Demographic Based</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEMOGRAPHIC_BASED_OPERATION_COUNT = ALGORITHM_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link trs.impl.HybridBasedImpl <em>Hybrid Based</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see trs.impl.HybridBasedImpl
	 * @see trs.impl.TrsPackageImpl#getHybridBased()
	 * @generated
	 */
	int HYBRID_BASED = 7;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HYBRID_BASED__NAME = ALGORITHM__NAME;

	/**
	 * The number of structural features of the '<em>Hybrid Based</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HYBRID_BASED_FEATURE_COUNT = ALGORITHM_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Hybrid Based</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HYBRID_BASED_OPERATION_COUNT = ALGORITHM_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link trs.impl.TourismRSImpl <em>Tourism RS</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see trs.impl.TourismRSImpl
	 * @see trs.impl.TrsPackageImpl#getTourismRS()
	 * @generated
	 */
	int TOURISM_RS = 8;

	/**
	 * The feature id for the '<em><b>Algorithm</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOURISM_RS__ALGORITHM = 0;

	/**
	 * The feature id for the '<em><b>Preprocessing</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOURISM_RS__PREPROCESSING = 1;

	/**
	 * The feature id for the '<em><b>Item</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOURISM_RS__ITEM = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOURISM_RS__NAME = 3;

	/**
	 * The feature id for the '<em><b>Data</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOURISM_RS__DATA = 4;

	/**
	 * The number of structural features of the '<em>Tourism RS</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOURISM_RS_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>Tourism RS</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOURISM_RS_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link trs.impl.RecommendationItemImpl <em>Recommendation Item</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see trs.impl.RecommendationItemImpl
	 * @see trs.impl.TrsPackageImpl#getRecommendationItem()
	 * @generated
	 */
	int RECOMMENDATION_ITEM = 9;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECOMMENDATION_ITEM__NAME = 0;

	/**
	 * The number of structural features of the '<em>Recommendation Item</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECOMMENDATION_ITEM_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Recommendation Item</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECOMMENDATION_ITEM_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link trs.impl.POIImpl <em>POI</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see trs.impl.POIImpl
	 * @see trs.impl.TrsPackageImpl#getPOI()
	 * @generated
	 */
	int POI = 10;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POI__NAME = RECOMMENDATION_ITEM__NAME;

	/**
	 * The number of structural features of the '<em>POI</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POI_FEATURE_COUNT = RECOMMENDATION_ITEM_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>POI</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POI_OPERATION_COUNT = RECOMMENDATION_ITEM_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link trs.impl.ItineraryImpl <em>Itinerary</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see trs.impl.ItineraryImpl
	 * @see trs.impl.TrsPackageImpl#getItinerary()
	 * @generated
	 */
	int ITINERARY = 11;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITINERARY__NAME = RECOMMENDATION_ITEM__NAME;

	/**
	 * The number of structural features of the '<em>Itinerary</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITINERARY_FEATURE_COUNT = RECOMMENDATION_ITEM_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Itinerary</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITINERARY_OPERATION_COUNT = RECOMMENDATION_ITEM_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link trs.DataPreprocessingType <em>Data Preprocessing Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see trs.DataPreprocessingType
	 * @see trs.impl.TrsPackageImpl#getDataPreprocessingType()
	 * @generated
	 */
	int DATA_PREPROCESSING_TYPE = 12;

	/**
	 * The meta object id for the '{@link trs.DataRepresentation <em>Data Representation</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see trs.DataRepresentation
	 * @see trs.impl.TrsPackageImpl#getDataRepresentation()
	 * @generated
	 */
	int DATA_REPRESENTATION = 13;


	/**
	 * Returns the meta object for class '{@link trs.Algorithm <em>Algorithm</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Algorithm</em>'.
	 * @see trs.Algorithm
	 * @generated
	 */
	EClass getAlgorithm();

	/**
	 * Returns the meta object for the attribute '{@link trs.Algorithm#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see trs.Algorithm#getName()
	 * @see #getAlgorithm()
	 * @generated
	 */
	EAttribute getAlgorithm_Name();

	/**
	 * Returns the meta object for class '{@link trs.CollaborativeFiltering <em>Collaborative Filtering</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Collaborative Filtering</em>'.
	 * @see trs.CollaborativeFiltering
	 * @generated
	 */
	EClass getCollaborativeFiltering();

	/**
	 * Returns the meta object for the attribute '{@link trs.CollaborativeFiltering#isIsUserBased <em>Is User Based</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is User Based</em>'.
	 * @see trs.CollaborativeFiltering#isIsUserBased()
	 * @see #getCollaborativeFiltering()
	 * @generated
	 */
	EAttribute getCollaborativeFiltering_IsUserBased();

	/**
	 * Returns the meta object for the attribute '{@link trs.CollaborativeFiltering#getNeighbors <em>Neighbors</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Neighbors</em>'.
	 * @see trs.CollaborativeFiltering#getNeighbors()
	 * @see #getCollaborativeFiltering()
	 * @generated
	 */
	EAttribute getCollaborativeFiltering_Neighbors();

	/**
	 * Returns the meta object for class '{@link trs.ContentBased <em>Content Based</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Content Based</em>'.
	 * @see trs.ContentBased
	 * @generated
	 */
	EClass getContentBased();

	/**
	 * Returns the meta object for class '{@link trs.ContextAware <em>Context Aware</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Context Aware</em>'.
	 * @see trs.ContextAware
	 * @generated
	 */
	EClass getContextAware();

	/**
	 * Returns the meta object for class '{@link trs.KnowledgeBased <em>Knowledge Based</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Knowledge Based</em>'.
	 * @see trs.KnowledgeBased
	 * @generated
	 */
	EClass getKnowledgeBased();

	/**
	 * Returns the meta object for class '{@link trs.SocialBased <em>Social Based</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Social Based</em>'.
	 * @see trs.SocialBased
	 * @generated
	 */
	EClass getSocialBased();

	/**
	 * Returns the meta object for class '{@link trs.DemographicBased <em>Demographic Based</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Demographic Based</em>'.
	 * @see trs.DemographicBased
	 * @generated
	 */
	EClass getDemographicBased();

	/**
	 * Returns the meta object for class '{@link trs.HybridBased <em>Hybrid Based</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Hybrid Based</em>'.
	 * @see trs.HybridBased
	 * @generated
	 */
	EClass getHybridBased();

	/**
	 * Returns the meta object for class '{@link trs.TourismRS <em>Tourism RS</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Tourism RS</em>'.
	 * @see trs.TourismRS
	 * @generated
	 */
	EClass getTourismRS();

	/**
	 * Returns the meta object for the containment reference '{@link trs.TourismRS#getAlgorithm <em>Algorithm</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Algorithm</em>'.
	 * @see trs.TourismRS#getAlgorithm()
	 * @see #getTourismRS()
	 * @generated
	 */
	EReference getTourismRS_Algorithm();

	/**
	 * Returns the meta object for the attribute list '{@link trs.TourismRS#getPreprocessing <em>Preprocessing</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Preprocessing</em>'.
	 * @see trs.TourismRS#getPreprocessing()
	 * @see #getTourismRS()
	 * @generated
	 */
	EAttribute getTourismRS_Preprocessing();

	/**
	 * Returns the meta object for the containment reference list '{@link trs.TourismRS#getItem <em>Item</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Item</em>'.
	 * @see trs.TourismRS#getItem()
	 * @see #getTourismRS()
	 * @generated
	 */
	EReference getTourismRS_Item();

	/**
	 * Returns the meta object for the attribute '{@link trs.TourismRS#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see trs.TourismRS#getName()
	 * @see #getTourismRS()
	 * @generated
	 */
	EAttribute getTourismRS_Name();

	/**
	 * Returns the meta object for the attribute '{@link trs.TourismRS#getData <em>Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Data</em>'.
	 * @see trs.TourismRS#getData()
	 * @see #getTourismRS()
	 * @generated
	 */
	EAttribute getTourismRS_Data();

	/**
	 * Returns the meta object for class '{@link trs.RecommendationItem <em>Recommendation Item</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Recommendation Item</em>'.
	 * @see trs.RecommendationItem
	 * @generated
	 */
	EClass getRecommendationItem();

	/**
	 * Returns the meta object for the attribute '{@link trs.RecommendationItem#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see trs.RecommendationItem#getName()
	 * @see #getRecommendationItem()
	 * @generated
	 */
	EAttribute getRecommendationItem_Name();

	/**
	 * Returns the meta object for class '{@link trs.POI <em>POI</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>POI</em>'.
	 * @see trs.POI
	 * @generated
	 */
	EClass getPOI();

	/**
	 * Returns the meta object for class '{@link trs.Itinerary <em>Itinerary</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Itinerary</em>'.
	 * @see trs.Itinerary
	 * @generated
	 */
	EClass getItinerary();

	/**
	 * Returns the meta object for enum '{@link trs.DataPreprocessingType <em>Data Preprocessing Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Data Preprocessing Type</em>'.
	 * @see trs.DataPreprocessingType
	 * @generated
	 */
	EEnum getDataPreprocessingType();

	/**
	 * Returns the meta object for enum '{@link trs.DataRepresentation <em>Data Representation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Data Representation</em>'.
	 * @see trs.DataRepresentation
	 * @generated
	 */
	EEnum getDataRepresentation();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	TrsFactory getTrsFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link trs.impl.AlgorithmImpl <em>Algorithm</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see trs.impl.AlgorithmImpl
		 * @see trs.impl.TrsPackageImpl#getAlgorithm()
		 * @generated
		 */
		EClass ALGORITHM = eINSTANCE.getAlgorithm();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ALGORITHM__NAME = eINSTANCE.getAlgorithm_Name();

		/**
		 * The meta object literal for the '{@link trs.impl.CollaborativeFilteringImpl <em>Collaborative Filtering</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see trs.impl.CollaborativeFilteringImpl
		 * @see trs.impl.TrsPackageImpl#getCollaborativeFiltering()
		 * @generated
		 */
		EClass COLLABORATIVE_FILTERING = eINSTANCE.getCollaborativeFiltering();

		/**
		 * The meta object literal for the '<em><b>Is User Based</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COLLABORATIVE_FILTERING__IS_USER_BASED = eINSTANCE.getCollaborativeFiltering_IsUserBased();

		/**
		 * The meta object literal for the '<em><b>Neighbors</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COLLABORATIVE_FILTERING__NEIGHBORS = eINSTANCE.getCollaborativeFiltering_Neighbors();

		/**
		 * The meta object literal for the '{@link trs.impl.ContentBasedImpl <em>Content Based</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see trs.impl.ContentBasedImpl
		 * @see trs.impl.TrsPackageImpl#getContentBased()
		 * @generated
		 */
		EClass CONTENT_BASED = eINSTANCE.getContentBased();

		/**
		 * The meta object literal for the '{@link trs.impl.ContextAwareImpl <em>Context Aware</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see trs.impl.ContextAwareImpl
		 * @see trs.impl.TrsPackageImpl#getContextAware()
		 * @generated
		 */
		EClass CONTEXT_AWARE = eINSTANCE.getContextAware();

		/**
		 * The meta object literal for the '{@link trs.impl.KnowledgeBasedImpl <em>Knowledge Based</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see trs.impl.KnowledgeBasedImpl
		 * @see trs.impl.TrsPackageImpl#getKnowledgeBased()
		 * @generated
		 */
		EClass KNOWLEDGE_BASED = eINSTANCE.getKnowledgeBased();

		/**
		 * The meta object literal for the '{@link trs.impl.SocialBasedImpl <em>Social Based</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see trs.impl.SocialBasedImpl
		 * @see trs.impl.TrsPackageImpl#getSocialBased()
		 * @generated
		 */
		EClass SOCIAL_BASED = eINSTANCE.getSocialBased();

		/**
		 * The meta object literal for the '{@link trs.impl.DemographicBasedImpl <em>Demographic Based</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see trs.impl.DemographicBasedImpl
		 * @see trs.impl.TrsPackageImpl#getDemographicBased()
		 * @generated
		 */
		EClass DEMOGRAPHIC_BASED = eINSTANCE.getDemographicBased();

		/**
		 * The meta object literal for the '{@link trs.impl.HybridBasedImpl <em>Hybrid Based</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see trs.impl.HybridBasedImpl
		 * @see trs.impl.TrsPackageImpl#getHybridBased()
		 * @generated
		 */
		EClass HYBRID_BASED = eINSTANCE.getHybridBased();

		/**
		 * The meta object literal for the '{@link trs.impl.TourismRSImpl <em>Tourism RS</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see trs.impl.TourismRSImpl
		 * @see trs.impl.TrsPackageImpl#getTourismRS()
		 * @generated
		 */
		EClass TOURISM_RS = eINSTANCE.getTourismRS();

		/**
		 * The meta object literal for the '<em><b>Algorithm</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TOURISM_RS__ALGORITHM = eINSTANCE.getTourismRS_Algorithm();

		/**
		 * The meta object literal for the '<em><b>Preprocessing</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TOURISM_RS__PREPROCESSING = eINSTANCE.getTourismRS_Preprocessing();

		/**
		 * The meta object literal for the '<em><b>Item</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TOURISM_RS__ITEM = eINSTANCE.getTourismRS_Item();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TOURISM_RS__NAME = eINSTANCE.getTourismRS_Name();

		/**
		 * The meta object literal for the '<em><b>Data</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TOURISM_RS__DATA = eINSTANCE.getTourismRS_Data();

		/**
		 * The meta object literal for the '{@link trs.impl.RecommendationItemImpl <em>Recommendation Item</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see trs.impl.RecommendationItemImpl
		 * @see trs.impl.TrsPackageImpl#getRecommendationItem()
		 * @generated
		 */
		EClass RECOMMENDATION_ITEM = eINSTANCE.getRecommendationItem();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RECOMMENDATION_ITEM__NAME = eINSTANCE.getRecommendationItem_Name();

		/**
		 * The meta object literal for the '{@link trs.impl.POIImpl <em>POI</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see trs.impl.POIImpl
		 * @see trs.impl.TrsPackageImpl#getPOI()
		 * @generated
		 */
		EClass POI = eINSTANCE.getPOI();

		/**
		 * The meta object literal for the '{@link trs.impl.ItineraryImpl <em>Itinerary</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see trs.impl.ItineraryImpl
		 * @see trs.impl.TrsPackageImpl#getItinerary()
		 * @generated
		 */
		EClass ITINERARY = eINSTANCE.getItinerary();

		/**
		 * The meta object literal for the '{@link trs.DataPreprocessingType <em>Data Preprocessing Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see trs.DataPreprocessingType
		 * @see trs.impl.TrsPackageImpl#getDataPreprocessingType()
		 * @generated
		 */
		EEnum DATA_PREPROCESSING_TYPE = eINSTANCE.getDataPreprocessingType();

		/**
		 * The meta object literal for the '{@link trs.DataRepresentation <em>Data Representation</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see trs.DataRepresentation
		 * @see trs.impl.TrsPackageImpl#getDataRepresentation()
		 * @generated
		 */
		EEnum DATA_REPRESENTATION = eINSTANCE.getDataRepresentation();

	}

} //TrsPackage
