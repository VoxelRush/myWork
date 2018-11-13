package decisionStructures;

import java.util.Scanner;

public class Loop6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double test = 0;
		boolean permission = true;
		Scanner input = new Scanner(System.in);
		while(permission = true) {
			System.out.println("what are the values");
			test = input.nextDouble();
			System.out.println("Do you want to continue? True or False");
			permission = input.nextBoolean();
		}
		System.out.println();

	
	}

}
