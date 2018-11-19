package decisionStructures;

import java.util.Scanner;

public class LoopHomework3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner (System.in);
		System.out.println("wHAT IS Number");
		int count = input.nextInt();;
		int x =count;
		int y =count;
			while(count!=9999) { 
				System.out.println("wHAT IS Number");
				count = input.nextInt();
				if (count!=9999) {
					if (count>x)
						x = count;
					if (count<x)
						if (count<y)
							y = count;
				}
					else { 
						System.out.println("The largest number is " + x);
						System.out.println("The Smallest number is " + y);
				
			}
			
	}

}}
