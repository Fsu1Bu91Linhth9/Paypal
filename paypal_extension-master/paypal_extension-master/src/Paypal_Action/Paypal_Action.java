package Paypal_Action;

import Paypal_Action.Paypal_Function;

public class Paypal_Action {

	
	public static void main(String [] args) throws InterruptedException
	{
		// Turn on 3G - run bat file
		
		// Open Chrome browser
		Paypal_Function PaypalAction = new Paypal_Function();
		PaypalAction.openBrowser("https://www.paypal.com/vn/home");
		
		// Click button SignUp
		PaypalAction.clickButtonSignUp();
		
		// Click button Get Started of Buy With Paypal
		PaypalAction.clickButtonGetStarted();
		
		
	}

}
