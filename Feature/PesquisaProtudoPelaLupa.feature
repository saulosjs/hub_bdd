# language: pt


Funcionalidade: Pesquisar um produto pela lupa

Contexto: entrar no site
    Dado que o usuario abra o chrome.
    Quando escrever o nome do site.
    Entao entrar na pagina principal.

	@First
  Cenario: Pesquisar um produto com sucesso
    Dado clicar na lupa
    Quando escreva o tipo ou o nome do produto
    E clicar no enter
    E clicar no produto que esta procurando
    Entao verificar se o produto esta certo
    E tirar um print
    E fechar o chome
    
   @Second
  Cenario: Pesquisar um produto que nao existe
    Dado clicar na lupa
    Quando escreva um produto que nao existe
    E clicar no enter
    Entao verificar se tem o produto
    E tirar um print
    E fechar o chome
    
