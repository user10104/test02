package java_20230411;

import java.util.Scanner;

/*
 * 숫자로 이루어진 문자열 str 이 있을 때 각자리의 합을 더한 결과를 출력하는 코드를 완성하라.
 * 만일 문자열이 "1234" 라면 '1+2+3+4+5' 결과인 15 출력이 되어야 한다.
 * [Hint} String charAt(int i)클래스의 을 사용
 */
public class Exam_08 {


	public static void main(String[] args) {

	String str = "12345";
	int sum = 0;
	
	for(int i=0; i < str.length(); i++) { //str의 자릿수는 5. str 자릿수만큼의 수가 지정된다. 계산 유동적
		char tmp = str.charAt(i);
		sum += (tmp-'0'); //문자열1 == 숫자 49 
		
		//위식은 아래처럼도 가능
		//sum += (str,charAt(i)-'0'; //아스키코드, 0 이 48,1출력위해 49-48
		//}
		//System.out.println("sum="+sum);
		//
		
	}
	System.out.println("sum="+sum);
	}

}
