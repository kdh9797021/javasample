package day03;

import java.util.Scanner;

public class P154 {
	public static void main(String[] args) { 
	// Ű���带 ���ؼ� ������ �Է� �ް� (Scanner)
		int jumsu;
		char grade=' ';
		Scanner scanner= new Scanner(System.in) ;   // Scanner class ��ü ����
		System.out.println("������ �Է��ϼ���!      �Է¿���)100      ");
		jumsu = Integer.parseInt(scanner.nextLine());   // ���ڿ��� ���������� ��ȯ�ؾ���. Integer.parselnt
		
	if (!(0<=jumsu && jumsu <=100)){       //���� ��ȿ�� üũ, !(not) ���� �߰�.
		System.out.println("jumsu�� ��ȿ���� �ʾ� ����˴ϴ�.");  //�޽��� ó�� �׻� ����.
		return;  // �Լ��� ������ ������ ȣ�� �������� �����ϴ� ��ɾ�. (�Լ� ���� ����) / return�� ���� > void
	}	

	System.out.println("�������� Switch���� ���ó��~~~");

	switch(jumsu/10){
	case 10:
	case 9:
		grade='A';
		break;
	case 8:
		grade='B';
		break;
	case 7:
		grade='C';
		break;
	case 6:
		grade='D';
		break;
	default:
		grade='F';
	}
	
	System.out.println(jumsu+ " �� ����� "+grade);  
	
	}

}
