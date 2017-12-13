package day18;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Vector;

public class VectorTest01 {
	public static void main(String[] args) {
		Student[] s = new Student[100];
		s[0] = new Student();
	
		List<Student> list = new Vector<Student>();
		//���
		list.add(new Student("�浿��",100,99));
		list.add(new Student("�达",90,99));
		list.add(new Student("��",95,93));
		list.add(new Student("�ھ�",90,90));

		System.out.println(list);
 /*		list.remove(0);    //index ��ġ �ľ��� ��Ʊ� ������ ���������� ����ϱ� �����.
		System.out.println(list);
		list.remove(list.get(2));
		System.out.println(list);  */
		
		int delindex = -1;
		for(int i=0; i<list.size(); i++){
			Student data = list.get(i);
		//	data.avg();
			/* list.remove(i);  //�����۾��� size �ڵ� ��ȯ�Ǽ� error. (size�� �����̱� ����)
			System.out.println(list.size()); */
			if(data.name.equals("ȫ�浿")){
					delindex = i;
			}
		}
//		list.remove(delindex);
		System.out.println(list);
		System.out.println("====================================");
	
		for(Student data :list){          //���ο� ������ for��(��ġ index�� ������, set�������� ���� ���) / ��¿����θ� ���
			System.out.println(data);
			data.avg();
		//	list.remove(data);    �����۾��� error. 
			}
		System.out.println(list);
		
		Iterator<Student> it =list.iterator();   //�����۾��� **Iterator ** ���. (+while��)
		while(it.hasNext()){
			Student data = it.next();
			data.avg();
			if(data.name.equals("�浿��")){  
				it.remove();
			}
		}
		// System.out.println(list);
		System.out.println(list.contains(new Student("��",95,93)));  //contains() >data ���Կ��� Ȯ��
		
		//Student[] temp = (Student[]) list.toArray();      //object converting error ���. downcasting�� �ʿ��ϱ⶧���� ������.
		
		Student[] temp2 = new Student[list.size()];
		list.toArray(temp2);  //������� output���� ���� ��.
		
		Arrays.sort(temp2);
		
	//	Collections.sort(list);
		
		for(Student data: temp2){  //sorting �� ���� for�� 
			System.out.println(data);
			System.out.println("-------------------------------------------------------------");
		}
	}	
}