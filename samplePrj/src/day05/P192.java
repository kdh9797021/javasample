package day05;

import java.util.Arrays;

public class P192 {
	public static void main(String[] args) {
		int[] src = {66,77,99,56,79,78};
		System.out.println(Arrays.toString(src));     //�Ǵ� for�� ���
	
	int[] dest = new int[src.length*2];     //destination �迭 ��ü��
	System.out.println(Arrays.toString(dest));         //Arrays.toString method�� ��� Ÿ�� ó�� ���� 

	System.arraycopy(src, 0, dest, 0, src.length);//�Ű����� ����,  �ҽ� ��ü copy ����.
	System.out.println(Arrays.toString(dest)); 
	} 

}
