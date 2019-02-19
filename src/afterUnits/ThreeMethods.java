package afterUnits;

public class ThreeMethods {
			private double radius;
			//Constructors
			public ThreeMethods() {
				radius = 1;
			}
			public ThreeMethods(double newRadius) {
				radius = newRadius;
			}
			//Mutator Methods
			public void setRadius(double NewRadius) {
				radius = NewRadius;
			}
			//Accesor Methods
			public double getRadius() {
				return radius;
			}
			public double circumference() {
				return 2*radius*Math.PI;
			}
			public double area() {
				return radius*radius*Math.PI;
			}
			public String toString() {
				return "Circle object: radius = " + radius;
			
			}
			
	}


