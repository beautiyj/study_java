package p260225;

public class Testvar2 {
	public static void main(String[] ar) {
		int[] score = { 80, 90, 100 };
		for (int j = 0; j < score.length; j++) {
			  System.out.println(score[j]+"\t");
        }
	}
}

// List를 인터페이스라고 하네 참조형변수
/*출력은
 * 80
 * 90
 * 100
 * 으로나옴.
 * */