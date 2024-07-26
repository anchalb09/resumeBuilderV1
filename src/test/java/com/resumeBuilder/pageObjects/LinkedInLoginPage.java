package com.resumeBuilder.pageObjects;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LinkedInLoginPage {

	WebDriver ldriver;
	
	//creating constructor
	
	public LinkedInLoginPage(WebDriver rdriver){
		ldriver = rdriver;
		PageFactory.initElements(rdriver, this);
	}
	
	//linkedin url= https://www.linkedin.com/login
	//username = https://www.linkedin.com/login
	@FindBy(xpath = "//input[@id='username']")
	@CacheLookup
	WebElement txtUsername;
	
	@FindBy(id = "password")
	@CacheLookup
	WebElement txtPassword;
	
	@FindBy(xpath = "//button[normalize-space()='Sign in']")
	@CacheLookup
	WebElement submitBtn;
	
	//Search Button
	//input[@placeholder='Search']
	@FindBy(xpath = "//input[@placeholder='Search']")
	@CacheLookup
	WebElement searchBar;
	
	//click  on Jobs //button[@aria-pressed='false'][normalize-space()='Jobs']
	@FindBy(xpath = "//button[@aria-pressed='false'][normalize-space()='Jobs']")
	@CacheLookup
	WebElement jobsBtn;
	/*
	//button[@id='searchFilter_experience']
	@FindBy(xpath = "//button[@id='searchFilter_experience']")
	@CacheLookup
	WebElement experienceLvlBtn;
	
	//div[@id='artdeco-hoverable-artdeco-gen-56']//ul[@class='list-style-none relative search-reusables__collection-values-container search-reusables__collection-values-container--50vh']
	//@FindBy(xpath = "//div[@id='artdeco-hoverable-artdeco-gen-56']//ul[@class='list-style-none relative search-reusables__collection-values-container search-reusables__collection-values-container--50vh']")
	
	@FindBy(xpath="//label[@for='experience-3']")
	@CacheLookup
	WebElement associateCheckBox;
	
	//button[@id='ember1323']//span[@class='artdeco-button__text']
	@FindBy(xpath="//button[@id='ember582']//span[@class='artdeco-button__text']")
	@CacheLookup
	WebElement showResultsBtn;*/
	
	@FindBy(xpath="//div[@id='job-details']/div")
	@CacheLookup
	WebElement jobDescription;
	
	public void setUserName(String uname) {
		txtUsername.sendKeys(uname);
	}
	
	public void setPassword(String pwd) {
		txtPassword.sendKeys(pwd);
	}

	public void clickSignIn() {
		submitBtn.click();
	}
	
	public void enterJobRole(String jobRole) {
		searchBar.sendKeys(jobRole);
		searchBar.sendKeys(Keys.ENTER);
	}
	
	public void clickSJobsButton() {
		jobsBtn.click();
	}
	
	//public void selectExperienceLevelAndShowResults() {
		//experienceLvlBtn.click();
		//associateCheckBox.click();
		//showResultsBtn.sendKeys(Keys.ENTER);
	//}
	
	public void getJobDescription() {
		String jd = jobDescription.getText();
		System.out.println(jd);
	}


}
