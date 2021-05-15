package lab8_ploymorphism;

public class Test {
	public static void main(String[] args) {
		A a = new A ();
		System.out.println(a.num);     //1
		System.out.println(a.b.speed); //100
		
		A clone_a=(A)a.clone();
		System.out.println(clone_a.num);
		System.out.println(clone_a.b.speed);
		
		clone_a.num = 2;
		clone_a.b.speed = 200;
		System.out.println(a.num);
		System.out.println(a.b.speed);
	}
}
