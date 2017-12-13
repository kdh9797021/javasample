package book.ver02;

import java.io.FileNotFoundException;
import java.util.Scanner;

public class BookApp {

	public static void main(String[] args){
		Book[] data = { 
						new Book(001,"Servlet","Tiago", 5000,2015),
						new Book(002,"�ڹ����α׷���","����ȣ", 9000,2010),
						new Book(003,"SQL","Ana", 7000,1997),
						new Book(004,"Spring","�̽ſ�", 13000,2016),
						new Book(005, "���̽�", "������", 11000, 2017),
						new Book(006, "JQuery", "����", 8500, 2017)  
						};  
		
		BookMgr bm = null;
		try{
			bm = new BookMgr();   
		} catch(FileNotFoundException e){
			 bm = new BookMgr(data);
			
		}
		Scanner scanner = new Scanner(System.in);
		int cmd = 0;
		while(true){
		System.out.println("________________________________________________");	
		System.out.println("***** ���� ���� ���α׷��� �����մϴ� *****");
		System.out.println("1. ������� Ȯ��");
		System.out.println("2. ���� [���]");
		System.out.println("3. ���� [����]");
		System.out.println("4. ���� [�˻�]");
		System.out.println("5. ���α׷� ����");
		System.out.println("________________________________________________");	
		System.out.print("���ϴ� ����� �Է��ϼ��� :");
		cmd = Integer.parseInt(scanner.nextLine().trim());
		String title; 
		String author;
		
		
		switch(cmd){		
		case 1:
			System.out.printf("1.��ü ���� ���	2. �ֽ�(2017��) ���� ���  %n");
			int f1 = 0;
			f1 = Integer.parseInt(scanner.nextLine());
			if(f1 == 1){
				System.out.println("��ϵ� ��ü ���� ����� ������ �����ϴ�.");
				System.out.println("===============================================");
				bm.printBookList();
				System.out.println("===============================================");
			}
		
			else if(f1 == 2){
			System.out.println("2017�⿡ ��ϵ� �ֽ� ���� ����� ������ �����ϴ�.");
			System.out.println("===============================================");
			bm.printLatestBookList();
			System.out.println("===============================================");
			}
			
			break;
			
		case 2:
			System.out.print("����� ���� �ڵ带 �Է��ϼ���");
			int num = scanner.nextInt();
			scanner.nextLine();
			
			System.out.print("����� ���� ������ �Է��ϼ���");
			title= scanner.nextLine();
			
			System.out.print("����� ���� ���ڸ� �Է��ϼ���");
			author= scanner.nextLine();
			
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
			System.out.printf("1.[�����ڵ�]�� �˻�	2. [������]���� �˻�	3. [���ڸ�]���� �˻� %n");
			int f4 = 0;
			f4 = Integer.parseInt(scanner.nextLine());
			if(f4 == 1){
			System.out.println("�˻��� ���� �ڵ�(����)�� �Է��ϼ���.");
			num = scanner.nextInt();
			scanner.nextLine(); 
			System.out.println("============ �˻� ����� ������ �����ϴ�. ==============");
			bm.searchBookList3(num);
			System.out.println("===============================================");
			}
		
			else if(f4 == 2){
			System.out.println("�˻��� ���� ������ �Է��ϼ���.");
			title = scanner.nextLine().trim();
			System.out.println("============ �˻� ����� ������ �����ϴ�. ==============");
			bm.searchBookList(title);
			System.out.println("===============================================");
			}
			else if(f4 == 3){
				System.out.println("�˻��� ���ڸ��� �Է��ϼ���.");
				author = scanner.nextLine().trim();
				System.out.println("============ �˻� ����� ������ �����ϴ�. ==============");
				bm.searchBookList2(author);
				System.out.println("===============================================");
			}
			
			
			break;
			
		case 5:
			System.out.println("���α׷��� �����մϴ�.");
			System.exit(0);
			//break;
			
		default :
			System.out.println("1~5 �߿��� �ٽ� �������ּ���");
			break;
		}
		}
	}

}
// �߰�, ����, �˻�, ������Ʈ �� �⺻ ���
