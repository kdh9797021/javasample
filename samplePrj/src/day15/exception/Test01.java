package day15.exception; //����ó�� 

public class Test01 {
	public static void main(String[] args) {
		System.out.println("START");
		try {
			System.out.println("try{");
			System.out.println(args[0].length()); // args�� ���������� �����ʾƼ� catch�� ������.
			int num = Integer.parseInt(args[0]); //�ݳ��ؾ��� �ڿ��� ������ finally{} ���� �Ѿ.
			System.out.println(10/num); 
			System.out.println("}");
		} catch (ArrayIndexOutOfBoundsException e) { // �θ�Ÿ�Կ� catch(Exception e)�������� ����.
			System.out.println("�����Ҽ� ���� �迭 �ε��� ���");
		} catch (NumberFormatException e){
			System.out.println("���ڷ� �Է����ּ���");
			System.out.println(e);  //������ �⺻ ���� �޽���  (���� ����)
			e.printStackTrace();
			System.out.println(e.getMessage()); // ������ �⺻ ���� �޽���2 (��� ���)
		} catch (Exception e) { //���� ���� �߻��� 
			System.out.println("~~~~~~~~~~~~~~~~~~~");
		} finally { //���ܹ߻� ���� ������� �׻� ������.
			System.out.println("�ڿ� �ݳ��� ���⿡~~~");
		}
		System.out.println("END"); // ���� ����
	}
}
