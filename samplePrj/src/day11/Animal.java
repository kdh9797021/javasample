package day11;

public class Animal {
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
	public void breath(){
		System.out.println("��� ������");
	}
}
