package day09;

public class Book {
		public Book() {}
	private String title;
	private int price;
	
	public Book(String title, int price) {
		this.title = title;
		this.price = price;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}
}
	

/*
o	1. å ����(title)�� ����(price)������ �����ϴ� ��������� �־�� �Ѵ�.
o	2. ��������� ��� private ���������ڸ� ������ �Ѵ�. 
o	3. ��������� ��� �ʱ�ȭ�ϴ� ������ �޼��尡 �־�� �Ѵ�. 
o	4. ��������� ���� �����ϰ� �����ϴ� setter/getter �޼��尡 �־�� �Ѵ�.
	setTitle(String title) : ������� title ���� �����ϴ� �޼ҵ�
	String getTitle() : ������� title ���� ��ȯ�ϴ� �޼ҵ�
	    void setPrice(int price) : ������� price ���� �����ϴ� �޼ҵ�
	int getPrice() : ������� price ���� ��ȯ�ϴ� �޼ҵ� 
o	5. setter/getter �޼���� ��� public ���������ڸ� ������ �Ѵ�.   */

