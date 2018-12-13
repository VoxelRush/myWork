package arrays;

public class SantaArrayClass {
	private String name;
	private int age;
	private boolean criminal;
	
	public SantaArrayClass(String namex,int agex, boolean criminalx) {
		name = namex;
		age = agex;
		criminal = criminalx;
	}
	
	public String getName() {
		return name;
	}
	public boolean employ() {
		if (age >= 50 && age <= 70 && criminal == false) {
			return true;
		} else {
			return false;
		}
	}
}
