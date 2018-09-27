package mathOperators;

import java.util.Scanner;

public class wallArea {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int wallwidth = 1;
		int wallheight = 8;
		Scanner input = new Scanner(System.in);
		System.out.println("What is the wall width?");
		wallwidth = input.nextInt();
		System.out.println("The area of the wall is " + wallwidth*wallheight + "feet");
		input.close();
	}

}
