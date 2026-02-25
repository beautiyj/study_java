package p260225.quiz;

//혼공자 02-3 타입변환 / 강제타입변환 부분 문제 97-98p

public class CastingExample {
	
	public static void main(String[] args) {
		
		//강제 형변환 - 큰 사이즈의 자료형을 강제로 작은 크기 자료형으로 변경
		
		int intValue = 44032;
		char charValue = (char) intValue;
		System.out.println(charValue);

		long longValue = 500;
		intValue = (int) longValue;
		System.out.println(intValue);

		// 해당 형태 가장 많이 사용함
		double doubleValue = 3.14;
		intValue = (int) doubleValue;
		System.out.println(intValue);
	}
}

// 가
// 500
// 3

//	자동형변환의 경우는 기존의 바이트변수에 - 정수 바이트변수를 새롭게 지정만 하면 됨
//	byte byteValue = 1;
//	int intValue = byteValue;
//	System.out.println(intValue)

//	강제형변환의 경우는 기존의 바이트 변수에 - (새롭게 형태 지정 필요)<< 앞의 괄호로 강제 지정
//					기존 숫자 새로운 지정값 문자형일 경우엔 char c = (char)i; 앞뒤로 형태 입력
//	long longValue = 1000;
//	intValue = (int) longValue;
//	System.out.println(intValue)
	