package day18;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;

public class ArrayTest01 {
	public static void main(String[] args) {
		Student[] s = new Student[100];
		s[0] = new Student();
	
		ArrayList<Student> list = new ArrayList<Student>();
		//���
		list.add(new Student("�浿��",100,99));
		list.add(new Student("�达",90,99));
		list.add(new Student("��",95,93));
		list.add(new Student("�ھ�",90,90));

		System.out.println(list);
 /*		list.remove(0);    //index ��ġ �ľ��� ��Ʊ� ������ ���������� ����ϱ� �����.
		System.out.println(list);
		list.remove(list.get(2));
		System.out.println(list);  */
		
		int delindex = -1;
		for(int i=0; i<list.size(); i++){
			Student data = list.get(i);
		//	data.avg();
			/* list.remove(i);  //�����۾��� size �ڵ� ��ȯ�Ǽ� error. (size�� �����̱� ����)
			System.out.println(list.size()); */
			if(data.name.equals("ȫ�浿")){
					delindex = i;
			}
		}
//		list.remove(delindex);
		System.out.println(list);
		System.out.println("====================================");
	
		for(Student data :list){          //���ο� ������ for��(��ġ index�� ������, set�������� ���� ���) / ��¿����θ� ���
			System.out.println(data);
			data.avg();
		//	list.remove(data);    �����۾��� error. 
			}
		System.out.println(list);
		
		Iterator<Student> it =list.iterator();   //�����۾��� **Iterator ** ���. (+while��)
		while(it.hasNext()){
			Student data = it.next();
			data.avg();
			if(data.name.equals("�浿��")){  
				it.remove();
			}
		}
		// System.out.println(list);
		System.out.println(list.contains(new Student("��",95,93)));  //contains() >data ���Կ��� Ȯ��
		
		// Arrays.sort(list.toArray()); // Arrays.sort()�� �迭�� ���¸� ���� ����.
		Student[] temp = (Student[]) list.toArray();  //Object�� �����ϳ� downcasting �� ������.  
	
		Student[] temp2 = new Student[list.size()]; // Generics ����.
		list.toArray(temp2);  //������� output���� ���� ��.  
		
		Arrays.sort(temp);
		
	//	Collections.sort(list);
		
		for(Student data: list){  //sorting �� ���� for�� 
			System.out.println(data);
			System.out.println("-------------------------------------------------------------");
		}
	}
}
	

class Student implements Comparable<Student>{
	String name;
	int ko;
	int math;
	double avg;
	
	public Student() {}
	public Student(String name, int ko, int math) {
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
	@Override
	public int compareTo(Student o) {  //Generic����/�Ⱦ��� �����ؼ� ������ Ȯ��.(Test)
		return name.compareTo(o.name);
	}

	

	
}