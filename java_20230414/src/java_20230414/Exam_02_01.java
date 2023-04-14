package java_20230414;

public class Exam_02_01 {

	/*
	 * void main(int num) {
	 * }
	 * ex) string main (int) => main이라는 함수 안에 int를 입력받고 String으로 출력
	 * 
	 * void : 변환타입, main : 함수명, () : 매개변수 타입
	 * {} : 함수가 수행 문장
	 * 
	 * 1. 더하기 : 반환타입 o, 매개변수o
	 * 
	 * 
	 * 실수값을 전달하면 실수값을 정수로 변환해서 돌려주는 함수 작성.
	 */
	public static void main(String[] args) {

		
		//아래 static int까지의 내용은 계산해서 나온 값을 호출 해주는 역할
		System.out.println("프로그램 시작");
		int num = add(10,20); //add (10,20) < 이것만 있어선 그냥 값만나오고 출력되진않음, 결과를 내보내줄 변수 추가가 필요합니다
		int number = convertInt(10.2); // 10.2라는 실수를 정수로 변환해서 돌려줌, 출력값은 10. 
		System.out.println("프로그램 끝" + ","+ num+","+number );
		
	}
	
	static int convertInt(double f) { //'convertInt'함수 호출을 해주어야 한다
		int result = (int)f; //실수값을 입력하면 int(정수화)값으로 돌려주는 함수를 지정하는것이다.
		return result ;
		
	}
	
	
	
	static int add(int n1, int n2) {
		
		//n1과 n2 을 더해주는 add함수를 세워놓는다.
		//결과를 출력해달라고 써두었다.
		//add(n,n)형태로 쓰면 그 수를 더한 수를 계산하겠다. 라는 함수이다
		
		System.out.println("add함수 시작 . . .");
		int result = n1+n2;
		return result ;
	}
	
	
	}
	


