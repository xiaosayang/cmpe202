
public class CardNumDecorator extends CreditCardDecorator{
	public String displayCreditCard(String number) {
		String cardNumber = "[";
		for (int i = 0; i < number.length(); i++) {
			cardNumber += number.charAt(i);
			if((i+1) % 4 == 0 && i < 15) {
				cardNumber += " ";
			}
		}
		cardNumber += "]";
		return cardNumber;
	}
	
}
