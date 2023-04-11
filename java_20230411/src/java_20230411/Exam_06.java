package java_20230411;

public class Exam_06 {

	
	public static void main(String[] args) {
	
		int i = 0;
		int sum = i;
		//for(초기;검사;증가)
			while(i<10) {
				i++;
				sum+= i;
			}
		System.out.println("sum = " + sum);
		System.out.println("------------");
			
		int k=2;
		int m=1;
		
		while(k<=9) {
			m=1;
			while(m<=9) {
				System.out.printf("%d x %d = %d\n", k,m,k*m);
				m++;
			}
		}
		k++;
			
			}
	// main
}