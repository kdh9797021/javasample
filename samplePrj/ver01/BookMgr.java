package Book;

import java.util.ArrayList;

public class BookMgr {
	
	ArrayList <Book> bookList = new ArrayList<Book>();

	public void addBook(Book data) {
		bookList.add(data);
	}
	

	public void disBook(String title) {
		int num= 0;
		for (int i = 0; i < bookList.size(); /* å�� ���� */ i++) {
			if (bookList.get(i).getTitle().equals(title)) {
				System.out.println("�����մϴ�");
				bookList.get(i).display();
				num = i;
				break;
			
			}

		}
		bookList.remove(num);
	}

	public void printBookList() {
		for (int i = 0; i < bookList.size(); i++) {
			bookList.get(i).display();

		}
	}

	public void printTitleList() {
		for (int i = 0; i <bookList.size(); i++) {
			bookList.get(i).getTitle();
			System.out.println(bookList.get(i).getTitle());
		}
	}

	public void printTotalPrice() {
		int total = 0;

		for (int i = 0; i <bookList.size(); i++) {
			bookList.get(i).getPrice();
			total += bookList.get(i).getPrice();

		}
		System.out.println(total + "��");

	}

	// �˻����
	public void searchBookList(String title) {
		int c = 0;
		for (int i = 0; i < bookList.size(); /* å�� ���� */ i++) {
			if (bookList.get(i).getTitle().equals(title)) {
				bookList.get(i).display();
				c++;
			}
		}
		if (c == 0)
			System.out.println("��û�� ������ �����ϴ�.");

	}

}
