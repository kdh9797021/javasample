package day08;

public class Calc {
	public static int add(){
		return 0;
	}
	public static int add(int a, int b){  //instance method�� �ƴ�.   < method ����
		return a+b ;   //���� process ������ return.  <method ���� 
	}
	//�Ű����� type, ������ �ٸ��� name�� ������, 'method overloading'
	/**
	 * 
	 * @param a ���� ������
	 * @return �հ谡 ���ϵ˴ϴ�.
	 */
	public static int add(int...a){     // (type...����) > 0���� �����ϴ� ���� �迭/  add(int[]a) ���� �迭�� ó���ǹǷ� �ߺ�X
	//	public static int add(char A, int...a){            //�������ڴ� �Ű����� �� �ڿ�.         
		int sum=0;                                                  
		for(int i=0; i<a.length;i++){
			sum += a[i];
	}
		return sum;
}
	public static double add(double a,double  b){
		return a+b;
		
	}
}
