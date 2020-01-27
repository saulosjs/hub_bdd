package br.com.rsinet.hub_bdd.utilities;

import org.openqa.selenium.WebDriver;

import br.com.rsinet.hub_bdd.pageObject.GerenciadorDriver;
import br.com.rsinet.hub_bdd.stepDefinition.CadastroUsuario;
import cucumber.api.java.After;

public class Hooks{
	

	
	GerenciadorDriver dr;
	

	@After
	public void fechaDriver() {
		dr.fecharChrome();
		}

}
