package day03;

import java.util.Scanner;

public class P142 {
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
		// ���ó�� ���ǹ� (�ϴ�)  - ��ø if ó��
	System.out.println("�������� ���ó��~~~");
	if(jumsu >= 90){
		grade = 'A';
	} else if(jumsu >= 80){
		grade = 'B';
	} else if (jumsu >=70){
		grade ='C';
	} else if (jumsu >=60){
		grade ='D';
	} else {    	// ������ ��ü ó��
		grade ='F';
	}
	
	System.out.println(jumsu+ " �� ����� "+grade);   //�ʱ�ȭ ������ �����̹Ƿ� char grade ' ' �ʱ�ȭ.
	
	}

}
