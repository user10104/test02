package java_20230414_prac;

// 함수를 호출하면서 인자값 하나 전달 (정수) 하면 함수는 1부터 전달한 인자값까지 더해서 더한 결과값을 호출함수에게
// 반환해서 출력

public class Prac_02_01 {

	public static void main(String[] args) {
	
		System.out.println("program in");
		
		int sum = sumfunction(100);
		System.out.println("total is " + ", " + sum);
		
		
		System.out.println("program out");
		
		}
	
	static int sumfunction(int num) {
		
		int sum = 0;
		
		for(int i=1; i<=num; i++)
		sum+= i;

		return sum;
		
	}

}


//답은 5050이 나와야한다.