package ex04.copy;

public class Exam04 {
	
	private String name;
	private int num = 100;
	// public > 다른 패키지에서도 접근 가능
	// private> 다른 패키지에서는 접근 불가
	void setName(String name) {
		this.name = name;
	}
	String getName(){
		return name;
	}
	
	void setNum(int num) {
		this.num=num;
	}
	int getNum() {
		return num;
	
	}
}

class Study{
	int count = 0;
	
}