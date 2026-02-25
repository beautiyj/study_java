package p260225.quiz;

// 혼공자 02-3 타입변환 / 자동타입변환 부분 문제 96p

public class PromotionExample {
	public static void main(String[] ar) {

		// 자동 형변환 - 작은 자료형->큰 자료형 변수에 저장하는 경우
		// 크기순으로 바이트1 쇼트2 정수4 롱8 실수4 더블8
		byte byteValue = 10;
		int intValue = byteValue;
		System.out.println("intValue: " + intValue);

		char charValue = '가';
		intValue = charValue;
		System.out.println("가의 유니코드: " + intValue);

		char c = 'a';
		int i = c;
		System.out.println("i=" + i);

		intValue = 50;
		long longValue = intValue;
		System.out.println("longValue: " + longValue);

		longValue = 100;
		float floatValue = longValue;
		System.out.println("floatValue: " + floatValue);

		floatValue = 100.5f;
		double doubleValue = floatValue;
		System.out.println("doubleValue: " + doubleValue);

	}
}

//	intValue: 10
//	가의 유니코드: 44032
//	i=97 A일땐65
//	longValue: 50
//	floatValue: 100.0
//	doubleValue: 100.5