package lab6;

public class AnonymousObjectTest {
	public static void main(String[] args) {
		AnonymousObjectTest obj = new AnonymousObjectTest();
		obj.showMessage(new String("i am an anonymous object"));
		
	}
	
	public void showMessage(String message) {
		System.out.println(message);
	}
}
