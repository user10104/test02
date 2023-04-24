package ex05;


 class FighterTest {
	 
	public static void main(String[] args) {
		Fighter f = new Fighter();
		
		if (f instanceof Unit)
			System.out.println("f는 unit 클래스의 자손입니다.");
		if (f instanceof Fightable)
			System.out.println("f는 Fightable인터페이스를 구현했습니다.");
		if (f instanceof Movable)
			System.out.println("f는 Movable인터페이스를 구현했습니다.");
		if (f instanceof Fightable)
			System.out.println("f는 Attackaable인터페이스를 구현했습니다.");
		if (f instanceof Fightable)
			System.out.println("f는 object클래스의 자손.");
		
		
	} // main

}
class Fighter extends Unit implements Fightable {
	public void move(int x, int y) {/*내용생략*/}
	public void attack (Unit u) { /*내용생략*/}
	
	class Unit{
		int currentHP;
		int x;
		int y;
		
	}
	interface Fightable extends Movable, Attackable{}
	interface Movable		{void move (int x, int y);}
	interface Attackable 	{void attack(Unit u);}
}