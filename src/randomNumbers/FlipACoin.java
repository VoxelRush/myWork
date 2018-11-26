package randomNumbers;
import java.util.Random;
public class FlipACoin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int randomNum = 0;
		int min = 0;
		int max = 1;
		int heads = 0;
		Random generator = new Random();
		for (int count = 1; count <= 100000;count++) {
			randomNum = min + generator.nextInt(max-min+1);
			if (randomNum==0)
			heads++;
		} 
		System.out.println("heads =" + heads);
		System.out.println("Tail  =" + (100000 - heads));
	}

}
