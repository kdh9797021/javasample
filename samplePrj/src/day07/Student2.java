package day07;

public class Student2 {
	public static void main(String[] args) {
		// Student[] s= new Student(5);   //�迭 type 
		Student s1 = new Student();
		s1.name = "ȫ�浿";               
		s1.score= new int[]{88,99,50};
		
		Student[] s= {                   //2) �迭�� ����,����,�ʱ�ȭ �ѹ��� ����
				s1,                              // 1) �ּҸ� ���� �����Ҽ��� ����.  (���������� �ʱ�ȭ)
				new Student(),        
				new Student(),   
				new Student(),   
				new Student()
		};
		
		s[4].name="�־�";
		s[4].score= new int[]{99,99,99};
		
		for (int i=0; i<s.length;i++){    // s.length �л���
			s[i].process(); //data ���� ���
			s[i].display(); 
			
		}
		
	}
}
