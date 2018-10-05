package mathOperators;

import java.util.Scanner;

public class averageSomeTests {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int testscore1 = 1;
		int testscore2 = 1;
		int testscore3 = 1;
		Scanner input = new Scanner(System.in);
		System.out.println("First Test Score?");
		testscore1 = input.nextInt();
		System.out.println("Second Test Score?");
		testscore2 = input.nextInt();
		System.out.println("Third Test Score?");
		testscore3 = input.nextInt();
		System.out.println("The test scores are " + testscore1 + "," + testscore2 + ", and " + testscore3);
		int averagetestscore = ((testscore1 + testscore2 +testscore3)/3);
		System.out.println("The average is " + averagetestscore);
		input.close();
		
	}

}
