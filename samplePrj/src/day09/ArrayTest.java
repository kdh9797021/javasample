package day09;

import java.util.Arrays;

import util.Array_2;     //�ٸ� PKG ���� �ִ� class �ҷ����� ���� 

public class ArrayTest {
	public static void main(String[] args) {
		int[] source = {77,99,33,79,44};

		int[] result = Array_2.sort(source);  //�Լ� ȣ�⹮ >data�ּ� �Է�
	
		System.out.println(Arrays.toString(source));
		System.out.println(Arrays.toString(result));   // source, result�� ��������� ���� �ּҰ�.
	}
}
