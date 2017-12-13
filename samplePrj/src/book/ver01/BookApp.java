package book.ver01;

import java.util.Scanner;

public class BookApp {

	public static void main(String[] args) {
		Book[] data = {
						new Book(001,"Servlet","Tiago", 5000,2015),
						new Book(002,"�ڹ����α׷���","����ȣ", 9000,2010),
						new Book(003,"SQL","Ana", 7000,1997)
						};
		BookMgr bm = new BookMgr(data); 

		
		Scanner scanner = new Scanner(System.in);
		int cmd = 0;
		
		while(true){
		System.out.println("===========================");	
		System.out.println("���� ���� ���α׷��� �����մϴ�");
		System.out.println("1. ������� Ȯ��");
		System.out.println("2. ���� [���]");
		System.out.println("3. ���� [����]");
		System.out.println("4. ���� �˻��ϱ�");
		System.out.println("5. ���α׷� ����");
		System.out.println("===========================");
		System.out.print("���ϴ� ����� �Է��ϼ��� :");
		
		cmd = Integer.parseInt(scanner.nextLine().trim());
		String title; 
		String author;
		
		switch(cmd){		
		case 1:
			bm.printBookList();
			break;
			
		case 2:
			System.out.print("����� ���� �ڵ带 �Է��ϼ���");
			int num = scanner.nextInt();
			scanner.nextLine();
			
			System.out.print("����� ���� ������ �Է��ϼ���");
			title= scanner.nextLine().trim();
			
			System.out.print("����� ���� ���ڸ� �Է��ϼ���");
			author= scanner.nextLine().trim();
			
			System.out.print("����� ���� ������ �Է��ϼ���");
			int price = scanner.nextInt();
			scanner.nextLine();
			
			System.out.print("����� ���� ���࿬���� �Է��ϼ���");
			int pubYear = scanner.nextInt();
			scanner.nextLine();
						
			Book data1 = new Book(num,title,author, price,pubYear);
			bm.addBook(data1);
			break;
			
		case 3:
			System.out.println("�����۾� ����");
			System.out.println("������ ���� ������ �Է��ϼ���.");
			title = scanner.nextLine();
			bm.delete(title);
			break;
			
		case 4:
			System.out.println("���� �˻� ��� �����մϴ�.");
			System.out.println("�˻��� ���� ������ �Է��ϼ���.");
			title = scanner.nextLine();
			bm.searchBookList(title);
			
			
			break;
			
		case 5:
			System.out.println("���α׷��� �����մϴ�.");
			System.exit(0);
			//break;
			
		default :
			System.out.println("�ٽ� �������ּ���");
			break;
		}
		}
	}

}
// �߰�, ����, �˻�, ������Ʈ �� �⺻ ���
