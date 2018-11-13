package decisionStructures;

import java.util.Scanner;

public class DoLoop2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("What number");
		double test = input.nextDouble();
		do
		{
			System.out.println("The fifth power is:" + Math.pow(test, 5));
			System.out.println("Please enter a number.(9999 to quit)");
			test = input.nextDouble();
		} while (!(Math.abs(test-9999)<0.001));
		
	}

}
