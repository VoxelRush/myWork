package decisionStructures;

import java.util.Scanner;

public class Age2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double age = 1;
		Scanner input = new Scanner(System.in);
		System.out.println("Age?");
		age = input.nextDouble();
		if (age >= 18) {
			System.out.println("You are an adult, and therefor you have survived");
		}
		System.out.println("HAHHAHA");
	}

}
