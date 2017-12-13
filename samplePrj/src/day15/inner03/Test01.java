package day15.inner03;

public class Test01 {
	public static void main(String[] args) {
		if(args.length ==0){  //args ���� ���� ��� ���� ó��
			System.out.println("select | delete | update | insert | select ");
			System.out.println("�� �ϳ��� �Ķ���ͷ� �Է����ּ���.");
			return;
		}
		Command delete = new DeleteCommand(); // ���� class��ü(Command interface
												// ������) ����
		// delete.exec();

		Command insert = new Command() { // 'Command�� implements�� �͸� class' ��ü
											// ���� (interface���� abstract
											// method�����Ƿ� overriding �ʿ�)
			public void exec() {
				System.out.println("��� �۾� ���� �մϴ�.");
			}
		};
		// insert.exec();

		Command update = new Command() {
			public void exec() {
				System.out.println("���� �۾� �����մϴ�.");
			}
		};
		// update.exec();

		Command select = new Command() {
			public void exec() {
				System.out.println("��� �Ѹ��� �����մϴ�.");
			}
		};
		// select.exec();
		
		Command search = new Command() {   //new �ʱ�ȭ�� ctrl+space �� �ҷ����� ����.
			@Override
			public void exec() {
				System.out.println("�˻� �����մϴ�.");
			}
		};
		// search.exec();
		
		if(args[0].equals("insert")){insert.exec();
	}else if(args[0].equals("update")){update.exec();
	}else if(args[0].equals("select")){select.exec();
	}else if(args[0].equals("search")){search.exec();
	}else if(args[0].equals("delete")){delete.exec();
	}else{System.out.println("�Է°��� ������ �߻��߽��ϴ�.");			
				System.out.println("select | delete | update | insert | select �� �ϳ��� �Ķ���ͷ� �Է����ּ���.");}

	}	
}

interface Command { // Command�� interface�̹Ƿ� �޸𸮿� �ö���X, '���� ��ü' �ʿ�
	void exec();
}

class DeleteCommand implements Command {     //Class ���� �𵨸� ��� 
	@Override
	public void exec() {
		System.out.println("���� �۾� �����մϴ�.");
	}
}