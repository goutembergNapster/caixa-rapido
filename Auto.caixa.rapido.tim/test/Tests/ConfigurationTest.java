package Tests;

import static org.junit.Assert.assertEquals;
import org.junit.Before;
import org.junit.Test;
import configs.*;
import driverHelper.*;
import pageObject.*;



public class ConfigurationTest extends BasePage {
	
	private ConfigurationPage configPage = new ConfigurationPage();
	private POMenuPage pomenuPage = new POMenuPage();
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

		assertEquals(DadosDeAcesso.TEXT_VERIFY_LOGOUT, pomenuPage.getMessage_VefifyLogout());
	}

}
