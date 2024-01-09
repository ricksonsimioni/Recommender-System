/**
 */
package trs;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see trs.TrsPackage
 * @generated
 */
public interface TrsFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	TrsFactory eINSTANCE = trs.impl.TrsFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Collaborative Filtering</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Collaborative Filtering</em>'.
	 * @generated
	 */
	CollaborativeFiltering createCollaborativeFiltering();

	/**
	 * Returns a new object of class '<em>Content Based</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Content Based</em>'.
	 * @generated
	 */
	ContentBased createContentBased();

	/**
	 * Returns a new object of class '<em>Context Aware</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Context Aware</em>'.
	 * @generated
	 */
	ContextAware createContextAware();

	/**
	 * Returns a new object of class '<em>Knowledge Based</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Knowledge Based</em>'.
	 * @generated
	 */
	KnowledgeBased createKnowledgeBased();

	/**
	 * Returns a new object of class '<em>Social Based</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Social Based</em>'.
	 * @generated
	 */
	SocialBased createSocialBased();

	/**
	 * Returns a new object of class '<em>Demographic Based</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Demographic Based</em>'.
	 * @generated
	 */
	DemographicBased createDemographicBased();

	/**
	 * Returns a new object of class '<em>Hybrid Based</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Hybrid Based</em>'.
	 * @generated
	 */
	HybridBased createHybridBased();

	/**
	 * Returns a new object of class '<em>Tourism RS</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Tourism RS</em>'.
	 * @generated
	 */
	TourismRS createTourismRS();

	/**
	 * Returns a new object of class '<em>POI</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>POI</em>'.
	 * @generated
	 */
	POI createPOI();

	/**
	 * Returns a new object of class '<em>Itinerary</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Itinerary</em>'.
	 * @generated
	 */
	Itinerary createItinerary();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	TrsPackage getTrsPackage();

} //TrsFactory
