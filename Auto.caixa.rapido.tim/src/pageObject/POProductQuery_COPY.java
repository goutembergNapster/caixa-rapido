package pageObject;

import org.openqa.selenium.By;
import driverHelper.BasePage;

public class POProductQuery_COPY extends BasePage{
		
	public By UniqueIdentifier() {
		ElementDescription = "Search Field.";
		return By.id("input_productSearchUniqueId");
	}
	public By SearchProductButton() {
		ElementDescription = "Search product Button.";
		return By.id("button_productSearch");
	}
	public By PopUp() {
		ElementDescription = "PopUp Confirm Button.";
		return By.xpath("//*[@class='button ng-binding button-theme'][.='OK']");
	}
	public By CodeProductField() {
		ElementDescription = "CodeProductField";
		return By.id("input_productSearchAutomationCode");
	}
	public By input_productSearchDescription() {
		ElementDescription = "input_productSearchDescription";
		return By.id("input_productSearchDescription");
}
	public By searchProductButton() {
		ElementDescription = "searchProductButton";
		return By.id("searchProductButton");
	}
	public By button_productSearch () {
		ElementDescription = "button_productSearch";
		return By.id("button_productSearch");
	}
	public By FowardWithoutApllyDiscount_Button () {
		ElementDescription = "FowardWithoutApllyDiscount_Button";
		return By.id("button_ContinueWithoutApplyingDiscount");
	}
	public By button_IncludeDescount () {
		ElementDescription = "button_IncludeDescount";
		return By.id("button_IncludeDescount");
	}
	public By input_productSearchUniqueId () {
		ElementDescription = "input_productSearchUniqueId";
		return By.id("input_productSearchUniqueId");
	}
	public By ListProduct () {
		ElementDescription = "ListProduct";
		return By.xpath("//*[@class='item-content']");
	}
	public By AddCartButton () {
		ElementDescription = "AddCartButton";
		return By.xpath("//*[@class='button-icon icon theme']");
	}
	public By UniqueIdentifierInvalid () {
		ElementDescription = "UniqueIdentifierInvalid";
		return By.xpath("//*[@class='button ng-binding button-theme'][.='OK']");
	}

}





