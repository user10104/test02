package ex01;
//RemoteControl 인터페이스 구현
public class Television implements RemoteControl, Searchable{

	@Override
	public void trunOn() {
		System.out.println("Tv를 켭니다.");
	}
	public void trunOff() {
		System.out.println("Tv를 끕니다.");
	}
	public void search(String url) {
		System.out.println(url+"를 검색합니다");
	}
	@Override
	public void trunoff() {
	}

}
