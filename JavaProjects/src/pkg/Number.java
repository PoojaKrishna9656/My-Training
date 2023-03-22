package pkg;
	
	public class Number {
		public void num1(int a,int b) {
			System.out.println("addition ="+a+b);
		}
		public static void num1(int a,int b) {
			System.out.println("Subtraction"+ a-b);
		}
		public void num(float b,float c) {
			System.out.println("Multiplication ="+b*c);
		
		}
		public void num(double d,double e) {
			System.out.println("division"+d/e);
		}

		public static void main(String[]args) {
			Number.num1(9,8);
			Number s=new Number();
			s.num1(5, 8);
			//s.area(8,7);
			
		}

}
