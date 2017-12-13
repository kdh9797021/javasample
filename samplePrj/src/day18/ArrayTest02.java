package day18;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class ArrayTest02 {
	public static void main(String[] args) {
		List<Employee> list = new ArrayList<Employee>();   //list resizing �ڵ�       
		/* ���� ���
	Employee [] emp = new Employee[100];            
		emp[0] = new Employee();
		emp[2] = new Employee();
		for(int i=0;i<emp.length;i++){
			System.out.println(emp[i].toString());  //�⺻������ ����� ���� X > NullPointer error �߻�   */
		//*****��� 
		list.add(new Employee("007","ȫ�浿","�����"));
		list.add(new Employee("003","��浿","�����"));
		list.add(new Employee("006","ȫ","�����"));
		list.add(new Employee("001","ȫ��","�����"));
		list.add(new Employee("009","ȫ��","�����"));
		//������ ���
		Collections.sort(list);  //��ȣ������ sorting�ϱ� /CompareTo - num������ ����
		
		for(int i=0; i<list.size(); i++){             //Collection������ �������� for�� �Ⱦ�.(set���� ���� �����Ƿ�)
			System.out.println(list.get(i));
		}
		System.out.println("------------------------------------------------------------------------------------");
		//*****����
		Iterator<Employee> it = list.iterator();   //�ش� �ּ� ����
		while(it.hasNext()){  //boolean, false ������ /true ������ 
			Employee data = it.next(); //��ĭ���� �о��ָ鼭 �̵��ϴ� ���.
			if(data.getNum().equals("006")){
				System.out.println(data+" : ������� �����մϴ�.");
				it.remove();  //equals() �ش� ������ ���� ��û
			}
		}
		
		System.out.println("=========================������ ======================");
		for(Employee data:list){   //list���� data ����
			System.out.println(data);
		}
		System.out.println("------------------------------------------------------------------------------");
		//*****�˻� (for�� / iterator �Ѵ� ��� ����)
 		System.out.println("�̸��� ȫ���� ��� ��� �˻�");
		for(Employee data:list){
 			if(data.getName().charAt(0)=='ȫ'){   //���ǹ� charAt(ù��°����) > �⺻���̹Ƿ� == ���.
 				System.out.println(data);
 			}
 		}
		System.out.println("--------------------------------------------------------------------------------");
		Employee[] data = new Employee[list.size()]; //������ ������ŭ�� �迭 ����
		System.out.println(Arrays.toString(data));
		list.toArray(data);
		System.out.println(Arrays.toString(data));
	}
	}

class Employee extends Object implements Comparable<Employee>{ 
	String num;
	String name; 
	String dept;
	
	public Employee() {}
	public Employee(String num, String name, String dept) {
		this.num = num;
		this.name = name;
		this.dept = dept;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((dept == null) ? 0 : dept.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + ((num == null) ? 0 : num.hashCode());
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
		Employee other = (Employee) obj;
		if (dept == null) {
			if (other.dept != null)
				return false;
		} else if (!dept.equals(other.dept))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (num == null) {
			if (other.num != null)
				return false;
		} else if (!num.equals(other.num))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "Employee [num=" + num + ", name=" + name + ", dept=" + dept + "]";
	}
	@Override
	public int compareTo(Employee o) {
		return num.compareTo(o.num);   //������������ ���� ����('��'�� �տ� �θ�)
		//return o.name.compareTo(name);; ������������ ���� ����
	}
	public String getNum() {
		return num;
	}
	public String getName() {
		return name;
	}
	public String getDept() {
		return dept;
	}
	public void setNum(String num) {
		this.num = num;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setDept(String dept) {
		this.dept = dept;
	}
	
	
}