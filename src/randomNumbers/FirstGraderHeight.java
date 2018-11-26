package randomNumbers;
import java.util.Random;
public class FirstGraderHeight {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int min = 26;
		int max = 43;
		int randomNum = 0;
		int tall=0;
		Random generator = new Random();
		for (int count = 1; count <= 238; count++) {
			if (randomNum>36)
				tall++;
		}
		System.out.println("Number of children :" + tall);
	}

}
