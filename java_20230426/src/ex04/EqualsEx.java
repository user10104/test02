package ex04;


class Value{
	int value;
	String name;
	
	
	public Value(String name, int value) {
		
		this.name = name;
		this.value=value;
	}
	
	@Override
	public String toString() {
		return"[" + name + ", value :" + value + "]";}
	
@Override
public boolean equals (Object obj) { 
	if(this.value == ((Value)obj).value)
		return true;
	else
		return false;
//		return this.value == ((Value)obj).value? true : false;
}

}

public class EqualsEx {

	public static void main(String[] args) {
		Value v1 = new Value("kim",10); //change construct of 'int value' -> 'String value'
		Value v2 = new Value("bap",10);
		
		
		
		System.out.println(v1 == v2); //이퀄스를 오버라이딩해야 이용가능한 코드, 오버라이드 하지 않고 실행 할 시 에러가 뜬다.
		System.out.println(v1.equals(v2));
		System.out.println("------------------------------");
		System.out.println(v1.toString());
		System.out.println(v2.toString());
		System.out.println();
	
	}

}
