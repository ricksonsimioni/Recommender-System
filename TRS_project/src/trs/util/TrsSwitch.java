/**
 */
package trs.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

import trs.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see trs.TrsPackage
 * @generated
 */
public class TrsSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static TrsPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TrsSwitch() {
		if (modelPackage == null) {
			modelPackage = TrsPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case TrsPackage.ALGORITHM: {
				Algorithm algorithm = (Algorithm)theEObject;
				T result = caseAlgorithm(algorithm);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TrsPackage.COLLABORATIVE_FILTERING: {
				CollaborativeFiltering collaborativeFiltering = (CollaborativeFiltering)theEObject;
				T result = caseCollaborativeFiltering(collaborativeFiltering);
				if (result == null) result = caseAlgorithm(collaborativeFiltering);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TrsPackage.CONTENT_BASED: {
				ContentBased contentBased = (ContentBased)theEObject;
				T result = caseContentBased(contentBased);
				if (result == null) result = caseAlgorithm(contentBased);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TrsPackage.CONTEXT_AWARE: {
				ContextAware contextAware = (ContextAware)theEObject;
				T result = caseContextAware(contextAware);
				if (result == null) result = caseAlgorithm(contextAware);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TrsPackage.KNOWLEDGE_BASED: {
				KnowledgeBased knowledgeBased = (KnowledgeBased)theEObject;
				T result = caseKnowledgeBased(knowledgeBased);
				if (result == null) result = caseAlgorithm(knowledgeBased);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TrsPackage.SOCIAL_BASED: {
				SocialBased socialBased = (SocialBased)theEObject;
				T result = caseSocialBased(socialBased);
				if (result == null) result = caseAlgorithm(socialBased);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TrsPackage.DEMOGRAPHIC_BASED: {
				DemographicBased demographicBased = (DemographicBased)theEObject;
				T result = caseDemographicBased(demographicBased);
				if (result == null) result = caseAlgorithm(demographicBased);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TrsPackage.HYBRID_BASED: {
				HybridBased hybridBased = (HybridBased)theEObject;
				T result = caseHybridBased(hybridBased);
				if (result == null) result = caseAlgorithm(hybridBased);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TrsPackage.TOURISM_RS: {
				TourismRS tourismRS = (TourismRS)theEObject;
				T result = caseTourismRS(tourismRS);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TrsPackage.RECOMMENDATION_ITEM: {
				RecommendationItem recommendationItem = (RecommendationItem)theEObject;
				T result = caseRecommendationItem(recommendationItem);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TrsPackage.POI: {
				POI poi = (POI)theEObject;
				T result = casePOI(poi);
				if (result == null) result = caseRecommendationItem(poi);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TrsPackage.ITINERARY: {
				Itinerary itinerary = (Itinerary)theEObject;
				T result = caseItinerary(itinerary);
				if (result == null) result = caseRecommendationItem(itinerary);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Algorithm</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Algorithm</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAlgorithm(Algorithm object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Collaborative Filtering</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Collaborative Filtering</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCollaborativeFiltering(CollaborativeFiltering object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Content Based</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Content Based</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseContentBased(ContentBased object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Context Aware</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Context Aware</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseContextAware(ContextAware object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Knowledge Based</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Knowledge Based</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseKnowledgeBased(KnowledgeBased object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Social Based</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Social Based</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSocialBased(SocialBased object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Demographic Based</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Demographic Based</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDemographicBased(DemographicBased object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Hybrid Based</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Hybrid Based</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseHybridBased(HybridBased object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Tourism RS</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Tourism RS</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTourismRS(TourismRS object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Recommendation Item</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Recommendation Item</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRecommendationItem(RecommendationItem object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>POI</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>POI</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePOI(POI object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Itinerary</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Itinerary</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseItinerary(Itinerary object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //TrsSwitch
