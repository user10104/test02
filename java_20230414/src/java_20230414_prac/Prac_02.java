package java_20230414_prac;

// 함수를 호출하면서 인자값 하나 전달 (정수) 하면 함수는 1부터 전달한 인자값까지 더해서 더한 결과값을 호출함수에게
// 반환해서 출력

public class Prac_02 {

	public static void main(String[] args) {
		
		System.out.println(". . . program on");
		int total = sumFunction(100);
		System.out.println("total" + "," + total);
		System.out.println("program off . . .");
		
	}
	static int sumFunction(int num) {
		int sum = 0;
		for(int i = 1; i <= num; i++) 
			sum+= i; // 계속 더해주는것을 for문으로 반복
		
		return sum;
		
		
	}

}
