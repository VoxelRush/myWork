package decisionStructures;

import java.util.Scanner;

public class Shoe {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int shoesize = 1;
		int height = 1;
		int cars = 1;
		int pets = 1;
		Scanner input = new Scanner(System.in);
		System.out.println("Height?");
		height = input.nextInt();
		System.out.println("Shoesize?");
		shoesize = input.nextInt();
		System.out.println(height<26 && shoesize>9);
		
		System.out.println("Pets and cars, in that order please");
		pets = input.nextInt();
		cars = input.nextInt();
		System.out.println(cars>=5||pets>3);
	}

}
