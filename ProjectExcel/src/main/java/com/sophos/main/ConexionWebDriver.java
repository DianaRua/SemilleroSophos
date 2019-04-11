package com.sophos.main;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ConexionWebDriver {
	
	static WebDriver driver;
	
	
	public WebDriver getDriver() {
			return driver;
		}


	public ConexionWebDriver(){
		
		System.setProperty("webdriver.chrome.driver","C:\\Selenium\\chromedriver_win32\\chromedriver.exe");
		this.driver = new ChromeDriver();
		driver.get("http:\\www.google.com.co");
		
	}

	public void waitForLoad() {
	    new WebDriverWait(driver, 30).until((ExpectedCondition<Boolean>) wd ->
	    ((JavascriptExecutor) wd).executeScript("return document.readyState").equals("complete"));
	}


	public void close() {
		driver.close();
	}

}
