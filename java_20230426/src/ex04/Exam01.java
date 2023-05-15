package ex04;
//예외처리 (Exception Handling
//메서드에 예외 선언하기 (Throws)
import javax.management.loading.PrivateClassLoader;

public class Exam01 {

	public static void main(String[] args) {

		try {
			findclass();	
		}catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("Program Off");
		
	}
//
//	private static void findClass() {
//		try {
			
	private static void findclass() throws ClassNotFoundException{
	Class.forName("java.lang.String");
			
//		}catch(ClassNotFoundException e) {
//			e.printStackTrace();
		}
	}
	

