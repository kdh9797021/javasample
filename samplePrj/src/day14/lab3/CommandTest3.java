package day14.lab3;   //Command design pattern ���� > Command interface ����

public class CommandTest3 {
	public static void main(String[] args) throws Exception {   //����ó��(������ coding)
		Command cmd = null;
	
		cmd = new day14.lab3.DeleteCommand();  // ���� ��ü ������� (compile�� ���� �ּ� ��� �޸� ��� )
		
		Class cls = Class.forName(args[0]);  // classȭ ��ü ���� (run time�� Stringó���Ͽ� ���� ó�� �޸� ���)
		Class cls2 = Class.forName("day14.lab3.DeleteCommand");  //����binding mapping (�����߻� ����, ����ó�� �ʿ�)
		cmd = (Command) cls.newInstance();  //args[0]��ü�� �޸𸮿� ���.
		
		cmd.exec();
		
	}
}
