# language: pt

Funcionalidade: Pesquisar um produto pela home

	@First
  Cenario: Pesquisar um produto com sucesso
    Dado que o usuario estiver na home
    Quando clicar em tablets
    E clicar no produto
    Entao ve as informacoes do produto
    E tirar o print
    E fechar o site

	@Second
  Cenario: Pesquisar um produto que nao existe
    Dado que o usuario estiver na home
    Quando clicar em tablets
    E click o preco
    E escolher o preco
    E click o display
    E escolher o display
    Entao ve que nao tem o produto
    E tirar o print
    E fechar o site
    