package day04;

public class P162 {

	public static void main(String[] args) {
	
		
		for(int j=0;j<2;j++){     // ��ø for������ - ����for��(���� �˰���)
			for(int i=0;i<3;i++){
				System.out.print('*'+"  ");        // println�� ���, ���� �ݺ� /�⺻�� ���� �ݺ�
		}
			System.out.println();  
		}
	System.out.println("=========================");
	
	for(int i = 0;i<3;i++){
		for(int j=0 ; j<i+1; j++){     // i=j+1                      // �ʱⰪ�� ���� ��/�� for�� ����
		System.out.print("*");
		}
		System.out.println();
		
		}
	System.out.println("=========================");
	
	
 OUT:	for(int i=1; i<=9; i++){
		    for(int j=2; j<=9;j++) {//���� for���� ���۴�.
			// if(j==5) break;   // 5�ܺ��� ó���� �ȵ�. ���� ��� �ɱ� */
		    // if(j==5) break OUT;  //block naming (p/ handling)
		    //  if(j==5) continue;  // ������ (�ǳʶٱ�)  5��'��' ���ܵ�.
			System.out.printf("%dx%d =%2d        ",j,i,i*j) ;		
		}
		System.out.println();
	    }
	}
	}

