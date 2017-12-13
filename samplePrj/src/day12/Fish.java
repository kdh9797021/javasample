package day12;

public class Fish extends Animal {
	String name ;
	public Fish() {
		super();
	}
	public Fish(String name) {
		this.name = name;
	}
	public Fish(String kind,String name) {
		super(kind);  //�ϴ� �� ������ �� �������� ��� ����.
		//super();
		//super.setKind(kind);  //�θ��� ������ �߰�
		this.name = name;
	}
	@Override   //jdk 1.5���� overriding�� ����� �Ǿ����� üũ. 
	public void breath(){
		System.out.println("�ư��̷� ������"); 
	}
	public void display(){
		System.out.printf("Fish[%s %s]%n",super.getKind(),name); //private �����ڿ��� ���� �����̹Ƿ� getKind ���.
				
	}
}

