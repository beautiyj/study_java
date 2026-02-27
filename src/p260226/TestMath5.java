package p260226;

public class TestMath5 {

	public static void main(String[] ar) {

		int a = 10, b = 10, c = 10, d = 10;
		int a1, b1, c1, d1;
		a1 = ++a;	// a+1 = 11이 된 상태에서 a1=a=11
		b1 = b++;	// b=10, b1=b+1 = 10+1 = 11
		c1 = --c;	// c-1 = 9에서 c1 = c = 9
		d1 = d--;	// d=10, d1=d-1 = 10-1 = 9
		
		System.out.println("a1= " + a1 + " a= " + a);
		System.out.println("b1= " + b1 + " b= " + b);
		System.out.println("c1= " + c1 + " c= " + c);
		System.out.println("d1= " + d1 + " d= " + d);
	}

}
