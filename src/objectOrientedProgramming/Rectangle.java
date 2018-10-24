package objectOrientedProgramming;

public class Rectangle {
	private double length;
	private double width;
	//Constructor Methods
	public Rectangle() {
		length = 1;
		width =1;
	}
	public Rectangle(double newLength, double newWidth) {
		length = newLength;
		width = newWidth;
	}
	//Accessor Methods
	public double getLength() {
		return length;
	}
	public double getWidth() {
		return width;
	}
	public double perimeter() {
		return length*2+width*2;
	}
	public double area() {
		return length*width;
	}
	//Mutator Methods
	public void changelength(double newLength) {
		length = newLength;
	}
	public void changewidth(double newWidth) {
		width = newWidth;
	}
}

