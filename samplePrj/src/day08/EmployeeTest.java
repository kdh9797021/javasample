package day08;

public class EmployeeTest {
	public static void main(String[] args) {
		 Employee emp1 = new Employee();  // () �������Լ� ����.
		 emp1.display();
		 emp1.num="001";
		 emp1.name="ȫ�浿";   // emp1 ��ü �ʱ�ȭ 
		 emp1.dept="��ȹ��";
		 
		 Employee emp2 = new Employee("002","��浿","���ߺ�");     //�������Լ� �ʱ�ȭ
		 emp2.display();
		 
		 Employee emp3 = new Employee("003","��ҿ�","������");  // default ������() ȣ��.
		 emp3.display();
	}
}
