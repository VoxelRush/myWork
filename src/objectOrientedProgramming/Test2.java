package objectOrientedProgramming;

public class Test2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Circle Bob = new Circle();
		System.out.println("Radius=" + Bob.getRadius());
		System.out.println("Circumeference=" + Bob.circumference());
		System.out.println("Area=" + Bob.area());
		Bob.setRadius(5);
		System.out.println("Radius=" + Bob.getRadius());
	
		Bob = new Circle(12.25);
		System.out.println("Radius=" + Bob.getRadius());
		System.out.println("Circumeference=" + Bob.circumference());
		System.out.println("Area=" + Bob.area());
		Bob.setRadius(5);
		System.out.println("Radius=" + Bob.getRadius());
		}	
	

}
