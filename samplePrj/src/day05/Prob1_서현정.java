package day05;
/* ��ȣȭ�� ���ڿ� ���� �Ʒ��� ���� ����ϵ��� 
Prob1�� Ŭ������ main �Լ��� �ϼ��Ͻʽÿ�. 
(��, ���鿡 ���ؼ��� ġȯ�� �������� �ʽ��ϴ�.) */

public class Prob1_������ {
	public static void main(String[] args) {
				String sourceString = "everyday we have is one more than we deserve";
				String encodedString ="";

				for(int i=0; i <sourceString.length(); i++){
					if(sourceString.charAt(i)=='x'||sourceString.charAt(i)=='y' ||sourceString.charAt(i)=='z'){    //x,y,z�� ���, Ư����ȣ�� �ѱ��� �ʱ� ���� -23
						encodedString += (char)(sourceString.charAt(i)-23);
					}else if (sourceString.charAt(i)==' '){      //'   ' ������ �������� ����ȭ.
						encodedString +=(' ');
					}else{
				 encodedString += (char)(sourceString.charAt(i)+3);    //  �⺻ �迭 ��Ģ +3
				                                      
				 
									
				}
}
				System.out.println("��ȣȭ�� ���ڿ� : " + sourceString);
				System.out.println("��ȣȭ�� ���ڿ� : " + encodedString);
				
			
					
				
				// ���� : ���� 'a'�� �������� 97�̸�, 'z'�� 122�Դϴ�. 
				

				}				
			}
		
