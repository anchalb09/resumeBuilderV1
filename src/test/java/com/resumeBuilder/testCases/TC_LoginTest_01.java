package com.resumeBuilder.testCases;

import org.testng.annotations.Test;

import com.resumeBuilder.pageObjects.LinkedInLoginPage;

public class TC_LoginTest_01 extends BaseClass{
	
	@Test
	public void loginTest() throws InterruptedException {
		
		driver.get(baseUrl);
		LinkedInLoginPage loginPage = new LinkedInLoginPage(driver);
		loginPage.setUserName(username);
		Thread.sleep(3000);
		loginPage.setPassword(password);
		Thread.sleep(3000);
		loginPage.clickSignIn();
		Thread.sleep(3000);
		loginPage.enterJobRole("Automation Test Engineer");
		Thread.sleep(3000);
		loginPage.clickSJobsButton();
		Thread.sleep(3000);
		//loginPage.selectExperienceLevelAndShowResults();
		loginPage.getJobDescription();
	}

}
