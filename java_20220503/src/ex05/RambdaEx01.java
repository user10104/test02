package ex05;

interface MyFunction{
	int max(int a, int b);
	
}

public class RambdaEx01 {

	public static void main(String[] args) {
		MyFunction m = 
		
		(int a, int b)-> {
			
			System.out.println("--------------");
			return a>b? a:b;
			
		};
	System.out.println("max : " + m.max(10, 20));
	
	}

}
