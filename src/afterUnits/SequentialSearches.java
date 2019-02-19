package afterUnits;

import java.util.Random;
import java.util.ArrayList;

public class SequentialSearches {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList <Integer> List = new ArrayList<Integer>();
		Random generator = new Random();
		int min = 400;
		int max = 1600;
		int SAT = 1600;
		
		for(int x = 0; x < 1000; x++) {
			List.add(min + generator.nextInt(max-min+1));
		}
		
		for (int x = 0; x < 1000; x++) {
			if(List.get(x) == SAT) { 
				System.out.println("The score is " + SAT);
		}
	}

}
}
