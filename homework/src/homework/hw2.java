package homework;
import java.util.Scanner;
import java.lang.Math; 
public class hw2 {
public static void main(String args[]) {
	String[] number= {"zero" , "one", "two" , "three","four","five","six","seven","eight","nine"};
	Scanner in = new Scanner(System.in);
	int first = in.nextInt();
	int second = in.nextInt();
	char op = in.next().trim().charAt(0);
	if(first>9||first<0||second>9||second<0) {
		System.out.print("invalid number");
		System.exit(-1);
	}
	if(op=='/') {
		if(second==0) {
			System.out.print("division by zero is not allowed");
			System.exit(-2);
		}
	}
	
	switch(op) {
	case '+' :
		System.out.printf("%s plus %s is %d",number[first],number[second],first+second );
		break;
	case '-' :
		System.out.printf("%s minus %s is %d",number[first],number[second],first-second );
		break;
	case '*' :
		System.out.printf("%s multiplied by %s is %d",number[first],number[second],first*second );
		break;
	case '/' :
		System.out.printf("%s divided by %s is %d",number[first],number[second],first/second );
		break;
	case '^' :
		System.out.printf("%s to the power %s is %d",number[first],number[second],(int)Math.pow(first,second));
		break;
	
	}
}
}

