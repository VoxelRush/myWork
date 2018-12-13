package arrays;

import java.util.Scanner;

public class Prompt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int[] test = new int[5];
		int sum = 0;
		for(int j = 0;j<5;j++) {
			System.out.println("Enter test score");
			test[j] = input.nextInt();
		}
		for(int j = 4;j>=0;j--) {
			sum += test[j];
		}
		System.out.println("Sum of the variables" + sum);

	}
}
