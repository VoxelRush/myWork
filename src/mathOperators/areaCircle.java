package mathOperators;

import java.util.Scanner;

public class areaCircle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int radius = 1;
		final double pieet = 3.14;
		Scanner input = new Scanner(System.in);
		System.out.println("Radius of the Circle?");
		radius = input.nextInt();
		System.out.println("The area of the circle is " + radius*radius*pieet);
		input.close();
	}

}
