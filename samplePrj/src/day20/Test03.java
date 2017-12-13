package day20;  //Test 02�� if�� ó�� / Test 03�� Map���� ó��

import java.util.HashMap;
import java.util.Map;

public class Test03 {
	public static void main(String[] args) {
		if(args.length == 0){
			System.out.println("delete/update/select/insert �� �ϳ��� �Է��ϼ���.");
			return;
		}
		
		Map <String, Command> map = new HashMap();
		map.put("delete", new DeleteCommand());
		map.put("update", new UpdateCommand());
		map.put("select", new SelectCommand());
		map.put("insert", new InsertCommand());
	
		Command command = map.get(args[0]);
		if(command == null){
			System.out.println(args[0]+"����� �������� �ʽ��ϴ�.");
			return;
		}
		command.exec();
		//map.get(args[0]).exec();		
		
		System.out.println("===============main END ==============");
	}
}
