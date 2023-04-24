package ex01;


class Tv1{ //Tv의속성(멤버변수)
	//인스턴스 생성될때 기본으로 내부에 생성되는 변수

	String color; 		//색상
	boolean power;		//전원
	int channel;		//채널

//Tv의 기능
	void power() {power = !power;} 	//power변수에 true or false값을 주는 메서드
	void channelup() {++channel;}	//channel변수에 변화를 주는 메서드
	void channeldown() {--channel;}
	
}
	
	class TvTest2{
	
	public static void main(String[] args) {
		Tv1 t1 = new Tv1();
		Tv1 t2 = new Tv1();

		System.out.println("t1의 channel값은" + t1.channel + "입니다");
		System.out.println("t2의 channel값은" + t2.channel + "입니다");

		t1.channel = 7;
		System.out.println("t1의 채널값을 7로 변경");
	


		System.out.println("t1의 channel값은" + t1.channel + "입니다");
		System.out.println("t2의 channel값은" + t2.channel + "입니다");
		
	}
//패키지 내에 같은 클래스정의가 있어선 처리 안됨
}
