package Tests;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import actions.ActManterProduto;
import pageObject.*;
import util.log.Log;
import driverHelper.*;
import configs.*;


public class IdentificadorUnico extends BaseTest {
	
	private POMenu menuPage = new POMenu();
	private POProductQuery productQueryPage = new POProductQuery();
	private POCart cartPage = new POCart();
	
	
	private ClientConfig clientConfig = ClientConfigFactory.getClientConfig(DriverFactory.clientName);
	
	
		@Before
	    public void PreTeste()
	    {
	        Log.createLog("searchCodeUnique",
	                      new String []{"Este teste tem como objetivo, criar um novo Lead, converter e por fim, criar uma oportunidade adicionando e removendo produtos."},
	                      new String[] {"Ambiente de teste disponível;","Usuário do teste compermissão para eecutar o fluxo."},
	                      new String[] {"Lead criado e disponível para utilização;", "Lead convertido;", "Oportunidade criada com os produtos específicos do teste."}
	                      );
	    }
		
		@After
	    public void PosTeste(){
	        Log.EncerrarTestCase();
	    }
	
		@Test
		public void searchCodeUnique() {
	
			ActManterProduto.ProductSearch("7455454545451121");
			Log.SucessoValidacao("teste de log", "searchCodeUnique");
			
			//productQueryPage.setIdentificadorUnico(clientConfig.getUniqueIdentifierInvalid());
			//productQueryPage.clickPesquisar();
			//productQueryPage.popupUniqueIdentifierInvalid();
			
			
		}
		/**
		@Test
		public void searchCodigoUnique() {
			
			menuPage.clickConsultarProdutos();
				
			productQueryPage.setIdentificadorUnico(clientConfig.getUniqueIdentifier());
			productQueryPage.clickPesquisar();
			productQueryPage.addItemCarrinho();
			productQueryPage.FowardWithoutApllyDiscount();
			
			
			
			Assert.assertEquals(clientConfig.getTotalCart_SaleWithCash(), cartPage.getTotalCarrinho());
			
			//@Test
			//public void searchCodeUnique() {
			//	ActManterProduto.ProductSearch("");
				
				//productQueryPage.setIdentificadorUnico(clientConfig.getUniqueIdentifierInvalid());
				//productQueryPage.clickPesquisar();
				//productQueryPage.popupUniqueIdentifierInvalid();
				
				
			//}
		}
		*/

}
