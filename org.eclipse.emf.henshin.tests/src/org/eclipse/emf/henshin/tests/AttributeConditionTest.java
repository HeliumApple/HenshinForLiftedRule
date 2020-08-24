/**
 */
package org.eclipse.emf.henshin.tests;

import junit.textui.TestRunner;

import org.eclipse.emf.henshin.model.AttributeCondition;
import org.eclipse.emf.henshin.model.HenshinFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Attribute Condition</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class AttributeConditionTest extends NamedElementTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(AttributeConditionTest.class);
	}

	/**
	 * Constructs a new Attribute Condition test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AttributeConditionTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Attribute Condition test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected AttributeCondition getFixture() {
		return (AttributeCondition)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(HenshinFactory.eINSTANCE.createAttributeCondition());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#tearDown()
	 * @generated
	 */
	@Override
	protected void tearDown() throws Exception {
		setFixture(null);
	}

} //AttributeConditionTest
