package ex05;

interface Aaa{
	int square(int x);
}

interface Bbb{
	void printVar(String name, int i);
	
}
public class LambdaTest {

	public static void main(String[] args) {

		Aaa aa = x->x*x;
		System.out.println(aa.square(10));
		
		Bbb bb = (name,i)->System.out.println(name + "=" + i);
		bb.printVar("kim", 20);
		
	}

}
