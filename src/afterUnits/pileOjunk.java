package afterUnits;

public class pileOjunk {
	private static int id = 100;
	private int myId;
	private int number;
	
	
	public pileOjunk() {
		myId = id;
		id+=2;
		number = (int)(Math.random()*91)+10;
	}
	public static int sum(int one,int two) {
		return one + two;
	}
	public void setNumber(int number) {
		this.number = number;
	}
	
}
