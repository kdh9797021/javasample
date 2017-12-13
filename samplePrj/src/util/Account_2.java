package util;

public class Account_2 {

	String name;
	String num;
	int money;

	public Account_2() {
	} // default ������ �Լ� �⺻������ ����

	public Account_2(String name, String num, int money) {
		this.name = name; // this ���ο� ���� �ǹ̰� �ٸ�.(this ���� ����)
		this.num = num;
		this.money = money;
	}

	// �Ա� ó�� method
	public void deposit(int money) {
		this.money += money;
		System.out.println("�Ա�:" + money + " �ܰ�:" + this.money);
	}

	// ��� ó�� method
	public void withdraw(int money) {
		if (money > this.money) {
			System.out.println("�ܰ���� �����Դϴ�.");
			return;
		}
		this.money -= money;
		System.out.println("���:" + money + " �ܰ�: " + this.money);
	}

	// �ܰ� ��ȸ method
	public void display() {
		System.out.println("�����ȣ :" + num + "," + name + " �ܰ�:" + this.money);
	}

	// ���� ��ü method
	public void transfer(Account_2 from, Account_2 to, int money) { // ���
																	// ���忡��(from),
																	// �Ա�
																	// ��������(to)
		if (to == null) { // �Ա� ���� ������ ���� ���
			System.out.println("�������� Ȯ���ϼ���");
			return;
		}
		if (from.money < money) {
			System.out.println("�ܰ���� �����Դϴ�.");
			System.out.println("���� ��ü�� �����մϴ�.");
			return;
		}
		System.out.println("��� ���� ����"); // ���� ���¿��� ��ü�� ���, 'from' 'this' ����.
		from.display(); // ��� ���� ����
		System.out.println("�Ա� ���� ����");
		to.display(); // �Ա� ���� ����
		System.out.println("--------------- ���� ��ü ������-----------------");
		from.withdraw(money); // ��� method �ҷ�����
		to.deposit(money); // �Ա� method �ҷ�����
		System.out.println("--------------- ���� ��ü �Ϸ�-----------------");

	}
}
