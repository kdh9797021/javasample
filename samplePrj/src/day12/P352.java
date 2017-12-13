package day12;  //SingleTone ����� ������ ���� 

public class P352 {
	public static void main(String[] args) {
		//new SingleTone();     //��ü ���� �Ұ��� 
		SingleTone.getInstance();
	}
}

 class SingleTone{   
	private static SingleTone s = new SingleTone();
	private SingleTone(){  //�������Լ��� privateó�� > method�� ���� class�������� ���  
		System.out.println("SingleTone()  ����");
	}
	public static SingleTone getInstance(){
		return s;
		
	}
}