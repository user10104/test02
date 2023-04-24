package ex03;

class CardTest {
	public static void main(String[] args) {
		System.out.println("Card.width =" + Card.width );
		System.out.println("Card.height =" + Card.height);
		
		Card c1 = new Card();
		c1.kind = "heart";
		c1.number = 7;
		
		Card c2 = new Card();
		c2.kind = "Spade";
		c2.number = 10;
		
		System.out.println("c1은" + c1.kind + ", " + c1.number+ "이며, 크기는 (" + c1.width + ", " + c1.height+")");
		System.out.println("c2은" + c2.kind + ", " + c2.number+ "이며, 크기는 (" + c2.width + ", " + c2.height+")");
		
		
	}

}

class Card{
	String kind ; 
	int number;
	static int width = 100;
			static int height = 250;
}
