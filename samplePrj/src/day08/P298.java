package day08;

public class P298 {
	public static void main(String[] args) {
		Car c1 = new Car("Red", 4, "Auto");
		Car c2 = c1;   // ���� �ּ���.(������üX) Call by reference / c1 ��������� c2�� ����. 
		Car c3 = new Car(c1);  //c1�� ���纻�� c3�� ���� (������ ��ü. object copy)  /c1�� c3�� �ٸ� �ּ��̹Ƿ� ����X.
		
		c1.color = "Gray";
	}
}

class Car{
	String color;
	int door;
	String gearType;

	// default �������Լ�(�⺻ ������) ���� > class name ����, return X
	Car(){}
	Car(String color, int door, String gearType){    //primitive data
		this.color = color;          // �ʱ�ȭ
		this.door = door;
		this.gearType = gearType;
	}
	Car(Car c){        // �ν��Ͻ� ����    //reference data
		this(c.color,c.door,c.gearType);
	/*	this.color = c.color;                      //�ߺ� ����, ���� ���� ���� ó��
		this.door = c.door;
		this.gearType = c.gearType;  */
		
	}
	
	public void display(){    //���� ���
		System.out.printf("Car[%s,%d,%s]%n",color,door,gearType);
		
	}
}
