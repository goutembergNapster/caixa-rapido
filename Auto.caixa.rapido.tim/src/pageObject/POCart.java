package pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import driverHelper.*;

import driverHelper.BasePage;

public class POCart extends BasePage {
	
	private final static By SplashLoad = By.xpath("//*[@class='loading']");
	private final static By IdentifyClientLabel = By.xpath("//*[@class='list-item-dosis']");
	private final static By CPFIdentificationButton = By.xpath("//*[@class='col col-50']/p[.='CPF']/..");
	private final static By CPFClientField = By.xpath("//*[@class='list list-inset pane tab-content']//input");
	private final static By SearchCPFClientButton = By.xpath("//*[@class='button button-block button-theme button_font_dosis']");
	private final static By ListProductCart = By.xpath("//*[@class='item item-remove-animate item-inset item-text-wrap item-complex item-right-editable']");
	
	private final static By TotalCartLabel = By.id("homeH1TotalValue");
	
	private final static By UniqueIdentifierInvalid = By.xpath("//*[@class='button ng-binding button-theme'][.='OK']");

	private final static By CPFInNoteNotButton = By.xpath("//*[@class='button ng-binding button-default'][.='Não']");
	private final static By CPFInNoteYesButton = By.xpath("//*[@class='button ng-binding button-theme']");
	private final static By HandsAgreementIcon = By.xpath("//*/i[@class='fas fa-hands-helping']");

	private final static By FinalizeCartButton = By.id("button_fiscalCartProcessDiscount");

	private WebDriverWait wait = new WebDriverWait(DriverFactory.getDriver(), 60);

	public void identifyClientByCPF(String cpf) {
		wait.until(ExpectedConditions.invisibilityOfElementLocated(SplashLoad));

		clickElement(IdentifyClientLabel);
		clickElement(CPFIdentificationButton);
		writeInput(CPFClientField, cpf);

		wait.until(ExpectedConditions.presenceOfElementLocated(SearchCPFClientButton));

		getElements(SearchCPFClientButton).get(1).click();
	}

	public int qtdItensCarrinho() {
		return getElements(ListProductCart).size();
	}

	public String getTotalCarrinho() {
		return getText(TotalCartLabel);
	}
	
	public void popupUniqueIdentifierInalid() {
		clickElement(UniqueIdentifierInvalid);
	}

	public void finalizarCarrinho() {
		wait.until(ExpectedConditions.invisibilityOfElementLocated(SplashLoad));
		clickElement(FinalizeCartButton);
	}

	public void popupCPFInNoteNot() {
		clickElement(CPFInNoteNotButton);
	}

	public void popupCPFInNoteYes() {
		clickElement(CPFInNoteYesButton);
	}

	public boolean isHandsPresent() {
		return isPresentElement(HandsAgreementIcon);
	}


}
