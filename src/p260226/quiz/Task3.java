package p260226.quiz;

import java.util.Scanner;

public class Task3 {

	public static void main(String[] ar) {

		Scanner sc = new Scanner(System.in);
		System.out.print("팩토리얼을 구할 숫자를 입력하세요: ");
		int n = sc.nextInt();
		int result = 1;

		// 3! = 3*2*1
		for (int i = n; i > 0; i--) {
			result *= i;
		}

		System.out.println("result: "+n+"! = " + result);

	}

}

/*
 * 3. 키보드를 이용해서 입력한 정수의 팩토리얼 구하기
 * 
 * 예시: 3! = 3 * 2 * 1
 * 
 */