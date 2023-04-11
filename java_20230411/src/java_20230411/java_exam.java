package java_20230411;

import java.util.Scanner;

/*	1. n개의 숫자를 받을 지 물어보는 코드를 작성 후
*	2. 숫자를 받아서 짝수의 값만 합해서 나오는 코드를 작성
*	3. 소수점이나 문자를 받으면 다시 쓰라고 해야 하며 일을 끝내야 함.(예시 : 잘못 입력하셨습니다.)
*
*	정수만 5회 입력 90,80,88,66,55 => 90+80+66 합을 구해서 출력
*
*	정수만 5회 입력 90,66.7,50,55,aa => 안됨
*
* % 랑 count 활용
*/
public class java_exam {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
	
		int num = 0;
		int user = 0;
		int count = 0;
		
		while(num %2 == 0) {
			System.out.println("정수 입력>");
			user = scanner. nextInt();
			count++;
			
		 
				
			else if (num%2>=0)
				System.out.println("올바른 수를 적어 주세요");
				else if (count>5)
					break;
					
				
			}
			
		System.out.println(count + "회만에 맞춤");
		System.out.println("com: "+ num + ", user : " + user);
		
		}
	

}
	
