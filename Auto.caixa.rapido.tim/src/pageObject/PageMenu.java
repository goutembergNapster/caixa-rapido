package pageObject;


import static driverHelper.DriverFactory.getDriver;

import org.openqa.selenium.By;

import driverHelper.BasePage;

public class PageMenu extends BasePage {
	
	private final static By MenuSanduicheButton = By.id("button_NavbarIcon");
	private final static By ClientIdentificationMenu = By.id("ionItem_homeMenuOperation4");
	private final static By SearchProductMenu = By.id("ionItem_homeMenuOperation6");
	private final static By CartBottomMenu = By.id("button_ShowCart");
	private final static By LogoutMenu = By.id("ionItem_homeMenuOperation12");
	private final static By AgreementMenu = By.id("ionItem_homeMenuOperation9");
	

	// TODO ainda sem ID
	private final static By OkPopupMenuLogoutButton = By.xpath("//*[@class='button ng-binding button-theme']");

	// TODO ainda sem ID
	private final static By LabelValidateLogout = By.xpath("//h1[@class='ng-binding']");

	private void clickMenu() {
		clickElementByIndex(MenuSanduicheButton, 1);
	}

	public void accessClientIdentification() {
		clickElement(ClientIdentificationMenu);
	}

	public void clickConsultarProdutos() {
		clickMenu();
		clickElement(SearchProductMenu);
	}

	public void accessCartMenuBottom() {
		clickElement(CartBottomMenu);
	}

	public void clickLogout() {
		// TODO why the first click of the method is througth getDriver().find.... ???
		clickMenu();
		getDriver().findElement(LogoutMenu).click();
		
		clickElement(OkPopupMenuLogoutButton);
	}

	public void clickConvenio() {
		clickMenu();
		clickElement(AgreementMenu);
	}

	public String getMessage_VefifyLogout() {
		return getText(LabelValidateLogout);
	}
	

}
