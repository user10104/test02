package ex05;

import ex04.override;

public class Home{
	
	private RemoteControl11 rc = new RemoteControl11(){
	
	@Override
	public void turnOn() {
		System.out.println("Tv On");
		
	}
	
	@override
	public void turnOff() {
		System.out.println("Tv Off");
	
}
	
};

public void use1() {
	rc.turnOn();
	rc.turnOff();
	
}

public void use2(RemoteControl11 rc) {
	rc.turnOn();
	rc.turnOff();
	}
}