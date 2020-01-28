package br.com.rsinet.hub_bdd.stepDefinition;

import org.junit.Assert;
import org.openqa.selenium.interactions.Actions;

import br.com.rsinet.hub_bdd.cucumber.TestContext;
import br.com.rsinet.hub_bdd.pageObject.HomePage;
import br.com.rsinet.hub_bdd.pageObject.PageCategoria;
import br.com.rsinet.hub_bdd.utilities.PrintDiretorio;
import br.com.rsinet.hub_bdd.utilities.ScreenShot;
import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.Entao;
import cucumber.api.java.pt.Quando;

public class PesquisarPelaHome {

	private HomePage home;
	private PageCategoria produto;
	private String expectativa;
	private String atual;
	private Actions acao;
	private TestContext testContext;

	public PesquisarPelaHome(TestContext context) {
		testContext = context;
		produto = testContext.getPageObjectManager().getPageCategoria();
		home = testContext.getPageObjectManager().getHomePage();
	}

	@Dado("^que o usuario entre na pagina principal$")
	public void que_o_usuario_entre_na_pagina_principal() {
		home.navigateTo_Home();

	}

	@Quando("^que o usuario clicar em tablets$")
	public void que_o_usuario_clicar_em_tablets() {
		expectativa = "http://www.advantageonlineshopping.com/#/product/18";
		home.clickTablets();
	}

	@Quando("^clicar no produto$")
	public void clicar_no_produto() throws InterruptedException {
		produto.clickHpPro608();
	}

	@Entao("^ve as informacoes do produto$")
	public void ve_as_informacoes_do_produto() {
		produto.esperarFac();
		atual = testContext.getWebDriverManager().getDriver().getCurrentUrl();
		Assert.assertEquals(expectativa, atual);
	}

	@Entao("^tirar o print$")
	public void tirar_o_print() throws Exception {
		produto.esperarFac();
		ScreenShot.getScreenShots(PrintDiretorio.pesquisaHome, testContext.getWebDriverManager().getDriver());
	}

	@Quando("^clicar na aba de preco$")
	public void clicar_na_aba_de_preco() {
		produto.clickPreco();
	}

	@Quando("^escolher o preco$")
	public void escolher_o_preco() {
		expectativa = "No results";
		acao = new Actions(testContext.getWebDriverManager().getDriver());
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
