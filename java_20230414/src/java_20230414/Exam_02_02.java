package java_20230414;

public class Exam_02_02 {

	/*
	 * void main(int num) {
	 * }
	 * ex) string main (int) => main이라는 함수 안에 int를 입력받고 String으로 출력
	 * 
	 * void : 반환타입, main : 함수명, () : 매개변수 타입
	 * {} : 함수가 수행 문장
	 * 
	 * 2. 더하기 : 반환타입 x, 매개변수 x
	 * 
	 * 
	 * 실수값을 전달하면 실수값을 정수로 변환해서 출력하는 함수 작성
	 */
	public static void main(String[] args) {

		System.out.println("프로그램 시작");

		//함수 전달 어떻게?

		int i = add();
		
		System.out.println(i);
		
	 	System.out.println("프로그램 끝  "+ "." );
		
	}
	static int add() {
		int num = 10+20;
		return num ;
		
	}
	
	
	
}
	


