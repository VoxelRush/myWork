package mathOperators;

import java.util.Scanner;

public class pullSSNapart {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		int age = 1;
		int SSN = 1;
		Scanner input = new Scanner (System.in);
		System.out.println("What is your age?");
		age = input.nextInt();
		System.out.println("What is your social security number?");
		SSN = input.nextInt();
		input.close();
		int leftage = 18 - age;
		int SSN4 = SSN/100000;
		System.out.println("Your age is " + age + " and you will turn 18 in " + leftage + " years.");
		System.out.println("The last 4 digits of your SSN is " + SSN4);
		
		
	}

}
