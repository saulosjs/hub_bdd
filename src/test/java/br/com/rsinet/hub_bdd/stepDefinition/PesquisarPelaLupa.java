package br.com.rsinet.hub_bdd.stepDefinition;

import org.junit.Assert;

import br.com.rsinet.hub_bdd.cucumber.TestContext;
import br.com.rsinet.hub_bdd.pageObject.HomePage;
import br.com.rsinet.hub_bdd.pageObject.PageCategoria;
import br.com.rsinet.hub_bdd.utilities.PrintDiretorio;
import br.com.rsinet.hub_bdd.utilities.ScreenShot;
import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.Entao;
import cucumber.api.java.pt.Quando;

public class PesquisarPelaLupa {

	private HomePage home;
	private PageCategoria produto;
	private String expectativa;
	private String atual;
	private TestContext testContext;
	
	public PesquisarPelaLupa(TestContext contxt) {
		testContext = contxt;
		home = testContext.getPageObjectManager().getHomePage();
		produto = testContext.getPageObjectManager().getPageCategoria();
		
	}
	

	@Dado("^entrar na pagina principal\\.$")
	public void entrar_na_pagina_principal() {
		home.navigateTo_Home();
		expectativa = "http://www.advantageonlineshopping.com/#/product/8?viewAll=laptops";
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
		atual = testContext.getWebDriverManager().getDriver().getCurrentUrl();
		Assert.assertEquals(expectativa, atual);
	}

	@Entao("^verificar se tem o produto$")
	public void verificar_se_o_tem_um_produto() {
		atual = produto.textoResultado();
		Assert.assertEquals(expectativa, atual);
	}

	@Entao("^tirar um print$")
	public void tirar_um_print() throws Exception {
		produto.esperarFac();
		ScreenShot.getScreenShots(PrintDiretorio.pesquisaLupa, testContext.getWebDriverManager().getDriver());
	}

	

}
