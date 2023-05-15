package ex01;

import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ArrayList;

public class IteratorCollection {

	public static void main(String[] args) {

		List<String> list = new LinkedList<>();
		
		list.add("toy");
		list.add("Box");
		list.add("Robot");
		list.add("Box");
		list.add("aaa");
		
		List<String>list2 = Arrays.asList("Toy","Box","Robot","Box");
		List<String>ls = new ArrayList(list2);
		ls.add("bbb");
		
		for(String str : ls)
			System.out.println(str);
		
		String[]str = new String[3];
		str[0]="kor";
		str[1]="eng";
		str[2]="math";
		
		Iterator<String> it = list.iterator();
	while(it.hasNext()) {//읽을게 남아있을때만 true값, 다음에 읽을 값이 없을땐 false로 종료
		String st = it.next();
		System.out.println(st);
	}
	
		System.out.println("------------------");
		//Box만 삭제
		it= list.iterator();
		while(it.hasNext()) {
			String st = it.next();
			if(st.equals("Box"))
				it.remove();
			System.out.println(st);
		}
	}

}
