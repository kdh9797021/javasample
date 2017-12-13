package day16.lang;   //ScannerŬ���� (�ٸ� file�κ��� ������ �б�)

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class P510 {
	public static void main(String[] args) {
		String filename = "sample2.txt";  
		try(Scanner scanner = new Scanner(new File(filename));) {   //System.in Ű����� �Ѱܹ����� / file �ҷ������ �ٸ�.

			while(scanner.hasNextLine()){
				String data = scanner.nextLine();   //�� �پ� �ҷ�����
				// System.out.println(data);
				int sum = 0;
				String[] datas = data.split("/");
				for(int i = 1; i<datas.length; i++){ //int i=0�� �̸��̹Ƿ�
					sum += Integer.parseInt(datas[i].trim());      
				}
				System.out.printf("�̸�: %s  ����: %d  ���:%5.2f  %n", datas[0],sum, sum/3.0); 
			}
			
		} catch (FileNotFoundException e) {
			System.out.println(e.getMessage());
		} catch (Exception e){
			e.printStackTrace();
		} finally {
 		
		}
		System.out.println("************** Main END ****************");

	}
}
