package ex01;

public class Exam03 {

	public static void main(String[] args) {
		
		int sum = 0;
		
		int[]num = new int [3];
		num[0] = 10;
		num[1] = 20;
		num[2] = 30;
		
		int[] arrNum = new int[] {10,20,30}; //위와 같다. new int[] 는 생략가능, 숫자넣지않기
		//num = {10,20,30}/ arrNum = {10,20,30}은 안됨

		for(int i=0; i<3; i++)
			sum += arrNum[i];
				System.out.println(sum);
			

}
}