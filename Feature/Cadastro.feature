# language: pt

Funcionalidade: Criar novo usuario
  
  Contexto: entrar no site
    Dado que o usuario estiver na pagina principal

    
	
  Cenario: Cadastrar nova conta
    Quando clicar na pagina de novo usuario
    E escrever nome do usuario
    E escrever email
    E escrever senha
    E escrever confirmar senha
    E escrever primeiro nome
    E escrever sobre nome
    E escrever telefone
    E escrever pais
    E escrever endereco 
    E escrever codigo postal
    E escrever codigo cidade
    E escrever codigo estado
    E aceitar as conticoes
    E clicar no botao registro
    Entao verifica se criou a conta
    E tirar uma print
    
	
	Cenario: Falhar em cadastrar nova conta
	Quando clicar na pagina de novo usuario
    E escrever nome do usuario
    E escrever email
    E escrever senha
    E escrever confirmar senha
    E escrever primeiro nome
    E escrever sobre nome
    E escrever telefone
    E escrever pais
    E escrever endereco 
    E escrever codigo postal
    E escrever codigo cidade
    E escrever codigo estado
    E aceitar as conticoes
    E clicar no botao registro
	Entao verifivar erro
	E tirar uma print