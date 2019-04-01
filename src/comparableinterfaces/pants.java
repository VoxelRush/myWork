package comparableinterfaces;

public class pants implements ClothingItem {
	private String pant;
	private double price;
	public pants() {
		String pant = "khakhis";
		double price = 10.25;
	}
	
	public String getDescription() {
		return pant;
	}
	
	public double getPrice() {
		return price;
	}
}

