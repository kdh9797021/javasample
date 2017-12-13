package day16.exception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class Test03 {
	public static void main(String[] args) {

		FileInputStream fis = null;
		Scanner scanner = null;
		
		try {
			fis = new FileInputStream("sample3.txt");  //FileInputStream Ư������ �о���� / FileoutputStream Ư������ �����ϱ�
		} catch (FileNotFoundException e) {
		// e.printStackTrace();
		System.out.println(e.getMessage());
		System.out.println("sample2.txt �ش� ������ �غ����ּ���");
		}catch (Exception e){  //��� exception �߻� ����
		}finally{
			System.out.println(fis);
			try {
				if(fis != null) fis.close(); //�ڿ� �ݳ� �ʼ�
			} catch (IOException e) {
		//	e.printStackTrace();
				System.out.println(e.getMessage());

			}
		}
		
		
		System.out.println("main END");
	}
}