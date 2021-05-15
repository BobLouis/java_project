package lab7_inheritance;
import java.util.Date;
public class Company {
	public static void main(String[] args) {
		HourlyEmployee hourlyEmployee = new HourlyEmployee("Josephine",
				new Date (114,0,1),100);
		System.out.println(hourlyEmployee.getName());
		
		Employee someEmployee = hourlyEmployee;
		printHireDate(someEmployee);
	}
	
	public static void printHireDate(Employee someEmployee) {
		System.out.println(someEmployee.getHireDate());
	}
}
