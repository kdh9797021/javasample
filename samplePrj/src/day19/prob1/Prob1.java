package day19.prob1;

import java.util.Set;

public class Prob1 {
	public static void main(String[] args) {
		String str = "PROD-001#X-note#Samsung#3#6000000";
		//Set<String> strs = stringSplit(str, "#");
		
		// Prob1.StringSplit(str,"#");   >1��
  
		Prob1 p = new Prob1();
		Set<String> list = Prob1.stringSplit(str,"#"); //> 2��  //ȣ�⹮�� ���� method �ڵ� ����.
		System.out.println("=== ���ڿ� ó�� ��� ===");
		
	}

	private static Set<String> stringSplit(String str, String string) {
		// TODO Auto-generated method stub
		return null;
	}

	/*private static Set<String> stringSplit(String str, String string) {  >2��
		return null;  compiling error ó���� ���� return�� null�� ���� */
	

	//private static void StringSplit(String str, String string) {  //>1��: return ���� �𸣱⶧���� void, class name���� �ϱ� ������ static.
		
	

	/*private Set<String> stringSplit(String str1, String str2) { //privateȭ> ���ο����� ���� method
		Set<String> set = null;	 //return�� >set���� 					 //method ����ο� static�� ���� ���, new ��ü ���� �ʿ�.
	
		return set;
	}	*/
}
