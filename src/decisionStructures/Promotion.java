package decisionStructures;

import java.util.Scanner;

public class Promotion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int age = 1;
		double height = 1;
		double experience = 1;
		Scanner input = new Scanner(System.in);
		System.out.println("Was ist deine age?");
		age = input.nextInt();
		System.out.println("Und deine height?");
		height = input.nextDouble();
		System.out.println("Und deine experience?");
		experience = input.nextDouble();
		
		if(age>=50) {
			if (experience == 10.5) {
				if(height>80) {
				System.out.print("DU GOTST DER PROMOTION, JAJAJAJAJAJ!");
				}
				if(height<70) {
				System.out.print("DU GOTST DER PROMOTION, JAJAAJAJA!");
				}
				else {
				System.out.println("LOL YOU GOT JUKED, XAXAXAXA!");
				}
			}
			else {
				System.out.println("LOL YOU GOT JUKED, XAXAXAXA!");
			}
		}
		else 
			if(height>=70 && height <80) {
				System.out.print("DU GOTST DER PROMOTION, JAJAAJAJA!");
		}
			else {
				System.out.println("LOL YOU GOT JUKED, XAXAXAXA!");
		}
		
		
	}

}
