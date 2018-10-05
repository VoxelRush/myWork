package mathOperators;

import java.util.Scanner;

public class mathOperators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int age = 1;
		Scanner input = new Scanner(System.in);
		System.out.println("Your age?");
		age = input.nextInt();
		age = age + 7;
		System.out.println("Your age in 7 years is " + age);
	}

}
