package lab8_ploymorphism;

public class Rectangle implements Shape{
	int x1=0;
	int y1=0;
	int x2=10;
	int y2=10;
	
	public double area() {
		return (x2-x1)*(y2-y1);
	}
	
	public void drawBorder() {
		System.out.println("Draw the border of the rectangle");
	}
}
