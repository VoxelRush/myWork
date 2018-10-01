package mathOperators;

import java.util.Scanner;

public class makeSomeChange {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double change = 1;
		Scanner input = new Scanner(System.in);
		System.out.println("What amount of change do you want to make?");
		change = input.nextDouble();
		double remainder0 = (change%1);
		double dollars = ((change-remainder0)/1);
		double remainder1 = (remainder0%0.25); //cents
		double quarters =  ((remainder0-remainder1)/0.25); //quarters
		double remainder2 = (remainder1%0.10); //cents
		double dimes = ((remainder1-remainder2)/0.10); //dimes
		double remainder3 = (remainder2%0.05); //cents
		double nickels = ((remainder2-remainder3)/0.05); //nickels
		double remainder4 = (remainder3%0.01); //cents
		double pennies = ((remainder3-remainder4)/0.01); //pennies
		
		System.out.println("The amount of change in dollars = " + dollars + ", in quarters = "+ quarters + ", in dimes = " + dimes + ", in nickels = " + nickels + ", and in pennies = " + pennies);
		input.close();
	}

}
