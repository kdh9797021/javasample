package day14.lab2;

public class TVTest02 {
	public static void main(String[] args) {
		//TV user = new PTV();    //TV �θ�Ÿ�Կ� �ش��ϸ� STV, LTV ������� binding ������.  /���� ����� = ������ ����ü 
		TV user =null;
				
				if(args[0].equals("p")){      //*****����binding (��� ����� �� �ҷ�����)
					user= new PTV();
				}else if(args[0].equals("s")){
					user = new STV();
				}else{
					user = new LTV();
				}
					
				user.poweron();
				user.poweroff();
	}
}

interface TV {   //on,off ȣ�� ��Ŀ����
	void poweron();
	void poweroff();
	
}
class LTV implements TV{
	@Override
	public void poweron() {		
		System.out.println(getClass().getSimpleName()+"poweron()");   //getSimpleName() �ּҰ� �ȳ�����?
	}

	@Override
	public void poweroff() {
		System.out.println(getClass().getSimpleName()+"poweroff()");
	}
	
}
class STV implements TV{

	@Override
	public void poweron() {
		System.out.println(getClass().getSimpleName()+"poweron()");
	}

	@Override
	public void poweroff() {
		System.out.println(getClass().getSimpleName()+"poweroff()");
	}
}
class PTV implements TV{

	@Override
	public void poweron() {
		System.out.println(getClass().getSimpleName()+"poweron()");
	}

	@Override
	public void poweroff() {
		System.out.println(getClass().getSimpleName()+"poweroff()");
	}
}