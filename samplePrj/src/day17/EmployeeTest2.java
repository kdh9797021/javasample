package day17; //Generics 

public class EmployeeTest2 {
	public static void main(String[] args) {
		Employee_2<Integer> e1 = new Employee_2<Integer>();  //��ü ������ ���� type �����ؾ���. 
		e1.number = 2017;  //type�� ���� ����� ������ ������ object. (���� downcasting �ʿ�)
		// System.out.println(e1.number.charAt(e1.number.length()-1));  //String�� ���� API�̹Ƿ� Integer���� ��� �Ұ���.
	Employee e2 = new Employee();  //type ������ �ȵǸ� object�� �����Ǿ� ������.
	
	}
}

class Employee_2<T> implements Comparable<Employee_2<T>>{
	String name;
	T number;  //class ���ǽ� ���� type ����.
	
	public Employee_2() {
		super();
	}
	public Employee_2(String name, T number) {  //Generics ����
		super();
		this.name = name;
		this.number = number;
	}
	public String getName() {
		return name;
	}
	public T getNumber() {
		return number;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setNumber(T number) {
		this.number = number;
	}
	@Override
	public String toString() {
		return "Employee_2 [name=" + name + ", number=" + number + "]";
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + ((number == null) ? 0 : number.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee_2 other = (Employee_2) obj;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (number == null) {
			if (other.number != null)
				return false;
		} else if (!number.equals(other.number))
			return false;
		return true;
	}
	@Override
	public int compareTo(Employee_2<T> o) {
		return 0;
	}

	
}
