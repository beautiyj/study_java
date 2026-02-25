package p260225;

import java.util.ArrayList;
import java.util.List;

public class TestList {
	
    public static void main(String[] ar) {
        List<Object> list = new ArrayList<>();
        list.add(30);
        list.add(3.14);
        list.add('j');
        list.add(true);
        list.add("자바");
		for(int k=0; k<list.size(); k++) {
			System.out.print(list.get(k)+"\t");
		}
    }
}

// 출력: 30	3.14	j	true	자바	 
// 			전부 띄어쓰기 됨

// 상속 부분에서 업캐스팅, 다운캐스팅 자동형변환 강제형변환 나옴.

// List list = new ArrayList(); 되긴하는데 거슬리게 경고 표시뜸
//그리고          이걸 레퍼런스 형변환(업캐스팅이라고함. 자동형변환)

// list = new List(); //이건에러임. 인터페이스는 자체객체생성불가하기때문

// 			System.out.print(list.get(k)+"\t");
						//	배열은 인덱스사용가능, 인터페이스인 리스트는 객체라서 메소드로 활용.
						// \t 이건 들여쓰기균등하게넣어주고 + 문자열 자동형변환시킴.
