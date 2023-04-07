package java_20230405;

public class SpecialCharEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println('\'');
		System.out.println("It's my thing");
		System.out.println("abc\t123\b456"); // \b에 주목, \b앞에 쓰인 3은 삭제된다.
		System.out.println('\n'); // \n 은 줄바꿈이다.
		System.out.println("\"Hello\""); // 큰따옴표를 출력하기 위해선 이런 식으로 써 주어야 한다. \"로 헬로를 감싸준다 
		System.out.println("c:\\"); // 역슬래쉬를 출력하기위해선 역슬래시를 두번 쓴다

		System.out.println("\uac63"); //유니코드 출력 명령어 역슬래시 + u 거의쓸일이없다.
	}

}
