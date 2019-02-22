package arrays;

import java.util.ArrayList;

public class ArrayListStringRemoval {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList <String> Names = new ArrayList <String>();
		Names.add("Bob");
		Names.add("God");
		Names.add("Jesus");
		Names.add(0,"Lol");
		if(Names.size()>0) {
			Names.remove(0);
		}
		if(Names.size()>0) {
			Names.remove(Names.size()-1);
		}
		System.out.println("Here are the remaining Students");
		for (int x = 0; x < Names.size(); x++) {
			System.out.println(Names.get(x));
		}
	}

}
