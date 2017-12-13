package day20;

public class Test02 {
	public static void main(String[] args) {
		Command delete = new DeleteCommand();  //Ŭ���� ���� ����
		Command update = new UpdateCommand();
		Command select = new SelectCommand();
		Command insert = new InsertCommand();
		
		if(args.length == 0){
			System.out.println("delete/update/select/insert �� �ϳ��� �Է��ϼ���.");
			return;
		}
		
		
		if(args[0].equals("delete")){
			delete.exec();
		}else if(args[0].equals("update")){
			update.exec();
		}else if(args[0].equals("select")){
			select.exec();
		}else if(args[0].equals("insert")){
			insert.exec();
		}else{
			System.out.println(args[0]+"��� ������ �ȵ˴ϴ�. ");
		}
		System.out.println("===============main END ==============");
	}
}

interface Command{
	void exec();
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