package day07; //����6 ������ Ǯ�� 2

public class Prob2 {
	
	public static String leftPad(String str, int size, char padChar) {   // main method test 
		String result="";
		if (str.length()> size){
			return str;      
		}
		int tmp=size-str.length();   
		for(int i=0; i < tmp;i++){
			result += padChar; 

	  }return result += str;
	}
	public static void main(String[] args) {        //static �ּҰ� X, Class name �ʿ� 
		String s = Prob2.leftPad("SDS", 7, '!');  // ������ type�� ���� s ����  <leftPad method ȣ��.
		System.out.println(s.equals("!!!!SDS"));   //������ �������� true/false ����
		
	}
}