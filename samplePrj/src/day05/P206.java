package day05;

import java.util.Arrays;

public class P206 {

	public static void main(String[] args) {
		// int�� String �迭������ ������?   -> String ������ ��ü�� �ڿ� .  ����(ref.�̹Ƿ�)
		int[]      scores = {99,88,78,97,100};
		String[] names = {"ȫ�浿", "��浿", "�ڱ浿", "�ֱ浿", "�̱浿"};
		
	for(int i = 0;i < names.length; i++ ){
	System.out.println(names[i].charAt(0)+"**   " + scores[i]);   //names[i] -> String type   // �ֹι�ȣ ���ڸ� ���밡��
	}
		
	System.out.println("=============================================");
	for(int data:scores){     // : ���� ����ü ��ġ(int ����)
		System.out.println(data);
	}	
	for(String data:names){
		System.out.println(data);    //(String ����)
	}
		
			
	}
}
