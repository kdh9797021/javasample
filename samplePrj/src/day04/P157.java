package day04;

public class P157 {
	
	public static void main(String[] args) {
		                                                                                                  //int count = 0;	// count ���� �߰�  count++   > ���� ���� Ȯ��
		// for(int count=0 ; count<5; count++){                    // scope Ȯ��(0 �ʱ�ȭ)  // ���ѷ��� (0�� ��� �׻� �� / ����count ���� ���)
	   //	System.out.println("Hello Java" +count);      //count ���� �߰� Ȯ��

		System.out.println("���� �ҹ��� �ڵ尪 Ȯ��  ");
	
		char c = 'a', d='A';  
		int count;  
		for(count=0 ; count<26; count++){      // ���������� count���� ��� ����.   ���ǽ�; ������
			System.out.println(c+"   " + (int)(c++) +", "+ d+" "+(int)d++);   
		}
		System.out.println(count);
		System.out.println(c);
		}
	 



	}

