package com.squadwde.next.core;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.Status;

public class Utils {
	
	public static void logPrint(String strLog) {
		ExtentTest extentTest = Hooks.getExtentTest();
		try {
			efetuarPrintTela(strLog);
			extentTest.log(Status.INFO, strLog, MediaEntityBuilder.createScreenCaptureFromPath(System.getProperty("user.dir") + "\\src\\test\\resources\\prints\\" + strLog + ".png").build());
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	private static void efetuarPrintTela(String strLog) {
		File srcFile = ((TakesScreenshot) Driver.getDriver()).getScreenshotAs(OutputType.FILE);
		try {
			FileUtils.copyFile(srcFile, new File(System.getProperty("user.dir") + "\\src\\test\\resources\\prints\\" + strLog + ".png"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
