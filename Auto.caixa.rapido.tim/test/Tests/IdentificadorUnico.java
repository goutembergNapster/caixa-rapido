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
		@After
	    public void PosTeste(){
	        Log.EncerrarTestCase();
	    }
		@Test
		public void searchCodeUnique() {
			ActManterProduto.ProductSearch(timClienteConfig.getUniqueIdentifier());
			Log.SucessoValidacao("teste de log", "searchCodeUnique");
			Assert.fail();		
		}
		@Test
		public void searchCodeUniqueInvalid() {
			ActManterProduto.ProductSearch(timClienteConfig.getUniqueIdentifierInvalid());
			Log.SucessoValidacao("teste log", "searchCodeUniqueInvalid");
		}
		@Test
		public void searchDescription() {
			ActManterProduto.ProductSearch(timClienteConfig.getDescriptionProductSaleWithCash());
			Log.SucessoValidacao("Test log", "searchDescription");
			Assert.fail();
		}
		@Test
		public void searchCode() {
			ActManterProduto.ProductSearch(timClienteConfig.getUniqueIdentifier());
			Log.SucessoValidacao("Test de Log", "searchCode");	
		}		
}
