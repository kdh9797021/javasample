package day03;

public class Prob1_������ {
	public static void main(String[] args) {
		
		 // char c ='a', d='A'; // -32   +32
		//System.out.println(c+ " "+(int)(c++)+ ", "+d+"  "+(int)(d++));    //casting�Ͽ� ASCII�ڵ�� ��ȯ.(int)
		
		char ch = 'a';
		char lowerCase = ('A' <= ch && ch <= 'Z')  ? (char)(ch - 32): ch;    // 'A', 'Z' �� �ڵ� ���θ�ǵǱ� ������ �״��(ASCII�ڵ�)
 		System.out.print("ch:"+ch);
		System.out.println(" to lowerCase :"+lowerCase);
		
 
        /*
        ������ �빮�ڸ� �ҹ��ڷ� �����ϴ� �ڵ��Դϴ�.
        ���� ch�� ����� '���ڰ� �빮�� �� ���'���� 
	�ҹ��ڷ� �����ϴ� �ڵ带 �ϼ� �մϴ�.
*/
		
	

/*
 �Ʒ��� ���� num�� �������� ' ��� ���� 0'�� ����ϴ� �ڵ��Դϴ�.     // �Ǻ��� ���� ��øIf���� ��� ���� 
���� �����ڸ� �̿��ؼ� �� �˸��� �ڵ带 �ϼ��ϼ���. 
*/
	int num = -90;
	String result  = null;    // ������ ���ڿ����� �ľ�, ���ú��� ���� �ʿ� (�⺻�ʱ�ȭ null)
	                                           // �ּ��� default �ʱ�ȭ_ null or blank "  "
	result = (num>0)? "���" : ((num<0)? "����" :"0") ;      // ���� 3���� 2���� ����. 1���� �������� �ڵ� ó��.
	System.out.println(num+" : " + result);
	

	}

}
