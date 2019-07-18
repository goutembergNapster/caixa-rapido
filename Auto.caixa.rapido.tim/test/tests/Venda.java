package tests;
import org.junit.Test;


import driverHelper.*;
import configs.*;
import driverHelper.BasePage;
import actions.ManterVenda;

public class Venda extends BasePage {
	private ClientConfig clientConfig = ClientConfigFactory.getClientConfig(DriverFactory.clientName);
	private ManterVenda actManterVenda = new ManterVenda(); 
	
	@Test
	public void consultarProduto() {
		
		actManterVenda.ConsultarProduto(clientConfig.getUniqueIdentifier(), true);
}
}