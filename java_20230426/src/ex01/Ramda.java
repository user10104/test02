package ex01;

public class Ramda {

	public static void main(String[] args) {

		System.out.println("----------------------");
		Ramda_I add = (x, y)-> x+y;
		System.out.println("x+y = " + add.calculate(8, 4));
		
		Ramda_I sub = (x, y)-> x-y;
		System.out.println("x-y = " + sub.calculate(8, 4));
		
		Ramda_I mul = (x, y)-> x*y;
		System.out.println("x*y = " + mul.calculate(8, 4));
		
		Ramda_I div = (x, y)-> x/y;
		System.out.println("x+y = " + div.calculate(8, 4));

		System.out.println("-----------------------");
		Ramda_I Add = new Add();
		int result = add.calculate(10, 10);
		System.out.println(result);
		
		System.out.println("---------ramda----------");
		Ramda_I add1 = new Ramda_I() {
			public int calculate(int x, int y) {
				return x+y;
//		Ramda_I sub1 = (x, y)-> x-y;
//		result= sub1.calculate(15, 3);
//		System.out.println(result);
			
			}
		};
		
		result = add1.calculate(5, 2);
		System.out.println(result);		
				
}	
	
}