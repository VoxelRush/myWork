package afterUnits;

import java.util.ArrayList;

public class Library {
	private String name;
	private ArrayList <Book> shelves;
	
	public Library() {
		name = "Brookfield Public Library";
		shelves = new ArrayList <Book>();	
		for(int x = 0; x < 10; x++) {
				shelves.add(new Book());
		}
	}
	public Library (String xname, int amount) {
		name = xname;
		for(int x = 0; x < amount; x ++) {
			shelves.add(new Book());
		}
	}
	public void CheckOut(int x) {
		shelves.remove(x);
	}

	public void Return(int x) {
		shelves.add(new Book());
	}
		
	public void Fire() {
		shelves.clear();
	}
}