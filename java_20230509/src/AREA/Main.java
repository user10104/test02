package AREA;

public class Main {

	public static void main(String[] args) {
		Shape rectangle = new Rectangle (75.2, 173.5);
		Shape circle = new Circle (10.6);
		
		System.out.println("사각형 면적 " + rectangle.getArea());
		System.out.println("원 면적 "+ ((int)circle.getArea()*100)/100.0);

	}

}
