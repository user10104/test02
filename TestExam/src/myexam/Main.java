package myexam;

import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.function.Predicate;

import myexam.YoungBuildTest;

public class Main {
	public static void main(String[] args) {

		BiFunction<Integer, Integer, Integer> f = (a,b)->a>b?a : b;
		
		int num = f.apply(10,50);
		System.out.println(num);
		
		Function<Integer, Integer> f2 = n -> n*n*n;
		
		System.out.println(f2.apply(4));
		
		Predicate<Integer> f3 = n-> n % 2 == 0;
		
		System.out.println(f3.test(11));
	}

}
