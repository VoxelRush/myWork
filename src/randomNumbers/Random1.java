package randomNumbers;
import java.util.Random;
public class Random1 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Random generator = new Random(5);
		int min = 0;
		int max = 100;
		
		int randomNum = min + generator. nextInt(max-min+1);
		System.out.println("a random number between " + min + "and" + max);
		System.out.println("is : " + randomNum);
		 
		
	}

}
