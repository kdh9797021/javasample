package day04;

import java.util.Scanner;

public class P155 {
	public static void main(String[] args) {
		char gender;
		String regNo; // �ֹε�Ϲ�ȣ
		Scanner scanner = new Scanner(System.in);
		System.out.println("�ֹε�Ϲ�ȣ�� �Է��ϼ���.    �Է� ��:[990909-2933314]"); // 7��° ���� ����(��������)
																		
		regNo = scanner.nextLine();
		// ��ȿ�� ���� ���� �ʼ�.
		if (regNo.length() != 14) { // length�� 14�� �ƴ� ���.
			System.out.println("�ֹε�Ϲ�ȣ ����.");
			return;
		}
		gender = regNo.charAt(7); // charAt ���� method
		System.out.println(regNo + "    => " + gender);

		switch (gender) {
		case '1':
		case '3':
			System.out.println("����");
			break;
		case '2':
		case '4':
			System.out.println("����");
			break;
		default:
			System.out.println("�ֹι�ȣ ����.");
		}
	}
}
