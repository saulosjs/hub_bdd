package br.com.rsinet.hub_bdd.pageObject;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

public class GerenciadorDriver {
	WebDriver driver;
	public GerenciadorDriver(WebDriver driver) {
		PageFactory.initElements(driver, this);
		this.driver = driver;
	}


	public WebDriver AbrirSite() {
		driver = new ChromeDriver();
		driver.get("https://www.advantageonlineshopping.com/#/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		return driver;
	}

	public void fecharChrome() {
		if (driver != null)
			driver.close();
	}

	
	
}
