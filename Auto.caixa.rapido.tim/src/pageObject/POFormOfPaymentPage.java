package pageObject;

import org.openqa.selenium.By;

import driverHelper.BasePage;

public class POFormOfPaymentPage extends BasePage {
	
	private final static By TotalCartMethodPaymentScreen = By.id("campo-moeda");

	// TODO sem ID único
	private final static By CashMethodPayment = By.xpath("//*[@class='item item-icon-left']//span[.='Dinheiro']/../..");
	private final static By AgreementMethodPayment = By.xpath("//*[@class='item item-icon-left']//span[.='Convênio']/../..");

	public String getTotalCartFormPayment() {
		return getText(TotalCartMethodPaymentScreen);
	}

	public void selectFormPaymentCash() {
		clickElement(CashMethodPayment);
	}

	public void selectFormPaymentAgreement() {
		clickElement(AgreementMethodPayment);
	}

}
