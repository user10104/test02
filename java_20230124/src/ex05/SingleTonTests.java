package ex05;

import java.util.Calendar;

class Sample{

}

class Singleton{
	private static Singleton instance;
private Singleton() {}
public static Singleton getInstance() {
	if(instance == null)
		instance = new Singleton();
	return instance;
}

}
public class SingleTonTests {

	public static void main(String[] args) {

		Sample s1 = new Sample();
		Sample s2 = new Sample();
		
		System.out.println(s1 == s2);
		System.out.println("-------------------");
		
		//Singleton sing1 = new Singleton(); 			에러 이유는? : 외부 클래스에서는접근불가, 같은 클래스 내에서만 이용 가능.그냥 일반 클래스 내라면 가능 
		Singleton sing1 =Singleton.getInstance();// 	private 내 static 매서드는 "클래스명. 함수명"으로 호출
		Singleton sing2 =Singleton.getInstance(); 	
		System.out.println( sing1 == sing2 );//			->같은 객체를 가리킴
	//true!
		System.out.println("--------------------");
		
		Calendar now = Calendar.getInstance();
		System.out.println(now.getTime());
	
	}

}
