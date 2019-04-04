package comparableinterfaces;

public class Outfit implements ClothingItem{
	private shoes shoes;
	private pants pants;
	private tops tops;
	public Outfit(pants pant1,shoes shoes1,tops top1) {
		pants = pant1;
		shoes = shoes1;
		tops = top1;
	}
	
	public String getDescription() {
		String actualpant = pants.getDescription();
		String actualshoe = shoes.getDescription();
		String actualtop = tops.getDescription();
		return actualpant;
	}
}
