package day05;

import java.util.Arrays;
import java.util.Scanner;

//�迭 ���� > ������ ���� > �߰�> ��� 

public class P187 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("���ڸ� �Է��ϼ���_");
		
		int[] num;
		num = new int[Integer.parseInt(scanner.nextLine())];    //nextLine(String)�� ���ڷ� �ٲ����
		for(int i = 0; i < num.length; i++) {
			num[i] = (int)(Math.random()*45)+1;
			// num[i] = i*10+10;
		}
		for(int i = 0 ; i < num.length; i++) {
			System.out.print(num[i]+"   ");
		}
		System.out.println();
		System.out.println(Arrays.toString(num));    //Arrays API �ҷ����� (Util. method)
		// System.out.print((int)(Math.random()*45));    //���� �߻�
		// System.out.print((int)(Math.random()*45)+1);    // 1~45���� ���� ���� �߻�(+1 �߰� ����)
		System.out.println();
		
	}
}
