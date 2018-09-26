package inputExamples;

import java.util.Scanner;

public class FortuneTeller {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int age = 100;
		double weight = 100.0;
		int luckynumber = 100;
		Scanner input = new Scanner(System.in);
		System.out.println("Your age?");
		age = input.nextInt();
		System.out.println("Your weight?");
		weight = input.nextDouble();
		System.out.println("Your lucky number?");
		luckynumber = input.nextInt();
		System.out.println("In the future...");
		System.out.println("I see...");
		System.out.println(luckynumber + " year from now...");
		System.out.println("You will reside at " + age + weight);
		System.out.println("at the old folks home...");
		input.close();
		
	}

}
