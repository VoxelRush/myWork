package objectOrientedProgramming;

public class RectangleTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Rectangle Mike = new Rectangle();
		System.out.println((Mike.getLength()));
		System.out.println((Mike.getWidth())); 
		System.out.println((Mike.perimeter()));
		System.out.println(Mike.area());
		
		Mike.changelength(5);
		System.out.println(Mike.getLength());
		Mike.changewidth(5);
		System.out.println(Mike.getWidth());
		System.out.println(Mike.perimeter());
		System.out.println(Mike.area());
		
		Mike = new Rectangle(3,7);
		System.out.println(Mike.area());
	}

}
