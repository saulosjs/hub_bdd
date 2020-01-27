package br.com.rsinet.hub_bdd.manager;

import org.openqa.selenium.WebDriver;

import br.com.rsinet.hub_bdd.pageObject.HomePage;
import br.com.rsinet.hub_bdd.pageObject.PageCategoria;
import br.com.rsinet.hub_bdd.pageObject.PageNovoUsuario;

public class PageObjectManager {
	private WebDriver driver;
	private HomePage home;
	private PageCategoria categoria;
	private PageNovoUsuario novo;

	public PageObjectManager(WebDriver driver) {
		this.driver = driver;
	}

	public HomePage getHomePage() {
		return (home == null) ? home = new HomePage(driver) : home;
	}
	
	public PageCategoria getPageCategoria() {
		return (categoria == null) ? categoria = new PageCategoria(driver) : categoria;
	}
	
	public PageNovoUsuario getPageNovoCadastro() throws Exception {
		return (novo == null) ? novo = new PageNovoUsuario(driver) : novo;
	}
}
