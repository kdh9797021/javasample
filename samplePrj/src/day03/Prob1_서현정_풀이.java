package day03;

public class Prob1_������_Ǯ�� {
	public static void main(String[] args) {
		
		char ch = 'V';
		char lowerCase = (char) (ch >= 'A'  && ch<= 'Z' ? (char)ch+32: ch);
		System.out.print("ch:"+ch);
		System.out.println(" to lowerCase :"+lowerCase);

        /*
        ������ �빮�ڸ� �ҹ��ڷ� �����ϴ� �ڵ��Դϴ�.
        ���� ch�� ����� ���ڰ� �빮�� �� ��쿡�� 
	�ҹ��ڷ� �����ϴ� �ڵ带 �ϼ� �մϴ�.
*/
		
	

/*
 �Ʒ��� ���� num�� ��������  ��� ���� 0�� ����ϴ� �ڵ��Դϴ�.
���� �����ڸ� �̿��ؼ� �� �˸��� �ڵ带 �ϼ��ϼ���. 
*/
	int num = 80;
	System.out.println(num > 0 ? "���": num == 0 ?  "0": "����");
	

	}

}
