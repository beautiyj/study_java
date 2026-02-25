package p260225;

import java.util.Date;
import java.util.Random;

public class TestMethod {
	public static void main(String[] ar) {
		Date n = new Date();
		System.out.println(n);

		main2(ar); // 코틀린이랑같네
	}

	public static void main2(String[] ar) {
		Random n = new Random();
		System.out.println(n.nextInt(5));
		
		// 원래 자료형 넣어야하는데 최신판에선 var 사용가능
		// 그리고 val은없지만 final var로 사용가능함.
		var a = new Date(); 
		var b = new Random();
		System.out.println(a);
		System.out.println(b.nextInt(5));
	}
}

//public static void main2(String[] ar) { } 이건 무조건필수임 fun main()과 동일
// 대신 코틀린과 달리 자바는 더 상위에 퍼블릭 클래스라는 파일이 존재
// 모든 줄에서 ; 사용 필요