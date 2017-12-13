package prob_1110;

public class BookMgr {
	int count = 0; // ���� �迭���� ������ ��ġ ���� ����(����)
	int[] year = new int[100];
	Book[] bookList = new Book[100]; // �� storage

	public BookMgr() {
	} // default ������ �Լ�

	public BookMgr(Book[] data) { // storage ��ü �ǹ� (�ʿ������ ���� ����) // null üũ �ʿ�.
		System.arraycopy(data, 0, bookList, count, data.length); // for�� ��ü ����
		count = count + data.length; // ���� data���� bookList�� ��.
	}

	public void addBook(Book data) {
		bookList[count] = data;
		count++;
	}

	public void printBookList() { // å ���� ���
			System.out.println("======== å ������ ����մϴ� ========== ");
			System.out.println("������ : (����),  ���� ����,  ���ǿ��� ");	
			for (int i = 0; i < count; i++) {
			bookList[i].display();
		}
	}

	public void printTitleList() { // å �̸� + ���� ���
			System.out.println("============= ������(����) ����Ʈ ============");
			for (int i = 0; i < count; i++) {
			System.out.println(bookList[i].getTitle()+ " ("+(bookList[i].getAuthor()+")"));
		}
	}

	
	public void sortYearList() {    // �Ⱓ���� �������� ���� ���
		System.out.println("======�Ⱓ���� �������� ���� ���� ����Ʈ =========");
		for (int i = 0; i < count-1; i++) {
			for (int j = i + 1; j < count; j++) {
				if (bookList[i].getPubYear() > bookList[j].getPubYear()) {
					Book temp = bookList[i];
					bookList[i] = bookList[j];
					bookList[j] = temp;
					System.out.println(bookList[i].getTitle()+ " ("+(bookList[i].getPubYear()+")"));
				}
			}
		}
	}
}
