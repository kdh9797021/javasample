package day07;

public class CalcTest {
	public static void main(String[] args) {
		Calc c1 = null;
	
		System.out.println(c1.add(455, 765));     //static�� �ڿ��� class�̸� ����.
		System.out.println(Calc.add(455, 765));  // ��������data static ó�� ����. (ex.���� �߻�)
		System.out.println(Calc.sub(455, 765));
		System.out.println(Calc.div(455, 765));
	}

}
