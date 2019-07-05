package driverHelper;

import static driverHelper.DriverFactory.getDriver;

import java.io.*;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.appium.java_client.MobileElement;

public class BasePage {
	
	public void waiting(long time) {
		try {
			Thread.sleep(time);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	public void writeInput(By by, String text) {
		getDriver().findElement(by).sendKeys(text);
	}

	public void writeInputWithClear(By by, String text) {
		MobileElement input = getDriver().findElement(by);
		input.clear();
		input.sendKeys(text);
	}

	public void clickElement(By by) {
		new WebDriverWait(getDriver(), 60).until(ExpectedConditions.presenceOfElementLocated(by));
		getDriver().findElement(by).click();
	}

	public void clickElementByIndex(By by, int index) {
		getDriver().findElements(by).get(index).click();
	}

	public String getText(By by) {
		return getDriver().findElement(by).getText();
	}

	public int countQTDElements(By by) {
		return getDriver().findElements(by).size();
	}

	public void hideKeyboard() {
		getDriver().hideKeyboard();
	}

	public void isClicableElement(By by) {
		new WebDriverWait(getDriver(), 60).until(ExpectedConditions.elementToBeClickable(by));
	}

	public MobileElement getElement(By by) {
		return getDriver().findElement(by);
	}
	
	public List<MobileElement> getElements(By by) {
		return getDriver().findElements(by);
	}
	
	public boolean isEmptyList(List<MobileElement> lista) {
		return lista.isEmpty();
	}

	public boolean isPresentElement(By by) {
		return getDriver().findElements(by) != null ? true : false;
	}

	public void clickContainer(By by) {
		clickElement(by);
	}


}
