package ex01;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;
public class MyFirstStream {

	public static void main(String[] args) {

		int[] ar = {1,2,2,3,4,4,5,5,6};
//		배열의 짝수합을 구함. 중복제거
		
//		int sum = 0;
//		for(int a :ar) {
//			if (a %2 == 0)
//				sum +=a;

		
		IntStream stml = Arrays.stream(ar);
		//distinct 중복제거
		int total  =stml.distinct().filter(n ->2==0).sum();
		System.out.println("total : "+total);
	
		stml = Arrays.stream(ar);
		long count = (int)stml.distinct().filter(n->n%2==1).count();
		System.out.println("홀수 갯수" + count);
		
		
		String[]names = {"kim","park","hong","lee","eng","math"};
		
		
		//1.이름출력
		Stream<String> stm2 = Arrays.stream(names);
		stm2.forEach(str-> System.out.println(str));
		
		System.out.println("----------");
		//2.k시작이름출력
		stm2 = Arrays.stream(names);
				stm2.filter(name->name.startsWith("k"));
				stm2.forEach(str-> System.out.println(str));
				
		System.out.println("----------");
		stm2 = Arrays.stream(names);
		stm2.filter(n->n.length()>=4).forEach(n->System.out.println(n));

		System.out.println("----------");
		List<String> list = Arrays.asList("Toy", "Box", "Robot");
		//1리스트를 스트림으로 변환 후 출력
		Stream<String> s = list.stream();
		s.sorted().forEach(n->System.out.println(n));
		//2 '' 갯수합 출력
		System.out.println("----------");
		s=list.stream();
		long count2 = s.map(n->n.length()).count();
		System.out.println("글자수: "+ count2);
		
		System.out.println("----------");
		s= list.stream();
		int sum2 = s.mapToInt(n->n.length()).sum();
		System.out.println("글자수합: " + sum2);
		
		
		boolean t = test(11);
//		System.out.println(t);
	}
	static int apply (String s) {
		return s.length();
		
	}
	static void accept(String str) {
		System.out.println(str);
	}

}
