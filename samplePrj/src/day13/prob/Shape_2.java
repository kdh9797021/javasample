package day13.prob;

public abstract class Shape_2 {
	int numSides;
	
	// public Shape_2 (){}   //�θ��� default ������ 
	public Shape_2(int numSides) {
		super();
		this.numSides = numSides;
	}
	public int getNumSides() {
		return numSides;
	}
	abstract double getArea();
}

interface Resizable_2{   //interface�� �ڵ����� public abstract ó�� (body�ΰ� ����)
	public abstract void resize(double s);
}
class RectTriangle_2 extends Shape_2{
	double w;
	double h;
	
	public RectTriangle_2(double w, double h) {
		super(3);  //�θ��� default ������ ȣ���� �ʿ� ����.
		this.w = w;
		this.h = h;
	}

	@Override
	double getArea() {
		return w*h/2;
	}
	
}
class Rectangle_2 extends Shape_2 implements Resizable_2{
	double w;
	double h;
	
	public Rectangle_2(double w, double h) {
		super(4);
		this.w = w;
		this.h = h;
	}

	@Override
	public void resize(double s) {
		w = w*s;
		h = h*s;
		
	}

	@Override
	double getArea() {
		return w*h;
	}
	
}