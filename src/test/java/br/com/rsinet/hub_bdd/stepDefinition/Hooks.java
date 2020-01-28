package br.com.rsinet.hub_bdd.stepDefinition;

import java.io.File;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import br.com.rsinet.hub_bdd.cucumber.TestContext;
import cucumber.api.Scenario;
import cucumber.api.java.After;

public class Hooks{
	
	TestContext testContext;
	
	public Hooks(TestContext context) {
		testContext = context;
	}

//	@After(order = 0)
//	public void tiraPrint(Scenario scenario) {
//		if (scenario.isFailed()) {
//			String screenshotName = scenario.getName().replaceAll(" ", "_");
//			try {
//				File sourcePath = ((TakesScreenshot) testContext.getWebDriverManager().getDriver().getScreenshotAs(OutputType.FILE));
//				
//			}
//		}
//	}

	@After(order = 1)
	public void fechaDriver() {
		testContext.getWebDriverManager().closeDriver();
	}
}
