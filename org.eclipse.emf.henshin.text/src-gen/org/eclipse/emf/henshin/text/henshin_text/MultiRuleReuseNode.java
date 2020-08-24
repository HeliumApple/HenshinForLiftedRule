/**
 * generated by Xtext 2.10.0
 */
package org.eclipse.emf.henshin.text.henshin_text;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Multi Rule Reuse Node</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.emf.henshin.text.henshin_text.MultiRuleReuseNode#getName <em>Name</em>}</li>
 *   <li>{@link org.eclipse.emf.henshin.text.henshin_text.MultiRuleReuseNode#getAttribute <em>Attribute</em>}</li>
 * </ul>
 *
 * @see org.eclipse.emf.henshin.text.henshin_text.Henshin_textPackage#getMultiRuleReuseNode()
 * @model
 * @generated
 */
public interface MultiRuleReuseNode extends GraphElements, RuleNodeTypes
{
  /**
   * Returns the value of the '<em><b>Name</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Name</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' reference.
   * @see #setName(Node)
   * @see org.eclipse.emf.henshin.text.henshin_text.Henshin_textPackage#getMultiRuleReuseNode_Name()
   * @model
   * @generated
   */
  Node getName();

  /**
   * Sets the value of the '{@link org.eclipse.emf.henshin.text.henshin_text.MultiRuleReuseNode#getName <em>Name</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' reference.
   * @see #getName()
   * @generated
   */
  void setName(Node value);

  /**
   * Returns the value of the '<em><b>Attribute</b></em>' containment reference list.
   * The list contents are of type {@link org.eclipse.emf.henshin.text.henshin_text.Attribute}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Attribute</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Attribute</em>' containment reference list.
   * @see org.eclipse.emf.henshin.text.henshin_text.Henshin_textPackage#getMultiRuleReuseNode_Attribute()
   * @model containment="true"
   * @generated
   */
  EList<Attribute> getAttribute();

} // MultiRuleReuseNode