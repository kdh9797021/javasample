package day08;
/**
 * 
 * @author student
 * @since 2017.11.08
 */

public class Employee {
	String name;    //instance(member) variable
	String dept;      
	String num;	  
	
	
	public Employee(){   // ���� class ��ü�� �ڵ� form.  
		this("000","�����","OO��");  //�ߺ��� �ڵ� �����.(�ٸ� ������ ȣ��)  //�׻� first statement ��ġ������ ȣ��.
	/*	this.num="000";
		this.name="�����";       //�⺻�� �ʱ�ȭ 
		this.dept="OO��"; 
		System.out.println("Employee() ������ �Լ� ");  */ //default �������Լ��� �⺻������ �׻� �����ؾ���.
	}
	
	public Employee(String num,String name,String dept){  //������ �Լ� ����, ����
			this.num = num;    //this. �ڿ� ��� 
			this.name = name;
			this.dept = dept;
	}
	
	/**
	 * Employee ���� ��¿�
	 */
	public void display(){       //instance method (method�� ��ɹ� ������ �߿�, variable/method ������ �߿�X) 
		System.out.printf("Employee[%s, %s, %s] %n",num,name,dept);    //this�� heap���� ���(static ��� �Ұ���)

	}
}
