package day06;

import java.util.Arrays;

public class P201 {
	public static void main(String[] args) {
		if(args.length == 0){    
			System.out.println("�迭�� ����� ���� �Ķ���ͷ� �Է����ּ���~~");
			return;
		}
		int[] num = new int[Integer.parseInt(args[0])];   
  		
		//	int [ ]num = new int[5];  //num ����(����)
		for(int i = 0 ; i <= num.length-1; i++){
			num[i] = (int)(Math.random()*45)+1;    //1~45���� ������ ���� �ʱ�ȭ   // ���� �ߺ� ����(?)
			 for(int j = 0; j < i; j++){  
				 if(num[i] == num[j]){		
					 i--;
					 break;
				 }
			 }
			// System.out.println(Arrays.toString(num));
		}
		// int[] source = num;  //�ּҰ� ����, �ҽ� ������ �ȵǰ� ���� ����. �迭���� ���� �� copy �ʿ�.
		int[] target = new int[num.length];  // �迭���� ����
		System.arraycopy(num, 0, target, 0, num.length);
		
		System.out.println("���� num");
		System.out.println(Arrays.toString(num));
		//�������� �����ϱ�
		for(int i = 0; i <num.length-1; i++){
			for(int j = i+1; j <num.length;j++){
				if(num[i] >num[j]){          //���ǽ� 1
					int tmp = num[i];
					num[i] = num[j];
					num[j] = tmp;
				}
		}
		}

	System.out.println("����:" +Arrays.toString(target));
	System.out.println("������:" +Arrays.toString(num));
	
	}
}

