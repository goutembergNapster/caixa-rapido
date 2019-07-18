package driverHelper;


import org.junit.BeforeClass;
import configs.ClientConfigFactory;
import pageObject.PageLogin;
public class BaseTest {

	private static PageLogin loginPage = new PageLogin();

	@BeforeClass
	public static void setUp() throws InterruptedException {
		DriverFactory.setContextoWebView();

		loginPage.setUsername(ClientConfigFactory.getClientConfig(DriverFactory.clientName).getUsername());
		loginPage.setPassword(ClientConfigFactory.getClientConfig(DriverFactory.clientName).getPassword());
		
		loginPage.hideKeyboard();
		loginPage.logar();
	}
}
