package day02;

import java.util.Scanner;

public class P40 {
	public static void main(String[] args) {
		Scanner input = null; //Ŀ�� ���� import Ȥ�� Typing
		input = new Scanner(System.in); //only ��ü ������ ����(��ĳ�� Ư��) �ڿ��̹ݳ� ���ǥ��. �ҽ�����in

		System.out.print("�л��̸��� �Է��ϼ���:_");
		String name = input.nextLine(); //name���� ������ Ű�����Է¿� ���� ������(���ڿ�) in. Return type method
		
		System.out.print("������ �Է��ϼ��� ex)90_");
		// int score = Integer.parseInt(input.nextLine()); //String���� int������ ��ȯ��. input.nextLine(���� ��ü ó��).
		//APIȮ�� �߿�, ���� ���ɼ� ����.
		int score = input.nextInt();
		input.nextLine(); //input ENTER ó�� ���
		
		
		
		System.out.printf("�̸�: %s , ����: %d %n",name,score); //printf ��(���Ա�) �Է� ����.
		
		input.close(); //Ű���� �Է� ���� öȸ(�ڿ� �̹ݳ� ��� ���� closing)
		input = null;  //G.C. �̵� ����.
	}

}
