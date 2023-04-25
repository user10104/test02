package ex05;

public class MainExam {

	public static void main(String[] args) {
		Home home = new Home();
		home.use1();
		//home.use2(이자리는 RemoteControl11구현객체가 와야한다)
		home.use2(
				new RemoteControl11() {
					
					@Override
					public void turnOn() {
						System.out.println("Audio On");
					}
						@Override
						public void turnOff() {
							System.out.println("Audio Off");
						}
					}
				
				
				);
		
	}
	
}
