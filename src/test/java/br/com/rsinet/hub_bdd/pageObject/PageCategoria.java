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

	@FindBy(how = How.XPATH, using = "/html/body/div[3]/section/article/div[3]/div/div/div[1]/div/ul/li[1]/div/div/div/div[2]/div")
	private WebElement precoDireita;

	@FindBy(how = How.ID, using = "18")
	private WebElement hpPro608;

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
		hpPro608.click();
	}

}
