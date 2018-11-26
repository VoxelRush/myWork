package objectOrientedProgramming;

public class FlightAttendant {
	private double miles;
	private double flights;
	public FlightAttendant() {
		miles = 0;
		flights =0;
	}
	public FlightAttendant(double newMiles, double newFlights) {
		miles = newMiles;
		flights = newFlights;
	}
	
	//Accessors
	public double getMiles() {
		return miles;
	}
	public void totalFlights(double newFlights) {
		 flights = newFlights;
	}
	public void reset() {
		flights = 0;
		miles = 0;
	}
	public void fly(double one) {
		miles = miles + one;
	}
	public double averageflightdistance() {
		return miles/flights;
	}
}

