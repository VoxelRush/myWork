package arrays;
import java.util.Random;
import java.util.Scanner;

public class RollADie {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Rolling of a die 10,000 times
		//Prompt for a roll number
		Scanner input = new Scanner(System.in);
		int[]test = new int[10000];
		int max = 6;
		int min = 1;
		int y;
		boolean x = true;
		while (x == true) {
			for (int j = 0; j < test.length;j++) {
				test[j] = min + (int)(Math.random()*(max-min+1));
				System.out.println(test[j]);
			
			}
			System.out.println("Enter a roll number");
			y = input.nextInt();
			System.out.println(test[y]);
			System.out.println("Would you like to continue? True/False");
			x = input.nextBoolean();
		}
		
				
		
	}
}
