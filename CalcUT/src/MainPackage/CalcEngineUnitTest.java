package MainPackage;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class CalcEngineUnitTest {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testCalculate() {
		Calculator testCalc = new Calculator(10000, 3, 3.25);
		assertEquals(testCalc.calculate(), 11022.66, 0.005);
	}

	@Test
	public void testRound2Places() {
		Calculator testCalc = new Calculator(10000, 3, 3.25); 
		assertEquals(Calculator.round2Places(testCalc.calculate()), 11022.66, 0);
	}

}
