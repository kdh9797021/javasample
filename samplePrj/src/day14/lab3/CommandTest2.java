package day14.lab3;   //Command design pattern ���� > Command interface ����

public class CommandTest2 {
	public static void main(String[] args) throws Exception {   //����ó��(������ coding)
		Command cmd = null;
	
		Class cls = Class.forName(args[0]);  // classȭ ��ü ����
		cmd = (Command) cls.newInstance();  //args[0]��ü�� �޸𸮿� ���.
		
		cmd.exec();
		cmd.newMethod();
	}
}
