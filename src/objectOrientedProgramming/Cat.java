package objectOrientedProgramming;

public class Cat {
	private int age;
	private int sleep;
	public Cat() {
		age = 1;
		sleep = 12;
	}
	public Cat(int newage, int newsleep) {
		age = newage;
		sleep = newsleep;
	}
	public int getAge() {
		return age;
	}
	public int getSleep() {
		return sleep;
	}
	//Mutator 
	public void Birthday() {
		age++;
	}
	public void MoreSleep() {
		sleep++;
	}
	public void LessSleep() {
		sleep--;
	}
}
	
	
