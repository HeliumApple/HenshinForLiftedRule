/**
 * generated by Xtext 2.10.0
 */
package org.eclipse.emf.henshin.text.henshin_text;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Condition Node</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.emf.henshin.text.henshin_text.ConditionNode#getType <em>Type</em>}</li>
 *   <li>{@link org.eclipse.emf.henshin.text.henshin_text.ConditionNode#getAttribute <em>Attribute</em>}</li>
 * </ul>
 *
 * @see org.eclipse.emf.henshin.text.henshin_text.Henshin_textPackage#getConditionNode()
 * @model
 * @generated
 */
public interface ConditionNode extends ConditionGraphElements, ConditionNodeTypes
{
  /**
   * Returns the value of the '<em><b>Type</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Type</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Type</em>' reference.
   * @see #setType(EClass)
   * @see org.eclipse.emf.henshin.text.henshin_text.Henshin_textPackage#getConditionNode_Type()
   * @model
   * @generated
   */
  EClass getType();

  /**
   * Sets the value of the '{@link org.eclipse.emf.henshin.text.henshin_text.ConditionNode#getType <em>Type</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Type</em>' reference.
   * @see #getType()
   * @generated
   */
  void setType(EClass value);

  /**
   * Returns the value of the '<em><b>Attribute</b></em>' containment reference list.
   * The list contents are of type {@link org.eclipse.emf.henshin.text.henshin_text.Match}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Attribute</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Attribute</em>' containment reference list.
   * @see org.eclipse.emf.henshin.text.henshin_text.Henshin_textPackage#getConditionNode_Attribute()
   * @model containment="true"
   * @generated
   */
  EList<Match> getAttribute();

} // ConditionNode