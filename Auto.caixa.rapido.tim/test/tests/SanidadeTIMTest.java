package tests;

import static org.junit.Assert.assertEquals;
import org.junit.Assert;
import org.junit.Test;
import pageObject.*;
import configs.*;
import driverHelper.*;
import mensagens.Mensagens;

public class SanidadeTIMTest extends BasePage {
	
	private PageMenu menuPage = new PageMenu();
	private PageProductQuery productQueryPage = new PageProductQuery();
	private PageCart cartPage = new PageCart();
	private PageFormOfPayment formOfPaymentPage = new PageFormOfPayment();
	private PageSale salePage = new PageSale();
}
	//private ClientConfig clientConfig = ClientConfigFactory.getClientConfig(DriverFactory.clientName);

/*	@Test
	public void validateSaleWithCash() {

		menuPage.clickConsultarProdutos();

		productQueryPage.setDecricao(clientConfig.getDescriptionProductSaleWithCash());
		productQueryPage.clickPesquisar();
		
		if (productQueryPage.isEmptyListProduct())
			Assert.fail();
		productQueryPage.addItemCarrinho();
		productQueryPage.FowardWithoutApllyDiscount();

		productQueryPage.setDecricao(clientConfig.getDescriptionProductSaleWithCash());
		productQueryPage.clickPesquisar();
		if (productQueryPage.isEmptyListProduct())
			Assert.fail();
		productQueryPage.addItemCarrinho();
		productQueryPage.FowardWithoutApllyDiscount();

		menuPage.accessCartMenuBottom();

		assertEquals(clientConfig.getTotalItensCart_SaleWithCash(), cartPage.qtdItensCarrinho());
		assertEquals(clientConfig.getTotalCart_SaleWithCash(), cartPage.getTotalCarrinho());

		cartPage.finalizarCarrinho();
		formOfPaymentPage.selectFormPaymentCash();
		assertEquals(Mensagens.FINALMESSAGE_SALE, salePage.checkSaleSuccessAndGetMessage());
	}

}
*/
