package day13.product;

public class ProductTest {
	public static void main(String[] args) {
			Buyer buyer = new Buyer();
			buyer.buy(new Computer());
			buyer.buy(new TV());
			buyer.buy(new HP());
			buyer.buy(new Audio());
		//	buyer.buy(new VCR());    VCR Type method �̺���.
	}
}
class Product{
	int price;
	int point;
}
class TV extends Product{}      //extends(���) �ʼ� - ������ 
class Computer extends Product{}
class VCR extends Product{}
class HP extends Product{}
class Audio extends Product {}

class Buyer{
	int money;
	int point;
	void buy(Product t){    //�Ű������� ������ (���� ����)
	money -= t.price;   
	point += t.point;  
}
	/*
	void buy(TV t){            // �����۸��� �޼ҵ� �ۼ��� �������� ���� �ſ� ����.
		money -= t.price;   //���Ұ�
		point += t.point;  //���ʽ�����Ʈ ������
	}
	void buy(Computer t){
		money -= t.price;   
		point += t.point;  
	}
	*/
}