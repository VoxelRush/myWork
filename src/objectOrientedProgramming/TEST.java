package objectOrientedProgramming;

public class TEST {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee Bob = new Employee ();
		Bob.setWage(4);
		Bob.setExperience(4);
		System.out.println(Bob.getWage()); //Gives the wage
		Bob.raise();
		System.out.println(Bob.getWage()); //Gives the raise
	}
}
