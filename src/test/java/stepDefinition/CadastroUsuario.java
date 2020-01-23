package stepDefinition;

import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import br.com.rsinet.hub_bdd.pageObject.HomePage;
import br.com.rsinet.hub_bdd.pageObject.PageNovoUsuario;
import br.com.rsinet.hub_tdd.utilities.RobotPrint;
import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.Entao;
import cucumber.api.java.pt.Quando;

public class CadastroUsuario {
	private ChromeDriver driver;
	private HomePage home;
	private PageNovoUsuario novaConta;
	private String expectativa;
	private String atual;
	private String expectativaFall;
	private String atualFall;
	private WebDriverWait wait;

	@Dado("^usuario estar na pagina principal$")
	public void usuario_estar_na_pagina_principal() throws Exception {
		driver = new ChromeDriver();
		driver.get("https://www.advantageonlineshopping.com/#/");
		home = PageFactory.initElements(driver, HomePage.class);
		novaConta = PageFactory.initElements(driver, PageNovoUsuario.class);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		expectativa = driver.getCurrentUrl();
		expectativaFall = "User name already exists";
	}

	@Quando("^clicar na pagina de novo usuario$")
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
	public void tirar_uma_print() {
		RobotPrint.pegarTela();
	}

	@Entao("^fechar o chrome$")
	public void fechar_o_chrome() {
		driver.close();
	}

	@Entao("^verifivar erro$")
	public void verifivar_erro() throws InterruptedException {
		Thread.sleep(2000);
		atualFall = driver.findElement(By.cssSelector("#registerPage .invalid")).getText();
		Assert.assertEquals(expectativaFall, atualFall);
		RobotPrint.pegarTela();
	}

}
