package day02;

import java.util.Date;
// import java.sql.Date;

public class Test2 {

	public static void main(String[] args) {
		
				Date now = new Date(); // new ��ü ���� 
				System.out.println(now);
				System.out.println(now.getYear());
				
				java.sql.Date today = null;
				System.out.println(today);
				
				now = null; //�޸� ���� ����(desligar c/ garbage)

	}

}
