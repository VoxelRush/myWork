package objectOrientedProgramming;

public class Circle {
	private double radius;
	//Constructors
	public Circle() {
		radius = 1;
	}
	public Circle(double newRadius) {
		radius = newRadius;
	}
	//Mutator Methods
	public void setRadius(double NewRadius) {
		radius = NewRadius;
	}
	//Accesor Methods
	public double getRadius() {
		return radius;
	}
	public double circumference() {
		return 2*radius*Math.PI;
	}
	public double area() {
		return radius*radius*Math.PI;
	}
	
}
