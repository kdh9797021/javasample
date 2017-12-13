package util;

public class Account {
	String name; // ������ �̸�
	String accNo; // ���¹�ȣ
	int balance; // �ܰ�

	Account() {
	}

	Account(String name, String accNo, int balance, int deposit, int withdraw) {
		this.name = name;
		this.accNo = accNo;
		this.balance = balance;

	}

	public void display() { // ���� ���� �޼ҵ�
		System.out.println("�̸� : " + name);
		System.out.println("���¹�ȣ : " + accNo);
		System.out.println("�ܾ� : " + balance);
	}

	void deposit(int amount) { // �Ա� �޼ҵ�
		this.balance += amount;
		System.out.println(amount + "���� �Ա��ϰ�, �ܾ��� " + balance + "���Դϴ�.");
	}

	void withdraw(int amount) { // ��� �޼ҵ�
		balance -= amount;
		System.out.println(amount + "���� �����ϰ�, �ܾ��� " + balance + "���Դϴ�.");
	}

	public void finaldisplay() { // �����������
		System.out.printf("Account[%s ������ �ܰ�� %d �Դϴ�.]%n", accNo, balance);
	}
}
