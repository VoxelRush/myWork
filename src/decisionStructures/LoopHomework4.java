package decisionStructures;

import java.util.Scanner;

public class LoopHomework4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("What is the test scores?");
		int scores = input.nextInt();
		int sum = 0;
		int average = 0;
		int count = 0;
		while(scores != 9999) {
			count++;
			sum = sum + scores;
			average = average + count;
			System.out.println("What is test scores?");
				scores = input.nextInt();
		}
		System.out.println("The sum is " + sum + "and the average is " + sum/average);
	
		
	}

}
