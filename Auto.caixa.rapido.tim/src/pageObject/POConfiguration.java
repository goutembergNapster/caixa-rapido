package pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import  driverHelper.*;

import driverHelper.BasePage;

public class POConfiguration extends BasePage {
	
	private final static By SettingButton = By.id("configBtn");
	private final static By HostnameField = By.id("input_configHost");
	private final static By PortField = By.id("input_configPort");
	private final static By LoadButton = By.id("button_configloadSettings");
	private final static By OkPopupConfigurationButton = By.id("button_checklistOk");
	private final static By CloseButton = By.id("button_closeModal");
	private final static By FirstIconConfig = By
			.xpath("//*[@class='fa fa-2x fa-check balanced']/../../div[.='Registrando dispositivo']/..//i");
	private final static By SecondIconConfigIcon = By
			.xpath("//*[@class='fa fa-2x fa-check balanced']/../../div[.='Configurando serviços']/..//i");
	private final static By ThithIconConfig = By
			.xpath("//*[@class='fa fa-2x fa-check balanced']/../../div[.='Atualizando configurações']/..//i");
	private final static By FourthIconConfig = By
			.xpath("//*[@class='fa fa-2x fa-check balanced']/../../div[.='Configurando MID-e Client']/..//i");

	private WebDriverWait wait = new WebDriverWait(DriverFactory.getDriver(), 60);

	public void clickConfigBtn() {
		clickElement(SettingButton);
	}

	public void setHostname(String pHostname) {
		writeInputWithClear(HostnameField, pHostname);
	}

	public void setPort(String pPort) {
		writeInputWithClear(PortField, pPort);
	}

	public void clickCarregar() {
		clickElementByIndex(LoadButton, 0);
	}

	private void waitForConfiguration() {
		wait.until(ExpectedConditions.presenceOfElementLocated(FirstIconConfig));
		wait.until(ExpectedConditions.presenceOfElementLocated(SecondIconConfigIcon));
		wait.until(ExpectedConditions.presenceOfElementLocated(ThithIconConfig));
		wait.until(ExpectedConditions.presenceOfElementLocated(FourthIconConfig));
	}

	public void clickOkPopUp() {
		waitForConfiguration();
		clickElement(OkPopupConfigurationButton);
	}

	public void clickFechar() {
		wait.until(ExpectedConditions.elementToBeClickable(CloseButton));
		clickElement(CloseButton);
	}

}
