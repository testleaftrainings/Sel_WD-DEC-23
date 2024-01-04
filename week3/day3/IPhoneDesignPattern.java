package week3.day3;

public abstract class IPhoneDesignPattern  implements IPhoneUI, IPhoneMainFeatures{

	public void appLibrary() {
		System.out.println("App library along with search bar");
	}
	
	public void siri() {
		System.out.println("Voice Assistant Siri");
	}
	
	public void chargingPort() {
		System.out.println("Lighting Port");
	}
	
	public void itunes() {
		System.out.println("Play music");
	}
	
	public void mic() {
		System.out.println("Mic and Speaker");
	}
	
}
