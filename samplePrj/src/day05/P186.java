package day05;    // �迭

public class P186 {
	public static void main(String[] args) {
// default ��
		String[]  names= new String[3] ;
		System.out.println(names[0]+ names[1]+names[2]);
		System.out.println("-----------------------");
		char[]         chars= new char[names.length];  // ���� ������    //blank������ �ʱ�ȭ
		System.out.println(chars[0]+",  "+chars[1]+",  "+ chars[2]);
		System.out.println("-----------------------");
		
		int []          score;    //�ּ�(reference)           
		score = new int[5];   //�迭 ����(��ġindex ��ü)
		for(int i = 0; i< score.length ;i++){         //base index=������ 0
		System.out.print(score[i]+"  , ");     
		}
		System.out.println("\n===================");
		for(int data:score){     // :  data ���� ���
			  System.out.println(data+"  ");
		

		}
		
		
	}

}
