package br.com.rsinet.hub_bdd.pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import br.com.rsinet.hub_tdd.leituraExcel.Constant;
import br.com.rsinet.hub_tdd.leituraExcel.ExcelUtils;

public class PageNovoUsuario {
	final WebDriver driver;

	@FindBy(how = How.NAME, using = "usernameRegisterPage")
	private WebElement usuario;

	@FindBy(how = How.NAME, using = "emailRegisterPage")
	private WebElement email;

	@FindBy(how = How.NAME, using = "passwordRegisterPage")
	private WebElement senha;

	@FindBy(how = How.NAME, using = "confirm_passwordRegisterPage")
	private WebElement confirmarSenha;

	@FindBy(how = How.NAME, using = "first_nameRegisterPage")
	private WebElement nome;

	@FindBy(how = How.NAME, using = "last_nameRegisterPage")
	private WebElement sobreNome;

	@FindBy(how = How.NAME, using = "phone_numberRegisterPage")
	private WebElement telefone;

	@FindBy(how = How.CSS, using = ".sec-view div select")
	private WebElement pais;

	@FindBy(how = How.NAME, using = "cityRegisterPage")
	private WebElement cidade;

	@FindBy(how = How.NAME, using = "addressRegisterPage")
	private WebElement endereco;

	@FindBy(how = How.NAME, using = "state_/_province_/_regionRegisterPage")
	private WebElement estado;

	@FindBy(how = How.NAME, using = "postal_codeRegisterPage")
	private WebElement codigoPostal;

	@FindBy(how = How.CSS, using = ".sec-view div input[type=checkbox]")
	private WebElement concordaCondicoes;

	@FindBy(how = How.ID, using = "register_btnundefined")
	private WebElement btoRegistrar;

	@FindBy(how = How.CSS, using = "//*[@id=\\\"formCover\\\"]/div[1]/div[2]/sec-view[1]/div/label")
	private WebElement txtFalhou;

	public PageNovoUsuario(WebDriver driver) throws Exception {
		PageFactory.initElements(driver, this);
		this.driver = driver;
		ExcelUtils.setExcelFile(Constant.Path_TestData + Constant.File_TestData, "Planilha1");
	}

	public void preencherUsuario() throws Exception {
		usuario.sendKeys(ExcelUtils.getCellData(1, 0));
	}

	public void preencherSenha() throws Exception {
		senha.sendKeys(ExcelUtils.getCellData(1, 2));
	}

	public void preencherEmai() throws Exception {
		email.sendKeys(ExcelUtils.getCellData(1, 1));
	}

	public void preencherConfirmarSenha() throws Exception {
		confirmarSenha.sendKeys(ExcelUtils.getCellData(1, 3));
	}

	public void preencherNome() throws Exception {
		nome.sendKeys(ExcelUtils.getCellData(1, 4));
	}

	public void preencherSobreNome() throws Exception {
		sobreNome.sendKeys(ExcelUtils.getCellData(1, 5));
	}

	public void preencherTelefone() throws Exception {
		telefone.sendKeys(ExcelUtils.getCellData(1, 6));
	}

	public void preencherPais() throws Exception {
		pais.sendKeys(ExcelUtils.getCellData(1, 7));
	}

	public void preencherEndereco() throws Exception {
		endereco.sendKeys(ExcelUtils.getCellData(1, 9));
	}

	public void preencherCodigoPostal() throws Exception {
		codigoPostal.sendKeys(ExcelUtils.getCellData(1, 11));
	}

	public void preencherCidade() throws Exception {
		cidade.sendKeys(ExcelUtils.getCellData(1, 8));
	}

	public void preencherEstado() throws Exception {
		estado.sendKeys(ExcelUtils.getCellData(1, 10));
	}

	public void clickConcondarCondicoes() throws Exception {
		concordaCondicoes.click();
	}

	public void clickRegistrar() {
		btoRegistrar.click();
	}

}
