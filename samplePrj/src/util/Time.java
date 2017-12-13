package util;  // Encapsulation

public class Time {   //p.245
	private int hour;
	private int minute;
	private int second;
	private boolean am = true; // am�� pm ����, ����� �ʱ�ȭ
	
	public Time() { 	}   //default ������ ����
	public Time(int hour, int minute, int second) {
		this.setHour(hour);
		this.setMinute(minute);    //�ϴ� if�� ������ ���� ��ȿ�� ����. (�ڵ������� �������Լ� set ���� ����)
		this.setSecond(second);
	}
	public boolean isAm() {
		return am;
	}
	public void setAm(boolean am) {
		this.am = am;
	}
	public int getHour() {    //��,�ҹ��� ����
		return hour;
	}

	public void setHour(int hour) {
		if(hour<0|hour>23){
			return;
		}
		if(hour>=12) am = false;
		this.hour = hour;
	}
	
	public int getMinute() {
		return minute;
	}

	public void setMinute(int minute) {
		if(minute <0|minute>=60){
			return;
		}
		this.minute = minute;
	}

	public int getSecond() {
		return second;
	}

	public void setSecond(int second) {
		if(second<0|second>=60){
			return;
		}
		this.second = second;
	}

	public void display(){   //B 
		String d = "Time [hour=" + hour + ", minute=" + minute + ", second=" + second + "]";
		System.out.println(d);
	}
	@Override
	public String toString() {   //������ �����ؼ� ���ڿ��� ��ȯ. ��ü�� ���� ���(display method ���� ���).
		return "Time [hour=" + hour + ", minute=" + minute + ", second=" + second + "]";    //A
	}
	
	
	
}
