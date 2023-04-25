package ex01;

public class RemoteControlExam {

	public static void main(String[] args) {

		RemoteControl rc = new Television();
		rc.trunOn();
		
		rc = new Audio();
		rc.trunOn();
		rc.setMute(true);
		
		Television tel = new Television();
		tel.search(null);
		
		
		System.out.println(RemoteControl.MAX_VOL);
		RemoteControl.changeBattery();
		
	}
	void test () {}

}
