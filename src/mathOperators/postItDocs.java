package mathOperators;

import java.util.Scanner;

public class postItDocs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int area = 1;
		Scanner input = new Scanner(System.in);
		System.out.println("What is the area?");
		area = input.nextInt();
		int postitsneeded = (area/9);
		System.out.println("You need " + postitsneeded + " post-its and 1 more for decimal coverage");
		input.close();

	}

}
