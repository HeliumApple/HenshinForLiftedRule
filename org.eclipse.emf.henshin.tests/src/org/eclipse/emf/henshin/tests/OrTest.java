/**
 */
package org.eclipse.emf.henshin.tests;

import junit.textui.TestRunner;

import org.eclipse.emf.henshin.model.HenshinFactory;
import org.eclipse.emf.henshin.model.Or;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Or</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class OrTest extends BinaryFormulaTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(OrTest.class);
	}

	/**
	 * Constructs a new Or test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OrTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Or test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected Or getFixture() {
		return (Or)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(HenshinFactory.eINSTANCE.createOr());
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

} //OrTest
