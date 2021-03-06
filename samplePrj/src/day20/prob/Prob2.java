package day20.prob;

import java.util.Iterator;
import java.util.Vector;
import day12.Student;

public class Prob2 { // 클래스의 기본 요소
	Student s1; // 변수
	Vector<Integer> nums;

	public Prob2() {
		super();
	}
	public Prob2(Student s1, Vector<Integer> nums) {
		this.s1 = s1;
		this.nums = nums;
	}
	public void print() { // method
		if(s1 != null ){
		System.out.println(s1);
		}
		if(nums != null){
		System.out.println(nums);
		}
		return;
	}
	/**
	 * 
	 * @return
	 */
	public int sum() {
		int sum = 0;

		Iterator<Integer> it = nums.iterator();
		while (it.hasNext()) {
			Integer d = (Integer) it.next();
			sum += d;
		}
		return sum;
	}
	@Override
	public String toString() {
		return "Prob2 [s1=" + s1 + ", nums=" + nums + "]";
	}
}
