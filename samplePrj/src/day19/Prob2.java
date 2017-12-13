package day19;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

/*������ �޼��� �Ű������� ���޵Ǵ� ù��° ���ڿ��� �ι�° ���ڿ��� �����ڷ� �߶󳻾� 
Set ������ ������ �� �����ϴ� �޼��带 �����Ͻÿ�. */
public class Prob2 {
	public static void main(String[] args) {

		String str = "PROD-001#X-note#Samsung#3#6000000";
		Set<String> strs = stringSplit(str, "#");

		System.out.println("=== ���ڿ� ó�� ��� ===");

		// strs �� �Ʒ��Ͱ��� ��µǵ��� �ڵ带 �ϼ��ϼ���
		// System.out.println(strs);
		Iterator<String> it = strs.iterator();
		while (it.hasNext()) {
			String data = it.next();
			System.out.println(data);

		}
	}

	private static Set<String> stringSplit(String str1, String str2) {
		Set<String> set = new TreeSet<>();

		String temp = "";
		for (int i = 0; i < str1.length(); i++) {
			if (str1.charAt(i) == str2.charAt(0)) {
				set.add(temp);
				temp = new String();
			} else {
				temp += str1.charAt(i);
			}
		}
		set.add(temp);
		return set;

	}
}

/*
 * <<ó�� ���>>
 * 
 * === ���ڿ� ó�� ��� === PROD-001 X-note Samsung 3 600000
 */