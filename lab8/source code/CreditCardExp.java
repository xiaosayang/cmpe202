/* (c) Copyright 2018 Paul Nguyen. All Rights Reserved */

//public class CreditCardExp extends CreditCardDecorator implements IDisplayComponent, IKeyEventHandler

public class CreditCardExp implements IDisplayComponent, IKeyEventHandler
{

	private IKeyEventHandler nextHandler ;
	private String date = "" ;
	private CardExpDecorator cardExpDecorator = new CardExpDecorator();
	

    public void setNext( IKeyEventHandler next) {
    	this.nextHandler = next ;
    }	

	public String display() {
		if ( date.equals("") )
			return "[MM/YY]" + "  " ;
		else
			return cardExpDecorator.displayCreditCard(date) + "  ";
	}	

	public void key(String ch, int cnt) {
		if ( cnt >= 17 && cnt <= 20 && !ch.equalsIgnoreCase("X") )
			date += ch ;
		else if ((cnt >= 17 && cnt <= 20)|| cnt== 21 && ch.equalsIgnoreCase("X")) {
			if(date.length() > 0)
                date = date.substring(0, date.length() -1);
		}
		else if ( nextHandler != null )
			nextHandler.key(ch, cnt) ;
	}	

	public void addSubComponent( IDisplayComponent c ) {
		return ; // do nothing
	}

	/*@Override
	public String displayCreditCard() {
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
*/
}