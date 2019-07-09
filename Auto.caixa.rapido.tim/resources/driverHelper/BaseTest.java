package driverHelper;


import org.junit.BeforeClass;
import configs.ClientConfigFactory;
import pageObject.POLogin;
public class BaseTest {

	private static POLogin loginPage = new POLogin();

	@BeforeClass
	public static void setUp() throws InterruptedException {
		DriverFactory.setContextoWebView();

		loginPage.setUsername(ClientConfigFactory.getClientConfig(DriverFactory.clientName).getUsername());
		loginPage.setUsername(ClientConfigFactory.getClientConfig(DriverFactory.clientName).getPassword());
		
		loginPage.hideKeyboard();
		loginPage.logar();
	}
}
