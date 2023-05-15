package ex01;
	
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ReaularExam01 {

	public static void main(String[] args) {
		

		//wrapper클래스: 기본형을 객체로만들어준다

		
		String str = "121111111134567890";
										//숫자만입력
		Pattern p = Pattern.compile("^[0-9]*$");//정규식
		Matcher m = p.matcher(str);//str이 정규 표현식과 일치하는지 판단
		
		System.out.println(m.find());
		//숫자만 -> True 문자 섞여있을 시 -> false

			System.out.println("-----------------------------");
	String str2 = "ABC123";
	Pattern p2 = Pattern.compile("^[0-9A-Z]{6}$");
	Matcher m2 = p2.matcher(str2);
	System.out.println(m2.find());
	

			System.out.println("-----------------------------");
	String str3 = "aa111@naver.com";
	Pattern p3 = Pattern.compile("[\\w]*@[\\w]*.com");
	Matcher m3 = p3.matcher(str3);
	System.out.println(m3.find());
			
			
			System.out.println("-----------------------------");
			
			String str4 = "k77";
			Pattern p4 = Pattern.compile("[^b|c].{2}$");
			Matcher m4 = p4.matcher(str4);
			System.out.println(m4.find());
			

			String str6 = "k77";
			Pattern p6 = Pattern.compile("[b|c].{2}$");
			Matcher m6 = p6.matcher(str6);
			System.out.println(m6.find());
	
			
			String str5 = "k77";
			Pattern p5 = Pattern.compile("^[^b|c].{2}$");
			Matcher m5 = p5.matcher(str5);
			System.out.println(m5.find());
			
	}
}
