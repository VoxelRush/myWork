package arrays;

import java.util.Scanner;

public class Split2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a sentence");
		String x = input.nextLine();
		System.out.println("Enter a key word");
		String keyword = input.nextLine();
		
		String[]test = x.split(" ");
		int counter = 0;
		for (int j = 0; j < x.length();j++) {
			if(test[j].equals(keyword)) {
				counter++;
		System.out.println("The keyword appears " + counter + "times");
		
			}
		}
		
	}
}