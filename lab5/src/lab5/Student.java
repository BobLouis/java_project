package lab5;

public class Student {
	private String name;
	private double gpa;
	
	public Student() {
		name = null;
		double gpa = 0.0;
	}
	
	public Student(String n,double g) {
		name = n;
		gpa = g;
	}
	
	public String getName() {
		return name;
	}
	public double getGPA(){
		return gpa;
	}
	public void setGPA(double g) {
		if((g>=0) && (g<=4)) {
			gpa =g;
		}
	}
	public String toString() {
		return (name+" " + gpa);
	}
	
	public boolean equals(Student s) {
		return(name.equalsIgnoreCase(s.name));
	}
	
	public static void main(String[] args) {
		Student student1 = new Student("Mike",90);
		student1.setGPA(92);
		System.out.println(student1.getName());
		System.out.println(student1.getGPA());
		System.out.println(student1.toString());
		
		
		Student student2 = new Student("Mike",23);
		if(student2.equals(student1)) {
			System.out.println("student1 is student2");
		}else {
			System.out.println("student1 is not student2");
		}
	}
}
