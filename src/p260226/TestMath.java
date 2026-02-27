package p260226;

public class TestMath {

	public static void main(String[] args) {

		int a = 10, b = 3, c;
		c = a + b;
		System.out.println("a+b=" + c);			// 13
		System.out.println("a+b=" + (a + b));	// 13
		
		System.out.println("a+b=" + (a - b));	// 7
		System.out.println("a+b=" + (a * b));	// 30
		System.out.println("a+b=" + (a / b));	// 3
		System.out.println("a+b=" + (a % b));	// 1
	}

}
