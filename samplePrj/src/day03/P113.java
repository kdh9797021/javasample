package day03;

public class P113 {
	public static void main(String[] args) {
		int i=10, j=10;
		System.out.println(i==j);
		
		String name1 = new String("hello");
		String name2 = new String("hello");
		String name3 = name1;
		
		System.out.println("name1==name2 => "+(name1==name2));
		System.out.println("name1==name3 => "+(name1==name3));
		
		System.out.println("name1.equals(name2) => "+name2.equals(name1));
		System.out.println("name1.equals(name2) => "+name1.equals(name2));	 // ��ü �񱳴� �׻� equals method ����ؾ�.
		System.out.println("name1.equals(name3) => "+name1.equals(name3));
		// �ڹ� ��� ��ü�� equals ����.
		// static �ּ� X, Class name ��ü ���.
		System.out.println("=====================");
		String s1 = "java";  	// String ��� �⺻��ó�� new���� ��� �Ϲ���. (�̼��� �޸� ����, �޸� ���� ����)
		String s2 = "java";  // codeǥ���� ���� �ҷ�����.(new ��ü ����X)
		System.out.println(s1==s2);
		System.out.println(s1.equals(s2));
		System.out.println(s1.length()); // index �� Ȯ��.  ��ü��-1 (0���� ����)
		/* System.out.println(s1.charAt(4));  //������ index ���� ���.  */
		
			
		
	}

}
