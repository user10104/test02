package ex01;

class student{
	String name; 
	String address;
	int age;
	
	
	
	static int count; 	// 메소드영역의 카운트 , 그냥 int count와 달리 결과마다 누적된다. 공유 변수기 때문에 한
						//곳에서 수정되면 이것도 같이 수정된다
						//스태틱 - 멤버변수에선 활용하지않는다
	
	
		void displyInfo() {
		
			count++;
			info();
			System.out.println(name + ", " + age + ", " + address + 
				" 현재 학생 수 : " + count);
	}
	
		static void info() {
			


		}		
		
}
public class StudentTest {
	
	


	public static void main(String[] args) {
		
		student kim = new student();
		kim.name = "김씨";
		kim.age = 20;
		kim.address = "수원";
		

		student park = new student();
		park.name = "박씨";
		park.age = 200;
		park.address = "천당";		
				
		student lee = new student();
		lee.name = "이씨";
		lee.age = 50;
		lee.address = "부산";
		
		
		student hong = new student();
		hong.name = "홍씨";
		hong.age = 80;
		hong.address = "서울"; 
		
		kim.displyInfo();
		park.displyInfo();
		lee.displyInfo();
		hong.displyInfo();
		
	}

}
