package com.squadwde.next.steps;

import java.util.List;

import com.squadwde.next.model.WdeLoginModel;
import com.squadwde.next.page.WdeLoginPage;

import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.Entao;
import cucumber.api.java.pt.Quando;

public class WdeLoginSteps {
	
	WdeLoginPage page = new WdeLoginPage();
	
	@Dado("^que eu acesse o WDE Desktop$")
	public void queEuAcesseWDEDesktop() {
		page.abrirWde();
	}

	@Quando("^eu inserir os dados$")
	public void euInserirOsDados(List<WdeLoginModel> wdeLoginModel) {
		for(WdeLoginModel wdeLoginModels : wdeLoginModel) {
			wdeLoginModels.getUsuario();
			wdeLoginModels.getSenha();
			wdeLoginModels.getPorta();
			wdeLoginModels.getServidor();
			page.inserirDadosLogin(wdeLoginModels);
		}
	}

	@Quando("^eu clicar em Conectar$")
	public void eu_clicar_em_Conectar() {
	}

	@Entao("^o Wde deve ser acessado com sucesso$")
	public void o_Wde_deve_ser_acessado_com_sucesso() {
//		page.clicarBotaoHamburguer();
//		page.clicarBotaoDiretorio();

	}

}
