package ex01;

class Card{
	public void info() {
		System.out.println("card()");
	}
}

public class Exam01 {

	public static void main(String[] args) {

//		Card card = new card();
//		card.info();
//		
//		Class cObj	= new Card().getClass();//클래스의 경로 
//		Class cObj	= Card.class;
//		Class cObj 	= Class.forName("ex17_1Card");
//		Object Obj = Class.forName("ex17_1Card");
//		
		String str = "kor";
				System.out.println(str);
		
		str = "korea";
		System.out.println(str);
		
		System.out.println("a".compareTo("a")); //같으면 0변환
		System.out.println("b".compareTo("b"));	//사전적(아스키코드) 이전이면 음수 이후면 양수 변환
		System.out.println("A".compareTo("A"));	//사전적(아스키코드) 이전이면 음수 이후면 양수 변환
	
		//indexOf()
		System.out.println(str.indexOf('r'));
		
		String s ="Hello";
		String s1 = s.replace('H','C');
		System.out.println(s1);
		
		String s2 ="Hellollo";
		String s3 = s2.replace("ll", "LL");
		System.out.println(s3);
		
		String ab = "AABBAABB";
		String r =
			ab.replaceAll("BB", "bb");
		System.out.println(r);
		
		String animals = "dog,cat,bear";
		String[]arr = animals.split(",");
		System.out.println();
		//substring : 시작위치와 끝위치(미포함) 내 포함된 문자열 얻음
		//.trim() : 앞뒤공백제거
		
				
		System.out.println();
		
		
		Object obj/*참조변수*/ = Integer.parseInt(s);
		Object obj2 = Integer.valueOf(s);
		
		
		int i = 5;
				Integer iObj = new Integer(7);
		int sum = i + iObj;
				System.out.println(sum);
	}

}
