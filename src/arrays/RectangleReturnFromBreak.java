package arrays; 

import java.util.Random;

import objectOrientedProgramming.Rectangle;

public class RectangleReturnFromBreak {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Make a two dimensional array for rectangles
		//Fill the array full of random lengths and widths
		//Display the sum of the perimeters
		Rectangle[][]values = new Rectangle[3][3];
		Random generator = new Random();
		int randomNum;
		int min = 1;
		int max = 1;
		int sum = 0;
		for (int j = 0; j < values.length;j++) {
			for(int y = 0; y < 3; y++) {
				randomNum =  min + generator.nextInt(max - min + 1);
				values[j][y] = new Rectangle(randomNum,randomNum);
				sum = (int) (sum + values[j][y].perimeter());
			}
		}
	System.out.println("The sum of the perimeters are: " + sum);
	}

}
