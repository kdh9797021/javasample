package Book;

import java.util.Scanner;

public class BookTest {

	public static void main(String[] args) {
		System.out.println("현재보유하고 있는 책");
		Book[] data = { new Book("ASP", 800), new Book("PHP", 8800) };
		BookMgr bm = new BookMgr();
		// bm.printBookList();
		bm.addBook(new Book("java programing", 1000));
		bm.addBook(new Book("JSP", 2000));
		bm.addBook(new Book("Spring", 4000));

		bm.printBookList();
		System.out.println("-------총가격--------");
		bm.printTotalPrice();

		String command;
		Scanner scanner = new Scanner(System.in);
		while (true) {
			System.out.println("\n***** 명령 선택 *******");
			System.out.println("메뉴선택");
			System.out.println("1. 책추가\n");
			System.out.println("2. 책대여\n");
			System.out.println("3. 현재 대여가능한 책\n");
			System.out.println("4. 현재 대여가능한 책\n");
			System.out.println("5. quit(종료)\n");
			System.out.println("********************\n");
			System.out.println("수행할 명령을 선택하세요.");
			System.out.print("1,2,3,4 중 하나를 선택하세요");
			command = scanner.nextLine();
			switch (command) {
			case "1":
				String bookname;
				int price1;
				Scanner add = new Scanner(System.in);
				System.out.println("추가할 책 이름을 입력하시오");
				bookname = scanner.nextLine();
				Scanner add1 = new Scanner(System.in);
				System.out.println("가격을 입력하세요");
				price1 = Integer.parseInt(scanner.nextLine());
				bm.addBook(new Book(bookname, price1));
				bm.printBookList();
				bm.printTotalPrice();
				break;
			case "2":
				System.out.println("삭제작업 수행.");
				System.out.println("삭제할 도서 제목을 입력하세요.");
				String dis = scanner.nextLine();
				bm.disBook(dis);
				break;
			case "3":
				bm.printBookList();
				break;

			case "4":
				System.out.println("도서 검색 기능을 수행합니다.");
				System.out.println("검색할 도서 제목을 입력하세요");
				String title = scanner.nextLine();
				bm.searchBookList(title);
				break;
			case"5":
				System.out.println("종료");
				System.exit(0);
				break;
				
			default:
				System.out.println("잘못 누르셨습니다.");

			}
		}

	}

}
