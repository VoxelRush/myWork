package arrays;

import java.util.Random;

import objectOrientedProgramming.Circle;

public class CircleReturnFromBreak {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			//Create an array of 1 dimensional
			//Fill ARRAY full of circle objects, with random radius
			//Display the sum of the Area
		Circle[]values = new Circle[6];
		Random generator = new Random();
		int min = 1;
		int max = 1;
		int randomNum;
		int area = 0;
		for (int j = 0; j < values.length; j++) {
			randomNum =  min + generator.nextInt(max - min + 1);
			values[j] = new Circle(randomNum);
			area = (int) (area + values[j].area());
		}
		System.out.println(area);
	}

}
