package homework;
import java.util.Scanner;
import static java.lang.Math.sqrt;
public class hw4 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int num = in.nextInt();
		int prime_pre = 3;
		int prime_las = 3;
		boolean isPrime =true;
		while((prime_las+=2)<num) {
			
			isPrime=true;
			for(int i=3;i<(int)sqrt(prime_las);i+=2) {
				if(prime_las%i==0) {
					isPrime = false;
					break;
				}
			}
			if(isPrime==true) {
				prime_pre=prime_las;
			}
		}
		System.out.print(prime_pre);
	}
}
