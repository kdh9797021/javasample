package day15.Inner02;  //Inner class (�Ϲ� class /static class ����)

public class Test01 {    //day15.Inner01.Test01 ������ ���� 
	public static void main(String[] args) {
		A.B b = new A().new B();  //b�� a�� �ּҸ� �����ϱ� ���� �ʱ�ȭ     (outer �ּҸ� ����)
		b.print();
		 
		new A().pp();  
		
		A.S s = new A.S();   //class A ���� �ִ� static class void ȣ��. (class name.class name)
		s.print();
	}
}

class A {
	String name = "A";

	void pp(){
		new B().print();   // class B�� print ȣ�⹮
	}

	class B {
		void print() {
			System.out.println(name);
		}
	}
	static class S{    //static �����̹Ƿ� outer�� instance variable ��� �Ұ���. 
		void print() {
			System.out.println("~~~~~~~~~~~");
		}
	//	System.out.println(name); 
		
	}
}
