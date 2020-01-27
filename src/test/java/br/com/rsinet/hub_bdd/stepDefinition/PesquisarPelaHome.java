package br.com.rsinet.hub_bdd.stepDefinition;

import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

import br.com.rsinet.hub_bdd.manager.PageObjectManager;
import br.com.rsinet.hub_bdd.pageObject.GerenciadorDriver;
import br.com.rsinet.hub_bdd.pageObject.HomePage;
import br.com.rsinet.hub_bdd.pageObject.PageCategoria;
import br.com.rsinet.hub_bdd.utilities.PrintDiretorio;
import br.com.rsinet.hub_bdd.utilities.ScreenShot;
import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.Entao;
import cucumber.api.java.pt.Quando;

public class PesquisarPelaHome {
	private WebDriver driver;
	private HomePage home;
	private PageCategoria produto;
	private String expectativa;
	private String atual;
	private Actions acao;
	private GerenciadorDriver site;
	private PageObjectManager gerenciador;

	@Dado("^que o usuario entre na pagina principal$")
	public void que_o_usuario_entre_na_pagina_principal() {
		gerenciador = new PageObjectManager(driver);
		driver = site.AbrirSite();
		home = gerenciador.getHomePage();
		produto = gerenciador.getPageCategoria();
	}

	@Quando("^que o usuario clicar em tablets$")
	public void que_o_usuario_clicar_em_tablets() {
		expectativa = "https://www.advantageonlineshopping.com/#/product/18";
		home.clickTablets();
	}

	@Quando("^clicar no produto$")
	public void clicar_no_produto() throws InterruptedException {
		produto.clickHpPro608();
	}

	@Entao("^ve as informacoes do produto$")
	public void ve_as_informacoes_do_produto() {
		atual = driver.getCurrentUrl();
		Assert.assertEquals(expectativa, atual);
	}

	@Entao("^tirar o print$")
	public void tirar_o_print() throws Exception {
		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		ScreenShot.getScreenShots(PrintDiretorio.pesquisaHome, driver);
	}

	@Entao("^fechar o site$")
	public void fechar_o_site() {
//		DriverFactory.fecharChrome(driver);
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
