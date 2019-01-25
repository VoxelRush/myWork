package arrays;

import java.util.Scanner;

public class Students {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		String[] people = new String[5];
		for (int j = 0;j<people.length;j++)
		{
		System.out.println("Enter a name");
		people[j]=input.nextLine();
		}
		for(int j = people.length-1; j >= 0; j--) {
			System.out.println(people[j]);
		}
//Create an array for 5 student names to be entered
//Print them out in reverse order

}}
