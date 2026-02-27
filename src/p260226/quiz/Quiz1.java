package p260226.quiz;

import java.util.Scanner;

public class Quiz1 {
	public static void main(String[] ar) {
		System.out.println("5과목의 점수를 입력하시오. 단, ',' 생략하여 숫자만 입력할 것.");
		Scanner sc = new Scanner(System.in);

		int scores[] = new int[5];
		int total = 0; // 과목 합산
		boolean isPass = true; // 합격의 경우

		// 1. 과목 과락 먼저 확인
		for (int i = 0; i < scores.length; i++) {
			scores[i] = sc.nextInt();
			total += scores[i];
			if (scores[i] < 40) {
				isPass = false;
			}
		}

		double avg = total / 5.0; // 평균

		// 2. 평균 확인
		if (isPass && avg >= 60) {
			System.out.println("합격");
		} else {
			System.out.println("불합격");
		}
		sc.close();
	}
}

/*
 * 논리 연산자
 * 
 * 5과목의 점수를 키보드로 입력 받았을 때, 합격과 불합격을 판별하는 프로그램 작성 각 과목 당 과락은 40점이고, 평균 60점 이상 받아야
 * 합격한다.
 */