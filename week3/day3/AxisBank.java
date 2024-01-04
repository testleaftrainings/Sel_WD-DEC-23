package week3.day3;

public abstract class AxisBank implements AxisBankRules, RBI{
//Abstract 
	@Override
	public void updateKYC() {
		
		System.out.println("Known your customer details");
		
	}
	
	public void debitCard() {
		System.out.println("People age should be greater than 18");
	}
	
	public void debitCardLimit() {
		System.out.println("Debit card limit will be 50,000");
	}

	@Override
	public void withdrawalLimit() {
		System.out.println("WithdrwalLimit is 49,999");
		
	}
	
	public abstract  void personalLoan();// abstract method
	
	
	public static void main(String[] args) {
//		AxisBank bank = new AxisBank(); 
		
	}

}
