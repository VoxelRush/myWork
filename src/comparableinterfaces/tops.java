package comparableinterfaces;

public class tops implements ClothingItem{
		private String top;
		private double price;
		public tops() {
			String pant = "striped T-Shirt";
			double price = 30.32;
		}
		
		public String getDescription() {
			return top;
		}
		
		public double getPrice() {
			return price;
		}
	}
