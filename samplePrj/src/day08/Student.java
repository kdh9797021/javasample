package day08;

public class Student {
	String name;
	String year;
	String major;
	
	public Student(){
		this("XXX","X�г�", "XX�迭");		
	}
	
	public Student(String name, String year, String major){
		this.name = name;
		this.year = year;
		this.major = major;		
	}
	
	public void display(){
		System.out.printf("Student[%s, %s�г�, %s�迭]%n", name,year,major);
	}	
}
