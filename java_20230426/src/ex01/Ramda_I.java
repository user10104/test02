package ex01;

public interface Ramda_I {

int calculate (int x , int y);

}
class Add implements Ramda_I{
	@Override
	public int calculate(int x , int y) {
		return x+y;
		
	}
}
class Sub implements Ramda_I{
	@Override
	public int calculate(int x , int y) {
		return x-y;
		
	}
}
class Mul implements Ramda_I{
	@Override
	public int calculate(int x , int y) {
		return x*y;
		
	}
}
class Div implements Ramda_I{
	@Override
	public int calculate(int x , int y) {
		return x/y;
		
	}
}
