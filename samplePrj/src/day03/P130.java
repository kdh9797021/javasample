package day03;

public class P130 {
	public static void main(String[] args) {
			int jumsu = 8;  // ������ ��ȿ�� ���� �ʿ�(-60��) 

			if (0<= jumsu && jumsu <=100){    // ���� ��ȿ�� if ���ǽ� (���� ���� ����)
				String result = (jumsu >= 80) ? "Pass" : "No Pass" ;   // ��������: ��,���� data type ��ġ
				System.out.println(jumsu+ "  :  " +result);

			}else{   // ���ǿ� ���� ���� ��� 
				System.out.println("���� ���� => Ȯ���ϼ���.");  // ���� ��ȿ�� ���� ǥ��
			}
			// char c = 0<= jumsu && jumsu <=100 ? 'O' : 'X'  ;   	//String�� ���, 'O' : 'X'

			
			
			int i=100, j=200;
			int max = (i >j) ? i : j ;
			System.out.println(max);
			System.out.println("max : "+((i>j)? i : j ) );  //3�׿����(�ִ밪) >>  (���ǽ�)? ���ǿ� ���� ��A: ��B) ;
			
			
			
	}

}
