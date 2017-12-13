package day19; //Set - HashSet

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class SetTest {
	public static void main(String[] args) {
		Set<String> set= new HashSet<>();   //HashSet�� TreeSet�� ȣȯ��.
		// Set<String> set= new TreeSet<>();    //TreeSet: ���������� comparable�� �۵��Ǿ� sorting��
		set.add("java 09");
		set.add("java 07");
		set.add("java 01");
		set.add("java 04");
		System.out.println(set);  //set�� �ߺ� �Ұ���. /�� ������� ���� ������ ����.
		set.remove("java 07");  // set.remove() ��ü ���н� ���� ����.
		System.out.println(set);
		
		Iterator<String> it = set.iterator();  //String type
		while (it.hasNext()){
			String data = it.next();
			System.out.println(data.substring(data.length()-2)); //���ڸ� ����
		}
		
		Iterator itt = set.iterator();  //Object type (String type�� overriding�Ǿ ��ü ��ü ǥ�õ�)
		while(itt.hasNext()){
			Object data = itt.next();
			System.out.println(data); //substring �����, casting �� �ʿ�.
		}
		set.add("java 99");
		set.add("java 59");
		set.add("java 49");
		set.add("java 19");
		System.out.println(set);
	}
}
