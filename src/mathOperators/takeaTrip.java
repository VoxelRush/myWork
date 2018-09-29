package mathOperators;

import java.util.Scanner;

public class takeaTrip {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double distance = 1;
		double mpg = 1;
		double money = 1;
		Scanner input = new Scanner(System.in);
		System.out.println("What is the distance of the trip?");
		distance = input.nextDouble();
		System.out.println("What is the fuel economy of the car?");
		mpg = input.nextDouble();
		System.out.println("How much does it cost?");
		money = input.nextDouble();
		double fueleconomy = (distance/mpg);
		double averagecost = (money/mpg);
		System.out.println("The distance of the trip = " + distance + " miles.");
		System.out.println("The amount of gallons used = " + fueleconomy + " gallons" );
		System.out.println("The amount of money spent on gas = $" + money);
		System.out.println("The average cost per gallon = $" + averagecost);
		input.close();
		
	}

}
