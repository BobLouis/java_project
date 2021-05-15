
public class lab5 {
	public static void main(String[] args) {
		int sum = add(1, 1);
		
		System.out.println(sum);
		
		lab5 st = new lab5();
		sum=st.add2(2, 2);
		System.out.print(sum);
	}
	
	public static int add(int a,int b) {
		return a+b;
	}
	
	public int add2(int a,int b) {
		return a+b;
	}
}


