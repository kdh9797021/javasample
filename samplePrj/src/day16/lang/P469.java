package day16.lang;

import java.util.Arrays;

public class P469 {
	public static void main(String[] args) {
		String [] ss = {"x","aa","bb","44"};
		System.out.println(Arrays.toString(ss));
		Arrays.sort(ss);
		System.out.println(Arrays.toString(ss));  //���� < ���� �������������� sorting��.
		// compareTo()/ return type ���� 
		System.out.println("x".compareTo("aa")); //��� �� ���, �տ��� ŭ.
		System.out.println("aa".compareTo("bb"));  //���� �� ���, �տ��� ����.
		System.out.println("aa".compareTo("aa")); //0�� ���, ������.
		System.out.println("===============================");
		
		String msg = "Hello java test......";
		char[] ssss = msg.toCharArray();   //Char�迭�� ��ȯ.
		System.out.println(msg.indexOf('j'));
		System.out.println(msg.indexOf('a',7));
		System.out.println(msg.indexOf("java"));
		System.out.println(msg.indexOf("javap"));  // �ش繮�ڿ��� ���� ��� �׻� -1�� ǥ�� 
		
		System.out.println(msg.substring(msg.indexOf('t')));  //substring(indexOf) ���ڿ� ����
		System.out.println(msg.substring(msg.lastIndexOf(' ')+1));
		
		String data = "ȫ�浿  / 90/70/77";
		String[] datas = data.split("/");     //���ڿ����� �ɰ��� . split()
		
		int sum = 0;
		for(int i = 1; i<datas.length; i++){
			sum += Integer.parseInt((datas[i].trim()));    
		}
		System.out.printf("�̸�: %s ����: %d  ���: %.2f",datas[0],sum,sum/3.0);

		
	}
}
