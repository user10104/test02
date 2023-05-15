package ex01;

import java.util.Scanner;
import java.util.function.BiFunction;
import java.util.function.Function;

//@FunctionalInterface- 사용가능한 추상 메서드의 수를 1개로 제한함, 람다식 이용시 안정적임
interface MyFunction1{
	public abstract int max (int a, int b);
//	public abstract int max2 (int a, int b); // error, 최대 1개 제한
	
	
}	
interface MyFunction2{
	void printVar(String name, int i);
}
interface MyFunction3{
	public abstract int square(int x);
	}
interface MyFunction4{
	int roll();
}
interface MyFunction5{
	int sumArr(int[]arr);
}
public class LambdaEx01 {

	public static void main(String[] args) {
	
		MyFunction1 f1 = (int a, int b)-> a > b? a : b;	
		int big = f1.max(5, 3);	
		System.out.println(big);
		System.out.println(f1.max(5, 3));
		
		BiFunction<Integer, Integer, Integer> bi =(a, b) -> a>b?a:b;
		System.out.println("최대값:" + bi.apply(11, 5));
		
			System.out.println("---------------------------------");
			
		MyFunction2 f2 = (name, i)->System.out.println(name+"="+i);
		f2.printVar("kim",20);
		Scanner sc = new Scanner(System.in);
		BiFunction<String, Integer, String> bi2=
				(name, age)->"이름은 "+name+" 이고, 나이는 "+age+" 입니다.";
				System.out.println(bi2.apply("로이",	11));
		
			System.out.println("---------------------------------");
		
		MyFunction3 f3 = x->x*x;
		int a = f3.square(5); 
		System.out.println(f3.square(5));
		
			System.out.println("---------------------------------");
	
		MyFunction4 f4 = ()->(int)(Math.random()*6);
		System.out.println(f4.roll());

		//		Supplier<Integer>s1 = () -> (int)(Math.random()*6);
//		int num = s1.get();
//		System.out.println("s1.get() : " + num);
		
			System.out.println("---------------------------------");
		MyFunction5 f5 = (int[] arr)->{
//			Function<int[], Integer> f1 = a -> {
//				int sum = 0;
//				for (int i : arr)
//					sum += i;
//				return sum;
//				};	//함수형 인터페이스
			int sum = 0;
		for (int i : arr)
			sum += i;
		return sum;
		};
		//암기
		int[] arr1 = {1,2,3};
		System.out.println(f5.sumArr(arr1));
			System.out.println("---------------------------------");
			
	}
	
		

		
	}


