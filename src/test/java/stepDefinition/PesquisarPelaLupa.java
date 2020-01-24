package stepDefinition;

import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

import br.com.rsinet.hub_bdd.pageObject.HomePage;
import br.com.rsinet.hub_bdd.pageObject.PageCategoria;
import br.com.rsinet.hub_bdd.pageObject.PageNovoUsuario;
import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.Entao;
import cucumber.api.java.pt.Quando;

public class PesquisarPelaLupa {

	private ChromeDriver driver;
	private HomePage home;
	private PageNovoUsuario novaConta;
	private PageCategoria produto;
	private String expectativa;
	private String atual;

	@Dado("^que o usuario abra o chrome\\.$")
	public void que_o_usuario_abra_o_chrome() {
		driver = new ChromeDriver();
	}

	@Quando("^escrever o nome do site\\.$")
	public void escrever_o_nome_do_site() {
		driver.get("https://www.advantageonlineshopping.com/#/");
	}

	@Entao("^entrar na pagina principal\\.$")
	public void entrar_na_pagina_principal() {
		expectativa = "https://www.advantageonlineshopping.com/#/product/8?viewAll=laptops";
		home = PageFactory.initElements(driver, HomePage.class);
		novaConta = PageFactory.initElements(driver, PageNovoUsuario.class);
		produto = PageFactory.initElements(driver, PageCategoria.class);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}

	@Quando("^clicar na lupa$")
	public void eclicar_na_lupa() {
		home.clickLupa();
	}

	@Quando("^escreva o tipo ou o nome do produto$")
	public void escreva_o_tipo_ou_o_nome_do_produto() {
		home.escreverNaLupa();
	}

	@Quando("^escreva um produto que nao existe$")
	public void escreva_um_produto_que_nao_existe() {
		expectativa = "No results for \"apple\"";
		home.escrevendoProduto();
	}

	@Quando("^clicar no enter$")
	public void clicar_no_enter() {
		home.enterNaPesquisa();
	}

	@Quando("^clicar no produto que esta procurando$")
	public void clicar_no_produto_que_esta_procurando() throws InterruptedException {
		produto.clickProduto();
	}

	@Entao("^verificar se o produto esta certo$")
	public void verificar_se_o_produto_esta_certo() {
		atual = driver.getCurrentUrl();
		Assert.assertEquals(expectativa, atual);
	}

	@Entao("^verificar se tem o produto$")
	public void verificar_se_o_tem_um_produto() {
		atual = produto.textoResultado();
		Assert.assertEquals(expectativa, atual);
	}

	@Entao("^tirar um print$")
	public void tirar_um_print() {
		System.out.println("print");
	}

	@Entao("^fechar o chome$")
	public void fechar_o_chome() {
		driver.close();
	}

}
