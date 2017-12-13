package day12; //����� �����ϴ� �߻� Ŭ����

public abstract class Animal { //�Ϲ� class�� abstract method�� �����Ҽ� ����.
	private String kind = "������ ����";  //����� �ʱ�ȭ
	public Animal() { //������ �Լ� 
		System.out.println(" Animal() ����");
	}
	public Animal(String kind) {  //superk 
		super();
		this.kind = kind;
	}
	public String getKind() {
		return kind;
	}
	public void setKind(String kind) {
		this.kind = kind;
	}
	public abstract void breath();  //�����ΰ� ���� method
}
