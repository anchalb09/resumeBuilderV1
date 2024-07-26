package com.resumeBuilder.testCases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class BaseClass {
	
	//public String baseUrl = "https://api.linkedin.com/login";
	public String baseUrl ="https://www.linkedin.com/login";
	public String username = "arb.alb01@gmail.com";
	public String password = "Muskanb@630";
	public static WebDriver driver;
	
	@BeforeClass
	public void setUp() {
		driver = new ChromeDriver();
	}
	
	//@AfterClass
	//public void tearDown() {
		//driver.quit();
	//}
	
	

}
