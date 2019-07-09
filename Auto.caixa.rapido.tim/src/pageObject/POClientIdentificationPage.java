package pageObject;

import org.openqa.selenium.By;

import driverHelper.BasePage;

public class POClientIdentificationPage extends BasePage {
	
	private final static By SelectClientButton = By.xpath("//*[@class='button ng-binding button-theme']");
	private final static By ClientNameFilteredLabel = By.xpath("//*[@class='popup-body']//span");
	private final static By ClientNameFilteredInCartLabel = By.xpath("//*[@class='list-item-dosis ng-binding']");
	private final static By ClientCPFFilteredInCartLabel = By.xpath("//*[@class='list-item-dosis ng-binding']");
	private final static By IdentificationByResgistrationButton = By.xpath("//*[@class='fa fa-id-card']");
	


	
	public void selectClient() {
		clickElement(SelectClientButton);
	}

	public String getClientSelected() {
		return getElements(ClientNameFilteredLabel).get(0).getText();
	}

	public String getNameClientCarrinho() {
		return getElements(ClientNameFilteredInCartLabel).get(0).getText();
	}

	public String getCPFClientCarrinho() {
		return getElements(ClientCPFFilteredInCartLabel).get(1).getText();
	}

	public void accessIdentificationClientByResgistration() {
		clickElement(IdentificationByResgistrationButton);
	}
	

}
