package lab5;

public class StaticMain {
	public static void main(String[] args) {
		StaticVar obj1 = new StaticVar();
		StaticVar obj2 = new StaticVar();
		
		System.out.println(StaticVar.port);
		System.out.println(obj1.port);
		System.out.println(obj2.port);
		
		StaticVar.port=1234;
		System.out.println(obj1.port);
		StaticVar.port=4356;
		System.out.println(obj2.port);
		
	}
}
