package br.com.rsinet.hub_bdd.dataProfider;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

import br.com.rsinet.hub_bdd.enums.DriverType;
import br.com.rsinet.hub_bdd.enums.EnvironmentType;

public class ConfigFileReader {
	private Properties propriedades;
	private final String propertyFilePath = "configs//Configuration.properties";

	public ConfigFileReader() {
		BufferedReader ler;
		try {
			ler = new BufferedReader(new FileReader(propertyFilePath));
			propriedades = new Properties();
			try {
				propriedades.load(ler);
				ler.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
			throw new RuntimeException("Configuration.properties não encontrado " + propertyFilePath);
		}
	}

	public String getDriverPath() {
		String driverPath = propriedades.getProperty("driverPath");
		if (driverPath != null)
			return driverPath;
		else
			throw new RuntimeException("driverPath não especificado no arquivo Configuration.properties");
	}

	public long getImplicitlyWait() {
		String implicitlyWait = propriedades.getProperty("implicitlyWait");
		if (implicitlyWait != null)
			return Long.parseLong(implicitlyWait);
		else
			throw new RuntimeException("implicitlyWait não especificado no arquivo Configuration.properties");
	}

	public String getApplicationUrl() {
		String url = propriedades.getProperty("url");
		if (url != null)
			return url;
		else
			throw new RuntimeException("url não especificada no arquivo Configuration.properties");
	}

	public EnvironmentType getEnvironment() {
		String environmrntName = propriedades.getProperty("environment");
		if (environmrntName == null || environmrntName.equalsIgnoreCase("local"))
			return EnvironmentType.LOCAL;
		else if (environmrntName.equals("remote"))
			return EnvironmentType.REMOTE;
		else
			throw new RuntimeException("Environmrnt tipo não encontrato " + environmrntName);
	}

	public Boolean getBrowserWindowSize() {
		String windowSize = propriedades.getProperty("windowMaximize");
		if (windowSize != null)
			return Boolean.valueOf(windowSize);
		return true;
	}

	public DriverType getBrowser() {
		String browserName = propriedades.getProperty("browser");
		if (browserName == null || browserName.equals("chrome")) return DriverType.CHROME;
		else throw new RuntimeException(
					"Browser nome do valor da chave em Configuration.properties naõ existe : " + browserName);
	}

	public String getTestDataRessourcePath() {
		String testDataPath = propriedades.getProperty("testDataResourcePath");
		if(testDataPath!=null) return testDataPath;
		else throw new RuntimeException("Test data nao encontrado");
	}
	
}
