package mathOperators;

import java.util.Scanner;

public class letsPaint {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double width = 1;
		final double height = 8;
		double length = 1;
		int gallons = 150;
		Scanner input = new Scanner(System.in);
		System.out.println("Width of the room?");
		width = input.nextDouble();
		System.out.println("Length of the room?");
		length = input.nextDouble();
		System.out.println("The dimensions of the room are a width of " + width + ", a height of " + height + ", and a length of " + height);
		double areapainted = (((height*width)*2) + ((height*length)*2));
		double gallonsofpaint = (areapainted/gallons);
		System.out.println("The area needing paint is " + areapainted + " and the gallons of painted need is " + gallonsofpaint);
		input.close();
				
	}

}
