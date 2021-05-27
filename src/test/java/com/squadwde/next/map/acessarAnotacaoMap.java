package com.squadwde.next.map;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.squadwde.next.core.Driver;


public class acessarAnotacaoMap {
	
	public acessarAnotacaoMap() {
		PageFactory.initElements(Driver.getDriver(), this);
	}

	@FindBy(id = "iframe")
	protected WebElement iframe;
	
	@FindBy(className = "nxt-btn-ok-modal")
	protected WebElement btnCliqueAqui;
	
	@FindBy(xpath = "//h3[text()='Erro!']")
	protected WebElement textErro;
	
	@FindBy(xpath = "//div[@class=\"nxt-align-button\"]//button")
	protected WebElement btnFechar;
	
	@FindBy(id = "status")
	protected WebElement status;
}
