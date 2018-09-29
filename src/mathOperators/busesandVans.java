package mathOperators;

import java.util.Scanner;

public class busesandVans {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		int people = 1;
		final int buscapacity = 35;
		Scanner input = new Scanner(System.in);
		System.out.println("How many people need to be transported?");
		people = input.nextInt();
		int peopleleft = (people%buscapacity);
		int busneeded = ((people-peopleleft)/buscapacity);
		System.out.println("The amount of people = " + people);
		System.out.println("The number of busses needed = " + busneeded);
		System.out.println("The number of people left behind = " + peopleleft);
		input.close();
		
		
	}

}
