package lab6;

public class Sum {
	public static void main(String[] args) {
		int[] a;
		a=new int[3];
		
		for(int i=0;i<a.length;i++) {
			a[i]=i+2;
		}
		
		int result = 0;
		for(int i=0;i<a.length;i++) {
			result+=a[i];
		}
		System.out.println("result is " + result);
	}

}
