package searching;
import java.util.ArrayList;
import java.util.Random;

import objectOrientedProgramming.Rectangle;

public class QuizOnKnowledge {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList <Rectangle> Shapes = new ArrayList <Rectangle>();
		Random generator = new Random();
		int min = 0;
		int max = 499;
		int count = 0;
		for (int x = 0; x < 100; x++) {
			int result1 = min + generator.nextInt(max - min + 1);
			int result2 = min + generator.nextInt(max - min + 1);
			Shapes.add(new Rectangle(result1,result2));
		}
			
		for(Rectangle oneBox:Shapes) {
				if (oneBox.getWidth()==10 && oneBox.getLength()==7) 
					count++;
		}
		
		
		System.out.println(count + " boxes have a width of 10 and length of 7");
	
		}
	}

