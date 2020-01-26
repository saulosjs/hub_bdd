package br.com.rsinet.hub_tdd.utilities;

import cucumber.api.java.After;

public class Hooks {

	@After
	public void fechaDriver() {
		System.out.println("foi");
	}

}
