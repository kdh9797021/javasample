package day14; //Interface�� ���� ��� ��� 

public class Test01 {
	public static void main(String[] args) {
		AA a= new AA();
		BB b = new BB(); // a = b;  �̼���
		
		A[] aaa = { new AA(), new BB()};   //�ٸ� class�� method�� ��� X.
		B[] bbb = { new AA(), new BB()};
		C[] ccc = { new AA(), new BB()};
		I[] iii = { new AA(), new BB()};

		for(int i=0;i<aaa.length;i++){
			aaa[i].a();   //a()��
			bbb[i].b();  //b()��
			ccc[i].c();  //c()��
			// iii[i]  a(),b(),c() ��� �ҷ����� ����.
		}
	//	I c = new AA();  // �θ� type���� �����ϸ� ���� ���� �� ������ �ټ��� ��� ���ؾ��ؼ� ���� �����.
   //	c = new BB();
	}
}
class AA extends Object implements I {
	@Override
	public void c() {}
	@Override
	public void b() {}
	@Override
	public void a() {	}
}

class BB extends Object implements I {
	@Override
	public void c() {}
	@Override
	public void b() {}
	@Override
	public void a() {}
}

interface I extends A,B,C {          //Interface�� ���߻��(�����ϱ� ����)
}

interface A {
	void a();
}

interface B {
	void b();
}

interface C {
	void c();
}