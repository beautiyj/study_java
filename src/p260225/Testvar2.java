package p260225;

public class Testvar2 {
	public static void main(String[] ar) {
		int[] score = { 80, 90, 100 };
		for (int j = 0; j < score.length; j++) {	// 인덱스 활용 시 홀짝 가능
			System.out.println(score[j] + "\t");
		}
		main2(ar);
	}

	public static void main2(String[] ar) {
		int[] score = { 80, 90, 100 };
		for (int s : score) {				// 인덱스 없이 모든 데이터를 볼 때
			System.out.println(s + "\t");
		}
	}
}

// List를 인터페이스라고 하네 참조형변수
/*
 * 출력은 80 90 100 으로나옴.
 */

//	자바 for 반복문의 서식
//	for ( 초기화식 ; 조건식 ; 증감식 ) {
//  	  // 반복할 코드
//	}