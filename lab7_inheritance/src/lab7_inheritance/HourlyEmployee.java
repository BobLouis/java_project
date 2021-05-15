package lab7_inheritance;
import java.util.Date;
public class HourlyEmployee extends Employee{
	private double wageRate ; 
	public HourlyEmployee(String theName,Date theDate, double rate) {
//		name = theName;
//		hireDate = theDate;
		super(theName,theDate);
		wageRate = rate;
		System.out.print("hourlyEmployee constructor");
	}
	
	public String getName() {
		return "Hourly Employee : " +super.getName();
	}
	
}