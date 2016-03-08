package base;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class Triangle_Test {

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
	public void test() {
		/*Junit test cases (test Area, Perimeter calculations)*/
		Triangle shape1 = new Triangle();
		Triangle shape2 = new Triangle(3,4,5);
		
		assertTrue(shape1.getArea()==.4330127018922193);
		assertTrue(shape2.getArea()==6.0);
		assertTrue(shape1.getPerimeter()==3.0);
		assertTrue(shape2.getPerimeter()==12.0);
	}

}
