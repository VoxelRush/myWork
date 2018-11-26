package decisionStructures;

import java.util.Scanner;

public class Loop5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int count = 0;
		System.out.print("Please enter a number");
		count = input.nextInt();
			while(count != 9999) {
				System.out.println(count*2);
				System.out.print("Please enter a number");
				count = input.nextInt();
			}
		System.out.println("End");
	}

}
