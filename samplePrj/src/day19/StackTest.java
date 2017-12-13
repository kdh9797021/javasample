package day19; //Stack.class  (resizing�� �ǰ� �ٸ� type�� ���� ������)

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class StackTest {

	public static void main(String[] args) {
		Stack<String> stack = new Stack<String>(); // int type ���� generics
													// <integer>
		for (int i = 0; i <= 77; i++) {
			stack.push("" + i); // �⺻��(int)�� ���������� �ڵ� ��üȭ (autoboxing)
		}
		System.out.println(stack.pop()); // �ֻ�ܿ� �� ��ü
		System.out.println("-------------------------------------------");
		
		Queue<Integer> queue = new LinkedList<Integer>();    //Queue���� 
		for (int i = 1; i <= 10; i++) {
			queue.offer(i);
		}
		System.out.println(queue.poll());
	}
}
