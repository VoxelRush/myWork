package strings;

import java.util.Scanner;

public class CharAt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner (System.in);
		System.out.println("Give a sentence");
		String words = input.nextLine();
		System.out.println(words.charAt(0));
		System.out.println(words); 
		System.out.println(words. contains("Dangerous"));
		
	}

}
