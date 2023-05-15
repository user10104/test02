package ex04;

interface MyFunction{
	int max(int a, int b);
	
}

//class MyMax implements MyFunction{
//	@Override
//	public int max(int a, int b) {
//		return a>b? a:b;
//	}
//}

public class RambdaEx01 {

	public static void main(String[] args) {
		MyFunction m = new MyFunction() { //익명 객체
		
			@Override
			public int max(int a, int b) {
				return a>b? a:b;
			}
			
		};	
		int num = m.max(10,20);
		System.out.println(num);
		
	}

}
