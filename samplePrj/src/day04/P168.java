package day04;

public class P168 {
	public static void main(String[] args) {
/*
		// 1���� 100������ �� ���ϱ� (for��)
		int sum = 0;
		// sum += 1;
		
		for(int i=1; i <=100 ;i++) {          
		sum=sum + i;
		}
		System.out.println(sum);
		
//1���� 100������ �� ���ϱ� (while��)
		sum=0;
		int i=1;    //�ʱ�ȭ
		while(i<=100){
			sum =sum +i;
			i++;			
		}
		System.out.println(sum);
		
		while(sum==5050){
			System.out.println("~~~~~");
				break;    //���ѷ��� ����
		}
	
// (do~ while��)
		boolean flag = false;
		do{
			System.out.println("do while " +flag);
			break;
		}while(flag);   */

// 1~100�� 4�� ��� �� ���ϱ�
		int sum = 0;
		
		for(int i=0; i<=100; i++){
			 if( i  %  4 == 00)//4�� ����� ���� ����
				 sum = sum + i;
			 }
			System.out.println(sum);
		
		
	
	
		}
	}
