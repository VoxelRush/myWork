package comparableinterfaces;

public class shoes implements ClothingItem {
	private  String shoe;
	private double price;
	public shoes() {
		String shoe = "sneakers";
		double price = 3.13;
	}
	
	public String getDescription() {
		return shoe;
	}
	
	public double getPrice() {
		return price;
	}
}
