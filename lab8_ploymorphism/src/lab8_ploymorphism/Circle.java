package lab8_ploymorphism;

public class Circle implements Shape{
	double radius =3;
	public double area() {
		return radius*radius*3.14;
		
	}
	
	public void drawBorder() {
		System.out.println("Drawing border of the circle");
	}
}
