package util;  

public class Array_2 {
	int sort;  //���� ���� 
	public static int[] sort(int[] a){  // �޼ҵ� ����(����)�� + ������ 
		int[] data = new int[a.length];
		System.arraycopy(a, 0, data, 0, a.length);  //a ���� ������ ���� (copy)
		
		// sort
		for(int i =0;i < data.length-1 ;i++){         //�������� 
			for(int j =i+1; j < data.length ; j++){
				if(data[i] > data [j]){
						int temp = data[i]; //data swaping
						data[i] = data[j];
						data[j] = temp;  
				}
			}
		}		
		return data;
	}
	/**
	 * 
	 * @param a
	 * @param descmode
	 * @return ���ĵ� ��� ��
	 */
	public static int[] sort(int[] a, boolean descmode){  // �޼ҵ� ����(����)�� + ������ 
		int[] data = new int[a.length];
		System.arraycopy(a, 0, data, 0, a.length);  //a ���� ������ ���� (copy)
		
		//if( )       boolean descmode�� ���� code �ϼ��ϱ�!
 		// sort
		for(int i =0;i < data.length-1 ;i++){
			for(int j =i+1; j < data.length ; j++){
				if(data[i] > data [j]){
						int temp = data[i]; //data swaping
						data[i] = data[j];
						data[j] = temp;  
				}
			}
		}		
		return data;
 /*	public static String[] sort(String[] a){  // Overloading (String) 
		String[] data = a;
		// sort
		for(int i =0;i < data.length-1 ;i++){
			for(int j =i+1; j < data.length ; j++){
				if(data[i] > data [j]){   
						String temp = data[i]; 
						data[i] = data[j];
						data[j] = temp;    */ // String �迭 �������� �˰��� ���!
	}
}