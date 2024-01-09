/**
 */
package trs.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

import trs.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see trs.TrsPackage
 * @generated
 */
public class TrsAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static TrsPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TrsAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = TrsPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TrsSwitch<Adapter> modelSwitch =
		new TrsSwitch<Adapter>() {
			@Override
			public Adapter caseAlgorithm(Algorithm object) {
				return createAlgorithmAdapter();
			}
			@Override
			public Adapter caseCollaborativeFiltering(CollaborativeFiltering object) {
				return createCollaborativeFilteringAdapter();
			}
			@Override
			public Adapter caseContentBased(ContentBased object) {
				return createContentBasedAdapter();
			}
			@Override
			public Adapter caseContextAware(ContextAware object) {
				return createContextAwareAdapter();
			}
			@Override
			public Adapter caseKnowledgeBased(KnowledgeBased object) {
				return createKnowledgeBasedAdapter();
			}
			@Override
			public Adapter caseSocialBased(SocialBased object) {
				return createSocialBasedAdapter();
			}
			@Override
			public Adapter caseDemographicBased(DemographicBased object) {
				return createDemographicBasedAdapter();
			}
			@Override
			public Adapter caseHybridBased(HybridBased object) {
				return createHybridBasedAdapter();
			}
			@Override
			public Adapter caseTourismRS(TourismRS object) {
				return createTourismRSAdapter();
			}
			@Override
			public Adapter caseRecommendationItem(RecommendationItem object) {
				return createRecommendationItemAdapter();
			}
			@Override
			public Adapter casePOI(POI object) {
				return createPOIAdapter();
			}
			@Override
			public Adapter caseItinerary(Itinerary object) {
				return createItineraryAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link trs.Algorithm <em>Algorithm</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see trs.Algorithm
	 * @generated
	 */
	public Adapter createAlgorithmAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link trs.CollaborativeFiltering <em>Collaborative Filtering</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see trs.CollaborativeFiltering
	 * @generated
	 */
	public Adapter createCollaborativeFilteringAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link trs.ContentBased <em>Content Based</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see trs.ContentBased
	 * @generated
	 */
	public Adapter createContentBasedAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link trs.ContextAware <em>Context Aware</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see trs.ContextAware
	 * @generated
	 */
	public Adapter createContextAwareAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link trs.KnowledgeBased <em>Knowledge Based</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see trs.KnowledgeBased
	 * @generated
	 */
	public Adapter createKnowledgeBasedAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link trs.SocialBased <em>Social Based</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see trs.SocialBased
	 * @generated
	 */
	public Adapter createSocialBasedAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link trs.DemographicBased <em>Demographic Based</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see trs.DemographicBased
	 * @generated
	 */
	public Adapter createDemographicBasedAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link trs.HybridBased <em>Hybrid Based</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see trs.HybridBased
	 * @generated
	 */
	public Adapter createHybridBasedAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link trs.TourismRS <em>Tourism RS</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see trs.TourismRS
	 * @generated
	 */
	public Adapter createTourismRSAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link trs.RecommendationItem <em>Recommendation Item</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see trs.RecommendationItem
	 * @generated
	 */
	public Adapter createRecommendationItemAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link trs.POI <em>POI</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see trs.POI
	 * @generated
	 */
	public Adapter createPOIAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link trs.Itinerary <em>Itinerary</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see trs.Itinerary
	 * @generated
	 */
	public Adapter createItineraryAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //TrsAdapterFactory
