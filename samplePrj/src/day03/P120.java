package day03;

public class P120 {
	public static void main(String[] args) {
		char c = '!';	// 0 1 ~ 9 �⺻ ���� ����
		boolean f1,f2; 
		boolean result = (f1= '0' <=c) && (f2= c <='9');       //�������� �ƴ����� ���� �Ǻ��� A
		System.out.println(result);
		
		boolean result1 = 48 <=c & c <=57;      //�������� �ƴ����� ���� �Ǻ��� B(ASCII�ڵ� ���)

		
		System.out.println('0' +" => "+((int)'0'));  	//���� 0�� �ش��ϴ� ASCII�ڵ� (�Ǻ��� B)
		System.out.println('9' +" => "+((int)'9'));   
		
		System.out.println(c + "����?" + result); 	// (�Ǻ��� A)
		
		System.out.println(Integer.toBinaryString(11));    // 2���� ��ȯ ��� (������)
		System.out.println("     "+Integer.toBinaryString(3));    // 2���� ��ȯ ���
		System.out.println("       "+ (11 & 3));	 //��Ʈ ����
	
	}

}
