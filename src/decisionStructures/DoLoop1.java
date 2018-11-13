package decisionStructures;

import java.util.Scanner;

public class DoLoop1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int test = 1;
		int work = 1;
		Scanner input = new Scanner(System.in);
		do {
			System.out.println("What number?(except9999)");
			test = input.nextInt();
			work = test*17;
			System.out.println(work);
		}
			while(test!=9999);
	}

}
