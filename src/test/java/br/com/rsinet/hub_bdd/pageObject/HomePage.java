package br.com.rsinet.hub_bdd.pageObject;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class HomePage {
	final WebDriver driver;

	@FindBy(how = How.ID, using = "menuUser")
	private WebElement btoEntraNaConta;

	@FindBy(how = How.XPATH, using = "/html/body/login-modal/div/div/div[3]/a[2]")
	private WebElement btoNovoUsuario;

	public HomePage(WebDriver driver) {
		this.driver = driver;
	}

	public void clickLogin() {
		btoEntraNaConta.click();
	}

	public void clickNovoUsuario() {
		WebElement element = btoNovoUsuario;
		JavascriptExecutor executor = (JavascriptExecutor) driver;
		executor.executeScript("arguments[0].click();", element);
	}
}
