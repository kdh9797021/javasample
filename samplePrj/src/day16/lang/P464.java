package day16.lang;  //String API

public class P464 {
	public static void main(String[] args) {
		String msg = "Hello java test~~~~";
		System.out.println(msg);
		// System.out.println(msg = msg.replace('~', '!'));  //���ڿ� ��ü ���. ���� data �ּҷ� �Ҵ��ؾ�.
		System.out.println(msg.replace('~', '!'));  
		System.out.println(msg); // ���� �ȵ�. String�� �б� �����̱⶧��.(��� ��ü������)
		msg.concat(" sample");
		System.out.println(msg);

		StringBuffer sb = new StringBuffer("StringBuffer test");  //������ ��� �ٲ�
		
		System.out.println(sb);
		sb.reverse();
		System.out.println(sb);
		sb.reverse();
		System.out.println(sb);
		sb.append(" sample");
		System.out.println(sb);
		String s = sb.toString();
		
	}
}
