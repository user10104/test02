package java_20230410;

public class Exam_01 {
	// 1~10합누적
	
	public static void main(String[] args) {
	
		int total = 0;
		int num = 10;
		                 // 2
		for(int i=1; i<=num; i++) // (초기;검사; 증가)
				total += i; 
		
		System.out.println("1~" + num + "까지 합 :  " + total );

	}

}

