package actions;

import driverHelper.BasePage;
import pageObject.PageProductQuery;

public class ManterProduto extends BasePage{
	
	private static PageProductQuery productQueryPage = new PageProductQuery();
	
	
	
	public static void ProductSearch(String identificadorUnico) {		
		
		writeInput(productQueryPage.UniqueIdentifier(), identificadorUnico);
		clickElement(productQueryPage.SearchProductButton());
		clickElement(productQueryPage.PopUp());	
	}	
	public static void AddCart(String identificadorUnico) {
		clickElement(productQueryPage.ListProduct());
		writeInput(productQueryPage.UniqueIdentifier(), identificadorUnico);
		clickElement(productQueryPage.AddCartButton());	
	}
	public static void PagarSemCPF(String identificadorUnico) {
		clickElement(productQueryPage.AddCartButton());
		writeInput(productQueryPage.UniqueIdentifier(),identificadorUnico );
	}
	public void AdicionaProduto(){
		clickElement(productQueryPage.AddCartButton() );
		
	}
	
}	

