package week3.day2;

public class AndriodMobile  extends MobilePhone{
//SubClass inherit the SuperClass
	public void navigation() {
		System.out.println("Google Maps");
	}
	
	public void getApps() {
		System.out.println("Play Store");
	}
	
	/*public static void main(String[] args) {
		AndriodMobile andriod = new AndriodMobile();
		andriod.sendMsg();
		andriod.makeCall();
		andriod.getApps();
		andriod.takeSnap();
//		andriod.privacy(); // not possible to access method which is available in the subClass from SuperClass
	}*/

}
