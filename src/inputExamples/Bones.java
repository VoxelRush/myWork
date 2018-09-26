package inputExamples;

import java.util.Scanner;

public class Bones {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int bonesbroken = 100;
		Scanner input = new Scanner(System.in);
		System.out.println("How many bones have you broken?");
		bonesbroken = input.nextInt();
		System.out.println("You have broken "+bonesbroken);
		input.close();
		
		
	}

}
