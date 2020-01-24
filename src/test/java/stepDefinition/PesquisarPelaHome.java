package stepDefinition;

import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

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

	@Dado("^que o usuario abra o chrome$")
	public void que_o_usuario_abra_o_chrome() {
		driver = new ChromeDriver();
	}

	@Quando("^escrever o nome do site$")
	public void escrever_o_nome_do_site() {
		driver.get("https://www.advantageonlineshopping.com/#/");
	}

	@Entao("^entrar na pagina principal$")
	public void entrar_na_pagina_principal() {
		home = new HomePage(driver);
		produto = new PageCategoria(driver);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}

	@Dado("^que o usuario clicar em tablets$")
	public void que_o_usuario_clicar_em_tablets() {
		expectativa = "https://www.advantageonlineshopping.com/#/product/18";
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

	@Quando("^clicar na aba de preco$")
	public void clicar_na_aba_de_preco() {
		produto.clickPreco();
	}

	@Quando("^escolher o preco$")
	public void escolher_o_preco() {
		expectativa = "No results";
		acao = new Actions(driver);
		acao.dragAndDrop(produto.posPrecoEsquerda(), produto.posPrecoDireita()).perform();
	}

	@Quando("^click na aba do display$")
	public void click_na_aba_do_display() {
		produto.clickDisplay();
	}

	@Quando("^escolher o display$")
	public void escolher_o_display() {
		produto.escolherDispla();
	}

	@Entao("^aparece uma mensagem de que nao existe o produto$")
	public void aparece_uma_mensagem_de_que_nao_existe_o_produto() {
		atual = produto.getTextoResutado();
		Assert.assertEquals(expectativa, atual);
	}

}
