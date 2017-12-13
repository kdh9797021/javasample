package Book;

public class Book {
	private String title;
	private int price;

	public Book() {
	} // <- 매개 변수를 무조건 만들어야한다

	public Book(String title, int price) {

		this.title = title;
		this.setPrice(price);//프라이스 알고리즘을 계속이용할려면 이렇게 사용해야함
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

		System.out.printf("Book[%s %d원]%n", title, price);
	}
	@Override
	public String toString(){
		return "Book["+title+","+price+"]";
	}
}
