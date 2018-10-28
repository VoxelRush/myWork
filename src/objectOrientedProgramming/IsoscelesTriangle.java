package objectOrientedProgramming;

public class IsoscelesTriangle {
	private double base1;
	private double base2;
	private double height;
	private double leg;
	
	public IsoscelesTriangle() {
		base1 = 1;
		base2 = 1;
		height = 1;
		leg = 1;
	}
	public IsoscelesTriangle(double newbase1, double newbase2, double newheight, double newleg) {
		base1 = newbase1;
		base2 = newbase2;
		height = newheight;
		leg = newleg;
	}
	//Accessors
	public double perimeter() {
		return base1+base2+height+leg;
	}
	public double area() {
		return ((base1+base2)/2)*height;
	}
}
