package day17;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

import javax.swing.plaf.synth.SynthSeparatorUI;

public class StudentTest {
	public static void main(String[] args) {
		Student[] students = new Student[100];
		int count = 0;

		try (Scanner scanner = new Scanner(new File("studentdata.txt"))) { // closable������ ��ü��
			while(scanner.hasNextLine()){
				String readLine = scanner.nextLine();
				String [] data = readLine.split("/");
				students[count] = new Student(data[0], Integer.parseInt(data[1]));  //Student ��ü ����
				count++;
			}

		} catch (Exception e) {
			if (e instanceof FileNotFoundException) {
				System.out.println("studentdata.txt ���� �غ��ϼ���");
			} else {
				e.printStackTrace();
			}
		}finally{     }
		// System.out.println(Arrays.toString(students));
		
		try{
		Arrays.sort(students,0,count);  //sort ����� ������ �ʿ���.(comparable interface�� ���� ����)
		}catch (ClassCastException e){
			System.out.println("���� ����Ű ���� �ʿ�");
		}
		
		for(int i=0;i<count;i++){   // students.length�� ���� ������ null �� ǥ�õ�.
			System.out.println(students[i]);
			System.out.println("----------------------------------");
		}
		/*�迭�� sorting
		String[] i = {"j","a","f"};
		Arrays.sort(i);
		System.out.println(Arrays.toString(i));
		
		System.out.println("********** Main end **********"); */
	}
}

class Student implements Comparable<Student>{   //Student type �� ����
	String name;
	int age;

	public Student() {
		super();
	}

	public Student(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", age=" + age + "]";
	}

	@Override //[] ���Ľ� 2�� ���� ������ ��Ȳ�� ���� �ʿ�.
		public int compareTo(Student o) {
	//	return age - o.age;   int age ��, ���������� ���> o.age - age  */
	//	return name.compareTo(o.name); //String name ��
	/*		if(name.equals(o.name)){       //������ �̸��� ���,
				return age - o.age;             // ���̷� ��
				
			}
			return name.compareTo(o.name); */ //�ٸ� �̸��� ���, �״�� name���� sorting.
		int result = name.compareTo(o.name);
		return (result !=0)? result:age - o.age;
	}

}