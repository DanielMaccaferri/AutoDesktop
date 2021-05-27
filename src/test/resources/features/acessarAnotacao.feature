#language: pt
#encoding UTF-8

@geral
Funcionalidade: Acessar o localhost Anotacoes
	  
	@anotacao
  Cenario: Acessar Anotacoes
    Dado que eu acesse o anotacoes
    Quando eu clicar no botao Clique Aqui
    Entao a pagina anotacoes deve aparecer
  @wde
  Cenario: Acessar WDE
  	Dado que eu acesse o WDE Desktop
  	Quando eu inserir os dados
  	|usuario| senha		  | servidor	 | porta	    |
  	|I931750| testemai  |wde_cloud_tu| 2030		    |
  	E eu clicar em Conectar
  	Entao o Wde deve ser acessado com sucesso
  
  @diretorio	
  Cenario: Acessar Diretório de Contatos
  	Dado que eu acesse o o menu Hamburguer
  	E eu clicar em diretorio de contatos
  	E eu efetue uma pesquisa com CPF 
   	Quando eu clicar em pesquisar
  	Entao a tela retorne as informacoes de pesquisa

  	
  	