package day19;  //Map ���� ����(class Student)

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class MapTest02_2 {

	public static void main(String[] args) {
		Map<String, Student> map = new TreeMap<>();
		Student[]s = {                 //data ���� �۾�(���� data �Է� or Scanner, file, DB)  
		new Student("2017009","��",90,88),
		new Student("2017066","��",90,88),
		new Student("2017011","��",97,88),
		new Student("2017032","��",90,88),
		new Student("2017032","��",99,99)
		};
		for(int i=0;i<s.length;i++){
			map.put(s[i].getName(), s[i]);
		}
		Set<String> keys = map.keySet();  //�й� ���� ����  (set������ return > map.keySet())
		Iterator<String> it = keys.iterator();
		while (it.hasNext()) {
			String num = (String) it.next();
		System.out.println(map.get(num));
		}
	//	System.out.println(map);
	}
}
class Student{
	String num; //�й�, �ߺ�X
	String name;
	int ko,math,avg;
	
	
	public String getNum() {
		return num;
	}
	public void setNum(String num) {
		this.num = num;
	}
	public String getName() {
		return name;
	}
	public Student() {	}
	public Student(String num, String name, int ko, int math) {
		super();
		this.num = num; 
		this.name = name;
		this.ko = ko;
		this.math = math;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ko;
		result = prime * result + math;
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
		if (num == null) {
			if (other.num != null)
				return false;
		} else if (!num.equals(other.num))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "Student [�й�=" + num + ", �̸�=" + name + ", �ѱ��� ����=" + ko + ", ���� ����=" + math + "]";
	}
	
}