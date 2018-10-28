package objectOrientedProgramming;

import java.util.Scanner;

public class ShapeTest {

	public static void main() {
		double length = 1; 
		double width = 1;
		double radius = 1;
		double lengthT  = 1;
		double widthT = 1;
		double base1 =1;
		double base2 =1;
		double height = 1;
		double lengthTRAP= 1;
		
		Scanner input = new Scanner(System.in);
		System.out.println("Length and width rectangle?");
		length = input.nextDouble();
		width = input.nextDouble();
		System.out.println("Radius of Triangle?");
		radius = input.nextDouble();
		System.out.println("Length and height of triangle?");
		lengthT = input.nextDouble();
		widthT = input.nextDouble();
		System.out.println("Base 1, base 2,height, and length of trapezoid?" );
		base1 = input.nextDouble();
		base2 = input.nextDouble();
		height = input.nextDouble();
		lengthTRAP = input.nextDouble();
		
		Rectangle box = new Rectangle(length, width);
		Circle shape = new Circle(radius);
		
	}
}
