package day06;   // ����� Ǯ�� (����5)

import java.util.Arrays;

import javax.swing.JOptionPane;

public class Prob2 {
	public static void main(String[] args) {
		String size= JOptionPane.showInputDialog("1~45������ ������ �Է��ϼ���.");     //dialog box ��ɾ�-data�� ���ö����� block��.
		// System.out.println(size);
		int [] num = new int[Integer.parseInt(size)];   //String�� Int�� �ٲ�.
		
		num[0] = (int)(Math.random()*45)+1;  //0������ �����θ� �ߺ� ���� �ʿ� ����
		
	T:	for(int i = 0; i<num.length;i++){
			num[i] = (int)(Math.random()*45)+1;    //0 ���� 45�� ��  //random�� �ٿ��� Test �ٽ���> ��ȿ�� ����  
			for(int j=0; j<i ; j++){
					if(num[i] == num[j]){
						i --; 
					//	break;  // 1) ���ʿ��� for loof �ݺ� ����
						continue T; // 2) ù��° for������ �������� ���ؼ��� �ش�for���� labeling�ؾ���.
					}
			}
			System.out.println(Arrays.toString(num));   //���ѷ��� �ߺ��Ǵ��� Ȯ��(random�� �ٿ���)
		}
	}
}