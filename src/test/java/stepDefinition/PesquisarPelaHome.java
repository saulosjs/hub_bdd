package stepDefinition;

import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;

import br.com.rsinet.hub_bdd.pageObject.HomePage;
import br.com.rsinet.hub_bdd.pageObject.PageCategoria;
import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.Entao;
import cucumber.api.java.pt.Quando;

public class PesquisarPelaHome {
	private ChromeDriver driver;
	private HomePage home;
	private PageCategoria produto;
	private String expectativa;
	private String atual;
	private Actions acao;

	@Dado("^que o usuario estiver na home$")
	public void que_o_usuario_estiver_na_home() {
		expectativa = "https://www.advantageonlineshopping.com/#/product/18";
		driver = new ChromeDriver();
		driver.get("https://www.advantageonlineshopping.com/#/");
		home = PageFactory.initElements(driver, HomePage.class);
		produto = PageFactory.initElements(driver, PageCategoria.class);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

	}

	@Quando("^clicar em tablets$")
	public void clicar_em_tablets() {
		home.clickTablets();
	}

	@Quando("^clicar no produto$")
	public void clicar_no_produto() {
		produto.clickHpPro608();
	}

	@Entao("^ve as informacoes do produto$")
	public void ve_as_informacoes_do_produto() {
		atual = driver.getCurrentUrl();
		Assert.assertEquals(expectativa, atual);
	}

	@Entao("^tirar o print$")
	public void tirar_o_print() {
		System.out.println("print");
	}

	@Entao("^fechar o site$")
	public void fechar_o_site() {
		driver.quit();
	}

	@Quando("^click o preco$")
	public void click_o_preco() {
		produto.clickPreco();
	}

	@Quando("^escolher o preco$")
	public void escolher_o_preco() {
		acao = new Actions(driver);
		acao.dragAndDrop(produto.posPrecoEsquerda(), produto.posPrecoDireita()).perform();
	}

	@Quando("^click o display$")
	public void click_o_display() {
		produto.clickDisplay();
	}

	@Quando("^escolher o display$")
	public void escolher_o_display() {
		produto.escolherDispla();
	}

	@Entao("^ve que nao tem o produto$")
	public void ve_que_nao_tem_o_produto() {
		System.out.println("foi");
	}

}
