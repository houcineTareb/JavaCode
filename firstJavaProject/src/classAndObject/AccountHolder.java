package classAndObject;

public class AccountHolder {

	String	firstName;
	String	lastName;
	int	age;
	float	accountBalance;
	boolean	eligibleForCreditCart;
	
	public void testEligebilityForCreditCard() {
    	if (age>25 && accountBalance>=4000) {
    		eligibleForCreditCart=true;
    	}
	}
	
	
}
