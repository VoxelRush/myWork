package decisionStructures;

import java.util.Scanner;

public class Salary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double salary = 1;
		
		Scanner input = new Scanner (System.in);
		System.out.println("What is das Salary?");
		salary = input.nextDouble();
		
			if (salary < 100000) {
				if(salary < 40000) {
					if(salary<20000) {
						System.out.println("DU BIST POOR BITCH");
					}
					else {
					System.out.println("You are the dog");
					}
				}
				else {
				System.out.println("You are the CEO BRAH");
				}
				}
			else {
				System.out.println("You are the Owner JA");
				 }
				 }
}
