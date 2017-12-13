package day14.P371;

public class Product {
	int price;
	int bonusPoint;
	int count = 1;
	
	public Product() {
	}

	public Product(int price) {
		this.price = price;
		this.bonusPoint = (int) (price * 0.05);
	}
	public Product(int price, int count) {
		this.price = price*count;
		this.bonusPoint = (int) (price * 0.05)*count;
		this.count=count;
	}

}

class Tv extends Product { // TV
	Tv() {
		super(1000);
	}
	Tv(int num) {
		super(1000,num);
	}
	public String toString() {
		return "TV";
	}
}

class Computer extends Product { // Computer
	Computer() {
		super(1500);
	}
	Computer(int num) {
		super(1500,num);
	}
	public String toString() {
		return "Computer";
	}
}

class Audio extends Product { // Audio
	Audio() {
		super(700);
	}
	Audio(int num) {
		super(700,num);
	}
	public String toString() {
		return "Audio";
	}
}

class Buyer {
	int money = 20000;
	int bonusPoint = 100;
	Product[] P = new Product[10];
	int count = 0;
	int sum = 0;

	void buy(Product P) {
		if (money >= P.price*P.count) {
			this.P[count] = P;
			count += 1; // count++;
			money = money - P.price;
			sum += P.price;
			bonusPoint = this.bonusPoint + P.bonusPoint;
			System.out.println(P + "��/�� �����Ͽ����ϴ�.");
			System.out.printf("������ ��������Ʈ��: %d \n", P.bonusPoint, "���Դϴ�.");
		} else
			System.out.println("�ܰ� �����մϴ�.");
	}

	void summary() {
		System.out.println("=========================================");
		System.out.print("���ſϷ� ���:  ");
		for (int i = 0; i < count; i++) {
			for(int j=0;j<P[i].count;j++){
			System.out.print(P[i] + "  ");
			}
		}
		System.out.println("\n ���Ź�ǰ ���հ�:  " + sum + "���Դϴ�.");
		System.out.println("�����Ͻ� ��������Ʈ�� " + bonusPoint + "���Դϴ�.");
		System.out.println("=========================================");
	}

}
