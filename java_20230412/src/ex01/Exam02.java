package ex01;

/* 조원 3명 자바점수를 입력받아서
 * 자바점수 배점은 50~100 값이 장되도록 한다
 * 조원 총점.평균을 출력
 */

import java.util.Scanner;

public class Exam02 {

	public static void main(String[] args) {
		
	
		final int MAX = 3;//int sum = 0, max;
		double avg =0;
		int sum = 0;
		
		
		int[] 조4 = new int[MAX];
		
		for(int i = 0;  i<MAX; i++) {
			조4[i] = (int)(Math.random()*50+1) + 50;

			
		}
		for(int i =0; i<MAX; i++) //i< n으로 인원수 조절가능
			sum += 조4[i];
		avg = sum/3.0;
		
		for(int i=0; i<MAX; i ++)
			System.out.println(조4[i] + ",");
		
		
		 	System.out.println(); 
		 	System.out.println(sum + "," + avg); // (sum + "," + avg);
		}

	}

