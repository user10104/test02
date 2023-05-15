package ex01;
import java.util.HashSet;
import java.util.Set;

class Num{
	private int num;
	public Num(int num) {
		this.num = num;
	}
	
	@Override
	public String toString() {
		return String.valueOf(num); //"num"
	}
}

public class HashSetCollection {

	public static void main(String[] args) {
		
		Set<Integer>set = new HashSet();
		
		set.add(10);
		set.add(2);
		set.add(8);
		set.add(9);
		set.add(2);
		set.add(10);
		
		for(int s : set)
			System.out.println(s);
		
		
//		다른방법
//		Set<Num>set = new HashSet();
//		<Num>은 숫자만가능
//		set.add(new Num(10));
//		set.add(new Num(20));
//		set.add(new Num(10));
//		set.add(new Num(20));
//		set.add(new Num(20));
//		set.add(new Num(10));
//		
//		for(Num s : set)
//			System.out.println(s);
	}

}
