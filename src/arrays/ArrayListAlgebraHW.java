package arrays;

import java.util.ArrayList;
import java.util.Scanner;

import objectOrientedProgramming.Student;

public class ArrayListAlgebraHW {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner (System.in);
		ArrayList <Student> List = new ArrayList <Student>();
		System.out.println("How many students in class?");
		int x = input.nextInt();
		input.nextLine();
		for (int j = 0; j < x; j++) {
			System.out.println("Name of student?");
			String y = input.nextLine();
			input.nextLine();
			
			System.out.println("Score of the student?");
			int z = input.nextInt();
			input.nextLine();
			
			List.add(new Student(y, z));
		}
		for (int j = 0; j < x; j++) {
			System.out.println(List.get(j).returnScore());
			System.out.println(List.get(j).returnName());
		}
	}

}
