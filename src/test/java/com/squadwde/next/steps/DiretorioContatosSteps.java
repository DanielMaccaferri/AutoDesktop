package com.squadwde.next.steps;

import com.squadwde.next.page.WdeDiretorioContatosPage;
import com.squadwde.next.page.WdeLoginPage;

import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.Entao;
import cucumber.api.java.pt.Quando;

public class DiretorioContatosSteps {
	WdeDiretorioContatosPage winPage = new WdeDiretorioContatosPage();

	@Dado("^que eu acesse o o menu Hamburguer$")
	public void que_eu_acesse_o_o_menu_Hamburguer() throws Throwable {
		winPage.clicarBotaoHamburguer();
		
	}

	@Dado("^eu clicar em diretorio de contatos$")
	public void eu_clicar_em_diretorio_de_contatos() throws Throwable {
		winPage.clicarBotaoDiretorio();
	}

	@Dado("^eu efetue uma pesquisa com CPF$")
	public void eu_efetue_uma_pesquisa_com_CPF() throws Throwable {

	}

	@Quando("^eu clicar em pesquisar$")
	public void eu_clicar_em_pesquisar() throws Throwable {

	}

	@Entao("^a tela retorne as informacoes de pesquisa$")
	public void a_tela_retorne_as_informacoes_de_pesquisa() throws Throwable {
	   
	}


}
