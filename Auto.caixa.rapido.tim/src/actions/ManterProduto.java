package actions;

import configs.ClientConfig;
import configs.ClientConfigFactory;
import configs.TimClientConfig;
import driverHelper.BasePage;
import driverHelper.DriverFactory;
import pageObject.PageCart;
import pageObject.PageProductQuery;

public class ManterProduto extends BasePage{
	
	private ClientConfig clientConfig = ClientConfigFactory.getClientConfig(DriverFactory.clientName);
	private static PageProductQuery productQueryPage = new PageProductQuery();
	private static TimClientConfig timClienteConfig = new TimClientConfig();
	private static PageCart pageCart = new PageCart();
	
	public void ConsultarItemDescricao() {
		writeInput(productQueryPage.buscaProdutoPorDescricao(), timClienteConfig.getDescriptionProductSaleWithCash());
		clickElement(productQueryPage.searchProductButton());
	}	
	public void RealizarNovaConsultaItem(String codigoUnicoItem) {
		writeInput(productQueryPage.uniqueIdentifier(), timClienteConfig.getUniqueIdentifier());
		clickElement(productQueryPage.searchProductButton());
		
	}
	public void RealizarConsultaItemCodeUnicoInvalido(String codigoUnicoInvalido) {
		writeInput(productQueryPage.uniqueIdentifier(), timClienteConfig.getUniqueIdentifierInvalid());
		clickElement(productQueryPage.searchProductButton());
	}
	public void AdicionarProdutoAoCarrinhoSemCPF() {
		clickElement(productQueryPage.addCartButton());
		//writeInput(productQueryPage.popUp(), timClienteConfig.getUniqueIdentifier());
		clickElement(productQueryPage.seguirParaCarrinho());
		clickElement(pageCart.carrinhoBotaoPagar());
		clickElement(pageCart.botaoNaoCPF());
	}


}



 
