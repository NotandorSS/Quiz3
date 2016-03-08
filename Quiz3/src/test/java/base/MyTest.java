package base;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class MyTest {

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
		/*because getPerimeter is used in getArea, only getArea is tested*/
		Triangle shape1 = new Triangle();
		Triangle shape2 = new Triangle(3,4,5);
		assertTrue(shape1.getArea()==.4330127019);
		assertTrue(shape2.getArea()==6);
		//Area calc *2
		//Perimeter calc *2
	}

}
