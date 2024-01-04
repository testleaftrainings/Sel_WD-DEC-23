package week3.day2;

public class MobilePhone {

	
	public void makeCall() {
		System.out.println("Make a call");
	}
	
	public void sendMsg() {
		System.out.println("Send a message to my friend");
	}
	
	public void setAlarm() {
		System.out.println("Set a alarm");
	}
	
	public void takeSnap() {
		System.out.println("Take a snap");
	}
	
	public static void main(String[] args) {
		MobilePhone myPhone = new MobilePhone();
		myPhone.sendMsg();
		myPhone.makeCall();
	}
	
	
}
