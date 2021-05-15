package lab6;

public class SumTest {
	public static void main(String[] args) {
		int[] a= {23,34,1,24,12,54,65,23};
		
		int result =0;
		
		for(int i=0;i<a.length;i++) {
			if(a[i]>30) {
				result += a[i];
			}
		}
		
		System.out.printf("Result is : %d", result);
	}
}
