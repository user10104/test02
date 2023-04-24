package ex05;

class 사람{ // 부모
	String name = "홍길동";
	int age = 20;
	public 사람(String name, int age) {
		this.name = name;
		this.age = age;
	}
		void info() {
			System.out.println(name + "," + age);
		}
		
	}


class 구본우 extends 사람{  //이걸 위에가 상속함 //자식
	double weight;
		public 구본우 () {
			super("구본우", 29);
	
	
}void display() {
	
//	public 구본우(String name, int age, double weight) {
//		this.name = name;
//		this.age =age;
//		this.weight = weight;
//		}
	
	
	
	}
class 추명선 extends 사람 {

	double height;
		public 추명선() {
		super("추명선", 29);
	}
//	public 추명선{String name, int age, double height){	
//		this.name = name;
//		this.age = age;
//		this.height = height;
//		}	
	
class 박종진 extends 사람{

	String grade;
		public 박종진 () {
		super("박종진", 29); //매개 변수 x
//	public 박종진(String name, int age, String grade) {
//		this.name = name;
//		this.age = age;
//		this.grade = grade;
//		}
	
	}
//		System.out.println(name + ", " + age + ", " + height);

	}
}

public class StudentExam {

	public static void main(String[] args) {
		
		구본우 구 = new 구본우();
		구.info();
		

//		추명선 추 = new 추명선("홍길동", 20, 178.4);
//		추.display();
//		
//		구본우 구 = new 구본우("까미", 15 ,8);
//		구.display();
//		
//		박종진 박 = new 박종진("")
	}

}}