package pkg;

public class ExceptionTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=5;
		try {
			int result =num/0;
			int a[]= {1,2,3};
			System.out.println(a[5]);
			
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("Index out of boundary");
		}catch(ArithmeticException e) {
			System.out.println("Division by zero is not possible");
		}catch(Exception e) {
			System.out.println("other");
		}
		finally {
			System.out.println("Finally code block");
			
		}
		System.out.println("Code after exception");

	}

}
