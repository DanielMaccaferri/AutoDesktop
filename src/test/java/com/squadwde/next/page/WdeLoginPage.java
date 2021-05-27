package com.squadwde.next.page;

import org.openqa.selenium.By;

import com.squadwde.next.core.WinDriverPage;
import com.squadwde.next.model.WdeLoginModel;

public class WdeLoginPage {
	
	WinDriverPage winPage = new WinDriverPage();
	
	public void abrirWde() {
		winPage.openTool("C:/WDE versao 59 protocolo + fnext/InteractionWorkspace.exe");
		
	
	}

	public void inserirDadosLogin(WdeLoginModel wdeLoginModels) {
		winPage.limparCampo(By.id("UserName"));
		winPage.escreverTexto(By.id("UserName"), wdeLoginModels.getUsuario());
		winPage.escreverTexto(By.id("passwordBoxPassword"), wdeLoginModels.getSenha());
		winPage.clicarBotao(By.id("HeaderSite"));
		winPage.clicarBotao(By.name("Conectar"));
	}
	
	public void clicarBotaoHamburguer() {
		winPage.clicarBotao(By.id("\"HamburgerButton\""));
	}
	
	public void clicarBotaoDiretorio() {
		winPage.clicarBotao(By.id("\"toolbarWorksheetContentControlHeader\""));
	}
	

}