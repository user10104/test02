package ex01;

import java.util.Comparator;
import java.util.List;
import java.util.Collections;
import java.util.ArrayList;
import java.util.TreeSet;
class Person implements Comparable<Person>{

	String name;
	int age;
	
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}

	@Override
	public String toString() {
		return name +  ", " + age;
	}
	@Override
	public int compareTo(Person p) {
		return p.age - p.age;
	}
	
}
class PersonComparator implements Comparator<Person>{
	@Override
	public int compare(Person o1, Person o2) {
		return o1.age- o2.age;
	}
}
public class ComparatoerPerson {
	
	public static void main(String[] args) {
		List<Person> list = new ArrayList();
		list.add(new Person("kim", 20));
		list.add(new Person("park", 20));
		list.add(new Person("yoon", 22));
		list.add(new Person("lee", 25));
		
		
		// collections.sort 기본자료형만 sort
//		Collections.sort(list, new PersonComparator() {
//			@Override
//			public int compare(Person o1, Person o2) {
//				return o1.age - o2.age;
//			}
//	});

		Collections.sort(list, (o1,o2)-> o1.age - o2.age);
		Collections.sort(list, (o1,o2)-> o1.name.length() - o2.name.length());
		
//		Collections.sort(list, new PersonComparator());
		
		for(Person p : list)
			System.out.println(p);
		
	}
	

}