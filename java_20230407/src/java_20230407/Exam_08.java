package java_20230407;

import java.util.Scanner;

//컴퓨터와 가위바위보

public class Exam_08 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int com = (int)(Math.random()*3)+1;
		
		System.out.println("1(S), 2(R), 3(F) 중에 한가지를 입력하세요.");
		
		int user = sc.nextInt();
		
		
		
		switch(user-com) {
		case 0 :
			System.out.println("Draw");
			break;
		case -2:
		case 1 :
			System.out.println("User win");
			break;
		case -1: //일일히 Sysout을 적을 필요없이 케이스를 아래에 바로 단다
		case 2 :
			System.out.println("user lose");
			break;
	
		}
		System.out.println("User : " + user + ",Com : " + com); //오타 주의 " 안에 콤마
				
		
	}

}
