package Tests;

import static org.junit.Assert.assertEquals;
import org.junit.Assert;
import org.junit.Test;
import pageObject.*;
import configs.*;
import constantes.Mensagens;
import driverHelper.*;

public class SanidadeTIMTest extends BasePage {
	
	private POMenuPage menuPage = new POMenuPage();
	private POProductQueryPage productQueryPage = new POProductQueryPage();
	private POCartPage cartPage = new POCartPage();
	private POFormOfPaymentPage formOfPaymentPage = new POFormOfPaymentPage();
	private POSalePage salePage = new POSalePage();
	
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
