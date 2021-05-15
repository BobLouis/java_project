package lab6;

public class ArrayTest {
	public static void main(String[] args) {
		
		String[] names = new String[3];
		System.out.println(names[0]);
		
		names[0]="Apple";
		System.out.println(names[0]);
		
		showMessage(names);
		System.out.println(names[0]);

	}
	
	public static void showMessage(String[] message) {
		
		
		System.out.println(message[0]);
		
		message[0]="b";
		
	}
}
