package driverHelper;


import org.junit.BeforeClass;
import configs.ClientConfigFactory;
import pageObject.POLoginPage;
public class BaseTest {

	private static POLoginPage loginPage = new POLoginPage();

	@BeforeClass
	public static void setUp() throws InterruptedException {
		DriverFactory.setContextoWebView();

		loginPage.setUsername(ClientConfigFactory.getClientConfig(DriverFactory.clientName).getUsername());
		loginPage.setUsername(ClientConfigFactory.getClientConfig(DriverFactory.clientName).getPassword());
		
		loginPage.hideKeyboard();
		loginPage.logar();
	}
}
