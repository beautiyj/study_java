package p260224;

import java.util.Date;
import java.util.Random;

public class Test {
	// 접근제어자 퍼블릭 테스트가 사용자 정의 클래스. 자바에서는 클래스명-파일명 동일해야함, 대소문자구분
	public static void main(String[] args) {
		// 메인메소드 (=함수) 괄호잇는건거의다메소드
		//  매개변수,괄호위치는바꾸기가능. String ar[] 가능
		// main() 메소드는 자바 가상머신 jvm, java.exe 이 가장 먼저 호출하는 메소드
		// 1개의 클래스가 독립적으로 실행되려면 이거 필요함 fun~ 안드로이드딱그느낌이네
  System.out.println("자바출력 성공");
  System.out.print("자바");
  System.out.print("oracle");
  System.out.print("print사용시 줄바꿈없이 문장붙어서출력");
 
  System.out.println("\n");
  System.out.println("줄바꿈은\n이거동일하네");
  
  Date d = new Date();	// 오늘 날짜 + 현재 시각 출력 메소드
  System.out.println(d);
  
  Random r1 = new Random();
  Random r2 = new Random();
  System.out.println(r1.nextInt(10));	// 0~9까지 범위 중 랜덤출력
  System.out.println(r2.nextInt(10)+1);	// 0~9까지 범위 중 무조건 +1이니까 1~10 출력임.
  
  }
}

// 글씨사이즈는 컨트롤+ +- 눌러야함 휠로안됨

// 주석단축기 컨트롤+/

//이건 컨트롤시프트

// 워크스페이스 메소드? 나눠서하는거설정해놔서 bin - src두곳에존재,

/*
 * package p2026_02_24;
 * 
 * public class Test { public static void main(String ar[]) {
 * System.out.println("문자열 출력"); } }
 */

// String[] args 위주로쓴다고함

// 자바.베이스는 모듈이고 그안의 자바.랭 이런건패키지, 내부엔 클래스(바이트코드로되어있음)대표적으로 String System