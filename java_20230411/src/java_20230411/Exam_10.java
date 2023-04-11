package java_20230411;

//구구단


public class Exam_10 {

	public static void main(String[] args) {

		for(int i=2; i <=9; i++) {
			
			for(int j=1; j<=9; j++) {
				if(i==j) continue;
			
				System.out.println( i + "X" + j + "=" + i*j);
			}
		}
		System.out.println("프로그램 종료");
	}

}
