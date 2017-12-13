package day18;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Vector;

public class ListTest01 {
	public static void main(String[] args) {
		Student[] s = new Student[100];
		s[0] = new Student();
	
		List<Student> list = new Vector<Student>();    //ArrayList > List , Vector�� ����.
		//���
		list.add(new Student("������",100,99));
		list.add(new Student("ȫ�浿",90,99));
		list.add(new Student("����ȣ",95,93));
		list.add(new Student("����",90,90));

		System.out.println(list);
		
		int delindex = -1;
		for(int i=0; i<list.size(); i++){
			Student data = list.get(i);
			if(data.name.equals("ȫ�浿")){
					delindex = i;
			}
		}
		list.remove(delindex);
		System.out.println(list);
		System.out.println("====================================");
	
		for(Student data :list){          
			System.out.println(data);
			data.avg();
			}
		System.out.println(list);
		
		Iterator<Student> it =list.iterator();   
		while(it.hasNext()){
			Student data = it.next();
			data.avg();
			if(data.name.equals("ȫ�浿")){  
				it.remove();
			}
		}
		System.out.println(list);
		
		System.out.println(list.contains(new Student("����ȣ",95,93)));  

	}
}
	

class Student2{
	String name;
	int ko;
	int math;
	double avg;
	
	public Student2() {}
	public Student2(String name, int ko, int math) {
		super();
		this.name = name;
		this.ko = ko;
		this.math = math;
	}
	public void avg(){
		avg = (ko+math)/2.;
		
	}
	@Override
	public String toString() {
		return "Student [name=" + name + ", avg=" + avg + "]";
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ko;
		result = prime * result + math;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}
	@Override  //equals()�� ���� ��밪�� ��ġ�ϴ��� �׻� Ȯ��. /avg() �񱳴� �ʿ�����Ƿ� �����ؼ� ����. 
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		if (ko != other.ko)
			return false;
		if (math != other.math)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}
	
}