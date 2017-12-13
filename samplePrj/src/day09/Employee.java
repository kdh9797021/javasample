package day09;

public class Employee {      // PKG�� �ٸ��� ���� �����.
	private String name;	 // �̸�,    'private' - hiddenȭ, ���� ���� ���� 
	private int salary;  		// �޿�
	private String ssn;  		//�ֹι�ȣ

public Employee(){}   //default ������ �����(�⺻)
public Employee(String  name, int salary, String ssn){
	this.name = name;
	this.salary = salary;
	this.ssn = ssn;
}
	public void setName(String name){    //setter method(property)
		this.name = name;
	}
	public String getName(){  //getter method
		return this.name;
	}
	public void setSalary(int Salary){
		this.salary = salary;
	}
	public int getSalary(){
		return this.salary;		
	}
	public void setSsn(String Ssn){
		this.ssn = ssn;
	}
	public String getSsn(){
		return this.ssn;
	}
	
	public void display(){
		System.out.printf("Employee[%s, %d, %s]%n", name, salary, ssn);
	}
}

