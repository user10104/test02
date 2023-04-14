package java_20230414;

import java.util.Arrays;

public class Exam_01 {

	public static void main(String[] args) {
		
		int num = 0;
		int[][]number = new int [5][5];
		int count = 0
				
				;
		for(int i=0; i<number.length; i++)
			for(int j = 0 ; j<number.length;j++)
				number[i][j]= ++count;
		
		for(int i=0; i<number.length; i++) { //이 괄호 중요하다. 없으면 세로로 열이 나눠지지 않는다
			for(int j = 0 ; j<number.length;j++)
				System.out.printf("%2d," , number[i][j]);
					System.out.println();
		
	}

}
}