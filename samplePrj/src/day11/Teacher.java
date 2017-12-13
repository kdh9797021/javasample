package day11;

public class Teacher extends Person {
	private String subject;
	public Teacher() {
		super();
	}
	public Teacher(String name, int age, String subject) {
		super(name,age);
		this.subject = subject;
	}	
	
	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	public void display(){
		System.out.printf("�� ��:%s\t�� ��:%d  \t������:%s %n",super.getName(),super.getAge(),subject);
	}
}
