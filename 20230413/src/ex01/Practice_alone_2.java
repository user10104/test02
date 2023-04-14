package ex01;

import java.lang.reflect.Array;

import javax.net.ssl.SSLEngine;

public class Practice_alone_2 {

	public static void main(String[] args) {

		char[]abc = {'A','B','C','D'};
		char[]num= {'0','1','2','3','4','5','6','7','8','9'};
		System.out.println(abc);
		System.out.println(num);
		
		
		//배열 abc와 num을 붙여서 하나의배열 (result)로 만들기
			char[] result = new char [abc.length + num. length];
					System.arraycopy(abc, 0, result, 0, abc.length);
					System.arraycopy(num, 0, result, abc.length, num.length);  //abc.length < 중요함. abc의 길이 뒤에 입력되어야 모든 내용이 복사된다.
					System.out.println(result);
					
		//배열 abc을 배열 num 의 첫 번째 위치부터 배열 abc의 길이만큼 복사 : abcd(4)만큼			
					
					System.arraycopy(abc, 0, num, 0, abc.length); // abc를 num 첫번째부터 붙여넣는 과정 그래서 num,0 이되어야한다. 복사는 abc.length만큼
					System.out.println(num); //abc가 num안으로 복사되었으니 num을 출력해야겠지? 값은 ABCD456789가 나와야 한다.
		
		//number 의 인덱스 6 위치에 3개 복사			
					System.arraycopy(abc, 0, num, 6, 3); //abc.length 를 뒤에 붙이게 되면 ABCD 모두가 복사된다. 3만쓰면 abc의 첫번째부터 세번째까지만 복사된다.
					System.out.println(num); //나와야하는값은 ABCD45ABC9
					

	}

}
