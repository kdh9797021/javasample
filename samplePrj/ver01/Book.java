package Book;

public class Book {
	private String title;
	private int price;

	public Book() {
	} // <- �Ű� ������ ������ �������Ѵ�

	public Book(String title, int price) {

		this.title = title;
		this.setPrice(price);//�����̽� �˰����� ����̿��ҷ��� �̷��� ����ؾ���
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
		if (price < 0) {
			return;
		}
		this.price = price;
	}
	
	

	public void display() {

		System.out.printf("Book[%s %d��]%n", title, price);
	}
	@Override
	public String toString(){
		return "Book["+title+","+price+"]";
	}
}
