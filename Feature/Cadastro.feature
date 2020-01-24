# language: pt

Funcionalidade: Criar novo usuario
  
  Contexto: entrar no site
    Dado que o usuario abra o chrome!
    Quando escrever o nome do site!
    Entao entrar na pagina principal!
    
	@First
  Cenario: Cadastrar nova conta
    Dado clicar na pagina de novo usuario
    Quando escrever nome do usuario
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
    E fechar o chrome
    
	@Second
	Cenario: Falhar em cadastrar nova conta
	Dado clicar na pagina de novo usuario
    Quando escrever nome do usuario
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
	E fechar o chrome