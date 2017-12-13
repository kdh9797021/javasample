package day14.lab3;

public interface Command {
	public abstract void exec();
	//default method (jdk 1.8���� �߰�)
	default void newMethod(){System.out.println("~~~~~~~~~~~~~~~~~");}  //interface ��� ���� �߰��� error �߻��ϹǷ� 'default' �߰�.


}

class DeleteCommand implements Command {
	@Override
	public void exec() {
		System.out.println("������� ����");
	}
	public void newMethod(){
		// Command.super.newMethod();
	System.out.println("++++++++++++++++++++++++++=");}
}

class InsertCommand implements Command {

	@Override
	public void exec() {
		System.out.println("��ϱ�� ����");
	}
}

class UpdateCommand implements Command {

	@Override
	public void exec() {
		System.out.println("������� ����");
	}
}

class SelectCommand implements Command {

	@Override
	public void exec() {
		System.out.println("��Ϻ��� ��� ����");
	}
}