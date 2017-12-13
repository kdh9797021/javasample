package day19;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;

public class MapTest {
	public static void main(String[] args) {
		Map<String, String> map = new TreeMap<>();
		map.put("java01", "1234");
		map.put("java01", "1234");
		map.put("java02", "43214");
		map.put("kk", "1234");
		map.put("vv", "1234");
		map.put("java05", "321444");
		map.put("java06", "321664");
		map.put("java07", "335214");
		map.put("java08", "433214");
		map.put("java09", "22214");
		map.put("java10", "1111");

		boolean flag = true;
		while (flag) {
			System.out.println(" �α��� ó��");
			Scanner scanner = new Scanner(System.in); // Ű���� �Է��� ����ó�� �ʿ� ����.
			System.out.println("ID : _");
			String id = scanner.nextLine();
			System.out.println("\n PW : _");
			String pw = scanner.nextLine();

			if (map.containsKey(id)) {
				if (map.get(id).equals(pw)) {
					System.out.println("�α��ο� �����Ͽ����ϴ�.");
					flag = false;
					break; // ������ ����(����������)
				} else {
					System.out.println("��й�ȣ�� �ٽ� Ȯ�����ּ���.");
					continue;
				}
			} else {
				System.out.println("�Է��Ͻ� ID�� �������� �ʽ��ϴ�.");
				continue;
			}
		}
		System.out.println("------------------------  ���� ��� ----------------------------");
		Set<String> keys = map.keySet(); Iterator<String> it = keys.iterator();
		while (it.hasNext()) { 
			String keyName = (String) it.next();
	
		System.out.println("ID :"+keyName+" , pw : "+map.get(keyName)); 
		
		}	
	}
}
	
/*
 * System.out.println(map); //������ data�� ��������Ʈ��. (key���� �ߺ�����) /
 * System.out.println(map.get("java01"));
 * 
 * System.out.println(map.keySet()); //keySet()> key���� �����Ͽ� set ���� ����.
 */
