package day08;

public class CalcTest {
	public static void main(String[] args) {
	
		System.out.println(Calc.add(55, 77, 99));    //�Լ� ȣ�� 
		System.out.println(Calc.add(55, 77)==132);   		
		System.out.println(Calc.add(1, 7));   	//���� method name�ӿ��� �Ű����� ����,type�� ���� �ڵ� �з� ����(no error)
		System.out.println(Calc.add());            
		System.out.println(Calc.add(3.5,3.7));   //�Ű����� type�� ���� ������ method �ڵ� ����.
		System.out.println(Calc.add(3,3.7));  
		
		
	
	}

}
