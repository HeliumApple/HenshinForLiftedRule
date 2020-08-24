/**
 */
package org.eclipse.emf.henshin.tests;

import junit.textui.TestRunner;

import org.eclipse.emf.henshin.model.HenshinFactory;
import org.eclipse.emf.henshin.model.LoopUnit;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Loop Unit</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class LoopUnitTest extends UnaryUnitTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(LoopUnitTest.class);
	}

	/**
	 * Constructs a new Loop Unit test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LoopUnitTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Loop Unit test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected LoopUnit getFixture() {
		return (LoopUnit)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(HenshinFactory.eINSTANCE.createLoopUnit());
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

} //LoopUnitTest
