package com.squadwde.next.core;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.winium.DesktopOptions;
import org.openqa.selenium.winium.WiniumDriver;
import org.openqa.selenium.winium.WiniumDriverService;

public class WinDriverPage {
	
	public static WiniumDriver winDriver;
	private static WiniumDriverService service;
	
	public void openTool(String diretorio) {
		DesktopOptions option = new DesktopOptions();
		option.setApplicationPath(diretorio);
		File driverPath = new File("C:\\Winium\\Winium.Desktop.Driver.exe");
		service = new WiniumDriverService.Builder().usingDriverExecutable(driverPath).usingPort(9999).withVerbose(true).withSilent(false).buildDesktopService();
		try {
			service.start();
		} catch (IOException e) {
			e.printStackTrace();
		}
		winDriver = new WiniumDriver(service, option);
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		WebDriverWait wait = new WebDriverWait(winDriver, 60);
		WebElement element = wait.until(ExpectedConditions.elementToBeClickable(By.id("UserName")));
		element.click();
		
	}
	
	public void winiumStopService() {
		service.stop();
	}

	
	public void clicarBotao(By by) {
		winDriver.findElement(by).click();
	}	
	
	public void escreverTexto(By by, String texto) {
		winDriver.findElement(by).sendKeys(texto);
	}
	
	public void limparCampo(By by) {
		winDriver.findElement(by).clear();
	}
	public void aguardarElementoClicavelAparecer(By by, long tempo) {
		WebDriverWait wait = new WebDriverWait(winDriver, tempo);
		wait.until(ExpectedConditions.elementToBeClickable(by));
	}
}
