package ex03;

public class IOEX {

	interface Shape {
		public abstract getArea();
			
	}
	
	class Rectangle implements Shape{
		int width;
		int height;
		
		public int getArea(int width, int height) {
		this.width=width;
		this.height=height;
		return width*height;
		}
		
	}
	class Circle implements Shape{
		int radius;	
		public int getArea() {
			int area = 0;
		}
	public int getArea() {
		return = 0;
	}
	
	
	public static void main(String[] args) {

		Rectangle r = new Rectangle();
		Circle c = new Circle();
		
	}
	}

