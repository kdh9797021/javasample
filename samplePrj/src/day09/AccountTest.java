package day09;

import util.Account_2;

public class AccountTest {
	public static void main(String[] args) {

		Account_2 a1 = new Account_2("ȫ�浿", "001", 3000);
	//	a1.deposit(5000);
	//	a1.withdraw(2000);		
		Account_2 a2 = new Account_2("��浿", "002", 1000);
		a2 = null;
		a1.transfer(a1, a2, 1000);

	}

}
