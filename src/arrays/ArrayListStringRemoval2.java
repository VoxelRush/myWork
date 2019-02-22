package arrays;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListStringRemoval2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in); 
		ArrayList <String> Names = new ArrayList <String>();
		Names.add("Bob Smith");
		Names.add(0,"Billy Jones");
		System.out.println("Enter your name!");
		String x = input.nextLine();
		Names.add(x);
		Names.add(Names.size(),"Jane Miller");
		if(Names.size()>0) {
			Names.remove(1);
		}
		System.out.println("Here are the remaining Students");
		for (int j = 0; j < Names.size(); j++) {
			System.out.println(Names.get(j));
		}
	}

}

