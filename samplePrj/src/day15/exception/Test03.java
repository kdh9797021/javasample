package day15.exception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Test03 {
	public static void main(String[] args) {
		System.out.println("START");
		FileInputStream fis = null;
		try {
			fis = new FileInputStream("sample2.txt"); // ���� ���� �ּҿ� ���� �ٲ�
		} catch (FileNotFoundException e) {
			System.out.println(e.getMessage());
		} finally {
			try {
				if (fis != null)fis.close(); // fis = null�̱� ������ NullPointer �߻�. Null�� �ݳ��� �ڿ��� ����.
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

		System.out.println("END");
	}
}
