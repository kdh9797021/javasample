package day16.lang;

public class Test01 {
	public static void main(String[] args) {
		Point p = new Point(1, 1);    //������ �Լ�
		System.out.println(p);
		p.close();  //null assign�ϱ� ���� �ڿ� �ݳ�.
		 p=null;   //�� �� ��ü�� null�ؾ� G.C. ����� ��.
		
		// System.gc();  //���� ȣ��� / ���� ���� ���°� �Ǽ� �޸� ������ �ؾ��ϹǷ� ���� ������� ����. �ڿ� �ݳ��� close() ���.
		
		
		System.out.println("main end");
		
	}
}

class Point implements Cloneable{    //���� ��ü ���������� �ľ��Ͽ� marking ��(interface)
	private int x;
	private int y;
	
	public Point() {		}
	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}
	public int getX() {
		return x;
	}
	public int getY() {
		return y;
	}
	public void setX(int x) {
		this.x = x;
	}
	public void setY(int y) {
		this.y = y;
	}
	@Override
	public String toString() {
		return "Point [x=" + x + ", y=" + y + "]";
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + x;
		result = prime * result + y;
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Point other = (Point) obj;
		if (x != other.x)
			return false;
		if (y != other.y)
			return false;
		return true;
	}
	@Override
	protected void finalize() throws Throwable {     //�Ҹ��� ���� / Java������ ���� ������� �ʰ� ����Ͽ� close() �����.
		super.finalize();
		System.out.println(getClass().getSimpleName()+"finalize() ����");
		System.out.println("�ڿ��ݳ��ڵ�");
	}
	void close(){
		System.out.println(getClass().getSimpleName()+"finalize() ����");
		System.out.println("�ڿ��ݳ��ڵ�");
	}
	@Override
	protected Point clone() {   //Object(�׻� downcasting �ʿ�) or Point �Ѵ� ��� ����.
		Point obj = null;
		try {
			obj = (Point)super.clone();
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
		return obj;

		} 
	}