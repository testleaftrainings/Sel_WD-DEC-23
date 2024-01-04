package week3.day2.oops;

public class IPhone extends SmartPhone{

	
	public void playMusic() {
		System.out.println("Play music from itunes");
	}
	
	public void getApp() {
		System.out.println("Download apps from App store");
	}
	
	
	public void makeCall() {
		System.out.println("Make a call ......");
	}
	
	public void makeCall(String person) {
		System.out.println("Make a call to "+ person);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		IPhone myPhone = new IPhone();
		myPhone.playGames();
		myPhone.playMusic();
		myPhone.getApp();
		myPhone.makeCall();
		myPhone.makeCall("Mom");
	}

}
