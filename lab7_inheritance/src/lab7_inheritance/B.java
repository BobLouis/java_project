package lab7_inheritance;

public class B extends A {
	public B() {
		System.out.println("step2");
	}
	
	public static void main(String[] args) {
		B b = new B();
		System.out.println(b.a);
		
	}
}
