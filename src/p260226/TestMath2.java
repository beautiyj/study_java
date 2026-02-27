package p260226;

public class TestMath2 {
	public static void main(String[] ar) {
		String str1 = "자바";
		String str2 = str1 + "오라클";
		System.out.println("str1 = " + str1);
		System.out.println("str2 = " + str2);

		String str3 = "Python";
		String str4 = "Spring";
		System.out.println(str3 + str4);

		int i = 50;
		System.out.println(str3 + i);	//Python50

		String str5 = str3 + 50;
		System.out.println("str5 = " + str5); //Python50
	}
}
