package day07;  // class ���� > ���ο� data type ����

public class Employee {    //pkg name�� �ٸ��� class ���ϸ� ��� ����.
	String num;
	String name;
	String dept;
	
	public void display(){  //method �Լ� �����
		System.out.printf("Employee[%5s, %5s, %5s]%n", num, name, dept);       // �Լ� ������
	}
}