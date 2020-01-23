package br.com.rsinet.hub_bdd.pageObject;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.WebDriverWait;

public class PageCategoria {
	final WebDriver driver;
	private WebDriverWait wait;

	@FindBy(how = How.LINK_TEXT, using = "HP ZBook 17 G2 Mobile Workstation")
	private WebElement hpZBoo17k;

	@FindBy(how = How.XPATH, using = "//*[@id=\"searchPage\"]/div[3]/div/label/span")
	private WebElement mensagemSemResultados;

	@FindBy(how = How.XPATH, using = "//*[@id=\"slider\"]/div/div[2]/div")
	private WebElement precoDireita;

	@FindBy(how = How.XPATH, using = "//*[@id=\"slider\"]/div/div[1]/div")
	private WebElement precoEsquerda;

	@FindBy(how = How.ID, using = "18")
	private WebElement hpPro608;

	@FindBy(how = How.ID, using = "accordionAttrib0")
	private WebElement display;

	@FindBy(how = How.ID, using = "display_0")
	private WebElement wxga;

	@FindBy(how = How.ID, using = "accordionPrice")
	private WebElement preco;

	public PageCategoria(WebDriver driver) {
		this.driver = driver;
	}

	public void clickProduto() {
		WebElement element = hpZBoo17k;
		JavascriptExecutor executor = (JavascriptExecutor) driver;
		executor.executeScript("arguments[0].click();", element);
	}

	public String textoResultado() {
		return mensagemSemResultados.getText();
	}

	public void clickHpPro608() {
		WebElement element = hpPro608;
		JavascriptExecutor executor = (JavascriptExecutor) driver;
		executor.executeScript("arguments[0].click();", element);
	}

	public WebElement posPrecoDireita() {
		return precoDireita;
	}

	public WebElement posPrecoEsquerda() {

		return precoEsquerda;
	}

	public void clickDisplay() {
		display.click();
	}

	public void escolherDispla() {
		wxga.click();
	}

	public void clickPreco() {
		preco.click();
	}

}
