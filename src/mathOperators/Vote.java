package mathOperators;

import java.util.Scanner;

public class Vote {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int age = 1;
		int year = 2018;
		Scanner input = new Scanner(System.in);
		System.out.println("Your age?");
		age = input.nextInt();
		age = 18 - age;
		year = age + year;
		System.out.println("You can vote in " + year + " in " + age + " years");
	}

}
