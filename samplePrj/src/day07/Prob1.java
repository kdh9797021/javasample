package day07;

public class Prob1 {
	public static void main(String args[]) {
		Prob1 prob1 = new Prob1();
		
		System.out.println( prob1.leftPad("SDS", 6, '#') );
		System.out.println( prob1.leftPad("SDS", 5, '$') ); 
		System.out.println( prob1.leftPad("SDS", 2, '&') ); 
	}
	public String leftPad(String str, int size, char padChar) {
		String result = "";
		for(int i=0; i < size-str.length();i++){
			result += padChar;		
		}
			result += str;
			return result;     
	}
}
/*
2.	�Է� ���ڿ�(str)�� ���̰� �Է¹��� ��(size)�� �� ������ 
���ڿ��� ������ ������ ����(padChar)�� ä�� �� �����Ѵ�.

3.	��, �Է� ���ڿ�(str)�� ���̰� �Է¹��� ��(size) ���� 
     ū ��쿡�� ���� ���ڿ�(str)�� �״�� �����Ѵ�.*/