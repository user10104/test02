package ex07;

import ex04.override;

public class CalExam01 {

	public static void main(String[] args) {
		Calculable cal = new Calculable() {
			
			@Override
			public void calculate(int x, int y) {
				System.out.println("x+y : " + (x+y));
			}
		};
		cal.calculate(5, 2);//재정의 형식 , 재정의를 할땐 인터페이스 안에 메소드 정해주어야함
		
		
		
		//-> 람다식
		cal = (int x, int y)-> {
				System.out.println("x-y : "+ (x-y));
			
		};
cal.calculate(15, 7);



cal = (x, y)-> System.out.println("x-y : "+ (x-y));
	

cal.calculate(15, 7);

Calculable cal2 = new Sub();
cal2.calculate(5,5);
	}

}
