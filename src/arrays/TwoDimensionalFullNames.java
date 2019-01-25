package arrays;

import java.util.Scanner;

public class TwoDimensionalFullNames {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	Scanner input = new Scanner(System.in);
	String [][] Names  = new String[4][3];
	for(int j = 0; j < Names.length;j++) {
		for(int y = 0; y < 3;y++){
			System.out.println("Enter a name");
			Names[j][y] = input.nextLine();
			}
		}
	for(int j = 0; j < Names.length;j++) {
		for(int y = 0; y 
				<3; y++) {
			System.out.println(Names[j][y]);
			}
		}
	}
}
