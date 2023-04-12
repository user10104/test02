package ex01;

/*
 * 1. int 배열 10개 생성
 * 2. 랜덤함수 이용해서 10 개 초기화
 * 3. 최대값, 최소값
 */

public class Exam_05_alone {

	public static void main(String[] args) {

		int[] num= new int[10];
		int max;
		int min;
		
		
		for(int i=0; i < num.length; i++)
		num[i] =(int)(Math.random()*100+1);
		
		for(int i=0; i < num.length; i++)
			System.out.print(num[i]+",");
		
		max = min = num[0];
		
		for(int i=0; i < num.length; i++) {
			if(num[i]> max) {
		System.out.println("Max:" + max );
			}
			
		}
	}

}
