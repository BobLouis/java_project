package lab6;
import java.util.ArrayList;
public class ArrayListDemo2 {
	public static void main(String[] args) {
		ArrayList<String> names = new ArrayList<String>();
		names.add("a");
		names.add("b");
		names.add("c");
		
		for(int i=0;i<1;++i) {
			names.remove(i);
		}
		System.out.println(names.size());
	}
}
