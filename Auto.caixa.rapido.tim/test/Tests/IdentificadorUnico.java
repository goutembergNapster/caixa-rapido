package Tests;

import org.junit.Assert;
import org.junit.Test;
import pageObject.*;
import driverHelper.*;
import configs.*;


public class IdentificadorUnico extends BaseTest {
	
	private POMenuPage menuPage = new POMenuPage();
	private POProductQueryPage productQueryPage = new POProductQueryPage();
	private POCartPage cartPage = new POCartPage();
	
	
	private ClientConfig clientConfig = ClientConfigFactory.getClientConfig(DriverFactory.clientName);
	
		@Test
		public void searchCodeUnique() {
			
			productQueryPage.setIdentificadorUnico(clientConfig.getUniqueIdentifierInvalid());
			productQueryPage.clickPesquisar();
			productQueryPage.popupUniqueIdentifierInvalid();
			
			
		}
		@Test
		public void searchCodigoUnique() {
			
			menuPage.clickConsultarProdutos();
				
			productQueryPage.setIdentificadorUnico(clientConfig.getUniqueIdentifier());
			productQueryPage.clickPesquisar();
			productQueryPage.addItemCarrinho();
			productQueryPage.FowardWithoutApllyDiscount();
			
			
			
			Assert.assertEquals(clientConfig.getTotalCart_SaleWithCash(), cartPage.getTotalCarrinho());
			
		}

}
