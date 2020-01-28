package br.com.rsinet.hub_bdd.pageObject;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	final WebDriver driver;

	@FindBy(how = How.ID, using = "menuUser")
	private WebElement btoEntraNaConta;

	@FindBy(how = How.XPATH, using = "/html/body/login-modal/div/div/div[3]/a[2]")
	private WebElement btoNovoUsuario;

	@FindBy(how = How.ID, using = "menuSearch")
	private WebElement lupa;

	@FindBy(how = How.ID, using = "autoComplete")
	private WebElement campoTexto;

	@FindBy(how = How.ID, using = "tabletsImg")
	private WebElement tablets;

	public HomePage(WebDriver driver) {
		PageFactory.initElements(driver, this);
		this.driver = driver;
	}

	public void clickLupa() {
		lupa.click();
	}

	public void clickLogin() {
		btoEntraNaConta.click();
	}

	public void escreverNaLupa() {
		campoTexto.sendKeys("laptops");
	}

	public void escrevendoProduto() {
		campoTexto.sendKeys("apple");
	}

	public void enterNaPesquisa() {
		campoTexto.sendKeys(Keys.ENTER);
	}

	public void clickNovoUsuario() {
		WebElement element = btoNovoUsuario;
		JavascriptExecutor executor = (JavascriptExecutor) driver;
		executor.executeScript("arguments[0].click();", element);
	}

	public void clickTablets() {
		WebElement element = tablets;
		JavascriptExecutor executor = (JavascriptExecutor) driver;
		executor.executeScript("arguments[0].click();", element);
		
	}

	public void navigateTo_Home() {
		driver.get("http://www.advantageonlineshopping.com/#/");
	}
}
