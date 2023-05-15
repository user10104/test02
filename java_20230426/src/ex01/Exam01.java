package ex01;

public class Exam01 {

	public static void main(String[] args) {
		System.out.println("-Program On-");
		printlength("This is Java");
		printlength(null);
		System.out.println("=Program Off-");
		
	}

	private static void printlength(String data) {
		int result = 0;
		try {
			result = data.length();
		}catch(NullPointerException e) {
//		System.out.println(e.getMessage());
//		System.out.println(e.toString());
		e.printStackTrace();
		}
		
		System.out.println("문자수 : "+ result);
		
	}

}
