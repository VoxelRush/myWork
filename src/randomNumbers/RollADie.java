package randomNumbers;
import java.util.Random;
public class RollADie {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int min = 1;
		int max = 13;
		int thress = 0;
		int randomNum = 0;
		
		Random generator = new Random();
		for (int count = 1; count<87; count++) {
			randomNum = min + generator.nextInt(max-min+1); 
				if (count%3 ==0)
					thress++;
		}
		System.out.println(thress);
	} 

}
