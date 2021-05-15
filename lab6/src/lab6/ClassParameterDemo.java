package lab6;

public class ClassParameterDemo {
	public static void main(String[] args) {
		ToyClass anObject = new ToyClass("Robot Dog",10);
		System.out.println(anObject);
		changer(anObject);
		System.out.println(anObject);
		
	}
	
	public static void changer(ToyClass a) {
		a.set("robot cat", 20);
	}
}
