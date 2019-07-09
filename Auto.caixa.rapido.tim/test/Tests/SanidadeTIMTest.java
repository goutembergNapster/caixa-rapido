package Tests;

import static org.junit.Assert.assertEquals;
import org.junit.Assert;
import org.junit.Test;
import pageObject.*;
import configs.*;
import constantes.Mensagens;
import driverHelper.*;

public class SanidadeTIMTest extends BasePage {
	
	private POMenu menuPage = new POMenu();
	private POProductQuery productQueryPage = new POProductQuery();
	private POCart cartPage = new POCart();
	private POFormOfPayment formOfPaymentPage = new POFormOfPayment();
	private POSale salePage = new POSale();
	
	private ClientConfig clientConfig = ClientConfigFactory.getClientConfig(DriverFactory.clientName);

	@Test
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
