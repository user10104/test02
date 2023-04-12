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
		int count = 0;
		int sum = 0;
		System.out.println("입력 횟수 : ");
		int number = scanner.nextInt();
		
			while (count<number) { 
				System.out.print("숫자 입력: ");
			}
			if(scanner.hasNextInt()) {
				int num = scanner.nextInt();
				if (num%2 == 0) {sum += num;
			}
				count++;
				
			}else if (scanner.hasNextDouble()) {
				scanner.next();
				System.out.println("실수는 입력 불가합니다. 다시 입력하세요");

			}else
			{
				scanner.next();
				System.out.println("문자는 입력 불가합니다. 다시 입력하세요");
				}
			}
	
	
			

}
	
