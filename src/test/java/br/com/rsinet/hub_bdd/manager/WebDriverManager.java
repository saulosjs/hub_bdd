package br.com.rsinet.hub_bdd.manager;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import br.com.rsinet.hub_bdd.enums.DriverType;
import br.com.rsinet.hub_bdd.enums.EnvironmentType;

public class WebDriverManager {
	private WebDriver driver;
	private static EnvironmentType enviromenmtType;
	private static DriverType driverType;
	private static final String CHROME_DRIVER_PROPERTY = "webdriver.chrome.driver";

	public WebDriverManager() {
		driverType = FileReaderManager.getInstance().getConfigReader().getBrowser();
		enviromenmtType = FileReaderManager.getInstance().getConfigReader().getEnvironment();
	}

	public WebDriver getDriver() {
		if (driver == null) {
			driver = criarDriver();
		}
		return driver;
	}

	private WebDriver criarDriver() {
		switch (enviromenmtType) {
		case LOCAL:
			driver = createLocalDriver();
			break;
		case REMOTE:
			driver = createRemoteDriver();
			break;
		}
		return driver;
	}
	private WebDriver createRemoteDriver() {
		throw new RuntimeException("RemoteWebDriver não esta implementado");
	}

	private WebDriver createLocalDriver() {
		switch (driverType) {
		case CHROME:
			System.setProperty(CHROME_DRIVER_PROPERTY,
					FileReaderManager.getInstance().getConfigReader().getDriverPath());
			driver = new ChromeDriver();
			break;
		}
		if(FileReaderManager.getInstance().getConfigReader().getBrowserWindowSize())driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(FileReaderManager.getInstance().getConfigReader().getImplicitlyWait(), TimeUnit.SECONDS);
		return driver;
	}
	
	public void closeDriver() {
		driver.close();
		
	}
}
