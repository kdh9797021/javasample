package day16.exception; //P.436

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class Test04 {
	public static void main(String[] args) {

		try (FileInputStream fis = new FileInputStream("sample3.txt");) { // auto close��. //�ڿ��ݳ� ��ü ������ ��� ����.
			System.out.println("�۾� ó��"); // ���� �߻��� ���� ��� ����.
		} catch (FileNotFoundException e) { // ���� �߻��� catch�� �Ѿ/ Closable�� ��������
											// ��츸 ����
			System.out.println(e.getMessage());
			System.out.println("sample2.txt �ش� ������ �غ����ּ���");
		} catch (Exception e) {
		} finally {
			System.out.println("finally{} ���� ");
		}
		System.out.println("__________________________");
		try (Scanner scanner = new Scanner(new File("sample2.txt"));){
			Account a = new Account("", 400);
			
		} catch (FileNotFoundException e) {  //Exception e�� ��� ���� ó���̹Ƿ� FileNotFoundEx. ���.
			System.out.println("sample2.txt ������ �غ����ּ���.");
		} catch (MoneyException e){
			System.out.println(e.getMessage());
		} catch (Exception e){  //�׿� ��� ����ó��
			e.printStackTrace();
		} finally {
		}
		System.out.println("main END");
	}
}
