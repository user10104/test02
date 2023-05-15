package ex01;

class Person{
	private String name;
	private int age;
	Person(String name , int age){
		this.name=name;
		this.age =age;
		
	}

	//기능추가
	@Override
	public String toString() {
		return " 이름: "+ name + " / 나이: " + age;
	}
}
	class Student extends Person{
	
		private int grade;
		
		public Student(String name, int age,int grade) {
		super(name, age);
		this.grade=grade;
		}
		@Override
		public String toString() {
//			System.out.println(super.toString()+"학년: "+grade+"학년");
			return super.toString()+" / 학년: " + grade + "학년 ";
		}
}

	
	

public class Exam01 {

	public static void main(String[] args) {
		Person p = new Student("홍길동",20,3);
//		p.toString();
		System.out.println(p.toString());
	}

}
