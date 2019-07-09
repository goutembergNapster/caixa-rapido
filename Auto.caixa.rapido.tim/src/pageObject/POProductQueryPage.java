package pageObject;

import org.openqa.selenium.By;

import driverHelper.BasePage;

public class POProductQueryPage extends BasePage {
	

	private final static By CodeProductField = By.id("input_productSearchAutomationCode");
	private final static By DescriptionProductField = By.id("input_productSearchDescription");
	private final static By SearchProductButton = By.id("button_productSearch");
	private final static By FowardWithoutApllyDiscount_Button = By.id("button_ContinueWithoutApplyingDiscount");
	private final static By IncludeDiscount_Button = By.id("button_IncludeDescount");
	private final static By UniqueIdentifier = By.id("input_productSearchUniqueId");
	
	// TODO Sem ID
	private final static By ListProduct = By.xpath("//*[@class='item-content']");
	// TODO Sem ID único
	private final static By AddCartButton = By.xpath("//*[@class='button-icon icon theme']");
	// TODO Sem ID 
	private final static By UniqueIdentifierInvalid = By.xpath("//*[@class='button ng-binding button-theme'][.='OK']");

	public void setCodigo(String codigo) {
		writeInput(CodeProductField, codigo);
	}

	public void setDecricao(String descricao) {
		writeInput(DescriptionProductField, descricao);
	}
	
	public void setIdentificadorUnico(String identificadorUnico) {
		writeInput(UniqueIdentifier, identificadorUnico);
	}

	public void clickPesquisar() {
		clickElement(SearchProductButton);
	}

	public boolean isEmptyListProduct() {
		return isEmptyList(getElements(ListProduct));
	}

	public void addItemCarrinho() {
		clickElement(AddCartButton);
		waiting(2000);
	}
	
	public void FowardWithoutApllyDiscount() {
		clickElement(FowardWithoutApllyDiscount_Button);
	}
	
	public void IncludeDiscount() {
		clickElement(IncludeDiscount_Button);
	}
	
	public void popupUniqueIdentifierInvalid() {
		clickElement(UniqueIdentifierInvalid);
	}

}
