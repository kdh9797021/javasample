package day15.exception;

public class Test02 {
	public static void main(String[] args) {
		try{
			Thread.sleep(5000);   //try-catch�� �ǹ��� checked exception (5�ʵ��� ������, Start )
		}catch (InterruptedException e){
			e.printStackTrace();  //���� ��ġ�� ���.
		}
		System.out.println("START");
		String name = null;  //null point(unchecked exception) �� try-catch�� �ƴ϶� if�� ó��.
		if(name != null)
		System.out.println(name.toString());   // unchecked exception(run-type exception �� ����)
		
		System.out.println("END");
	}
}
