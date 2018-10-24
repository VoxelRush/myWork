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
		System.out.println("The area of the room is " + area);
		
		
	}
	
	public void areaWithDoor() {
		Scanner input = new Scanner(System.in);
		int length = 1;
		int height = 1;
		System.out.println("What is the height and length of the room?");
		height = input.nextInt();
		length = input.nextInt();
		int doorlength = 1;
		int doorheight = 1;
		System.out.println("What is the height and length of the door?");
	}
	
	

		
	}


