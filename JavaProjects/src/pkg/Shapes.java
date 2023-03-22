package pkg;

public class Shapes {
	public void area() {
		System.out.println("Find area");
	}
	public static void area(int a) {
		System.out.println("Area of a circle"+3.14*a*a);
	}
	public void area(int b,int c) {
		System.out.println("Area of a Rectangle ="+b*c);
	
	}
	public void area(double d,double e) {
		System.out.println("Area of a triangle"+0.5*d*e);
	}

	public static void main(String[]args) {
		Shapes.area(9);
		Shapes s=new Shapes();
		s.area();
		s.area(8,7);
		
	}
}
