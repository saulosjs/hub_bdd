# language: pt

Funcionalidade: Pesquisar um produto pela lupa

Contexto: entrar no site
    Dado entrar na pagina principal.

	
  Cenario: Pesquisar um produto com sucesso
    Quando clicar na lupa
    E escreva o tipo ou o nome do produto
    E clicar no enter
    E clicar no produto que esta procurando
    Entao verificar se o produto esta certo
    E tirar um print
    E fechar o chome
    
  
  Cenario: Pesquisar um produto que nao existe
    Quando clicar na lupa
    E escreva um produto que nao existe
    E clicar no enter
    Entao verificar se tem o produto
    E tirar um print
    E fechar o chome
    
