package java_20230410;

public class Exam_07 {

	//1+(-2)+3+(-4)+...식으로 더해나갈때 몇까지 더해야 총합이 100이상 될지 구하기 i값과 총합도 구하기
	
	public static void main(String[] args) {

		int sum = 0;	
		int sign=1;
		int tmp=0;
		
			for ( int i=1; true ;i++, sign=-sign) {
				tmp = sign *i;
				
				sum +=tmp;
				if(sum>= 100) break;
			
			
		}
			System.out.printf("tmp:" +tmp +", sum: "+sum);
			
	}

}
