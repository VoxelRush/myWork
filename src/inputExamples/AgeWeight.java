package inputExamples;

import java.util.Scanner;

public class AgeWeight {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int age = 100;
		int weight = 100;
		Scanner input = new Scanner(System.in);
		System.out.println("What is your age and weight, in this order?");
		age = input.nextInt();
		weight = input.nextInt();
		System.out.println("Your age is "+ age + " and your weight is " + weight + " lb" );
		input.close();
		
	}

}
