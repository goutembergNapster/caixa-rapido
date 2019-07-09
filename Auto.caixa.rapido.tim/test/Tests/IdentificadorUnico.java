package Tests;

import org.junit.Assert;
import org.junit.Test;
import pageObject.*;
import driverHelper.*;
import configs.*;


public class IdentificadorUnico extends BaseTest {
	
	private POMenu menuPage = new POMenu();
	private POProductQuery productQueryPage = new POProductQuery();
	private POCart cartPage = new POCart();
	
	
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
