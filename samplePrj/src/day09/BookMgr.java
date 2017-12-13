package day09;

public class BookMgr {

	int count = 0;

	public BookMgr() {
	}

	Book[] booklist = new Book[100];

	public void addBook(Book book) {
		booklist[count] = book;
		System.out.println("");
	}

	public void printBookList() {
		for (int i = 0; i < count; i++) {
			System.out.println("å ���:"+booklist[i].getTitle());
		}
		
	}

	public void printTotalPrice() {
		int sum = 0;
		for (int i = 0; i < count; i++) {
			sum += booklist[i].getPrice();
		}
		System.out.println("��� å ������ ����"+sum+"�Դϴ�.");
	}

}

/*
 * 1. å(Book) ��ü ���� ���� ������ �� �ִ� å ���(booklist)�̶�� �迭�� ��������� ������ �Ѵ�. 2. å
 * ���(booklist)�̶�� �迭 ������ �ʱ�ȭ�ϴ� ������ �޼��带 �ۼ��ؾ� �Ѵ�. 4. Book ��ü�� booklist�� ����ϴ�
 * addBook(Book book) �޼��带 �ۼ��ϼ��� 5. å ����� ȭ�鿡 ����ϴ� printBookList() �޼��尡 �־�� �Ѵ�.
 * 6. ��� å ������ ���� ����ϴ� printTotalPrice() �޼��尡 �־�� �Ѵ�.
 */
