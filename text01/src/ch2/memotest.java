package ch2;

public class memotest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//정수 + 정수 => 정수
		//정수 + 실수 => 실수
		
		//문자열 + 정수 => 문자열
		//문자열 + 실수 => 문자열
		
		int num = 10; //변수 num에 10을 저장
		double d = 10.5; // 변수 d에 실수 10.5를 저장
		String s = "eng"; // 변수 S 에 리터럴 eng를 저장
		
		double dd = num + d; // num은 10, d는 10.5 변수 dd에 실수 20.5를 저장? 잘모르겠다 왜 플러스지.. 아무튼 정수+실수이니 실수이다. 
		
		System.out.println(num+d);
		System.out.println(s+d); //"eng" + "10.5" = eng 10.5
		System.out.println(s+d+num); //"eng" + "10.5" = eng10.5 + "10" => eng10.510
		System.out.println(s+(d+num)); //10.5=10 =. "20.5" +. "eng" => eng20.5
		
		System.out.println(" "+(7+7)); //14 나옴
		System.out.println(" "+7+7); // ""+"7" => "7"+"7" => 77나옴
		System.out.println("------------");
		System.out.print("aaaaaa ");
		System.out.print("bbbbbb"); //ln은 줄바꿈이다(line으로 알아두면 되겠다.) 이름사이를 띄어쓰고싶다면 스페이스바를 이용한다. 결과=> aaaaaa bbbbbb
		System.out.println("------------");//"--"앞에 \n을 붙이면 줄바꿈 가능
		System.out.print("aaa\naaa "); //개행문자
		System.out.print("bbbbbb\n ");
		System.out.println("\n----------");
		
		int n = 15;
		System.out.printf("A :  %d B: %d C: %d\n", 10,20,30);
		//                 8    10   15
		System.out.printf("%o, %d, %x\n",10,20,30);
		//                 이 세개가 뭘 뜻하는지 외울것
		double d2 = 10.52456;
		System.out.println(d2);
		System.out.printf("%.2f\n", d2); 
		
				System.out.println("-------------");
				int finger =10;
				System.out.printf("finger : %d\n", finger); 
				System.out.printf("finger : [%5d]\n", finger); //대괄호를 빼도 상관없음.
				System.out.printf("finger : [%-2d]\n", finger); //d앞의 숫자는 자리를 맞추기 위한 값, 변해도 상관없다.
				//%d => 10진(decimal) 정수의 형식으로 출력하는 지시자이다.
	}

}
