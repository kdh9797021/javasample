package Book;

import java.util.Scanner;

public class BookTest {

	public static void main(String[] args) {
		System.out.println("���纸���ϰ� �ִ� å");
		Book[] data = { new Book("ASP", 800), new Book("PHP", 8800) };
		BookMgr bm = new BookMgr();
		// bm.printBookList();
		bm.addBook(new Book("java programing", 1000));
		bm.addBook(new Book("JSP", 2000));
		bm.addBook(new Book("Spring", 4000));

		bm.printBookList();
		System.out.println("-------�Ѱ���--------");
		bm.printTotalPrice();

		String command;
		Scanner scanner = new Scanner(System.in);
		while (true) {
			System.out.println("\n***** ��� ���� *******");
			System.out.println("�޴�����");
			System.out.println("1. å�߰�\n");
			System.out.println("2. å�뿩\n");
			System.out.println("3. ���� �뿩������ å\n");
			System.out.println("4. ���� �뿩������ å\n");
			System.out.println("5. quit(����)\n");
			System.out.println("********************\n");
			System.out.println("������ ����� �����ϼ���.");
			System.out.print("1,2,3,4 �� �ϳ��� �����ϼ���");
			command = scanner.nextLine();
			switch (command) {
			case "1":
				String bookname;
				int price1;
				Scanner add = new Scanner(System.in);
				System.out.println("�߰��� å �̸��� �Է��Ͻÿ�");
				bookname = scanner.nextLine();
				Scanner add1 = new Scanner(System.in);
				System.out.println("������ �Է��ϼ���");
				price1 = Integer.parseInt(scanner.nextLine());
				bm.addBook(new Book(bookname, price1));
				bm.printBookList();
				bm.printTotalPrice();
				break;
			case "2":
				System.out.println("�����۾� ����.");
				System.out.println("������ ���� ������ �Է��ϼ���.");
				String dis = scanner.nextLine();
				bm.disBook(dis);
				break;
			case "3":
				bm.printBookList();
				break;

			case "4":
				System.out.println("���� �˻� ����� �����մϴ�.");
				System.out.println("�˻��� ���� ������ �Է��ϼ���");
				String title = scanner.nextLine();
				bm.searchBookList(title);
				break;
			case"5":
				System.out.println("����");
				System.exit(0);
				break;
				
			default:
				System.out.println("�߸� �����̽��ϴ�.");

			}
		}

	}

}
