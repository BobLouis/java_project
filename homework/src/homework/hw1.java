package homework;
import java.util.Scanner;



public class hw1 {
	public static void main(String args[]) {
	
	Scanner dd = new Scanner(System.in);
	
	double gram_mice = dd.nextDouble();
	double weight_mice =dd.nextDouble();
	double weight_dieter=dd.nextDouble();
	double output=(weight_dieter*gram_mice/weight_mice)/0.03;
	
	System.out.printf("%.1f",output);
	
	}
}
