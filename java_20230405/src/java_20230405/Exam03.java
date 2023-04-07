package java_20230405;

public class Exam03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 10; //num을 10으로정의
		int sum = 0; // sum을 0 ''
		int tmp = 0;// tmp 0
		
		tmp = ++num; // num(10) + (++) = 11 을 tmp값으로 정의
		sum = num++; // 
		
		System.out.println("tmp :" + tmp); //출력할때 'tmp :' 옆 tmp값이 출력된다
		System.out.println("num :" + num);
		System.out.println("sum :" + sum);
	}

}
