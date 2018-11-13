package decisionStructures;

import java.util.Scanner;

public class Loop4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum = 0;
		Scanner input = new Scanner(System.in);
		System.out.println("What integer do you want to go to?");
		int count = 0;
		int finale = 0;
		finale= input.nextInt();
		while (count<=finale) {
			System.out.println(count);
			sum+=count;
		
	}
		System.out.println(count);

	}
	
}
