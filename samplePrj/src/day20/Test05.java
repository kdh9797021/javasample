package day20; //���ٽ� ����

public class Test05 {
	public static void main(String[] args) {
		// ���ٽ�: ������ �Լ��� ��� (���� ������ ��ü�� �����)
		Command delete= ()->{    //override abstract method 
			System.out.println("delete ����~~~~~");
		};
		
		Command update= ()-> System.out.println("update ����~~~~");  //�� ���ο����� block ���� ����.
		Command insert= ()-> System.out.println("insert ����~~~~"); 
		
		Command select= ()->{System.out.println("select ����~~~~"); 
		};
		
		select.exec();
		select.print();
		
	
}
@FunctionalInterface //�Լ�ȭ�� ������ interface, �ݵ�� abstract method�� �ϳ��� ��쿡�� ����.
interface Command{  //�ϳ��� abstract method.
	void exec();
	default void print(){
		System.out.println("********************");
	}
}
//@FunctionalInterface   //�ΰ��� abstract method  
interface A{
	void go();
	void stop();
}

class DeleteCommand implements Command{  //abstract method override��.
	@Override
	public void exec() {
		System.out.println("DeleteCommand ����");
	}
	
}
class UpdateCommand implements Command{
	@Override
	public void exec() {
		System.out.println("UpdateCommand ����");
		
	}
	
}
class SelectCommand implements Command{
	@Override
	public void exec() {		
		System.out.println("SelectCommand ����");
	}
	
}
class InsertCommand implements Command{
	@Override
	public void exec() {
		System.out.println("InsertCommand ����");
	}
}
}
