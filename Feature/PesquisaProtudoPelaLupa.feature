# language: pt


Funcionalidade: Pesquisar um produto pela lupa

	@First
  Cenario: Pesquisar um produto com sucesso
    Dado que o usuario estiver na pagina principal
    Quando clicar na lupa
    E escreva o tipo ou o nome do produto
    E clicar no enter
    E clicar no produto que esta procurando
    Entao verificar se o produto esta certo
    E tirar um print
    E fechar o chome
    
   @Second
  Cenario: Pesquisar um produto que nao existe
    Dado que o usuario estiver na pagina principal
    Quando clicar na lupa
    E escreva um produto que nao existe
    E clicar no enter
    Entao verificar se tem o produto
    E tirar um print
    E fechar o chome
    
