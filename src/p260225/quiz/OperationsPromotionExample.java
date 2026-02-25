package p260225.quiz;

//혼공자 02-3 타입변환 / 타입변환 연산 부분 문제 103p

public class OperationsPromotionExample {

	public static void main(String[] args) {

		byte byteValue1 = 10;
		byte byteValue2 = 20;
//		byte byteValue3 = byteValue1 + byteValue2	//바이트나 쇼트끼리 더하면 자동으로 int변환(암튼작은건에러)
		int intValue1 = byteValue1 + byteValue2;
		System.out.println(intValue1);
		//30

		char charValue1 = 'A';
		char charValue2 = 1;
//		char charValue3 = charValue1 + charValue2;	//산술연산자가 있으면 문자형도 정수가 됨
													// ->정수/문자형 형변환 필요한상태가됨
		int intValue2 = charValue1 + charValue2;
		System.out.println("유니코드=" + intValue2);
		System.out.println("출력문자=" + (char) intValue2);
		//유니코드=66
		//출력문자=B

		int intValue3 = 10;
		int intValue4 = intValue3 / 4;
		System.out.println(intValue4);
		//2
		
		int intValue5 = 10;
//		int intValue6 = 10 / 4.0;	//정수와 실수 모두 같은 숫자더라도 자료형이 다르면 산술 불가
		double doubleValue = intValue5 / 4.0;	// 그래서 실수형태로 자동형변환 후 산술
		System.out.println(doubleValue);
		//2.5
		
		int x = 1;
		int y = 2;
		double result = (double) x / y;	//이건 둘 다 정수더라도 실수형 더블로 강제형변환 산술해서 가능
										//만약 더블이 없을 경우-자동형변환이 진행돼서 0.0 (연산먼저-형변환은그후)
		System.out.println(result);
		//0.5
	}

}
