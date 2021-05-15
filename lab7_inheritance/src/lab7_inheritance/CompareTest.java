package lab7_inheritance;
import java.util.Date;
public class CompareTest {
	public static void main(String[] args) {
		Employee employeeA = new Employee("Josephine",new Date(114,0,1));
		Employee employeeB = new Employee("Josephine",new Date(114,0,1));
		
		System.out.println(employeeA.equals(employeeB));
		System.out.println(employeeA == employeeB);
	}
}
