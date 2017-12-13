package day19;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class MapTest02 {
	public static void main(String[] args) {
		Map<Integer, String> map = new HashMap<>();
		map.put(20054030,"����ȣ");
		map.put(20031040,"������");
		map.put(20104010,"�̰�ȣ");
		map.put(20091050,"������");
		map.put(20084910,"�̰�ȣ");
		map.put(20150299,"������");
		map.put(20172980,"�̹�ȣ");
		map.put(20110990,"������");

		boolean flag = true;
		while (flag) {
			System.out.println(" �л����� ó��");
			Scanner scanner = new Scanner(System.in);
			System.out.println("\n �й� : _");
			int studentNum = scanner.nextInt();
			System.out.println("�̸� : _");
			String name = scanner.nextLine();
			
			if (map.containsKey(name)) {
				if (map.get(studentNum).equals(name)) {
					System.out.println("�л������� �����Ǿ����ϴ�.");
					flag = false;
					break;
				} else {
					System.out.println("�л������� �ٽ� Ȯ�����ּ���");
					continue;
				}
			} else {
				System.out.println("�Է��� �̸��� �������� �ʽ��ϴ�.");
				continue;
			}
			}
				System.out.println("------------------------  ���� ��� ----------------------------");
	}


	class Student {
		String Name;
		String dept;
		int StudentNum;

		public Student(String name, String dept, int studentNum) {
			Name = name;
			this.dept = dept;
			StudentNum = studentNum;
		}

		@Override
		public int hashCode() {
			final int prime = 31;
			int result = 1;
			result = prime * result + ((Name == null) ? 0 : Name.hashCode());
			result = prime * result + StudentNum;
			result = prime * result + ((dept == null) ? 0 : dept.hashCode());
			return result;
		}

		@Override
		public boolean equals(Object obj) {
			if (this == obj)
				return true;
			if (obj == null)
				return false;
			if (getClass() != obj.getClass())
				return false;
			Student other = (Student) obj;
			if (Name == null) {
				if (other.Name != null)
					return false;
			} else if (!Name.equals(other.Name))
				return false;
			if (StudentNum != other.StudentNum)
				return false;
			if (dept == null) {
				if (other.dept != null)
					return false;
			} else if (!dept.equals(other.dept))
				return false;
			return true;
		}

		@Override
		public String toString() {
			return "Student [Name=" + Name + ", dept=" + dept + ", StudentNum=" + StudentNum + "]";
		}
	}
}
