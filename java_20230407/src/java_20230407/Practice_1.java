package java_20230407;

import java.util.Scanner;

public class Practice_1 {

	public static void main(String[] args) {

	Scanner sn = new Scanner(System.in); // sc,sn주의

	//nextline, nextInt
	
	System.out.println("나이를 입력하세요.");
	int age = sn.nextInt();
	sn.nextLine(); 
	//입력 버퍼에 남아있는엔터를 제거해야 하기 때문, 제거하지 않으면 String name = sn.nextLine() 이 문장에서 엔터를 문장으로 인식, 버퍼에 남은 엔터를 name변수에 추가
	System.out.println("남성, 여성중 귀하의 성별에 해당하는 항목을 입력하세요");
	String gen = sn.nextLine();
	
	if (age >= 20) {
		if (gen.equals("남성")) {
			System.out.println("군복무대상");
		} else {
			System.out.println("대상이 아닙니다");
		}
		
	} else {
		System.out.println("대상이 아닙니다");
	}
		
	
	
	System.out.println("프로그램 종료");


	
	}
}
