package pkg;

public class TestThrows {

	public static int divide(int x, int y) throws ArithmeticException {
		int div = x / y;
		return div;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		TestThrows t = new TestThrows();
		try {
			System.out.println(50 / 5);
		} catch (ArithmeticException e) {
			System.out.println("Number cannot be divisible by zero");
		}
		System.out.println("Rest of code");
	}

}
