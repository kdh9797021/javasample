package day12;

public class StudentTest {
	public static void main(String[] args) {
		String name = new String("Java Test~~~");
		String name2 = new String("Java Test~~~");
		// System.out.println(name);   //���������� name.toString���� auto converting�� ��.
		System.out.println(name == name2);   // ������ �ּҰ� ��
		System.out.println(name.equals(name2)); //��ü ��   
	
		// System.out.println(name.toString());
		
		java.util.Date date = new java.util.Date();
		java.util.Date date2 = new java.util.Date();
		System.out.println(date == date2);   
		System.out.println(date.equals(date2)); 
		// System.out.println(date.toString()); 
		
		Student s = new Student("ȫ�浿",22,1);
		Student s2 = new Student("ȫ�浿",22,1);
		System.out.println(s == s2);  //ToString method�� overriding���� �ʾƼ� �ּҸ� �ҷ���.
		System.out.println(s.equals(s2)); 
		// System.out.println(s.toString());    //**overriding �ʼ� 
	
	}
}
