package strings;

import java.util.Scanner;

public class Prompt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner (System.in);
		
			System.out.println("Enter a sentence");
			String words = input.nextLine();
			for (int x = 3; x <= words.length()-1; x = x + 4) {
			System.out.println(words.charAt(x));
			}
	
			
			
	}		

}
