package lab6;
import java.util.*;

public class ArrayListReplace {
	public static void main(String[] args) {
		ArrayList<Integer> arr1 = new ArrayList<Integer>();
		ArrayList<Integer> arr2 = new ArrayList<Integer>();
		
		arr1.add(1);
		arr1.add(2);
		arr2.addAll((arr1));

		arr1.clear();
		System.out.println(arr2.get(0));
	}
	
	
}
