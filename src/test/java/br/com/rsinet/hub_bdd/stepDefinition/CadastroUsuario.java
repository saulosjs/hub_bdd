package br.com.rsinet.hub_bdd.stepDefinition;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import br.com.rsinet.hub_bdd.pageObject.DriverFactory;
import br.com.rsinet.hub_bdd.pageObject.HomePage;
import br.com.rsinet.hub_bdd.pageObject.PageNovoUsuario;
import br.com.rsinet.hub_bdd.utilities.PrintDiretorio;
import br.com.rsinet.hub_bdd.utilities.ScreenShot;
import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.Entao;
import cucumber.api.java.pt.Quando;

public class CadastroUsuario {
	private WebDriver driver;
	private HomePage home;
	private PageNovoUsuario novaConta;
	private String expectativa;
	private String atual;
	private String expectativaFall;
	private String atualFall;
	private WebDriverWait wait;

	@Dado("^que o usuario estiver na pagina principal$")
	public void que_o_usuario_estiver_na_pagina_principal() throws Exception {
		driver = DriverFactory.AbrirSite(driver);
		home = new HomePage(driver);
		novaConta = new PageNovoUsuario(driver);
		expectativaFall = "User name already exists";
		expectativa = "https://www.advantageonlineshopping.com/#/";

	}

	@Dado("^clicar na pagina de novo usuario$")
	public void clicar_na_pagina_de_novo_usuario() {
		home.clickLogin();
		home.clickNovoUsuario();
	}

	@Quando("^escrever nome do usuario$")
	public void escrever_nome_do_usuario() throws Exception {
		novaConta.preencherUsuario();
	}

	@Quando("^escrever email$")
	public void escrever_email() throws Exception {
		novaConta.preencherEmai();
	}

	@Quando("^escrever senha$")
	public void escrever_senha() throws Exception {
		novaConta.preencherSenha();
	}

	@Quando("^escrever confirmar senha$")
	public void escrever_confirmar_senha() throws Exception {
		novaConta.preencherConfirmarSenha();
	}

	@Quando("^escrever primeiro nome$")
	public void escrever_primeiro_nome() throws Exception {
		novaConta.preencherNome();
	}

	@Quando("^escrever sobre nome$")
	public void escrever_sobre_nome() throws Exception {
		novaConta.preencherSobreNome();
	}

	@Quando("^escrever telefone$")
	public void escrever_telefone() throws Exception {
		novaConta.preencherTelefone();
	}

	@Quando("^escrever pais$")
	public void escrever_pais() throws Exception {
		novaConta.preencherPais();
	}

	@Quando("^escrever endereco$")
	public void escrever_endereco() throws Exception {
		novaConta.preencherEndereco();
	}

	@Quando("^escrever codigo postal$")
	public void escrever_codigo_postal() throws Exception {
		novaConta.preencherCodigoPostal();
	}

	@Quando("^escrever codigo cidade$")
	public void escrever_codigo_cidade() throws Exception {
		novaConta.preencherCidade();
	}

	@Quando("^escrever codigo estado$")
	public void escrever_codigo_estado() throws Exception {
		novaConta.preencherEstado();
	}

	@Quando("^aceitar as conticoes$")
	public void aceitar_as_conticoes() throws Exception {
		novaConta.clickConcondarCondicoes();
	}

	@Quando("^clicar no botao registro$")
	public void clicar_no_botao_registro() {
		novaConta.clickRegistrar();
	}

	@Entao("^verifica se criou a conta$")
	public void verifica_se_criou_a_conta() {
		wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.urlToBe(expectativa));
		atual = driver.getCurrentUrl();
		Assert.assertEquals(expectativa, atual);
	}

	@Entao("^tirar uma print$")
	public void tirar_uma_print() throws Exception {
		ScreenShot.getScreenShots(PrintDiretorio.criaConta, driver);
	}

	@Entao("^fechar o chrome$")
	public void fechar_o_chrome() {
		DriverFactory.fecharChrome(driver);
	}

	@Entao("^verifivar erro$")
	public void verifivar_erro() throws InterruptedException {
		Thread.sleep(2000);
		atualFall = driver.findElement(By.cssSelector("#registerPage .invalid")).getText();
		Assert.assertEquals(expectativaFall, atualFall);

	}

}
