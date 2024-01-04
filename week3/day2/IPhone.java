package week3.day2;

public class IPhone extends AndriodMobile {

	public void privacy() {
		System.out.println("privacy");
	}
	
	
	public static void main(String[] args) {
		IPhone iphone = new IPhone();
		iphone.makeCall();
		iphone.sendMsg();
		iphone.getApps();
		iphone.privacy();
	}

}
