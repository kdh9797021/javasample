package day12; //ToString method ����

public class Student extends Object {
	private String name;
	private int age;
	private int id;

	public Student() {
		super();
	}

	public Student(String name, int age, int id) {
		super();
		this.name = name;
		this.age = age;
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	// class�� �⺻������ toString / Equals �׻� �Է��ϱ�
	@Override
	public String toString() {
		// return "Student["+name+","+ age+","+"id"+"]"; // char�� �迭�� resizing
		// �Ұ�. ���� ���� ��������
		StringBuilder sb = new StringBuilder(); // StringBuffer�� ����
		sb.append("Student[");
		sb.append(name);
		sb.append(",");
		sb.append(age);
		sb.append(",");
		sb.append(id);
		sb.append("]");
		return sb.toString();
	}
	// Obj > equals method
	/*
	 * public boolean equals(Object obj){ if(obj instanceof Student){ Student st
	 * =(Student)obj; if((st.id == this.id) && (st.age == this.age) &&
	 * (st.name.equals(this.name))) return true; } return false;
	 */

	public boolean equals(Object obj){                         // ����� Ǯ�� 
		if(!(obj instanceof Student)) return false;
		Student data = (Student)obj;
		if(id == data.id && age == data.age && name.equals(data.name)){
			return true;	
	}
	return false;
}
}
