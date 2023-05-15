package ex01;

import java.util.HashSet.*;

class Num{
	private int num;
	public Num(int num) {
		this.num = num;
	}
	@Override
	public String toString() {
		return String.valueOf(num); // "10" num+"";
	}

	@Override
	public int hashCode() {
		return num%3;
	}

	@Override
	public boolean equals(Object obj) {
//	if(num == ((Num)obj).num)
//		return true;
//	else return false;
	return num == ((Num) obj).num? true: false;
	
	}
}
public class HashSetCollection2 {

	public static void main(String[] args) {

		Set<Num> set = new HashSet(); //중복x순서x
		
		set.add(new Num(10));
		set.add(new Num(20));
		set.add(new Num(10));
		set.add(new Num(20));
		set.add(new Num(20));
		set.add(new Num(10));
		
		for(Num s : set)
			System.out.println(s);
	}

}
