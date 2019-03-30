/**
 * generated by Xtext 2.17.0
 */
package zd.zero.abdt.eclipse.anyaBasic;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Model</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link zd.zero.abdt.eclipse.anyaBasic.Model#getGreetings <em>Greetings</em>}</li>
 * </ul>
 * </p>
 *
 * @see zd.zero.abdt.eclipse.anyaBasic.AnyaBasicPackage#getModel()
 * @model
 * @generated
 */
public interface Model extends EObject
{
  /**
   * Returns the value of the '<em><b>Greetings</b></em>' containment reference list.
   * The list contents are of type {@link zd.zero.abdt.eclipse.anyaBasic.Greeting}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Greetings</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Greetings</em>' containment reference list.
   * @see zd.zero.abdt.eclipse.anyaBasic.AnyaBasicPackage#getModel_Greetings()
   * @model containment="true"
   * @generated
   */
  EList<Greeting> getGreetings();

} // Model
