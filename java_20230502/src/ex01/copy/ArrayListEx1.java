package ex01.copy;

import java.util.*;

class Member{
	int age;
	String name;
	public Member (String name, int age) {
		this.name = name;
		this.age = age;
	}
}

public class ArrayListEx1 {

	public static void main(String[] args) {

//		int[]num = new int[5];
//		num[0] = 어레이는 정수형만 받아줄수있음, 반면 아래의 어레이리스트는 정수, 문자 , 객체까지 받을수 있다.(내부적으로 Object가 받음)
		
		
		ArrayList list1 = new ArrayList();
		
		list1.add(10);
		list1.add(new String("kor"));
		list1.add(new Member("로이",13));
		
		
		
		for(int i =0;  i<list1.size(); i++) {
			System.out.println(list1.get(i));
		
		}
		
	}
	
	static void print(ArrayList list1, ArrayList list2) {
		System.out.println("list1:" + list1);
		System.out.println();
		
		
		
	}

}
