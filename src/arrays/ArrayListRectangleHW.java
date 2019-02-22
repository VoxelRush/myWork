package arrays;

import java.util.ArrayList;

import objectOrientedProgramming.Rectangle;

public class ArrayListRectangleHW {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 ArrayList <Rectangle> List = new ArrayList <Rectangle>();
		 int min = 1;
		 int max = 50;
		 for (int x = 0; x < 20; x++) {
			 int a = min + (int)(Math.random()*(max-min+1));
			 int b = min + (int)(Math.random()*(max-min+1));
			 List.add(new Rectangle(a,b));
		 }
		 double largest = 0;
		 double smallest = 1000000;
		 for (int x = 0; x < 20; x++) {
			 Rectangle y = List.get(x);
			 double c = List.get(x).area();
			 if(largest < c) {
				 largest = c;
				 List.remove(x);
				 List.add(0,y);
			 }
	
		 }
		 for (int x = 0; x < 20; x++) {
			 System.out.println(List.get(x).area());
		 }
		 
	}

}
