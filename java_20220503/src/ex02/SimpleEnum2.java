package ex02;

enum Animal{
	DOG,CAT,PIG
}
enum Person{
	MAN,WOMAN
}

public class SimpleEnum2 {

	public static void main(String[] args) {
		
	who(Animal.CAT);
	}
	public static void who(Animal p) {
		switch (p) {
		case DOG: 
			System.out.println("개");
		break;
		
		case CAT:
			System.out.println("고양이");
		break;
		default:
			System.out.println("돼지");
		}
	}
	
	
}
