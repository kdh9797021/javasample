package day15.Inner02;

public class DiceGame2 {
	public static void main(String[] args){  //main method���� throws Exception ��� X
		DiceGame2 game = new DiceGame2();  // ��ü ���� �ʿ�
		//���ܹ߻� ������ block���� ó��: try~catch
		try{
		int result1 = game.countSameEye(10);  //main method�� this ��� �Ұ���, �ּҰ� �ʿ�
		System.out.println("���� ������ 8���� �ֻ��� 2����  ������ ���� ���� ���� Ƚ�� : " + result1);
			 
				int result2 = game.countSameEye(-10);
		System.out.println("���� ������ 8���� �ֻ��� 2����  ������ ���� ���� ���� Ƚ�� : " + result2);
		}catch (Exception e){
			System.out.println(e.getMessage());
		}finally{  //���ܹ߻� ���� ������� �׻� ����
		}	
		System.out.println("main END");
	}
	int countSameEye(int n) throws Exception{    //�����+body�� ������ method
		if(n < 0){   //���� �߻��� ���ܹ߻� ó��
			throw new Exception("������ ���� Ƚ���� ���� �����");  //RunTimeEx.�� �ڽ��� unchecked
	
			
		}
		int count = 0;
		Dice dice1 = new Dice(8);   //Dice 1 ���� 
		Dice dice2 = new Dice(8);  // Dice 2 ����
		
		for(int i=0; i<n;i++){
			if(dice1.play()==dice2.play()) count ++;
		}
		return count;
	}		
}	
class Dice {
	int size;
	Dice(int size){
	this.size = size;
	}	       
	int play(){
	int number = (int)(Math.random() * size) + 1;
	return number;
		    }

}
