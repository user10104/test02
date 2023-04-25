package ex04;

public class Exam {

	public static void main(String[] args) {

		Car car = new Car();
		car.run1();
		car.run2();
		car.run3(new Tire(){
			public void roll() {
				System.out.println("익명 자식 객체 3이 굴러감");
			}
	});

		car.run3(new Tire() {
			@Override
			public void roll() {
				System.out.println("Sample2 재정의");
			}
		});
	}
}