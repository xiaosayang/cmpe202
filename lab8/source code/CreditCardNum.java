/* (c) Copyright 2018 Paul Nguyen. All Rights Reserved */

//public class CreditCardNum extends CreditCardDecorator implements IDisplayComponent, IKeyEventHandler

public class CreditCardNum implements IDisplayComponent, IKeyEventHandler
{

	private IKeyEventHandler nextHandler ;
	private String number = "" ;
	private CardNumDecorator cardNumDecorator = new CardNumDecorator();

    public void setNext( IKeyEventHandler next) {
    	this.nextHandler = next ;
    }	

	public String display() {
		if ( number.equals("") )
			return "[4444 4444 4444 4444]" + "  " ;
		else {
			return cardNumDecorator.displayCreditCard(number) + "  ";
			
		}
	}	

	public void key(String ch, int cnt) {
		//System.out.println("Count of ch is: "+ cnt);
		if ( cnt <= 16 && !ch.equalsIgnoreCase("X")){
			number += ch ;
		}
		else if (cnt <= 16 || cnt == 17 && ch.equalsIgnoreCase("X")) {
			number = number.substring(0,number.length()-1);
		}
		else if ( nextHandler != null )
			nextHandler.key(ch, cnt) ;
	}	

	public void addSubComponent( IDisplayComponent c ) {
		return ; // do nothing
	}


	/*@Override
	public String displayCreditCard() {
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
*/
}