package java_20230414;

//호출 함수에게 실수값을 전달하면 호출함수에서 정수로 변환해서 출력, 출력없는메소드

//더하기:반환타입x, 매개변수x
//

public class Exam_03 {

	public static void main(String[] args) {

		System.out.println("프로그램 시작");
		
		add();
		
		System.out.println("프로그램 끝" + ".");
	}
	
		static void add() { 
			int num = 10;
			int num2 = 20 ;
			
			System.out.println(num+num2);
	}

}
