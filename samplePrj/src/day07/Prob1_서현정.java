package day07;

public class Prob1_������ {
	public static void main(String args[]) {   //main method ��ü ������, Test ���� ���� // Class ��ġ ���X
		Prob1_������ prob1 = new Prob1_������();  // ��ü ����.
		   
		// prob1.leftPad("SDS",9,'@');    //@@@@@@SDS(����� ���� �ּ�)    + Sysout���� print.
		System.out.println( prob1.leftPad("SDS", 6, '#') );
		System.out.println( prob1.leftPad("SDS", 6, '#').equals("###SDS"));   // .equals(   )     ������ true/false ���� ���� 
		System.out.println( prob1.leftPad("SDS", 5, '$') ); 
		System.out.println( prob1.leftPad("SDS", 2, '&') );                            //���� ��� A
		System.out.println(prob1.leftPad("SDS", 2, '&').equals("SDS"));     //���� ��� B
		
	
	}
	public String leftPad(String str, int size, char padChar) {   // instance method(�ּ� �ʿ�) �� ������ �߿�. 
		String result="";
		if (str.length()> size){
			return str;      //return�� ������ error.
		}
		int tmp=size-str.length();   //�߰�) ������ ������ ���� 
		for(int i=0; i < tmp;i++){
			result += padChar; 

	  }return result += str;
	}
}
/*
2.	�Է� ���ڿ�(str)�� ���̰� �Է¹��� ��(size)�� �� ������ 
���ڿ��� ������ ������ ����(padChar)�� ä�� �� �����Ѵ�.

3.	��, �Է� ���ڿ�(str)�� ���̰� �Է¹��� ��(size) ���� 
     ū ��쿡�� ���� ���ڿ�(str)�� �״�� �����Ѵ�.*/