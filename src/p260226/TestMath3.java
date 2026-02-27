package p260226;

public class TestMath3 {
	public static void main(String[] ar) {
		int num1 = 10;
		int num2 = 10;

		boolean result1 = (num1 == num2);
		boolean result2 = (num1 != num2);
		boolean result3 = (num1 <= num2);

		System.out.println("result1 = " + result1);
		System.out.println("result2 = " + result2);
		System.out.println("result3 = " + result3);
		System.out.println(num1 < num2);

		char c1 = 'A';
		char c2 = 'B';
		boolean result4 = (c1 < c2);
		System.out.println("result4 = " + result4);
		System.out.println();
		main2(ar);
	}

	public static void main2(String[] ar) {

		int n1 = 10;
		int n2 = 20;

		if (n1 > n2) {
			System.out.println(n1 + "은" + n2 + "보다 크다.");
		} else {
			System.out.println(n2 + "는" + n1 + "보다 크다.");
		}

		String str1 = "자바";
		String str2 = "자바";		//스택
		String str3 = new String("자바");	//힙메모리에 새집짓기

		if (str1 == str2) {
			System.out.println("같은 주소");
		} else {
			System.out.println("다른 주소");
		}

		System.out.println(str1.equals(str2));
		System.out.println(str1.equals(str3));	//값비교라 true 주소비교는 다름.
	}
}

//	자바에서 .equals 는 값을 비교하는 문자열 메소드 / == 는 주소를 비교하는 연산자
//	파이썬은 == 값을 비교하는 연산자 / is 는 주소를 비교하는 식별연산자
//	코틀린은 == 값을 비교하는 연산자 / === 는 주소를 비교하는 참조 동등 연산자
