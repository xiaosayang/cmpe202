
public class CardExpDecorator extends CreditCardDecorator{
	public String displayCreditCard(String date) {
		String creditCardExp = "[";
		for(int i = 0; i < date.length(); i++) {
			creditCardExp += date.charAt(i);
			if (i == 1) {
				creditCardExp += "/";
			}
		}
		creditCardExp += "]";
		return creditCardExp;
	}
}
