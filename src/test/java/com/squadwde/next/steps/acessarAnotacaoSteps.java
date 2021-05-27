package com.squadwde.next.steps;

import com.squadwde.next.core.Utils;
import com.squadwde.next.page.acessarAnotacoesPage;

import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.Entao;
import cucumber.api.java.pt.Quando;

public class acessarAnotacaoSteps {
	
	acessarAnotacoesPage page = new acessarAnotacoesPage();
	
	@Dado("^que eu acesse o anotacoes$")
	public void queEuAcesseAnotacoes() throws InterruptedException {
		page.inicializarDriver();	
	}

	@Quando("^eu clicar no botao Clique Aqui$")
	public void euClicarNoBotaoCliqueAqui() {
		page.acessarAnotacoes();
		Utils.logPrint("Página Inicial");
	}

	@Entao("^a pagina anotacoes deve aparecer$")
	public void aPaginaAnotacoesDeveAparecer() {
		page.validaracessoAnotacoes();
		Utils.logPrint("Pop-up Erro");
		page.fechaPopUp();
		Utils.logPrint("Anotações");
		page.fecharDriver();
	}

}
