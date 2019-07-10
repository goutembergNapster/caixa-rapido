package driverHelper;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.remote.DesiredCapabilities;

import configs.ClientName;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;

public class DriverFactory {

	public static AndroidDriver<MobileElement> driver;
	public static ClientName clientName = ClientName.TIM;

	public static AndroidDriver<MobileElement> getDriver() {
		if (driver == null) {
			createDriver();
		}

		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		return driver;
	}

	public static void reset() {
		if (driver != null) {
			driver.resetApp();
		}
	}

	public static void killDriver() {
		if (driver != null) {
			driver.quit();
			driver = null;
		}
	}

	public static void setContextoAppNative() {
		Set<String> contextNames = DriverFactory.getDriver().getContextHandles();
		DriverFactory.getDriver().context((String) contextNames.toArray()[0]);
	}

	public static void setContextoWebView() {
		Set<String> contextNames = DriverFactory.getDriver().getContextHandles();
		DriverFactory.getDriver().context((String) contextNames.toArray()[1]);
	}

	private static  void createDriver() {
		DesiredCapabilities capabilities = new DesiredCapabilities();
		capabilities.setCapability("platformName", "Android");
		capabilities.setCapability("deviceName", "3300195820c44503");
		capabilities.setCapability("automationName", "UiAutomator2");
		capabilities.setCapability("appPackage", "br.com.linx.bigretail.CaixaRapido");
		capabilities.setCapability("appActivity", "br.com.linx.bigretail.CaixaRapido.MainActivity");
		capabilities.setCapability("autoGrantPermissions", "true");
		capabilities.setCapability("newCommandTimeout", "60");
		capabilities.setCapability("skipDeviceInitialization", "true");
		capabilities.setCapability("ignoreUnimportantViews", "true");

		try {
			driver = new AndroidDriver<MobileElement>(new URL("http://localhost:4723/wd/hub"), capabilities);
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}
	}

}