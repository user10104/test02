package ex01;

public class Tmptest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x = 123, y = 321; //변수 x의 값은 123, y의값은 321 로 둔다
		int tmp= 0; //x값을 임시로 저장할 변수를 선언, tmp의 값은 0 으로 둔다
		System.out.println("x:"+ x + "y:" + y);
		
		tmp = x; // x 에 저장된 값을 변수 tmp에 저장한다는 뜻, x의 123 이 tmp에 저장
		x = y; // x = y; 변수 y에 저장된 값을 변수 x에 저장한다는 뜻, y의 321이 x값에 저장
		y = tmp; // tmp에 저장된 값을 변수 y에 저장한다는 뜻, 먼저 저장되었던 x의 값 123이 tmp에 저장되었다가 변수 y에 저장
		
		System.out.println("x:"+ x + "y:" + y);
	}

}
