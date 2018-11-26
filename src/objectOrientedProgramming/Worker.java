package objectOrientedProgramming;

public class Worker {
	private int hours;
	private double hourlyrate;
	public Worker() {
		hours = 1;
		hourlyrate = 1;
	}
	public Worker(int newhours, double newhourlyrate) {
		hours = newhours;
		hourlyrate = newhourlyrate;
	}
	//Acccessor Methods
	
	public int gethours() {
		return hours;
	}
	public double gethourlyrate() {
		return hourlyrate;
	}
	public double paycheck() {
		return hours * hourlyrate;
	}	
	//Mutator Methods
	public void raise(double ok) {
		hourlyrate = hourlyrate + ok;
	}
	}
