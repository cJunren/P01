import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class CalculatorTest {

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
	
//	@Test
//	public void test() {
//		fail("Not yet implemented");
//	}

	@Test
	public void testSubtract() {
		//fail("Not yet implemented");
		int a = 9876;
		int b = 4321;
		
		Calculator cal = new Calculator();
		int actual = cal.subtract(a, b);
		
		int expected = 5555;
		assertEquals(actual, expected);
	}
	
	@Test
	public void testAdd() {
		//fail("Not yet implemented");
		int a = 1234;
		int b = 8765;
		
		Calculator cal = new Calculator();
		int actual = cal.add(a, b);
		
		int expected = 9999;
		assertEquals(expected,actual);
	}
	
	@Test 
	public void testMultiply() { 
		//fail("Not yet implemented");
		int a = 4321;
		int b = 1234;
		
		Calculator cal = new Calculator();
		int actual = cal.multiply(a, b); 
		int expected = 5332114; 
		assertEquals (expected, actual);
		
	}
	@Test
	public void testDivide() {
		//fail("Not yet implemented");
		int a = 20;
		int b = 2;
		Calculator cal = new Calculator();
		int actual = cal.divide(a, b);
		int expected = 10;
		assertEquals (expected, actual);
	}
	
	@Test
	public void testTriangle() {
		//fail("Not yet implemented");
		int a = 3;
		int b = 6;
		
		Calculator cal = new Calculator();
		int actual = cal.triangle(a, b);
		int expected = 9;
		assertEquals(expected, actual);
	}
	
	@Test
	public void testTrue() {
		//fail("Not yet implemented");
		ArrayList<String> student = new ArrayList<String>();
		student.add("Ryain");
		student.add("darnest");
		student.add("Trevor");
		
		assertTrue(student.contains("Ryain"));
	}
	

}
