package day16.exception;

public class Test02 {
	public static void main(String[] args){  // throws MoneyEx. �ش� ������ vs  Ex. ��� ����
	try {	
	Account account = new Account("ȫ�浿",100);
		account.setMoney(-500);
		System.out.println(account);
	} catch (MoneyException e) {
		System.out.println(e.getMessage());
	}
		System.out.println("Main END");	
	}
}

class Account{
	private String name;
	private int money;
	
	public Account(String name, int money) throws MoneyException {  //�����ڿ� throws ó�� ����
		super();
		this.name = name;
		this.setMoney(money);  //try-catch ���
	}
	public Account() {
		super();
	}
	public int getMoney() {
		return money;
	}

	public void setMoney(int money) throws MoneyException {  
		if(money <0){
			throw new MoneyException("money�� �������");  
		}
		this.money = money;
	}

	@Override
	public String toString() {
		return "Account [name=" + name + ", money=" + money + "]";
	}
}
		
class MoneyException extends Exception{ //���� ����� �ݵ�� Exception�� ��ӹ޾ƾ���. /RuntimeEx. = unchecked
	MoneyException(){
		super("Money error");	 //default error msg.
	}
	MoneyException(String msg){
		super(msg);
	}	
}