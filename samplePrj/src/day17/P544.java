package day17;  // SimpleDateFormat

import java.util.Calendar;
import java.util.Date;

public class P544 {
	public static void main(String[] args) {
		String name = "ȫ�浿";
		System.out.printf("%s , %s,  %d,  %f  %n",name,"~~~~",90,5.5);
		
		String msg = String.format("%s , %s,  %d,  %f  %n",name,"~~~~",90,5.5);
		System.out.println(msg);
		
		String df = String.format("%5.2f", Math.PI);
		System.out.println(df);
	
		Date d = new Date(2017,11,21);  //Java���� deprecated API (������������ ���, ����� X) 
		System.out.println(d);
		System.out.println(d.getYear()); 
		System.out.println("_________________________");
		// Calendar c = new Calendar();  Calender�� �Ϲ� ��ü ���� �Ұ����ϹǷ� ���� ������� ����.
		Calendar c =Calendar.getInstance();
		System.out.println(c);
		System.out.println(c.get(Calendar.YEAR));
		// c.set(2016, 11, 21);   month ������ 0~11�� ������.
		// System.out.println(c);
		
		df = String.format("%tY�� %tm�� %te�� %n", c,c,c);     
		System.out.println(df);
		df = String.format("%1$tY�� %1$tm�� %1$td��  %1$ta����  %n", c);   // 1$ ù��° �ִ� ��ġ���� ǥ��
		System.out.println(df);
		
		
	}
}
