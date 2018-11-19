package decisionStructures;

import java.util.Scanner;

public class LoopHomework1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("What Number ");
		int count = input.nextInt();
			while (count!= -1) {
				count = count * count * count;
				System.out.println(count);
				System.out.println("What number?(Enter -1 to stop)");
				count = input.nextInt();
			}
			
	}

}
