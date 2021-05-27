package com.squadwde.next.page;

import org.junit.Assert;

import com.squadwde.next.core.BasePage;
import com.squadwde.next.core.Driver;
import com.squadwde.next.map.acessarAnotacaoMap;


public class acessarAnotacoesPage extends acessarAnotacaoMap{
	BasePage page = new BasePage();

	public void inicializarDriver() {
		Driver.getDriver();
		page.sairFrame();
		page.aguardarElementoAparecer(status, 10);
	}
	
	public void acessarAnotacoes() {
		page.acessarFrame(iframe);
		page.aguardarElementoClicavelAparecer(btnCliqueAqui, 10);
		page.clicarBtn(btnCliqueAqui);
		
	}
	
	public void validaracessoAnotacoes() {
		page.aguardarElementoClicavelAparecer(btnFechar, 10);
		String text = page.pegarTexto(textErro);
		Assert.assertEquals("Erro!", text);
	}
	
	public void fechaPopUp() {
		page.clicarBtn(btnFechar);
	}
	
	public void fecharDriver(){
		Driver.killDriver();
	}

}
