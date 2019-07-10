package actions;

import driverHelper.BasePage;
import pageObject.POProductQuery_COPY;

public class ActManterProduto extends BasePage{
	
	private static POProductQuery_COPY productQueryPage = new POProductQuery_COPY();
	
	
	public static void ProductSearch(String identificadorUnico) {		
		
		writeInput(productQueryPage.UniqueIdentifier(), identificadorUnico);
		clickElement(productQueryPage.SearchProductButton());
		clickElement(productQueryPage.UniqueIdentifierInvalid());	
	}
	
	
}
