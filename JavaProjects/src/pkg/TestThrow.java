package pkg;

public class TestThrow {
	
	public static void validate(int age) {
		if(age<18) {
			throw new ArithmeticException("Person not eligibleto vote");
		}
		else {
			System.out.println("Person eligible to vote");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		validate(13);
		System.out.println("rest of the code");
	}

}
