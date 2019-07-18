package pageObject;

import org.openqa.selenium.By;
import driverHelper.BasePage;

public class PageProductQuery extends BasePage{
		
	public By uniqueIdentifier() {
		ElementDescription = "Search Field.";
		return By.id("input_productSearchUniqueId");
	}
	public By botaoBuscaProduto() {
		ElementDescription = "Search product Button.";
		return By.id("button_productSearch");
	}
	public By popUp() {
		ElementDescription = "PopUp Confirm Button.";
		return By.xpath("//*[@class='button ng-binding button-theme'][.='OK']");
	}
	public By codeProductField() {
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
	public By fowardWithoutApllyDiscount_Button () {
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
	public By listProduct () {
		ElementDescription = "ListProduct";
		return By.xpath("//*[@class='item-content']");
	}
	public By addCartButton () {
		ElementDescription = "AddCartButton";
		return By.xpath("//*[@class='button-icon icon theme']");
	}
	public By uniqueIdentifierInvalid () {
		ElementDescription = "UniqueIdentifierInvalid";
		return By.xpath("//*[@class='button ng-binding button-theme'][.='OK']");
	}

}





