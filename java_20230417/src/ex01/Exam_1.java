package ex01;

// Tv 클래스 설계     / 예 ) int num , int kor
class Tv {
		//멤버변수, 필드
	
		String color;
		boolean power;
		int channel;
		
		//메소드, 멤버함수
		void power() { power = !power; }
		void channelUp() {channel++;}
		void channelDown()	{channel--;}
		
}
		
		

public class Exam_1 {

	public static void main(String[] args) {

		int num = 10;
		int kor = 90; //위와 같은 int형이지만 뭔가 다름
		
		Tv tv =  new Tv();
		
		
		tv.color = "검정";
		tv.channelUp();
		tv.channelDown();
		System.out.println(tv.color);
		System.out.println(tv.channel);
		
		Tv lgtv = new Tv();  //위와는 다른 Tv
		lgtv.color = "흰색";
		System.out.println(lgtv.color);
		System.out.println(lgtv.channel);
	
	
	}

}
