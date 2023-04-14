package ex01;
import java.util.Arrays;
import java.util.Iterator;

public class Exam_01 {

	/*
	 *  1. 배열 10개 생성 후 랜덤으로 1~100사이 값을 넣는다 o
	 *  2. 배열 10개 총점과 평균을 구한다 o
	 *  3. 배열 10개 최대값, 최소값을 구한다. o
	 *  4. 배열 10개 오름차순 정렬을 한다. o 
	 */
	
	public static void main(String[] args) {

		
		final int NUM = 10;
		int [] num =  new int [10];
		int max;
		int min;
		int sum = 0;
		int avg = 0;
        
 
		
		for(int i = 0; i < num.length ; i ++) {
			num[i] = (int)(Math.random()*100+1);
			sum += num[i];
	}
		
		System.out.println(Arrays.toString(num));
		System.out.println("sum:" + sum);
		System.out.println("avg:" + sum / num.length);
		
						
		for(int i = 0; i < num.length ; i ++) {
				for( int j = i + 1 ; j < num. length ; j ++) {
				if (num[i] > num[j]) {
					int tmp = num [i];
					num[i] = num[j];
					num[j] = tmp;
					max = min = num[0];			
						} 										
					}	
		min = num [i];		
			System.out.print(num[i] + ", ");
			} 

		max = num[0];
		min = num[0];	
				
		for(int i = 1 ; i < num. length ; i ++)	{
				if (max < num[i]) {
					max = num[i];
				}
				else if (min > num[i]) {
					min = num[i];
				}
				
			}
				
			System.out.println();
			
			System.out.println("max" + max);	
			
			System.out.println("min" + min);

		
			
		
		
		
 
	}}
