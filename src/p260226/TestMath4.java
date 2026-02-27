package p260226;

import java.util.Scanner;

//	조건 연산자(삼항 연산자)
//	변수 = (조건식)? 값1 : 값2
//	조건식이 참이면 값1 거짓이면 값2

public class TestMath4 {

	public static void main(String[] ar) {

		int n1, n2, max, min;
		System.out.println("정수 2개를 입력하세요");
		Scanner sc = new Scanner(System.in);

// 서식:	Scanner 변수명 = new Scaner(System.in);  input()이랑 같은 역할임

		n1 = sc.nextInt();
		n2 = sc.nextInt();

		max = (n1 > n2) ? n1 : n2;
		min = (n1 < n2) ? n1 : n2;

		System.out.println("max: " + max);
		System.out.println("min: " + min);

		System.out.println();
		main2(ar); // 만약 위에 args로되어있으면 이것도 args로넘겨야함

		sc.close();
	}

	public static void main2(String[] ar) {
		int n1 = 20, n2 = 10, max, min;
		max = (n1 > n2) ? n1 : n2;
		min = (n1 < n2) ? n1 : n2;

		System.out.println("max= " + max);
		System.out.println("min= " + min);

		System.out.println();

		main3(ar);

	}

	public static void main3(String[] ar) {

		System.out.println("정수 2개를 입력하세요");
		Scanner sc = new Scanner(System.in);

		int n1 = sc.nextInt();
		int n2 = sc.nextInt();
		System.out.println("n1: " + n1);
		System.out.println("n2: " + n2);

		if (n1 > n2) {
			System.out.println(n1 + "이" + n2 + "보다 크다");
		} else {
			System.out.println(n2 + "이" + n1 + "보다 크다");
		}

		main4(ar);

		sc.close();
	}

	public static void main4(String[] ar) {

		boolean b1 = true;
		boolean b2 = false;

		System.out.println(!b1);
		System.out.println(!b2);
		System.out.println(!true);
		System.out.println(!false);

		if (!b2) {
			System.out.println("출력 성공");
		}

		main5(ar);
	}

	public static void main5(String[] ar) {
		int a = 10, b = 3;
		System.out.println(a += b);
		System.out.println(a -= b);
		System.out.println(a *= b);
		System.out.println(a /= b);
		System.out.println(a %= b);
	}

}

// 파이썬의 경우 num = int(input())
// 코틀린의 경우 val num = readLine()?.toInt()?:0
// 세이프콜?. 널이아니면뒤에실행 ?: 엘비스연산자는 안전빵으로 넣어둠 생략도 가능하긴 함
// 자바의 경우 Scanner sc = new Scanner(System.in);
//			int num = sc.nextInt();

//			var사용도 가능하긴 하나 선언하는 순간 정수 선언됨. 이후에 "가"처럼 초기화(=값입력) 불가능
//			그니까 var num = 10; (o) var num; num = 10; (x)