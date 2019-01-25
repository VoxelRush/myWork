package arrays;

import java.util.ArrayList;

import objectOrientedProgramming.Rectangle;

public class ArrayListObjectRemoval {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Rectangle> List = new ArrayList <Rectangle> ();
		List.add(new Rectangle(10,10));
		List.add(new Rectangle(20,10));
		List.add(new Rectangle(30,10));
		List.add(new Rectangle(40,10));
		Rectangle x = List.remove(List.size()-1);
		List.add(3,x);
		System.out.println(List.get(2).area());
	}
}
