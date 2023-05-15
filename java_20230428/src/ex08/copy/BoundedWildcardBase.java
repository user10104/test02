package ex08.copy;


class Box<T>{
	private T ob;
	public T getOb() {
		return ob;
		
	}
	public void setOb(T ob) {
		this.ob = ob;
	
	}
}
//개발자 실수가 있는 부분을 컴파일 과정에서 발견될 수 있도록 매개변수를 수정하자.
public class BoundedWildcardBase {

	public static void addBox(Box <? super Integer>b1, Box <Integer>b2, Box <? extends Integer>b3) {
	b1.setOb(b2.getOb()+b3.getOb()); // 개발자의 실수,<Integer>대신 <? super Integer> 추가로 고침, 괄호 내 순서 상관 x
	
	}
	public static void main(String[] args) {

		Box<Integer>box1 = new Box<>();
		box1.setOb(24);
		
		Box<Integer>box2 = new Box<>();
		box2.setOb(37);
		
		Box<Integer>result = new Box<>();
		result.setOb(0);
		addBox(result, box1, box2);
		System.out.println(result.getOb());
	}
}

