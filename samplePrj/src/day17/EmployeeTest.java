package day17; //Generics 

public class EmployeeTest {
	public static void main(String[] args) {
		Employee<String,String> e2 = new Employee();
		e2.number = "2017";
		//	Employee<int>  �⺻���� binding �Ұ���. object�� ����.
		Employee<Integer,Integer> e1 = new Employee();
		e1.number = 2015;
		
		Employee e3 = new Employee();
		e3.number = 2222;
		e3.number = "444";
		
	}
}

class Employee<T,P>{   //Ÿ�� ������ ���� ������ �Ҹ�Ȯ�Ҷ�, runtime�� ������ ������ type ����.  <> ������ ������ Object��.
	String name;
	T number;
	P age;
	@Override
	public String toString() {
		return "Employee [name=" + name + ", number=" + number + ", age=" + age + "]";
	}

	
}
