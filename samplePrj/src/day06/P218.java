package day06;

public class P218 {
	public static void main(String[] args) {
		int[][] score = {
						{ 100, 100, 100}
										,  {20, 20, 20}
										,  {30, 30, 30}
										,  {40, 40, 40}
										,  {50, 50, 50}
			};
	int k_sum = 0;
	int e_sum= 0; 
	int m_sum= 0;
	
	System.out.println("��ȣ  ����  ����  ����  ����  ���") ;
	System.out.println("==============================");
	
	for(int i = 0; i< score.length; i++) {    // score.length �л���
		int sum = 0;    			// ���� ����
		double avg= 0.0;
		//float avg = 0.0f;		// ���� ��
		
		k_sum += score [i][0];
		e_sum += score [i][1];
	   m_sum += score [i][2];
		System.out.printf("%3d", i+1);
		
		for(int j= 0; j <score[i].length; j++){    //�� �л��� ���� ���� ó��
			sum += score[i][j];
			System.out.printf("%3d  ", score[i][j]);
			
			//System.out.printf("%5d", score[i][j]);	
		}
		System.out.printf("    %3d %.2f  %n",sum,((double)sum/score[i].length));
	// avg = sum/(float)score[i].length;
	//	System.out.printf("%5d %5.1f%n", sum, avg);		
	}
	System.out.println("===============================");
	System.out.println("����	" +k_sum+ "   "+e_sum+"   "+m_sum);
		}
	}

