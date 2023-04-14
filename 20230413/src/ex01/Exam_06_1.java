package ex01;

import java.util.Arrays;

public class Exam_06_1 {

	public static void main(String[] args) {

		int[][]arr = new int[5][5];
		int count =1;
		int row = 0, col = -1;
		
		int size = 5;
		
		
		while(size > 0) {
			
			for (int i =0; i< size; i++ ) {
				col ++; 
				arr[row][col] = count++;
				
			}
			
			size--;
			if(size == 0 ) break;
			
			
			
			for(int i  = 0; i<size; i ++) {
					row ++;	
					arr[row][col]=count++;
				
			} //row=4 col=4
			
			for(int i = 0; i < size; i ++) {
					col --;
					arr[row][col]= count++;
				
			}
			size--;
			
			if (size== 0 ) break;
			
			
			for (int i = 0 ; i < size; i++) {
				
					row--;
					arr[row][col] = count++;
		
			}		
						
		}
		
		for (int i= 0; i<arr.length;i++) {
			for (int j = 0; j <arr[i].length; j ++) {
				System.out.print(arr[i][j] + "\t");
			}
		}		System.out.println();

		
		}
			
	
		
	

}



/*
 * int [][] num = new int [4][3] > num이라는 4x3짜리 배열을 만든다.
 * num[2][1] = 100  > 세로축 세번째칸, 가로축 두번째 칸에 100 곱한다. 이 경우 c열의 0.3 에 100을 곱해야 한다.
 * 
 * a[0.0 0.1 0.2]
 * b[0.1 0.2 0.3]
 * c[0.2 0.3 0.4]
 * d[0.3 0.4 0.5]
 * 
 * 
 */








