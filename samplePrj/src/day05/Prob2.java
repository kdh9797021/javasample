package day05;

class Prob2 { 
	public static void main(String[] args) { 
		int[ ] num = new int[5];   // �迭���� �� ����(5�� ����)  
		num [0] = 2;            // (���ϴ� ������)�ʱ�ȭ
		num [1] = 22;
		num [2] = 23;
		num [3] = 27;
		num [4] = 29;
		
		int[] arr = {99,66,88,55,77};      // �迭 ����,����,�ʱ�ȭ�� �ѹ���
		int sum = 0;
		
		for(int i=0; i<arr.length-1;i++){    //�迭�� ������ 0���� arr.length-1
			sum = sum +arr[i];
			
		}
		System.out.println(sum);  
		
		/*  sum += arr[0];
		sum += arr[1];
		sum += arr[2];
		sum += arr[3];
		sum += arr[4]; */
		
		
/*	int sum = 0;
		int[] arr = {10, 20, 30, 40, 50}; 
		for(int i=0; i< arr.length; i++ ){
		sum += arr[i];
		}
		
		System.out.println("sum="+sum);  */
	
	}
}
