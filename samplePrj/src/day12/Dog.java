package day12;

public class Dog extends Animal{
	String kind = "������ ����";
	String name;
	
	public Dog(){ 
		// super();  // �����ص� �ڵ� ȣ���.(object)
	}
	public Dog(String kind, String name) {
		// super();
		this.kind = kind;
		this.name = name;
	}
	public Dog(String superk,String kind, String name) {
		super(superk); //��ü ������ �θ��� �����ڴ� ���ϴ� ���� ����Ͽ� ȣ�� ����.(���X -> default ������ ȣ��)
		this.kind = kind;
		this.name = name;
	}
	public void display(){
		System.out.printf("Dog[%s %s %s]%n",super.getKind(),kind,name);
	}
	@Override
	public void breath() {
		System.out.println("��� ����");
				
		
	}
	// public void breath(){}   //overriding ���. �̿ϼ� �ڵ� ����

		
	


			}

