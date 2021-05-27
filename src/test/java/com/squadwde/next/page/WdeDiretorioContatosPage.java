package com.squadwde.next.page;

import com.squadwde.next.core.WinDriverPage;
import org.openqa.selenium.By;



public class WdeDiretorioContatosPage {

	WinDriverPage winPage = new WinDriverPage();

	public void clicarBotaoHamburguer() {
		winPage.aguardarElementoClicavelAparecer(By.id("HamburgerButton"), 60);		
		winPage.clicarBotao(By.id("HamburgerButton"));
		
	}
				
	public void clicarBotaoDiretorio() {
        winPage.aguardarElementoClicavelAparecer(By.id("ContactDirectory"), 20);
        winPage.clicarBotao(By.id("ContactDirectory"));

	}
}
