package day09;   //

public class P303 {
	public static void main(String[] args) {
		System.out.println("start");
		Product b1 = new Product();   
		Product b2 = new Product();
		Product b3 = new Product();
		
		System.out.println(b1.serialNum);
		System.out.println(b2.serialNum);
		System.out.println(b3.serialNum);

		System.out.println(b1.count);
		System.out.println(b2.count);
		System.out.println(b3.count);
		System.out.println(Product.count);
		
		System.out.println("end");
	}
}

class Product{   //class �� default ������ �ڵ� ������
	static int count = 0;          //static variable  (����� �ʱ�ȭ)
	int serialNum;                  // instance variable
	
	static{     //static �ʱ�ȭ block  
		// System.out.println("static{    }");   //1ȸ ȣ��
		count = 0;  //'static �ڿ���' ����, ������ �Լ����� ���� ����.   
	}
	
	{
	 //	System.out.println("{}"); //��ü���������� ȣ��
		++count;           
		serialNum = count;    //static, instance �Ѵ� ����. 
	}
	public Product(){    //instance �ʱ�ȭ block
	//	System.out.println("BlockTest() �⺻ ������");
	}
}