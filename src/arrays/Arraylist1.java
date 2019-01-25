package arrays;

import java.util.ArrayList;
import java.util.Scanner;

public class Arraylist1 {
	//Decalare and Arraylist of String Objects
	//Add the name Bob to array list
	//Add the name Jane to the end of the arraylist
	//Add the name Billy to the Arraylist at element 1
	//Prompt the user for their name and add it to the end of the ArrayList
	//Display the names inthe ArrayList
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		ArrayList <String> Names = new ArrayList<String>();
		Names.add("Bob");
		Names.add("Jane");
		Names.add(0,"Billy");
		System.out.println("Enter your name");
		Names.add(input.nextLine());
		System.out.println("Here are the names");
		for(int j = 0; j < Names.size(); j++){
			System.out.println(Names.get(j));
		}

	}

}
