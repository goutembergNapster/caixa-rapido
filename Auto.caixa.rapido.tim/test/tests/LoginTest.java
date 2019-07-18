package tests;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.AfterClass;
import org.junit.Before;
import org.junit.Test;

import configs.*;
import driverHelper.*;
import mensagens.MensagensDeAcesso;
import pageObject.*;
import util.DadosDeAcesso;

public class LoginTest {
	

	private PageLogin loginPage = new PageLogin();
	private PageMenu menuPage = new PageMenu();
	private ClientConfig clientConfig = ClientConfigFactory.getClientConfig(DriverFactory.clientName);

	@Before
	public void setUp() {
		DriverFactory.setContextoWebView();
	}

	@Test
	public void validateLogin() {
		loginPage.setUsername(clientConfig.getUsername());
		loginPage.setPassword(clientConfig.getPassword());
		loginPage.hideKeyboard();
		loginPage.logar();

		assertTrue(loginPage.validateLogin());
		menuPage.clickLogout();
	}

	@Test
	public void validateLoginWithoutAnyInformation() {
		loginPage.clearFields();
		loginPage.waiting(1000);
		assertTrue(loginPage.btnEntrarUnavailable());
	}
	
	//MOB-151
	@Test
	public void validateLoginWithoutUsername() {
		loginPage.setPassword(clientConfig.getPassword());
		assertTrue(loginPage.btnEntrarUnavailable());
	}

	@Test
	public void validateLoginWithoutPassword() {
		loginPage.setUsername(clientConfig.getUsername());
		assertTrue(loginPage.btnEntrarUnavailable());
	}

	@Test
	public void valideteLoginAndLogout() {
		loginPage.setUsername(clientConfig.getUsername());
		loginPage.setPassword(clientConfig.getPassword());
		loginPage.hideKeyboard();
		loginPage.logar();
		menuPage.clickLogout();
		assertEquals(MensagensDeAcesso.TEXT_VERIFY_LOGOUT, menuPage.getMessage_VefifyLogout());
	}

	@Test
	public void validateLoginWithUsernameWrong() {
		loginPage.setUsername(DadosDeAcesso.USERNAMEWRONG);
		loginPage.setPassword(clientConfig.getPassword());
		loginPage.hideKeyboard();
		loginPage.logar();

		assertEquals(MensagensDeAcesso.MESSAGE_LOGINWITH_USERNAMEWRONG, loginPage.validateMessageWithError());
		loginPage.clickOkPopupError();
	}

	@Test
	public void validateLoginWithPasswordWrong() {
		loginPage.setUsername(clientConfig.getUsername());
		loginPage.setPassword(DadosDeAcesso.PASSWORDWRONG);
		loginPage.hideKeyboard();
		loginPage.logar();

		assertEquals(MensagensDeAcesso.MESSAGE_LOGINWITH_PASSWORDWRONG, loginPage.validateMessageWithError());
		loginPage.clickOkPopupError();
	}

	// @After
	// public void tearDown() {
	// DriverFactory.setContextoAppNative();
	// DriverFactory.getDriver().resetApp();
	// }

	@AfterClass
	public static void down() {
		DriverFactory.killDriver();
	}

}
