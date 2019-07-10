package pageObject;

import org.openqa.selenium.By;
import driverHelper.BasePage;

public class POProductQuery_COPY extends BasePage {
	private void constructorPage() {
		PageDescription = "Product query page";
	}
	
	public By UniqueIdentifier() {
		ElementDescription = "Search Field.";
		return By.id("input_productSearchUniqueId");
	}
	
	public By SearchProductButton() {
		ElementDescription = "Search product Button.";
		return By.id("button_productSearch");
	}
	
	public By UniqueIdentifierInvalid() {
		ElementDescription = "PopUp Confirm Button.";
		return By.xpath("//*[@class='button ng-binding button-theme'][.='OK']");
	}
}
