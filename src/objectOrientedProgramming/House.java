package objectOrientedProgramming;

import java.util.Scanner;

public class House{
	public void House() {
		double length = 1;
		double width = 1;
		double height = 1;
		double rate = 1;
		Scanner input = new Scanner(System.in);
		System.out.println("Length?");
		length = input.nextDouble();
		System.out.println("Width?");
		width = input.nextDouble();
		System.out.println("Height?");
		height = input.nextDouble();
		System.out.println("Rate?");
		rate = input.nextDouble();
		double volume = length*width*height;
		double time = (volume/rate);
		System.out.println("The time it will take is " + time);
		
	}
}
	