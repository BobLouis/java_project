package lab5;

public class WrapperClassTest {
	public static void main(String[] args) {
		int k=100;
		Integer it1 = new Integer(k);
		int m = it1.intValue();
		
		System.out.println(m*k);
		System.out.println(it1);
		
		Double d = new Double ("1.5");
		double pi =Double.parseDouble("3.14");
		System.out.println(pi);
		String str = d.toString();
		System.out.println(str);
	
	}
}
