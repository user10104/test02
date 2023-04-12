package ex01;

/*
 * 1. int 배열 10개 생성
 * 2. 랜덤함수 이용해서 10 개 초기화
 * 3. 오름차순 정렬
 */

public class Exam06 {

	public static void main(String[] args) {

			int [] num = new int[10];
			int max;
			int min;
			
				for (int i= 0; i < num.length ; i++)
				num[i] = (int)(Math.random()*100+1); //괄호막기
		

				for (int i= 0; i < num.length ; i++)
					System.out.println(num[i]+ ",");
					System.out.println();
			
					max = min = num[0];		
					
				for (int i= 0; i < num.length ; i++) 
					for(int j = i; j < num.length; j++) {
						//for(int j=0; j<num.length;j++) { if(num[i]<num[j])
					if(num[i]>num[j]) {
						int tmp = num[i];
						num[i] = num[j];
						num[j]=tmp;
					}
					min = num [i];{
						
					}
					
				}
				for(int i=0; i<num.length; i++)
					System.out.print(num[i]+",");
				}
					
	}



			/*max = min = num[0];	
					
			

			for (int i= 0; i < num.length ; i++)	{
				if(num[i] > max)
					max = num[i];
				if(num[i]<min)
					min = num [i];
			
				}
				//System.out.println("max =" + max );
				//System.out.println("min =" + min );

			
	}
}

	*/
