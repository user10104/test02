package ex01;

import java.util.Arrays;

public class Exam_03 {

	public static void main(String[] args) {
		
		int[] n  = new int [5];
		
		int[][] num = new int[4][3];
		
		num[2][1] = 100;
		int[][]num2 = {
				{1,2,3,4}, 		//4 	num2[0]
				{4,5,6,6,5}, 	//5 	num2[1]
				{7,8,9,8,8,9}  	//6 	num2[2]
				
				}; 
		
		for (int i = 0 ; i < 3; i++ ) {  // 0열부터 3열까지 반복 (4회)
			for (int j = 0 ; j< 4; j++)		// 0열부터 4열까지
				System.out.print (num2[i][j] + ", ");
			
			System.out.println();
			}
		
		
		System.out.println("_____________________________");
		
		
	
		

	}

}
