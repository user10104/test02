package ex04;

public class Car {
	private Tire tire = new Tire();
	
	private Tire tire2 = new Tire(){
		public void roll() {
			System.out.println("익명 자식 Tire객체 1이 굴러감");
			
		}
		public void test() {//접근불가
			System.out.println("익명 자식 Test");
		}
		
};
public void run1() {
	tire.roll();
	tire2.roll();
	
}
	//익명자식객체 => 부모클래스를 상속받아 아래같이 생성'{}'구현부 갖고있음
	public void run2() {
		Tire tire = new Tire() {
			@Override
			public void roll() {
				System.out.println("익명 자식 객체 2가 굴러감");
			}
		};
		tire.roll();
	}
	public void run3(Tire tire) {tire.roll();}
	//tire = new tire() {
	//	@Override
	//public void roll(){
	//	Sysout("익명자식객체3굴러감")
	}

	
