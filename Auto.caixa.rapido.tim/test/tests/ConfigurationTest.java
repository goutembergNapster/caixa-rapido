package tests;

import static org.junit.Assert.assertEquals;
import org.junit.Before;
import org.junit.Test;
import configs.*;
import driverHelper.*;
import mensagens.MensagensDeAcesso;
import pageObject.*;



public class ConfigurationTest extends BasePage {
	
	private PageConfiguration configPage = new PageConfiguration();
	private PageMenu pomenuPage = new PageMenu();
	private ClientConfig clientConfig = ClientConfigFactory.getClientConfig(DriverFactory.clientName);

	@Before
	public void setUp() {
		DriverFactory.setContextoWebView();
	}

	@Test
	public void configurationTest() {
		configPage.waiting(1000);
		configPage.clickConfigBtn();
		configPage.setHostname(clientConfig.getHostname());
		configPage.setPort(clientConfig.getPort());
		configPage.clickCarregar();
		configPage.clickOkPopUp();
		configPage.clickFechar();

		assertEquals(MensagensDeAcesso.TEXT_VERIFY_LOGOUT, pomenuPage.getMessage_VefifyLogout());
	}

}
