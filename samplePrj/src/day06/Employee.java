package day06;

public class Employee {    // only member(instance) variable + member(instance) method
	String name;		// �ߺ� ����
	String dept;		// �ߺ� ����
	String number;    //primary kit(�ߺ��Ұ��� data)
	
	public void display(){      
		System.out.printf("Employee[���: %s �����: %s �ٹ��μ�:%s] %n", number, name, dept);
	}
}
