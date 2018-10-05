package mathOperators;

import java.util.Scanner;

public class speedTicket {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int speedlimit = 1;
		int speed = 1;
		Scanner input = new Scanner(System.in);
		System.out.println("What is the speed of the car?");
		speed = input.nextInt();
		System.out.println("What is the speed limit?");
		speedlimit = input.nextInt();
		int cost1 = speed - speedlimit;
		int cost2 = ((cost1 - 1)*40)+ 55;
		System.out.println("Your speed is " + speed + " and the speed limit is " + speedlimit + " and so the cost is $" + cost2);
		input.close();
		
		
		
	}

}
