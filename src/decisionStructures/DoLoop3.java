package decisionStructures;

import java.util.Scanner;

public class DoLoop3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("What is the number");
		int test = input.nextInt();
		int lowest = test;
		int highest = test;
		do
			{
			if(test<lowest)
				lowest = test;
			if(test>highest)
				highest=test;
				System.out.println("Enter another number(9999 cancels)");
				test = input.nextInt();
			}while(test!=9999);
			System.out.println(highest-lowest);
	}

}
