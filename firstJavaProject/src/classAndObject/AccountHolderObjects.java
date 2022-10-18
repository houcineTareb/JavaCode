package classAndObject;

public class AccountHolderObjects {

	public static void main(String[] args) {
		
        AccountHolder adem = new AccountHolder();
        AccountHolder ali = new AccountHolder();
        AccountHolder ahmed = new AccountHolder();
        
        adem.firstName = "Adem";
        adem.lastName = "Sadji";
        adem.age = 25;
        adem.accountBalance = 4000;
        adem.testEligebilityForCreditCard();
        
        System.out.println("Is adem eligibel for CC: "+adem.eligibleForCreditCart);
        
        
        
        
	}

}
