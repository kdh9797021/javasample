package day04;

import java.util.Scanner;

public class P156 {
	public static void main(String[] args) {
	
		String command;		
		Scanner scanner = new Scanner(System.in);
		
		while(true){   // while�� �ݺ� ���(True)  - ���Ա� ��ġ ���� �߿� 
		System.out.println("*********** ��� ���� ************ ");
		System.out.println("                                      ");
		System.out.println("1. insert (���)  \n");
		System.out.println("2. delete(����)  \n");
		System.out.println("3. update(����) \n");
		System.out.println("4. quit   (����)     \n");
		System.out.println("**********************************\n \n");
		System.out.println("������ ����� �����ϼ���!");       
		System.out.println(" 1 2 3 4 �� �ϳ��� �����ϼ��� ");	
		
		command = scanner.nextLine();     // ���� ���������� command swift ����. ������������ char type �����߾��.
		
		switch(command){
			case "1":
				System.out.println("��� �۾��� �����մϴ�.");
				break;
			case "2":
				System.out.println("���� �۾� �����մϴ�.");
				break;
			case "3":
				System.out.println("���� �۾� �����մϴ�.");
				break;
			case "4":
				System.out.println("���α׷� �����մϴ�.");
				System.exit(0);    // ���α׷� ���� ��ɾ� 
				
				default:        // ���� ��Ȳ ����
					System.out.print(" 1 2 3 4 �� �ϳ��� �����ϼ���.  _");   // ln ������, "_ "�߰��ϸ� Ŀ�� ������ ����. 
						
		}
						
					}
		}
		
	

}
