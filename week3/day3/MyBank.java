package week3.day3;

public class MyBank extends AxisBank{

	public void personalLoan() {
		System.out.println("No needed ");
	}
	
	
	public static void main(String[] args) {
		MyBank bank = new MyBank();
		bank.accountHolderDetails("Gokul Sekar", 8925411174L, "ADHBYTV1243");
		bank.debitCard();
		bank.debitCardLimit();
		bank.personalLoan();
		bank.withdrawalLimit();
		bank.updateKYC();

	}


	@Override
	public void internetBanking() {
		// TODO Auto-generated method stub
		System.out.println("Internet banking requires");
	}


	@Override
	public void mobileBanking() {
		// TODO Auto-generated method stub
		System.out.println("Mobile banking requires");
	}

}
