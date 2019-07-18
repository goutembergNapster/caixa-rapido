package tests;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import actions.ManterProduto;
import pageObject.*;
import util.log.Log;
import driverHelper.*;
import configs.*;


public class IdentificadorUnico extends BaseTest {
	
	private PageMenu menuPage = new PageMenu();
	private PageProductQuery productQueryPage = new PageProductQuery();
	private PageCart cartPage = new PageCart();
	private TimClientConfig timClienteConfig = new TimClientConfig();
	
	
	private ClientConfig clientConfig = ClientConfigFactory.getClientConfig(DriverFactory.clientName);
	
	
		@Before
	    public void PreTeste()
	    {
	        Log.createLog("searchCodeUnique",
	                      new String []{"Este teste tem como objetivo, criar um novo Lead, converter e por fim, criar uma oportunidade adicionando e removendo produtos."},
	                      new String[] {"Ambiente de teste dispon�vel;","Usu�rio do teste compermiss�o para eecutar o fluxo."},
	                      new String[] {"Lead criado e dispon�vel para utiliza��o;", "Lead convertido;", "Oportunidade criada com os produtos espec�ficos do teste."}
	                      );
	    }
}
	    /*
		@After
   public void PosTeste(){
	        Log.EncerrarTestCase();
	    }
		@Test
		public void searchCodeUnique() {
			ManterProduto.ProductSearch(timClienteConfig.getUniqueIdentifier());
			Log.SucessoValidacao("teste de log", "searchCodeUnique");
			Assert.fail();		
		}
		@Test
		public void searchCodeUniqueInvalid() {
			ManterProduto.(timClienteConfig.getUniqueIdentifierInvalid());
			Log.SucessoValidacao("teste log", "searchCodeUniqueInvalid");
		}
		@Test
		public void searchDescription() {
			ManterProduto.ProductSearch(timClienteConfig.getDescriptionProductSaleWithCash());
			Log.SucessoValidacao("Test log", "searchDescription");
			Assert.fail();
		}
		@Test
		public void searchCode() {
			ManterProduto.ProductSearch(timClienteConfig.getUniqueIdentifier());
			Log.SucessoValidacao("Test de Log", "searchCode");	
		}		
}
*/
