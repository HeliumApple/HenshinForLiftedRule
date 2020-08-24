/**
 */
package org.eclipse.emf.henshin.tests;

import junit.textui.TestRunner;

import org.eclipse.emf.henshin.model.HenshinFactory;
import org.eclipse.emf.henshin.model.IteratedUnit;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Iterated Unit</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class IteratedUnitTest extends UnaryUnitTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(IteratedUnitTest.class);
	}

	/**
	 * Constructs a new Iterated Unit test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IteratedUnitTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Iterated Unit test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected IteratedUnit getFixture() {
		return (IteratedUnit)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(HenshinFactory.eINSTANCE.createIteratedUnit());
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

} //IteratedUnitTest
