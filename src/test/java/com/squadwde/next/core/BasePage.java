package com.squadwde.next.core;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BasePage extends Driver {
	
	public void escrever(WebElement element, String texto) {
		element.sendKeys(texto);
	}

	public void clicarBtn(WebElement element) {
		element.click();
	}

	public String pegarTexto(WebElement element) {
		return element.getText();

	}

	public void aguardarElementoClicavelAparecer(WebElement element, long tempo) {
		WebDriverWait wait = new WebDriverWait(getDriver(), tempo);
		wait.until(ExpectedConditions.elementToBeClickable(element));
	}
	
	public void aguardarElementoAparecer(WebElement element, long tempo) {
		WebDriverWait wait = new WebDriverWait(getDriver(), tempo);
		wait.until(ExpectedConditions.visibilityOf(element));
	}

	public void retornarLista(WebElement element) {
		element.getSize();
	}

	public void alternarAbas(int aba) {
		List<String> abas = new ArrayList<>(getDriver().getWindowHandles());
		getDriver().switchTo().window(abas.get(aba));
	}

	public void pegarAtributo(WebElement element) {
		element.getAttribute("value");
	}
/*
	public void listaTabela() {
		List<WebElement> linhas = getDriver().findElements(By.xpath("//table[@class='tmptabela']//tr"));
		for (int i = 2; i <= linhas.size(); i++) {
			List<WebElement> colunas = getDriver().findElements(By.xpath("//table[@class='tmptabela']//tr["+ i +"]//td"));
			int coluna[] = new int[colunas.size()];
			System.out.println("\n");			
			for (int j = 1; j <= colunas.size(); j++) {
				List<WebElement> tabela = getDriver().findElements(By.xpath("//table[@class='tmptabela']//tr[" + i + "]//td[" + j + "]"));
				System.out.println(tabela.get(coluna[j-1]).getText());
			}
		}
	}
*/
	
	public boolean isDisplayed(WebElement element) {
		element.isDisplayed();
		return true;
	}
	
	public void acessarFrame(WebElement element) {
		getDriver().switchTo().frame(element);
	}
	
	public void sairFrame() {
		getDriver().switchTo().defaultContent();
	}
}
