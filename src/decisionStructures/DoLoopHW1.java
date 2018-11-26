package decisionStructures;

import java.util.Scanner;

public class DoLoopHW1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner (System.in);
		int number1;
		int number2;
		do {
			System.out.println("First number?");
			 number1 = input.nextInt();
			 if (number1 !=999) {
				 System.out.println("Second NUmber?");
					number2 = input.nextInt();
					System.out.println("The sum is " +  (number1+ number2)); 
			 }
		} while (number1 !=999);
			
	}

}
