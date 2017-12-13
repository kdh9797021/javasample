package day20;

import java.util.Arrays;
import java.util.Iterator;
import java.util.Vector;

public class Prob1 {
	public static void main(String[] args) {
		String []datas = {"1", "2", "3", "4", "5"};
		System.out.println("�Է� �迭: "+Arrays.toString(datas));
	
		Vector<String> res = new Fun().moveToVector(datas); 
		Iterator<String> it = res.iterator();
		
		System.out.print( "���ϵǴ� Vector :"+it.next());
			while (it.hasNext()) {
				System.out.print( ", "+it.next());
			}
			System.out.println("�� ������ ����� Vector");
	}


	

}

class Fun{
	Vector<String> moveToVector(String datas[]) {
		Vector<String> vec = new Vector<>();
		for(int i=datas.length-1; 0<=i;i--){
			vec.add(datas[i]);
		}
		return vec;
	}
}

/*
 * �Է� �迭: {��1��,��2��,��3��,��4��,��5��}; ���ϵǴ� Vector : ��5��, ��4��,��3��, ��2��, ��1���� ������ �����
 * Vector
 */

