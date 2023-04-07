package java_20230406;

import java.util.Scanner;
//성별, 나이 => 남, 나이가 20 이상일대 복무대상 , 아닐시 대상자 아님을 출력

public class Exam_07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
	
		System.out.println("남성, 여성중 귀하의 성별에 해당하는 항목을 입력하세요");
		String gen = sc.nextLine();
		
		
		System.out.println("나이를 입력하세요.");
		int age = sc.nextInt();
		
		/*주의!! 만약 13~14열 과 17~18열의 순서가 바뀌면 성별을 묻지 않고 비정상적인 출력 후 종료된다. 치명적 오류이다. 주의하도록 하자. 
		*해결방법 나이를 묻는 항목 위에 sc.nextline(); 를 추가한다. 버퍼에 있는 엔터를 제거하는 기능이다.
		* https://medium.com/@kimddub/java-scanner-%EB%B2%84%ED%8D%BC-%EB%B9%84%EC%9A%B0%EA%B8%B0-913c652cc144 이해가 되지 않을때 참고
		* "nextInt() 는 입력값으로 들어온 값 중에 Enter나 공백을 기준, 그 앞의 Int형 값을 가져옵니다! 위 코드의 경우 정수를 가져왔으며, 큐에 남아있는 값은 Enter입니다.
		*nextLine() 은 큐에 남은 것들을 문자열로 가져와버립니다.
		*그래서 Enter 값을 공백 문자열로 가져와버리고 끝나기 때문에 출력 단계로 넘어간 것입니다.
		*/
		
		
		//문자열 비교는 항상 equals
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
