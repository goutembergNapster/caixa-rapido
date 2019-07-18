package actions;

import configs.TimClientConfig;
import driverHelper.BasePage;
import pageObject.PageProductQuery;

public class ManterProduto extends BasePage{
	
	private static PageProductQuery productQueryPage = new PageProductQuery();
	private static TimClientConfig timClienteConfig = new TimClientConfig();
	
	public static void ConsultarItemDescricao(String descricaoItem) {
		writeInput(productQueryPage.codeProductField(), timClienteConfig.getDescriptionProductSaleWithCash());
		clickElement(productQueryPage.searchProductButton());
	}	
	public static void RealizarNovaConsultaItem(String codigoUnicoItem) {
		writeInput(productQueryPage.uniqueIdentifier(), timClienteConfig.getUniqueIdentifier());
		clickElement(productQueryPage.searchProductButton());
		
	}
	public static void RealizarConsultaItemCodeUnicoInvalido(String codigoUnicoInvalido) {
		writeInput(productQueryPage.uniqueIdentifier(), timClienteConfig.getUniqueIdentifierInvalid());
		clickElement(productQueryPage.searchProductButton());
	}
	public static void AdicionarProdutoAoCarrinho() {
		clickElement(productQueryPage.addCartButton());
		writeInput(productQueryPage.popUp(), timClienteConfig.getUniqueIdentifier());
		clickElement(productQueryPage.addCartButton());
	}


}




