package day13;

import java.util.Arrays;

public class Rectangle extends Shape {
	Point[] p = new Point[4];
	int w;  // = p[3].getX()-p[0].getX();     //�ʱ�ȭ ��ġ�� ���� Test �ʿ� 
	int h;  // = p[3].getY()-p[0].getY();
	
	public Rectangle() {
		super();
	}

	public Rectangle(Point[] p, String color) {
		super(color);
		this.p = p;
		w = p[3].getX()-p[0].getX();
		h  = p[3].getY()-p[0].getY();
	}

	@Override
	public String toString() {
		return "Rectangle [p=" + Arrays.toString(p) + ",\n w=" + w + ", h=" + h + "]";   //�迭 ��� Arrays.toString ȣ��
	}
	
	@Override
	public void draw() {
		super.draw();
		System.out.println(" �簢�� �׸���");
	}
}
	
