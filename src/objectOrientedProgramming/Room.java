package objectOrientedProgramming;

import java.util.Scanner;

public class Room {
	public Room() {
	}
	public void area() {
		Scanner input = new Scanner(System.in);
		int length = 1;
		int height = 1;
		System.out.println("What is the height and length of the room?");
		height = input.nextInt();
		length = input.nextInt();
		int area = length*height;
		
		
	}
	

	private int nextInt() {
		// TODO Auto-generated method stub
		return 0;
	}
	public void areaWithDoor() {
		Scanner input = new Scanner(System.in);
		int length = 1;
		int height = 1;
		System.out.println("What is the height and length of the room?");
		height = nextInt();
		length = nextInt();
		
	}
	
	

		
	}


