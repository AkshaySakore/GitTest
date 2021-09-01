package Exception;

public class ThrowDemo {

	static void valid(int num) {
		if (num < 10)
			throw new ArithmeticException();
		else
			System.out.println("number is greater");
	}

	public static void main(String[] args) {

		valid(1);
		System.out.println("code");

	}

}
