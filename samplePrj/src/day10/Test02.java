package day10;

public class Test02 {
	public static void main(String[] args) {
		Fish f = new Fish();
		f.breath();
		
		Animal ff = new Fish();    //�޼ҵ尡 overriding��, �ڽ� method�� ȣ���.
		ff.breath();
		
		Animal a;   //�θ� ��ü type �ϳ��� �پ��� �ڽ� ��ü�� ���� ������. 
		
	}
}
