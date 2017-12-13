package prob_1110;

public class Book {
	private String title;              //encapsulation (���� class�������� ���� ����)
	private String author;
	private int price;
	private int pubYear;
	
	
	public Book() {}   // default ������
	public Book(String title, String author, int price, int pubYear) {   //������ �Լ� ����
		this.title = title;
		this.author = author;
		// this.price = price;  ���� ��ȿ�� ������ �ش��� �ȵ�. 
		setPrice(price);   
		this.pubYear = pubYear;
		
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		if(price < 0){       
			return;
		}
		this.price = price;
	}
	public int getPubYear() {
		return pubYear;
	}
	public void setPubYear(int pubYear) {
		if(pubYear <= 0){   
			return;
		}
		this.pubYear = pubYear;
	}
	
	public void display(){
		System.out.printf("Book - %s : (����: %s),  %d ��, %d �� %n",title,author,price,pubYear);
	}
}
