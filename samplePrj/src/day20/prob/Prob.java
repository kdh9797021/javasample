package day20.prob; //���� Ǯ�� 

import java.util.Vector;

public class Prob {
	Vector<String>  moveToVector(String datas[]){
			if(datas==null||datas.length==0){
				System.out.println("ó���� �����Ͱ� �ʿ��մϴ�.");
			return null;
				}
			Vector<String> data = new Vector<>();
			for(int i=datas.length-1;i>=0;i--){
				data.add(datas[i]);
			}
			return data;
	}
	
	public static void main(String[] args) { //Test�� main method ����
		Prob p = new Prob();
		String[] d = {"1","2","3","4","5"}; 
		d= null; // (d�迭�� �ƹ��͵� ���� ���, null�� �� üũ �ʿ�) 
		Vector<String> list = p.moveToVector(d);
		System.out.println(list);
	}
}
