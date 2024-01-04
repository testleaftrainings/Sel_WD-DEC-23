package week3.day3;

public class IPhone15 extends IPhoneDesignPattern{

	public static void main(String[] args) {
		IPhone15 iphone = new IPhone15();
		iphone.camera();
		iphone.battery();
		iphone.appLibrary();

	}

	@Override
	public void screenResolution() {
		System.out.println("Screen resolution 800 X 1500");
		
	}

	@Override
	public void camera() {
		System.out.println("Front camera 12MP and back Camera 12MP + 12MP");
		
	}

	@Override
	public void networkConnectivity() {
		System.out.println("5G");
		
	}

	@Override
	public void battery() {
		System.out.println("3149mah");
		
	}

}
