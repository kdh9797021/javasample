package day07;

public class P238 {
	public static void main(String[] args) {   //���� �����ϱ� ���� public main method ����.
		TV tv1 = new TV();
		tv1.display();
		tv1.power();
		tv1.channelUp();
		tv1.channelUp();
		tv1.channelUp();
		tv1.channelUp();
		tv1.display();
		
		TV tv2 = new TV();
		tv2.display();
		tv2.power();
		tv2.channelUp();
		tv2.channelUp();
		tv2.channelUp();
		tv2.channelUp();
		tv2.display();
		
	}
}
class TV{
	String color;
	boolean power;
	int channel;
	
	void power()  {    //method   return type + name(){  method body(����)
		this.power =  ! this.power; 
	}
	void channelUp() {    
		++this.channel; 
	}
	void channelDown() {
	    -- this.channel;
	}
	void display(){
			System.out.printf("TV[%s channel: %d  ���� (%b)]%n", this.color, channel, power);
	}
	

	

}