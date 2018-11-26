package decisionStructures;

import java.util.Scanner;

public class DoLoopHW2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner (System.in);
		int number;
		int sum =0;
		int count = 0;
		do
		{
			System.out.println("Enter a number");
			number = input.nextInt();
			sum = sum + number;
			count = count + 1;
		}
			while(sum<=2018);
		System.out.println("the amount entered is " + count );
		
	}

}
