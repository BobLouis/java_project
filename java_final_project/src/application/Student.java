package application;

public class Student {
	private String name = null;
	private String id = null;
	private double grade = 0;
	
	public Student() {
		
	}
	
	public Student(String name,String id){
		this.name = name;
		this.id = id;
	}
	
	public Student(String name,String id,double grade){
		this.name = name;
		this.id = id;
		this.grade = grade;
	}
	
	public String getName() {
		return this.name;
	}
	
	public String getId() {
		return this.id;
	}
	
	public double getGrade() {
		return this.grade;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setId(String id) {
		this.id = id;
	}
	
	public void setGrade(double grade) {
		this.grade = grade;
	}
	
	
}
