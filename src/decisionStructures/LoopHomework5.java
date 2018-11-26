package decisionStructures;

import java.util.Scanner;

public class LoopHomework5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner (System.in);
		System.out.println("What number? (9999 to cancel)");
		double x = input.nextInt();
		while (x!=9999) {
			System.out.println(x);

			System.out.println("What number? (9999 to cancel)");
			x= input.nextDouble();
			}
			
	}

}
