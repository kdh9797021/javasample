package day16.exception;  //unchecked & checked ���� �� 

public class Test01 {

	public static void main(String[] args) {
		System.out.println("main START");
		
		//unchecked ���
		String name = null;
		if(name != null && name.length() > 0)  // try~catch�� �ƴ� ������ ���ǽ����� ����ó�� ����. 
		System.out.println(name.charAt(0));  

		//checked ���(try~catch)
		try {
			Class.forName("day16.exception.Sample"); //���� �߻��Ҽ���, �ƴҼ��� ���� (���� �߻���,catch��� ����) /full name class ��ġ �ʿ�
		} catch (ClassNotFoundException e) {
			// e.printStackTrace();
			System.out.println("Ŭ���� �̸� Ȯ�� �ʿ�");
		}
		
		System.out.println("main END");
	}
}
class Sample{
	
}
