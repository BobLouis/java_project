package lab6;
import java.util.ArrayList;
public class ArrayListDemo {
	public static void main(String[] args) {
		ArrayList<String> names = new ArrayList<String>();
		names.add("Amber");
		names.add("Bob");
		names.add("Cindy");
//		names.remove(1);
		System.out.println(names.get(1));
	}
}
