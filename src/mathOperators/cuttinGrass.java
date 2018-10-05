package mathOperators;

import java.util.Scanner;

public class cuttinGrass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 
		double length = 1;
		double width = 1;
		double radius = 1;
		Scanner input = new Scanner (System.in);
		System.out.println("What is the width of they yard?");
		width = input.nextDouble();
		System.out.println("What is the length of they yard?");
		length = input.nextDouble();
		System.out.println("What is the radius of the fountain?");
		radius = input.nextDouble();
		double areayard = (length*width);
		double areafountain = (radius*radius*Math.PI);
		double earned1 = ((areayard-areafountain)%100);
		double earned2 = (((areayard-areafountain)-earned1)/100);
		double money = (1.25*earned2);
		System.out.println("The amount of money owed is " + money);
		
		
		
	}

}
