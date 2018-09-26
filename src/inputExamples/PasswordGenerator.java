package inputExamples;

import java.util.Scanner;

public class PasswordGenerator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int number1 = 1;
		int number2 = 1;
		int number3 = 1;
		Scanner input = new Scanner(System.in);
		System.out.println("Number 1?");
		number1 = input.nextInt();
		System.out.println("Number 2?");
		number2 = input.nextInt();
		System.out.println("Number 3?");
		number3 = input.nextInt();
		System.out.println(number1 +""+number2+""+number3);
		System.out.println(number2 +""+number1+""+number3);
		System.out.println(number3 +""+number1+""+number2);
		System.out.println(number1 +""+number3+""+number2);
		System.out.println(number1 +""+number2+""+number3);
		System.out.println(number1 +""+number2+""+number3);
		
		
	}

}
