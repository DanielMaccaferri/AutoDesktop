package com.squadwde.next.core;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;

public class Hooks {
	
	private static ExtentHtmlReporter htmlReport;
	private static ExtentReports extentReport;
	private static ExtentTest extentTest;
		
	@Before
	public void beforeCenario(Scenario cenario) {
		if(extentReport == null) {
			extentReport = new ExtentReports();
			htmlReport = new ExtentHtmlReporter("src/test/resources/prints/htmlReporter.html");
			extentReport.attachReporter(htmlReport);
			
		}
		
		extentTest = extentReport.createTest(cenario.getId());		
	}
		
	@After
	public void afterCenario(Scenario cenario) {
		extentTest.log(Status.PASS, "Cenário: " + cenario.getName() + " executado com sucesso!");
		extentReport.flush();
	}
	
	public static ExtentTest getExtentTest() {
		return extentTest;
	}
}
