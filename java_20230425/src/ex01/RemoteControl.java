package ex01;


//인터페이스 선언
public interface RemoteControl {

	//상수 (public static final) 생략가능
	
	public static final int MAX_VOL = 10;
	int MIN_VOL = 0;
	
	public void trunOn();
	public void trunoff();  // 텔레비전 클래스 내에서 구현을해야만 작동
	//추상메소드

	
	//디폴트메서드 --인터페이스에서 사용, 재정의 필요없음, 하고싶으면 퍼블릭 붙이기
	default void setMute(boolean mute) {
		if (mute)
			System.out.println("무음모드");
		else
			System.out.println("무음모드 해제");
	}
	
	 //정적메소드 퍼블릭 생략 가능
	public static void changeBattery() {
		System.out.println("건전지를 교체합니다");
	}
}
