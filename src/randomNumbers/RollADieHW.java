package randomNumbers;
import java.util.Random;
import java.util.Scanner;
public class RollADieHW {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("What range do u want for you dice");
		int min = 1;
		int max = input.nextInt();
		int randomNum = 0;
		System.out.println("What amount of rolls?");
		int x = input.nextInt();
		Random generator = new Random(5);
		for (int count = 1; count<=x; count++) {
			randomNum = min + generator.nextInt(max-min+1);
			System.out.println(randomNum);
		}
	} 

}
