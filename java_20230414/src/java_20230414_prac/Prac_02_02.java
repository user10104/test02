package java_20230414_prac;

// 함수를 호출하면서 인자값 하나 전달 (정수) 하면 함수는 1부터 전달한 인자값까지 더해서 더한 결과값을 호출함수에게
// 반환해서 출력

public class Prac_02_02 {

	public static void main(String[] args) {
		
	System.out.println(" -- program on -- ");
	
	int total = sumfunction(100); //1부터 100까지의 합계를 계산해주는 함수를 아래에 만들어야한다.
	System.out.println("total"+","+total);
	System.out.println(" -- program off -- ");
	
	}
	static int sumfunction(int num) {
		int sum = 0; 
		for(int i = 1; i <= num; i++) // 매번 해왔던 for문 반복, 
			sum += i; 
		//i의수는 반복할수록 1씩 더해진다 . 더해진 값 sum을 합계로 출력하기 위해 함수를 선언한것이다. 
		//등호  = 을 빠뜨리면 값은 100이 빠진 4950 이 나온다. 주의하자
	return sum; //sum을 리턴해주는것을 잊지말자.
	
		
	}

}


//답은 5050이 나와야한다.