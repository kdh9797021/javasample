package day05;

public class Prob3 {

	public static void main(String[] args) {
/* 	String sourceString = "everyday we have is one more than we deserve";
				String encodedString = "";
			
				for(int i=0;i<=sourceString.length()-1;i++){   
					char c = sourceString.charAt(0);  //data ����
					if(c=='x' || c=='y' ||c=='z'){
							encodedString += (char)(c-23);  
				}else if (c == '  ') {
							encodedeString += c;
				}else {
							encodedString += (char)(c+3);
				}
				
				// ���� : ���� 'a'�� �������� 97�̸�, 'z'�� 122�Դϴ�. 
				
			
				
				System.out.println("��ȣȭ�� ���ڿ� : " + sourceString);
				System.out.println("��ȣȭ�� ���ڿ� : " + encodedString);
				*/
				System.out.println("================================");
				String msg = "hello Java";
				char [] s = msg.toCharArray();    //Char�迭 ��ȯ API.
				char [] t = new char[s.length];
				for(int i = 0 ; i<s.length ; i++){
						if(s[i]>= 'A' && s[i]<='Z'){
								t[i] = (char)(s[i]+ 32);   //�ҹ��ڿ��� �빮�ڷ�
			
						} else if (s[i] == ' '){
								t[i] = s[i];
						}else {
								t[i] = (char)(s[i]-32);  // �빮�ڿ��� �ҹ��ڷ�
											
						}
					 	}
				String name = new String("ȫ�浿");
				String msg2 = new String(t);
				
				System.out.println(msg);
				System.out.println(msg2);
				
				}
	}

