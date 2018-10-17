package objectOrientedProgramming;

public class Employee {
	private double wage;
	private int experience;
		public Employee() {
			wage = -1;
			experience = -1;
		}
		public double getWage() {
			return wage;
		}
		public int getExperience() {
			return experience;
		}
		public void setWage(double newWage) {
			wage = newWage;
		}
		public void setExperience(int newExperience) {
			experience = newExperience;
		}
		public void raise() {
			wage = wage *1.1;
		}
}
