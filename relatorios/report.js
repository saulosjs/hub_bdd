$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("Feature/.feature");
formatter.feature({
  "name": "Criar novo usuario",
  "description": "",
  "keyword": "Funcionalidade"
});
formatter.scenario({
  "name": "Cadastrar nova conta",
  "description": "",
  "keyword": "Cenario",
  "tags": [
    {
      "name": "@First"
    }
  ]
});
formatter.step({
  "name": "usuario estar na pagina principal",
  "keyword": "Dado "
});
formatter.match({
  "location": "CadastroUsuario.usuario_estar_na_pagina_principal()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "clicar na pagina de novo usuario",
  "keyword": "Quando "
});
formatter.match({
  "location": "CadastroUsuario.clicar_na_pagina_de_novo_usuario()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "escrever nome do usuario",
  "keyword": "E "
});
formatter.match({
  "location": "CadastroUsuario.escrever_nome_do_usuario()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "escrever email",
  "keyword": "E "
});
formatter.match({
  "location": "CadastroUsuario.escrever_email()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "escrever senha",
  "keyword": "E "
});
formatter.match({
  "location": "CadastroUsuario.escrever_senha()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "escrever confirmar senha",
  "keyword": "E "
});
formatter.match({
  "location": "CadastroUsuario.escrever_confirmar_senha()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "escrever primeiro nome",
  "keyword": "E "
});
formatter.match({
  "location": "CadastroUsuario.escrever_primeiro_nome()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "escrever sobre nome",
  "keyword": "E "
});
formatter.match({
  "location": "CadastroUsuario.escrever_sobre_nome()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "escrever telefone",
  "keyword": "E "
});
formatter.match({
  "location": "CadastroUsuario.escrever_telefone()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "escrever pais",
  "keyword": "E "
});
formatter.match({
  "location": "CadastroUsuario.escrever_pais()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "escrever endereco",
  "keyword": "E "
});
formatter.match({
  "location": "CadastroUsuario.escrever_endereco()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "escrever codigo postal",
  "keyword": "E "
});
formatter.match({
  "location": "CadastroUsuario.escrever_codigo_postal()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "escrever codigo cidade",
  "keyword": "E "
});
formatter.match({
  "location": "CadastroUsuario.escrever_codigo_cidade()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "escrever codigo estado",
  "keyword": "E "
});
formatter.match({
  "location": "CadastroUsuario.escrever_codigo_estado()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "aceitar as conticoes",
  "keyword": "E "
});
formatter.match({
  "location": "CadastroUsuario.aceitar_as_conticoes()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "clicar no botao registro",
  "keyword": "E "
});
formatter.match({
  "location": "CadastroUsuario.clicar_no_botao_registro()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "verifica se criou a conta",
  "keyword": "Entao "
});
formatter.match({
  "location": "CadastroUsuario.verifica_se_criou_a_conta()"
});
formatter.result({
  "error_message": "org.openqa.selenium.WebDriverException: chrome not reachable\n  (Session info: chrome\u003d79.0.3945.117)\nBuild info: version: \u00273.141.59\u0027, revision: \u0027e82be7d358\u0027, time: \u00272018-11-14T08:17:03\u0027\nSystem info: host: \u0027RSI1526\u0027, ip: \u002710.1.0.40\u0027, os.name: \u0027Windows 10\u0027, os.arch: \u0027amd64\u0027, os.version: \u002710.0\u0027, java.version: \u00271.8.0_171\u0027\nDriver info: org.openqa.selenium.chrome.ChromeDriver\nCapabilities {acceptInsecureCerts: false, browserName: chrome, browserVersion: 79.0.3945.117, chrome: {chromedriverVersion: 78.0.3904.105 (60e2d8774a81..., userDataDir: C:\\Users\\SAULO~1.SIL\\AppDat...}, goog:chromeOptions: {debuggerAddress: localhost:56156}, javascriptEnabled: true, networkConnectionEnabled: false, pageLoadStrategy: normal, platform: XP, platformName: XP, proxy: Proxy(), setWindowRect: true, strictFileInteractability: false, timeouts: {implicit: 0, pageLoad: 300000, script: 30000}, unhandledPromptBehavior: dismiss and notify}\nSession ID: 16bc3e2a4f46dc593071d1cd8761e239\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance(NativeConstructorAccessorImpl.java:62)\r\n\tat sun.reflect.DelegatingConstructorAccessorImpl.newInstance(DelegatingConstructorAccessorImpl.java:45)\r\n\tat java.lang.reflect.Constructor.newInstance(Constructor.java:423)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.createException(W3CHttpResponseCodec.java:187)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:122)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:49)\r\n\tat org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:158)\r\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.execute(DriverCommandExecutor.java:83)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:552)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:609)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.getCurrentUrl(RemoteWebDriver.java:287)\r\n\tat org.openqa.selenium.support.ui.ExpectedConditions$3.apply(ExpectedConditions.java:109)\r\n\tat org.openqa.selenium.support.ui.ExpectedConditions$3.apply(ExpectedConditions.java:104)\r\n\tat org.openqa.selenium.support.ui.FluentWait.until(FluentWait.java:249)\r\n\tat stepDefinition.CadastroUsuario.verifica_se_criou_a_conta(CadastroUsuario.java:120)\r\n\tat ✽.verifica se criou a conta(Feature/.feature:23)\r\n",
  "status": "failed"
});
formatter.step({
  "name": "tirar uma print",
  "keyword": "E "
});
formatter.match({
  "location": "CadastroUsuario.tirar_uma_print()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "fechar o chrome",
  "keyword": "E "
});
formatter.match({
  "location": "CadastroUsuario.fechar_o_chrome()"
});
formatter.result({
  "status": "skipped"
});
formatter.scenario({
  "name": "Falhar em cadastrar nova conta",
  "description": "",
  "keyword": "Cenario",
  "tags": [
    {
      "name": "@Second"
    }
  ]
});
formatter.step({
  "name": "usuario estar na pagina principal",
  "keyword": "Dado "
});
