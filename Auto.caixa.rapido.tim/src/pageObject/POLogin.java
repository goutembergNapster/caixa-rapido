package pageObject;

import static driverHelper.DriverFactory.getDriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import constantes.MensagensDeAcesso;
import driverHelper.BasePage;
import driverHelper.DriverFactory;

public class POLogin extends BasePage {
	
	private final static By UsernameField = By.id("username");
	private final static By PasswordField = By.id("password");
	private final static By LogarBtn = By.id("loginBtn");

	// TODO -- without id
	private final static By MessageErrorInvalidLogin = By.xpath("//*[@class='popup-body']/span");
	private final static By ApplicationTitle = By.xpath("//*[@class='title title-center header-item']/span");
	private final static By PopupErrorOkButton = By.xpath("//*[@class='button ng-binding button-theme']");

	public void setUsername(String pUsername) {
		writeInputWithClear(UsernameField, pUsername);
	}

	public void setPassword(String pPassword) {
		writeInputWithClear(PasswordField, pPassword);
	}

	public void logar() {
		clickElement(LogarBtn);
	}

	public boolean validateLogin() {
		new WebDriverWait(getDriver(), 60).until(ExpectedConditions.presenceOfElementLocated(ApplicationTitle));

		return getText(ApplicationTitle).equals(MensagensDeAcesso.APPLICATION_TITLE);
	}

	public String validateMessageWithError() {
		return getText(MessageErrorInvalidLogin);
	}

	public boolean btnEntrarUnavailable() {
		try {
			clickElement(LogarBtn);
			return false;
		} catch (WebDriverException e) {
			return true;
		}
	}

	public void clearFields() {
		DriverFactory.getDriver().findElement(UsernameField).clear();
		DriverFactory.getDriver().findElement(PasswordField).clear();
	}

	public void clickOkPopupError() {
		clickElement(PopupErrorOkButton);
	}

}
