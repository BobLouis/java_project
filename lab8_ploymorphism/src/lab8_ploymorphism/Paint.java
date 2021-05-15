package lab8_ploymorphism;

public class Paint {
	public static void main(String[] args) {
		System.out.println(Shape.color); // static var
		
		Shape shape1 = new Rectangle();
		printArea(shape1);
		shape1.drawBorder();
		Shape shape2 = new Circle();
		printArea(shape2);
		shape2.drawBorder();
		
	}
	
	public static void printArea(Shape shape) {
		System.out.println(shape.area());
	}
}
