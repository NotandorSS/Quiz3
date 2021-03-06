package base;

public class Triangle extends GeometricObject{
	private double side1;
	private double side2;
	private double side3;
	
	public Triangle (){
		/*no-arg constructor*/
		this(1.0, 1.0, 1.0);
	}
	
	public Triangle(double side1, double side2, double side3) {
		/*constructor that assigns each three sides*/
		super();
		this.side1 = side1;
		this.side2 = side2;
		this.side3 = side3;
	}

	public double getSide1() {
		/*returns the first side as a double*/
		return side1;
	}

	public void setSide1(double side1) {
		/*sets the first side to the parameter value*/
		this.side1 = side1;
	}

	public double getSide2() {
		/*returns the second side as a double*/
		return side2;
	}

	public void setSide2(double side2) {
		/*sets the second side to the parameter value*/
		this.side2 = side2;
	}

	public double getSide3() {
		/*returns the third side as a double*/
		return side3;
	}

	public void setSide3(double side3) {
		/*sets the third side to the parameter value*/
		this.side3 = side3;
	}
	
	@Override
	public double getArea() {
		/*calculates the area using the three sides and the getPerimeter method and returns area*/
		double p = this.getPerimeter()/2;
		double area = Math.sqrt(p*(p-side1)*(p-side2)*(p-side3));
		return area;
	}

	@Override
	public double getPerimeter() {
		/*adds the sides and returns the sum*/
		return side1+side2+side3;
	}

	@Override
	public String toString() {
		/*returns a string that describes the triangle*/
		return "Triangle [side1=" + side1 + ", side2=" + side2 + ", side3=" + side3 + "]";
	}
	
}
