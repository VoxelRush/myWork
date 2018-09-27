package mathOperators;

import java.util.Scanner;

public class volumeBox {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int boxwidth = 1;
		int boxheight = 1;
		int boxlength = 1;
		
		Scanner input = new Scanner(System.in);
		System.out.println("Box width?");
		boxwidth = input.nextInt();
		System.out.println("Box height?");
		boxheight = input.nextInt();
		System.out.println("Box length?");
		boxlength = input.nextInt();
		System.out.println("The volume of the box is " + boxheight*boxwidth*boxlength);
		input.close();
		
	}	

}
