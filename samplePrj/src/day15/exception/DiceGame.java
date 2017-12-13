package day15.exception;



class Dice {
	int size;

	Dice(int size) {
		this.size = size;
	}

	int play() {
		int number = (int) (Math.random() * size) + 1;
		return number;
	}
}

public class DiceGame {
	public static void main(String args[]) {
		DiceGame game = new DiceGame();
		try {
			int result1 = game.countSameEye(10);
			System.out.println("���� ������ 8���� �ֻ��� 2����  ������ ���� ���� ���� Ƚ�� : " + result1);

			int result2 = game.countSameEye(-10);
			System.out.println("���� ������ 8���� �ֻ��� 2����  ������ ���� ���� ���� Ƚ�� : " + result2);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

	int countSameEye(int n) throws Exception {
		if (n <= 0) {
			throw new Exception("���ܰ� �߻��Ͽ����ϴ�.");
		}
		Dice d1 = new Dice(8);
		Dice d2 = new Dice(8);
		int count = 0;
		for (int i = 0; i < n; i++) {
			if (d1.play() == d2.play())
				count++;
		}
		return count;
	}
}
