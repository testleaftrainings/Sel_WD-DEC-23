package week3.day3;

public interface RBI {
	
	String accountName = "Gokul";// S --> static , F --> final 

	public void updateKYC();// unimplement method
	
	public void withdrawalLimit();
	
	//implement method
	default void accountHolderDetails(String accountHolderName, long mobileNumber, String panNo) {
		System.out.println("Account holder name :" + accountHolderName +
				"\n  Mobile number : "+ mobileNumber+
				"\n Pan card number : " + panNo);
	}
	
	
	
}
