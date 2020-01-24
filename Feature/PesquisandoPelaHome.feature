# language: pt

Funcionalidade: Pesquisar um produto pela home

  Contexto: entrar no site
    Dado que o usuario abra o chrome
    Quando escrever o nome do site
    Entao entrar na pagina principal

	@First
  Cenario: Pesquisar um produto com sucesso
    Dado que o usuario clicar em tablets
    Quando clicar no produto
    Entao ve as informacoes do produto
    E tirar o print
    E fechar o site

	@Second
  Cenario: Pesquisar um produto que nao existe
    Dado que o usuario clicar em tablets
    Quando clicar na aba de preco 
    E escolher o preco
    E click na aba do display
    E escolher o display
    Entao aparece uma mensagem de que nao existe o produto
    E tirar o print
    E fechar o site
    