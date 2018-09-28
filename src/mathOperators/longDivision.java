package mathOperators;

import java.util.Scanner;

public class longDivision {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		int dividend = 1; 
		int dividor = 1;
		Scanner input = new Scanner (System.in);
		System.out.println("What is the dividend?");
		dividend = input.nextInt();
		System.out.println("What is the dividor?");
		dividor = input.nextInt();
		int division = dividend/dividor;
		int remainder = dividend%dividor;
		System.out.println(division + "r"+ remainder);
		input.close();
		
	
	}

}
