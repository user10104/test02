package java_20230406;

/*
 * 나의 이름, 주소, 나이 (만으로 입력) 를 입력받고 출력하는 프로그램 작성.. (단 나이는 +1 해서 출력)
 */

import java.util.*;

public class Exam01 {

	public static void main(String[] args) {
	
		Scanner sn = new Scanner(System.in);
		//nextline, nextInt
		
		
		System.out.println("이름을 입력하세요.");
		String name = sn. nextLine();
		System.out.println("주소를 입력하세요.");
		String address = sn.nextLine();
		System.out.println("나이를 입력하세요.");
		int age = sn.nextInt();
	
		System.out.println("이름 : " + name);
		System.out.println("주소 : " + address);
		System.out.println("나이 : " + (age+1));

	}

}
