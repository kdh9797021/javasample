package day11;

public class TestPerson {
	public static void main(String[] args) {
		//ȥ�� �� �� 
		/*Student s = new Student();
		Teacher t = new Teacher();	
		Employee e = new Employee();
	
		s = new Student("ȫ�浿",20,200201);
		s.display();
		t = new Teacher("�̼���",30,"JAVA");
		t.display();
		e = new Employee("������",40,"������");
		e.display(); */

		Object s = new Student("ȫ�浿",20,200201);
		((Student)s).display();   //or print();
		s = "Hello";
		if(s instanceof Student)((Student)s).display();   //in stanceof : casting�� type üũ
		
		String name ="OOO";
		Student s1 = new Student("�浿", 20,1);
		Teacher t1 = new Teacher("ȫ��", 40,"Java");
		Employee e1 = new Employee("ȫ�浿",44,"������");
		
		Object[] obj = {name, s1, t1, e1};  //�迭�� �پ��� data type �ͼ� ���� ����     
		for(int i =0;i<obj.length;i++){    //for�� ���: object�迭���� person �迭�� ��� 
			if(obj[i] instanceof Person)((Person)obj[i]).display();
		}
		
		Person[] p = {s1, t1, e1, new Student("",22,2)}; //new��ü�����ϸ鼭 ���� ���� ����.   
	
		System.out.println("==================================");
		for(int i=0; i<p.length;i++){
			if(p[i] instanceof Student)((Student)p[i]).display();
			if(p[i] instanceof Teacher)((Teacher)p[i]).display();
			if(p[i] instanceof Employee)((Employee)p[i]).display();
		} //����: �پ��� data type ���� ���� but, casting ���� ������.
		System.out.println("==================================");
		for(int i = 0; i<p.length; i++){
			p[i].display();    //overriding ��� (Person class�� ������ method �߰�)
		}
		System.out.println("========================");
		Person pp =  null ;   //'������'
		pp.display(); //method�� �ϳ������� binding�Ǵ� class�� ���� ����� �ٸ� ���� ����.
		

	
	} 
}
