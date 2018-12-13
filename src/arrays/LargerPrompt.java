package arrays;

import java.util.Scanner;

public class LargerPrompt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner(System.in);
		int[] test = new int[9];
		int sum = 0;
		int largest = 0;
		for(int j = 0;j<9;j++) {
			System.out.println("Enter test score");
			test[j] = input.nextInt();
		}
		for(int j = 0;j<9;j++) {
			if(largest<test[j]) {
				largest = test[j];
			}
		}
		System.out.println("Largest value is " + largest);
	}

}
