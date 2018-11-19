package decisionStructures;

import java.util.Scanner;

public class LoopHomewrork2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner (System.in);
		System.out.println("What number?");
		int count = input.nextInt();
		int number;
			while(count>0) {
				number = count%5;
				count = (count - number);
				System.out.println(count);
				count = count - 5;
			}
				
	}

}
