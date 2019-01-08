package arrays;

import java.util.ArrayList;

import objectOrientedProgramming.Rectangle;

public class ArraLists400Rectangles {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Rectangle> List = new ArrayList<Rectangle>();
		int min = 50;
		int max = 70;
		for (int x = 0; x < 400;x++) {
			int j =  min + (int)(Math.random()*(max-min+1));
			int w =  min + (int)(Math.random()*(max-min+1));
			List.add(new Rectangle(j,w));
			System.out.println(List.get(x).area());
		}
		
	}

}
