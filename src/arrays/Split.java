package arrays;

import java.util.Scanner;

public class Split {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a sentence");
		String x = input.nextLine();
		String[]test = x.split(" ");
		for (int j = 0; j < x.length();j++) {
			System.out.println(test[j].charAt(0));
		}
	}

}
