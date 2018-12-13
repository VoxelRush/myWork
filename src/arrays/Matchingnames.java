package arrays;

import java.util.Scanner;

public class Matchingnames {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Declare an array to hold 20 friends and prompt the user for a name
		//Prompt the user for a first name length
		//Display how many friends names match the desired length
		Scanner input = new Scanner(System.in);
		String[] people = new String [20];
		int[] length = new int[20];

		for (int x=0;x< people.length;x++) {
			System.out.println("Enter a name");
			people[x] = input.nextLine();
			System.out.println("Enter the name's length");
			length[x] = input.nextInt();
		}
	
		
	}

}
