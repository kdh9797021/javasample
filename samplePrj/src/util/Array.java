package util;
public class Array {
    
   public static int[] sort(int[] a) {    //�������� sorting
		int[] sort= new int[a.length] ;
		System.arraycopy(a, 0, sort, 0,a.length);
				
		for(int i=0; i<a.length-1; i++)
			for(int j=0; j<a.length-1-i; j++)
				if(a[j] > a[j+1]) {
					int tmp = a[j];
					a[j] = a[j+1];
					a[j+1] = tmp;
				}
		return sort;
    }
}


    // �����ϰ� ��� ������  �Լ��� ����� ������.. 
    // �� source data a�� ������ �ǵ��ϸ��弼��