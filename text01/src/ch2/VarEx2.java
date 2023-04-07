package ch2;

public class VarEx2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x = 10;
		int y = 20;
		System.out.println("x:" + x); //ctrl+alt+아래방향키: 줄복사
		System.out.println("y:" + y); 
		System.out.println("---------------");//결과의 가시성을 위한 점선
		
		int tmp = x;//x의값을 tmp에 저장한다는 뜻
		x = y;//y의값을 x에 저장한다는 듯
		y = tmp;//tmp의 값을 ...
		System.out.println("x:" + x); //ctrl+alt+아래방향키: 줄복사
		System.out.println("y:" + y); //행을 파랗게 선택 후 alt+방향키로 줄을 바꿀수 있다.
		System.out.println("tmp:" + tmp);//tmp의 값도 출력가능 

	}

}
