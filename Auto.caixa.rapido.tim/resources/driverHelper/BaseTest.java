package driverHelper;

import org.junit.BeforeClass;

import configs.ClientConfig;
import configs.ClientConfigFactory;
import pageObject.LoginPage;

public class BaseTest {

	private static LoginPage loginPage = new LoginPage();

	@BeforeClass
	public static void setUp() throws InterruptedException {
		DriverFactory.setContextoWebView();

		loginPage.setUsername(ClientConfigFactory.getClientConfig(DriverFactory.clientName).getUsername());
		loginPage.setPassword(ClientConfigFactory.getClientConfig(DriverFactory.clientName).getPassword());

		loginPage.hideKeyboard();
		loginPage.logar();
	}
}
