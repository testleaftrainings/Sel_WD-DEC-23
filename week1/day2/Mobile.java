package week1.day2;

public class Mobile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Mobile iphone = new Mobile();
		iphone.makeCall("Mom");
		
		Mobile candyShop = new Mobile();
		int balanceRupee = candyShop.buyChocolate("Milk bar", 50);
		System.out.println(balanceRupee);
		// press ctrl and 2 simul, and then both keys then press l key
		int balRupee = candyShop.buyChocolate("Kikat", 30);
		
	}
	
	public String makeCall(String personName) {
		
		System.out.println("Make call to "+ personName);
		
		return "Either they answer or didn't answer";
	}

	
	public int buyChocolate(String chocolateName, int rupee) {
		int chocolatePrice = 20;
		System.out.println(chocolateName +" price is "+chocolatePrice);
		return (rupee-chocolatePrice);
	}
}
