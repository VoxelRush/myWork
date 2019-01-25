package arrays;

import java.util.Scanner;

public class SantaArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	Scanner input = new Scanner(System.in);
	SantaArrayClass[]test = new SantaArrayClass[2];
	String x;
	int y;
	boolean z;
	for (int j = 0; j < 2; j++) {
		System.out.println("Enter a name, age, and criminal record in that order");
		x = input.nextLine();
		y = input.nextInt();
		z = input.nextBoolean();
		test[j] = new SantaArrayClass(x,y,z);
		input.nextLine();
		}
	for (int j = 0; j < 2; j++) {
		if (test[j].employ()) {
			System.out.println("people who are employable include" + test[j].getName());
		}
	}
	}
}
