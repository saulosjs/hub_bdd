package br.com.rsinet.hub_tdd.utilities;

import cucumber.api.java.Before;

public class Hooks {

	@Before("@First")
	public void primeiroCenario() {
		System.out.println("Test criar uma conta nova");
	}

	@Before("@Second")
	public void cenarioFalha() {
		System.out.println("Falhando em fazer uma nova conta");
	}

}
