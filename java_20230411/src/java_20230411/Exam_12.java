package java_20230411;

import java.util.Scanner;

//랜덤함수 1~100사이 숫자를 가지고있다
//유저가 컴퓨터 숫자를 맞추는 게임


public class Exam_12 {

	public static void main(String[] args) {

		Scanner sc = new Scanner (System.in);
		
		
		int com = (int)(Math.random()*100)+1;
		int user = 0;
		int count = 0;
		
		while(true) {
			System.out.println("정수 입력>");
			user = sc. nextInt();
			count++;
			
			if(com == user) {
				System.out.println("정답");
				break;
				
			}else if (com>user)
				System.out.println("com은 큰 수 입니다.");
				else if (com<user)
					System.out.println("com은 작은 수 입니다");
				
			}
			
		System.out.println(count + "회만에 맞춤");
		System.out.println("com: "+ com + ", user : " + user);
		
		}
	
	}
	
	
