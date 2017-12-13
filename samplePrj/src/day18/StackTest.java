package day18;

import java.util.Arrays;

public class StackTest {

	public static void main(String[] args) {
		MyStack stack = new MyStack(10);
		if(stack.isEmpty()){
			System.out.println("������ ����ֽ��ϴ�.");
		}
		
		for (int i = 1; i <= 10; i++) {
			stack.push(i);
		}
		
		if(stack.isFull()){
			System.out.println("������ ���� á���ϴ�.");
		}
		
		System.out.println("�ֻ��� ���� : " + stack.top());
		System.out.println("�ֻ������� ���� ���� : " + stack.pop());
		System.out.println("�ֻ������� ���� ���� : " + stack.pop());
		System.out.println("");
		System.out.println("== ���� ����Ʈ ==");
		for (int i = 1; i <= 10; i++) {
			int num = stack.pop();
			if(num != -1)
				System.out.println(num);
		}
	}
}

class MyStack{
	int [] Stack = null;
	int count = 0;
	
	public MyStack() {	
		Stack = new int [10];
	}
	public MyStack(int a) {
		if(a<0){
			Stack = new int[10];
			return;
		}
		Stack = new int[a];
	}

	public int[] getStack() {
		return Stack;
	}
	public void setStack(int[] stack) {
		Stack = stack;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + Arrays.hashCode(Stack);
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		MyStack other = (MyStack) obj;
		if (!Arrays.equals(Stack, other.Stack))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "MyStack [Stack=" + Arrays.toString(Stack) + "]";
	}
	// push()
	public void push(int a){
		Stack[count]=a;
		count++;
		
	}
	public boolean isEmpty(){
		if(count==0){
			return true;
		}
		return false;
	}
	public boolean isFull(){
		if(count==Stack.length){
			return true;
		}
			return false;
	}
	public int top(){
		if(isEmpty()){
			return -1;
		}
		return	Stack[count-1];
	}
	public int pop(){
		if(count==0){
			return -1;
		}
		int b = Stack[count-1];
		// Stack[count-1]=0;
		count--;
		Stack[count]=0;
		return b;
	}
	
}
