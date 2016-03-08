package base;

import static org.junit.Assert.assertTrue;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Triangle shape1 = new Triangle();
		Triangle shape2 = new Triangle(3,4,5);
		System.out.println(shape1.getArea());
		System.out.println(shape2.getArea()==6.0);
		System.out.println(shape1.getPerimeter()==3.0);
		System.out.println(shape2.getPerimeter()==12.0);
	}

}
