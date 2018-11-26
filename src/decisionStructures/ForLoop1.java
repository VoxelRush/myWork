package decisionStructures;

import java.util.Scanner;

 class ForLoop1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int counter = 0;
		int number = 0;
		int total =0;
		Scanner input = new Scanner(System.in);
		for (counter = 1; counter <= 5;counter = counter + 1) 
		{
			System.out.println("Pick a number");
			number= input.nextInt();
			if (counter%2==0)
				System.out.println("number is even");
			else
				System.out.println("number is odd");
			total = total + counter;
			
		}
		System.out.println(total);

	
	}

}
