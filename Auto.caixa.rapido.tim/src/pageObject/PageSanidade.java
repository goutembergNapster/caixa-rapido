package pageObject;

import org.openqa.selenium.support.ui.WebDriverWait;

import driverHelper.*;

import driverHelper.BasePage;

public class PageSanidade extends BasePage {
	
	@SuppressWarnings("unused")
	private WebDriverWait wait = new WebDriverWait(DriverFactory.getDriver(), 30);

}
