package afterUnits;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class SequentialSearches2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		ArrayList <Integer> HELL= new ArrayList <Integer> ();
		int min = 0;
		int max = 499;
		int count = 0;
		Scanner input = new Scanner(System.in);
		Random generator = new Random();
		
		for (int y = 0; y < 100; y++) {
			HELL.add(min + generator.nextInt(max-min+1));
		}
		
		System.out.println("Number you want to choose?");
		int x = input.nextInt();
		
		for(int y = 0; y < 100; y++) {
			if(x == HELL.get(y)) {
				count += 1;
		}
	    }
		System.out.println(count);
	}
}