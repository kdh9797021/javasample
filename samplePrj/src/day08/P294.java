package day08;

public class P294 {
	public static void main(String[] args) {
		String s1 = new String();   //default
		System.out.println(s1);

		String s2 = new String("Hello");   //���ڿ�(char�� �迭)
	  	System.out.println(s2);
	
	  	char[] c = {'a','b','c','d','e','f'};  //����� �迭 ���ÿ�
	  	String s3 = new String(c,0,4);  //�����κ� �ɰ��� ���� 
	  	System.out.println(s3);
	}

}
