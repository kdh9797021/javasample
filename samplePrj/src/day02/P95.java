package day02;

public class P95 {
	public static void main(String[] args) {
	//char x ='a';
	float x = 'a'; //���� ���� ���� > ���� �ƴ�
	double y = 7+ 8 * x; //char���� int������ promotion.
	//System.out.println(y);
	System.out.printf("y= %.2f %n", y); //������  %.2f  �Ҽ��� �ڸ��� ����

	int i=5, j=5;
	System.out.printf("i= %d , j= %d: i==j => %s %n",i,j,i==j); 
	//System.out.printf("x>y = %s %n",i==j); //�񱳿������� ������� T/F, �񱳽��� ������� ���� %b, %d, %s�� ����.
	System.out.printf("i= %d, j=%d %n",i,j);
	System.out.println(++i);  //++ ��,�� ��ġ�� ���� ���갪 ���� �ñ� �ٸ�.
	System.out.println(i++);
	System.out.printf("i= %d, j=%d %n",i,j);
	
	int sum = 100;
	sum +=(int)y;  //�Ǵ� sum  = sum + (int)y;
	System.out.println(sum);
	System.out.println(sum % 10);  //% ����������
	System.out.println(sum / 10);
	
	
	}

}
