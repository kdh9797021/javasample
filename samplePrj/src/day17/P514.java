package day17;  //���ڿ� �ɰ��� method > StringTokenizer

import java.util.Arrays;
import java.util.StringTokenizer;

public class P514 {
	
	public static void main(String[] args) {
		String msg = "ȫ�浿: 90/100/80 ";
		String [] data = msg.split(":");   // .split("������")
		System.out.println(Arrays.toString(data));
		String [] jumsu = data[1].split("/");
		System.out.println(Arrays.toString(jumsu));
		System.out.println("_________________________");
		StringTokenizer st = new StringTokenizer(msg, ":/");   //StringTokenizer�� ������ ������ ���� ����
		// System.out.println(st.countTokens());    //���ҵ� String ���� ����
		while(st.hasMoreTokens()){  //Token �����ϴ� ����
			String s = st.nextToken().trim();
			System.out.println(s);
		}
	}

}
