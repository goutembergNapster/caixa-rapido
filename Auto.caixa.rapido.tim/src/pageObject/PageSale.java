package pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import driverHelper.*;

import driverHelper.BasePage;

public class PageSale extends BasePage {
	
	private final static By SplashLoading = By.xpath("//[@class='loading']");

	private final static By PasswordCardField = By.id("input_convernantPayment");
	private final static By ConfirmPasswordCardButton = By.id("button_convernantPayment");
	private final static By PdfTaxCoupon = By.id("pdf");

	// TODO sem ID -All bellow-
	private final static By NewSaleFloatButton = By.xpath("//*[@class='icon fa fa-sync-alt']/..");
	private final static By AskNewSalePopup = By.xpath("//*[@class='popup-body']/span");
	private final static By ConfirmAskNewSaleButton = By.xpath("//*[@class='popup-buttons']/button[.='OK']");

	private WebDriverWait wait = new WebDriverWait(DriverFactory.getDriver(), 60);

	public void setSenhaCartao(String senha) {
		wait.until(ExpectedConditions.invisibilityOfElementLocated(SplashLoading));
		writeInput(PasswordCardField, senha);
		clickElement(ConfirmPasswordCardButton);
	}

	public String checkSaleSuccessAndGetMessage() {

		wait.until(ExpectedConditions.presenceOfElementLocated(PdfTaxCoupon));
		wait.until(ExpectedConditions.presenceOfElementLocated(NewSaleFloatButton));

		clickElement(NewSaleFloatButton);
		String msgConfirmacao = getText(AskNewSalePopup);
		clickElement(ConfirmAskNewSaleButton);

		return msgConfirmacao;
	}


}
