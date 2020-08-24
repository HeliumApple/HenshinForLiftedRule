/**
 */
package org.eclipse.emf.henshin.tests;

import junit.framework.Test;
import junit.framework.TestSuite;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test suite for the '<em><b>henshin</b></em>' package.
 * <!-- end-user-doc -->
 * @generated
 */
public class HenshinTests extends TestSuite {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(suite());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static Test suite() {
		TestSuite suite = new HenshinTests("henshin Tests");
		suite.addTestSuite(ModuleTest.class);
		suite.addTestSuite(RuleTest.class);
		suite.addTestSuite(GraphTest.class);
		suite.addTestSuite(NodeTest.class);
		suite.addTestSuite(EdgeTest.class);
		suite.addTestSuite(AttributeTest.class);
		suite.addTestSuite(IndependentUnitTest.class);
		suite.addTestSuite(SequentialUnitTest.class);
		suite.addTestSuite(ConditionalUnitTest.class);
		suite.addTestSuite(PriorityUnitTest.class);
		suite.addTestSuite(IteratedUnitTest.class);
		suite.addTestSuite(LoopUnitTest.class);
		suite.addTestSuite(NestedConditionTest.class);
		suite.addTestSuite(AndTest.class);
		suite.addTestSuite(OrTest.class);
		suite.addTestSuite(XorTest.class);
		suite.addTestSuite(NotTest.class);
		suite.addTestSuite(TrueTest.class);
		return suite;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HenshinTests(String name) {
		super(name);
	}

} //HenshinTests
