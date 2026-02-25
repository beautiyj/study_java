package p260225;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Testvar {
	public static void main(String[] ar) {
		byte a1 = 1;
		short a2 = 2;
		int a3 = 10;
		long a4 = 100L;

		boolean b1 = true;
		boolean b2 = false;

		char c1 = 'a'; // '' 만 가능함...아헷갈려 문자형은 '' 문자열은 ""
		char c2 = '가';

		double d1 = 42.345;
		
		float f1 = 3.14f;
		float f2 = 3.14F;
		float f3 = (float) 3.14;	// 강제형변환. 뒤에 F안붙이면 이런식으로해야함

		System.out.println("" + a1 + a2 + a3 + a4 + b1 + b2 + c1 + c2);
		// 앞에 "" 넣으면 모두 문자열로 인식함.
		System.out.println(a1 + ", " + a2 + ", " + a3 + ", " + a4 + ", " + b1 + ", " + b2 + ", " + c1 + ", " + c2);
		// 쉼표와 함께 연결하면 이런 식으로
		// a1+a2는 되는데 숫자의 경우 +로 인지해서 12출력이 아닌 1+2=3 출력이 됨.
		System.out.println("" + f1 + f2 + f3);
		// 실수는 printf 사용 (문자열변환시상관없음)
		System.out.printf("%.1f\n",d1);	// \n은가독성용으로 추가함
		//문자열포맷팅도 상관ㄴ
		
		
		//숫자 하나씩 귀찮을 때
		System.out.printf("%d, %d, %d, %d, %b, %s\n", a1, a2, a3, a4, b1, c1);
		System.out.printf("\n");
		
		
		
		// 데이터가 많을때
		String result = Stream.of(a1,a2,a3,a4,b1,b2,c1,c2,d1,f1)
				.map(String::valueOf)
				.collect(Collectors.joining(", "));
		System.out.println(result);
		
		
		//방식2 - 배열과반복문활용
		Object[] data = {a1, a2, a3, a4, b1, b2, c1, c2, d1, f1, f2, f3};
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < data.length; i++) {
		    sb.append(data[i]);
		    if (i < data.length - 1) sb.append(", "); // 마지막엔 쉼표 안 붙이기
		}
		System.out.println(sb.toString());
		
		System.out.printf("\n");

		main2(ar);
	}

	public static void main2(String[] ar) {
		String s1 = "문자열은 변수명 대문자로 시작";		//기본변수는 스택에이름표+힙메모리 특수구역에 주소(하나만)
		String s2 = "그리고 참조형 변수지만 암튼 지역변수";
		String s3 = new String("new사용도 가능");	//근데 이건 스택에이름표+힙메모리 일반에 또 생성되는주소
		System.out.println(s1 + "\n" + s2 + "\n" + s3);
/*
 * 왜 + 연산이 메모리에 나쁜가요?
이제 이 구조에서 "" + a1 + a2를 한다고 생각해보세요.
"" + 1 → 힙에 "1" 생성
"1" + 2 → 힙에 "12" 생성
"12" + 10 → 힙에 "1210" 생성...
이 과정에서 스택에 있는 변수는 최종 결과물인 "1210"만 가리키게 되지만,
중간에 만들어진 "1", "12" 같은 애들은 힙 영역에 갈 곳 잃은 미아가 되어 남아있게 됩니다.
(이걸 나중에 가비지 컬렉터가 치우느라 고생하는 거죠.)

결론: 만약 "자바" 동일하다고 해도 s1 자바와 s2 new 자바는 집주소가 다르다
*/
		
		main3(ar);
	}

	public static void main3(String[] ar) {
		String[] arr1 = { "배열", "array", "아아" };
		System.out.println(java.util.Arrays.toString(arr1));
		// 출력은 [배열, array, 아아] 진심 와 개.~귀찮네
	}
}

// 코틀린과달리 int, Integer 기능이 달라서 대소문자구분 필.
// 클래스나 다른 문자열메소드같은 건 참조형이라는 의미로 대문자 활용, 기본자료형 정수 실수 문자형 논리형은 소문자.