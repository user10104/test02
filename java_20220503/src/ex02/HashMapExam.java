package ex02;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;
public class HashMapExam {

	public static void main(String[] args) {
		HashMap<Integer,String>map=new HashMap<>();
		
		map.put(5,"kim");
		map.put(10,"park");
		map.put(9,"lee");		
		map.put(10,"Hong");
		map.put(8,"park");
		map.put(1,"kim");
	
	System.out.println(map);
	System.out.println(map.get(9));
	//map.clear();
	map.remove(9);
	System.out.println(map);
	
	System.out.println("---------------");
	
	Set<Integer> set=map.keySet();
	for(int n : set) {
		System.out.println(n);
	}
	System.out.println("--------------");
	for(int n : set) {
		System.out.println(map.get(n));
	}
	}
	}


