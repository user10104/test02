package java_20230414;

public class Exam_02_03 {

	/*
	 * void main(int num) {
	 * }
	 * ex) string main (int) => main이라는 함수 안에 int를 입력받고 String으로 출력
	 * 
	 * void : 변환타입, main : 함수명, () : 매개변수 타입
	 * {} : 함수가 수행 문장
	 * 
	 * 3. 더하기 : 반환타입 o, 매개변수x
	 * 
	 * 
	 * 실수값을 전달하면 실수값을 정수로 변환해서 돌려주는 함수 작성.
	 * 
	 * 실수값을 전달하면 실수값을 정수로 변환해서 출력하는 함수 작성
	 */
	public static void main(String[] args) {

		System.out.println("프로그램 시작");

		//함수 전달 어떻게?
		add(20,30); //int number < 반환할게 없어서 안된다.
		convertInt(56.3); //여따가 넣어도되고..
		
		
		
	 	System.out.println("프로그램 끝  "+ "." );
		
	}

	static void add(int num1 , int num2) {
		System.out.println("더하기 : " + (num1+num2));
		
	}
	
	static void convertInt(double f) {
		int result = (int)f;
		System.out.println(result);
	}
	
}
	


