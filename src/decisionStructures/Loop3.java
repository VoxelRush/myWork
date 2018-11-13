package decisionStructures;

import java.util.Scanner;

public class Loop3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int finale = 0;
		Scanner input = new Scanner(System.in);
		System.out.println("What integer do you want to go to?");
		int count = 0;
		finale = input.nextInt();
		while (count<=finale) {
			System.out.println(count);
			count = count+2;
		}
		
		
	}

}
